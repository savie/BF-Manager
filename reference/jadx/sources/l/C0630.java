package l;

/* JADX INFO: renamed from: l.֡ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C0630 implements InterfaceC5851 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f2473;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f2474;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // l.InterfaceC10873
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo2788() {
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m2789(int i) {
        if (i >= 0) {
            if (i <= this.f2474) {
                this.f2474 = i;
            }
        }
        throw new IllegalArgumentException("Invalid arena rollback");
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808 mo2791() {
        return this;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo2792() {
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized int m2794(int i, int i2, byte[] bArr) {
        int i3;
        if (i2 > m2793()) {
            throw new IllegalArgumentException("Arena block overflow");
        }
        i3 = this.f2474;
        System.arraycopy(bArr, i, this.f2473, i3, i2);
        this.f2474 += i2;
        return i3;
    }

    @Override // l.InterfaceC10873
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long mo2796() {
        return mo2795();
    }

    public C0630(int i) {
        this.f2473 = new byte[i];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m2793() {
        return this.f2473.length - this.f2474;
    }

    @Override // l.InterfaceC22808
    public final int length() {
        return this.f2474;
    }

    @Override // l.InterfaceC5851
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long mo2795() {
        return this.f2473.length;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2790(int i, byte[] bArr, int i2, int i3) {
        C13921.m33904(this.f2474, i, i3);
        C13921.m33902(bArr.length, i2, i3);
        System.arraycopy(this.f2473, i, bArr, i2, i3);
    }
}
