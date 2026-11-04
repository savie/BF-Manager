package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C22873 implements InterfaceC4973, InterfaceC5851 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f74329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74330;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // l.InterfaceC10873
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2788() {
        return this;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۠᩷ */
    public final InterfaceC22808 mo2791() {
        return this;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean mo2792() {
        return true;
    }

    @Override // l.InterfaceC10873
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2796() {
        return mo2795();
    }

    public C22873(int i) {
        this.f74329 = new byte[i];
    }

    @Override // l.InterfaceC4973
    /* JADX INFO: renamed from: ۙ */
    public final int mo15179(C8636 c8636, InterfaceC7509 interfaceC7509) throws IOException {
        long j = this.f74330;
        int i = c8636.f28219;
        long j2 = j + ((long) i);
        byte[] bArr = this.f74329;
        if (j2 > bArr.length) {
            throw new IOException("Hex clipboard memory backing overflow");
        }
        if (interfaceC7509.mo924()) {
            throw new C9446();
        }
        int i2 = this.f74330;
        c8636.m23272(0, bArr, i2, i);
        if (interfaceC7509.mo924()) {
            throw new C9446();
        }
        this.f74330 += i;
        return i2;
    }

    @Override // l.InterfaceC4973
    public final void finish() throws IOException {
        if (this.f74330 != this.f74329.length) {
            throw new IOException("Incomplete hex clipboard memory backing");
        }
    }

    @Override // l.InterfaceC22808
    public final int length() {
        return this.f74329.length;
    }

    @Override // l.InterfaceC5851
    /* JADX INFO: renamed from: ᩴ */
    public final long mo2795() {
        return this.f74329.length;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۙ */
    public final void mo2790(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f74330;
        byte[] bArr2 = this.f74329;
        if (i4 != bArr2.length) {
            throw new IllegalStateException("Hex clipboard memory backing is incomplete");
        }
        C13921.m33904(bArr2.length, i, i3);
        C13921.m33902(bArr.length, i2, i3);
        System.arraycopy(bArr2, i, bArr, i2, i3);
    }
}
