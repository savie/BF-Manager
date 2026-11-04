package l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܶ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16435 implements InterfaceC6116 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final OutputStream f53317;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f53318 = new byte[32768];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f53319;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17181 f53320;

    @Override // l.InterfaceC6116
    /* JADX INFO: renamed from: ۙ */
    public final void mo17643(int i) {
    }

    public C16435(OutputStream outputStream, C17181 c17181) {
        this.f53317 = outputStream;
        this.f53320 = c17181;
    }

    @Override // l.InterfaceC6116
    /* JADX INFO: renamed from: ۙ */
    public final void mo17644(int i, byte[] bArr) throws IOException {
        AbstractC13057.m32543(this.f53320);
        this.f53317.write(bArr, 0, i);
    }

    @Override // l.InterfaceC6116
    /* JADX INFO: renamed from: ۙ */
    public final void mo17645(ByteBuffer byteBuffer) throws IOException {
        while (byteBuffer.hasRemaining()) {
            AbstractC13057.m32543(this.f53320);
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = this.f53318;
            int iMin = Math.min(iRemaining, bArr.length);
            byteBuffer.get(bArr, 0, iMin);
            this.f53317.write(bArr, 0, iMin);
        }
    }

    @Override // l.InterfaceC6116
    /* JADX INFO: renamed from: ܳۙ */
    public final void mo17646() {
        this.f53319 = true;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f53320.mo924();
    }
}
