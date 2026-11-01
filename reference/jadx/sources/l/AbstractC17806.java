package l;

/* JADX INFO: renamed from: l.ᩳۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBCN */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17806 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f56425;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f56426;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f56427;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f56428;

    /* JADX INFO: renamed from: ۖ */
    public int mo20929() {
        return 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo16133() {
        return 0;
    }

    /* JADX INFO: renamed from: ۚ */
    public int mo20930() {
        return 0;
    }

    /* JADX INFO: renamed from: ۨ */
    public int mo20931() {
        return 0;
    }

    /* JADX INFO: renamed from: ܰ */
    public int mo16134() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract int mo1687();

    public AbstractC17806(EnumC7306 enumC7306, int i, int i2, int i3, long j) {
        if (enumC7306 == null) {
            throw new NullPointerException("format == null");
        }
        if (!C4010.m11515(i)) {
            throw new IllegalArgumentException("invalid opcode");
        }
        this.f56427 = i;
        this.f56426 = i2;
        this.f56425 = i3;
        this.f56428 = j;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m41390() {
        return this.f56427;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final short m41391() {
        return (short) this.f56427;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m41392() {
        return this.f56426;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41385(int i) {
        return this.f56425 - i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final short m41387(int i) {
        int i2 = this.f56425 - i;
        short s = (short) i2;
        if (i2 == s) {
            return s;
        }
        throw new C19508("Target out of range: ".concat(C22475.m49979(i2)), null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m41389(int i) {
        int i2 = this.f56425 - i;
        if (i2 == ((byte) i2)) {
            return i2 & 255;
        }
        throw new C19508("Target out of range: ".concat(C22475.m49979(i2)), null);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long m41383() {
        return this.f56428;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m41384() {
        long j = this.f56428;
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new C19508("Literal out of range: ".concat(C22475.m49980(j)), null);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final short m41393() {
        long j = this.f56428;
        short s = (short) j;
        if (j == s) {
            return s;
        }
        throw new C19508("Literal out of range: ".concat(C22475.m49980(j)), null);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m41388() {
        long j = this.f56428;
        int i = (int) j;
        if (j == ((byte) i)) {
            return i & 255;
        }
        throw new C19508("Literal out of range: ".concat(C22475.m49980(j)), null);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m41386() {
        long j = this.f56428;
        if (j < -8 || j > 7) {
            throw new C19508("Literal out of range: ".concat(C22475.m49980(j)), null);
        }
        return ((int) j) & 15;
    }

    /* JADX INFO: renamed from: ᩳ */
    public short mo37516() {
        throw new IllegalStateException(getClass().toString());
    }
}
