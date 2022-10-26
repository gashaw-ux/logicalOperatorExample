public class LogecalOperatosExample {
    public static void main(String[] args) {
// Voting Scenario

        boolean isUnderage = false;
        boolean isEthiopian = true;
        boolean hasAnID = false;
        boolean isPreviousVoter = false;
        boolean criminalRecord =false;

        boolean canVote = !isUnderage && isEthiopian && ((hasAnID || isPreviousVoter) || (hasAnID || !criminalRecord) || (isPreviousVoter || !criminalRecord));

        System.out.println(canVote);


    }
}
