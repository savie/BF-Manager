package l;

import android.media.MediaDataSource;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.֫ۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 56K9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1640 extends MediaDataSource {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f5667;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f5668;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C5369 f5669;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f5670 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f5671 = new Object();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8351 f5672;

    public C1640(final AbstractC18881 abstractC18881, final InterfaceC2386 interfaceC2386, int i) {
        this.f5668 = (Math.max(0L, i) * 1000) + SystemClock.elapsedRealtime();
        this.f5672 = new C8351(new InterfaceC2385() { // from class: l.۫ۗ۫
            @Override // l.InterfaceC2385
            /* JADX INFO: renamed from: ۙ */
            public final InputStream mo8088(long j) {
                return C1640.m5806(this.f41071, abstractC18881, interfaceC2386, j);
            }
        }, interfaceC2386.getName(), interfaceC2386.getSize());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InputStream m5806(C1640 c1640, AbstractC18881 abstractC18881, InterfaceC2386 interfaceC2386, long j) throws IOException {
        c1640.m5807();
        if (c1640.f5667 >= 16777216) {
            throw new IOException("Audio thumbnail read limit exceeded");
        }
        if (!abstractC18881.mo35568()) {
            throw new IOException("Random access is unavailable");
        }
        c1640.m5807();
        C5369 c5369 = new C5369(c1640, abstractC18881.mo35570(j, interfaceC2386.getPath()));
        synchronized (c1640.f5671) {
            if (!c1640.f5670.get()) {
                c1640.f5669 = c5369;
            }
        }
        if (!c1640.f5670.get()) {
            return c5369;
        }
        c5369.m16036();
        throw new IOException("Audio thumbnail source is closed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m5807() throws IOException {
        if (this.f5670.get() || Thread.currentThread().isInterrupted() || SystemClock.elapsedRealtime() >= this.f5668) {
            throw new IOException("Audio thumbnail read canceled or timed out");
        }
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        m5807();
        return this.f5672.m22472(j, bArr, i, i2);
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f5672.m22473();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C5369 c5369;
        if (this.f5670.compareAndSet(false, true)) {
            synchronized (this.f5671) {
                c5369 = this.f5669;
                this.f5669 = null;
            }
            if (c5369 != null) {
                try {
                    c5369.m16036();
                } finally {
                    this.f5672.close();
                }
            }
        }
    }
}
