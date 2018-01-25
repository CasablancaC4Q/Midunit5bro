package comli.example.c4q.midunit5.models;

import android.graphics.Picture;
import android.location.Location;

import java.util.jar.Attributes;

/**
 * Created by c4q on 1/24/18.
 */

public class Connections {
    private Names name;
    private Location location;
    private String email;
    private String dob;
    private String cell;
    private Picture picture;

    public Names getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }

    public String getCell() {
        return cell;
    }

    public Picture getPicture() {
        return picture;
    }
}
