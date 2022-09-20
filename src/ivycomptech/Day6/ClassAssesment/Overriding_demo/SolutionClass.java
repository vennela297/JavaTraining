package ivycomptech.Day6.ClassAssesment.Overriding_demo;

public class SolutionClass {
    public static void main(String[] args) {
        IplTeams match1=new TeamRcb();
        match1.tournamentWonBy();

        IplTeams match2=new TeamCsk();
        match2.tournamentWonBy();

        IplTeams match3=new TeamKPL();
        match3.tournamentWonBy();

    }
}
