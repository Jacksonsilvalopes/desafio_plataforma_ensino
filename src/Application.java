import entities.Lesson;
import entities.Task;
import entities.Video;
import services.LessonServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Lesson> lessonList = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {

            System.out.println();
            int n = 1 + i;

            System.out.println("Dados da " + n + "a aula: ");
            sc.nextLine();

            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char opcao = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Título: ");
            String title = sc.nextLine();

            if(opcao == 'c'){

                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();

                System.out.print("Duração em segundos:  ");
                int seconds = sc.nextInt();

                Video video = new Video(title,url,seconds);
                lessonList.add(video);

            }else {

                System.out.print("Descrição: ");
                String description = sc.nextLine();

                System.out.print("Quantidade de questões: ");
                int questionCount = sc.nextInt();

                Task task = new Task(title,description,questionCount);
                lessonList.add(task);
            }

        }
        System.out.println();

        LessonServices lessonServices = new LessonServices(lessonList);
        lessonServices.summary();


    }
}