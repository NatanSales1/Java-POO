import java.text.ParseException;
import java.util.Scanner;

public class MeetingManager {

    private ReuniaoService reuniaoService;

    public MeetingManager() {
        this.reuniaoService = new ReuniaoService();
    }

    public void iniciarAgendamento() throws ParseException {
        Scanner in = new Scanner(System.in);

        System.out.println("[AGENDAMENTO DE REUNIÕES]");
        System.out.println("O agendamento é para uma reunião presencial[1] ou virtual[2]? Digite o numero.");
        int opc = in.nextInt();

        in.nextLine();

        Reuniao reuniao = new Reuniao();

        if (opc == 1) {
            System.out.println("Digite o local: ");
            String localP = in.nextLine();
            reuniao.setLocalP(localP);
        } else if (opc == 2) {
            System.out.println("Digite a plataforma de videoconferência: ");
            String plataforma = in.nextLine();
            reuniao.setPlataforma(plataforma);
        }

        System.out.println("Digite a data do agendamento no formato dd/mm/aaaa: ");
        String dataString = in.nextLine();
        reuniao.setData(dataString);

        System.out.println("Digite o horário: ");
        int horario = in.nextInt();
        reuniao.setHorario(horario);

        System.out.println("Deseja convidar participantes externos? Sim[1] - Não[2]");
        int participantes = in.nextInt();

        if (participantes == 1) {
            System.out.println("Quantos participantes?");
            int qntParticipantes = in.nextInt();
            in.nextLine();
            Participante[] nomeParticipantes = new Participante[qntParticipantes];

            for (int i = 0; i < qntParticipantes; i++) {
                System.out.println("Digite o nome do Participante " + (i + 1) + ":");
                String nome = in.nextLine();
                nomeParticipantes[i] = new Participante(nome);
            }

            reuniao.setParticipantes(nomeParticipantes);
            System.out.println("Participantes convidados não terão permissões de administrador concedidas.");
        }

        reuniaoService.agendarReuniao(reuniao);

        System.out.println();
        System.out.println("AGENDAMENTO DE REUNIÕES (Dia " + reuniao.getData() + ")");
        System.out.println("- " + reuniao.getHorario() + " horas");
        if (opc == 1)
            System.out.println("- " + reuniao.getLocalP() + " [local]");
        else if (opc == 2)
            System.out.println("- " + reuniao.getPlataforma() + " [plataforma]");
        if (participantes == 1) {
            System.out.println("Participantes convidados:");
            for (Participante participante : reuniao.getNomeParticipantes()) {
                System.out.println("- " + participante.getNome());
            }
        }
        System.out.println("[Os participantes serão notificados por e-mail quando a reunião começar]");

        in.close();
    }

    public static void main(String[] args) throws ParseException {
        MeetingManager meetingManager = new MeetingManager();
        meetingManager.iniciarAgendamento();
    }
}
