package l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܰۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C13738 implements InterfaceC12086 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f45293;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] f45294 = new byte[32768];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final OutputStream f45295;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2925 f45296;

    @Override // l.InterfaceC12086
    /* JADX INFO: renamed from: ۙ */
    public final void mo30074(int i) {
    }

    public C13738(OutputStream outputStream, C2925 c2925) {
        this.f45295 = outputStream;
        this.f45296 = c2925;
    }

    @Override // l.InterfaceC12086
    /* JADX INFO: renamed from: ۙ */
    public final void mo30075(int i, byte[] bArr) throws IOException {
        AbstractC1886.m6135(this.f45296);
        this.f45295.write(bArr, 0, i);
    }

    @Override // l.InterfaceC12086
    /* JADX INFO: renamed from: ۙ */
    public final void mo30076(ByteBuffer byteBuffer) throws IOException {
        while (byteBuffer.hasRemaining()) {
            AbstractC1886.m6135(this.f45296);
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = this.f45294;
            int iMin = Math.min(iRemaining, bArr.length);
            byteBuffer.get(bArr, 0, iMin);
            this.f45295.write(bArr, 0, iMin);
        }
    }

    @Override // l.InterfaceC12086
    /* JADX INFO: renamed from: ᩹ۙ */
    public final void mo30077() {
        this.f45293 = true;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f45296.mo2357();
    }
}
