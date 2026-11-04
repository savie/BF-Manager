package l;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 88L3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1887 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final byte[] f6323;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final byte[] f6325;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f6326;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f6327;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f6328;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f6329;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f6330;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f6331;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f6332;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f6333;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f6334;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final byte[] f6335;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f6336;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f6337;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f6338;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C4586 f6339;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f6340;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f6341;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC9060 f6342;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f6343;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int[] f6322 = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f6324 = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    static {
        String str = C7116.f23455;
        Charset charset = StandardCharsets.UTF_8;
        f6323 = "#!AMR\n".getBytes(charset);
        f6325 = "#!AMR-WB\n".getBytes(charset);
    }

    public C1887(int i) {
        this.f6329 = (i & 2) != 0 ? i | 1 : i;
        this.f6335 = new byte[1];
        this.f6333 = -1;
        C4586 c4586 = new C4586();
        this.f6339 = c4586;
        this.f6341 = c4586;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        return m6461(interfaceC19502);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f6338 = interfaceC12789;
        InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(0, 1);
        this.f6337 = interfaceC22024Mo16658;
        this.f6341 = interfaceC22024Mo16658;
        interfaceC12789.mo16661();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        this.f6330 = 0L;
        this.f6340 = 0;
        this.f6328 = 0;
        this.f6327 = j2;
        InterfaceC9060 interfaceC9060 = this.f6342;
        if (interfaceC9060 instanceof C20994) {
            long jM47986 = ((C20994) interfaceC9060).m47986(j);
            this.f6332 = jM47986;
            if (Math.abs(this.f6327 - jM47986) < 20000) {
                return;
            }
            this.f6331 = true;
            this.f6341 = this.f6339;
            return;
        }
        if (j != 0 && (interfaceC9060 instanceof C0967)) {
            this.f6332 = ((C0967) interfaceC9060).m3840(j);
        } else {
            this.f6332 = 0L;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m6461(InterfaceC19502 interfaceC19502) {
        interfaceC19502.mo10076();
        byte[] bArr = f6323;
        byte[] bArr2 = new byte[bArr.length];
        interfaceC19502.mo10069(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f6343 = false;
            interfaceC19502.mo10073(bArr.length);
            return true;
        }
        interfaceC19502.mo10076();
        byte[] bArr3 = f6325;
        byte[] bArr4 = new byte[bArr3.length];
        interfaceC19502.mo10069(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f6343 = true;
        interfaceC19502.mo10073(bArr3.length);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m6462(InterfaceC19502 interfaceC19502) throws C2970 {
        boolean z;
        interfaceC19502.mo10076();
        byte[] bArr = this.f6335;
        interfaceC19502.mo10069(0, 1, bArr);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw C2970.m9688("Invalid padding bits for frame header " + ((int) b), (Throwable) null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.f6343) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? f6324[i] : f6322[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f6343 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C2970.m9688(sb.toString(), (Throwable) null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        int i;
        int i2;
        int iMo14380;
        int i3;
        C20782.m47566(this.f6337);
        String str = C7116.f23455;
        if (interfaceC19502.getPosition() == 0 && !m6461(interfaceC19502)) {
            throw C2970.m9688("Could not find AMR header.", (Throwable) null);
        }
        if (!this.f6326) {
            this.f6326 = true;
            boolean z = this.f6343;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i4 = z ? 16000 : 8000;
            int i5 = z ? f6324[8] : f6322[7];
            InterfaceC22024 interfaceC22024 = this.f6337;
            C20124 c20124 = new C20124();
            c20124.m46327(str2);
            c20124.m46315(str3);
            c20124.m46318(i5);
            c20124.m46329(1);
            c20124.m46332(i4);
            interfaceC22024.mo14384(c20124.m46295());
        }
        if (this.f6328 == 0) {
            try {
                int iM6462 = m6462(interfaceC19502);
                this.f6340 = iM6462;
                this.f6328 = iM6462;
                if (this.f6333 == -1) {
                    this.f6334 = interfaceC19502.getPosition();
                    this.f6333 = this.f6340;
                }
                if (this.f6333 == this.f6340) {
                    this.f6336++;
                }
                InterfaceC9060 interfaceC9060 = this.f6342;
                if (interfaceC9060 instanceof C20994) {
                    C20994 c20994 = (C20994) interfaceC9060;
                    long j = this.f6332 + this.f6330 + 20000;
                    long position = interfaceC19502.getPosition() + ((long) this.f6340);
                    if (!c20994.m47985(j)) {
                        c20994.m47984(j, position);
                    }
                    if (this.f6331 && Math.abs(this.f6327 - j) < 20000) {
                        this.f6331 = false;
                        this.f6341 = this.f6337;
                    }
                }
                iMo14380 = this.f6341.mo14380((InterfaceC9461) interfaceC19502, this.f6328, true);
                if (iMo14380 == -1) {
                    i = -1;
                } else {
                    i3 = this.f6328 - iMo14380;
                    this.f6328 = i3;
                    if (i3 <= 0) {
                        this.f6341.mo14383(this.f6332 + this.f6330, 1, this.f6340, 0, null);
                        this.f6330 += 20000;
                    }
                    i = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iMo14380 = this.f6341.mo14380((InterfaceC9461) interfaceC19502, this.f6328, true);
            if (iMo14380 == -1) {
                i = -1;
            } else {
                i3 = this.f6328 - iMo14380;
                this.f6328 = i3;
                if (i3 <= 0) {
                    this.f6341.mo14383(this.f6332 + this.f6330, 1, this.f6340, 0, null);
                    this.f6330 += 20000;
                }
                i = 0;
            }
        }
        long length = interfaceC19502.getLength();
        if (this.f6342 == null) {
            int i6 = this.f6329;
            if ((i6 & 4) != 0) {
                this.f6342 = new C20994(-9223372036854775807L, new long[]{this.f6334}, new long[]{0});
            } else if ((i6 & 1) == 0 || ((i2 = this.f6333) != -1 && i2 != this.f6340)) {
                this.f6342 = new C0857(-9223372036854775807L);
            } else if (this.f6336 >= 20 || i == -1) {
                C0967 c0967 = new C0967((int) ((((long) i2) * 8000000) / 20000), i2, length, this.f6334, (i6 & 2) != 0);
                this.f6342 = c0967;
                this.f6337.mo14382(c0967.mo2295());
            }
            InterfaceC9060 interfaceC9061 = this.f6342;
            if (interfaceC9061 != null) {
                this.f6338.mo16659(interfaceC9061);
            }
        }
        if (i == -1) {
            InterfaceC9060 interfaceC9062 = this.f6342;
            if (interfaceC9062 instanceof C20994) {
                long j2 = this.f6332 + this.f6330;
                ((C20994) interfaceC9062).m47987(j2);
                this.f6338.mo16659(this.f6342);
                this.f6337.mo14382(j2);
            }
        }
        return i;
    }
}
