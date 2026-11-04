package l;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۛܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C6465 implements InterfaceC22808, InterfaceC2670, InterfaceC9381 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f21750;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f21751;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f21752;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final long f21753;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f21754 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f21755;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f21756;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f21757;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f21758;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] f21759;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f21760;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13856 f21761;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3481 f21762;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808[] f21763;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ int m18281(C6465 c6465) {
        return c6465.f21760;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ int m18282(C6465 c6465) {
        return c6465.f21756;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C13856 m18283(C6465 c6465) {
        return c6465.f21761;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ byte[] m18284(C6465 c6465) {
        return c6465.f21759;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ int m18286(C6465 c6465) {
        return c6465.f21751;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C3481 m18289(C6465 c6465) {
        return c6465.f21762;
    }

    @Override // l.InterfaceC10873
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2788() {
        return this;
    }

    @Override // l.InterfaceC10873
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2796() {
        return mo8834();
    }

    public C6465(C13856 c13856, int i, int i2, int i3, byte[] bArr, C3481 c3481) {
        if (i < 0 || i2 <= 0 || i3 <= 0 || c3481.m11441() <= 0 || !c3481.m11439(i3)) {
            throw new IllegalArgumentException("Invalid replacement recipe");
        }
        long j = i3;
        long jM11440 = ((long) c3481.m11440(c3481.m11441() - 1)) + j;
        long j2 = i;
        long length = ((((long) bArr.length) - j) * c3481.m11441()) + j2;
        if (jM11440 > j2 || length != i2) {
            throw new IllegalArgumentException("Invalid replacement recipe mapping");
        }
        ArrayList arrayList = new ArrayList();
        C19143.m44347(c13856, arrayList);
        Iterator it = arrayList.iterator();
        int iMax = 1;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C6465) it.next()).f21750 + 1);
        }
        if (iMax > 256) {
            throw new IllegalStateException("Replacement recipe dependency is too deep");
        }
        this.f21761 = c13856;
        this.f21760 = i;
        this.f21751 = i2;
        this.f21756 = i3;
        this.f21759 = bArr;
        this.f21762 = c3481;
        this.f21755 = ((long) bArr.length) - j;
        this.f21750 = iMax;
        long jM10044 = C3077.m10044(bArr.length, C3077.m10044(c3481.m11436(), 88L));
        this.f21752 = jM10044;
        this.f21758 = C3077.m10044(jM10044, C3077.m10044(C19143.m44340(c13856), C3077.m10044(C19606.m45238(c13856), C3077.m10044(C19606.m45236(c13856), C19606.m45235(c13856)))));
        long jM10045 = C3077.m10044(jM10044, C3077.m10044(C19606.m45236(c13856), C3077.m10044(C19606.m45238(c13856), C19606.m45235(c13856))));
        this.f21757 = jM10045;
        this.f21753 = C3077.m10044(jM10045, C19606.m45237(c13856).m27162());
        this.f21763 = C19606.m45234(c13856);
    }

    @Override // l.InterfaceC9381
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18290(ArrayDeque arrayDeque) {
        for (InterfaceC22808 interfaceC22808 : this.f21763) {
            arrayDeque.push(interfaceC22808);
        }
    }

    @Override // l.InterfaceC22808
    public final int length() {
        return this.f21751;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo2792() {
        if (this.f21754.get() <= 0) {
            return false;
        }
        for (InterfaceC22808 interfaceC22808 : this.f21763) {
            if (!interfaceC22808.mo2792()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۠᩷ */
    public final InterfaceC22808 mo2791() throws IOException {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.f21754;
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
        AtomicInteger atomicInteger = this.f21754;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Replacement recipe closed twice");
        }
        if (iDecrementAndGet == 0) {
            C4908.m15061(this.f21763);
        }
    }

    @Override // l.InterfaceC2670
    /* JADX INFO: renamed from: ᩴ */
    public final long mo8834() {
        return this.f21753;
    }

    @Override // l.InterfaceC2670
    /* JADX INFO: renamed from: ۤ */
    public final long mo8833() {
        return this.f21757;
    }

    @Override // l.InterfaceC22808
    /* JADX INFO: renamed from: ۙ */
    public final void mo2790(int i, byte[] bArr, int i2, int i3) throws IOException {
        byte[] bArr2;
        long j;
        int i4 = i;
        AtomicInteger atomicInteger = this.f21754;
        String str = "Replacement recipe is closed";
        if (atomicInteger.get() <= 0) {
            throw new IOException("Replacement recipe is closed");
        }
        C13921.m33904(this.f21751, i4, i3);
        C13921.m33902(bArr.length, i2, i3);
        C3481 c3481 = this.f21762;
        long jM11441 = c3481.m11441();
        long j2 = 0;
        while (true) {
            bArr2 = this.f21759;
            j = this.f21755;
            if (j2 >= jM11441) {
                break;
            }
            long j3 = jM11441;
            long j4 = (j2 + jM11441) >>> 1;
            AtomicInteger atomicInteger2 = atomicInteger;
            if ((j * j4) + ((long) c3481.m11440(j4)) + ((long) bArr2.length) <= i4) {
                j2 = j4 + 1;
                jM11441 = j3;
            } else {
                jM11441 = j4;
            }
            atomicInteger = atomicInteger2;
        }
        AtomicInteger atomicInteger3 = atomicInteger;
        C23619 c23619M11437 = j2 < c3481.m11441() ? c3481.m11437(j2) : null;
        int i5 = i2;
        int i6 = i3;
        while (i6 > 0) {
            C13856 c13856 = this.f21761;
            if (c23619M11437 == null || !c23619M11437.m52863()) {
                long j5 = ((long) i4) - (j2 * j);
                int i7 = (int) j5;
                if (j5 != i7) {
                    throw new ArithmeticException();
                }
                C19606.m45244(i7, i5, i6, c13856, bArr);
                break;
            }
            long j6 = j2 * j;
            long jM52862 = ((long) c23619M11437.m52862()) + j6;
            long j7 = j;
            long length = ((long) bArr2.length) + jM52862;
            String str2 = str;
            long j8 = i4;
            if (j8 >= length) {
                j2++;
                c23619M11437.m52861();
            } else if (j8 >= jM52862) {
                int i8 = (int) (j8 - jM52862);
                int iMin = Math.min(i6, bArr2.length - i8);
                System.arraycopy(bArr2, i8, bArr, i5, iMin);
                i4 += iMin;
                i5 += iMin;
                i6 -= iMin;
                if (i4 == length) {
                    j2++;
                    c23619M11437.m52861();
                }
            } else {
                int iMin2 = (int) Math.min(i6, jM52862 - j8);
                if (iMin2 <= 0) {
                    throw new IOException("Invalid replacement recipe mapping");
                }
                long j9 = j8 - j6;
                int i9 = (int) j9;
                if (j9 != i9) {
                    throw new ArithmeticException();
                }
                C19606.m45244(i9, i5, iMin2, c13856, bArr);
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
