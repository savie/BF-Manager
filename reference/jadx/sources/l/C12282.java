package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Date;

/* JADX INFO: renamed from: l.۫۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I9X8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12282 extends AbstractC6240 implements InterfaceC4207 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f41062 = C13488.m32997(C12282.class);

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public EnumC16245 f41063;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f41064;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f41065;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f41066;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f41067;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f41068;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public byte[] f41069;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f41070;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public long f41071;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f41072;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f41073;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f41074;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC20043[] f41075;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۙ */
    public final void mo11863(InterfaceC9522 interfaceC9522) {
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ܰ */
    public final void mo11870(InterfaceC3314 interfaceC3314) {
    }

    public C12282(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
        this.f41068 = new byte[16];
        this.f41070 = -1;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final int m30520() {
        return this.f41073;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m30522() {
        return this.f41068;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ֨ */
    public final EnumC16245 mo11862() {
        return this.f41063;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final int m30524() {
        return this.f41070;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final int m30519() {
        return this.f41072;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int m30523() {
        return this.f41065;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m30521() {
        return this.f41069;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۛ */
    public final int mo11866() {
        return this.f41067;
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final int m30518() {
        return this.f41074;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo11869(int i) {
        return (this.f41065 & i) == i;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo11868() {
        m31354().getClass();
        return mo11869(1);
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11864(InterfaceC19067 interfaceC19067) {
        return m31354().equals(interfaceC19067.mo29449());
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11865(InterfaceC19067 interfaceC19067, InterfaceC13381 interfaceC13381) {
        if (mo17295() && m31351() == 0) {
            boolean zMo18580 = interfaceC13381.mo18580();
            InterfaceC4314 interfaceC4314 = f41062;
            if (!zMo18580 || mo11867()) {
                if (this.f41073 == 767) {
                    interfaceC4314.mo12119("Server returned ANY dialect");
                    return false;
                }
                C16515 c16515 = (C16515) interfaceC13381;
                EnumC16245 enumC16245 = null;
                for (EnumC16245 enumC16246 : EnumC16245.values()) {
                    if (enumC16246.m38367() && enumC16246.m38365() == this.f41073) {
                        enumC16245 = enumC16246;
                    }
                }
                if (enumC16245 == null) {
                    interfaceC4314.mo12119("Server returned an unknown dialect");
                    return false;
                }
                if (!enumC16245.m38366(((C9895) m31354()).m25058()) || !enumC16245.m38368(((C9895) m31354()).m25076())) {
                    interfaceC4314.mo12119("Server selected an disallowed dialect version " + enumC16245 + " (min: " + ((C9895) m31354()).m25058() + " max: " + ((C9895) m31354()).m25076() + MotionUtils.EASING_TYPE_FORMAT_END);
                    return false;
                }
                this.f41063 = enumC16245;
                int iM38832 = c16515.m38832() & this.f41072;
                this.f41065 = iM38832;
                if ((iM38832 & 64) != 0) {
                    interfaceC19067.mo29449().getClass();
                }
                int i = 1;
                if (this.f41063.m38366(EnumC16245.SMB311)) {
                    int i2 = this.f41065;
                    InterfaceC20043[] interfaceC20043Arr = this.f41075;
                    if (interfaceC20043Arr == null || interfaceC20043Arr.length == 0) {
                        interfaceC4314.mo12119("Response lacks negotiate contexts");
                        return false;
                    }
                    int length = interfaceC20043Arr.length;
                    int i3 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    while (i3 < length) {
                        InterfaceC20043 interfaceC20043 = interfaceC20043Arr[i3];
                        if (interfaceC20043 != null) {
                            if (!z2 && interfaceC20043.mo1804() == 2) {
                                C20748 c20748 = (C20748) interfaceC20043;
                                if (c20748.m46750() == null || c20748.m46750().length != i) {
                                    interfaceC4314.mo12119("Server returned no cipher selection");
                                    return false;
                                }
                                C20748 c20749 = null;
                                for (InterfaceC15810 interfaceC15810 : c16515.m38834()) {
                                    if (interfaceC15810 instanceof C20748) {
                                        c20749 = (C20748) interfaceC15810;
                                    }
                                }
                                if (c20749 == null) {
                                    return false;
                                }
                                int[] iArrM46750 = c20749.m46750();
                                boolean z3 = false;
                                for (int i4 : iArrM46750) {
                                    if (i4 == c20748.m46750()[0]) {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    int i5 = c20748.m46750()[0];
                                    z2 = true;
                                } else {
                                    interfaceC4314.mo12119("Server returned invalid cipher selection");
                                    return false;
                                }
                            } else {
                                if (interfaceC20043.mo1804() == 2) {
                                    interfaceC4314.mo12119("Multiple encryption negotiate contexts");
                                    return false;
                                }
                                if (!z && interfaceC20043.mo1804() == 1) {
                                    C0286 c0286 = (C0286) interfaceC20043;
                                    if (c0286.m1807() == null || c0286.m1807().length != 1) {
                                        interfaceC4314.mo12119("Server returned no hash selection");
                                        return false;
                                    }
                                    C0286 c0287 = null;
                                    for (InterfaceC15810 interfaceC15811 : c16515.m38834()) {
                                        if (interfaceC15811 instanceof C0286) {
                                            c0287 = (C0286) interfaceC15811;
                                        }
                                    }
                                    if (c0287 != null) {
                                        int[] iArrM1807 = c0287.m1807();
                                        boolean z4 = false;
                                        for (int i6 : iArrM1807) {
                                            if (i6 == c0286.m1807()[0]) {
                                                z4 = true;
                                            }
                                        }
                                        if (z4) {
                                            this.f41070 = c0286.m1807()[0];
                                            z = true;
                                        } else {
                                            interfaceC4314.mo12119("Server returned invalid hash selection");
                                            return false;
                                        }
                                    }
                                } else if (interfaceC20043.mo1804() == 1) {
                                    interfaceC4314.mo12119("Multiple preauth negotiate contexts");
                                    return false;
                                }
                            }
                        }
                        i3++;
                        i = 1;
                    }
                    if (!z) {
                        interfaceC4314.mo12119("Missing preauth negotiate context");
                        return false;
                    }
                    if (!z2 && (i2 & 64) != 0) {
                        interfaceC4314.mo12119("Missing encryption negotiate context");
                        return false;
                    }
                    if (!z2) {
                        interfaceC4314.mo12135("No encryption support");
                    }
                }
                int iM25063 = ((C9895) interfaceC19067.mo29449()).m25063();
                this.f41066 = Math.min(iM25063 - 80, Math.min(((C9895) interfaceC19067.mo29449()).m25084(), this.f41066)) & (-8);
                this.f41064 = Math.min(iM25063 - 112, Math.min(((C9895) interfaceC19067.mo29449()).m25059(), this.f41064)) & (-8);
                this.f41067 = Math.min(iM25063 - 512, this.f41067) & (-8);
                return true;
            }
            interfaceC4314.mo12119("Signing is enforced but server does not allow it");
            return false;
        }
        return false;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ܶ */
    public final int mo11871() {
        return this.f41066;
    }

    @Override // l.InterfaceC4207
    public final int getSendBufferSize() {
        return this.f41064;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo11867() {
        return (this.f41074 & 1) != 0;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo11873() {
        return (this.f41074 & 2) != 0;
    }

    @Override // l.InterfaceC4207
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo11872() {
        return mo11873();
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) throws C2796 {
        InterfaceC20043 c0286;
        if (C4850.m13545(i, bArr) != 65) {
            throw new C2796("Structure size is not 65");
        }
        this.f41074 = C4850.m13545(i + 2, bArr);
        this.f41073 = C4850.m13545(i + 4, bArr);
        int iM13545 = C4850.m13545(i + 6, bArr);
        System.arraycopy(bArr, i + 8, this.f41068, 0, 16);
        this.f41072 = C4850.m13549(i + 24, bArr);
        this.f41067 = C4850.m13549(i + 28, bArr);
        this.f41066 = C4850.m13549(i + 32, bArr);
        this.f41064 = C4850.m13549(i + 36, bArr);
        this.f41071 = C4850.m13543(i + 40, bArr);
        C4850.m13543(i + 48, bArr);
        int iM13546 = C4850.m13545(i + 56, bArr);
        int iM13547 = C4850.m13545(i + 58, bArr);
        int iM13549 = C4850.m13549(i + 60, bArr);
        int i2 = i + 64;
        int iM31366 = m31366();
        int i3 = iM13546 + iM31366;
        if (i3 + iM13547 < bArr.length) {
            byte[] bArr2 = new byte[iM13547];
            this.f41069 = bArr2;
            System.arraycopy(bArr, i3, bArr2, 0, iM13547);
            i2 += iM13547;
        }
        int i4 = ((i2 - iM31366) % 8) + i2;
        if (this.f41073 != 785 || iM13549 == 0 || iM13545 == 0) {
            return i4 - i;
        }
        int iM31367 = m31366() + iM13549;
        InterfaceC20043[] interfaceC20043Arr = new InterfaceC20043[iM13545];
        for (int i5 = 0; i5 < iM13545; i5++) {
            int iM13548 = C4850.m13545(iM31367, bArr);
            int iM135410 = C4850.m13545(iM31367 + 2, bArr);
            int i6 = iM31367 + 8;
            if (iM13548 != 1) {
                c0286 = iM13548 != 2 ? null : new C20748();
            } else {
                c0286 = new C0286();
            }
            if (c0286 != null) {
                c0286.mo1805(i6, iM135410, bArr);
                interfaceC20043Arr[i5] = c0286;
            }
            iM31367 = i6 + iM135410;
            if (i5 != iM13545 - 1) {
                iM31367 += m31338(iM31367);
            }
        }
        this.f41075 = interfaceC20043Arr;
        return Math.max(i4, iM31367) - i;
    }

    @Override // l.AbstractC12591
    public final String toString() {
        StringBuilder sb = new StringBuilder("Smb2NegotiateResponse[");
        sb.append(super.toString());
        sb.append(",dialectRevision=");
        sb.append(this.f41073);
        sb.append(",securityMode=0x");
        C18855.m43491(this.f41074, 1, ",capabilities=0x", sb);
        sb.append(C5993.m16280(this.f41072, 8));
        sb.append(",serverTime=");
        sb.append(new Date(this.f41071));
        return new String(sb.toString());
    }
}
