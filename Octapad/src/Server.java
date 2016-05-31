import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class Server {
	private static Display display;
	private ServerSocket serverSocket;
	private int noOfPlayers;
	private ArrayList<Player> players;
	private ArrayList<Thread> threads;
	
	public static void main(String[] args) {
		display = new Display();
		new Server().go();
	}
	
	public Server()
	{
		connectPlayers();
	}
	
	public void connectPlayers()
	{
		Socket client;
		Thread currentThread;
		Player currentPlayer;
		while(true)
		{
			try {
				//Be nice to the JVM
				Thread.sleep(10);
				
				//Connect new players
				client = serverSocket.accept();
				noOfPlayers++;
				System.out.printf("Client #%d connected!%n", noOfPlayers);
				currentPlayer = new Player();
				players.add(currentPlayer);
				currentThread = new Thread(new PlayerThread());
				threads.add(currentThread);
				currentThread.start();
				
			} catch (InterruptedException | IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	/**
	 * Keeps track of each player
	 * @author 
	 * @version May 31, 2016
	 */
	class PlayerThread implements Runnable
	{
		public PlayerThread()
		{
			
		}
		
		public void run()
		{
			
		}
	}
	
	public void go()
	{
		
	}

}
