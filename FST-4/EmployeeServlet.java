import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** EmployeeServlet handles employee registration request */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {

        /** Handles POST request from employee registration form */
        protected void doPost(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {

                /** Get form data */
                String firstName = request.getParameter("firstName");

                String lastName = request.getParameter("lastName");

                String email = request.getParameter("email");

                String phone = request.getParameter("phone");

                double salary = Double.parseDouble(
                                request.getParameter("salary"));

                /** Create Employee object */
                Employee employee = new Employee(
                                firstName,
                                lastName,
                                email,
                                phone,
                                salary);

                /** Create DAO object */
                EmployeeDao dao = new EmployeeDao();

                /** Save employee data into database */
                dao.saveEmployee(employee);

                /** Set response content type */
                response.setContentType("text/html");

                /** Send response to browser */
                response.getWriter().println(
                                "<html><body>"
                                                + "<h2>Employee Registered Successfully!</h2>"
                                                + "<p>First Name: " + firstName + "</p>"
                                                + "<p>Last Name: " + lastName + "</p>"
                                                + "<p>Email: " + email + "</p>"
                                                + "<p>Phone: " + phone + "</p>"
                                                + "<p>Salary: " + salary + "</p>"
                                                + "</body></html>");
        }
}