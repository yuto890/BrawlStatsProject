/**
 * A Proof-of-Concept implementation of the MatchLog component for tracking
 * Brawl Stars match statistics. * @author Yuto Shiwa
 */
public class MatchLogPOC {

    // --- Representation (Fields) ---
    private int kills;
    private int deaths;
    private int damage;
    private int durationInSeconds;

    // --- Constructor ---
    public MatchLogPOC() {
        this.kills = 0;
        this.deaths = 0;
        this.damage = 0;
        this.durationInSeconds = 0;
    }

    // --- Kernel-like Methods (Basic state manipulation) ---

    public void setKills(int k) {
        this.kills = k;
    }

    public void setDeaths(int dth) {
        this.deaths = dth;
    }

    public void setDamage(int dmg) {
        this.damage = dmg;
    }

    public void setDuration(int seconds) {
        this.durationInSeconds = seconds;
    }

    public int kills() {
        return this.kills;
    }

    public int deaths() {
        return this.deaths;
    }

    public int damage() {
        return this.damage;
    }

    public int duration() {
        return this.durationInSeconds;
    }

    public void reset() {
        this.kills = 0;
        this.deaths = 0;
        this.damage = 0;
        this.durationInSeconds = 0;
    }

    // --- Secondary-like Methods (Derived statistics) ---

    /**
     * Computes the Damage Per Second (DPS) of the match.
     */
    public double dps() {
        if (this.durationInSeconds == 0) {
            return 0.0;
        }
        return (double) this.damage() / this.duration();
    }

    /**
     * Computes the Kill/Death Ratio (KDR) of the match.
     */
    public double killDeathRatio() {
        if (this.deaths() == 0) {
            // If there are no deaths, the ratio is essentially just the number of kills.
            return (double) this.kills();
        }
        return (double) this.kills() / this.deaths();
    }

    // --- Client View / Proof of Concept (Main Method) ---

    public static void main(String[] args) {
        // 1. Instantiate the component
        MatchLogPOC myMatch = new MatchLogPOC();

        // 2. Simulate a Brawl Stars match by setting the stats (Kernel methods)
        System.out.println("--- Entering Match Stats ---");
        myMatch.setKills(8);
        myMatch.setDeaths(2);
        myMatch.setDamage(45000);
        myMatch.setDuration(120); // 2 minute match

        System.out.println("Kills: " + myMatch.kills());
        System.out.println("Deaths: " + myMatch.deaths());
        System.out.println("Damage: " + myMatch.damage());
        System.out.println("Duration (s): " + myMatch.duration());

        // 3. Test the secondary methods to ensure derived stats calculate correctly
        System.out.println("\n--- Calculating Derived Metrics ---");
        System.out.printf("Match DPS: %.2f\n", myMatch.dps());
        System.out.printf("Kill/Death Ratio: %.2f\n", myMatch.killDeathRatio());

        // 4. Test the reset functionality
        System.out.println("\n--- Resetting MatchLog ---");
        myMatch.reset();
        System.out.println("Kills after reset: " + myMatch.kills());
        System.out.println("Damage after reset: " + myMatch.damage());
        System.out.println("Duration after reset: " + myMatch.duration());
    }
}