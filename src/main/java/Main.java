public class Main {
  public static void main(String[] args) {
    def autenticar():
    logins_validos = {
        "admin": "admin123",
        "financeiro": "fin123",
        "cliente": "cli123"
    }

    login = input("Digite o login: ")
    senha = input("Digite a senha: ")

    if login in logins_validos:
        if senha == logins_validos[login]:
            if login == "admin":
                print("Acesso permitido para o administrador.")
            elif login == "financeiro":
                print("Acesso permitido para o setor financeiro.")
            elif login == "cliente":
                print("Acesso permitido para o cliente.")
        else:
            print("Senha errada.")
    else:;
        print("Usuário não encontrado.");

autenticar();
  }
}