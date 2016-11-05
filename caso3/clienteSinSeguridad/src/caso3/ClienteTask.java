package caso3;

import caso2.Cliente;
import uniandes.gload.core.Task;

public class ClienteTask extends Task {
	
	private String datosFile;
	
	public ClienteTask(String datosFile) {
		this.datosFile = datosFile;
	}

	@Override
	public void fail() {
		System.out.println(Task.MENSAJE_FAIL);
	}

	@Override
	public void success() {
		System.out.println(Task.OK_MESSAGE);
	}

	@Override
	public void execute() {
		Cliente cliente = new Cliente();
		try {
			cliente.run();
		} catch(Exception e){
			e.printStackTrace();
		}

	}

}
