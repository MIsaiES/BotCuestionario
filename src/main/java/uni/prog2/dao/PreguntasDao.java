package uni.prog2.dao;
import uni.prog2.db.DatabaseConnection;
import uni.prog2.model.Preguntas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class PreguntasDao {
    public void insertarPregunta(Preguntas pregunta) throws SQLException {
        String query = "INSERT INTO tb_respuestas (seccion, telegramid, preguntaid, respuesta) VALUES (?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, pregunta.getSeccion());
            statement.setLong(2, pregunta.getTelegramid());
            statement.setDouble(3, pregunta.getIdPreguntas());
            statement.setString(4, pregunta.getRespuesta());
            statement.executeUpdate();
        }
    }
}

