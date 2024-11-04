public class DocumentProcessor {
    public static void processDocument(DocumentFactory factory) {
        Document document = factory.createDocument();
        document.render();
    }

    public static void main(String[] args) {
        processDocument(new PDFDocumentFactory());

        processDocument(new DOCXDocumentFactory());

        processDocument(new TXTDocumentFactory());
    }
}
