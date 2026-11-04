package l;

import java.io.File;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۤܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C10938 implements InterfaceC4973, InterfaceC2670 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f34594 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public byte[] f34595;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22127 f34596;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f34597;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f34598;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10938 m27751(File file, C13856 c13856, InterfaceC7509 interfaceC7509) {
        int i = c13856 == null ? 0 : c13856.f43959;
        if (i <= 0) {
            throw new IllegalArgumentException("Hex literal range is empty");
        }
        C10938 c10938M27750 = m27750(file, i, true, true);
        try {
            Iterator it = C19606.m45239(c13856).iterator();
            while (it.hasNext()) {
                c10938M27750.mo15179((C8636) it.next(), interfaceC7509);
            }
            c10938M27750.finish();
            return c10938M27750;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c10938M27750.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C10938(int i, C22127 c22127, boolean z) {
        if (c22127.length() != i) {
            throw new IllegalArgumentException("Hex clipboard allocation length mismatch");
        }
        this.f34598 = i;
        this.f34596 = c22127;
        if (z) {
            this.f34595 = new byte[Math.min(i, 1048576)];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10938 m27749(File file, int i) throws IOException {
        if (i <= 65536) {
            throw new IllegalArgumentException("Hex clipboard file allocation is too small");
        }
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        return m27750(file, i, true, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10938 m27748(int i, long j, C4227 c4227) {
        synchronized (C19143.f61935) {
            if (C19143.f61937 != c4227) {
                return null;
            }
            C22127 c22127M13495 = c4227.m13495(i, j);
            if (c22127M13495 == null) {
                return null;
            }
            try {
                return new C10938(i, c22127M13495, true);
            } catch (Error | RuntimeException e) {
                try {
                    c22127M13495.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10938 m27752(File file, byte[] bArr, int i, int i2, InterfaceC7509 interfaceC7509) throws C9446 {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Hex literal file allocation is empty");
        }
        InterfaceC7509 interfaceC7509M41888 = C17950.m41888(interfaceC7509);
        if (interfaceC7509M41888.mo924()) {
            throw new C9446();
        }
        int i3 = 0;
        C10938 c10938M27750 = m27750(file, i2, true, false);
        while (i3 < i2) {
            try {
                if (interfaceC7509M41888.mo924()) {
                    throw new C9446();
                }
                int iMin = Math.min(1048576, i2 - i3);
                c10938M27750.f34596.m50089(i3, bArr, i + i3, iMin);
                i3 += iMin;
            } catch (IOException | Error | RuntimeException e) {
                try {
                    c10938M27750.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        }
        if (interfaceC7509M41888.mo924()) {
            throw new C9446();
        }
        c10938M27750.f34597 = i2;
        return c10938M27750;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10938 m27755(File file, int i) throws Throwable {
        if (i <= 65536) {
            throw new IllegalArgumentException("Hex clipboard file allocation is too small");
        }
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        C4227 c4227M13486 = C4227.m13486(file);
        C22127 c22127M13494 = null;
        try {
            synchronized (C19143.f61935) {
                c22127M13494 = c4227M13486.m13494(i);
            }
            return new C10938(i, c22127M13494, true);
        } catch (IOException | Error | RuntimeException e) {
            if (c22127M13494 != null) {
                try {
                    c22127M13494.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10938 m27747(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Hex clipboard allocation is empty");
        }
        return m27750((File) null, i, false, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10938 m27750(File file, int i, boolean z, boolean z2) {
        C22127 c22127M13494;
        AutoCloseable autoCloseable = null;
        try {
            synchronized (C19143.f61935) {
                if (C19143.f61937 == null) {
                    if (!z) {
                        throw new IOException("Hex clipboard shared arena is unavailable");
                    }
                    C19143.f61937 = C4227.m13486(file);
                }
                c22127M13494 = C19143.f61937.m13494(i);
            }
            return new C10938(i, c22127M13494, z2);
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

    @Override // l.InterfaceC4973
    /* JADX INFO: renamed from: ۙ */
    public final int mo15179(C8636 c8636, InterfaceC7509 interfaceC7509) throws IOException {
        m27754();
        int i = this.f34597;
        int i2 = c8636.f28219;
        int i3 = c8636.f28219;
        if (((long) i) + ((long) i2) > this.f34598 || this.f34595 == null) {
            throw new IOException("Hex clipboard file backing overflow");
        }
        int i4 = 0;
        while (i4 < i3) {
            if (interfaceC7509.mo924()) {
                throw new C9446();
            }
            int iMin = Math.min(this.f34595.length, i3 - i4);
            c8636.m23272(i4, this.f34595, 0, iMin);
            if (interfaceC7509.mo924()) {
                throw new C9446();
            }
            this.f34596.m50089(this.f34597, this.f34595, 0, iMin);
            i4 += iMin;
            this.f34597 += iMin;
        }
        return i;
    }

    @Override // l.InterfaceC4973
    public final void finish() throws IOException {
        m27754();
        if (this.f34597 != this.f34598) {
            throw new IOException("Incomplete hex clipboard file backing");
        }
        this.f34595 = null;
    }

    @Override // l.InterfaceC22808
    public final int length() {
        return this.f34598;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۙ */
    public final void mo2790(int i, byte[] bArr, int i2, int i3) throws IOException {
        m27754();
        if (this.f34597 != this.f34598 || this.f34595 != null) {
            throw new IOException("Hex clipboard file backing is incomplete");
        }
        this.f34596.m50088(i, bArr, i2, i3);
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo2792() {
        return this.f34594.get() > 0 && this.f34596.isOpen();
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۠᩷ */
    public final InterfaceC22808 mo2791() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.f34594;
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
        AtomicInteger atomicInteger = this.f34594;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet == 0) {
            this.f34596.close();
        } else {
            if (iDecrementAndGet >= 0) {
                return;
            }
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex clipboard file source already closed");
        }
    }

    @Override // l.InterfaceC10873
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2788() {
        return this.f34596;
    }

    @Override // l.InterfaceC2670
    /* JADX INFO: renamed from: ۤ */
    public final long mo8833() {
        return this.f34598;
    }

    @Override // l.InterfaceC2670
    /* JADX INFO: renamed from: ᩴ */
    public final long mo8834() {
        return this.f34598;
    }

    @Override // l.InterfaceC10873
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2796() {
        return this.f34596.length();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m27754() throws ClosedChannelException {
        if (this.f34594.get() <= 0 || !this.f34596.isOpen()) {
            throw new ClosedChannelException();
        }
    }
}
