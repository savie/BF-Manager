package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Collections;
import java.util.Iterator;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۙۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZIPT */
/* JADX INFO: loaded from: classes2.dex */
public final class C4842 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8088 f16906;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C19143 f16907;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f16908;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f16909;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C8088 f16910;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f16911 = 262144;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f16912;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19143 f16913;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f16914;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13616 f16915;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.f16912) {
            this.f16912 = true;
            this.f16906.close();
            this.f16910.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C14119 m14873() {
        m14875();
        synchronized (this.f16913) {
            synchronized (this.f16907) {
                if (this.f16913.m44373() == this.f16909 && this.f16907.m44373() == this.f16908) {
                    C4933 c4933 = this.f16915.f43256;
                    if (c4933 != null && c4933.f17203 && this.f16911 > 0) {
                        long jM15140 = c4933.m15140(this.f16914);
                        if (jM15140 < 0) {
                            if (c4933.f17203) {
                                C4933 c4934 = c4933;
                                jM15140 = 0;
                                while (true) {
                                    C4933 c4935 = c4934.f17200;
                                    if (c4935 == null) {
                                        break;
                                    }
                                    if (c4935.f17203) {
                                        c4934 = c4935;
                                    } else {
                                        jM15140 += c4935.f17208;
                                        c4934 = c4934.f17202;
                                    }
                                }
                            } else {
                                jM15140 = -1;
                            }
                        }
                        long j = jM15140;
                        long jM15142 = c4933.m15142(j);
                        long jMin = ((long) Math.min(32768, this.f16911)) + j;
                        if (jM15142 < 0) {
                            jM15142 = c4933.f17208;
                        }
                        long jMin2 = Math.min(jMin, jM15142);
                        C7956 c7956M44374 = this.f16913.m44374();
                        try {
                            return new C14119(this.f16915, j, jMin2, c7956M44374, this.f16907.m44374());
                        } catch (Error | RuntimeException e) {
                            c7956M44374.close();
                            throw e;
                        }
                    }
                    return null;
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m14874(C14119 c14119, C13616 c13616) {
        if (!this.f16912 && !c14119.f44643 && this.f16915 == c14119.f44652) {
            synchronized (this.f16913) {
                synchronized (this.f16907) {
                    if (c14119.f44653.m21662() && c14119.f44646.m21662() && this.f16913.m44373() == c14119.f44644 && this.f16907.m44373() == c14119.f44648) {
                        if (c13616.f43254 != c14119.f44645 || c13616.f43257 != c14119.f44649) {
                            throw new IllegalArgumentException("Local comparison coverage mismatch");
                        }
                        this.f16915 = m14870(this.f16915, c14119.f44650, c14119.f44647, c13616.f43256);
                        this.f16911 -= Math.max(c14119.f44645, c14119.f44649);
                        this.f16914 = c14119.f44650 + c13616.f43259;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C13616 m14875() {
        C13616 c13616;
        if (this.f16912) {
            throw new IllegalStateException("Comparison session is closed");
        }
        synchronized (this.f16913) {
            synchronized (this.f16907) {
                m14872(true);
                m14872(false);
                c13616 = this.f16915;
            }
        }
        return c13616;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m14876(long j) {
        this.f16914 = Math.max(0L, j - ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        this.f16911 = 262144;
    }

    public C4842(C19143 c19143, C19143 c19144, C13616 c13616) {
        this.f16913 = c19143;
        this.f16907 = c19144;
        synchronized (c19143) {
            synchronized (c19144) {
                if (c19143.length() != c13616.f43254 || c19144.length() != c13616.f43257) {
                    throw new IllegalArgumentException("Comparison does not cover documents");
                }
                this.f16906 = c19143.m44376();
                this.f16910 = c19144.m44376();
                this.f16909 = c19143.m44373();
                this.f16908 = c19144.m44373();
                this.f16915 = c13616;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14872(boolean z) {
        C8088 c8088;
        int iM15138;
        C8088 c8089 = z ? this.f16906 : this.f16910;
        while (true) {
            C14799 c14799Poll = c8089.poll();
            if (c14799Poll == null) {
                return;
            }
            long j = c14799Poll.f48414;
            this.f16911 = 262144;
            long j2 = z ? this.f16909 : this.f16908;
            if (c14799Poll.f48416 || c14799Poll.f48415 != j2) {
                c8088 = c8089;
                int i = c14799Poll.f48419;
                int i2 = z ? i : this.f16915.f43254;
                if (z) {
                    i = this.f16915.f43257;
                }
                this.f16915 = new C13616(C4933.m15130(4, i2, i));
            } else {
                for (Iterator it = (c14799Poll.m35637() > 4096 ? Collections.singletonList(c14799Poll.m35634()) : c14799Poll.m35636()).iterator(); it.hasNext(); it = it) {
                    C4359 c4359 = (C4359) it.next();
                    int i3 = c4359.f15738;
                    int i4 = c4359.f15740;
                    long j3 = c4359.f15737;
                    long j4 = ((long) i3) * j3;
                    int i5 = (int) j4;
                    if (j4 != i5) {
                        throw new ArithmeticException();
                    }
                    long j5 = ((long) c4359.f15739) * j3;
                    int i6 = (int) j5;
                    if (j5 != i6) {
                        throw new ArithmeticException();
                    }
                    if (i5 != i6) {
                        C13616 c13616 = this.f16915;
                        C4933 c4933 = c13616.f43256;
                        long jM15141 = i4 == (z ? c13616.f43254 : c13616.f43257) ? c13616.f43259 : c4933.m15141(i4, z);
                        long jM15142 = i5 == 0 ? jM15141 : c4933.m15141((i4 + i5) - 1, z) + 1;
                        if (c4933 == null) {
                            iM15138 = 0;
                        } else {
                            boolean z2 = !z;
                            iM15138 = c4933.m15138(jM15142, z2) - c4933.m15138(jM15141, z2);
                        }
                        this.f16915 = m14870(this.f16915, jM15141, jM15142, C4933.m15130(5, z ? i6 : iM15138, z ? iM15138 : i6));
                        m14871(Math.max(0L, jM15141 - ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS), Math.min(this.f16915.f43259, jM15141 + ((long) Math.max(i6, iM15138)) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS));
                    } else if (i5 != 0) {
                        C4933 c4934 = this.f16915.f43256;
                        long jM15143 = c4934.m15141(i4, z);
                        long jM15144 = c4934.m15141((i4 + i5) - 1, z);
                        long j6 = 1 + jM15144;
                        long jMax = Math.max(0L, jM15143 - ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
                        long jMin = Math.min(c4934.f17208, jM15144 + 1025);
                        if (jMin - jMax <= X931RNG.BLOCK64_RESEED_MAX) {
                            this.f16915 = m14870(this.f16915, jM15143, j6, C4933.m15134(C4933.m15132(c4934, jM15143, j6), true));
                        }
                        m14871(jMax, jMin);
                    }
                    c8089 = c8089;
                }
                c8088 = c8089;
            }
            if (z) {
                this.f16909 = j;
            } else {
                this.f16908 = j;
            }
            c8089 = c8088;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14871(long j, long j2) {
        C4933 c4933M15130;
        if (j == j2) {
            return;
        }
        this.f16914 = j;
        C4933 c4933 = this.f16915.f43256;
        int iM15138 = c4933.m15138(j, true);
        int iM15139 = c4933.m15138(j, false);
        if (j2 - j <= X931RNG.BLOCK64_RESEED_MAX) {
            c4933M15130 = C4933.m15134(C4933.m15132(c4933, j, j2), false);
        } else {
            c4933M15130 = C4933.m15130(5, c4933.m15138(j2, true) - iM15138, c4933.m15138(j2, false) - iM15139);
        }
        this.f16915 = m14870(this.f16915, j, j2, c4933M15130);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13616 m14870(C13616 c13616, long j, long j2, C4933 c4933) {
        return new C13616(C4933.m15136(C4933.m15136(C4933.m15132(c13616.f43256, 0L, j), c4933), C4933.m15132(c13616.f43256, j2, c13616.f43259)));
    }
}
