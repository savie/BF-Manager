package l;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* JADX INFO: renamed from: l.ۨۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C8EE */
/* JADX INFO: loaded from: classes4.dex */
public final class C11543 extends AbstractC4486 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SeekableByteChannel f38787;

    public C11543(long j, long j2, C1388 c1388) {
        super(j, j2);
        this.f38787 = c1388;
    }

    @Override // l.AbstractC4486
    /* JADX INFO: renamed from: ۙ */
    public final int mo12514(long j, ByteBuffer byteBuffer) {
        int i;
        synchronized (this.f38787) {
            this.f38787.position(j);
            i = this.f38787.read(byteBuffer);
        }
        byteBuffer.flip();
        return i;
    }
}
