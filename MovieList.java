import java.util.Scanner;

class Movie{
    int id;
    String movieName;
    String Category;
    int year;
    Movie(int i, String s1, String s2, int y){
        id=i; movieName=s1; Category=s2; year=y;
    }

    void disp(){
        System.out.println("Movie Name: "+ movieName+ "& Year: "+year);
    }
}

class MovieList{
    Movie m[]= new Movie[5];
    MovieList(){
        Scanner sc = new Scanner(System.in);
        String s1, s2; int i,y;
        for(int k=0; k<5;k++){
            System.out.println("Enter id:");
            i = sc.nextInt();
            System.out.println("Enter name:");
            s1 = sc.nextLine();
            s1 = sc.nextLine();
            System.out.println("Enter category:");
            s2 = sc.nextLine();
            System.out.println("Enter year:");
            y = sc.nextInt();
            m[k]=new Movie(i,s1,s2,y);
        }
        sc.close();
    }
    void sortMovie(){
        for(int k=0; k<5;k++){
            for(int j=k+1; j<5;j++){
                if(m[k].year>m[j].year){
                    Movie t=m[k];
                    m[k]=m[j];
                    m[j]=t;
                }
            }
        }
        for(int k=0; k<5;k++){
            m[k].disp();
        }

    }

    public static void main(String args[]) {
        MovieList ml=new MovieList();
        ml.sortMovie();
        
    }


}