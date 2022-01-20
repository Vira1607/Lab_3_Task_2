import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;  
import java.util.stream.*;  

class MyLibrary{
ArrayList<Book> shelf = new ArrayList<Book>();

void insert(Book b){
this.shelf.add(b);}

void ShowAll(){
 for (Book b:shelf) b.Print();
}
void ShowPub(String pub){for (Book b:shelf) if (b.pub_house==pub) b.Print();};

void ShowYear(String yy){for (Book b:shelf) if (b.year==yy) b.Print();};

void SortByPub(){
List<String> slist  =  new ArrayList();
for (Book b:shelf) slist.add(b.pub_house);
List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());  
//sortedList.forEach(System.out::println); 

   for (String s:sortedList) 
    for (Book b:shelf)
   if(b.pub_house==s)
      b.Print();
}
void ShowAuth(String auth){
 for (Book b:shelf) if (b.author==auth) b.Print();
}
}

class Book{
  String title;
  String author;
  String pub_house;
  String year;
  String pages;
  String price;
     Book(
      String title,
      String author,
      String pub_house,
      String year,
      String pages,
      String price){
          this.title=title;
          this.author=author;
          this.pub_house=pub_house;
          this.year=year;
          this.pages=pages;
          this.price=price;};
      public void Print(){
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.pub_house);
        System.out.println(this.year);
        System.out.println(this.pages);
        System.out.println(this.price);
      };

}
class Main {
 
  public static void main(String[] args) {
Book b1 = new Book("Весь невидимий нам світ","Ентоні Дорр","Азбука","2016","461","85"); 
Book b2 = new Book("Гаррі Поттер і філософський камінь","Джоан Роулінг","Росмэн","2006","253","200"); 
Book b3 = new Book("Сніжна казка","Полярний Олександр","АСТ","2021","150","250"); 
Book b4 = new Book("М'ятна казка","Полярний Олександр","АСТ","2020","150","150"); 
Book b5 = new Book("Шостий сон","Бернар Вербер","Рипол Класик","2017","389","130");
Book b6 = new Book("Імперія Янголів","Бернар Вербер","Рипол Класик","2014","356","130"); 
Book b7 = new Book("Тіло: Інструкція з використання","Білл Брайсон","Наш Формат","2020","451","270"); 
Book b8 = new Book("Строкой пронизывая сердце","Катасонов Сергій Олександрович","самиздат","2013","181","50"); 
Book b9= new Book("Пинбол 1973","Харукі Муракамі","Эксмо","2013","220","200"); 
Book b10 = new Book("Спогади, сни, роздуми","Карл Густав Юнг","Мухосранск","1950","1000","241"); 
Book b11 = new Book("О дітях","Ошо","София","2014","150","210"); 
MyLibrary ml = new MyLibrary();
ml.insert(b1);
ml.insert(b2);
ml.insert(b3);
ml.insert(b4);
ml.insert(b5);
ml.insert(b6);
ml.insert(b7);
ml.insert(b8);
ml.insert(b9);
ml.insert(b10);
ml.insert(b11);

   
   Scanner in = new Scanner(System.in);
    int choise=99;
   while (choise!=0) {
    // Отримати список книг зазначеного автора;
    // Отримати список книг, які видані зазначеним видавництвом;
    // Отримати список книг, виданих пізніше вказаного року.
    // Відсортувати книги за видавництвами
    System.out.println("1 — Печатать всё"); 
    System.out.println("2 — Книги автора"); 
    System.out.println("3 — Книги издательства"); 
    System.out.println("4 — Новые книги (по определённому году издательства)"); 
    System.out.println("5 — Сортировка книг по издательству"); 
    System.out.println("0 — Выход"); 
    choise = in.nextInt();
   
    String s;
    switch(choise){
      case(1):ml.ShowAll();break;
      case(2):System.out.print("Укажите автора:");
         in.next();
          s = in.nextLine();
         //s="Полярний Олександр";
          ml.ShowAuth(s);break;
      case(3):System.out.print("Укажите редакцию:");
               in.next(); 
              s = in.nextLine();
            ml.ShowPub(s);break;
      case(4):System.out.print("Укажите год:");
                in.next();
               s = in.nextLine();
              ml.ShowYear(s);break;
      case(5):ml.SortByPub();break;
  
    }

     }
  }
}
