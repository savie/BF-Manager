package l;

import java.io.File;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ᩳܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C18101 implements InterfaceC15280, InterfaceC12832 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f57882;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f57883;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21629 f57884;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f57885 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f57886;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18101 m42157(File file, C22710 c22710, InterfaceC5614 interfaceC5614) {
        int i = c22710 == null ? 0 : c22710.f73964;
        if (i <= 0) {
            throw new IllegalArgumentException("Hex literal range is empty");
        }
        C18101 c18101M42156 = m42156(file, i, true, true);
        try {
            Iterator it = C7893.m20859(c22710).iterator();
            while (it.hasNext()) {
                c18101M42156.mo36593((C3658) it.next(), interfaceC5614);
            }
            c18101M42156.finish();
            return c18101M42156;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c18101M42156.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C18101(int i, C21629 c21629, boolean z) {
        if (c21629.length() != i) {
            throw new IllegalArgumentException("Hex clipboard allocation length mismatch");
        }
        this.f57886 = i;
        this.f57884 = c21629;
        if (z) {
            this.f57883 = new byte[Math.min(i, 1048576)];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18101 m42155(File file, int i) {
        if (i <= 65536) {
            throw new IllegalArgumentException("Hex clipboard file allocation is too small");
        }
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        return m42156(file, i, true, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18101 m42154(int i, long j, C1873 c1873) {
        synchronized (C2516.f9975) {
            if (C2516.f9973 != c1873) {
                return null;
            }
            C21629 c21629M6079 = c1873.m6079(i, j);
            if (c21629M6079 == null) {
                return null;
            }
            try {
                return new C18101(i, c21629M6079, true);
            } catch (Error | RuntimeException e) {
                try {
                    c21629M6079.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18101 m42158(File file, byte[] bArr, int i, int i2, InterfaceC5614 interfaceC5614) throws C1105 {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Hex literal file allocation is empty");
        }
        InterfaceC5614 interfaceC5614M29777 = C11965.m29777(interfaceC5614);
        if (interfaceC5614M29777.mo2357()) {
            throw new C1105();
        }
        int i3 = 0;
        C18101 c18101M42156 = m42156(file, i2, true, false);
        while (i3 < i2) {
            try {
                if (interfaceC5614M29777.mo2357()) {
                    throw new C1105();
                }
                int iMin = Math.min(1048576, i2 - i3);
                c18101M42156.f57884.m48344(i3, bArr, i + i3, iMin);
                i3 += iMin;
            } catch (IOException | Error | RuntimeException e) {
                try {
                    c18101M42156.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        }
        if (interfaceC5614M29777.mo2357()) {
            throw new C1105();
        }
        c18101M42156.f57882 = i2;
        return c18101M42156;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C18101 m42160(File file, int i) throws Throwable {
        if (i <= 65536) {
            throw new IllegalArgumentException("Hex clipboard file allocation is too small");
        }
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        C1873 c1873M6071 = C1873.m6071(file);
        C21629 c21629M6078 = null;
        try {
            synchronized (C2516.f9975) {
                c21629M6078 = c1873M6071.m6078(i);
            }
            return new C18101(i, c21629M6078, true);
        } catch (IOException | Error | RuntimeException e) {
            if (c21629M6078 != null) {
                try {
                    c21629M6078.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18101 m42153(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Hex clipboard allocation is empty");
        }
        return m42156((File) null, i, false, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18101 m42156(File file, int i, boolean z, boolean z2) {
        C21629 c21629M6078;
        AutoCloseable autoCloseable = null;
        try {
            synchronized (C2516.f9975) {
                if (C2516.f9973 == null) {
                    if (!z) {
                        throw new IOException("Hex clipboard shared arena is unavailable");
                    }
                    C2516.f9973 = C1873.m6071(file);
                }
                c21629M6078 = C2516.f9973.m6078(i);
            }
            return new C18101(i, c21629M6078, z2);
        } catch (IOException | Error | RuntimeException e) {
            if (0 != 0) {
                try {
                    autoCloseable.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
            }
            throw e;
        }
    }

    @Override // l.InterfaceC15280
    /* JADX INFO: renamed from: ۙ */
    public final int mo36593(C3658 c3658, InterfaceC5614 interfaceC5614) throws IOException {
        m42161();
        int i = this.f57882;
        int i2 = c3658.f13400;
        int i3 = c3658.f13400;
        if (((long) i) + ((long) i2) > this.f57886 || this.f57883 == null) {
            throw new IOException("Hex clipboard file backing overflow");
        }
        int i4 = 0;
        while (i4 < i3) {
            if (interfaceC5614.mo2357()) {
                throw new C1105();
            }
            int iMin = Math.min(this.f57883.length, i3 - i4);
            c3658.m10775(i4, this.f57883, 0, iMin);
            if (interfaceC5614.mo2357()) {
                throw new C1105();
            }
            this.f57884.m48344(this.f57882, this.f57883, 0, iMin);
            i4 += iMin;
            this.f57882 += iMin;
        }
        return i;
    }

    @Override // l.InterfaceC15280
    public final void finish() throws IOException {
        m42161();
        if (this.f57882 != this.f57886) {
            throw new IOException("Incomplete hex clipboard file backing");
        }
        this.f57883 = null;
    }

    @Override // l.InterfaceC18745
    public final int length() {
        return this.f57886;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۙ */
    public final void mo2299(int i, byte[] bArr, int i2, int i3) throws IOException {
        m42161();
        if (this.f57882 != this.f57886 || this.f57883 != null) {
            throw new IOException("Hex clipboard file backing is incomplete");
        }
        this.f57884.m48343(i, bArr, i2, i3);
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo2300() {
        return this.f57885.get() > 0 && this.f57884.isOpen();
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ֫ܰ */
    public final InterfaceC18745 mo2298() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.f57885;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
            long j = ((long) i) + ((long) 1);
            i2 = (int) j;
            if (j != i2) {
                throw new ArithmeticException();
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicInteger atomicInteger = this.f57885;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet == 0) {
            this.f57884.close();
        } else {
            if (iDecrementAndGet >= 0) {
                return;
            }
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex clipboard file source already closed");
        }
    }

    @Override // l.InterfaceC18039
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8032() {
        return this.f57884;
    }

    @Override // l.InterfaceC12832
    /* JADX INFO: renamed from: ۖ */
    public final long mo31830() {
        return this.f57886;
    }

    @Override // l.InterfaceC12832
    /* JADX INFO: renamed from: ۚ */
    public final long mo31831() {
        return this.f57886;
    }

    @Override // l.InterfaceC18039
    /* JADX INFO: renamed from: ۨ */
    public final long mo8035() {
        return this.f57884.length();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m42161() throws ClosedChannelException {
        if (this.f57885.get() <= 0 || !this.f57884.isOpen()) {
            throw new ClosedChannelException();
        }
    }
}
