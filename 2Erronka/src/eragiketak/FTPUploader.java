package eragiketak;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FTPUploader {

    public static boolean uploadFile(String server, int port, String user, String pass, String localFilePath, String remoteFilePath) {
        FTPClient ftpClient = new FTPClient();

        try {
            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            File localFile = new File(localFilePath);
            FileInputStream inputStream = new FileInputStream(localFile);

            System.out.println("Subiendo archivo...");
            boolean done = ftpClient.storeFile(remoteFilePath, inputStream);
            inputStream.close();

            if (done) {
                System.out.println("✅ Archivo subido correctamente.");
                return true;
            } else {
                System.out.println("❌ Error al subir el archivo.");
                return false;
            }

        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}