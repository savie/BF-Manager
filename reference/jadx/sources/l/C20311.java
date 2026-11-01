package l;

/* JADX INFO: renamed from: l.᩶ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7CF */
/* JADX INFO: loaded from: classes4.dex */
public final class C20311 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f65791;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f65792;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f65793;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65794;

    public C20311() {
        m45845(-1, -1);
        this.f65793 = -1;
        this.f65791 = -1;
        EnumC23839.m52520(EnumC0554.ORDINARY);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45845(int i, int i2) {
        this.f65792 = i;
        this.f65794 = i2;
        if (m45851()) {
            EnumC23839.m52520(EnumC0554.VALUE_OBJECTS);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45844(int i) {
        m45845(i, this.f65794);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45850(int i) {
        m45845(this.f65792, i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m45847() {
        return (this.f65792 == -1 || this.f65794 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m45843() {
        int i = this.f65792;
        Object objValueOf = i == -1 ? "(undef)" : Integer.valueOf(i);
        int i2 = this.f65794;
        return String.format("%s:%s", objValueOf, i2 != -1 ? Integer.valueOf(i2) : "(undef)");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m45846() {
        return m45847() && this.f65792 >= 50;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45849() {
        if (m45847()) {
            return;
        }
        if (EnumC23839.m52542() == EnumC0554.VALUE_OBJECTS) {
            m45845(69, 65535);
        } else {
            m45845(45, 3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20311 m45840(C20311 c20311) {
        C20311 c20312 = new C20311();
        c20312.m45845(c20311.f65792, c20311.f65794);
        c20312.f65793 = c20311.f65793;
        c20312.f65791 = c20311.f65791;
        if (c20312.m45851()) {
            EnumC23839.m52520(EnumC0554.VALUE_OBJECTS);
        } else {
            EnumC23839.m52520(EnumC0554.ORDINARY);
        }
        return c20312;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m45848() {
        return this.f65794;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m45841() {
        return this.f65792;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m45851() {
        int i = this.f65792;
        if (i <= 69) {
            return i == 69 && this.f65794 == 65535;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C20311 m45839() {
        C20311 c20311 = new C20311();
        c20311.f65792 = 69;
        c20311.f65794 = 65535;
        if (c20311.m45851()) {
            EnumC23839.m52520(EnumC0554.VALUE_OBJECTS);
            return c20311;
        }
        EnumC23839.m52520(EnumC0554.ORDINARY);
        return c20311;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m45842() {
        return this.f65792 <= 45;
    }
}
