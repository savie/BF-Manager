package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C17651 implements InterfaceC19824 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f58026;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte f58027;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
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

    public C17651(byte b, int i) {
        this.f58026 = i;
        this.f58027 = b;
    }

    @Override // l.InterfaceC22808
    public final int length() {
        return this.f58026;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۙ */
    public final void mo2790(int i, byte[] bArr, int i2, int i3) {
        C13921.m33904(this.f58026, i, i3);
        C13921.m33902(bArr.length, i2, i3);
        Arrays.fill(bArr, i2, i3 + i2, this.f58027);
    }
}
