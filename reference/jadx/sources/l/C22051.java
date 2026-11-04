package l;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

/* JADX INFO: renamed from: l.᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: G5FQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22051 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C22051 f71115;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f71116;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4897 f71117 = new C4897();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LocationManager f71118;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22051 m49893(Context context) {
        if (f71115 == null) {
            Context applicationContext = context.getApplicationContext();
            f71115 = new C22051(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f71115;
    }

    public C22051(Context context, LocationManager locationManager) {
        this.f71116 = context;
        this.f71118 = locationManager;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49894() {
        Location lastKnownLocation;
        long j;
        C4897 c4897 = this.f71117;
        if (c4897.f17108 > System.currentTimeMillis()) {
            return c4897.f17107;
        }
        Context context = this.f71116;
        int iM18414 = C6540.m18414(context, "android.permission.ACCESS_COARSE_LOCATION");
        LocationManager locationManager = this.f71118;
        Location lastKnownLocation2 = null;
        if (iM18414 == 0) {
            try {
                if (locationManager.isProviderEnabled("network")) {
                    lastKnownLocation = locationManager.getLastKnownLocation("network");
                } else {
                    lastKnownLocation = null;
                }
            } catch (Exception unused) {
            }
        } else {
            lastKnownLocation = null;
        }
        if (C6540.m18414(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            try {
                if (locationManager.isProviderEnabled("gps")) {
                    lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                }
            } catch (Exception unused2) {
            }
        }
        if (lastKnownLocation2 == null || lastKnownLocation == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > lastKnownLocation.getTime()) {
            lastKnownLocation = lastKnownLocation2;
        }
        if (lastKnownLocation == null) {
            int i = Calendar.getInstance().get(11);
            return i < 6 || i >= 22;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C13910 c13910M33893 = C13910.m33893();
        c13910M33893.m33894(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
        c13910M33893.m33894(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
        boolean z = c13910M33893.f44122 == 1;
        long j2 = c13910M33893.f44124;
        long j3 = c13910M33893.f44123;
        c13910M33893.m33894(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), 86400000 + jCurrentTimeMillis);
        long j4 = c13910M33893.f44124;
        if (j2 == -1 || j3 == -1) {
            j = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j3) {
                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
            }
            j = j4 + 60000;
        }
        c4897.f17107 = z;
        c4897.f17108 = j;
        return z;
    }
}
