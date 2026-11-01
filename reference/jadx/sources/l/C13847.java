package l;

/* JADX INFO: renamed from: l.ܰ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q882 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13847 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f45680;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f45681;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC20592 f45682;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final boolean f45683;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f45683 = z;
        if (z) {
            f45681 = C10674.f36421;
            f45680 = C14202.f46576;
            f45682 = C9263.f31488;
        } else {
            f45681 = null;
            f45680 = null;
            f45682 = null;
        }
    }
}
