package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺ܽ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G8N2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24437 implements InterfaceC22486, InterfaceC9060 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f79317;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C0570 f79318;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f79319;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1272 f79320;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C14213 f79321;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f79322;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long[][] f79323;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f79324;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f79325;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C21287 f79326;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C6537[] f79327;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f79328;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f79329;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21287 f79330;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f79331;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21287 f79332;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f79333;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f79334;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f79335;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f79336;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f79337;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f79338;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f79339;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f79340;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f79341;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C21287 f79342;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f79343;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C21287 f79344;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f79345;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f79346 = AbstractC1928.of();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f79347;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f79348;

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return true;
    }

    public C24437(InterfaceC1272 interfaceC1272, int i) {
        this.f79320 = interfaceC1272;
        this.f79338 = i;
        this.f79325 = (i & 4) != 0 ? 3 : 0;
        this.f79318 = new C0570();
        this.f79328 = new ArrayList();
        this.f79330 = new C21287(16);
        this.f79324 = new ArrayDeque();
        this.f79332 = new C21287(C14399.f45378);
        this.f79342 = new C21287(6);
        this.f79326 = new C21287();
        this.f79317 = -1;
        this.f79331 = InterfaceC12789.f40905;
        this.f79327 = new C6537[0];
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        InterfaceC13535 interfaceC13535M21895 = C8028.m21895(interfaceC19502, (this.f79338 & 2) != 0);
        this.f79346 = interfaceC13535M21895 != null ? AbstractC1928.of((Object) interfaceC13535M21895) : AbstractC1928.of();
        return interfaceC13535M21895 == null;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return this.f79346;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        if ((this.f79338 & 16) == 0) {
            interfaceC12789 = new C8729(interfaceC12789, this.f79320);
        }
        this.f79331 = interfaceC12789;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        this.f79324.clear();
        this.f79345 = 0;
        this.f79317 = -1;
        this.f79322 = 0;
        this.f79334 = 0;
        this.f79343 = 0;
        this.f79336 = false;
        if (j == 0) {
            if (this.f79325 == 3) {
                this.f79318.m2586();
                this.f79328.clear();
                return;
            } else {
                this.f79325 = 0;
                this.f79345 = 0;
                return;
            }
        }
        for (C6537 c6537 : this.f79327) {
            C9518 c9518 = c6537.f21972;
            int iM19505 = C7116.m19505(c9518.f30827, j2, false);
            while (true) {
                if (iM19505 < 0) {
                    iM19505 = -1;
                    break;
                } else if ((c9518.f30830[iM19505] & 1) != 0) {
                    break;
                } else {
                    iM19505--;
                }
            }
            if (iM19505 == -1) {
                iM19505 = c9518.m24906(j2);
            }
            c6537.f21967 = iM19505;
            C10835 c10835 = c6537.f21968;
            if (c10835 != null) {
                c10835.m27561();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:169:0x030c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0321  */
    /* JADX WARN: Code duplicated, block: B:180:0x0365 A[PHI: r14
      0x0365: PHI (r14v5 int) = (r14v4 int), (r14v10 int) binds: [B:156:0x02d1, B:383:0x0365] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:181:0x0369  */
    /* JADX WARN: Code duplicated, block: B:183:0x0377  */
    /* JADX WARN: Code duplicated, block: B:185:0x037b  */
    /* JADX WARN: Code duplicated, block: B:187:0x038e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0392  */
    /* JADX WARN: Code duplicated, block: B:192:0x0399 A[LOOP:4: B:190:0x0395->B:192:0x0399, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:198:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:200:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:201:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:246:0x049d  */
    /* JADX WARN: Code duplicated, block: B:251:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:272:0x052c  */
    /* JADX WARN: Code duplicated, block: B:273:0x053f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0545  */
    /* JADX WARN: Code duplicated, block: B:282:0x055d  */
    /* JADX WARN: Code duplicated, block: B:285:0x0571  */
    /* JADX WARN: Code duplicated, block: B:349:0x0653  */
    /* JADX WARN: Code duplicated, block: B:351:0x0662  */
    /* JADX WARN: Code duplicated, block: B:356:0x0691  */
    /* JADX WARN: Code duplicated, block: B:357:0x0695  */
    /* JADX WARN: Code duplicated, block: B:368:0x06a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x069f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x03b0 A[EDGE_INSN: B:394:0x03b0->B:193:0x03b0 BREAK  A[LOOP:4: B:190:0x0395->B:192:0x0399], SYNTHETIC] */
    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        C18756 c18757;
        long j;
        long length;
        C22605 c22605;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        long j5;
        boolean z;
        C19215 c19215;
        C21287 c21287;
        int[] iArr;
        int[] iArr2;
        int i3;
        boolean z2;
        char c;
        int i4;
        C10835 c10835;
        long j6;
        int i5;
        int i6;
        int i7;
        C21287 c21288;
        byte[] bArrM48497;
        int i8;
        int i9;
        int iM34822;
        int i10;
        int iM48500;
        C15648 c15648;
        C12502 c12502;
        boolean z3;
        boolean z4;
        int i11;
        C18756 c18758 = c18756;
        while (true) {
            int i12 = this.f79325;
            ArrayDeque arrayDeque = this.f79324;
            int i13 = this.f79338;
            C21287 c21289 = this.f79326;
            if (i12 == 0) {
                c18757 = c18758;
                int i14 = this.f79345;
                C21287 c212810 = this.f79330;
                if (i14 == 0) {
                    if (interfaceC19502.mo10071(true, 0, 8, c212810.m48497())) {
                        this.f79345 = 8;
                        c212810.m48510(0);
                        this.f79341 = c212810.m48485();
                        this.f79335 = c212810.m48500();
                        j = this.f79341;
                        if (j == 1) {
                            interfaceC19502.readFully(c212810.m48497(), 8, 8);
                            this.f79345 += 8;
                            this.f79341 = c212810.m48482();
                        } else if (j == 0) {
                            length = interfaceC19502.getLength();
                            if (length == -1) {
                                length = c22605.f73059;
                            }
                            if (length != -1) {
                                this.f79341 = (length - interfaceC19502.getPosition()) + ((long) this.f79345);
                            }
                        }
                        j2 = this.f79341;
                        i = this.f79345;
                        if (j2 >= i) {
                            throw C2970.m9689("Atom size less than header length (unsupported).");
                        }
                        i2 = this.f79335;
                        if (i2 != 1836019574) {
                            long position = interfaceC19502.getPosition();
                            j3 = this.f79341;
                            j4 = this.f79345;
                            j5 = (position + j3) - j4;
                            if (j3 != j4) {
                                c21289.m48496(8);
                                interfaceC19502.mo10069(0, 8, c21289.m48497());
                                C11756.m29520(c21289);
                                interfaceC19502.mo10073(c21289.m48516());
                                interfaceC19502.mo10076();
                            }
                            arrayDeque.push(new C22605(this.f79335, j5));
                            if (this.f79341 != this.f79345) {
                                this.f79325 = 0;
                                this.f79345 = 0;
                            } else {
                                m54647(j5);
                            }
                        } else {
                            long position2 = interfaceC19502.getPosition();
                            j3 = this.f79341;
                            j4 = this.f79345;
                            j5 = (position2 + j3) - j4;
                            if (j3 != j4) {
                                c21289.m48496(8);
                                interfaceC19502.mo10069(0, 8, c21289.m48497());
                                C11756.m29520(c21289);
                                interfaceC19502.mo10073(c21289.m48516());
                                interfaceC19502.mo10076();
                            }
                            arrayDeque.push(new C22605(this.f79335, j5));
                            if (this.f79341 != this.f79345) {
                                this.f79325 = 0;
                                this.f79345 = 0;
                            } else {
                                m54647(j5);
                            }
                        }
                        z = true;
                    } else {
                        if (this.f79348 == 2 && (i13 & 2) != 0) {
                            InterfaceC22024 interfaceC22024Mo16658 = this.f79331.mo16658(0, 4);
                            C14213 c14213 = this.f79321;
                            C19378 c19378 = c14213 == null ? null : new C19378(c14213);
                            C20124 c20124 = new C20124();
                            c20124.m46303(c19378);
                            interfaceC22024Mo16658.mo14384(c20124.m46295());
                            this.f79331.mo16661();
                            this.f79331.mo16659(new C0857(-9223372036854775807L));
                        }
                        z = false;
                    }
                } else {
                    j = this.f79341;
                    if (j == 1) {
                        interfaceC19502.readFully(c212810.m48497(), 8, 8);
                        this.f79345 += 8;
                        this.f79341 = c212810.m48482();
                    } else if (j == 0) {
                        length = interfaceC19502.getLength();
                        if (length == -1 && (c22605 = (C22605) arrayDeque.peek()) != null) {
                            length = c22605.f73059;
                        }
                        if (length != -1) {
                            this.f79341 = (length - interfaceC19502.getPosition()) + ((long) this.f79345);
                        }
                    }
                    j2 = this.f79341;
                    i = this.f79345;
                    if (j2 >= i) {
                        throw C2970.m9689("Atom size less than header length (unsupported).");
                    }
                    i2 = this.f79335;
                    if (i2 != 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473 || i2 == 1635284069) {
                        long position3 = interfaceC19502.getPosition();
                        j3 = this.f79341;
                        j4 = this.f79345;
                        j5 = (position3 + j3) - j4;
                        if (j3 != j4 && this.f79335 == 1835365473) {
                            c21289.m48496(8);
                            interfaceC19502.mo10069(0, 8, c21289.m48497());
                            C11756.m29520(c21289);
                            interfaceC19502.mo10073(c21289.m48516());
                            interfaceC19502.mo10076();
                        }
                        arrayDeque.push(new C22605(this.f79335, j5));
                        if (this.f79341 != this.f79345) {
                            this.f79325 = 0;
                            this.f79345 = 0;
                        } else {
                            m54647(j5);
                        }
                    } else if (i2 == 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124) {
                        C20782.m47568(i == 8);
                        C20782.m47568(this.f79341 <= 2147483647L);
                        C21287 c212811 = new C21287((int) this.f79341);
                        System.arraycopy(c212810.m48497(), 0, c212811.m48497(), 0, 8);
                        this.f79344 = c212811;
                        this.f79325 = 1;
                    } else {
                        long position4 = interfaceC19502.getPosition();
                        long j7 = this.f79345;
                        long j8 = position4 - j7;
                        if (this.f79335 == 1836086884) {
                            this.f79321 = new C14213(0L, j8, -9223372036854775807L, j8 + j7, this.f79341 - j7);
                        }
                        this.f79344 = null;
                        this.f79325 = 1;
                    }
                    z = true;
                }
                if (!z) {
                    return -1;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            throw new IllegalStateException();
                        }
                        this.f79318.m2587(interfaceC19502, c18758, this.f79328);
                        if (c18758.f60914 != 0) {
                            return 1;
                        }
                        this.f79325 = 0;
                        this.f79345 = 0;
                        return 1;
                    }
                    long position5 = interfaceC19502.getPosition();
                    if (this.f79317 == -1) {
                        boolean z5 = true;
                        int i15 = 0;
                        long j9 = C25227.FOREVER_NS;
                        boolean z6 = true;
                        long j10 = C25227.FOREVER_NS;
                        int i16 = -1;
                        int i17 = -1;
                        long j11 = C25227.FOREVER_NS;
                        while (true) {
                            C6537[] c6537Arr = this.f79327;
                            if (i15 >= c6537Arr.length) {
                                break;
                            }
                            C6537 c6537 = c6537Arr[i15];
                            int i18 = c6537.f21967;
                            C9518 c9518 = c6537.f21972;
                            if (i18 != c9518.f30829) {
                                long j12 = c9518.f30831[i18];
                                long[][] jArr = this.f79323;
                                String str = C7116.f23455;
                                long j13 = jArr[i15][i18];
                                long j14 = j12 - position5;
                                boolean z7 = j14 < 0 || j14 >= 262144;
                                if ((!z7 && z5) || (z7 == z5 && j14 < j11)) {
                                    i17 = i15;
                                    z5 = z7;
                                    j11 = j14;
                                    j10 = j13;
                                }
                                if (j13 < j9) {
                                    i16 = i15;
                                    z6 = z7;
                                    j9 = j13;
                                }
                            }
                            i15++;
                        }
                        int i19 = (j9 == C25227.FOREVER_NS || !z6 || j10 < j9 + 10485760) ? i17 : i16;
                        this.f79317 = i19;
                        if (i19 == -1) {
                            return -1;
                        }
                    }
                    C6537 c6538 = this.f79327[this.f79317];
                    InterfaceC22024 interfaceC22024 = c6538.f21969;
                    C9518 c9519 = c6538.f21972;
                    C19215 c19216 = c6538.f21970;
                    int i20 = c6538.f21967;
                    long[] jArr2 = c9519.f30831;
                    int[] iArr3 = c9519.f30830;
                    int[] iArr4 = c9519.f30828;
                    long j15 = jArr2[i20];
                    C21287 c212812 = c21289;
                    long j16 = j15 + this.f79339;
                    int length2 = iArr4[i20];
                    C10835 c10836 = c6538.f21968;
                    long j17 = (j16 - position5) + ((long) this.f79322);
                    if (j17 < 0 || j17 >= 262144) {
                        c18756.f60914 = j16;
                        return 1;
                    }
                    int i21 = c19216.f62164;
                    int i22 = c19216.f62152;
                    if (i21 == 1) {
                        j17 += 8;
                        length2 -= 8;
                    }
                    interfaceC19502.mo10073((int) j17);
                    if (c6538.f21971 && this.f79322 == 0 && this.f79334 == 0 && this.f79343 == 0 && (iArr3[i20] & 1) != 0) {
                        if (length2 > 4194304) {
                            c6538.f21971 = false;
                            c12502 = null;
                            i13 = i13;
                            i22 = i22;
                            c19215 = c19216;
                            c21287 = c212812;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            i3 = i20;
                        } else {
                            byte[] bArr = new byte[length2];
                            try {
                                interfaceC19502.mo10069(0, length2, bArr);
                                interfaceC19502.mo10076();
                                if (i22 <= 0 || i22 > 4) {
                                    c19215 = c19216;
                                    c21287 = c212812;
                                    iArr = iArr3;
                                } else {
                                    int i23 = 0;
                                    int i24 = 0;
                                    int i25 = 0;
                                    boolean z8 = false;
                                    boolean z9 = false;
                                    boolean z10 = false;
                                    while (true) {
                                        if (i25 < length2) {
                                            iArr = iArr3;
                                            if (length2 - i25 < i22) {
                                                c19215 = c19216;
                                                c21287 = c212812;
                                            } else {
                                                int i26 = 0;
                                                c21287 = c212812;
                                                int i27 = 0;
                                                while (i27 < i22) {
                                                    i26 = (i26 << 8) | (bArr[i25 + i27] & 255);
                                                    i27++;
                                                    c19216 = c19216;
                                                }
                                                c19215 = c19216;
                                                int i28 = i25 + i22;
                                                if (i26 >= 2 && i26 <= length2 - i28) {
                                                    int i29 = (bArr[i28] & 126) >> 1;
                                                    int i30 = i26 + 4;
                                                    int i31 = i23 + i30;
                                                    if (i29 == 32 || i29 == 33 || i29 == 34) {
                                                        i24 += i30;
                                                        boolean z11 = z8 | (i29 == 32);
                                                        boolean z12 = z9 | (i29 == 33);
                                                        z8 = z11;
                                                        z10 |= i29 == 34;
                                                        z9 = z12;
                                                    }
                                                    i25 = i28 + i26;
                                                    i23 = i31;
                                                    iArr3 = iArr;
                                                    c212812 = c21287;
                                                    c19216 = c19215;
                                                }
                                            }
                                        } else {
                                            c19215 = c19216;
                                            c21287 = c212812;
                                            iArr = iArr3;
                                            if (z8 && z9 && z10) {
                                                byte[] bArr2 = new byte[i23];
                                                byte[] bArr3 = new byte[i24];
                                                int i32 = 0;
                                                int i33 = 0;
                                                int i34 = 0;
                                                while (i33 < length2) {
                                                    int i35 = 0;
                                                    int[] iArr5 = iArr4;
                                                    int i36 = 0;
                                                    while (i36 < i22) {
                                                        i35 = (i35 << 8) | (bArr[i33 + i36] & 255);
                                                        i36++;
                                                        i20 = i20;
                                                    }
                                                    int i37 = i20;
                                                    int i38 = i33 + i22;
                                                    int i39 = (bArr[i38] & 126) >> 1;
                                                    byte[] bArr4 = C14399.f45378;
                                                    int i40 = i22;
                                                    int i41 = i13;
                                                    System.arraycopy(bArr4, 0, bArr2, i34, 4);
                                                    int i42 = i34 + 4;
                                                    System.arraycopy(bArr, i38, bArr2, i42, i35);
                                                    i34 = i42 + i35;
                                                    if (i39 == 32 || i39 == 33 || i39 == 34) {
                                                        System.arraycopy(bArr4, 0, bArr3, i32, 4);
                                                        int i43 = i32 + 4;
                                                        System.arraycopy(bArr, i38, bArr3, i43, i35);
                                                        i32 = i43 + i35;
                                                    }
                                                    i33 = i38 + i35;
                                                    i22 = i40;
                                                    iArr4 = iArr5;
                                                    i20 = i37;
                                                    i13 = i41;
                                                }
                                                i13 = i13;
                                                i22 = i22;
                                                iArr2 = iArr4;
                                                i3 = i20;
                                                c12502 = new C12502(bArr3, bArr2);
                                            }
                                            c6538.f21971 = false;
                                        }
                                    }
                                }
                                iArr2 = iArr4;
                                i3 = i20;
                                c12502 = null;
                                c6538.f21971 = false;
                            } catch (Throwable th) {
                                interfaceC19502.mo10076();
                                throw th;
                            }
                        }
                        if (c12502 != null) {
                            byte[] bArr5 = c12502.f40153;
                            C20124 c20124M37397 = c6538.f21966.m37397();
                            c20124M37397.m46301((List) AbstractC1928.of((Object) c12502.f40152));
                            C15648 c15648M46295 = c20124M37397.m46295();
                            c6538.f21966 = c15648M46295;
                            interfaceC22024.mo14384(c15648M46295);
                            interfaceC22024.mo14381(bArr5.length, new C21287(bArr5));
                            interfaceC19502.mo10073(length2);
                            this.f79322 = length2;
                            this.f79334 = bArr5.length;
                            length2 = bArr5.length;
                            this.f79343 = 0;
                            z2 = true;
                            this.f79336 = true;
                        }
                        if (z2) {
                            c = 1;
                        } else {
                            c15648 = c6538.f21966;
                            if (C17359.equals(c15648.f50848, "video/avc") ? !C17359.equals(c15648.f50848, "video/hevc") || (i13 & 128) == 0 : (i13 & 32) == 0) {
                                c = 1;
                                this.f79336 = true;
                            } else {
                                c = 1;
                            }
                        }
                        if (!z2) {
                            i4 = length2;
                            c10835 = c10836;
                        } else if (i22 != 0) {
                            c21288 = this.f79342;
                            bArrM48497 = c21288.m48497();
                            bArrM48497[0] = 0;
                            bArrM48497[c] = 0;
                            bArrM48497[2] = 0;
                            i8 = 4 - i22;
                            length2 += i8;
                            while (this.f79334 < length2) {
                                i9 = this.f79343;
                                if (i9 == 0) {
                                    if (!this.f79336 || C14399.m34822(c6538.f21966) + i22 > iArr2[i3] - this.f79322) {
                                        iM34822 = 0;
                                        i10 = i22;
                                    } else {
                                        iM34822 = C14399.m34822(c6538.f21966);
                                        i10 = i22 + iM34822;
                                    }
                                    interfaceC19502.readFully(bArrM48497, i8, i10);
                                    this.f79322 += i10;
                                    c21288.m48510(0);
                                    iM48500 = c21288.m48500();
                                    if (iM48500 >= 0) {
                                        throw C2970.m9688("Invalid NAL length", (Throwable) null);
                                    }
                                    this.f79343 = iM48500 - iM34822;
                                    C21287 c212813 = this.f79332;
                                    c212813.m48510(0);
                                    interfaceC22024.mo14381(4, c212813);
                                    this.f79334 += 4;
                                    if (iM34822 > 0) {
                                        interfaceC22024.mo14381(iM34822, c21288);
                                        this.f79334 += iM34822;
                                        if (C14399.m34829(bArrM48497, iM34822, c6538.f21966)) {
                                            this.f79336 = true;
                                        }
                                    }
                                } else {
                                    int iMo14380 = interfaceC22024.mo14380((InterfaceC9461) interfaceC19502, i9, false);
                                    this.f79322 += iMo14380;
                                    this.f79334 += iMo14380;
                                    this.f79343 -= iMo14380;
                                }
                            }
                            i4 = length2;
                            c10835 = c10836;
                        } else {
                            if ("audio/ac4".equals(c19215.f62163.f50848)) {
                                if (this.f79334 == 0) {
                                    C21287 c212814 = c21287;
                                    C20358.m46775(length2, c212814);
                                    interfaceC22024.mo14381(7, c212814);
                                    this.f79334 += 7;
                                }
                                length2 += 7;
                                c10835 = c10836;
                            } else if (c10836 != null) {
                                c10835 = c10836;
                                c10835.m27562(interfaceC19502);
                            }
                            c10835 = c10836;
                            while (true) {
                                i7 = this.f79334;
                                if (i7 < length2) {
                                    break;
                                }
                                int iMo14381 = interfaceC22024.mo14380((InterfaceC9461) interfaceC19502, length2 - i7, false);
                                this.f79322 += iMo14381;
                                this.f79334 += iMo14381;
                                this.f79343 -= iMo14381;
                            }
                            i4 = length2;
                        }
                        j6 = c9519.f30827[i3];
                        i5 = iArr[i3];
                        if (!this.f79336) {
                            i5 |= 67108864;
                        }
                        if (c10835 != null) {
                            c10835.m27563(interfaceC22024, j6, i5, i4, 0, null);
                            i6 = 1;
                            if (i3 + 1 == c9519.f30829) {
                                c10835.m27564(interfaceC22024, null);
                            }
                        } else {
                            interfaceC22024.mo14383(j6, i5, i4, 0, null);
                            i6 = 1;
                        }
                        c6538.f21967 += i6;
                        this.f79317 = -1;
                        this.f79322 = 0;
                        this.f79334 = 0;
                        this.f79343 = 0;
                        this.f79336 = false;
                        return 0;
                    }
                    i13 = i13;
                    i22 = i22;
                    c19215 = c19216;
                    c21287 = c212812;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    i3 = i20;
                    z2 = false;
                    if (z2) {
                        c15648 = c6538.f21966;
                        if (C17359.equals(c15648.f50848, "video/avc")) {
                            c = 1;
                            this.f79336 = true;
                        } else {
                            c = 1;
                            this.f79336 = true;
                        }
                    } else {
                        c = 1;
                    }
                    if (!z2) {
                        i4 = length2;
                        c10835 = c10836;
                    } else if (i22 != 0) {
                        c21288 = this.f79342;
                        bArrM48497 = c21288.m48497();
                        bArrM48497[0] = 0;
                        bArrM48497[c] = 0;
                        bArrM48497[2] = 0;
                        i8 = 4 - i22;
                        length2 += i8;
                        while (this.f79334 < length2) {
                            i9 = this.f79343;
                            if (i9 == 0) {
                                if (this.f79336) {
                                    iM34822 = 0;
                                    i10 = i22;
                                } else {
                                    iM34822 = 0;
                                    i10 = i22;
                                }
                                interfaceC19502.readFully(bArrM48497, i8, i10);
                                this.f79322 += i10;
                                c21288.m48510(0);
                                iM48500 = c21288.m48500();
                                if (iM48500 >= 0) {
                                    throw C2970.m9688("Invalid NAL length", (Throwable) null);
                                }
                                this.f79343 = iM48500 - iM34822;
                                C21287 c212815 = this.f79332;
                                c212815.m48510(0);
                                interfaceC22024.mo14381(4, c212815);
                                this.f79334 += 4;
                                if (iM34822 > 0) {
                                    interfaceC22024.mo14381(iM34822, c21288);
                                    this.f79334 += iM34822;
                                    if (C14399.m34829(bArrM48497, iM34822, c6538.f21966)) {
                                        this.f79336 = true;
                                    }
                                }
                            } else {
                                int iMo14382 = interfaceC22024.mo14380((InterfaceC9461) interfaceC19502, i9, false);
                                this.f79322 += iMo14382;
                                this.f79334 += iMo14382;
                                this.f79343 -= iMo14382;
                            }
                        }
                        i4 = length2;
                        c10835 = c10836;
                    } else {
                        if ("audio/ac4".equals(c19215.f62163.f50848)) {
                            if (this.f79334 == 0) {
                                C21287 c212816 = c21287;
                                C20358.m46775(length2, c212816);
                                interfaceC22024.mo14381(7, c212816);
                                this.f79334 += 7;
                            }
                            length2 += 7;
                            c10835 = c10836;
                        } else if (c10836 != null) {
                            c10835 = c10836;
                            c10835.m27562(interfaceC19502);
                        }
                        c10835 = c10836;
                        while (true) {
                            i7 = this.f79334;
                            if (i7 < length2) {
                                break;
                                break;
                            }
                            int iMo14383 = interfaceC22024.mo14380((InterfaceC9461) interfaceC19502, length2 - i7, false);
                            this.f79322 += iMo14383;
                            this.f79334 += iMo14383;
                            this.f79343 -= iMo14383;
                        }
                        i4 = length2;
                    }
                    j6 = c9519.f30827[i3];
                    i5 = iArr[i3];
                    if (!this.f79336) {
                        i5 |= 67108864;
                    }
                    if (c10835 != null) {
                        c10835.m27563(interfaceC22024, j6, i5, i4, 0, null);
                        i6 = 1;
                        if (i3 + 1 == c9519.f30829) {
                            c10835.m27564(interfaceC22024, null);
                        }
                    } else {
                        interfaceC22024.mo14383(j6, i5, i4, 0, null);
                        i6 = 1;
                    }
                    c6538.f21967 += i6;
                    this.f79317 = -1;
                    this.f79322 = 0;
                    this.f79334 = 0;
                    this.f79343 = 0;
                    this.f79336 = false;
                    return 0;
                }
                c18757 = c18758;
                long j18 = this.f79341 - ((long) this.f79345);
                long position6 = interfaceC19502.getPosition() + j18;
                C21287 c212817 = this.f79344;
                if (c212817 != null) {
                    interfaceC19502.readFully(c212817.m48497(), this.f79345, (int) j18);
                    if (this.f79335 == 1718909296) {
                        this.f79329 = true;
                        c212817.m48510(8);
                        int iM48501 = c212817.m48500();
                        if (iM48501 != 1751476579) {
                            i11 = iM48501 != 1903435808 ? 0 : 1;
                        } else {
                            i11 = 2;
                        }
                        if (i11 == 0) {
                            c212817.m48503(4);
                            do {
                                if (c212817.m48486() <= 0) {
                                    i11 = 0;
                                    break;
                                }
                                int iM48502 = c212817.m48500();
                                if (iM48502 != 1751476579) {
                                    i11 = iM48502 != 1903435808 ? 0 : 1;
                                } else {
                                    i11 = 2;
                                }
                            } while (i11 == 0);
                        }
                        this.f79348 = i11;
                    } else if (!arrayDeque.isEmpty()) {
                        ((C22605) arrayDeque.peek()).f73061.add(new C19621(this.f79335, c212817));
                    }
                } else {
                    if (!this.f79329 && this.f79335 == 1835295092) {
                        this.f79348 = 1;
                    }
                    if (j18 < 262144) {
                        interfaceC19502.mo10073((int) j18);
                    } else {
                        c18757.f60914 = interfaceC19502.getPosition() + j18;
                        z3 = true;
                    }
                    m54647(position6);
                    if (this.f79340) {
                        this.f79347 = true;
                        c18757.f60914 = this.f79333;
                        this.f79340 = false;
                        z3 = true;
                    }
                    if (z3 || this.f79325 == 2) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        return 1;
                    }
                }
                z3 = false;
                m54647(position6);
                if (this.f79340) {
                    this.f79347 = true;
                    c18757.f60914 = this.f79333;
                    this.f79340 = false;
                    z3 = true;
                }
                if (z3) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (z4) {
                    return 1;
                }
            }
            c18758 = c18757;
        }
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f79319;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c A[LOOP:2: B:38:0x0083->B:42:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6 A[LOOP:3: B:52:0x00ad->B:56:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2 A[EDGE_INSN: B:74:0x00d2->B:66:0x00d2 BREAK  A[LOOP:1: B:33:0x006c->B:65:0x00ce], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0090 A[EDGE_INSN: B:80:0x0090->B:44:0x0090 BREAK  A[LOOP:2: B:38:0x0083->B:42:0x008c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ba A[EDGE_INSN: B:82:0x00ba->B:58:0x00ba BREAK  A[LOOP:3: B:52:0x00ad->B:56:0x00b6], SYNTHETIC] */
    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        long jMin;
        long j2;
        long j3;
        int i;
        C6537[] c6537Arr;
        C2349 c2349;
        C9518 c9518;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int iM19505;
        int iM19506;
        int iM24906;
        long j4 = j;
        C6537[] c6537Arr2 = this.f79327;
        int length = c6537Arr2.length;
        C2349 c23410 = C2349.f7572;
        if (length == 0) {
            return new C9805(c23410, c23410);
        }
        int i2 = this.f79337;
        boolean z = false;
        int i3 = -1;
        long jMin2 = -1;
        if (i2 != -1) {
            C9518 c9519 = c6537Arr2[i2].f21972;
            long[] jArr3 = c9519.f30827;
            int iM19507 = C7116.m19505(jArr3, j4, false);
            while (true) {
                if (iM19507 < 0) {
                    iM19507 = -1;
                    break;
                }
                if ((c9519.f30830[iM19507] & 1) != 0) {
                    break;
                }
                iM19507--;
            }
            if (iM19507 == -1) {
                iM19507 = c9519.m24906(j4);
            }
            long[] jArr4 = c9519.f30831;
            if (iM19507 == -1) {
                return new C9805(c23410, c23410);
            }
            j2 = jArr3[iM19507];
            jMin = jArr4[iM19507];
            if (j2 >= j4 || iM19507 >= c9519.f30829 - 1 || (iM24906 = c9519.m24906(j4)) == -1 || iM24906 == iM19507) {
                j4 = j2;
            } else {
                j3 = jArr3[iM24906];
                jMin2 = jArr4[iM24906];
            }
            i = 0;
            while (true) {
                c6537Arr = this.f79327;
                if (i < c6537Arr.length) {
                    break;
                }
                if (i != this.f79337) {
                    c9518 = c6537Arr[i].f21972;
                    jArr = c9518.f30831;
                    iArr = c9518.f30830;
                    jArr2 = c9518.f30827;
                    iM19505 = C7116.m19505(jArr2, j2, z);
                    while (true) {
                        if (iM19505 >= 0) {
                            iM19505 = -1;
                            break;
                        }
                        if ((iArr[iM19505] & 1) != 0) {
                            break;
                        }
                        iM19505--;
                    }
                    if (iM19505 == i3) {
                        iM19505 = c9518.m24906(j2);
                    }
                    if (iM19505 != i3) {
                        jMin = Math.min(jArr[iM19505], jMin);
                    }
                    if (j3 != -9223372036854775807L) {
                        z = false;
                        iM19506 = C7116.m19505(jArr2, j3, false);
                        while (true) {
                            if (iM19506 >= 0) {
                                iM19506 = -1;
                                break;
                            }
                            if ((iArr[iM19506] & 1) != 0) {
                                break;
                            }
                            iM19506--;
                        }
                        if (iM19506 == -1) {
                            iM19506 = c9518.m24906(j3);
                        }
                        if (iM19506 == -1) {
                            jMin2 = Math.min(jArr[iM19506], jMin2);
                        }
                    } else {
                        z = false;
                    }
                }
                i++;
                i3 = -1;
            }
            c2349 = new C2349(j2, jMin);
            if (j3 == -9223372036854775807L) {
                return new C9805(c2349, c2349);
            }
            return new C9805(c2349, new C2349(j3, jMin2));
        }
        jMin = C25227.FOREVER_NS;
        j2 = j4;
        j3 = -9223372036854775807L;
        i = 0;
        while (true) {
            c6537Arr = this.f79327;
            if (i < c6537Arr.length) {
                break;
                break;
            }
            if (i != this.f79337) {
                c9518 = c6537Arr[i].f21972;
                jArr = c9518.f30831;
                iArr = c9518.f30830;
                jArr2 = c9518.f30827;
                iM19505 = C7116.m19505(jArr2, j2, z);
                while (true) {
                    if (iM19505 >= 0) {
                        iM19505 = -1;
                        break;
                    }
                    if ((iArr[iM19505] & 1) != 0) {
                        break;
                        break;
                    }
                    iM19505--;
                }
                if (iM19505 == i3) {
                    iM19505 = c9518.m24906(j2);
                }
                if (iM19505 != i3) {
                    jMin = Math.min(jArr[iM19505], jMin);
                }
                if (j3 != -9223372036854775807L) {
                    z = false;
                    iM19506 = C7116.m19505(jArr2, j3, false);
                    while (true) {
                        if (iM19506 >= 0) {
                            iM19506 = -1;
                            break;
                        }
                        if ((iArr[iM19506] & 1) != 0) {
                            break;
                            break;
                        }
                        iM19506--;
                    }
                    if (iM19506 == -1) {
                        iM19506 = c9518.m24906(j3);
                    }
                    if (iM19506 == -1) {
                        jMin2 = Math.min(jArr[iM19506], jMin2);
                    }
                } else {
                    z = false;
                }
            }
            i++;
            i3 = -1;
        }
        c2349 = new C2349(j2, jMin);
        if (j3 == -9223372036854775807L) {
            return new C9805(c2349, c2349);
        }
        return new C9805(c2349, new C2349(j3, jMin2));
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0002 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m54647(long j) {
        ArrayList arrayList;
        C19378 c19378M29519;
        ArrayDeque arrayDeque;
        C19378 c19378;
        ArrayList arrayList2;
        C6078 c6078;
        long j2;
        C19378 c19379;
        String str;
        ArrayList arrayList3;
        C21859 c21859M11579;
        int i;
        while (true) {
            ArrayDeque arrayDeque2 = this.f79324;
            if (arrayDeque2.isEmpty() || ((C22605) arrayDeque2.peek()).f73059 != j) {
                break;
            }
            C22605 c22605 = (C22605) arrayDeque2.pop();
            if (c22605.f49413 == 1836019574) {
                C22605 c22605M50937 = c22605.m50937(1835365473);
                ArrayList arrayList4 = new ArrayList();
                int i2 = this.f79338;
                if (c22605M50937 != null) {
                    c19378M29519 = C11756.m29519(c22605M50937);
                    if (this.f79347) {
                        C20782.m47566(c19378M29519);
                        C21859 c21859M115710 = C3553.m11579(c19378M29519, "auxiliary.tracks.interleaved");
                        if (c21859M115710 != null && c21859M115710.f69688[0] == 0) {
                            this.f79339 = this.f79333 + 16;
                        }
                        C21859 c21859M115711 = C3553.m11579(c19378M29519, "auxiliary.tracks.map");
                        C20782.m47566(c21859M115711);
                        ArrayList arrayListM49556 = c21859M115711.m49556();
                        ArrayList arrayList5 = new ArrayList(arrayListM49556.size());
                        for (int i3 = 0; i3 < arrayListM49556.size(); i3++) {
                            int iIntValue = ((Integer) arrayListM49556.get(i3)).intValue();
                            if (iIntValue == 0) {
                                i = 1;
                            } else if (iIntValue == 1) {
                                i = 2;
                            } else if (iIntValue != 2) {
                                i = iIntValue != 3 ? 0 : 4;
                            } else {
                                i = 3;
                            }
                            arrayList5.add(Integer.valueOf(i));
                        }
                        arrayList = arrayList5;
                    } else {
                        if (c19378M29519 != null && (i2 & 64) != 0 && (c21859M11579 = C3553.m11579(c19378M29519, "auxiliary.tracks.offset")) != null) {
                            long jM48482 = new C21287(c21859M11579.f69688).m48482();
                            if (jM48482 > 0) {
                                this.f79333 = jM48482;
                                this.f79340 = true;
                                arrayDeque = arrayDeque2;
                            }
                            arrayDeque.clear();
                            if (!this.f79340) {
                                this.f79325 = 2;
                            }
                        }
                        arrayList = arrayList4;
                    }
                } else {
                    arrayList = arrayList4;
                    c19378M29519 = null;
                }
                ArrayList arrayList6 = new ArrayList();
                boolean z = this.f79348 == 1;
                C6078 c6079 = new C6078();
                C19621 c19621M50936 = c22605.m50936(1969517665);
                if (c19621M50936 != null) {
                    C19378 c19378M29518 = C11756.m29518(c19621M50936);
                    c6079.m17594(c19378M29518);
                    c19378 = c19378M29518;
                } else {
                    c19378 = null;
                }
                C19621 c19621M50937 = c22605.m50936(1836476516);
                c19621M50937.getClass();
                C19378 c193710 = new C19378(C11756.m29522(c19621M50937.f63236));
                C6078 c60710 = c6079;
                ArrayList arrayListM29515 = C11756.m29515(c22605, c6079, -9223372036854775807L, null, (i2 & 1) != 0, z, new C14017());
                if (this.f79347) {
                    boolean z2 = arrayList.size() == arrayListM29515.size();
                    Locale locale = Locale.US;
                    C20782.m47567(C0703.m3016("The number of auxiliary track types from metadata (", arrayList.size(), ") is not same as the number of auxiliary tracks (", MotionUtils.EASING_TYPE_FORMAT_END, arrayListM29515.size()), z2);
                }
                String strM47380 = C20707.m47380(arrayListM29515);
                long j3 = -9223372036854775807L;
                int i4 = 0;
                int i5 = 0;
                int size = -1;
                while (i5 < arrayListM29515.size()) {
                    C9518 c9518 = (C9518) arrayListM29515.get(i5);
                    int i6 = c9518.f30829;
                    ArrayList arrayList7 = arrayListM29515;
                    int i7 = c9518.f30826;
                    if (i6 == 0) {
                        c6078 = c60710;
                        arrayList2 = arrayList;
                        str = strM47380;
                        ArrayList arrayList8 = arrayList6;
                        c19379 = c19378M29519;
                        arrayList3 = arrayList8;
                    } else {
                        C19215 c19215 = c9518.f30825;
                        ArrayList arrayList9 = arrayList6;
                        InterfaceC12789 interfaceC12789 = this.f79331;
                        int i8 = i4 + 1;
                        String str2 = strM47380;
                        int i9 = c19215.f62160;
                        C19378 c193711 = c19378M29519;
                        C15648 c15648 = c19215.f62163;
                        InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(i4, i9);
                        C6537 c6537 = new C6537(c19215, c9518, interfaceC22024Mo16658);
                        C6078 c60711 = c60710;
                        ArrayList arrayList10 = arrayList;
                        long j4 = c19215.f62153;
                        if (j4 == -9223372036854775807L) {
                            j4 = c9518.f30824;
                        }
                        interfaceC22024Mo16658.mo14382(j4);
                        long jMax = Math.max(j3, j4);
                        int i10 = "audio/true-hd".equals(c15648.f50848) ? i7 * 16 : i7 + 30;
                        C20124 c20124M37397 = c15648.m37397();
                        c20124M37397.m46318(i10);
                        if (i9 == 2) {
                            int i11 = c15648.f50834;
                            if ((i2 & 8) != 0) {
                                i11 |= size == -1 ? 1 : 2;
                            }
                            if (this.f79347) {
                                i11 |= 32768;
                                arrayList2 = arrayList10;
                                c20124M37397.m46326(((Integer) arrayList2.get(i5)).intValue());
                            } else {
                                arrayList2 = arrayList10;
                            }
                            c20124M37397.m46311(i11);
                        } else {
                            arrayList2 = arrayList10;
                        }
                        if (i9 == 1) {
                            c6078 = c60711;
                            int i12 = c6078.f20801;
                            j2 = jMax;
                            if (i12 != -1 && c6078.f20802 != -1) {
                                c20124M37397.m46292(i12);
                                c20124M37397.m46310(c6078.f20802);
                            }
                        } else {
                            c6078 = c60711;
                            j2 = jMax;
                        }
                        C19378 c193712 = c15648.f50812;
                        ArrayList arrayList11 = this.f79328;
                        c19379 = c193711;
                        C3553.m11580(i9, c19379, c20124M37397, c193712, arrayList11.isEmpty() ? null : new C19378(arrayList11), c19378, c193710);
                        str = str2;
                        c20124M37397.m46327(str);
                        C15648 c15648M46295 = c20124M37397.m46295();
                        c6537.f21966 = c15648M46295;
                        c6537.f21971 = c19215.f62161 && c19215.f62152 != 0 && C17359.equals(c15648.f50848, "video/hevc");
                        interfaceC22024Mo16658.mo14384(c15648M46295);
                        if (i9 == 2 && size == -1) {
                            size = arrayList9.size();
                        }
                        arrayList3 = arrayList9;
                        arrayList3.add(c6537);
                        i4 = i8;
                        j3 = j2;
                    }
                    i5++;
                    strM47380 = str;
                    c60710 = c6078;
                    arrayList = arrayList2;
                    arrayListM29515 = arrayList7;
                    arrayDeque2 = arrayDeque2;
                    C19378 c193713 = c19379;
                    arrayList6 = arrayList3;
                    c19378M29519 = c193713;
                }
                arrayDeque = arrayDeque2;
                this.f79337 = size;
                this.f79319 = j3;
                C6537[] c6537Arr = (C6537[]) arrayList6.toArray(new C6537[0]);
                this.f79327 = c6537Arr;
                long[][] jArr = new long[c6537Arr.length][];
                int[] iArr = new int[c6537Arr.length];
                long[] jArr2 = new long[c6537Arr.length];
                boolean[] zArr = new boolean[c6537Arr.length];
                for (int i13 = 0; i13 < c6537Arr.length; i13++) {
                    jArr[i13] = new long[c6537Arr[i13].f21972.f30829];
                    jArr2[i13] = c6537Arr[i13].f21972.f30827[0];
                }
                int i14 = 0;
                long j5 = 0;
                while (i14 < c6537Arr.length) {
                    long j6 = C25227.FOREVER_NS;
                    int i15 = -1;
                    for (int i16 = 0; i16 < c6537Arr.length; i16++) {
                        if (!zArr[i16]) {
                            long j7 = jArr2[i16];
                            if (j7 <= j6) {
                                i15 = i16;
                                j6 = j7;
                            }
                        }
                    }
                    int i17 = iArr[i15];
                    long[] jArr3 = jArr[i15];
                    jArr3[i17] = j5;
                    C9518 c9519 = c6537Arr[i15].f21972;
                    j5 += (long) c9519.f30828[i17];
                    int i18 = i17 + 1;
                    iArr[i15] = i18;
                    if (i18 < jArr3.length) {
                        jArr2[i15] = c9519.f30827[i18];
                    } else {
                        zArr[i15] = true;
                        i14++;
                    }
                }
                this.f79323 = jArr;
                this.f79331.mo16661();
                this.f79331.mo16659(this);
                arrayDeque.clear();
                if (!this.f79340) {
                    this.f79325 = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((C22605) arrayDeque2.peek()).f73060.add(c22605);
            }
        }
        if (this.f79325 != 2) {
            this.f79325 = 0;
            this.f79345 = 0;
        }
    }
}
