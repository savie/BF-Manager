package l;

/* JADX INFO: renamed from: l.᩺ۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes.dex */
public final class C24100 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f77914;

    static {
        boolean z = false;
        for (int i : C3962.f13544) {
            int upperCase = Character.toUpperCase(i);
            if (upperCase < 65536 || Character.toLowerCase(upperCase) < 65536) {
                z = true;
                break;
            }
        }
        f77914 = z;
    }
}
