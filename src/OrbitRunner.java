import javax.swing.JFrame;

public class OrbitRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java
		int fWidth = 800;
		int fHeight = 550;
		
		JFrame f = new JFrame("Orbiting Points Demo");
		
		f.setSize(fWidth, fHeight);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		OrbitPanel op = new OrbitPanel(fWidth, fHeight-22);
		f.add(op);
		
		f.setVisible(true);

	}

}
