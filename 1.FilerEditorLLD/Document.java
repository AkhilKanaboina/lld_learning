import java.util.ArrayList;

class Document{
    ArrayList<DocumentElement> element;
    public Document(){
        System.out.println("Document Created");
        element=new ArrayList<>();
    }
    public void addElement(DocumentElement ele){
        element.add(ele);
    }
    public ArrayList<DocumentElement> getElement(){
        for(DocumentElement e:element){
            e.render();
        }
        return element;
    }
    public void removeElement(DocumentElement ele){
        int size=element.size();
        for(int i=0;i<size;i++){
            if(element.get(i).equals(ele)){
                element.remove(i);
                break;
            }
        }
    }
}

/**
 *  interface f
 */
interface DocumentElement {
    public void render();
}
class TextElement implements DocumentElement{
    private String text;
    public TextElement(String text){
        System.out.println("TextElement Created, added"+text);
        this.text=text;
    }
    public void render(){
        System.out.println("Text Element"+text);
    }
}
class ImageElement implements DocumentElement{
    private String image;
    public ImageElement(String image){
        this.image=image;
    }
    public void render(){
        System.out.println("Text Element"+image);
    }
}
class TableElement implements DocumentElement{
    private int row;
    public TableElement(int row){
        this.row=row;
    }
    public void render(){
        System.out.println("Text Element"+row);
    }
}