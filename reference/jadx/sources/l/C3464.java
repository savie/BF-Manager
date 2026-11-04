package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Date;

/* JADX INFO: renamed from: l.ۗܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9X8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3464 extends AbstractC12108 implements InterfaceC8619 {

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f11984 = C16980.m40037(C3464.class);

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f11985;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f11986;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC17634[] f11987;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f11988;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f11989;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f11990;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public byte[] f11991;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public EnumC25270 f11992;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public long f11993;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f11994;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f11995;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f11996;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f11997;

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11400(InterfaceC17965 interfaceC17965) {
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo11415(InterfaceC21299 interfaceC21299) {
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        return 0;
    }

    public C3464(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878);
        this.f11989 = new byte[16];
        this.f11985 = -1;
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int m11408() {
        return this.f11994;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m11411() {
        return this.f11989;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC25270 mo11409() {
        return this.f11992;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final int m11399() {
        return this.f11985;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final int m11398() {
        return this.f11996;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int m11414() {
        return this.f11986;
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m11403() {
        return this.f11991;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int mo11405() {
        return this.f11988;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int m11416() {
        return this.f11995;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo11406(int i) {
        return (this.f11986 & i) == i;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean mo11404() {
        m10321().getClass();
        return mo11406(1);
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11401(InterfaceC23032 interfaceC23032) {
        return m10321().equals(interfaceC23032.mo2875());
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo11402(InterfaceC23032 interfaceC23032, InterfaceC2653 interfaceC2653) {
        if (mo12784() && m10323() == 0) {
            boolean zMo8797 = interfaceC2653.mo8797();
            InterfaceC25186 interfaceC25186 = f11984;
            if (!zMo8797 || mo11407()) {
                if (this.f11994 == 767) {
                    interfaceC25186.mo13699("Server returned ANY dialect");
                    return false;
                }
                C23602 c23602 = (C23602) interfaceC2653;
                EnumC25270 enumC25270 = null;
                for (EnumC25270 enumC25271 : EnumC25270.values()) {
                    if (enumC25271.m56408() && enumC25271.m56405() == this.f11994) {
                        enumC25270 = enumC25271;
                    }
                }
                if (enumC25270 == null) {
                    interfaceC25186.mo13699("Server returned an unknown dialect");
                    return false;
                }
                if (!enumC25270.m56406(((C14826) m10321()).m35720()) || !enumC25270.m56407(((C14826) m10321()).m35734())) {
                    interfaceC25186.mo13699("Server selected an disallowed dialect version " + enumC25270 + " (min: " + ((C14826) m10321()).m35720() + " max: " + ((C14826) m10321()).m35734() + MotionUtils.EASING_TYPE_FORMAT_END);
                    return false;
                }
                this.f11992 = enumC25270;
                int iM52846 = c23602.m52846() & this.f11996;
                this.f11986 = iM52846;
                if ((iM52846 & 64) != 0) {
                    interfaceC23032.mo2875().getClass();
                }
                int i = 1;
                if (this.f11992.m56406(EnumC25270.SMB311)) {
                    int i2 = this.f11986;
                    InterfaceC17634[] interfaceC17634Arr = this.f11987;
                    if (interfaceC17634Arr == null || interfaceC17634Arr.length == 0) {
                        interfaceC25186.mo13699("Response lacks negotiate contexts");
                        return false;
                    }
                    int length = interfaceC17634Arr.length;
                    int i3 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    while (i3 < length) {
                        InterfaceC17634 interfaceC17634 = interfaceC17634Arr[i3];
                        if (interfaceC17634 != null) {
                            if (!z2 && interfaceC17634.mo38322() == 2) {
                                C25094 c25094 = (C25094) interfaceC17634;
                                if (c25094.m55944() == null || c25094.m55944().length != i) {
                                    interfaceC25186.mo13699("Server returned no cipher selection");
                                    return false;
                                }
                                C25094 c25095 = null;
                                for (InterfaceC16888 interfaceC16888 : c23602.m52847()) {
                                    if (interfaceC16888 instanceof C25094) {
                                        c25095 = (C25094) interfaceC16888;
                                    }
                                }
                                if (c25095 == null) {
                                    return false;
                                }
                                int[] iArrM55944 = c25095.m55944();
                                boolean z3 = false;
                                for (int i4 : iArrM55944) {
                                    if (i4 == c25094.m55944()[0]) {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    int i5 = c25094.m55944()[0];
                                    z2 = true;
                                } else {
                                    interfaceC25186.mo13699("Server returned invalid cipher selection");
                                    return false;
                                }
                            } else {
                                if (interfaceC17634.mo38322() == 2) {
                                    interfaceC25186.mo13699("Multiple encryption negotiate contexts");
                                    return false;
                                }
                                if (!z && interfaceC17634.mo38322() == 1) {
                                    C16142 c16142 = (C16142) interfaceC17634;
                                    if (c16142.m38323() == null || c16142.m38323().length != 1) {
                                        interfaceC25186.mo13699("Server returned no hash selection");
                                        return false;
                                    }
                                    C16142 c16143 = null;
                                    for (InterfaceC16888 interfaceC16889 : c23602.m52847()) {
                                        if (interfaceC16889 instanceof C16142) {
                                            c16143 = (C16142) interfaceC16889;
                                        }
                                    }
                                    if (c16143 != null) {
                                        int[] iArrM38323 = c16143.m38323();
                                        boolean z4 = false;
                                        for (int i6 : iArrM38323) {
                                            if (i6 == c16142.m38323()[0]) {
                                                z4 = true;
                                            }
                                        }
                                        if (z4) {
                                            this.f11985 = c16142.m38323()[0];
                                            z = true;
                                        } else {
                                            interfaceC25186.mo13699("Server returned invalid hash selection");
                                            return false;
                                        }
                                    }
                                } else if (interfaceC17634.mo38322() == 1) {
                                    interfaceC25186.mo13699("Multiple preauth negotiate contexts");
                                    return false;
                                }
                            }
                        }
                        i3++;
                        i = 1;
                    }
                    if (!z) {
                        interfaceC25186.mo13699("Missing preauth negotiate context");
                        return false;
                    }
                    if (!z2 && (i2 & 64) != 0) {
                        interfaceC25186.mo13699("Missing encryption negotiate context");
                        return false;
                    }
                    if (!z2) {
                        interfaceC25186.mo13721("No encryption support");
                    }
                }
                int iM35717 = ((C14826) interfaceC23032.mo2875()).m35717();
                this.f11990 = Math.min(iM35717 - 80, Math.min(((C14826) interfaceC23032.mo2875()).m35714(), this.f11990)) & (-8);
                this.f11997 = Math.min(iM35717 - 112, Math.min(((C14826) interfaceC23032.mo2875()).m35711(), this.f11997)) & (-8);
                this.f11988 = Math.min(iM35717 - 512, this.f11988) & (-8);
                return true;
            }
            interfaceC25186.mo13699("Signing is enforced but server does not allow it");
            return false;
        }
        return false;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int mo11412() {
        return this.f11990;
    }

    @Override // l.InterfaceC8619
    public final int getSendBufferSize() {
        return this.f11997;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo11407() {
        return (this.f11995 & 1) != 0;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo11413() {
        return (this.f11995 & 2) != 0;
    }

    @Override // l.InterfaceC8619
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo11410() {
        return mo11413();
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) throws C19061 {
        InterfaceC17634 c16142;
        if (C0481.m2318(i, bArr) != 65) {
            throw new C19061("Structure size is not 65");
        }
        this.f11995 = C0481.m2318(i + 2, bArr);
        this.f11994 = C0481.m2318(i + 4, bArr);
        int iM2318 = C0481.m2318(i + 6, bArr);
        System.arraycopy(bArr, i + 8, this.f11989, 0, 16);
        this.f11996 = C0481.m2322(i + 24, bArr);
        this.f11988 = C0481.m2322(i + 28, bArr);
        this.f11990 = C0481.m2322(i + 32, bArr);
        this.f11997 = C0481.m2322(i + 36, bArr);
        this.f11993 = C0481.m2324(i + 40, bArr);
        C0481.m2324(i + 48, bArr);
        int iM2319 = C0481.m2318(i + 56, bArr);
        int iM23110 = C0481.m2318(i + 58, bArr);
        int iM2322 = C0481.m2322(i + 60, bArr);
        int i2 = i + 64;
        int iM10327 = m10327();
        int i3 = iM2319 + iM10327;
        if (i3 + iM23110 < bArr.length) {
            byte[] bArr2 = new byte[iM23110];
            this.f11991 = bArr2;
            System.arraycopy(bArr, i3, bArr2, 0, iM23110);
            i2 += iM23110;
        }
        int i4 = ((i2 - iM10327) % 8) + i2;
        if (this.f11994 != 785 || iM2322 == 0 || iM2318 == 0) {
            return i4 - i;
        }
        int iM10328 = m10327() + iM2322;
        InterfaceC17634[] interfaceC17634Arr = new InterfaceC17634[iM2318];
        for (int i5 = 0; i5 < iM2318; i5++) {
            int iM23111 = C0481.m2318(iM10328, bArr);
            int iM23112 = C0481.m2318(iM10328 + 2, bArr);
            int i6 = iM10328 + 8;
            if (iM23111 != 1) {
                c16142 = iM23111 != 2 ? null : new C25094();
            } else {
                c16142 = new C16142();
            }
            if (c16142 != null) {
                c16142.mo6138(i6, iM23112, bArr);
                interfaceC17634Arr[i5] = c16142;
            }
            iM10328 = i6 + iM23112;
            if (i5 != iM2318 - 1) {
                iM10328 += m10324(iM10328);
            }
        }
        this.f11987 = interfaceC17634Arr;
        return Math.max(i4, iM10328) - i;
    }

    @Override // l.AbstractC3159
    public final String toString() {
        StringBuilder sb = new StringBuilder("Smb2NegotiateResponse[");
        sb.append(super.toString());
        sb.append(",dialectRevision=");
        sb.append(this.f11994);
        sb.append(",securityMode=0x");
        C8008.m21876(this.f11995, 1, ",capabilities=0x", sb);
        sb.append(C6033.m17503(this.f11996, 8));
        sb.append(",serverTime=");
        sb.append(new Date(this.f11993));
        return new String(sb.toString());
    }
}
