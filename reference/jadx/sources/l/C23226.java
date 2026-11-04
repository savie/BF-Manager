package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6KV */
/* JADX INFO: loaded from: classes.dex */
public final class C23226 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f75241;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Consumer f75242;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15766 f75243;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f75244;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f75245;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f75246;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f75247;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C23226(InterfaceC15766 interfaceC15766, Consumer consumer) {
        this.f75246 = new Object();
        this.f75245 = new AtomicReference();
        this.f75244 = new AtomicBoolean();
        this.f75243 = interfaceC15766;
        this.f75241 = true;
        this.f75242 = consumer;
    }

    public C23226(InputStream inputStream, Consumer consumer) {
        this.f75246 = new Object();
        AtomicReference atomicReference = new AtomicReference();
        this.f75245 = atomicReference;
        this.f75244 = new AtomicBoolean();
        this.f75243 = null;
        this.f75241 = false;
        this.f75242 = consumer;
        atomicReference.set(inputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InputStream m52142() {
        InputStream inputStreamMo25529;
        synchronized (this.f75246) {
            if (this.f75244.get()) {
                throw new IOException("HTML preview stream is closed");
            }
            inputStreamMo25529 = (InputStream) this.f75245.get();
            if (inputStreamMo25529 == null) {
                inputStreamMo25529 = this.f75243.mo25529();
                if (inputStreamMo25529 == null) {
                    throw new IOException("HTML preview source was not opened");
                }
                this.f75245.set(inputStreamMo25529);
                if (this.f75244.get()) {
                    InputStream inputStream = (InputStream) this.f75245.getAndSet(null);
                    if (inputStream != null) {
                        RunnableC6915 runnableC6915 = new RunnableC6915(1, inputStream);
                        if (this.f75241) {
                            C5261.f18538.execute(runnableC6915);
                        } else {
                            runnableC6915.run();
                        }
                    }
                    throw new IOException("HTML preview stream is closed");
                }
            }
        }
        return inputStreamMo25529;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f75247) {
            return -1;
        }
        try {
            int i = m52142().read();
            if (i == -1) {
                this.f75247 = true;
                close();
            }
            return i;
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f75247) {
            return -1;
        }
        try {
            int i3 = m52142().read(bArr, i, i2);
            if (i3 == -1) {
                this.f75247 = true;
                close();
            }
            return i3;
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.f75247 || this.f75244.get()) {
            return 0;
        }
        try {
            InputStream inputStream = (InputStream) this.f75245.get();
            if (inputStream == null) {
                return 0;
            }
            return inputStream.available();
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0 || this.f75247) {
            return 0L;
        }
        try {
            return m52142().skip(j);
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f75244.compareAndSet(false, true)) {
            this.f75242.accept(this);
            InputStream inputStream = (InputStream) this.f75245.getAndSet(null);
            if (inputStream == null) {
                return;
            }
            RunnableC6915 runnableC6915 = new RunnableC6915(1, inputStream);
            if (this.f75241) {
                C5261.f18538.execute(runnableC6915);
            } else {
                runnableC6915.run();
            }
        }
    }
}
