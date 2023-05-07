package academy.kata.lesson7;

// 3.2.6 Практическое задание Реализация метода getConnection.

public class RobotException {
    void moveRobot(RobotConnectionManager robotConnectionManager, int x, int y) {

        int count = 0;
        boolean isRun = false;
        while (count < 3) {
            try (RobotConnectionManager connection = new RobotConnectionManager().getConnection()) {
                connection.getConnection();
                isRun = true;
                count = 3;
            } catch (RobotConnectionException e) {
                if (isRun) {
                    count = 3;
                } else {
                    count++;
                    if (count == 3) {
                        throw new RobotConnectionException("3", e);
                    }
                }
            } catch (Throwable e) {
                throw e;
            }
        }
    }