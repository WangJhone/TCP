package visioncommunication;

import java.io.IOException;

public class test {

	/**
	 *************       main      ************
	 *	@param args��
	 *	void��
	 *	Description:TODO
	 *	2019-5-28��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		tcp_client client = new tcp_client();
//		client.create_tcp_client("192.168.0.107", 9990);
//		byte[] bytes = new byte[5];
//		bytes[0] = 0x1;
//		bytes[1] = 0x2;
//		bytes[2] = 0x3;
//		bytes[3] = 0x4;
//		bytes[4] = 0x5;		
//		client.tcp_client_send_data(bytes);
//		while (true) {
//			String mes = client.tcp_client_get_data("0xffff");				
//			System.out.println(mes);			
//			client.tcp_client_close();
//		}								
//	}
		
		tcp_server server = new tcp_server();
		server.create_tcp_server(12345);
		byte[] bytes = new byte[5];
		bytes[0] = 0x1;
		bytes[1] = 0x2;
		bytes[2] = 0x3;
		bytes[3] = 0x4;
		bytes[4] = 0x5;
		server.tcp_server_send_data(bytes);
		
		while(true){
			String mes = server.tcp_server_get_data();
			System.out.println(mes);
		}
	}
}
