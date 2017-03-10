package controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import domain.Customer;
import util.Wrapper;

@WebServlet("/getCustomer.do")
public class XMLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/xml;charset=utf-8");
		OutputStream out = response.getOutputStream();
		
		Customer cus = new Customer();
		cus.setId("id");
		cus.setPassword("111");
		cus.setName("name");
		cus.setAddress("address");
		
		Customer cus2 = new Customer();
		cus2.setId("22");
		cus2.setPassword("22");
		cus2.setName("22");
		cus2.setAddress("22");
		
		List<Customer> list = new ArrayList<>();
		list.add(cus2);
		list.add(cus);
		
		try {
			JAXBContext context = JAXBContext.newInstance(Wrapper.class, Customer.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			QName qname = new QName("customers");
			Wrapper<Customer> wrapper = new Wrapper<>(list);
			JAXBElement<Wrapper> element = new JAXBElement<Wrapper>(qname, Wrapper.class, wrapper);
			m.marshal(element, out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		
//		try {
//			JAXBContext context = JAXBContext.newInstance(Customer.class);
//			Marshaller m = context.createMarshaller();
//			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//			m.marshal(cus, out);
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}
	}

}









