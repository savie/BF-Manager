package l;

import android.os.PersistableBundle;

/* JADX INFO: renamed from: l.ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 374 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14163 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9224 m34237(PersistableBundle persistableBundle) {
        String string = persistableBundle.getString("name");
        String string2 = persistableBundle.getString("uri");
        String string3 = persistableBundle.getString("key");
        boolean z = persistableBundle.getBoolean("isBot");
        boolean z2 = persistableBundle.getBoolean("isImportant");
        C9224 c9224 = new C9224();
        c9224.f31358 = string;
        c9224.f31357 = null;
        c9224.f31361 = string2;
        c9224.f31356 = string3;
        c9224.f31360 = z;
        c9224.f31359 = z2;
        return c9224;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PersistableBundle m34236(C9224 c9224) {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = c9224.f31358;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", c9224.f31361);
        persistableBundle.putString("key", c9224.f31356);
        persistableBundle.putBoolean("isBot", c9224.f31360);
        persistableBundle.putBoolean("isImportant", c9224.f31359);
        return persistableBundle;
    }
}
