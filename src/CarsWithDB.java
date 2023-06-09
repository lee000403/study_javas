import java.util.ArrayList;
import java.util.Scanner;

import java.sql.*;

public class CarsWithDB {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            Statement statement = connection.createStatement();
            String query = "";

            // 작업 키 입력
            Scanner scanner = new Scanner(System.in);
            String workkey = "P";
            while (!workkey.equals("E")) {
                System.out.print("선택 입력 : ");
                workkey = scanner.nextLine();
                if (workkey.equals("O")) {
                    System.out.println("- 차 이름 명단");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME\n" + //
                            "\t, T_CAR_INFOR.CAR_INFOR_ID\n" + //
                            "FROM (factorys AS T_FAC\n" + //
                            "\tJOIN car_infors AS T_CAR_INFOR\n" + //
                            "\tON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID)\n" + //
                            ";";
                    ResultSet resultSet = statement.executeQuery(query);
                    int number = 1;
                    Statement statement2 = connection.createStatement();
                    ResultSet resultSet2;
                    String query2;
                    while (resultSet.next()) {
                        System.out.print(number + ". " + resultSet.getString("COMPANY") + " - " +
                        resultSet.getString("CAR_NAME") + " : ");
                        query2 = "SELECT T_OPT_INFOR.OPTION_NAME\n" + //
                                "FROM option_infors AS T_OPT_INFOR\n" + //
                                "\tJOIN `options` AS T_OPTS\n" + //
                                "    ON T_OPT_INFOR.OPTION_INFOR_ID = T_OPTS.OPTION_INFOR_ID \n" + //
                                "    AND T_OPTS.CAR_INFOR_ID = '"+resultSet.getString("CAR_INFOR_ID")+"'";
                        resultSet2 = statement2.executeQuery(query2);
                        while (resultSet2.next()) {
                            System.out.print(resultSet2.getString("OPTION_NAME") + ", ");
                        }
                        number++;
                        System.out.println();
                    }
                } 
                else if (workkey.equals("S")) {
                    System.out.println("- 통계 시작");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME, COUNT(T_OPTS.OPTION_ID) AS CNT\n" + //
                            "FROM (factorys AS T_FAC\n" + //
                            "\tJOIN car_infors AS T_CAR_INFOR\n" + //
                            "\tON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID)\n" + //
                            "\tJOIN options AS T_OPTS\n" + //
                            "\tON T_CAR_INFOR.CAR_INFOR_ID = T_OPTS.CAR_INFOR_ID\n" + //
                            "GROUP BY T_FAC.COMPANY_ID, T_CAR_INFOR.CAR_INFOR_ID";
                    ResultSet resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("COMPANY") + "," +
                        resultSet.getString("CAR_NAME") + "," +
                        resultSet.getInt("CNT"));
                    }
                }
                else {
                    System.out.println("---------작업 키 확인 : 입력한 값 : " + workkey);
                }
            }
            System.out.println("---------설문 종료---------");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}
