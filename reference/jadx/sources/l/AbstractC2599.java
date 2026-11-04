package l;

/* JADX INFO: renamed from: l.ۖۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71RN */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2599 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20528 f8346 = new C20528();

    public abstract int length();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract byte mo8717(int i);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract long mo8720(int i);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public abstract int mo8722(int i);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract int mo8725(int i);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int mo8719(int i) {
        int iMo8725 = mo8725(i);
        if (iMo8725 >= 0) {
            return iMo8725;
        }
        throw new C23044(null, "Encountered small uint that is out of range at offset 0x%x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m8723(int i) {
        int iMo8725 = mo8725(i);
        if (iMo8725 >= -1) {
            return iMo8725;
        }
        throw new C23044(null, "Encountered optional uint that is out of range at offset 0x%x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m8721(int i) {
        return mo8722(i) & 65535;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8716(int i) {
        return mo8717(i) & 255;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m8726(int i) {
        long jMo8720 = mo8720(i);
        if (jMo8720 < 0 || jMo8720 > 2147483647L) {
            throw new C23044(null, "Encountered out-of-range ulong at offset 0x%x", Integer.valueOf(i));
        }
        return (int) jMo8720;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C8565 m8724(int i) {
        C8565 c8565 = (C8565) this.f8346.m47061();
        if (c8565 != null) {
            c8565.m22981(i);
            c8565.m23005();
            return c8565;
        }
        return new C8565(this, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8718(C8565 c8565) {
        this.f8346.m47060(c8565);
    }
}
