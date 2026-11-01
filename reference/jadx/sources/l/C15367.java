package l;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ܶܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6OT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15367 implements InterfaceC11133 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f50042;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11133 f50043;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f50044;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f50045 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f50046;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public IOException f50047;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f50048;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f50049;

    public C15367(InterfaceC11133 interfaceC11133) {
        this.f50043 = interfaceC11133;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36809(long j, byte[] bArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f50045;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m36806();
            if (this.f50046) {
                throw new IllegalStateException("Recovery append batch is already active");
            }
            this.f50046 = true;
            this.f50049 = bArr;
            this.f50048 = j;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36808() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f50045;
        reentrantReadWriteLock.writeLock().lock();
        try {
            try {
                m36805();
                this.f50049 = null;
                this.f50044 = 0;
                this.f50046 = false;
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                this.f50049 = null;
                this.f50044 = 0;
                this.f50046 = false;
                throw th;
            }
        } catch (Throwable th2) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m36806() throws IOException {
        if (this.f50042) {
            throw new IOException("Recovery file is closed");
        }
        if (this.f50047 != null) {
            throw new IOException("Buffered recovery append requires reopening", this.f50047);
        }
    }

    public final void flush() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f50045;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m36805();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m36805() throws IOException {
        m36806();
        int i = this.f50044;
        if (i == 0) {
            return;
        }
        try {
            this.f50043.mo17201(this.f50048, i, this.f50049);
            this.f50048 += (long) this.f50044;
            this.f50044 = 0;
        } catch (IOException e) {
            this.f50047 = e;
            throw e;
        }
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ۙ */
    public final void mo17201(long j, int i, byte[] bArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f50045;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m36806();
            int i2 = 0;
            m36807(j, bArr, 0, i);
            byte[] bArr2 = this.f50049;
            InterfaceC11133 interfaceC11133 = this.f50043;
            if (bArr2 == null) {
                interfaceC11133.mo17201(j, i, bArr);
            } else if (j != this.f50048 + ((long) this.f50044)) {
                m36805();
                interfaceC11133.mo17201(j, i, bArr);
                this.f50048 = interfaceC11133.length();
            } else {
                while (i > 0) {
                    int iMin = Math.min(i, this.f50049.length - this.f50044);
                    System.arraycopy(bArr, i2, this.f50049, this.f50044, iMin);
                    int i3 = this.f50044 + iMin;
                    this.f50044 = i3;
                    i2 += iMin;
                    i -= iMin;
                    if (i3 == this.f50049.length) {
                        m36805();
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
    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ۙ */
    public final void mo17202(long j, byte[] bArr, int i, int i2) {
        long j2;
        int i3;
        int i4 = i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f50045;
        reentrantReadWriteLock.readLock().lock();
        try {
            m36806();
            m36807(j, bArr, i, i2);
            int i5 = this.f50044;
            if (i5 != 0) {
                long j3 = this.f50048;
                if (j >= ((long) i5) + j3 || ((long) i4) + j <= j3) {
                    this.f50043.mo17202(j, bArr, i, i2);
                } else {
                    if (j < j3) {
                        int i6 = (int) (j3 - j);
                        this.f50043.mo17202(j, bArr, i, i6);
                        j2 = ((long) i6) + j;
                        i3 = i + i6;
                        i4 -= i6;
                    } else {
                        j2 = j;
                        i3 = i;
                    }
                    int iMin = (int) Math.min(i4, (this.f50048 + ((long) this.f50044)) - j2);
                    System.arraycopy(this.f50049, (int) (j2 - this.f50048), bArr, i3, iMin);
                    if (iMin < i4) {
                        this.f50043.mo17202(((long) iMin) + j2, bArr, i3 + iMin, i4 - iMin);
                    }
                }
            } else {
                this.f50043.mo17202(j, bArr, i, i2);
            }
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m36807(long j, byte[] bArr, int i, int i2) {
        if (j < 0 || j > C17492.FOREVER_NS - ((long) i2) || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException("Invalid recovery I/O range");
        }
    }

    @Override // l.InterfaceC11133
    public final long length() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f50045;
        reentrantReadWriteLock.readLock().lock();
        try {
            m36806();
            int i = this.f50044;
            InterfaceC11133 interfaceC11133 = this.f50043;
            return i == 0 ? interfaceC11133.length() : Math.max(interfaceC11133.length(), this.f50048 + ((long) this.f50044));
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0009, B:7:0x0013, B:10:0x001a, B:11:0x0020, B:13:0x0024, B:15:0x002a, B:16:0x0034, B:19:0x0049, B:20:0x0050, B:21:0x0051, B:22:0x0058), top: B:26:0x0009 }] */
    @Override // l.InterfaceC11133
    public final void truncate(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f50045;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (this.f50042) {
                throw new IOException("Recovery file is closed");
            }
            if (j < 0) {
                throw new IllegalArgumentException("Negative recovery length");
            }
            IOException iOException = this.f50047;
            InterfaceC11133 interfaceC11133 = this.f50043;
            if (iOException != null) {
                this.f50044 = 0;
                interfaceC11133.truncate(j);
            } else {
                int i = this.f50044;
                if (i != 0) {
                    long j2 = this.f50048;
                    if (j >= j2) {
                        this.f50044 = (int) Math.min(i, j - j2);
                    } else {
                        interfaceC11133.truncate(j);
                        this.f50044 = 0;
                        this.f50048 = Math.min(this.f50048, j);
                    }
                } else {
                    interfaceC11133.truncate(j);
                    this.f50044 = 0;
                    this.f50048 = Math.min(this.f50048, j);
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ܶ */
    public final void mo17203() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f50045;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m36805();
            this.f50043.mo17203();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // l.InterfaceC11133
    /* JADX INFO: renamed from: ᩳۙ */
    public final void mo17204() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f50045;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f50043.mo17204();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC11133 interfaceC11133 = this.f50043;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f50045;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!this.f50042) {
                try {
                    if (this.f50047 == null) {
                        m36805();
                    }
                    this.f50049 = null;
                    this.f50044 = 0;
                    this.f50046 = false;
                    this.f50042 = true;
                    interfaceC11133.close();
                } catch (Throwable th) {
                    this.f50049 = null;
                    this.f50044 = 0;
                    this.f50046 = false;
                    this.f50042 = true;
                    interfaceC11133.close();
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
