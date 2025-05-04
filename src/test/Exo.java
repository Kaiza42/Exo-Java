package test;

import com.sun.jdi.request.StepRequest;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exo {

    // Exo 1 Afficher le texte Hello World dans la console de sortie
    // System.out.printf("Hello, World !");

    // Exo 2 Afficher Reprendre l’exercice n°1 en utilisant une variable
    // String Hello = "Hello, World !";
    // System.out.println(Hello);

    // Exo 3 perimetre d'un cercle
//        double rayon = 5.0;
//        double cercleRayon = 2 * Math.PI * rayon;
//        System.out.println( "le perimetre d'un cercle est : " + cercleRayon);
//
//        // Exo 4 Afficher le périmètre d’un cercle dont le rayon est une variable
//        Scanner inputAge = new Scanner(System.in);
//
//        System.out.print("Veuillez saisir votre age : ");
//        int age = inputAge.nextInt();
//        if(age < 18){
//            System.out.println("Tu es mineur");
//        }else{
//            System.out.println("Tu es majeur");
//        }
    // Exo 5 Afficher le périmètre d’un cercle dont le rayon est demandé à l’utilisateur
//        Scanner rayon = new Scanner(System.in);
//        System.out.println("Entrer un chiffre : ");
//        double saisieRayon = rayon.nextDouble();
//        double cercleRayon = 2 * Math.PI * saisieRayon;
//        System.out.println( "le perimetre d'un cercle est : " + cercleRayon);

    // Exo 4 Afficher le périmètre d’un cercle dont le rayon est une variable
//        Scanner inputAge = new Scanner(System.in);
//
//        System.out.print("Veuillez saisir votre age : ");
//        int age = inputAge.nextInt();
//        if(age < 18){
//            System.out.println("Tu es mineur");
//        }else{
//            System.out.println("Tu es majeur");
//        }

    //  Exo 6 A partir d’une valeur saisie, vérifier si l’utilisateur est majeur ou mineur
//        Scanner paire = new Scanner(System.in);
//
//        System.out.print("Veuillez saisir un chiffre : ");
//
//        int chiffre = paire.nextInt();
//        if(chiffre % 2 == 0){
//System.out.println("Le chiffre est paire");
//        }else {
//            System.out.println("Le chiffre est impaire");
//      }

    // Exo 7 Vérifier si une année est bissextile.
    // Pour rappel, une année bissextile est une année multiple de 4, mais pas multiple de 100 ou alors multiple de
    // 400.
//        Scanner scanner = new Scanner(System.in);
//    int annee = scanner.nextInt();
//
//        if(annee % 4 == 0 && annee % 100 != 0 && annee % 400 == 0) {
//        System.out.println("C'est une année bissextile.");
//    }else{
//        System.out.println("ce n'est pas une année bissextile.");
//    }

    // Exo 8 A partir d’un mois saisi en chiffre, afficher le nombre de jour d’un mois
//    Scanner sc = new Scanner(System.in);
//
//        System.out.println("Veuillez saisir un mois!");
//    int mois = sc.nextInt();
//        switch (mois) {
//        case 1:
//            System.out.println("Le mois de janvier contient 31 de jour ! " );
//            break;
//        case 3:
//            System.out.println("Le mois de mars contient 31 de jour ! " );
//            break;
//        case 5:
//            System.out.println("Le mois de mai contient 31 de jour ! " );
//            break;
//        case 7:
//            System.out.println("Le mois de juillet contient 31 de jour ! " );
//            break;
//        case 8:
//            System.out.println("Le mois de août contient 31 de jour ! " );
//            break;
//        case 10:
//            System.out.println("Le mois de octobre contient 31 de jour ! " );
//            break;
//        case 12:
//            System.out.println("Le mois de décembre contient 31 de jour ! " );
//            break;
//        case 4:
//            System.out.println("Le mois de  avril contient 30 de jour !" );
//            break;
//        case 6:
//            System.out.println("Le mois de juin contient 30 de jour !" );
//            break;
//        case 9:
//            System.out.println("Le mois de septembre contient 30 de jour !" );
//            break;
//        case 11:
//            System.out.println("Le mois de  novembre contient 30 de jour !" );
//            break;
//        case 2:
//            System.out.println("Le mois de février contient 28 de jour !");
//            break;
//        default:
//            System.out.println("Il y a une Erreure dans la saisie !");
//            break;
//
//    }

    // Exo 8 bis

    //    Scanner sc = new Scanner(System.in);
//
//        System.out.println("Veuillez saisir un mois!");
//    String mois = sc.nextLine();
//        switch (mois.toLowerCase()){
//        case "janvier":
//        case "mars":
//        case "mai":
//        case "juillet":
//        case "aout":
//        case "octobre":
//        case "décembre":
//            System.out.println("Le mois de " + mois + " contient 31 de jour ! ");
//            break;
//        case "avril":
//        case "juin":
//        case "septembre":
//        case "novembre":
//            System.out.println("Le mois de  " + mois + "contient 30 de jour !");
//            break;
//        case "février":
//            System.out.println("Le mois de " + mois + " contient 28 de jour !");
//        default:
//            System.out.println("Veuillez saisir un mois!");
//            break;
//        }
//       Exo 8 Ter
//    Scanner sc = new Scanner(System.in);
//
//        System.out.print("Veuillez saisir un mois : ");
//    String mois = sc.nextLine().toLowerCase();
//
//    int jours;
//
//        if (mois.equals("février")) {
//        System.out.print("Veuillez saisir une année : ");
//        int annee = sc.nextInt();
//        jours = joursFevrier(annee);
//    } else {
//        switch (mois) {
//            case "janvier":
//            case "mars":
//            case "mai":
//            case "juillet":
//            case "aout":
//            case "octobre":
//            case "décembre":
//                jours = 31;
//                break;
//            case "avril":
//            case "juin":
//            case "septembre":
//            case "novembre":
//                jours = 30;
//                break;
//            default:
//                System.out.println("Mois invalide !");
//                return;
//        }
//    }
//
//        System.out.println("Le mois de " + mois + " contient " + jours + " jours !");
//}
//
//        public static int joursFevrier(int annee) {
//            if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
//                return 29;
//            } else {
//                return 28;
//            }
//        }

//     Exo 9 Afficher à l’écran les nombres de 1 à 100

//     for(int i = 0 ; i <=100 ; i++ ){
//        System.out.println(i);
//    }

    }


