package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C18807 implements InterfaceC15280, InterfaceC0193 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] f60961;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f60962;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ֫ܰ */
    public final InterfaceC18745 mo2298() {
        return this;
    }

    @Override // l.InterfaceC18039
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8032() {
        return this;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ boolean mo2300() {
        return true;
    }

    @Override // l.InterfaceC18039
    /* JADX INFO: renamed from: ۨ */
    public final long mo8035() {
        return mo1427();
    }

    public C18807(int i) {
        this.f60961 = new byte[i];
    }

    @Override // l.InterfaceC15280
    /* JADX INFO: renamed from: ۙ */
    public final int mo36593(C3658 c3658, InterfaceC5614 interfaceC5614) throws IOException {
        long j = this.f60962;
        int i = c3658.f13400;
        long j2 = j + ((long) i);
        byte[] bArr = this.f60961;
        if (j2 > bArr.length) {
            throw new IOException("Hex clipboard memory backing overflow");
        }
        if (interfaceC5614.mo2357()) {
            throw new C1105();
        }
        int i2 = this.f60962;
        c3658.m10775(0, bArr, i2, i);
        if (interfaceC5614.mo2357()) {
            throw new C1105();
        }
        this.f60962 += i;
        return i2;
    }

    @Override // l.InterfaceC15280
    public final void finish() throws IOException {
        if (this.f60962 != this.f60961.length) {
            throw new IOException("Incomplete hex clipboard memory backing");
        }
    }

    @Override // l.InterfaceC18745
    public final int length() {
        return this.f60961.length;
    }

    @Override // l.InterfaceC0193
    /* JADX INFO: renamed from: ۚ */
    public final long mo1427() {
        return this.f60961.length;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۙ */
    public final void mo2299(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f60962;
        byte[] bArr2 = this.f60961;
        if (i4 != bArr2.length) {
            throw new IllegalStateException("Hex clipboard memory backing is incomplete");
        }
        C22979.m50823(bArr2.length, i, i3);
        C22979.m50824(bArr.length, i2, i3);
        System.arraycopy(bArr2, i, bArr, i2, i3);
    }
}
