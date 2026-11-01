package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۚۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAGX */
/* JADX INFO: loaded from: classes2.dex */
public final class C5192 implements WritableByteChannel {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f18008 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3552 f18009;

    public C5192(C3552 c3552) {
        this.f18009 = c3552;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f18008.compareAndSet(false, true)) {
            this.f18009.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f18008.get();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        if (!byteBuffer.hasArray()) {
            throw new IOException("Direct buffer somehow written to BufferAtATimeOutputChannel");
        }
        try {
            int iPosition = byteBuffer.position();
            int iLimit = byteBuffer.limit() - iPosition;
            this.f18009.write(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iLimit);
            byteBuffer.position(byteBuffer.limit());
            return iLimit;
        } catch (IOException e) {
            try {
                close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }
}
