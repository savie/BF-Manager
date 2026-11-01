package androidx.media3.decoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import l.AbstractC0509;
import l.InterfaceC20266;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends AbstractC0509 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ByteBuffer f0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20266 f1;

    public SimpleDecoderOutputBuffer(InterfaceC20266 interfaceC20266) {
        this.f1 = interfaceC20266;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m6(int i, long j) {
        this.f2202 = j;
        ByteBuffer byteBuffer = this.f0;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f0 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.f0.position(0);
        this.f0.limit(i);
        return this.f0;
    }

    @Override // l.AbstractC0509, l.AbstractC18148
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo7() {
        super.mo7();
        ByteBuffer byteBuffer = this.f0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // l.AbstractC0509
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo8() {
        this.f1.mo13561(this);
    }
}
