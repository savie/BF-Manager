package l;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩻ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes.dex */
public final class C23747 implements InterfaceC18745, InterfaceC12832, InterfaceC0836 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C22710 f76821;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f76822;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f76823;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final long f76824;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f76825;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f76826 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f76827;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f76828;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f76829;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f76830;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f76831;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17396 f76832;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC18745[] f76833;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f76834;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C17396 m52286(C23747 c23747) {
        return c23747.f76832;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ int m52288(C23747 c23747) {
        return c23747.f76830;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ byte[] m52290(C23747 c23747) {
        return c23747.f76823;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C22710 m52291(C23747 c23747) {
        return c23747.f76821;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ int m52292(C23747 c23747) {
        return c23747.f76822;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ int m52294(C23747 c23747) {
        return c23747.f76827;
    }

    @Override // l.InterfaceC18039
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8032() {
        return this;
    }

    @Override // l.InterfaceC18039
    /* JADX INFO: renamed from: ۨ */
    public final long mo8035() {
        return mo31831();
    }

    public C23747(C22710 c22710, int i, int i2, int i3, byte[] bArr, C17396 c17396) {
        if (i < 0 || i2 <= 0 || i3 <= 0 || c17396.m40519() <= 0 || !c17396.m40517(i3)) {
            throw new IllegalArgumentException("Invalid replacement recipe");
        }
        long j = i3;
        long jM40518 = ((long) c17396.m40518(c17396.m40519() - 1)) + j;
        long j2 = i;
        long length = ((((long) bArr.length) - j) * c17396.m40519()) + j2;
        if (jM40518 > j2 || length != i2) {
            throw new IllegalArgumentException("Invalid replacement recipe mapping");
        }
        ArrayList arrayList = new ArrayList();
        C2516.m7778(c22710, arrayList);
        Iterator it = arrayList.iterator();
        int iMax = 1;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C23747) it.next()).f76831 + 1);
        }
        if (iMax > 256) {
            throw new IllegalStateException("Replacement recipe dependency is too deep");
        }
        this.f76821 = c22710;
        this.f76830 = i;
        this.f76827 = i2;
        this.f76822 = i3;
        this.f76823 = bArr;
        this.f76832 = c17396;
        this.f76828 = ((long) bArr.length) - j;
        this.f76831 = iMax;
        long jM6676 = C2124.m6676(bArr.length, C2124.m6676(c17396.m40514(), 88L));
        this.f76829 = jM6676;
        this.f76825 = C2124.m6676(jM6676, C2124.m6676(C2516.m7772(c22710), C2124.m6676(C7893.m20875(c22710), C2124.m6676(C7893.m20876(c22710), C7893.m20827(c22710)))));
        long jM6677 = C2124.m6676(jM6676, C2124.m6676(C7893.m20876(c22710), C2124.m6676(C7893.m20875(c22710), C7893.m20827(c22710))));
        this.f76834 = jM6677;
        this.f76824 = C2124.m6676(jM6677, C7893.m20874(c22710).m41337());
        this.f76833 = C7893.m20861(c22710);
    }

    @Override // l.InterfaceC0836
    /* JADX INFO: renamed from: ۙ */
    public final void mo3441(ArrayDeque arrayDeque) {
        for (InterfaceC18745 interfaceC18745 : this.f76833) {
            arrayDeque.push(interfaceC18745);
        }
    }

    @Override // l.InterfaceC18745
    public final int length() {
        return this.f76827;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo2300() {
        if (this.f76826.get() <= 0) {
            return false;
        }
        for (InterfaceC18745 interfaceC18745 : this.f76833) {
            if (!interfaceC18745.mo2300()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ֫ܰ */
    public final InterfaceC18745 mo2298() throws IOException {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.f76826;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new IOException("Replacement recipe is closed");
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
        AtomicInteger atomicInteger = this.f76826;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Replacement recipe closed twice");
        }
        if (iDecrementAndGet == 0) {
            C15218.m36423(this.f76833);
        }
    }

    @Override // l.InterfaceC12832
    /* JADX INFO: renamed from: ۚ */
    public final long mo31831() {
        return this.f76824;
    }

    @Override // l.InterfaceC12832
    /* JADX INFO: renamed from: ۖ */
    public final long mo31830() {
        return this.f76834;
    }

    @Override // l.InterfaceC18745
    /* JADX INFO: renamed from: ۙ */
    public final void mo2299(int i, byte[] bArr, int i2, int i3) throws IOException {
        byte[] bArr2;
        long j;
        int i4 = i;
        AtomicInteger atomicInteger = this.f76826;
        String str = "Replacement recipe is closed";
        if (atomicInteger.get() <= 0) {
            throw new IOException("Replacement recipe is closed");
        }
        C22979.m50823(this.f76827, i4, i3);
        C22979.m50824(bArr.length, i2, i3);
        C17396 c17396 = this.f76832;
        long jM40519 = c17396.m40519();
        long j2 = 0;
        while (true) {
            bArr2 = this.f76823;
            j = this.f76828;
            if (j2 >= jM40519) {
                break;
            }
            long j3 = jM40519;
            long j4 = (j2 + jM40519) >>> 1;
            AtomicInteger atomicInteger2 = atomicInteger;
            if ((j * j4) + ((long) c17396.m40518(j4)) + ((long) bArr2.length) <= i4) {
                j2 = j4 + 1;
                jM40519 = j3;
            } else {
                jM40519 = j4;
            }
            atomicInteger = atomicInteger2;
        }
        AtomicInteger atomicInteger3 = atomicInteger;
        C12458 c12458M40515 = j2 < c17396.m40519() ? c17396.m40515(j2) : null;
        int i5 = i2;
        int i6 = i3;
        while (i6 > 0) {
            C22710 c22710 = this.f76821;
            if (c12458M40515 == null || !c12458M40515.m30938()) {
                long j5 = ((long) i4) - (j2 * j);
                int i7 = (int) j5;
                if (j5 != i7) {
                    throw new ArithmeticException();
                }
                C7893.m20871(i7, i5, i6, c22710, bArr);
                break;
            }
            long j6 = j2 * j;
            long jM30937 = ((long) c12458M40515.m30937()) + j6;
            long j7 = j;
            long length = ((long) bArr2.length) + jM30937;
            String str2 = str;
            long j8 = i4;
            if (j8 >= length) {
                j2++;
                c12458M40515.m30936();
            } else if (j8 >= jM30937) {
                int i8 = (int) (j8 - jM30937);
                int iMin = Math.min(i6, bArr2.length - i8);
                System.arraycopy(bArr2, i8, bArr, i5, iMin);
                i4 += iMin;
                i5 += iMin;
                i6 -= iMin;
                if (i4 == length) {
                    j2++;
                    c12458M40515.m30936();
                }
            } else {
                int iMin2 = (int) Math.min(i6, jM30937 - j8);
                if (iMin2 <= 0) {
                    throw new IOException("Invalid replacement recipe mapping");
                }
                long j9 = j8 - j6;
                int i9 = (int) j9;
                if (j9 != i9) {
                    throw new ArithmeticException();
                }
                C7893.m20871(i9, i5, iMin2, c22710, bArr);
                i4 += iMin2;
                i5 += iMin2;
                i6 -= iMin2;
            }
            j = j7;
            str = str2;
        }
        if (atomicInteger3.get() <= 0) {
            throw new IOException(str);
        }
    }
}
