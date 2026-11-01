package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C0462 implements InterfaceC8162 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f2086;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte f2087;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18745 mo2298() {
        return this;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo2300() {
        return true;
    }

    public C0462(byte b, int i) {
        this.f2086 = i;
        this.f2087 = b;
    }

    @Override // l.InterfaceC18745
    public final int length() {
        return this.f2086;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2299(int i, byte[] bArr, int i2, int i3) {
        C22979.m50823(this.f2086, i, i3);
        C22979.m50824(bArr.length, i2, i3);
        Arrays.fill(bArr, i2, i3 + i2, this.f2087);
    }
}
