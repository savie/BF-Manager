package l;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

/* JADX INFO: renamed from: l.ۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: G5FQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3514 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C3514 f12868;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f12869;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9866 f12870 = new C9866();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LocationManager f12871;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3514 m10342(Context context) {
        if (f12868 == null) {
            Context applicationContext = context.getApplicationContext();
            f12868 = new C3514(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f12868;
    }

    public C3514(Context context, LocationManager locationManager) {
        this.f12869 = context;
        this.f12871 = locationManager;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m10343() {
        Location lastKnownLocation;
        long j;
        C9866 c9866 = this.f12870;
        if (c9866.f33709 > System.currentTimeMillis()) {
            return c9866.f33708;
        }
        Context context = this.f12869;
        int iM17169 = C6171.m17169(context, "android.permission.ACCESS_COARSE_LOCATION");
        LocationManager locationManager = this.f12871;
        Location lastKnownLocation2 = null;
        if (iM17169 == 0) {
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
        if (C6171.m17169(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
        C2103 c2103M6653 = C2103.m6653();
        c2103M6653.m6654(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis - 86400000);
        c2103M6653.m6654(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), jCurrentTimeMillis);
        boolean z = c2103M6653.f7749 == 1;
        long j2 = c2103M6653.f7751;
        long j3 = c2103M6653.f7750;
        c2103M6653.m6654(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), 86400000 + jCurrentTimeMillis);
        long j4 = c2103M6653.f7751;
        if (j2 == -1 || j3 == -1) {
            j = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j3) {
                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
            }
            j = j4 + 60000;
        }
        c9866.f33708 = z;
        c9866.f33709 = j;
        return z;
    }
}
