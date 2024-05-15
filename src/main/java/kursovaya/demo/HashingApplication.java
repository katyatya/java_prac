package kursovaya.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class HashingApplication {

    @Value("${input.file}")
    private String inputFile;

    @Value("${output.file}")
    private String outputFile;

    private Path inputPath;
    private Path outputPath;

    @PostConstruct
    public void init() throws IOException, NoSuchAlgorithmException {
        inputPath = Paths.get(inputFile);
        outputPath = Paths.get(outputFile);

        if (Files.exists(inputPath)) {
            // Хеширование данных из файла
            String hashedData = hashFile(inputPath);

            // Запись хешированных данных в выходной файл
            Files.writeString(outputPath, hashedData);
        } else {
            // Создание выходного файла с "null"
            Files.writeString(outputPath, "null");
        }
    }

    @PreDestroy
    public void destroy() throws IOException {
        // Удаление исходного файла
        Files.deleteIfExists(inputPath);
    }

    private String hashFile(Path filePath) throws IOException, NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] fileBytes = Files.readAllBytes(filePath);
        byte[] hashBytes = digest.digest(fileBytes);
        return bytesToHex(hashBytes);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}

