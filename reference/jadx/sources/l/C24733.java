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

/* JADX INFO: renamed from: l.᩻ۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MS */
/* JADX INFO: loaded from: classes2.dex */
public final class C24733 extends AbstractC14542 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f80047 = new AtomicInteger();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f80048;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C7578 f80049;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Uri f80050;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f80051;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f80052;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f80053;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f80054;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f80055;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f80056;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC16527 f80057;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f80058;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f80059;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C1150 f80060;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f80061;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f80062;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f80063;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1612 f80064;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22362 f80065;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC16527 f80066;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f80067;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f80068;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C8248 f80069;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f80070;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f80071;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int f80072;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f80073;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C25368 f80074;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f80075;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24733 m55207(InterfaceC1612 interfaceC1612, InterfaceC13433 interfaceC13433, C15648 c15648, long j, C24907 c24907, C15035 c15035, Uri uri, List list, int i, Object obj, boolean z, C1664 c1664, C24733 c24733, byte[] bArr, byte[] bArr2, boolean z2, boolean z3, C20738 c20738) {
        byte[] bArrM55210;
        InterfaceC13433 c9264;
        C25368 c25368M29908;
        InterfaceC13433 interfaceC13434;
        boolean z4;
        C8248 c8248;
        InterfaceC16527 interfaceC16527;
        C21287 c21287;
        byte[] bArrM55211;
        InterfaceC13433 c9265 = interfaceC13433;
        C1786 c1786 = c15035.f49080;
        C11941 c11941 = new C11941();
        String str = c24907.f75794;
        c11941.m29911(C9352.m24651(str, c1786.f6097));
        c11941.m29917(c1786.f6103);
        c11941.m29910(c1786.f6100);
        boolean z5 = c15035.f49077;
        c11941.m29909(z5 ? 8 : 0);
        C25368 c25368M29909 = c11941.m29908();
        boolean z6 = bArr != null;
        if (z6) {
            String str2 = c1786.f6096;
            str2.getClass();
            bArrM55210 = m55210(str2);
        } else {
            bArrM55210 = null;
        }
        if (bArr != null) {
            bArrM55210.getClass();
            c9264 = new C9264(c9265, bArr, bArrM55210);
        } else {
            c9264 = c9265;
        }
        C5515 c5515 = c1786.f6094;
        if (c5515 != null) {
            boolean z7 = bArr2 != null;
            if (z7) {
                String str3 = c5515.f6096;
                str3.getClass();
                bArrM55211 = m55210(str3);
            } else {
                bArrM55211 = null;
            }
            Uri uriM24651 = C9352.m24651(str, c5515.f6097);
            C11941 c11942 = new C11941();
            c11942.m29911(uriM24651);
            boolean z8 = z7;
            c11942.m29917(c5515.f6103);
            c11942.m29910(c5515.f6100);
            c25368M29908 = c11942.m29908();
            if (bArr2 != null) {
                bArrM55211.getClass();
                c9265 = new C9264(c9265, bArr2, bArrM55211);
            }
            z4 = z8;
            interfaceC13434 = c9265;
        } else {
            c25368M29908 = null;
            interfaceC13434 = null;
            z4 = false;
        }
        long j2 = j + c1786.f6095;
        long j3 = j2 + c1786.f6093;
        int i2 = c24907.f80609 + c1786.f6098;
        if (c24733 != null) {
            C25368 c25368 = c24733.f80074;
            boolean z9 = c25368M29908 == c25368 || (c25368M29908 != null && c25368 != null && c25368M29908.f81907.equals(c25368.f81907) && c25368M29908.f81909 == c25368.f81909);
            boolean z10 = uri.equals(c24733.f80050) && c24733.f80048;
            C8248 c8249 = c24733.f80069;
            C21287 c21288 = c24733.f80053;
            interfaceC16527 = (z9 && z10 && !c24733.f80073 && c24733.f80075 == i2) ? c24733.f80066 : null;
            c8248 = c8249;
            c21287 = c21288;
        } else {
            c8248 = new C8248(null);
            interfaceC16527 = null;
            c21287 = new C21287(10);
        }
        return new C24733(interfaceC1612, c9264, c25368M29909, c15648, z6, interfaceC13434, c25368M29908, z4, uri, list, i, obj, j2, j3, c15035.f49079, c15035.f49078, !z5, i2, c1786.f6099, z, c1664.m5991(i2), c1786.f6101, interfaceC16527, c8248, c21287, z2, z3, c20738);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m55209(C24733 c24733, long j, Uri uri, boolean z, C15035 c15035, long j2) {
        if (c24733 == null) {
            return false;
        }
        if (uri.equals(c24733.f80050) && c24733.f80048) {
            return false;
        }
        return !z || j2 + c15035.f49080.f6095 < j;
    }

    public C24733(InterfaceC1612 interfaceC1612, InterfaceC13433 interfaceC13433, C25368 c25368, C15648 c15648, boolean z, InterfaceC13433 interfaceC13434, C25368 c25369, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C1150 c1150, C22362 c22362, InterfaceC16527 interfaceC16527, C8248 c8248, C21287 c21287, boolean z6, boolean z7, C20738 c20738) {
        super(interfaceC13433, c25368, c15648, i, obj, j, j2, j3);
        this.f80056 = z;
        this.f80058 = i2;
        this.f80055 = z3 ? j2 - j : -9223372036854775807L;
        this.f80075 = i3;
        this.f80074 = c25369;
        this.f80054 = interfaceC13434;
        this.f80061 = c25369 != null;
        this.f80052 = z2;
        this.f80050 = uri;
        this.f80070 = z5;
        this.f80060 = c1150;
        this.f80051 = z4;
        this.f80064 = interfaceC1612;
        this.f80068 = list;
        this.f80065 = c22362;
        this.f80057 = interfaceC16527;
        this.f80069 = c8248;
        this.f80053 = c21287;
        this.f80071 = z6;
        this.f80063 = z7;
        this.f80062 = AbstractC1928.of();
        this.f80072 = f80047.getAndIncrement();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55214(C7578 c7578, AbstractC1928 abstractC1928) {
        this.f80049 = c7578;
        this.f80062 = abstractC1928;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m55212(int i) {
        C20782.m47568(!this.f80071);
        if (i >= this.f80062.size()) {
            return 0;
        }
        return ((Integer) this.f80062.get(i)).intValue();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m55215() {
        this.f80073 = true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m55219() {
        return this.f80071;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m55218() {
        this.f80071 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m55211() {
        return this.f80048;
    }

    @Override // l.InterfaceC0636
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2803() {
        this.f80067 = true;
    }

    @Override // l.InterfaceC0636
    /* JADX INFO: renamed from: ۙ */
    public final void mo2802() {
        InterfaceC16527 interfaceC16527;
        this.f80049.getClass();
        if (this.f80066 == null && (interfaceC16527 = this.f80057) != null) {
            InterfaceC22486 interfaceC22486Mo2296 = ((C2553) interfaceC16527).f8193.mo2296();
            if ((interfaceC22486Mo2296 instanceof C7370) || (interfaceC22486Mo2296 instanceof C16231)) {
                this.f80066 = this.f80057;
                this.f80061 = false;
            }
        }
        C25368 c25368 = this.f80074;
        InterfaceC13433 interfaceC13433 = this.f80054;
        if (this.f80061) {
            interfaceC13433.getClass();
            c25368.getClass();
            m55208(interfaceC13433, c25368, this.f80052, false);
            this.f80059 = 0;
            this.f80061 = false;
        }
        if (this.f80067) {
            return;
        }
        if (!this.f80051) {
            m55208(this.f78507, this.f78513, this.f80056, true);
        }
        this.f80048 = !this.f80067;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m55216() {
        return this.f80055 != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long m55217() {
        long j = this.f80055;
        if (j != -9223372036854775807L) {
            return this.f78512 + j;
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55213(long j) {
        this.f80055 = j;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55208(InterfaceC13433 interfaceC13433, C25368 c25368, boolean z, boolean z2) {
        C25368 c25368M56735;
        boolean z3;
        if (z) {
            z3 = this.f80059 != 0;
            c25368M56735 = c25368;
        } else {
            long j = this.f80059;
            long j2 = c25368.f81910;
            c25368M56735 = c25368.m56735(j, j2 != -1 ? j2 - j : -1L);
            z3 = false;
        }
        try {
            C9169 c9169M55206 = m55206(interfaceC13433, c25368M56735, z2);
            if (z3) {
                c9169M55206.mo10070(this.f80059, false);
            }
            while (!this.f80067 && ((C2553) this.f80066).m8562(c9169M55206)) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.f78511.f50834 & 16384) != 0) {
                            ((C2553) this.f80066).f8193.mo2292(0L, 0L);
                        } else {
                            throw e;
                        }
                    }
                } catch (Throwable th) {
                    this.f80059 = (int) (c9169M55206.getPosition() - c25368.f81909);
                    throw th;
                }
            }
            this.f80059 = (int) (c9169M55206.getPosition() - c25368.f81909);
            C18856.m43745(interfaceC13433);
        } catch (Throwable th2) {
            C18856.m43745(interfaceC13433);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9169 m55206(InterfaceC13433 interfaceC13433, C25368 c25368, boolean z) throws IOException {
        C9169 c9169;
        long jM48518;
        C2553 c2553M19343;
        long jMo8326 = interfaceC13433.mo8326(c25368);
        long jM4249 = this.f78512;
        C1150 c1150 = this.f80060;
        if (z) {
            try {
                c1150.m4245(jM4249, this.f80070);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        C9169 c91610 = new C9169(interfaceC13433, c25368.f81909, jMo8326);
        if (this.f80066 == null) {
            C21287 c21287 = this.f80053;
            c91610.mo10076();
            try {
                c21287.m48496(10);
                c91610.mo10078(false, 0, 10, c21287.m48497());
                if (c21287.m48501() == 4801587) {
                    c21287.m48503(3);
                    int iM48499 = c21287.m48499();
                    int i = iM48499 + 10;
                    if (i > c21287.m48513()) {
                        byte[] bArrM48497 = c21287.m48497();
                        c21287.m48496(i);
                        System.arraycopy(bArrM48497, 0, c21287.m48497(), 0, 10);
                    }
                    c91610.mo10078(false, 10, iM48499, c21287.m48497());
                    C19378 c19378M22215 = this.f80069.m22215(iM48499, c21287.m48497());
                    if (c19378M22215 != null) {
                        int iM44819 = c19378M22215.m44819();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= iM44819) {
                                jM48518 = -9223372036854775807L;
                                break;
                            }
                            InterfaceC8191 interfaceC8191M44820 = c19378M22215.m44820(i2);
                            if (interfaceC8191M44820 instanceof C3027) {
                                C3027 c3027 = (C3027) interfaceC8191M44820;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(c3027.f9817)) {
                                    System.arraycopy(c3027.f9816, 0, c21287.m48497(), 0, 8);
                                    c21287.m48510(0);
                                    c21287.m48517(8);
                                    jM48518 = c21287.m48518() & 8589934591L;
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else {
                        jM48518 = -9223372036854775807L;
                        break;
                    }
                } else {
                    jM48518 = -9223372036854775807L;
                    break;
                }
            } catch (EOFException unused2) {
            }
            c91610.mo10076();
            InterfaceC16527 interfaceC16527 = this.f80057;
            if (interfaceC16527 != null) {
                c2553M19343 = ((C2553) interfaceC16527).m8561();
                c9169 = c91610;
            } else {
                c9169 = c91610;
                c2553M19343 = ((C7028) this.f80064).m19343(c25368.f81907, this.f78511, this.f80068, this.f80060, interfaceC13433.mo10893(), c9169);
            }
            this.f80066 = c2553M19343;
            InterfaceC22486 interfaceC22486Mo2296 = c2553M19343.f8193.mo2296();
            if ((interfaceC22486Mo2296 instanceof C9849) || (interfaceC22486Mo2296 instanceof C18054) || (interfaceC22486Mo2296 instanceof C7613) || (interfaceC22486Mo2296 instanceof C8006)) {
                C7578 c7578 = this.f80049;
                if (jM48518 != -9223372036854775807L) {
                    jM4249 = c1150.m4249(jM48518);
                }
                c7578.m20744(jM4249);
            } else {
                this.f80049.m20744(0L);
            }
            this.f80049.m20749();
            ((C2553) this.f80066).f8193.mo2293(this.f80049);
        } else {
            c9169 = c91610;
        }
        this.f80049.m20738(this.f80065);
        return c9169;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m55210(String str) {
        if (C7914.m21453(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }
}
