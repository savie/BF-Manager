package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6JG */
/* JADX INFO: loaded from: classes3.dex */
public final class C6306 implements InterfaceC12227 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f21384;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12227 f21385;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f21386;

    public C6306(long j, InterfaceC12227 interfaceC12227) {
        this.f21386 = j;
        this.f21385 = interfaceC12227;
    }

    @Override // l.InterfaceC12227
    /* JADX INFO: renamed from: ۙ */
    public final int mo2073(long j, byte[] bArr, int i, int i2) throws IOException {
        if (j < 0 || i2 > this.f21386 - j || i2 > 16777216 - this.f21384) {
            throw new IOException("Audio metadata exceeds source boundary or read limit");
        }
        int iMo2073 = this.f21385.mo2073(j, bArr, i, i2);
        if (iMo2073 > 0) {
            this.f21384 += iMo2073;
        }
        return iMo2073;
    }
}
