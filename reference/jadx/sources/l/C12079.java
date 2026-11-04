package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۨۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAGX */
/* JADX INFO: loaded from: classes3.dex */
public final class C12079 implements WritableByteChannel {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f38890 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11595 f38891;

    public C12079(C11595 c11595) {
        this.f38891 = c11595;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f38890.compareAndSet(false, true)) {
            this.f38891.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f38890.get();
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
            this.f38891.write(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iLimit);
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
