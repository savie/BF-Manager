package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۢ᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8N2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9858 implements InterfaceC10045, InterfaceC6599 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f33667;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f33668;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2095[] f33669;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f33670;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f33671;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long[][] f33672;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f33673;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f33674;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f33675;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f33676;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C21664 f33677;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C2460 f33678;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f33679;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2696 f33680;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2460 f33681;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2460 f33682;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f33683;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2460 f33684;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13302 f33685;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f33686;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f33687;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f33688;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f33689;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f33690;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC22433 f33691 = AbstractC22433.of();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C2460 f33692;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f33693;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f33694;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f33695;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f33696;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f33697;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f33698;

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return true;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    public C9858(InterfaceC13302 interfaceC13302, int i) {
        this.f33685 = interfaceC13302;
        this.f33695 = i;
        this.f33679 = (i & 4) != 0 ? 3 : 0;
        this.f33680 = new C2696();
        this.f33698 = new ArrayList();
        this.f33681 = new C2460(16);
        this.f33683 = new ArrayDeque();
        this.f33678 = new C2460(C11551.f38845);
        this.f33692 = new C2460(6);
        this.f33682 = new C2460();
        this.f33688 = -1;
        this.f33675 = InterfaceC15690.f50940;
        this.f33669 = new C2095[0];
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        InterfaceC17888 interfaceC17888M15223 = C5519.m15223(interfaceC7222, (this.f33695 & 2) != 0);
        this.f33691 = interfaceC17888M15223 != null ? AbstractC22433.of((Object) interfaceC17888M15223) : AbstractC22433.of();
        return interfaceC17888M15223 == null;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return this.f33691;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        if ((this.f33695 & 16) == 0) {
            interfaceC15690 = new C23180(interfaceC15690, this.f33685);
        }
        this.f33675 = interfaceC15690;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        this.f33683.clear();
        this.f33670 = 0;
        this.f33688 = -1;
        this.f33694 = 0;
        this.f33687 = 0;
        this.f33693 = 0;
        this.f33690 = false;
        if (j == 0) {
            if (this.f33679 == 3) {
                this.f33680.m8228();
                this.f33698.clear();
                return;
            } else {
                this.f33679 = 0;
                this.f33670 = 0;
                return;
            }
        }
        for (C2095 c2095 : this.f33669) {
            C4107 c4107 = c2095.f7734;
            int iM41855 = C17983.m41855(c4107.f15049, j2, false);
            while (true) {
                if (iM41855 < 0) {
                    iM41855 = -1;
                    break;
                } else if ((c4107.f15055[iM41855] & 1) != 0) {
                    break;
                } else {
                    iM41855--;
                }
            }
            if (iM41855 == -1) {
                iM41855 = c4107.m11658(j2);
            }
            c2095.f7737 = iM41855;
            C19300 c19300 = c2095.f7733;
            if (c19300 != null) {
                c19300.m44285();
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
    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        C0954 c0955;
        long j;
        long length;
        C10223 c10223;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        long j5;
        boolean z;
        C22453 c22453;
        C2460 c2460;
        int[] iArr;
        int[] iArr2;
        int i3;
        boolean z2;
        char c;
        int i4;
        C19300 c19300;
        long j6;
        int i5;
        int i6;
        int i7;
        C2460 c2461;
        byte[] bArrM7518;
        int i8;
        int i9;
        int iM28849;
        int i10;
        int iM7499;
        C7648 c7648;
        C14797 c14797;
        boolean z3;
        boolean z4;
        int i11;
        C0954 c0956 = c0954;
        while (true) {
            int i12 = this.f33679;
            ArrayDeque arrayDeque = this.f33683;
            int i13 = this.f33695;
            C2460 c2462 = this.f33682;
            if (i12 == 0) {
                c0955 = c0956;
                int i14 = this.f33670;
                C2460 c2463 = this.f33681;
                if (i14 == 0) {
                    if (interfaceC7222.mo19212(true, 0, 8, c2463.m7518())) {
                        this.f33670 = 8;
                        c2463.m7510(0);
                        this.f33673 = c2463.m7532();
                        this.f33696 = c2463.m7499();
                        j = this.f33673;
                        if (j == 1) {
                            interfaceC7222.readFully(c2463.m7518(), 8, 8);
                            this.f33670 += 8;
                            this.f33673 = c2463.m7526();
                        } else if (j == 0) {
                            length = interfaceC7222.getLength();
                            if (length == -1) {
                                length = c10223.f34898;
                            }
                            if (length != -1) {
                                this.f33673 = (length - interfaceC7222.getPosition()) + ((long) this.f33670);
                            }
                        }
                        j2 = this.f33673;
                        i = this.f33670;
                        if (j2 >= i) {
                            throw C22861.m50611("Atom size less than header length (unsupported).");
                        }
                        i2 = this.f33696;
                        if (i2 != 1836019574) {
                            long position = interfaceC7222.getPosition();
                            j3 = this.f33673;
                            j4 = this.f33670;
                            j5 = (position + j3) - j4;
                            if (j3 != j4) {
                                c2462.m7517(8);
                                interfaceC7222.mo19210(0, 8, c2462.m7518());
                                C20441.m46236(c2462);
                                interfaceC7222.mo19214(c2462.m7500());
                                interfaceC7222.mo19217();
                            }
                            arrayDeque.push(new C10223(this.f33696, j5));
                            if (this.f33673 != this.f33670) {
                                this.f33679 = 0;
                                this.f33670 = 0;
                            } else {
                                m24959(j5);
                            }
                        } else {
                            long position2 = interfaceC7222.getPosition();
                            j3 = this.f33673;
                            j4 = this.f33670;
                            j5 = (position2 + j3) - j4;
                            if (j3 != j4) {
                                c2462.m7517(8);
                                interfaceC7222.mo19210(0, 8, c2462.m7518());
                                C20441.m46236(c2462);
                                interfaceC7222.mo19214(c2462.m7500());
                                interfaceC7222.mo19217();
                            }
                            arrayDeque.push(new C10223(this.f33696, j5));
                            if (this.f33673 != this.f33670) {
                                this.f33679 = 0;
                                this.f33670 = 0;
                            } else {
                                m24959(j5);
                            }
                        }
                        z = true;
                    } else {
                        if (this.f33697 == 2 && (i13 & 2) != 0) {
                            InterfaceC8011 interfaceC8011Mo7684 = this.f33675.mo7684(0, 4);
                            C21664 c21664 = this.f33677;
                            C0987 c0987 = c21664 == null ? null : new C0987(c21664);
                            C10471 c10471 = new C10471();
                            c10471.m26504(c0987);
                            interfaceC8011Mo7684.mo8116(c10471.m26497());
                            this.f33675.mo7696();
                            this.f33675.mo7690(new C3776(-9223372036854775807L));
                        }
                        z = false;
                    }
                } else {
                    j = this.f33673;
                    if (j == 1) {
                        interfaceC7222.readFully(c2463.m7518(), 8, 8);
                        this.f33670 += 8;
                        this.f33673 = c2463.m7526();
                    } else if (j == 0) {
                        length = interfaceC7222.getLength();
                        if (length == -1 && (c10223 = (C10223) arrayDeque.peek()) != null) {
                            length = c10223.f34898;
                        }
                        if (length != -1) {
                            this.f33673 = (length - interfaceC7222.getPosition()) + ((long) this.f33670);
                        }
                    }
                    j2 = this.f33673;
                    i = this.f33670;
                    if (j2 >= i) {
                        throw C22861.m50611("Atom size less than header length (unsupported).");
                    }
                    i2 = this.f33696;
                    if (i2 != 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473 || i2 == 1635284069) {
                        long position3 = interfaceC7222.getPosition();
                        j3 = this.f33673;
                        j4 = this.f33670;
                        j5 = (position3 + j3) - j4;
                        if (j3 != j4 && this.f33696 == 1835365473) {
                            c2462.m7517(8);
                            interfaceC7222.mo19210(0, 8, c2462.m7518());
                            C20441.m46236(c2462);
                            interfaceC7222.mo19214(c2462.m7500());
                            interfaceC7222.mo19217();
                        }
                        arrayDeque.push(new C10223(this.f33696, j5));
                        if (this.f33673 != this.f33670) {
                            this.f33679 = 0;
                            this.f33670 = 0;
                        } else {
                            m24959(j5);
                        }
                    } else if (i2 == 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124) {
                        C2023.m6510(i == 8);
                        C2023.m6510(this.f33673 <= 2147483647L);
                        C2460 c2464 = new C2460((int) this.f33673);
                        System.arraycopy(c2463.m7518(), 0, c2464.m7518(), 0, 8);
                        this.f33684 = c2464;
                        this.f33679 = 1;
                    } else {
                        long position4 = interfaceC7222.getPosition();
                        long j7 = this.f33670;
                        long j8 = position4 - j7;
                        if (this.f33696 == 1836086884) {
                            this.f33677 = new C21664(0L, j8, -9223372036854775807L, j8 + j7, this.f33673 - j7);
                        }
                        this.f33684 = null;
                        this.f33679 = 1;
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
                        this.f33680.m8229(interfaceC7222, c0956, this.f33698);
                        if (c0956.f3770 != 0) {
                            return 1;
                        }
                        this.f33679 = 0;
                        this.f33670 = 0;
                        return 1;
                    }
                    long position5 = interfaceC7222.getPosition();
                    if (this.f33688 == -1) {
                        boolean z5 = true;
                        int i15 = 0;
                        long j9 = C17492.FOREVER_NS;
                        boolean z6 = true;
                        long j10 = C17492.FOREVER_NS;
                        int i16 = -1;
                        int i17 = -1;
                        long j11 = C17492.FOREVER_NS;
                        while (true) {
                            C2095[] c2095Arr = this.f33669;
                            if (i15 >= c2095Arr.length) {
                                break;
                            }
                            C2095 c2095 = c2095Arr[i15];
                            int i18 = c2095.f7737;
                            C4107 c4107 = c2095.f7734;
                            if (i18 != c4107.f15052) {
                                long j12 = c4107.f15050[i18];
                                long[][] jArr = this.f33672;
                                String str = C17983.f57504;
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
                        int i19 = (j9 == C17492.FOREVER_NS || !z6 || j10 < j9 + 10485760) ? i17 : i16;
                        this.f33688 = i19;
                        if (i19 == -1) {
                            return -1;
                        }
                    }
                    C2095 c2096 = this.f33669[this.f33688];
                    InterfaceC8011 interfaceC8011 = c2096.f7739;
                    C4107 c4108 = c2096.f7734;
                    C22453 c22454 = c2096.f7736;
                    int i20 = c2096.f7737;
                    long[] jArr2 = c4108.f15050;
                    int[] iArr3 = c4108.f15055;
                    int[] iArr4 = c4108.f15056;
                    long j15 = jArr2[i20];
                    C2460 c2465 = c2462;
                    long j16 = j15 + this.f33667;
                    int length2 = iArr4[i20];
                    C19300 c19301 = c2096.f7733;
                    long j17 = (j16 - position5) + ((long) this.f33694);
                    if (j17 < 0 || j17 >= 262144) {
                        c0954.f3770 = j16;
                        return 1;
                    }
                    int i21 = c22454.f73306;
                    int i22 = c22454.f73296;
                    if (i21 == 1) {
                        j17 += 8;
                        length2 -= 8;
                    }
                    interfaceC7222.mo19214((int) j17);
                    if (c2096.f7738 && this.f33694 == 0 && this.f33687 == 0 && this.f33693 == 0 && (iArr3[i20] & 1) != 0) {
                        if (length2 > 4194304) {
                            c2096.f7738 = false;
                            c14797 = null;
                            i13 = i13;
                            i22 = i22;
                            c22453 = c22454;
                            c2460 = c2465;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            i3 = i20;
                        } else {
                            byte[] bArr = new byte[length2];
                            try {
                                interfaceC7222.mo19210(0, length2, bArr);
                                interfaceC7222.mo19217();
                                if (i22 <= 0 || i22 > 4) {
                                    c22453 = c22454;
                                    c2460 = c2465;
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
                                                c22453 = c22454;
                                                c2460 = c2465;
                                            } else {
                                                int i26 = 0;
                                                c2460 = c2465;
                                                int i27 = 0;
                                                while (i27 < i22) {
                                                    i26 = (i26 << 8) | (bArr[i25 + i27] & 255);
                                                    i27++;
                                                    c22454 = c22454;
                                                }
                                                c22453 = c22454;
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
                                                    c2465 = c2460;
                                                    c22454 = c22453;
                                                }
                                            }
                                        } else {
                                            c22453 = c22454;
                                            c2460 = c2465;
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
                                                    byte[] bArr4 = C11551.f38845;
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
                                                c14797 = new C14797(bArr3, bArr2);
                                            }
                                            c2096.f7738 = false;
                                        }
                                    }
                                }
                                iArr2 = iArr4;
                                i3 = i20;
                                c14797 = null;
                                c2096.f7738 = false;
                            } catch (Throwable th) {
                                interfaceC7222.mo19217();
                                throw th;
                            }
                        }
                        if (c14797 != null) {
                            byte[] bArr5 = c14797.f48386;
                            C10471 c10471M20201 = c2096.f7735.m20201();
                            c10471M20201.m26503((List) AbstractC22433.of((Object) c14797.f48385));
                            C7648 c7648M26497 = c10471M20201.m26497();
                            c2096.f7735 = c7648M26497;
                            interfaceC8011.mo8116(c7648M26497);
                            interfaceC8011.mo8112(bArr5.length, new C2460(bArr5));
                            interfaceC7222.mo19214(length2);
                            this.f33694 = length2;
                            this.f33687 = bArr5.length;
                            length2 = bArr5.length;
                            this.f33693 = 0;
                            z2 = true;
                            this.f33690 = true;
                        }
                        if (z2) {
                            c = 1;
                        } else {
                            c7648 = c2096.f7735;
                            if (C13638.equals(c7648.f25265, "video/avc") ? !C13638.equals(c7648.f25265, "video/hevc") || (i13 & 128) == 0 : (i13 & 32) == 0) {
                                c = 1;
                                this.f33690 = true;
                            } else {
                                c = 1;
                            }
                        }
                        if (!z2) {
                            i4 = length2;
                            c19300 = c19301;
                        } else if (i22 != 0) {
                            c2461 = this.f33692;
                            bArrM7518 = c2461.m7518();
                            bArrM7518[0] = 0;
                            bArrM7518[c] = 0;
                            bArrM7518[2] = 0;
                            i8 = 4 - i22;
                            length2 += i8;
                            while (this.f33687 < length2) {
                                i9 = this.f33693;
                                if (i9 == 0) {
                                    if (!this.f33690 || C11551.m28849(c2096.f7735) + i22 > iArr2[i3] - this.f33694) {
                                        iM28849 = 0;
                                        i10 = i22;
                                    } else {
                                        iM28849 = C11551.m28849(c2096.f7735);
                                        i10 = i22 + iM28849;
                                    }
                                    interfaceC7222.readFully(bArrM7518, i8, i10);
                                    this.f33694 += i10;
                                    c2461.m7510(0);
                                    iM7499 = c2461.m7499();
                                    if (iM7499 >= 0) {
                                        throw C22861.m50610("Invalid NAL length", (Throwable) null);
                                    }
                                    this.f33693 = iM7499 - iM28849;
                                    C2460 c2466 = this.f33678;
                                    c2466.m7510(0);
                                    interfaceC8011.mo8112(4, c2466);
                                    this.f33687 += 4;
                                    if (iM28849 > 0) {
                                        interfaceC8011.mo8112(iM28849, c2461);
                                        this.f33687 += iM28849;
                                        if (C11551.m28856(bArrM7518, iM28849, c2096.f7735)) {
                                            this.f33690 = true;
                                        }
                                    }
                                } else {
                                    int iMo8111 = interfaceC8011.mo8111((InterfaceC6942) interfaceC7222, i9, false);
                                    this.f33694 += iMo8111;
                                    this.f33687 += iMo8111;
                                    this.f33693 -= iMo8111;
                                }
                            }
                            i4 = length2;
                            c19300 = c19301;
                        } else {
                            if ("audio/ac4".equals(c22453.f73295.f25265)) {
                                if (this.f33687 == 0) {
                                    C2460 c2467 = c2460;
                                    C9609.m24511(length2, c2467);
                                    interfaceC8011.mo8112(7, c2467);
                                    this.f33687 += 7;
                                }
                                length2 += 7;
                                c19300 = c19301;
                            } else if (c19301 != null) {
                                c19300 = c19301;
                                c19300.m44286(interfaceC7222);
                            }
                            c19300 = c19301;
                            while (true) {
                                i7 = this.f33687;
                                if (i7 < length2) {
                                    break;
                                }
                                int iMo8112 = interfaceC8011.mo8111((InterfaceC6942) interfaceC7222, length2 - i7, false);
                                this.f33694 += iMo8112;
                                this.f33687 += iMo8112;
                                this.f33693 -= iMo8112;
                            }
                            i4 = length2;
                        }
                        j6 = c4108.f15049[i3];
                        i5 = iArr[i3];
                        if (!this.f33690) {
                            i5 |= 67108864;
                        }
                        if (c19300 != null) {
                            c19300.m44287(interfaceC8011, j6, i5, i4, 0, null);
                            i6 = 1;
                            if (i3 + 1 == c4108.f15052) {
                                c19300.m44288(interfaceC8011, null);
                            }
                        } else {
                            interfaceC8011.mo8114(j6, i5, i4, 0, null);
                            i6 = 1;
                        }
                        c2096.f7737 += i6;
                        this.f33688 = -1;
                        this.f33694 = 0;
                        this.f33687 = 0;
                        this.f33693 = 0;
                        this.f33690 = false;
                        return 0;
                    }
                    i13 = i13;
                    i22 = i22;
                    c22453 = c22454;
                    c2460 = c2465;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    i3 = i20;
                    z2 = false;
                    if (z2) {
                        c7648 = c2096.f7735;
                        if (C13638.equals(c7648.f25265, "video/avc")) {
                            c = 1;
                            this.f33690 = true;
                        } else {
                            c = 1;
                            this.f33690 = true;
                        }
                    } else {
                        c = 1;
                    }
                    if (!z2) {
                        i4 = length2;
                        c19300 = c19301;
                    } else if (i22 != 0) {
                        c2461 = this.f33692;
                        bArrM7518 = c2461.m7518();
                        bArrM7518[0] = 0;
                        bArrM7518[c] = 0;
                        bArrM7518[2] = 0;
                        i8 = 4 - i22;
                        length2 += i8;
                        while (this.f33687 < length2) {
                            i9 = this.f33693;
                            if (i9 == 0) {
                                if (this.f33690) {
                                    iM28849 = 0;
                                    i10 = i22;
                                } else {
                                    iM28849 = 0;
                                    i10 = i22;
                                }
                                interfaceC7222.readFully(bArrM7518, i8, i10);
                                this.f33694 += i10;
                                c2461.m7510(0);
                                iM7499 = c2461.m7499();
                                if (iM7499 >= 0) {
                                    throw C22861.m50610("Invalid NAL length", (Throwable) null);
                                }
                                this.f33693 = iM7499 - iM28849;
                                C2460 c2468 = this.f33678;
                                c2468.m7510(0);
                                interfaceC8011.mo8112(4, c2468);
                                this.f33687 += 4;
                                if (iM28849 > 0) {
                                    interfaceC8011.mo8112(iM28849, c2461);
                                    this.f33687 += iM28849;
                                    if (C11551.m28856(bArrM7518, iM28849, c2096.f7735)) {
                                        this.f33690 = true;
                                    }
                                }
                            } else {
                                int iMo8113 = interfaceC8011.mo8111((InterfaceC6942) interfaceC7222, i9, false);
                                this.f33694 += iMo8113;
                                this.f33687 += iMo8113;
                                this.f33693 -= iMo8113;
                            }
                        }
                        i4 = length2;
                        c19300 = c19301;
                    } else {
                        if ("audio/ac4".equals(c22453.f73295.f25265)) {
                            if (this.f33687 == 0) {
                                C2460 c2469 = c2460;
                                C9609.m24511(length2, c2469);
                                interfaceC8011.mo8112(7, c2469);
                                this.f33687 += 7;
                            }
                            length2 += 7;
                            c19300 = c19301;
                        } else if (c19301 != null) {
                            c19300 = c19301;
                            c19300.m44286(interfaceC7222);
                        }
                        c19300 = c19301;
                        while (true) {
                            i7 = this.f33687;
                            if (i7 < length2) {
                                break;
                                break;
                            }
                            int iMo8114 = interfaceC8011.mo8111((InterfaceC6942) interfaceC7222, length2 - i7, false);
                            this.f33694 += iMo8114;
                            this.f33687 += iMo8114;
                            this.f33693 -= iMo8114;
                        }
                        i4 = length2;
                    }
                    j6 = c4108.f15049[i3];
                    i5 = iArr[i3];
                    if (!this.f33690) {
                        i5 |= 67108864;
                    }
                    if (c19300 != null) {
                        c19300.m44287(interfaceC8011, j6, i5, i4, 0, null);
                        i6 = 1;
                        if (i3 + 1 == c4108.f15052) {
                            c19300.m44288(interfaceC8011, null);
                        }
                    } else {
                        interfaceC8011.mo8114(j6, i5, i4, 0, null);
                        i6 = 1;
                    }
                    c2096.f7737 += i6;
                    this.f33688 = -1;
                    this.f33694 = 0;
                    this.f33687 = 0;
                    this.f33693 = 0;
                    this.f33690 = false;
                    return 0;
                }
                c0955 = c0956;
                long j18 = this.f33673 - ((long) this.f33670);
                long position6 = interfaceC7222.getPosition() + j18;
                C2460 c24610 = this.f33684;
                if (c24610 != null) {
                    interfaceC7222.readFully(c24610.m7518(), this.f33670, (int) j18);
                    if (this.f33696 == 1718909296) {
                        this.f33674 = true;
                        c24610.m7510(8);
                        int iM74910 = c24610.m7499();
                        if (iM74910 != 1751476579) {
                            i11 = iM74910 != 1903435808 ? 0 : 1;
                        } else {
                            i11 = 2;
                        }
                        if (i11 == 0) {
                            c24610.m7535(4);
                            do {
                                if (c24610.m7503() <= 0) {
                                    i11 = 0;
                                    break;
                                }
                                int iM74911 = c24610.m7499();
                                if (iM74911 != 1751476579) {
                                    i11 = iM74911 != 1903435808 ? 0 : 1;
                                } else {
                                    i11 = 2;
                                }
                            } while (i11 == 0);
                        }
                        this.f33697 = i11;
                    } else if (!arrayDeque.isEmpty()) {
                        ((C10223) arrayDeque.peek()).f34897.add(new C7400(this.f33696, c24610));
                    }
                } else {
                    if (!this.f33674 && this.f33696 == 1835295092) {
                        this.f33697 = 1;
                    }
                    if (j18 < 262144) {
                        interfaceC7222.mo19214((int) j18);
                    } else {
                        c0955.f3770 = interfaceC7222.getPosition() + j18;
                        z3 = true;
                    }
                    m24959(position6);
                    if (this.f33689) {
                        this.f33676 = true;
                        c0955.f3770 = this.f33668;
                        this.f33689 = false;
                        z3 = true;
                    }
                    if (z3 || this.f33679 == 2) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        return 1;
                    }
                }
                z3 = false;
                m24959(position6);
                if (this.f33689) {
                    this.f33676 = true;
                    c0955.f3770 = this.f33668;
                    this.f33689 = false;
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
            c0956 = c0955;
        }
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f33671;
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
    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        long jMin;
        long j2;
        long j3;
        int i;
        C2095[] c2095Arr;
        C22828 c22828;
        C4107 c4107;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int iM41855;
        int iM41856;
        int iM11658;
        long j4 = j;
        C2095[] c2095Arr2 = this.f33669;
        int length = c2095Arr2.length;
        C22828 c22829 = C22828.f74276;
        if (length == 0) {
            return new C12950(c22829, c22829);
        }
        int i2 = this.f33686;
        boolean z = false;
        int i3 = -1;
        long jMin2 = -1;
        if (i2 != -1) {
            C4107 c4108 = c2095Arr2[i2].f7734;
            long[] jArr3 = c4108.f15049;
            int iM41857 = C17983.m41855(jArr3, j4, false);
            while (true) {
                if (iM41857 < 0) {
                    iM41857 = -1;
                    break;
                }
                if ((c4108.f15055[iM41857] & 1) != 0) {
                    break;
                }
                iM41857--;
            }
            if (iM41857 == -1) {
                iM41857 = c4108.m11658(j4);
            }
            long[] jArr4 = c4108.f15050;
            if (iM41857 == -1) {
                return new C12950(c22829, c22829);
            }
            j2 = jArr3[iM41857];
            jMin = jArr4[iM41857];
            if (j2 >= j4 || iM41857 >= c4108.f15052 - 1 || (iM11658 = c4108.m11658(j4)) == -1 || iM11658 == iM41857) {
                j4 = j2;
            } else {
                j3 = jArr3[iM11658];
                jMin2 = jArr4[iM11658];
            }
            i = 0;
            while (true) {
                c2095Arr = this.f33669;
                if (i < c2095Arr.length) {
                    break;
                }
                if (i != this.f33686) {
                    c4107 = c2095Arr[i].f7734;
                    jArr = c4107.f15050;
                    iArr = c4107.f15055;
                    jArr2 = c4107.f15049;
                    iM41855 = C17983.m41855(jArr2, j2, z);
                    while (true) {
                        if (iM41855 >= 0) {
                            iM41855 = -1;
                            break;
                        }
                        if ((iArr[iM41855] & 1) != 0) {
                            break;
                        }
                        iM41855--;
                    }
                    if (iM41855 == i3) {
                        iM41855 = c4107.m11658(j2);
                    }
                    if (iM41855 != i3) {
                        jMin = Math.min(jArr[iM41855], jMin);
                    }
                    if (j3 != -9223372036854775807L) {
                        z = false;
                        iM41856 = C17983.m41855(jArr2, j3, false);
                        while (true) {
                            if (iM41856 >= 0) {
                                iM41856 = -1;
                                break;
                            }
                            if ((iArr[iM41856] & 1) != 0) {
                                break;
                            }
                            iM41856--;
                        }
                        if (iM41856 == -1) {
                            iM41856 = c4107.m11658(j3);
                        }
                        if (iM41856 == -1) {
                            jMin2 = Math.min(jArr[iM41856], jMin2);
                        }
                    } else {
                        z = false;
                    }
                }
                i++;
                i3 = -1;
            }
            c22828 = new C22828(j2, jMin);
            if (j3 == -9223372036854775807L) {
                return new C12950(c22828, c22828);
            }
            return new C12950(c22828, new C22828(j3, jMin2));
        }
        jMin = C17492.FOREVER_NS;
        j2 = j4;
        j3 = -9223372036854775807L;
        i = 0;
        while (true) {
            c2095Arr = this.f33669;
            if (i < c2095Arr.length) {
                break;
                break;
            }
            if (i != this.f33686) {
                c4107 = c2095Arr[i].f7734;
                jArr = c4107.f15050;
                iArr = c4107.f15055;
                jArr2 = c4107.f15049;
                iM41855 = C17983.m41855(jArr2, j2, z);
                while (true) {
                    if (iM41855 >= 0) {
                        iM41855 = -1;
                        break;
                    }
                    if ((iArr[iM41855] & 1) != 0) {
                        break;
                        break;
                    }
                    iM41855--;
                }
                if (iM41855 == i3) {
                    iM41855 = c4107.m11658(j2);
                }
                if (iM41855 != i3) {
                    jMin = Math.min(jArr[iM41855], jMin);
                }
                if (j3 != -9223372036854775807L) {
                    z = false;
                    iM41856 = C17983.m41855(jArr2, j3, false);
                    while (true) {
                        if (iM41856 >= 0) {
                            iM41856 = -1;
                            break;
                        }
                        if ((iArr[iM41856] & 1) != 0) {
                            break;
                            break;
                        }
                        iM41856--;
                    }
                    if (iM41856 == -1) {
                        iM41856 = c4107.m11658(j3);
                    }
                    if (iM41856 == -1) {
                        jMin2 = Math.min(jArr[iM41856], jMin2);
                    }
                } else {
                    z = false;
                }
            }
            i++;
            i3 = -1;
        }
        c22828 = new C22828(j2, jMin);
        if (j3 == -9223372036854775807L) {
            return new C12950(c22828, c22828);
        }
        return new C12950(c22828, new C22828(j3, jMin2));
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0002 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m24959(long j) {
        ArrayList arrayList;
        C0987 c0987M46233;
        ArrayDeque arrayDeque;
        C0987 c0987;
        ArrayList arrayList2;
        C2988 c2988;
        long j2;
        C0987 c0988;
        String str;
        ArrayList arrayList3;
        C19395 c19395M28232;
        int i;
        while (true) {
            ArrayDeque arrayDeque2 = this.f33683;
            if (arrayDeque2.isEmpty() || ((C10223) arrayDeque2.peek()).f34898 != j) {
                break;
            }
            C10223 c10223 = (C10223) arrayDeque2.pop();
            if (c10223.f67638 == 1836019574) {
                C10223 c10223M26006 = c10223.m26006(1835365473);
                ArrayList arrayList4 = new ArrayList();
                int i2 = this.f33695;
                if (c10223M26006 != null) {
                    c0987M46233 = C20441.m46233(c10223M26006);
                    if (this.f33676) {
                        C2023.m6508(c0987M46233);
                        C19395 c19395M28233 = C11269.m28232(c0987M46233, "auxiliary.tracks.interleaved");
                        if (c19395M28233 != null && c19395M28233.f62528[0] == 0) {
                            this.f33667 = this.f33668 + 16;
                        }
                        C19395 c19395M28234 = C11269.m28232(c0987M46233, "auxiliary.tracks.map");
                        C2023.m6508(c19395M28234);
                        ArrayList arrayListM44440 = c19395M28234.m44440();
                        ArrayList arrayList5 = new ArrayList(arrayListM44440.size());
                        for (int i3 = 0; i3 < arrayListM44440.size(); i3++) {
                            int iIntValue = ((Integer) arrayListM44440.get(i3)).intValue();
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
                        if (c0987M46233 != null && (i2 & 64) != 0 && (c19395M28232 = C11269.m28232(c0987M46233, "auxiliary.tracks.offset")) != null) {
                            long jM7526 = new C2460(c19395M28232.f62528).m7526();
                            if (jM7526 > 0) {
                                this.f33668 = jM7526;
                                this.f33689 = true;
                                arrayDeque = arrayDeque2;
                            }
                            arrayDeque.clear();
                            if (!this.f33689) {
                                this.f33679 = 2;
                            }
                        }
                        arrayList = arrayList4;
                    }
                } else {
                    arrayList = arrayList4;
                    c0987M46233 = null;
                }
                ArrayList arrayList6 = new ArrayList();
                boolean z = this.f33697 == 1;
                C2988 c2989 = new C2988();
                C7400 c7400M26005 = c10223.m26005(1969517665);
                if (c7400M26005 != null) {
                    C0987 c0987M46232 = C20441.m46232(c7400M26005);
                    c2989.m8941(c0987M46232);
                    c0987 = c0987M46232;
                } else {
                    c0987 = null;
                }
                C7400 c7400M26006 = c10223.m26005(1836476516);
                c7400M26006.getClass();
                C0987 c0989 = new C0987(C20441.m46238(c7400M26006.f24593));
                C2988 c29810 = c2989;
                ArrayList arrayListM46231 = C20441.m46231(c10223, c2989, -9223372036854775807L, null, (i2 & 1) != 0, z, new C0833());
                if (this.f33676) {
                    boolean z2 = arrayList.size() == arrayListM46231.size();
                    Locale locale = Locale.US;
                    C2023.m6509(C8015.m21119("The number of auxiliary track types from metadata (", arrayList.size(), ") is not same as the number of auxiliary tracks (", MotionUtils.EASING_TYPE_FORMAT_END, arrayListM46231.size()), z2);
                }
                String strM52813 = C23969.m52813(arrayListM46231);
                long j3 = -9223372036854775807L;
                int i4 = 0;
                int i5 = 0;
                int size = -1;
                while (i5 < arrayListM46231.size()) {
                    C4107 c4107 = (C4107) arrayListM46231.get(i5);
                    int i6 = c4107.f15052;
                    ArrayList arrayList7 = arrayListM46231;
                    int i7 = c4107.f15053;
                    if (i6 == 0) {
                        c2988 = c29810;
                        arrayList2 = arrayList;
                        str = strM52813;
                        ArrayList arrayList8 = arrayList6;
                        c0988 = c0987M46233;
                        arrayList3 = arrayList8;
                    } else {
                        C22453 c22453 = c4107.f15054;
                        ArrayList arrayList9 = arrayList6;
                        InterfaceC15690 interfaceC15690 = this.f33675;
                        int i8 = i4 + 1;
                        String str2 = strM52813;
                        int i9 = c22453.f73304;
                        C0987 c09810 = c0987M46233;
                        C7648 c7648 = c22453.f73295;
                        InterfaceC8011 interfaceC8011Mo7684 = interfaceC15690.mo7684(i4, i9);
                        C2095 c2095 = new C2095(c22453, c4107, interfaceC8011Mo7684);
                        C2988 c29811 = c29810;
                        ArrayList arrayList10 = arrayList;
                        long j4 = c22453.f73297;
                        if (j4 == -9223372036854775807L) {
                            j4 = c4107.f15051;
                        }
                        interfaceC8011Mo7684.mo8113(j4);
                        long jMax = Math.max(j3, j4);
                        int i10 = "audio/true-hd".equals(c7648.f25265) ? i7 * 16 : i7 + 30;
                        C10471 c10471M20201 = c7648.m20201();
                        c10471M20201.m26531(i10);
                        if (i9 == 2) {
                            int i11 = c7648.f25244;
                            if ((i2 & 8) != 0) {
                                i11 |= size == -1 ? 1 : 2;
                            }
                            if (this.f33676) {
                                i11 |= 32768;
                                arrayList2 = arrayList10;
                                c10471M20201.m26520(((Integer) arrayList2.get(i5)).intValue());
                            } else {
                                arrayList2 = arrayList10;
                            }
                            c10471M20201.m26513(i11);
                        } else {
                            arrayList2 = arrayList10;
                        }
                        if (i9 == 1) {
                            c2988 = c29811;
                            int i12 = c2988.f11217;
                            j2 = jMax;
                            if (i12 != -1 && c2988.f11218 != -1) {
                                c10471M20201.m26496(i12);
                                c10471M20201.m26510(c2988.f11218);
                            }
                        } else {
                            c2988 = c29811;
                            j2 = jMax;
                        }
                        C0987 c09811 = c7648.f25258;
                        ArrayList arrayList11 = this.f33698;
                        c0988 = c09810;
                        C11269.m28235(i9, c0988, c10471M20201, c09811, arrayList11.isEmpty() ? null : new C0987(arrayList11), c0987, c0989);
                        str = str2;
                        c10471M20201.m26521(str);
                        C7648 c7648M26497 = c10471M20201.m26497();
                        c2095.f7735 = c7648M26497;
                        c2095.f7738 = c22453.f73298 && c22453.f73296 != 0 && C13638.equals(c7648.f25265, "video/hevc");
                        interfaceC8011Mo7684.mo8116(c7648M26497);
                        if (i9 == 2 && size == -1) {
                            size = arrayList9.size();
                        }
                        arrayList3 = arrayList9;
                        arrayList3.add(c2095);
                        i4 = i8;
                        j3 = j2;
                    }
                    i5++;
                    strM52813 = str;
                    c29810 = c2988;
                    arrayList = arrayList2;
                    arrayListM46231 = arrayList7;
                    arrayDeque2 = arrayDeque2;
                    C0987 c09812 = c0988;
                    arrayList6 = arrayList3;
                    c0987M46233 = c09812;
                }
                arrayDeque = arrayDeque2;
                this.f33686 = size;
                this.f33671 = j3;
                C2095[] c2095Arr = (C2095[]) arrayList6.toArray(new C2095[0]);
                this.f33669 = c2095Arr;
                long[][] jArr = new long[c2095Arr.length][];
                int[] iArr = new int[c2095Arr.length];
                long[] jArr2 = new long[c2095Arr.length];
                boolean[] zArr = new boolean[c2095Arr.length];
                for (int i13 = 0; i13 < c2095Arr.length; i13++) {
                    jArr[i13] = new long[c2095Arr[i13].f7734.f15052];
                    jArr2[i13] = c2095Arr[i13].f7734.f15049[0];
                }
                int i14 = 0;
                long j5 = 0;
                while (i14 < c2095Arr.length) {
                    long j6 = C17492.FOREVER_NS;
                    int i15 = -1;
                    for (int i16 = 0; i16 < c2095Arr.length; i16++) {
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
                    C4107 c4108 = c2095Arr[i15].f7734;
                    j5 += (long) c4108.f15056[i17];
                    int i18 = i17 + 1;
                    iArr[i15] = i18;
                    if (i18 < jArr3.length) {
                        jArr2[i15] = c4108.f15049[i18];
                    } else {
                        zArr[i15] = true;
                        i14++;
                    }
                }
                this.f33672 = jArr;
                this.f33675.mo7696();
                this.f33675.mo7690(this);
                arrayDeque.clear();
                if (!this.f33689) {
                    this.f33679 = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((C10223) arrayDeque2.peek()).f34899.add(c10223);
            }
        }
        if (this.f33679 != 2) {
            this.f33679 = 0;
            this.f33670 = 0;
        }
    }
}
