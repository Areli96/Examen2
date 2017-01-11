import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Lluvia {
	    protected static final int EXIT_ON_CLOSE = 0;
		private JFrame frame;
    
	    public static void main(String[] args) {
	       
	        EventQueue.invokeLater(new Runnable() {        	   		
	        private Object l1;  
	  
        public void run() {
		         	
    		for (int i = 0; i < 2 ; i++){
		
		         Thread ct = Thread.currentThread();
		         Thread l1 = null;
		                           
			if(ct == l1) {
				System.out.println(i + " l1 " + Thread.currentThread().getName());            
		               	}
			
			try {
		      	Thread.sleep(250);
		        }catch(InterruptedException e) {}
		        }
		            		l1 = new Thread(this);
		            	    ((Thread) this.l1).start();
		            		System.out.println("Salida thread " + Thread.currentThread().getName());
		            		
		    try {
		        Lluvia window = new Lluvia();
		        window.frame.setVisible(true);
		             
		        } catch (Exception e) {
		          e.printStackTrace();
		
		            			}
		            	}
		       	}
	        );
	 }
		
		
		    public Lluvia() {
		    	
		        iniciar();
		     
		        
		    }
		   
		   
		    private void iniciar() {
		   
		        Random random=new Random();
		        frame = new JFrame();
		        frame.setBounds(220, 220, 100, 100);
		        JButton boton =new JButton("Lluvia");
		        frame.add(boton,BorderLayout.SOUTH);
		        frame.setSize(300,100);
		        frame.setVisible(true);
		        frame.setLocation(random.nextInt(300), random.nextInt(500));
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        
		  
		    }
		
			}