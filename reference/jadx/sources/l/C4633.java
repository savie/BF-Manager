package l;

import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۙۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C4633 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f16365;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f16366;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f16367;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1604 f16368;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f16369;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f16370;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13807 f16371;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f16372;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f16373;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16374 = -1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f16375 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6107 f16376;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f16377;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f16378;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6045 f16379;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f16380;

    public C4633(C13807 c13807, int i, byte[] bArr) {
        this.f16371 = c13807;
        this.f16370 = i;
        this.f16377 = bArr;
        boolean z = i == bArr.length;
        this.f16372 = z;
        this.f16378 = c13807.f45561.m9777();
        if (z) {
            if (bArr.length == 0) {
                throw new IllegalArgumentException("Pattern replacement must not be empty");
            }
            this.f16379 = new C6045(bArr);
            this.f16369 = new int[256];
            this.f16368 = null;
            this.f16376 = null;
        } else {
            this.f16379 = null;
            this.f16369 = null;
            this.f16368 = new C1604(c13807.f45561.f12181);
            this.f16376 = new C6107();
            m12796(c13807.f45561.m9777());
        }
        if (z) {
            return;
        }
        C5838 c5838 = c13807.f45561.f12181;
        int i2 = C2516.f9974;
        m12792(c5838 == null ? 0L : c5838.f19805, c13807.f45561.m9777());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12798(int i, int[] iArr) {
        int i2;
        C13638.requireNonNull(iArr, "originalOffsets");
        int i3 = 0;
        C22979.m50824(iArr.length, 0, i);
        synchronized (this.f16371.f45564) {
            try {
                try {
                    C13807 c13807 = this.f16371;
                    c13807.m33601();
                    if (!this.f16373 && c13807.f45574 == this) {
                        if (this.f16372) {
                            while (i3 < i) {
                                m12794(iArr[i3]);
                                i3++;
                            }
                        } else {
                            while (i3 < i) {
                                int i4 = iArr[i3];
                                int i5 = 1;
                                while (true) {
                                    i2 = i3 + i5;
                                    if (i2 >= i || ((long) iArr[i2 - 1]) + ((long) this.f16370) != iArr[i2]) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                                m12795(i4, i5);
                                i3 = i2;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Batch replacement is not active");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Error | RuntimeException e) {
                if (!this.f16371.f45569) {
                    this.f16371.m33564();
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12799(InterfaceC5614 interfaceC5614) {
        C22710 c22710 = null;
        InterfaceC5614 interfaceC5614M29777 = interfaceC5614 == null ? null : C11965.m29777(interfaceC5614);
        synchronized (this.f16371.f45564) {
            try {
                try {
                    C13807 c13807 = this.f16371;
                    c13807.m33601();
                    if (!this.f16373 && c13807.f45574 == this) {
                        if (interfaceC5614M29777 != null) {
                            C13807.m33567(this.f16371, interfaceC5614M29777);
                        }
                        if (this.f16367 != 0) {
                            if (this.f16372) {
                                m12793();
                            } else {
                                int i = this.f16380;
                                if (i != 0) {
                                    this.f16368.m5459(i);
                                    this.f16380 = 0;
                                }
                                this.f16368.m5460(this.f16371.f45561.m9777(), interfaceC5614M29777);
                                if (C2516.m7781(m12792(this.f16368.m5464(), this.f16378))) {
                                    C5838 c5838M5458 = this.f16368.m5458();
                                    if (this.f16378 != 0) {
                                        C17396 c17396M16606 = this.f16376.m16606(interfaceC5614M29777);
                                        if (C2516.m7781(C2124.m6676(this.f16368.m5464(), C2124.m6676(C2124.m6676(C2124.m6676(this.f16377.length, C2124.m6676(c17396M16606.m40514(), 88L)), C2124.m6676(this.f16371.f45570, C2124.m6676(C7893.m20875(this.f16371.f45561.f12185), C2124.m6676(C7893.m20876(this.f16371.f45561.f12185), C7893.m20827(this.f16371.f45561.f12185))))), C7893.m20835(1L))))) {
                                            C23747 c23747 = new C23747(this.f16371.f45561.f12185, this.f16371.f45561.m9777(), (int) this.f16378, this.f16370, this.f16377, c17396M16606);
                                            this.f16371.m33589(new InterfaceC18745[]{c23747});
                                            C22710 c22710M20845 = C7893.m20845(c23747);
                                            this.f16371.f45570 = c23747.f76825;
                                            this.f16371.f45576 = c23747.mo31831();
                                            c22710 = c22710M20845;
                                        } else {
                                            throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                                        }
                                    }
                                    long j = c22710 == null ? 0 : c22710.f73964;
                                    long j2 = this.f16378;
                                    if (j == j2) {
                                        if ((c5838M5458 == null ? 0 : c5838M5458.f19808) == j2) {
                                            this.f16371.f45566 = c22710;
                                            this.f16371.f45571 = c5838M5458;
                                            C17770 c17770M20874 = C7893.m20874(c22710);
                                            this.f16371.f45575 = c17770M20874.m41336();
                                            this.f16371.f45579 = c17770M20874.m41337();
                                            if (this.f16371.f45575 > X931RNG.BLOCK128_RESEED_MAX) {
                                                throw new IllegalStateException("Literal heap storage exceeds memory limit");
                                            }
                                            this.f16371.f45565 = 0L;
                                            C13807.m33555(this.f16371);
                                        }
                                    }
                                    throw new IllegalStateException("Batch replacement length mismatch");
                                }
                                throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                            }
                            if (interfaceC5614M29777 != null) {
                                C13807.m33567(this.f16371, interfaceC5614M29777);
                            }
                            this.f16371.f45562 = true;
                            this.f16371.f45568 = true;
                        }
                        this.f16373 = true;
                        this.f16371.f45574 = null;
                    } else {
                        throw new IllegalStateException("Batch replacement is not active");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                if (!this.f16371.f45569) {
                    this.f16371.m33564();
                    throw e;
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12793() {
        if (this.f16366 == 0) {
            return;
        }
        C13807 c13807 = this.f16371;
        C22710 c22710 = c13807.f45566;
        int[] iArr = this.f16369;
        int i = this.f16366;
        int i2 = this.f16370;
        long jM20839 = C7893.m20839(c22710, iArr, i, i2);
        long jM6676 = C2124.m6676(C2124.m6676(C2124.m6676(C2124.m6676(C7893.m20876(c13807.f45566), C2124.m6676(c13807.f45565, c13807.f45570)), C7893.m20875(c13807.f45566)), C9367.m24045(c13807.f45571)), C2124.m6676(jM20839 * 960, C2124.m6676(C2516.m7720(c13807.f45561.m9777(), this.f16366, i2, this.f16369), C2516.m7771(c13807.f45561.m9777(), this.f16366, i2, this.f16369))));
        boolean z = this.f16365;
        C6045 c6045 = this.f16379;
        if (!z) {
            jM6676 = C2124.m6676(jM6676, c6045.m16446());
        }
        if (!C2516.m7781(jM6676)) {
            throw new IllegalStateException("Edit metadata exceeds memory limit");
        }
        c13807.f45566 = C7893.m20851(c13807.f45566, this.f16369, this.f16366, i2, c6045);
        if (!this.f16365) {
            c13807.f45565 = C2124.m6676(c13807.f45565, c6045.m16446());
            this.f16365 = true;
        }
        c13807.f45571 = C9367.m24026(c13807.f45571, this.f16369, this.f16366, i2);
        C13807.m33555(c13807);
        this.f16366 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12794(int i) {
        if (!this.f16372) {
            m12795(i, 1);
            return;
        }
        int i2 = this.f16370;
        long j = ((long) i) + ((long) i2);
        if (i < 0 || i < this.f16375 || j > this.f16371.f45561.m9777()) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "Invalid batch match offset "));
        }
        long length = (this.f16378 + ((long) this.f16377.length)) - ((long) i2);
        if (length > 2147483647L) {
            throw new C3015();
        }
        int i3 = i >>> 16;
        if (this.f16366 != 0 && i3 != this.f16374) {
            m12793();
        }
        this.f16374 = i3;
        int i4 = this.f16366 + 1;
        int[] iArr = this.f16369;
        if (i4 > iArr.length) {
            this.f16369 = Arrays.copyOf(this.f16369, Math.min(65536, Math.max(i4, iArr.length << 1)));
        }
        int[] iArr2 = this.f16369;
        int i5 = this.f16366;
        this.f16366 = i5 + 1;
        iArr2[i5] = i;
        this.f16378 = length;
        this.f16375 = (int) j;
        this.f16367++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12795(int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Empty replacement run");
        }
        int i3 = this.f16370;
        long j = i2;
        long j2 = ((long) i3) * j;
        long j3 = ((long) i) + j2;
        if (i < 0 || i < this.f16375 || j3 > this.f16371.f45561.m9777()) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "Invalid batch match run "));
        }
        long length = ((long) this.f16377.length) * j;
        long j4 = (this.f16378 + length) - j2;
        if (j4 > 2147483647L) {
            throw new C3015();
        }
        this.f16376.m16607(i, i3, i2);
        m12796(j4);
        C1604 c1604 = this.f16368;
        if (c1604.m5462() < i) {
            int i4 = this.f16380;
            if (i4 != 0) {
                c1604.m5459(i4);
                this.f16380 = 0;
            }
            c1604.m5465(i);
        }
        c1604.m5463((int) j2);
        long j5 = ((long) this.f16380) + ((long) ((int) length));
        int i5 = (int) j5;
        if (j5 != i5) {
            throw new ArithmeticException();
        }
        this.f16380 = i5;
        if (!C2516.m7781(m12792(c1604.m5464(), j4))) {
            throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
        }
        this.f16378 = j4;
        this.f16375 = (int) j3;
        this.f16367 += j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m12792(long j, long j2) {
        C13807 c13807 = this.f16371;
        return C2124.m6676(C2124.m6676(C2124.m6676(C2124.m6676(C2124.m6676(C2124.m6676(C2124.m6676(c13807.f45570, C2124.m6676(this.f16377.length, 88L)), this.f16376.m16605()), C7893.m20875(c13807.f45561.f12185)), C7893.m20876(c13807.f45561.f12185)), C7893.m20827(c13807.f45561.f12185)), j), C9367.m24017(j2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12796(long j) {
        C1604 c1604 = this.f16368;
        if (c1604 == null) {
            return;
        }
        C13807 c13807 = this.f16371;
        c1604.m5461(Math.max(0L, 67108864 - C2124.m6676(C2124.m6676(C2124.m6676(c13807.f45570, C2124.m6676(C2124.m6676(this.f16377.length, 88L), C2124.m6676(this.f16376.m16605(), C2124.m6676(C7893.m20875(c13807.f45561.f12185), C2124.m6676(C7893.m20876(c13807.f45561.f12185), C7893.m20827(c13807.f45561.f12185)))))), C9367.m24017(j)), 8272L)));
    }
}
