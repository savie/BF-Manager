package l;

/* JADX INFO: renamed from: l.ۗ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBCN */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3659 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12522;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f12523;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f12524;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f12525;

    /* JADX INFO: renamed from: ۙ */
    public int mo2677() {
        return 0;
    }

    /* JADX INFO: renamed from: ۤ */
    public int mo4904() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int mo11865() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public int mo4905() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int mo11867() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩹ */
    public abstract int mo2678();

    public AbstractC3659(EnumC14757 enumC14757, int i, int i2, int i3, long j) {
        if (enumC14757 == null) {
            throw new NullPointerException("format == null");
        }
        if (!C8311.m22392(i)) {
            throw new IllegalArgumentException("invalid opcode");
        }
        this.f12523 = i;
        this.f12522 = i2;
        this.f12525 = i3;
        this.f12524 = j;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m11863() {
        return this.f12523;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short m11864() {
        return (short) this.f12523;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m11861() {
        return this.f12522;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11856(int i) {
        return this.f12525 - i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final short m11858(int i) {
        int i2 = this.f12525 - i;
        short s = (short) i2;
        if (i2 == s) {
            return s;
        }
        throw new C20288("Target out of range: ".concat(C5306.m15933(i2)), null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m11866(int i) {
        int i2 = this.f12525 - i;
        if (i2 == ((byte) i2)) {
            return i2 & 255;
        }
        throw new C20288("Target out of range: ".concat(C5306.m15933(i2)), null);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long m11860() {
        return this.f12524;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m11855() {
        long j = this.f12524;
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new C20288("Literal out of range: ".concat(C5306.m15937(j)), null);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final short m11868() {
        long j = this.f12524;
        short s = (short) j;
        if (j == s) {
            return s;
        }
        throw new C20288("Literal out of range: ".concat(C5306.m15937(j)), null);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m11857() {
        long j = this.f12524;
        int i = (int) j;
        if (j == ((byte) i)) {
            return i & 255;
        }
        throw new C20288("Literal out of range: ".concat(C5306.m15937(j)), null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m11859() {
        long j = this.f12524;
        if (j < -8 || j > 7) {
            throw new C20288("Literal out of range: ".concat(C5306.m15937(j)), null);
        }
        return ((int) j) & 15;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public short mo11862() {
        throw new IllegalStateException(getClass().toString());
    }
}
