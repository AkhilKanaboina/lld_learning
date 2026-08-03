import java.util.ArrayList;
public class Main {
    public static void main(String [] args) {
       Document studentsList=new Document();
       studentsList.addElement(new TextElement("Akhil"));
       DocumentSaver files=new DocumentSaver();
       files.save(studentsList);
       studentsList.getElement();
       new DocumentViewer().Display(studentsList);
    }
}
class DocumentViewer{
    public void Display(Document d){
        d.getElement();
    }
}
class DocumentSaver{
    ArrayList<Document> documents;
    public DocumentSaver(){
        System.out.println("DocumentSaver created");
        documents=new ArrayList<>();
    }
    public void save(Document d){
        System.out.println("Document saved");
        documents.add(d);
    }
}
