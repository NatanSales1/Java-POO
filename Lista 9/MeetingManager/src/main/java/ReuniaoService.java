import java.text.SimpleDateFormat;
import java.util.Date;

public class ReuniaoService {

    public void agendarReuniao(Reuniao reuniao) {
        // Adicione aqui a lógica para agendar a reunião, como persistir no banco de dados, enviar notificações, etc.
        System.out.println("Reunião agendada com sucesso!");
        System.out.println("Detalhes da Reunião:");
        System.out.println("Local/Plataforma: " + getLocalOuPlataforma(reuniao));
        System.out.println("Data: " + reuniao.getData());
        System.out.println("Horário: " + reuniao.getHorario() + " horas");
        System.out.println("Participantes:");
        for (Participante participante : reuniao.getNomeParticipantes()) {
            System.out.println("- " + participante.getNome());
        }
    }

    private String getLocalOuPlataforma(Reuniao reuniao) {
        return reuniao.getLocalP() != null ? reuniao.getLocalP() : reuniao.getPlataforma();
    }
}
