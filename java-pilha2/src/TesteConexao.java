
public class TesteConexao {

	public static void main(String[] args) {
		
		Conexao con = null;
		try {
			//Conexao con = new Conexao();
			con = new Conexao();
			con.leDados();
			//con.fecha();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conex�o");
			//con.fecha();
		} finally {
			con.fecha();
		}

	}

}
