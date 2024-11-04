public class DOCXDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new DOCXDocument();
    }
}
