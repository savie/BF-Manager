package l;

/* JADX INFO: renamed from: l.᩸۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7CF */
/* JADX INFO: loaded from: classes.dex */
public final class C22824 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73966;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f73967;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f73968;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73969;

    public C22824() {
        m51464(-1, -1);
        this.f73967 = -1;
        this.f73969 = -1;
        EnumC16856.m39777(EnumC19840.ORDINARY);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51464(int i, int i2) {
        this.f73966 = i;
        this.f73968 = i2;
        if (m51468()) {
            EnumC16856.m39777(EnumC19840.VALUE_OBJECTS);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51463(int i) {
        m51464(i, this.f73968);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51471(int i) {
        m51464(this.f73966, i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m51466() {
        return (this.f73966 == -1 || this.f73968 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m51462() {
        int i = this.f73966;
        Object objValueOf = i == -1 ? "(undef)" : Integer.valueOf(i);
        int i2 = this.f73968;
        return String.format("%s:%s", objValueOf, i2 != -1 ? Integer.valueOf(i2) : "(undef)");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m51469() {
        return m51466() && this.f73966 >= 50;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51470() {
        if (m51466()) {
            return;
        }
        if (EnumC16856.m39795() == EnumC19840.VALUE_OBJECTS) {
            m51464(69, 65535);
        } else {
            m51464(45, 3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22824 m51461(C22824 c22824) {
        C22824 c22825 = new C22824();
        c22825.m51464(c22824.f73966, c22824.f73968);
        c22825.f73967 = c22824.f73967;
        c22825.f73969 = c22824.f73969;
        if (c22825.m51468()) {
            EnumC16856.m39777(EnumC19840.VALUE_OBJECTS);
        } else {
            EnumC16856.m39777(EnumC19840.ORDINARY);
        }
        return c22825;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m51465() {
        return this.f73968;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m51467() {
        return this.f73966;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m51468() {
        int i = this.f73966;
        if (i <= 69) {
            return i == 69 && this.f73968 == 65535;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22824 m51460() {
        C22824 c22824 = new C22824();
        c22824.f73966 = 69;
        c22824.f73968 = 65535;
        if (c22824.m51468()) {
            EnumC16856.m39777(EnumC19840.VALUE_OBJECTS);
            return c22824;
        }
        EnumC16856.m39777(EnumC19840.ORDINARY);
        return c22824;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m51472() {
        return this.f73966 <= 45;
    }
}
