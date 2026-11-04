package l;

import android.os.PersistableBundle;

/* JADX INFO: renamed from: l.᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 374 */
/* JADX INFO: loaded from: classes.dex */
public final class C22425 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14965 m50571(PersistableBundle persistableBundle) {
        String string = persistableBundle.getString("name");
        String string2 = persistableBundle.getString("uri");
        String string3 = persistableBundle.getString("key");
        boolean z = persistableBundle.getBoolean("isBot");
        boolean z2 = persistableBundle.getBoolean("isImportant");
        C14965 c14965 = new C14965();
        c14965.f48878 = string;
        c14965.f48876 = string2;
        c14965.f48875 = string3;
        c14965.f48874 = z;
        c14965.f48877 = z2;
        return c14965;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PersistableBundle m50570(C14965 c14965) {
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = c14965.f48878;
        persistableBundle.putString("name", str != null ? str.toString() : null);
        persistableBundle.putString("uri", c14965.f48876);
        persistableBundle.putString("key", c14965.f48875);
        persistableBundle.putBoolean("isBot", c14965.f48874);
        persistableBundle.putBoolean("isImportant", c14965.f48877);
        return persistableBundle;
    }
}
