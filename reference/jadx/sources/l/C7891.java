package l;

/* JADX INFO: renamed from: l.۠ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4EU */
/* JADX INFO: loaded from: classes3.dex */
public final class C7891 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long f25944;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C18474 f25945;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18474 m20824() {
        synchronized (C7891.class) {
            C18474 c18474 = f25945;
            if (c18474 != null) {
                f25945 = c18474.f58876;
                c18474.f58876 = null;
                f25944 -= 8192;
                return c18474;
            }
            return new C18474();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20825(C18474 c18474) {
        if (c18474.f58876 != null || c18474.f58878 != null) {
            throw new IllegalArgumentException();
        }
        if (c18474.f58872) {
            return;
        }
        synchronized (C7891.class) {
            long j = f25944 + 8192;
            if (j > 65536) {
                return;
            }
            f25944 = j;
            c18474.f58876 = f25945;
            c18474.f58877 = 0;
            c18474.f58875 = 0;
            f25945 = c18474;
        }
    }
}
