package l;

import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܿܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C18397 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f59920;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0498 f59921;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3613 f59922;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f59923;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f59924;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f59925;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f59926;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20570 f59927;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C20635 f59928;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f59930;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f59931;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f59933;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f59934;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f59935;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f59932 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f59929 = -1;

    public C18397(C0498 c0498, int i, byte[] bArr) {
        this.f59921 = c0498;
        this.f59925 = i;
        this.f59934 = bArr;
        boolean z = i == bArr.length;
        this.f59924 = z;
        this.f59930 = c0498.f2168.m48614();
        if (z) {
            if (bArr.length == 0) {
                throw new IllegalArgumentException("Pattern replacement must not be empty");
            }
            this.f59927 = new C20570(bArr);
            this.f59931 = new int[256];
            this.f59922 = null;
            this.f59928 = null;
        } else {
            this.f59927 = null;
            this.f59931 = null;
            this.f59922 = new C3613(c0498.f2168.f68095);
            this.f59928 = new C20635();
            m42907(c0498.f2168.m48614());
        }
        if (z) {
            return;
        }
        C17037 c17037 = c0498.f2168.f68095;
        int i2 = C19143.f61939;
        m42903(c17037 == null ? 0L : c17037.f55673, c0498.f2168.m48614());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42909(int i, int[] iArr) {
        int i2;
        C17359.requireNonNull(iArr, "originalOffsets");
        int i3 = 0;
        C13921.m33902(iArr.length, 0, i);
        synchronized (this.f59921.f2157) {
            try {
                try {
                    C0498 c0498 = this.f59921;
                    c0498.m2432();
                    if (!this.f59923 && c0498.f2166 == this) {
                        if (this.f59924) {
                            while (i3 < i) {
                                m42905(iArr[i3]);
                                i3++;
                            }
                        } else {
                            while (i3 < i) {
                                int i4 = iArr[i3];
                                int i5 = 1;
                                while (true) {
                                    i2 = i3 + i5;
                                    if (i2 >= i || ((long) iArr[i2 - 1]) + ((long) this.f59925) != iArr[i2]) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                                m42906(i4, i5);
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
                if (!this.f59921.f2161) {
                    this.f59921.m2409();
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42910(InterfaceC7509 interfaceC7509) {
        C13856 c13856 = null;
        InterfaceC7509 interfaceC7509M41888 = interfaceC7509 == null ? null : C17950.m41888(interfaceC7509);
        synchronized (this.f59921.f2157) {
            try {
                try {
                    C0498 c0498 = this.f59921;
                    c0498.m2432();
                    if (!this.f59923 && c0498.f2166 == this) {
                        if (interfaceC7509M41888 != null) {
                            C0498.m2412(this.f59921, interfaceC7509M41888);
                        }
                        if (this.f59920 != 0) {
                            if (this.f59924) {
                                m42904();
                            } else {
                                int i = this.f59935;
                                if (i != 0) {
                                    this.f59922.m11720(i);
                                    this.f59935 = 0;
                                }
                                this.f59922.m11721(this.f59921.f2168.m48614(), interfaceC7509M41888);
                                if (C19143.m44350(m42903(this.f59922.m11725(), this.f59930))) {
                                    C17037 c17037M11719 = this.f59922.m11719();
                                    if (this.f59930 != 0) {
                                        C3481 c3481M47249 = this.f59928.m47249(interfaceC7509M41888);
                                        if (C19143.m44350(C3077.m10044(this.f59922.m11725(), C3077.m10044(C3077.m10044(C3077.m10044(this.f59934.length, C3077.m10044(c3481M47249.m11436(), 88L)), C3077.m10044(this.f59921.f2173, C3077.m10044(C19606.m45238(this.f59921.f2168.f68092), C3077.m10044(C19606.m45236(this.f59921.f2168.f68092), C19606.m45235(this.f59921.f2168.f68092))))), C19606.m45204(1L))))) {
                                            C6465 c6465 = new C6465(this.f59921.f2168.f68092, this.f59921.f2168.m48614(), (int) this.f59930, this.f59925, this.f59934, c3481M47249);
                                            this.f59921.m2446(new InterfaceC22808[]{c6465});
                                            C13856 c13856M45220 = C19606.m45220(c6465);
                                            this.f59921.f2173 = c6465.f21758;
                                            this.f59921.f2162 = c6465.mo8834();
                                            c13856 = c13856M45220;
                                        } else {
                                            throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                                        }
                                    }
                                    long j = c13856 == null ? 0 : c13856.f43959;
                                    long j2 = this.f59930;
                                    if (j == j2) {
                                        if ((c17037M11719 == null ? 0 : c17037M11719.f55675) == j2) {
                                            this.f59921.f2167 = c13856;
                                            this.f59921.f2169 = c17037M11719;
                                            C10655 c10655M45237 = C19606.m45237(c13856);
                                            this.f59921.f2159 = c10655M45237.m27161();
                                            this.f59921.f2156 = c10655M45237.m27162();
                                            if (this.f59921.f2159 > X931RNG.BLOCK128_RESEED_MAX) {
                                                throw new IllegalStateException("Literal heap storage exceeds memory limit");
                                            }
                                            this.f59921.f2172 = 0L;
                                            C0498.m2403(this.f59921);
                                        }
                                    }
                                    throw new IllegalStateException("Batch replacement length mismatch");
                                }
                                throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                            }
                            if (interfaceC7509M41888 != null) {
                                C0498.m2412(this.f59921, interfaceC7509M41888);
                            }
                            this.f59921.f2158 = true;
                            this.f59921.f2165 = true;
                        }
                        this.f59923 = true;
                        this.f59921.f2166 = null;
                    } else {
                        throw new IllegalStateException("Batch replacement is not active");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                if (!this.f59921.f2161) {
                    this.f59921.m2409();
                    throw e;
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42904() {
        if (this.f59933 == 0) {
            return;
        }
        C0498 c0498 = this.f59921;
        C13856 c13856 = c0498.f2167;
        int[] iArr = this.f59931;
        int i = this.f59933;
        int i2 = this.f59925;
        long jM45208 = C19606.m45208(c13856, iArr, i, i2);
        long jM10044 = C3077.m10044(C3077.m10044(C3077.m10044(C3077.m10044(C19606.m45236(c0498.f2167), C3077.m10044(c0498.f2172, c0498.f2173)), C19606.m45238(c0498.f2167)), C20767.m47500(c0498.f2169)), C3077.m10044(jM45208 * 960, C3077.m10044(C19143.m44281(c0498.f2168.m48614(), this.f59933, i2, this.f59931), C19143.m44339(c0498.f2168.m48614(), this.f59933, i2, this.f59931))));
        boolean z = this.f59926;
        C20570 c20570 = this.f59927;
        if (!z) {
            jM10044 = C3077.m10044(jM10044, c20570.m47166());
        }
        if (!C19143.m44350(jM10044)) {
            throw new IllegalStateException("Edit metadata exceeds memory limit");
        }
        c0498.f2167 = C19606.m45219(c0498.f2167, this.f59931, this.f59933, i2, c20570);
        if (!this.f59926) {
            c0498.f2172 = C3077.m10044(c0498.f2172, c20570.m47166());
            this.f59926 = true;
        }
        c0498.f2169 = C20767.m47490(c0498.f2169, this.f59931, this.f59933, i2);
        C0498.m2403(c0498);
        this.f59933 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42905(int i) {
        if (!this.f59924) {
            m42906(i, 1);
            return;
        }
        long j = i;
        int i2 = this.f59925;
        long j2 = i2;
        long j3 = j + j2;
        if (i >= 0 && i >= this.f59929) {
            C0498 c0498 = this.f59921;
            if (j3 <= c0498.f2168.m48614()) {
                long j4 = this.f59930;
                byte[] bArr = this.f59934;
                long length = (j4 + ((long) bArr.length)) - j2;
                if (length > 2147483647L) {
                    throw new C12562();
                }
                int i3 = i >>> 16;
                if (this.f59933 != 0 && i3 != this.f59932) {
                    m42904();
                }
                this.f59932 = i3;
                int i4 = this.f59933 + 1;
                int[] iArr = this.f59931;
                if (i4 > iArr.length) {
                    this.f59931 = Arrays.copyOf(this.f59931, Math.min(65536, Math.max(i4, iArr.length << 1)));
                }
                int[] iArr2 = this.f59931;
                int i5 = this.f59933;
                this.f59933 = i5 + 1;
                iArr2[i5] = i;
                c0498.f2154.m54756((int) ((j + this.f59930) - ((long) c0498.f2168.m48614())), i2, bArr.length, 1);
                this.f59930 = length;
                this.f59929 = (int) j3;
                this.f59920++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(C13645.m33382(i, "Invalid batch match offset "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42906(int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Empty replacement run");
        }
        int i3 = this.f59925;
        long j = i2;
        long j2 = ((long) i3) * j;
        long j3 = i;
        long j4 = j3 + j2;
        if (i >= 0 && i >= this.f59929) {
            C0498 c0498 = this.f59921;
            if (j4 <= c0498.f2168.m48614()) {
                byte[] bArr = this.f59934;
                long length = ((long) bArr.length) * j;
                long j5 = (this.f59930 + length) - j2;
                if (j5 > 2147483647L) {
                    throw new C12562();
                }
                this.f59928.m47250(i, i3, i2);
                m42907(j5);
                C3613 c3613 = this.f59922;
                if (c3613.m11723() < i) {
                    int i4 = this.f59935;
                    if (i4 != 0) {
                        c3613.m11720(i4);
                        this.f59935 = 0;
                    }
                    c3613.m11726(i);
                }
                c3613.m11724((int) j2);
                long j6 = ((long) this.f59935) + ((long) ((int) length));
                int i5 = (int) j6;
                if (j6 != i5) {
                    throw new ArithmeticException();
                }
                this.f59935 = i5;
                if (!C19143.m44350(m42903(c3613.m11725(), j5))) {
                    throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                }
                c0498.f2154.m54756((int) ((j3 + this.f59930) - ((long) c0498.f2168.m48614())), i3, bArr.length, i2);
                this.f59930 = j5;
                this.f59929 = (int) j4;
                this.f59920 += j;
                return;
            }
        }
        throw new IndexOutOfBoundsException(C13645.m33382(i, "Invalid batch match run "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m42903(long j, long j2) {
        C0498 c0498 = this.f59921;
        return C3077.m10044(C3077.m10044(C3077.m10044(C3077.m10044(C3077.m10044(C3077.m10044(C3077.m10044(c0498.f2173, C3077.m10044(this.f59934.length, 88L)), this.f59928.m47248()), C19606.m45238(c0498.f2168.f68092)), C19606.m45236(c0498.f2168.f68092)), C19606.m45235(c0498.f2168.f68092)), j), C20767.m47481(j2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42907(long j) {
        C3613 c3613 = this.f59922;
        if (c3613 == null) {
            return;
        }
        C0498 c0498 = this.f59921;
        c3613.m11722(Math.max(0L, 67108864 - C3077.m10044(C3077.m10044(C3077.m10044(c0498.f2173, C3077.m10044(C3077.m10044(this.f59934.length, 88L), C3077.m10044(this.f59928.m47248(), C3077.m10044(C19606.m45238(c0498.f2168.f68092), C3077.m10044(C19606.m45236(c0498.f2168.f68092), C19606.m45235(c0498.f2168.f68092)))))), C20767.m47481(j)), 8272L)));
    }
}
