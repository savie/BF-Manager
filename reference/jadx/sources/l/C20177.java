package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ᩴ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8BL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20177 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C23161 f64799 = new C23161(new byte[0]);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile Exception f64801;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InputStream f64802;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Thread f64803;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f64800 = new LinkedBlockingQueue(3);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f64805 = new LinkedBlockingQueue(3);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f64804 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f64808 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23161 f64806 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f64807 = 0;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C20177(InputStream inputStream) {
        this.f64802 = inputStream;
        for (int i = 0; i < 3; i++) {
            this.f64805.add(new C23161(new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT]));
        }
        Thread thread = new Thread(new RunnableC11226(0, this, inputStream));
        this.f64803 = thread;
        thread.setName("InputStream-Decompress-Thread");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46424(C20177 c20177, InputStream inputStream) {
        C23161 c23161 = f64799;
        while (!c20177.f64808.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    try {
                        C23161 c23162 = (C23161) c20177.f64805.poll(100L, TimeUnit.MILLISECONDS);
                        if (c23162 == null) {
                            if (c20177.f64808.get()) {
                                break;
                            }
                        } else {
                            int i = inputStream.read(c23162.f75075);
                            if (i == -1) {
                                c20177.f64805.put(c23162);
                                break;
                            }
                            c23162.f75076 = i;
                            boolean zOffer = false;
                            while (!zOffer && !c20177.f64808.get() && !Thread.currentThread().isInterrupted()) {
                                zOffer = c20177.f64800.offer(c23162, 100L, TimeUnit.MILLISECONDS);
                            }
                            if (!zOffer) {
                                c20177.f64805.put(c23162);
                                break;
                            }
                        }
                    } catch (Exception e) {
                        if (!c20177.f64808.get()) {
                            c20177.f64801 = e;
                        }
                        c20177.f64804.set(true);
                        c20177.f64800.put(c23161);
                        return;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            } catch (Throwable th) {
                c20177.f64804.set(true);
                try {
                    c20177.f64800.put(c23161);
                } catch (InterruptedException unused2) {
                }
                throw th;
            }
        }
        c20177.f64804.set(true);
        c20177.f64800.put(c23161);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f64808.get()) {
            throw new IOException("Stream closed");
        }
        m46423();
        C23161 c23161 = this.f64806;
        if ((c23161 == null || this.f64807 >= c23161.f75076) && !m46425()) {
            m46423();
            return -1;
        }
        byte[] bArr = this.f64806.f75075;
        int i = this.f64807;
        this.f64807 = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f64808.get()) {
            throw new IOException("Stream closed");
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        m46423();
        C23161 c23161 = this.f64806;
        if ((c23161 == null || this.f64807 >= c23161.f75076) && !m46425()) {
            m46423();
            return -1;
        }
        int iMin = Math.min(this.f64806.f75076 - this.f64807, i2);
        System.arraycopy(this.f64806.f75075, this.f64807, bArr, i, iMin);
        this.f64807 += iMin;
        return iMin;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m46425() throws IOException {
        AtomicBoolean atomicBoolean;
        LinkedBlockingQueue linkedBlockingQueue = this.f64800;
        try {
            C23161 c23161 = this.f64806;
            C23161 c23162 = null;
            C23161 c23163 = f64799;
            if (c23161 != null && c23161 != c23163) {
                c23161.f75076 = 0;
                this.f64805.put(c23161);
                this.f64806 = null;
            }
            boolean zIsEmpty = linkedBlockingQueue.isEmpty();
            AtomicBoolean atomicBoolean2 = this.f64804;
            if (!zIsEmpty || !atomicBoolean2.get()) {
                while (true) {
                    atomicBoolean = this.f64808;
                    if (c23162 != null || atomicBoolean.get()) {
                        break;
                    }
                    c23162 = (C23161) linkedBlockingQueue.poll(100L, TimeUnit.MILLISECONDS);
                    if (c23162 != null || (!atomicBoolean2.get() && !atomicBoolean.get())) {
                    }
                }
                if (!atomicBoolean.get()) {
                    if (c23162 == c23163) {
                        this.f64806 = c23163;
                        return false;
                    }
                    this.f64806 = c23162;
                    this.f64807 = 0;
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
    private void m46423() throws IOException {
        if (this.f64801 != null) {
            if (this.f64801 instanceof IOException) {
                IOException iOException = (IOException) this.f64801;
                C22327.m50389(iOException);
                throw iOException;
            }
            throw new IOException("Error in reader thread", this.f64801);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicBoolean atomicBoolean = this.f64804;
        Thread thread = this.f64803;
        if (this.f64808.compareAndSet(false, true)) {
            try {
                thread.interrupt();
                try {
                    thread.join(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f64802.close();
                this.f64800.clear();
                this.f64805.clear();
                this.f64806 = null;
                atomicBoolean.set(true);
            } catch (Throwable th) {
                atomicBoolean.set(true);
                throw th;
            }
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f64808.get()) {
            throw new IOException("Stream closed");
        }
        C23161 c23161 = this.f64806;
        if (c23161 != null) {
            return c23161.f75076 - this.f64807;
        }
        return 0;
    }
}
