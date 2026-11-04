package androidx.media3.decoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import l.AbstractC11655;
import l.InterfaceC1961;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends AbstractC11655 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ByteBuffer f0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1961 f1;

    public SimpleDecoderOutputBuffer(InterfaceC1961 interfaceC1961) {
        this.f1 = interfaceC1961;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m6(int i, long j) {
        this.f37777 = j;
        ByteBuffer byteBuffer = this.f0;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f0 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.f0.position(0);
        this.f0.limit(i);
        return this.f0;
    }

    @Override // l.AbstractC11655, l.AbstractC13587
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo7() {
        super.mo7();
        ByteBuffer byteBuffer = this.f0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // l.AbstractC11655
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo8() {
        this.f1.mo6746(this);
    }
}
