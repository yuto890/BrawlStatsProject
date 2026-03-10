import components.standard.Standard;

/**
 * Kernel interface for the MatchLog component.
 *
 * <p>
 * A MatchLog represents the statistics of a single Brawl Stars match.
 * </p>
 *
 * @author Yuto Shiwa
 */
public interface matchLogKernel extends Standard<MatchLog> {

    /**
     * Sets the number of kills in this match.
     *
     * @param k
     *            number of kills
     * @updates this
     * @requires k >= 0
     * @ensures kills() = k
     */
    void setKills(int k);

    /**
     * Sets the number of deaths in this match.
     *
     * @param d
     *            number of deaths
     * @updates this
     * @requires d >= 0
     * @ensures deaths() = d
     */
    void setDeaths(int d);

    /**
     * Sets the total damage dealt in this match.
     *
     * @param dmg
     *            total damage
     * @updates this
     * @requires dmg >= 0
     * @ensures damage() = dmg
     */
    void setDamage(int dmg);

    /**
     * Sets the duration of the match.
     *
     * @param seconds
     *            duration of match in seconds
     * @updates this
     * @requires seconds >= 0
     * @ensures duration() = seconds
     */
    void setDuration(int seconds);

    /**
     * Returns the number of kills.
     *
     * @return number of kills
     * @ensures kills = number of kills in this
     */
    int kills();

    /**
     * Returns the number of deaths.
     *
     * @return number of deaths
     * @ensures deaths = number of deaths in this
     */
    int deaths();

    /**
     * Returns the total damage dealt.
     *
     * @return damage dealt
     * @ensures damage = damage dealt in this match
     */
    int damage();

    /**
     * Returns the duration of the match in seconds.
     *
     * @return match duration
     * @ensures duratio = duration of this match
     */
    int duration();
}