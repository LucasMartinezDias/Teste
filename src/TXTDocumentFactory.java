public class TXTDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new TXTDocument();
    }
}
