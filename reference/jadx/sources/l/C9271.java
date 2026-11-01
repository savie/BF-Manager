package l;

/* JADX INFO: renamed from: l.ۢ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9271 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f31510;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f31511;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f31512;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f31513;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f31514;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f31515;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f31516;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13732 f31517;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2516 f31518;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11690 f31519;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m23820() {
        if (this.f31515 || this.f31516) {
            throw new IllegalStateException("Copy request is already consumed");
        }
        this.f31516 = true;
    }

    public C9271(C13732 c13732, C2516 c2516, long j, int i, int i2, long j2, C11690 c11690) {
        this.f31517 = c13732;
        this.f31518 = c2516;
        this.f31513 = j;
        this.f31512 = i;
        this.f31510 = i2;
        this.f31511 = j2;
        this.f31519 = c11690;
    }

    public final int length() {
        long j = (((long) this.f31510) - ((long) this.f31512)) + 1;
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23821() {
        synchronized (this) {
            if (this.f31514) {
                return;
            }
            this.f31514 = true;
            this.f31519.close();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f31515) {
                return;
            }
            this.f31515 = true;
            m23821();
        }
    }
}
