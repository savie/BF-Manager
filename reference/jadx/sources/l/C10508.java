package l;

/* JADX INFO: renamed from: l.ۤ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X6UN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10508 implements AutoCloseable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C6319 f33432 = new C6319(65536);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0352 f33433;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char[] f33434;

    public C10508(C10046 c10046, int i) {
        char[] cArrM18038;
        C0352 c0352 = c10046 == null ? null : c10046.f32208;
        this.f33433 = c0352;
        if (c0352 != null) {
            this.f33434 = c0352.m2118(i);
            return;
        }
        if (i < 0) {
            throw new IllegalArgumentException("Negative workspace length");
        }
        if (i != 0 && i <= 8192) {
            int i2 = 16;
            while (i2 < i) {
                i2 <<= 1;
            }
            i = i2;
        }
        if (i == 0) {
            this.f33434 = C6319.f21417;
            return;
        }
        C6319 c6319 = f33432;
        synchronized (c6319) {
            cArrM18038 = c6319.m18038(i);
            this.f33434 = cArrM18038;
        }
        if (cArrM18038 == null) {
            this.f33434 = new char[i];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m26971() {
        char[] cArr = this.f33434;
        if (cArr != null) {
            return cArr;
        }
        throw new IllegalStateException("Text workspace is closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        char[] cArr = this.f33434;
        if (cArr == null) {
            return;
        }
        this.f33434 = null;
        C0352 c0352 = this.f33433;
        if (c0352 != null) {
            c0352.m2117(cArr);
        } else if (cArr.length != 0) {
            C6319 c6319 = f33432;
            synchronized (c6319) {
                c6319.m18037(cArr);
            }
        }
    }
}
