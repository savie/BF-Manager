package l;

/* JADX INFO: renamed from: l.ܽۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16580 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f53223;

    static {
        boolean z = false;
        for (int i : C12347.f41255) {
            int upperCase = Character.toUpperCase(i);
            if (upperCase < 65536 || Character.toLowerCase(upperCase) < 65536) {
                z = true;
                break;
            }
        }
        f53223 = z;
    }
}
