package l;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88L3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20006 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final byte[] f64028;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final byte[] f64029;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f64032;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f64033;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f64034;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f64035;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f64036;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f64037;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f64038;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f64039;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f64040;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f64041;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f64042;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f64043;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f64044;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC6599 f64045;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C7928 f64046;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC8011 f64047;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f64048;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f64049;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f64031 = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final int[] f64030 = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    static {
        String str = C17983.f57504;
        Charset charset = StandardCharsets.UTF_8;
        f64029 = "#!AMR\n".getBytes(charset);
        f64028 = "#!AMR-WB\n".getBytes(charset);
    }

    public C20006(int i) {
        this.f64041 = (i & 2) != 0 ? i | 1 : i;
        this.f64044 = new byte[1];
        this.f64032 = -1;
        C7928 c7928 = new C7928();
        this.f64046 = c7928;
        this.f64033 = c7928;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        return m45291(interfaceC7222);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        this.f64036 = interfaceC15690;
        InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(0, 1);
        this.f64047 = interfaceC8011Mo7684;
        this.f64033 = interfaceC8011Mo7684;
        interfaceC15690.mo7696();
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        this.f64040 = 0L;
        this.f64042 = 0;
        this.f64035 = 0;
        this.f64038 = j2;
        InterfaceC6599 interfaceC6599 = this.f64045;
        if (interfaceC6599 instanceof C2365) {
            long jM7189 = ((C2365) interfaceC6599).m7189(j);
            this.f64039 = jM7189;
            if (Math.abs(this.f64038 - jM7189) < 20000) {
                return;
            }
            this.f64037 = true;
            this.f64033 = this.f64046;
            return;
        }
        if (j != 0 && (interfaceC6599 instanceof C22745)) {
            this.f64039 = ((C22745) interfaceC6599).m50408(j);
        } else {
            this.f64039 = 0L;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m45291(InterfaceC7222 interfaceC7222) {
        interfaceC7222.mo19217();
        byte[] bArr = f64029;
        byte[] bArr2 = new byte[bArr.length];
        interfaceC7222.mo19210(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f64049 = false;
            interfaceC7222.mo19214(bArr.length);
            return true;
        }
        interfaceC7222.mo19217();
        byte[] bArr3 = f64028;
        byte[] bArr4 = new byte[bArr3.length];
        interfaceC7222.mo19210(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f64049 = true;
        interfaceC7222.mo19214(bArr3.length);
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m45292(InterfaceC7222 interfaceC7222) throws C22861 {
        boolean z;
        interfaceC7222.mo19217();
        byte[] bArr = this.f64044;
        interfaceC7222.mo19210(0, 1, bArr);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw C22861.m50610("Invalid padding bits for frame header " + ((int) b), (Throwable) null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.f64049) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? f64030[i] : f64031[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f64049 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C22861.m50610(sb.toString(), (Throwable) null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        int i;
        int i2;
        int iMo8111;
        int i3;
        C2023.m6508(this.f64047);
        String str = C17983.f57504;
        if (interfaceC7222.getPosition() == 0 && !m45291(interfaceC7222)) {
            throw C22861.m50610("Could not find AMR header.", (Throwable) null);
        }
        if (!this.f64034) {
            this.f64034 = true;
            boolean z = this.f64049;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i4 = z ? 16000 : 8000;
            int i5 = z ? f64030[8] : f64031[7];
            InterfaceC8011 interfaceC8011 = this.f64047;
            C10471 c10471 = new C10471();
            c10471.m26521(str2);
            c10471.m26533(str3);
            c10471.m26531(i5);
            c10471.m26494(1);
            c10471.m26511(i4);
            interfaceC8011.mo8116(c10471.m26497());
        }
        if (this.f64035 == 0) {
            try {
                int iM45292 = m45292(interfaceC7222);
                this.f64042 = iM45292;
                this.f64035 = iM45292;
                if (this.f64032 == -1) {
                    this.f64048 = interfaceC7222.getPosition();
                    this.f64032 = this.f64042;
                }
                if (this.f64032 == this.f64042) {
                    this.f64043++;
                }
                InterfaceC6599 interfaceC6599 = this.f64045;
                if (interfaceC6599 instanceof C2365) {
                    C2365 c2365 = (C2365) interfaceC6599;
                    long j = this.f64039 + this.f64040 + 20000;
                    long position = interfaceC7222.getPosition() + ((long) this.f64042);
                    if (!c2365.m7188(j)) {
                        c2365.m7187(j, position);
                    }
                    if (this.f64037 && Math.abs(this.f64038 - j) < 20000) {
                        this.f64037 = false;
                        this.f64033 = this.f64047;
                    }
                }
                iMo8111 = this.f64033.mo8111((InterfaceC6942) interfaceC7222, this.f64035, true);
                if (iMo8111 == -1) {
                    i = -1;
                } else {
                    i3 = this.f64035 - iMo8111;
                    this.f64035 = i3;
                    if (i3 <= 0) {
                        this.f64033.mo8114(this.f64039 + this.f64040, 1, this.f64042, 0, null);
                        this.f64040 += 20000;
                    }
                    i = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iMo8111 = this.f64033.mo8111((InterfaceC6942) interfaceC7222, this.f64035, true);
            if (iMo8111 == -1) {
                i = -1;
            } else {
                i3 = this.f64035 - iMo8111;
                this.f64035 = i3;
                if (i3 <= 0) {
                    this.f64033.mo8114(this.f64039 + this.f64040, 1, this.f64042, 0, null);
                    this.f64040 += 20000;
                }
                i = 0;
            }
        }
        long length = interfaceC7222.getLength();
        if (this.f64045 == null) {
            int i6 = this.f64041;
            if ((i6 & 4) != 0) {
                this.f64045 = new C2365(-9223372036854775807L, new long[]{this.f64048}, new long[]{0});
            } else if ((i6 & 1) == 0 || ((i2 = this.f64032) != -1 && i2 != this.f64042)) {
                this.f64045 = new C3776(-9223372036854775807L);
            } else if (this.f64043 >= 20 || i == -1) {
                C22745 c22745 = new C22745((int) ((((long) i2) * 8000000) / 20000), i2, length, this.f64048, (i6 & 2) != 0);
                this.f64045 = c22745;
                this.f64047.mo8113(c22745.mo5383());
            }
            InterfaceC6599 interfaceC65910 = this.f64045;
            if (interfaceC65910 != null) {
                this.f64036.mo7690(interfaceC65910);
            }
        }
        if (i == -1) {
            InterfaceC6599 interfaceC65911 = this.f64045;
            if (interfaceC65911 instanceof C2365) {
                long j2 = this.f64039 + this.f64040;
                ((C2365) interfaceC65911).m7186(j2);
                this.f64036.mo7690(this.f64045);
                this.f64047.mo8113(j2);
            }
        }
        return i;
    }
}
