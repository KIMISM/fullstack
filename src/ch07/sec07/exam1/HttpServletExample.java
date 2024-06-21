package ch07.sec07.exam1;

public class HttpServletExample {
    public static void main(String[] args) {
        LoginServlet loginServlet = new LoginServlet();
        loginServlet.service();

        FileDownloadServlet fileDownloadServlet = new FileDownloadServlet();
        fileDownloadServlet.service();

        
    }

}
