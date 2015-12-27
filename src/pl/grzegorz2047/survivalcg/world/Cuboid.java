package pl.grzegorz2047.survivalcg.world;
import org.bukkit.Location;
import org.bukkit.util.Vector;

/**
 *
 * @author Grzegorz
 */
public class Cuboid {

    private Location center;
    private int radius;
    private String owner;

    public Location getCenter() {
        return this.center;
    }

    public int getRadius() {
        return this.radius;
    }

    public boolean isinCuboid(Location loc) {
        Vector v = loc.toVector();
        return v.isInAABB(this.getMin().toVector(), this.getMax().toVector());
    }

    public void setCenter(Location center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String tag) {
        this.owner = tag;
    }

    public Location getMin() {
        return new Location(this.center.getWorld(), this.center.getBlockX() - this.radius, 0, this.center.getBlockZ() - this.radius);
    }

    public Location getMax() {
        return new Location(this.center.getWorld(), this.center.getBlockX() + this.radius, this.center.getWorld().getMaxHeight(), this.center.getBlockZ() + this.radius);
    }

}