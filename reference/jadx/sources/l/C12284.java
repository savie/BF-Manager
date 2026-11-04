package l;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ۨۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R6OT */
/* JADX INFO: loaded from: classes4.dex */
public final class C12284 implements InterfaceC4565 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public IOException f39485;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f39486;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f39487 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4565 f39488;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f39489;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f39490;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f39491;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f39492;

    public C12284(InterfaceC4565 interfaceC4565) {
        this.f39488 = interfaceC4565;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30677(long j, byte[] bArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f39487;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m30675();
            if (this.f39489) {
                throw new IllegalStateException("Recovery append batch is already active");
            }
            this.f39489 = true;
            this.f39492 = bArr;
            this.f39491 = j;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30676() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f39487;
        reentrantReadWriteLock.writeLock().lock();
        try {
            try {
                m30673();
                this.f39492 = null;
                this.f39486 = 0;
                this.f39489 = false;
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                this.f39492 = null;
                this.f39486 = 0;
                this.f39489 = false;
                throw th;
            }
        } catch (Throwable th2) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m30675() throws IOException {
        if (this.f39490) {
            throw new IOException("Recovery file is closed");
        }
        if (this.f39485 != null) {
            throw new IOException("Buffered recovery append requires reopening", this.f39485);
        }
    }

    public final void flush() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f39487;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m30673();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m30673() throws IOException {
        m30675();
        int i = this.f39486;
        if (i == 0) {
            return;
        }
        try {
            this.f39488.mo14340(this.f39491, i, this.f39492);
            this.f39491 += (long) this.f39486;
            this.f39486 = 0;
        } catch (IOException e) {
            this.f39485 = e;
            throw e;
        }
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ۙ */
    public final void mo14340(long j, int i, byte[] bArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f39487;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m30675();
            int i2 = 0;
            m30674(j, bArr, 0, i);
            byte[] bArr2 = this.f39492;
            InterfaceC4565 interfaceC4565 = this.f39488;
            if (bArr2 == null) {
                interfaceC4565.mo14340(j, i, bArr);
            } else if (j != this.f39491 + ((long) this.f39486)) {
                m30673();
                interfaceC4565.mo14340(j, i, bArr);
                this.f39491 = interfaceC4565.length();
            } else {
                while (i > 0) {
                    int iMin = Math.min(i, this.f39492.length - this.f39486);
                    System.arraycopy(bArr, i2, this.f39492, this.f39486, iMin);
                    int i3 = this.f39486 + iMin;
                    this.f39486 = i3;
                    i2 += iMin;
                    i -= iMin;
                    if (i3 == this.f39492.length) {
                        m30673();
                    }
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001e, B:12:0x002a, B:14:0x0044, B:16:0x005f, B:17:0x006d), top: B:23:0x000c }] */
    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ۙ */
    public final void mo14341(long j, byte[] bArr, int i, int i2) {
        long j2;
        int i3;
        int i4 = i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f39487;
        reentrantReadWriteLock.readLock().lock();
        try {
            m30675();
            m30674(j, bArr, i, i2);
            int i5 = this.f39486;
            if (i5 != 0) {
                long j3 = this.f39491;
                if (j >= ((long) i5) + j3 || ((long) i4) + j <= j3) {
                    this.f39488.mo14341(j, bArr, i, i2);
                } else {
                    if (j < j3) {
                        int i6 = (int) (j3 - j);
                        this.f39488.mo14341(j, bArr, i, i6);
                        j2 = ((long) i6) + j;
                        i3 = i + i6;
                        i4 -= i6;
                    } else {
                        j2 = j;
                        i3 = i;
                    }
                    int iMin = (int) Math.min(i4, (this.f39491 + ((long) this.f39486)) - j2);
                    System.arraycopy(this.f39492, (int) (j2 - this.f39491), bArr, i3, iMin);
                    if (iMin < i4) {
                        this.f39488.mo14341(((long) iMin) + j2, bArr, i3 + iMin, i4 - iMin);
                    }
                }
            } else {
                this.f39488.mo14341(j, bArr, i, i2);
            }
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m30674(long j, byte[] bArr, int i, int i2) {
        if (j < 0 || j > C25227.FOREVER_NS - ((long) i2) || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException("Invalid recovery I/O range");
        }
    }

    @Override // l.InterfaceC4565
    public final long length() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f39487;
        reentrantReadWriteLock.readLock().lock();
        try {
            m30675();
            int i = this.f39486;
            InterfaceC4565 interfaceC4565 = this.f39488;
            return i == 0 ? interfaceC4565.length() : Math.max(interfaceC4565.length(), this.f39491 + ((long) this.f39486));
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0009, B:7:0x0013, B:10:0x001a, B:11:0x0020, B:13:0x0024, B:15:0x002a, B:16:0x0034, B:19:0x0049, B:20:0x0050, B:21:0x0051, B:22:0x0058), top: B:26:0x0009 }] */
    @Override // l.InterfaceC4565
    public final void truncate(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f39487;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (this.f39490) {
                throw new IOException("Recovery file is closed");
            }
            if (j < 0) {
                throw new IllegalArgumentException("Negative recovery length");
            }
            IOException iOException = this.f39485;
            InterfaceC4565 interfaceC4565 = this.f39488;
            if (iOException != null) {
                this.f39486 = 0;
                interfaceC4565.truncate(j);
            } else {
                int i = this.f39486;
                if (i != 0) {
                    long j2 = this.f39491;
                    if (j >= j2) {
                        this.f39486 = (int) Math.min(i, j - j2);
                    } else {
                        interfaceC4565.truncate(j);
                        this.f39486 = 0;
                        this.f39491 = Math.min(this.f39491, j);
                    }
                } else {
                    interfaceC4565.truncate(j);
                    this.f39486 = 0;
                    this.f39491 = Math.min(this.f39491, j);
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ܺ */
    public final void mo14343() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f39487;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m30673();
            this.f39488.mo14343();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // l.InterfaceC4565
    /* JADX INFO: renamed from: ܶۙ */
    public final void mo14342() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f39487;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f39488.mo14342();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC4565 interfaceC4565 = this.f39488;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f39487;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!this.f39490) {
                try {
                    if (this.f39485 == null) {
                        m30673();
                    }
                    this.f39492 = null;
                    this.f39486 = 0;
                    this.f39489 = false;
                    this.f39490 = true;
                    interfaceC4565.close();
                } catch (Throwable th) {
                    this.f39492 = null;
                    this.f39486 = 0;
                    this.f39489 = false;
                    this.f39490 = true;
                    interfaceC4565.close();
                    throw th;
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th2;
        }
    }
}
