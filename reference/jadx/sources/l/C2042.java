package l;

/* JADX INFO: renamed from: l.֫᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6UN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2042 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C21716 f7608 = new C21716(65536);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10428 f7609;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char[] f7610;

    public C2042(C16072 c16072, int i) {
        char[] cArrM48457;
        C10428 c10428 = c16072 == null ? null : c16072.f51982;
        this.f7609 = c10428;
        if (c10428 != null) {
            this.f7610 = c10428.m26339(i);
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
            this.f7610 = C21716.f70407;
            return;
        }
        C21716 c21716 = f7608;
        synchronized (c21716) {
            cArrM48457 = c21716.m48457(i);
            this.f7610 = cArrM48457;
        }
        if (cArrM48457 == null) {
            this.f7610 = new char[i];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m6538() {
        char[] cArr = this.f7610;
        if (cArr != null) {
            return cArr;
        }
        throw new IllegalStateException("Text workspace is closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        char[] cArr = this.f7610;
        if (cArr == null) {
            return;
        }
        this.f7610 = null;
        C10428 c10428 = this.f7609;
        if (c10428 != null) {
            c10428.m26338(cArr);
        } else if (cArr.length != 0) {
            C21716 c21716 = f7608;
            synchronized (c21716) {
                c21716.m48456(cArr);
            }
        }
    }
}
