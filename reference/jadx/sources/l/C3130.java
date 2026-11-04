package l;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* JADX INFO: renamed from: l.ۗۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8EE */
/* JADX INFO: loaded from: classes3.dex */
public final class C3130 extends AbstractC15808 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final SeekableByteChannel f10139;

    public C3130(long j, long j2, C13961 c13961) {
        super(j, j2);
        this.f10139 = c13961;
    }

    @Override // l.AbstractC15808
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo10210(long j, ByteBuffer byteBuffer) {
        int i;
        synchronized (this.f10139) {
            this.f10139.position(j);
            i = this.f10139.read(byteBuffer);
        }
        byteBuffer.flip();
        return i;
    }
}
