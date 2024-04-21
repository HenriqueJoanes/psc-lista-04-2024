import java.util.Scanner;
public class senha02{

    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário:");
        String nome = teclado.nextLine();

        String senha;

        do

       { System.out.println("crie uma senha:");
        senha = teclado.nextLine();

        if(senha.equals(nome)){
            System.out.println("A senha não pode ser o mesmo nome de usuário");
        }
        }
        while(senha.equals(nome));
        System.out.println("Senha criada com sucesso!");
    }


    }
