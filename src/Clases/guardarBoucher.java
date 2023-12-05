
package Clases;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class guardarBoucher {
    private void mitGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        capturarImagenComoPDF(this, jScrollPane1);
    }                                          

    private static void capturarImagenComoPDF(Component parentComponent, JScrollPane scrollPane) {
        JFileChooser fileChooser = crearFileChooser();
        int selection = fileChooser.showSaveDialog(parentComponent);

        if (selection == JFileChooser.APPROVE_OPTION) {
            String outputPath = getExtensionPDF(fileChooser.getSelectedFile().getAbsolutePath());

            try {
                Document pdfDocument = new Document(PageSize.A4);
                PdfWriter.getInstance(pdfDocument, new FileOutputStream(outputPath));
                pdfDocument.open();

                BufferedImage image = capturaPantalla(scrollPane.getViewport().getView());
                Image imagenEscalada = escalarImagen(image, pdfDocument);

                pdfDocument.add(imagenEscalada);
                pdfDocument.close();

                JOptionPane.showMessageDialog(parentComponent, "¡Operación guardada!");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(parentComponent, "Error al guardar el PDF", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static JFileChooser crearFileChooser() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF (*.pdf)", "pdf");
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle("Guardar PDF");
        return fileChooser;
    }

    private static String getExtensionPDF(String selectedPath) {
        if (!selectedPath.toLowerCase().endsWith(".pdf")) {
            return selectedPath + ".pdf";
        }
        return selectedPath;
    }
}
