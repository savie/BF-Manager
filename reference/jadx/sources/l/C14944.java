package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ܶۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBEO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14944 extends C19177 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C20255 f48744 = new C20255(new C6143(C3320.m9827("java/lang/reflect/Array")), new C0498(new C17432("newInstance"), new C17432("(Ljava/lang/Class;[I)Ljava/lang/Object;")));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2325 f48745;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C11312 f48746;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f48747;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f48748;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f48749;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f48750;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48751;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C13533 f48752;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f48753;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f48754;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12723 f48755;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1433 f48756;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC14093 f48757;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12391 f48758;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f48759;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C22705 f48760;

    public C14944(C22705 c22705, C12391 c12391, C2325 c2325) {
        super(c12391.mo28689());
        this.f48760 = c22705;
        this.f48758 = c12391;
        this.f48745 = c2325;
        this.f48756 = C1433.f5889;
        this.f48753 = c12391.m30823();
        this.f48759 = new ArrayList(25);
        this.f48757 = null;
        this.f48749 = false;
        this.f48751 = false;
        this.f48754 = -1;
        this.f48750 = 0;
        this.f48748 = false;
        this.f48755 = null;
        this.f48746 = null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList m35704() {
        return this.f48759;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C12723 m35696() {
        return this.f48755;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C11312 m35702() {
        return this.f48746;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35694(C9672 c9672) {
        this.f48757 = c9672;
        this.f48759.clear();
        this.f48749 = false;
        this.f48751 = false;
        this.f48754 = 0;
        this.f48750 = 0;
        this.f48748 = false;
        this.f48747 = false;
        this.f48752 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m35703() {
        return this.f48749;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m35695() {
        return this.f48751;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m35700() {
        return this.f48754;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m35699() {
        return this.f48750;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m35705() {
        return this.f48748;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m35697() {
        return this.f48747;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m35698() {
        return this.f48752 != null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13533 m35701() {
        return this.f48752;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0289  */
    /* JADX WARN: Code duplicated, block: B:147:0x032b  */
    /* JADX WARN: Code duplicated, block: B:148:0x032e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0330  */
    /* JADX WARN: Code duplicated, block: B:151:0x0336  */
    /* JADX WARN: Code duplicated, block: B:152:0x0338  */
    /* JADX WARN: Code duplicated, block: B:153:0x033a  */
    /* JADX WARN: Code duplicated, block: B:172:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:173:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:189:0x0415  */
    /* JADX WARN: Code duplicated, block: B:192:0x042a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0430  */
    /* JADX WARN: Code duplicated, block: B:195:0x043f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0456  */
    /* JADX WARN: Code duplicated, block: B:198:0x045b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0461  */
    /* JADX WARN: Code duplicated, block: B:202:0x046f  */
    /* JADX WARN: Code duplicated, block: B:205:0x048f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0494 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x0496  */
    /* JADX WARN: Code duplicated, block: B:209:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:211:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:213:0x04c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x04ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:215:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:217:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:218:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:220:0x0500  */
    /* JADX WARN: Code duplicated, block: B:222:0x050d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:223:0x050f  */
    /* JADX WARN: Code duplicated, block: B:225:0x051f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0523  */
    /* JADX WARN: Code duplicated, block: B:227:0x052c  */
    /* JADX WARN: Code duplicated, block: B:230:0x0536  */
    /* JADX WARN: Code duplicated, block: B:232:0x053b  */
    /* JADX WARN: Code duplicated, block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:211:0x04a9, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.C19177
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo35693(C6040 c6040, int i, int i2) {
        C0727 c0727;
        C16251 c16251;
        AbstractC9901 abstractC9901;
        ArrayList arrayList;
        C11312 c11312;
        int i3;
        int i4;
        int i5;
        C10607 c10607;
        C16251 c16252;
        C10607 c10608;
        AbstractC9901 abstractC9901M48398;
        C0727 c0727M3158;
        C12723 c12723;
        C7888 c7888M44023;
        ArrayList arrayListM44030;
        boolean zM31573;
        AbstractC15546 c10609;
        AbstractC15546 c9196;
        C12723 c12724;
        C16251 c16251M15275get;
        InterfaceC4919 interfaceC4919M38401;
        C3320 c3320M6217;
        C11312 c11313;
        C14840 c14840;
        int i6 = i2;
        int size = c6040.m16389().size() + this.f48753;
        int iM44007 = m44007();
        if (iM44007 == 0) {
            c0727 = C0727.f3015;
        } else {
            int iM44004 = m44004();
            if (iM44004 >= 0) {
                c0727 = new C0727(1);
                c0727.m15261(0, C16251.m38381(iM44004, m44008(0)));
            } else {
                C0727 c0728 = new C0727(iM44007);
                int iM38396 = size;
                for (int i7 = 0; i7 < iM44007; i7++) {
                    C16251 c16251M38381 = C16251.m38381(iM38396, m44008(i7));
                    c0728.m15261(i7, c16251M38381);
                    iM38396 += c16251M38381.m38396();
                }
                if (i6 == 79) {
                    if (iM44007 != 3) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    C16251 c16251M15275get2 = c0728.m15275get(0);
                    C16251 c16251M15275get3 = c0728.m15275get(1);
                    c0728.m15261(0, c0728.m15275get(2));
                    c0728.m15261(1, c16251M15275get2);
                    c0728.m15261(2, c16251M15275get3);
                } else if (i6 == 181) {
                    if (iM44007 != 2) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    C16251 c16251M15275get4 = c0728.m15275get(0);
                    c0728.m15261(0, c0728.m15275get(1));
                    c0728.m15261(1, c16251M15275get4);
                }
                c0727 = c0728;
            }
            c0727.mo9637();
        }
        C0727 c0729 = c0727;
        int size2 = c0729.size();
        super.mo35693(c6040, i, i2);
        C12391 c12391 = this.f48758;
        C11312 c11312M30821 = c12391.m30821(i);
        C16251 c16251M44009 = m44009(i6 == 54);
        int iM44022 = m44022();
        ArrayList arrayList2 = this.f48759;
        if (iM44022 != 0) {
            if (c16251M44009 == null) {
                if (iM44022 == 1) {
                    c16251M44009 = C16251.m38381(size, m44006());
                } else {
                    int iM50341 = this.f48760.m50341();
                    C16251[] c16251Arr = new C16251[size2];
                    for (int i8 = 0; i8 < size2; i8++) {
                        C16251 c16251M15275get5 = c0729.m15275get(i8);
                        InterfaceC4919 interfaceC4919M38402 = c16251M15275get5.m38401();
                        C16251 c16251M38397 = c16251M15275get5.m38397(iM50341);
                        arrayList2.add(new C10607(C6372.m17490(interfaceC4919M38402), c11312M30821, c16251M38397, c16251M15275get5));
                        c16251Arr[i8] = c16251M38397;
                        iM50341 += c16251M15275get5.m38396();
                    }
                    for (int iM44021 = m44021(); iM44021 != 0; iM44021 >>= 4) {
                        C16251 c16253 = c16251Arr[(iM44021 & 15) - 1];
                        InterfaceC4919 interfaceC4919M38403 = c16253.m38401();
                        arrayList2.add(new C10607(C6372.m17490(interfaceC4919M38403), c11312M30821, c16253.m38397(size), c16253));
                        size += interfaceC4919M38403.getType().m9830();
                    }
                    return;
                }
            }
            c16251 = c16251M44009;
        } else if (i6 == 87 || i6 == 88) {
            return;
        } else {
            c16251 = null;
        }
        InterfaceC4919 interfaceC4919 = c16251 != null ? c16251 : C3320.f12280;
        AbstractC9901 abstractC9901M44005 = m44005();
        if (i6 == 197) {
            this.f48748 = true;
            this.f48750 = 6;
            int iM38399 = c16251.m38399();
            C3320 c3320 = C3320.f12285;
            C16251 c16251M38382 = C16251.m38381(iM38399, c3320);
            abstractC9901 = abstractC9901M44005;
            arrayList = arrayList2;
            arrayList.add(new C14840(C6372.m17481(size2, c3320), c11312M30821, c0729, this.f48757, C6143.f20965));
            arrayList.add(new C10607(new C12723(55, c3320, C9672.f32573, null), c11312M30821, c16251M38382, C0727.f3015));
            C3320 c3320M17128 = ((C6143) abstractC9901).m17128();
            for (int i9 = 0; i9 < size2; i9++) {
                c3320M17128 = c3320M17128.m9843();
            }
            C16251 c16251M38383 = C16251.m38381(c16251.m38400(), C3320.f12260);
            if (c3320M17128.m9845()) {
                c11313 = c11312M30821;
                c14840 = new C14840(C6372.f21630, c11312M30821, C0727.f3015, this.f48757, C23077.m51063(c3320M17128));
            } else {
                c11313 = c11312M30821;
                c14840 = new C14840(C6372.f21554, c11313, C0727.f3015, this.f48757, new C6143(c3320M17128));
            }
            arrayList.add(c14840);
            C12723 c12723M17480 = C6372.m17480(c16251M38383.getType());
            C0727 c07210 = C0727.f3015;
            arrayList.add(new C10607(c12723M17480, c11313, c16251M38383, c07210));
            C16251 c16251M38384 = C16251.m38381(c16251.m38400(), C3320.f12289);
            C20255 c20255 = f48744;
            arrayList.add(new C14840(new C12723(49, c20255.m29454().m6221(), C9672.f32595), c11313, C0727.m3149(c16251M38383, c16251M38382), this.f48757, c20255));
            C3320 c3320M6218 = c20255.m29454().m6217();
            c3320M6218.getClass();
            arrayList.add(new C10607(new C12723(55, c3320M6218, C9672.f32573, null), c11313, c16251M38384, c07210));
            C0727 c0727M3151 = C0727.m3151(c16251M38384);
            c11312 = c11313;
            c0729 = c0727M3151;
            i6 = 192;
        } else {
            abstractC9901 = abstractC9901M44005;
            arrayList = arrayList2;
            c11312 = c11312M30821;
            if (i6 == 168) {
                this.f48747 = true;
                return;
            } else if (i6 == 169) {
                try {
                    this.f48752 = (C13533) m44008(0);
                    return;
                } catch (ClassCastException e) {
                    throw new RuntimeException("Argument to RET was not a ReturnAddress", e);
                }
            }
        }
        if (i6 == 0) {
            i3 = 1;
        } else if (i6 == 20) {
            i3 = 5;
        } else if (i6 == 21) {
            i3 = 2;
        } else if (i6 == 171) {
            i3 = 13;
        } else if (i6 == 172) {
            i3 = 33;
        } else if (i6 == 198) {
            i3 = 7;
        } else if (i6 != 199) {
            switch (i6) {
                case 0:
                    i3 = 1;
                    break;
                case 18:
                    i3 = 5;
                    break;
                case 46:
                    i3 = 38;
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    i3 = 2;
                    break;
                case 79:
                    i3 = 39;
                    break;
                case 96:
                    i3 = 14;
                    break;
                case 100:
                    i3 = 15;
                    break;
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    i3 = 16;
                    break;
                case 108:
                    i3 = 17;
                    break;
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                    i3 = 18;
                    break;
                case 116:
                    i3 = 19;
                    break;
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                    i3 = 23;
                    break;
                case 122:
                    i3 = 24;
                    break;
                case 124:
                    i3 = 25;
                    break;
                case 126:
                    i3 = 20;
                    break;
                case 128:
                    i3 = 21;
                    break;
                case 130:
                    i3 = 22;
                    break;
                default:
                    switch (i6) {
                        case 132:
                            i3 = 14;
                            break;
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                        case 140:
                        case 141:
                        case 142:
                        case 143:
                        case 144:
                            i3 = 29;
                            break;
                        case 145:
                            i3 = 30;
                            break;
                        case 146:
                            i3 = 31;
                            break;
                        case 147:
                            i3 = 32;
                            break;
                        case 148:
                        case 149:
                        case 151:
                            i3 = 27;
                            break;
                        case 150:
                        case 152:
                            i3 = 28;
                            break;
                        case 153:
                        case 159:
                        case 165:
                            i3 = 7;
                            break;
                        case EnumC2300.f8185 /* 154 */:
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                        case 166:
                            i3 = 8;
                            break;
                        case 155:
                        case 161:
                            i3 = 9;
                            break;
                        case 156:
                        case 162:
                            i3 = 10;
                            break;
                        case 157:
                        case 163:
                            i3 = 12;
                            break;
                        case 158:
                        case 164:
                            i3 = 11;
                            break;
                        case 167:
                            i3 = 6;
                            break;
                        default:
                            switch (i6) {
                                case 177:
                                    i3 = 33;
                                    break;
                                case 178:
                                    i3 = 46;
                                    break;
                                case 179:
                                    i3 = 48;
                                    break;
                                case 180:
                                    i3 = 45;
                                    break;
                                case 181:
                                    i3 = 47;
                                    break;
                                case 182:
                                    C20255 c20256 = (C20255) abstractC9901;
                                    if (c20256.m47134().equals(c12391.mo30828())) {
                                        int i10 = 0;
                                        while (true) {
                                            C2325 c2325 = this.f48745;
                                            if (i10 < c2325.size()) {
                                                InterfaceC14239 interfaceC14239M15273get = c2325.m15273get(i10);
                                                if ((interfaceC14239M15273get.mo30824() & 2) == 0 || !c20256.m47133().equals(interfaceC14239M15273get.mo30825())) {
                                                    i10++;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    i3 = c20256.m29455() ? 58 : 50;
                                    break;
                                case 183:
                                    C20255 c20257 = (C20255) abstractC9901;
                                    i3 = (!c20257.m47133().m2377() && !c20257.m47134().equals(c12391.mo30828())) ? 51 : 52;
                                    break;
                                case 184:
                                    i3 = 49;
                                    break;
                                case 185:
                                    i3 = 53;
                                    break;
                                case 186:
                                    i3 = 59;
                                    break;
                                case 187:
                                    i3 = 40;
                                    break;
                                case 188:
                                case 189:
                                    i3 = 41;
                                    break;
                                case 190:
                                    i3 = 34;
                                    break;
                                case 191:
                                    i3 = 35;
                                    break;
                                case 192:
                                    i3 = 43;
                                    break;
                                case 193:
                                    i3 = 44;
                                    break;
                                case 194:
                                    i3 = 36;
                                    break;
                                case 195:
                                    i3 = 37;
                                    break;
                                default:
                                    throw new RuntimeException("shouldn't happen");
                            }
                            break;
                    }
                    break;
            }
        } else {
            i3 = 8;
        }
        InterfaceC4919 interfaceC49110 = interfaceC4919;
        C12723 c12723M17482 = C6372.m17482(i3, interfaceC49110, c0729, abstractC9901);
        if (c16251 != null && c12723M17482.m31571()) {
            this.f48750++;
            if (c12723M17482.m31572() == 59) {
                c3320M6217 = ((C1203) abstractC9901).m4398();
            } else {
                c3320M6217 = ((C20255) abstractC9901).m29454().m6217();
            }
            c3320M6217.getClass();
            i4 = i6;
            c10607 = new C10607(new C12723(55, c3320M6217, C9672.f32573, null), c11312, c16251, C0727.f3015);
        } else {
            i4 = i6;
            if (c16251 == null || !c12723M17482.m31573()) {
                i5 = 41;
                c10607 = null;
            } else {
                this.f48750++;
                c10607 = new C10607(C6372.m17480(c16251.m38401()), c11312, c16251, C0727.f3015);
            }
            c16252 = c16251;
            c10608 = c10607;
            if (i3 == i5) {
                abstractC9901M48398 = C6143.m17126(c12723M17482.m31574());
            } else if (abstractC9901 == null || size2 != 2) {
                abstractC9901M48398 = abstractC9901;
            } else {
                InterfaceC4919 interfaceC4919M38404 = c0729.m15275get(0).m38401();
                InterfaceC4919 interfaceC4919M38405 = c0729.m15275get(1).m38401();
                if (!interfaceC4919M38405.mo9847() && !interfaceC4919M38404.mo9847()) {
                    abstractC9901M48398 = abstractC9901;
                } else if (this.f48756.m5008(c12723M17482, c0729.m15275get(0), c0729.m15275get(1))) {
                    if (interfaceC4919M38405.mo9847()) {
                        abstractC9901M48398 = (AbstractC9901) interfaceC4919M38405;
                        c0727M3158 = c0729.m3160();
                        if (c12723M17482.m31572() == 15) {
                            abstractC9901M48398 = C21665.m48398(-((C21665) interfaceC4919M38405).mo21658());
                            i3 = 14;
                        }
                    } else {
                        abstractC9901M48398 = (AbstractC9901) interfaceC4919M38404;
                        c0727M3158 = c0729.m3158();
                    }
                    c0729 = c0727M3158;
                    c12723M17482 = C6372.m17482(i3, interfaceC49110, c0729, abstractC9901M48398);
                } else {
                    abstractC9901M48398 = abstractC9901;
                }
            }
            c12723 = c12723M17482;
            c7888M44023 = m44023();
            arrayListM44030 = m44030();
            zM31573 = c12723.m31573();
            this.f48748 |= zM31573;
            if (c7888M44023 != null) {
                if (i3 == 33) {
                    if (c0729.size() != 0) {
                        c16251M15275get = c0729.m15275get(0);
                        interfaceC4919M38401 = c16251M15275get.m38401();
                        if (c16251M15275get.m38400() != 0) {
                            arrayList.add(new C10607(C6372.m17490(interfaceC4919M38401), c11312, C16251.m38381(0, interfaceC4919M38401), c16251M15275get));
                        }
                    }
                    c9196 = new C10607(C6372.f21606, c11312, (C16251) null, C0727.f3015);
                    this.f48754 = 0;
                    c12724 = this.f48755;
                    if (c12724 == null) {
                        this.f48755 = c12723;
                        this.f48746 = c11312;
                    } else {
                        if (c12724 == c12723) {
                            throw new C21293("return op mismatch: " + c12723 + ", " + this.f48755, null);
                        }
                        if (c11312.m28312() > this.f48746.m28312()) {
                            this.f48746 = c11312;
                        }
                    }
                    this.f48751 = true;
                } else if (abstractC9901M48398 != null) {
                    if (zM31573) {
                        if (c12723.m31572() == 58) {
                            c10609 = new C14840(c12723, c11312, c0729, this.f48757, abstractC9901M48398);
                        } else {
                            c10609 = new C18367(c12723, c11312, c0729, this.f48757, (C20255) abstractC9901M48398);
                        }
                        this.f48749 = true;
                        this.f48754 = this.f48757.size();
                    } else {
                        c9196 = new C9196(c12723, c11312, c16252, c0729, abstractC9901M48398);
                    }
                } else if (zM31573) {
                    c10609 = new C2138(c12723, c11312, c0729, this.f48757);
                    this.f48749 = true;
                    if (i4 == 191) {
                        this.f48754 = -1;
                    } else {
                        this.f48754 = this.f48757.size();
                    }
                } else {
                    c10609 = new C10607(c12723, c11312, c16252, c0729);
                }
                c10609 = c9196;
            } else if (c7888M44023.size() == 0) {
                c10609 = new C10607(C6372.f21606, c11312, (C16251) null, C0727.f3015);
                this.f48754 = 0;
            } else {
                C4129 c4129M20811 = c7888M44023.m20811();
                c9196 = new C24012(c12723, c11312, c16252, c0729, c4129M20811);
                this.f48754 = c4129M20811.size();
                c10609 = c9196;
            }
            arrayList.add(c10609);
            if (c10608 != null) {
                arrayList.add(c10608);
            }
            if (arrayListM44030 != null) {
                this.f48750++;
                arrayList.add(new C4255(C6372.f21645, c11312, C0727.m3151(c10608.m37185()), arrayListM44030, abstractC9901M48398));
            }
        }
        i5 = 41;
        c16251 = null;
        c16252 = c16251;
        c10608 = c10607;
        if (i3 == i5) {
            abstractC9901M48398 = C6143.m17126(c12723M17482.m31574());
        } else if (abstractC9901 == null) {
            abstractC9901M48398 = abstractC9901;
        } else {
            abstractC9901M48398 = abstractC9901;
        }
        c12723 = c12723M17482;
        c7888M44023 = m44023();
        arrayListM44030 = m44030();
        zM31573 = c12723.m31573();
        this.f48748 |= zM31573;
        if (c7888M44023 != null) {
            if (i3 == 33) {
                if (c0729.size() != 0) {
                    c16251M15275get = c0729.m15275get(0);
                    interfaceC4919M38401 = c16251M15275get.m38401();
                    if (c16251M15275get.m38400() != 0) {
                        arrayList.add(new C10607(C6372.m17490(interfaceC4919M38401), c11312, C16251.m38381(0, interfaceC4919M38401), c16251M15275get));
                    }
                }
                c9196 = new C10607(C6372.f21606, c11312, (C16251) null, C0727.f3015);
                this.f48754 = 0;
                c12724 = this.f48755;
                if (c12724 == null) {
                    this.f48755 = c12723;
                    this.f48746 = c11312;
                } else {
                    if (c12724 == c12723) {
                        throw new C21293("return op mismatch: " + c12723 + ", " + this.f48755, null);
                    }
                    if (c11312.m28312() > this.f48746.m28312()) {
                        this.f48746 = c11312;
                    }
                }
                this.f48751 = true;
            } else if (abstractC9901M48398 != null) {
                if (zM31573) {
                    if (c12723.m31572() == 58) {
                        c10609 = new C14840(c12723, c11312, c0729, this.f48757, abstractC9901M48398);
                    } else {
                        c10609 = new C18367(c12723, c11312, c0729, this.f48757, (C20255) abstractC9901M48398);
                    }
                    this.f48749 = true;
                    this.f48754 = this.f48757.size();
                } else {
                    c9196 = new C9196(c12723, c11312, c16252, c0729, abstractC9901M48398);
                }
            } else if (zM31573) {
                c10609 = new C2138(c12723, c11312, c0729, this.f48757);
                this.f48749 = true;
                if (i4 == 191) {
                    this.f48754 = -1;
                } else {
                    this.f48754 = this.f48757.size();
                }
            } else {
                c10609 = new C10607(c12723, c11312, c16252, c0729);
            }
            c10609 = c9196;
        } else if (c7888M44023.size() == 0) {
            c10609 = new C10607(C6372.f21606, c11312, (C16251) null, C0727.f3015);
            this.f48754 = 0;
        } else {
            C4129 c4129M20812 = c7888M44023.m20811();
            c9196 = new C24012(c12723, c11312, c16252, c0729, c4129M20812);
            this.f48754 = c4129M20812.size();
            c10609 = c9196;
        }
        arrayList.add(c10609);
        if (c10608 != null) {
            arrayList.add(c10608);
        }
        if (arrayListM44030 != null) {
            this.f48750++;
            arrayList.add(new C4255(C6372.f21645, c11312, C0727.m3151(c10608.m37185()), arrayListM44030, abstractC9901M48398));
        }
    }
}
