package l;

/* JADX INFO: renamed from: l.ۖܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C2578 implements InterfaceC0193 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] f10153;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f10154;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ֫ܰ */
    public final InterfaceC18745 mo2298() {
        return this;
    }

    @Override // l.InterfaceC18039
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo8032() {
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m8033(int i) {
        if (i >= 0) {
            if (i <= this.f10154) {
                this.f10154 = i;
            }
        }
        throw new IllegalArgumentException("Invalid arena rollback");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized int m8034(int i, int i2, byte[] bArr) {
        int i3;
        if (i2 > m8036()) {
            throw new IllegalArgumentException("Arena block overflow");
        }
        i3 = this.f10154;
        System.arraycopy(bArr, i, this.f10153, i3, i2);
        this.f10154 += i2;
        return i3;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ boolean mo2300() {
        return true;
    }

    @Override // l.InterfaceC18039
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long mo8035() {
        return mo1427();
    }

    public C2578(int i) {
        this.f10153 = new byte[i];
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m8036() {
        return this.f10153.length - this.f10154;
    }

    @Override // l.InterfaceC18745
    public final int length() {
        return this.f10154;
    }

    @Override // l.InterfaceC0193
    /* JADX INFO: renamed from: ۚ */
    public final long mo1427() {
        return this.f10153.length;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۙ */
    public final void mo2299(int i, byte[] bArr, int i2, int i3) {
        C22979.m50823(this.f10154, i, i3);
        C22979.m50824(bArr.length, i2, i3);
        System.arraycopy(this.f10153, i, bArr, i2, i3);
    }
}
