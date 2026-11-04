package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩸۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7QW */
/* JADX INFO: loaded from: classes.dex */
public final class C22838 extends HashMap {
    public static final long serialVersionUID = 1812267524140424433L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C13477 f74017 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22838 m51542(C4747 c4747) {
        C13477 c13477 = f74017;
        C22838 c22838 = (C22838) c4747.m14643(c13477);
        if (c22838 != null) {
            return c22838;
        }
        C22838 c22839 = new C22838();
        c4747.m14646(c13477, c22839);
        return c22839;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51543(C3168 c3168, EnumC10903 enumC10903) {
        EnumC10903 enumC10904 = (EnumC10903) get(c3168);
        return (enumC10904 == null || enumC10903.m27669(enumC10904)) ? false : true;
    }
}
