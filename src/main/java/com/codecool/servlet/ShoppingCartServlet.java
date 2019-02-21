package com.codecool.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static com.codecool.servlet.WebShopServlet.cart;

@WebServlet(name = "ShoppingCartServlet", urlPatterns = {"/checkout"}, loadOnStartup = 4)
public class ShoppingCartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();
        String title = "ShoppingCart";

        out.println(
                "<html>\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n" +
                        "  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n" +
                        "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n" +
                        "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>" +
                        "<body>\n" +
                        "<h2 align = \"center\">" + title + "</h2>\n" +
                        "<ul>\n" +
                        "<div class=\"container\">\n" +
                        "<table class=\"table table-striped\">\n" +
                        "<thead>\n" +
                        "<tr>\n" +
                        "<th class=\"text-center\">Item</th>\n" +
                        "<th class=\"text-center\">Price</th>\n" +
                        "<th class=\"text-center\"></th>\n" +
                        "<th class=\"text-center\"></th>\n" +
                        "</tr>\n" +
                        "</thead>\n" +
                        "<tbody>\n" +
                        cart.getCartItems() +
                        "</tbody>\n" +
                        "</table>\n" +
                        "<input type=\"button\" value=\"Webshop\" onclick=\"window.location.href='/webshop'\"/ class=\"btn btn-primary\"></input>" +
                        "</div>" +
                        "</body></html>"
        );


    }
}
