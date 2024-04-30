import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reuniao {
    private String localP;
    private String plataforma;
    private Date data;
    private int horario;
    private int participantes;
    private Participante[] nomeParticipantes;

    // Getters e Setters
    public String getLocalP() {
        return localP;
    }

    public void setLocalP(String localP) {
        this.localP = localP;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getData() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }

    public void setData(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.data = formato.parse(data);
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public Participante[] getNomeParticipantes() {
        return nomeParticipantes;
    }

    public void setParticipantes(Participante[] nomeParticipantes) {
        this.nomeParticipantes = nomeParticipantes;
    }

    void agendar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
