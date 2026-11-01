package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N6KV */
/* JADX INFO: loaded from: classes2.dex */
public final class C1542 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AtomicReference f6258;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14244 f6259;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Consumer f6260;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f6261;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f6262;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f6263;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f6264;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C1542(InterfaceC14244 interfaceC14244, Consumer consumer) {
        this.f6263 = new Object();
        this.f6258 = new AtomicReference();
        this.f6261 = new AtomicBoolean();
        this.f6259 = interfaceC14244;
        this.f6262 = true;
        this.f6260 = consumer;
    }

    public C1542(InputStream inputStream, Consumer consumer) {
        this.f6263 = new Object();
        AtomicReference atomicReference = new AtomicReference();
        this.f6258 = atomicReference;
        this.f6261 = new AtomicBoolean();
        this.f6259 = null;
        this.f6262 = false;
        this.f6260 = consumer;
        atomicReference.set(inputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InputStream m5318() {
        InputStream inputStreamMo34378;
        synchronized (this.f6263) {
            if (this.f6261.get()) {
                throw new IOException("HTML preview stream is closed");
            }
            inputStreamMo34378 = (InputStream) this.f6258.get();
            if (inputStreamMo34378 == null) {
                inputStreamMo34378 = this.f6259.mo34378();
                if (inputStreamMo34378 == null) {
                    throw new IOException("HTML preview source was not opened");
                }
                this.f6258.set(inputStreamMo34378);
                if (this.f6261.get()) {
                    InputStream inputStream = (InputStream) this.f6258.getAndSet(null);
                    if (inputStream != null) {
                        RunnableC3787 runnableC3787 = new RunnableC3787(4, inputStream);
                        if (this.f6262) {
                            C4716.f16635.execute(runnableC3787);
                        } else {
                            runnableC3787.run();
                        }
                    }
                    throw new IOException("HTML preview stream is closed");
                }
            }
        }
        return inputStreamMo34378;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f6264) {
            return -1;
        }
        try {
            int i = m5318().read();
            if (i == -1) {
                this.f6264 = true;
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
        if (this.f6264) {
            return -1;
        }
        try {
            int i3 = m5318().read(bArr, i, i2);
            if (i3 == -1) {
                this.f6264 = true;
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
        if (this.f6264 || this.f6261.get()) {
            return 0;
        }
        try {
            InputStream inputStream = (InputStream) this.f6258.get();
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
        if (j <= 0 || this.f6264) {
            return 0L;
        }
        try {
            return m5318().skip(j);
        } catch (IOException | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6261.compareAndSet(false, true)) {
            this.f6260.accept(this);
            InputStream inputStream = (InputStream) this.f6258.getAndSet(null);
            if (inputStream == null) {
                return;
            }
            RunnableC3787 runnableC3787 = new RunnableC3787(4, inputStream);
            if (this.f6262) {
                C4716.f16635.execute(runnableC3787);
            } else {
                runnableC3787.run();
            }
        }
    }
}
