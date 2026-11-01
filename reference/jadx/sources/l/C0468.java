package l;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.֡ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C0468 extends AbstractC13532 {

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f2109 = new AtomicInteger();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile boolean f2110;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16697 f2111;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final int f2112;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC22433 f2113;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f2114;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f2115;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C12257 f2116;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f2117;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f2118;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f2119;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f2120;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5035 f2121;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C6694 f2122;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f2123;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f2124;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Uri f2125;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C8354 f2126;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f2127;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f2128;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f2129;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20225 f2130;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f2131;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C5436 f2132;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f2133;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f2134;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC16697 f2135;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f2136;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f2137;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0468 m2322(InterfaceC20225 interfaceC20225, InterfaceC15785 interfaceC15785, C7648 c7648, long j, C16325 c16325, C7524 c7524, Uri uri, List list, int i, Object obj, boolean z, C3623 c3623, C0468 c0468, byte[] bArr, byte[] bArr2, boolean z2, boolean z3, C9724 c9724) {
        byte[] bArrM2326;
        InterfaceC15785 c6818;
        C12257 c12257M38753;
        InterfaceC15785 interfaceC15786;
        boolean z4;
        C5436 c5436;
        InterfaceC16697 interfaceC16697;
        C2460 c2460;
        byte[] bArrM2327;
        InterfaceC15785 c6819 = interfaceC15785;
        C19853 c19853 = c7524.f25017;
        C16490 c16490 = new C16490();
        String str = c16325.f36441;
        c16490.m38756(C22923.m50741(str, c19853.f63674));
        c16490.m38762(c19853.f63682);
        c16490.m38755(c19853.f63679);
        boolean z5 = c7524.f25018;
        c16490.m38754(z5 ? 8 : 0);
        C12257 c12257M38754 = c16490.m38753();
        boolean z6 = bArr != null;
        if (z6) {
            String str2 = c19853.f63677;
            str2.getClass();
            bArrM2326 = m2326(str2);
        } else {
            bArrM2326 = null;
        }
        if (bArr != null) {
            bArrM2326.getClass();
            c6818 = new C6818(c6819, bArr, bArrM2326);
        } else {
            c6818 = c6819;
        }
        C15620 c15620 = c19853.f63676;
        if (c15620 != null) {
            boolean z7 = bArr2 != null;
            if (z7) {
                String str3 = c15620.f63677;
                str3.getClass();
                bArrM2327 = m2326(str3);
            } else {
                bArrM2327 = null;
            }
            Uri uriM50741 = C22923.m50741(str, c15620.f63674);
            C16490 c16491 = new C16490();
            c16491.m38756(uriM50741);
            boolean z8 = z7;
            c16491.m38762(c15620.f63682);
            c16491.m38755(c15620.f63679);
            c12257M38753 = c16491.m38753();
            if (bArr2 != null) {
                bArrM2327.getClass();
                c6819 = new C6818(c6819, bArr2, bArrM2327);
            }
            z4 = z8;
            interfaceC15786 = c6819;
        } else {
            c12257M38753 = null;
            interfaceC15786 = null;
            z4 = false;
        }
        long j2 = j + c19853.f63678;
        long j3 = j2 + c19853.f63680;
        int i2 = c16325.f52573 + c19853.f63683;
        if (c0468 != null) {
            C12257 c12257 = c0468.f2116;
            boolean z9 = c12257M38753 == c12257 || (c12257M38753 != null && c12257 != null && c12257M38753.f41015.equals(c12257.f41015) && c12257M38753.f41009 == c12257.f41009);
            boolean z10 = uri.equals(c0468.f2125) && c0468.f2128;
            C5436 c5437 = c0468.f2132;
            C2460 c2461 = c0468.f2114;
            interfaceC16697 = (z9 && z10 && !c0468.f2131 && c0468.f2136 == i2) ? c0468.f2135 : null;
            c5436 = c5437;
            c2460 = c2461;
        } else {
            c5436 = new C5436(null);
            interfaceC16697 = null;
            c2460 = new C2460(10);
        }
        return new C0468(interfaceC20225, c6818, c12257M38754, c7648, z6, interfaceC15786, c12257M38753, z4, uri, list, i, obj, j2, j3, c7524.f25020, c7524.f25019, !z5, i2, c19853.f63675, z, c3623.m10726(i2), c19853.f63673, interfaceC16697, c5436, c2460, z2, z3, c9724);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2325(C0468 c0468, long j, Uri uri, boolean z, C7524 c7524, long j2) {
        if (c0468 == null) {
            return false;
        }
        if (uri.equals(c0468.f2125) && c0468.f2128) {
            return false;
        }
        return !z || j2 + c7524.f25017.f63678 < j;
    }

    public C0468(InterfaceC20225 interfaceC20225, InterfaceC15785 interfaceC15785, C12257 c12257, C7648 c7648, boolean z, InterfaceC15785 interfaceC15786, C12257 c12258, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C6694 c6694, C8354 c8354, InterfaceC16697 interfaceC16697, C5436 c5436, C2460 c2460, boolean z6, boolean z7, C9724 c9724) {
        super(interfaceC15785, c12257, c7648, i, obj, j, j2, j3);
        this.f2123 = z;
        this.f2137 = i2;
        this.f2119 = z3 ? j2 - j : -9223372036854775807L;
        this.f2136 = i3;
        this.f2116 = c12258;
        this.f2120 = interfaceC15786;
        this.f2118 = c12258 != null;
        this.f2134 = z2;
        this.f2125 = uri;
        this.f2133 = z5;
        this.f2122 = c6694;
        this.f2117 = z4;
        this.f2130 = interfaceC20225;
        this.f2129 = list;
        this.f2126 = c8354;
        this.f2111 = interfaceC16697;
        this.f2132 = c5436;
        this.f2114 = c2460;
        this.f2124 = z6;
        this.f2127 = z7;
        this.f2113 = AbstractC22433.of();
        this.f2112 = f2109.getAndIncrement();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2332(C5035 c5035, AbstractC22433 abstractC22433) {
        this.f2121 = c5035;
        this.f2113 = abstractC22433;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m2329(int i) {
        C2023.m6510(!this.f2124);
        if (i >= this.f2113.size()) {
            return 0;
        }
        return ((Integer) this.f2113.get(i)).intValue();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m2334() {
        this.f2131 = true;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m2337() {
        return this.f2124;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m2336() {
        this.f2124 = false;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m2328() {
        return this.f2128;
    }

    @Override // l.InterfaceC1411
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo2335() {
        this.f2110 = true;
    }

    @Override // l.InterfaceC1411
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2330() {
        InterfaceC16697 interfaceC16697;
        this.f2121.getClass();
        if (this.f2135 == null && (interfaceC16697 = this.f2111) != null) {
            InterfaceC10045 interfaceC10045Mo2755 = ((C23047) interfaceC16697).f74869.mo2755();
            if ((interfaceC10045Mo2755 instanceof C15130) || (interfaceC10045Mo2755 instanceof C17618)) {
                this.f2135 = this.f2111;
                this.f2118 = false;
            }
        }
        C12257 c12257 = this.f2116;
        InterfaceC15785 interfaceC15785 = this.f2120;
        if (this.f2118) {
            interfaceC15785.getClass();
            c12257.getClass();
            m2324(interfaceC15785, c12257, this.f2134, false);
            this.f2115 = 0;
            this.f2118 = false;
        }
        if (this.f2110) {
            return;
        }
        if (!this.f2117) {
            m2324(this.f12012, this.f12016, this.f2123, true);
        }
        this.f2128 = !this.f2110;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m2333() {
        return this.f2119 != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long m2327() {
        long j = this.f2119;
        if (j != -9223372036854775807L) {
            return this.f12013 + j;
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2331(long j) {
        this.f2119 = j;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2324(InterfaceC15785 interfaceC15785, C12257 c12257, boolean z, boolean z2) {
        C12257 c12257M30476;
        boolean z3;
        if (z) {
            z3 = this.f2115 != 0;
            c12257M30476 = c12257;
        } else {
            long j = this.f2115;
            long j2 = c12257.f41017;
            c12257M30476 = c12257.m30476(j, j2 != -1 ? j2 - j : -1L);
            z3 = false;
        }
        try {
            C14984 c14984M2323 = m2323(interfaceC15785, c12257M30476, z2);
            if (z3) {
                c14984M2323.mo19211(this.f2115, false);
            }
            while (!this.f2110 && ((C23047) this.f2135).m50981(c14984M2323)) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.f12017.f25244 & 16384) != 0) {
                            ((C23047) this.f2135).f74869.mo2752(0L, 0L);
                        } else {
                            throw e;
                        }
                    }
                } catch (Throwable th) {
                    this.f2115 = (int) (c14984M2323.getPosition() - c12257.f41009);
                    throw th;
                }
            }
            this.f2115 = (int) (c14984M2323.getPosition() - c12257.f41009);
            C22851.m50584(interfaceC15785);
        } catch (Throwable th2) {
            C22851.m50584(interfaceC15785);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14984 m2323(InterfaceC15785 interfaceC15785, C12257 c12257, boolean z) throws IOException {
        C14984 c14984;
        long jM7529;
        C23047 c23047M48351;
        long jMo9272 = interfaceC15785.mo9272(c12257);
        long jM18077 = this.f12013;
        C6694 c6694 = this.f2122;
        if (z) {
            try {
                c6694.m18073(jM18077, this.f2133);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        C14984 c14985 = new C14984(interfaceC15785, c12257.f41009, jMo9272);
        if (this.f2135 == null) {
            C2460 c2460 = this.f2114;
            c14985.mo19217();
            try {
                c2460.m7517(10);
                c14985.mo19219(false, 0, 10, c2460.m7518());
                if (c2460.m7525() == 4801587) {
                    c2460.m7535(3);
                    int iM7515 = c2460.m7515();
                    int i = iM7515 + 10;
                    if (i > c2460.m7521()) {
                        byte[] bArrM7518 = c2460.m7518();
                        c2460.m7517(i);
                        System.arraycopy(bArrM7518, 0, c2460.m7518(), 0, 10);
                    }
                    c14985.mo19219(false, 10, iM7515, c2460.m7518());
                    C0987 c0987M15036 = this.f2132.m15036(iM7515, c2460.m7518());
                    if (c0987M15036 != null) {
                        int iM3789 = c0987M15036.m3789();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= iM3789) {
                                jM7529 = -9223372036854775807L;
                                break;
                            }
                            InterfaceC22155 interfaceC22155M3793 = c0987M15036.m3793(i2);
                            if (interfaceC22155M3793 instanceof C6847) {
                                C6847 c6847 = (C6847) interfaceC22155M3793;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(c6847.f23045)) {
                                    System.arraycopy(c6847.f23044, 0, c2460.m7518(), 0, 8);
                                    c2460.m7510(0);
                                    c2460.m7501(8);
                                    jM7529 = c2460.m7529() & 8589934591L;
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else {
                        jM7529 = -9223372036854775807L;
                        break;
                    }
                } else {
                    jM7529 = -9223372036854775807L;
                    break;
                }
            } catch (EOFException unused2) {
            }
            c14985.mo19217();
            InterfaceC16697 interfaceC16697 = this.f2111;
            if (interfaceC16697 != null) {
                c23047M48351 = ((C23047) interfaceC16697).m50980();
                c14984 = c14985;
            } else {
                c14984 = c14985;
                c23047M48351 = ((C21635) this.f2130).m48351(c12257.f41015, this.f12017, this.f2129, this.f2122, interfaceC15785.mo9273(), c14984);
            }
            this.f2135 = c23047M48351;
            InterfaceC10045 interfaceC10045Mo2755 = c23047M48351.f74869.mo2755();
            if ((interfaceC10045Mo2755 instanceof C1327) || (interfaceC10045Mo2755 instanceof C11912) || (interfaceC10045Mo2755 instanceof C5561) || (interfaceC10045Mo2755 instanceof C5624)) {
                C5035 c5035 = this.f2121;
                if (jM7529 != -9223372036854775807L) {
                    jM18077 = c6694.m18077(jM7529);
                }
                c5035.m14049(jM18077);
            } else {
                this.f2121.m14049(0L);
            }
            this.f2121.m14055();
            ((C23047) this.f2135).f74869.mo2753(this.f2121);
        } else {
            c14984 = c14985;
        }
        this.f2121.m14041(this.f2126);
        return c14984;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m2326(String str) {
        if (C20733.m46672(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }
}
