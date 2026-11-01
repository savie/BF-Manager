package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۖܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N8BL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2599 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C11773 f10187 = new C11773(new byte[0]);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile Exception f10190;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InputStream f10191;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Thread f10196;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f10193 = new LinkedBlockingQueue(3);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f10192 = new LinkedBlockingQueue(3);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f10189 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f10195 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C11773 f10188 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f10194 = 0;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C2599(InputStream inputStream) {
        this.f10191 = inputStream;
        for (int i = 0; i < 3; i++) {
            this.f10192.add(new C11773(new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT]));
        }
        Thread thread = new Thread(new RunnableC7979(4, this, inputStream));
        this.f10196 = thread;
        thread.setName("InputStream-Decompress-Thread");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8074(C2599 c2599, InputStream inputStream) {
        C11773 c11773 = f10187;
        while (!c2599.f10195.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    try {
                        C11773 c11774 = (C11773) c2599.f10192.poll(100L, TimeUnit.MILLISECONDS);
                        if (c11774 == null) {
                            if (c2599.f10195.get()) {
                                break;
                            }
                        } else {
                            int i = inputStream.read(c11774.f39517);
                            if (i == -1) {
                                c2599.f10192.put(c11774);
                                break;
                            }
                            c11774.f39518 = i;
                            boolean zOffer = false;
                            while (!zOffer && !c2599.f10195.get() && !Thread.currentThread().isInterrupted()) {
                                zOffer = c2599.f10193.offer(c11774, 100L, TimeUnit.MILLISECONDS);
                            }
                            if (!zOffer) {
                                c2599.f10192.put(c11774);
                                break;
                            }
                        }
                    } catch (Exception e) {
                        if (!c2599.f10195.get()) {
                            c2599.f10190 = e;
                        }
                        c2599.f10189.set(true);
                        c2599.f10193.put(c11773);
                        return;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            } catch (Throwable th) {
                c2599.f10189.set(true);
                try {
                    c2599.f10193.put(c11773);
                } catch (InterruptedException unused2) {
                }
                throw th;
            }
        }
        c2599.f10189.set(true);
        c2599.f10193.put(c11773);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f10195.get()) {
            throw new IOException("Stream closed");
        }
        m8073();
        C11773 c11773 = this.f10188;
        if ((c11773 == null || this.f10194 >= c11773.f39518) && !m8075()) {
            m8073();
            return -1;
        }
        byte[] bArr = this.f10188.f39517;
        int i = this.f10194;
        this.f10194 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f10195.get()) {
            throw new IOException("Stream closed");
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        m8073();
        C11773 c11773 = this.f10188;
        if ((c11773 == null || this.f10194 >= c11773.f39518) && !m8075()) {
            m8073();
            return -1;
        }
        int iMin = Math.min(this.f10188.f39518 - this.f10194, i2);
        System.arraycopy(this.f10188.f39517, this.f10194, bArr, i, iMin);
        this.f10194 += iMin;
        return iMin;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m8075() throws IOException {
        AtomicBoolean atomicBoolean;
        LinkedBlockingQueue linkedBlockingQueue = this.f10193;
        try {
            C11773 c11773 = this.f10188;
            C11773 c11774 = null;
            C11773 c11775 = f10187;
            if (c11773 != null && c11773 != c11775) {
                c11773.f39518 = 0;
                this.f10192.put(c11773);
                this.f10188 = null;
            }
            boolean zIsEmpty = linkedBlockingQueue.isEmpty();
            AtomicBoolean atomicBoolean2 = this.f10189;
            if (!zIsEmpty || !atomicBoolean2.get()) {
                while (true) {
                    atomicBoolean = this.f10195;
                    if (c11774 != null || atomicBoolean.get()) {
                        break;
                    }
                    c11774 = (C11773) linkedBlockingQueue.poll(100L, TimeUnit.MILLISECONDS);
                    if (c11774 != null || (!atomicBoolean2.get() && !atomicBoolean.get())) {
                    }
                }
                if (!atomicBoolean.get()) {
                    if (c11774 == c11775) {
                        this.f10188 = c11775;
                        return false;
                    }
                    this.f10188 = c11774;
                    this.f10194 = 0;
                    return true;
                }
            }
            return false;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while waiting for data", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8073() throws IOException {
        if (this.f10190 != null) {
            if (this.f10190 instanceof IOException) {
                throw ((IOException) this.f10190);
            }
            throw new IOException("Error in reader thread", this.f10190);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicBoolean atomicBoolean = this.f10189;
        Thread thread = this.f10196;
        if (this.f10195.compareAndSet(false, true)) {
            try {
                thread.interrupt();
                try {
                    thread.join(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f10191.close();
                this.f10193.clear();
                this.f10192.clear();
                this.f10188 = null;
                atomicBoolean.set(true);
            } catch (Throwable th) {
                atomicBoolean.set(true);
                throw th;
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f10195.get()) {
            throw new IOException("Stream closed");
        }
        C11773 c11773 = this.f10188;
        if (c11773 != null) {
            return c11773.f39518 - this.f10194;
        }
        return 0;
    }
}
