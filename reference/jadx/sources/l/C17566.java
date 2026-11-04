package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ܽۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBEO */
/* JADX INFO: loaded from: classes5.dex */
public final class C17566 extends C12345 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C18181 f57069 = new C18181(new C1028(C5085.m15363("java/lang/reflect/Array")), new C0282(new C9976("newInstance"), new C9976("(Ljava/lang/Class;[I)Ljava/lang/Object;")));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f57070;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f57071;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f57072;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f57073;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f57074;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C10853 f57075;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C16820 f57076;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9012 f57077;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f57078;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f57079;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19630 f57080;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C18708 f57081;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC11050 f57082;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19299 f57083;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5284 f57084;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f57085;

    public C17566(C16820 c16820, C19299 c19299, C19630 c19630) {
        super(c19299.mo23245());
        this.f57076 = c16820;
        this.f57083 = c19299;
        this.f57080 = c19630;
        this.f57084 = C5284.f18610;
        this.f57079 = c19299.m44664();
        this.f57073 = new ArrayList(25);
        this.f57082 = null;
        this.f57078 = false;
        this.f57071 = false;
        this.f57070 = -1;
        this.f57074 = 0;
        this.f57072 = false;
        this.f57081 = null;
        this.f57077 = null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m41224() {
        return this.f57073;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C18708 m41217() {
        return this.f57081;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C9012 m41225() {
        return this.f57077;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41219(C13705 c13705) {
        this.f57082 = c13705;
        this.f57073.clear();
        this.f57078 = false;
        this.f57071 = false;
        this.f57070 = 0;
        this.f57074 = 0;
        this.f57072 = false;
        this.f57085 = false;
        this.f57075 = null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m41218() {
        return this.f57078;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m41227() {
        return this.f57071;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m41222() {
        return this.f57070;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m41223() {
        return this.f57074;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m41228() {
        return this.f57072;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m41221() {
        return this.f57085;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m41220() {
        return this.f57075 != null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10853 m41226() {
        return this.f57075;
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
    @Override // l.C12345
    /* JADX INFO: renamed from: ۙ */
    public final void mo30795(C1400 c1400, int i, int i2) {
        C0063 c0063;
        C20946 c20946;
        AbstractC13487 abstractC13487;
        ArrayList arrayList;
        C9012 c9012;
        int i3;
        int i4;
        int i5;
        C23930 c23930;
        C20946 c20947;
        C23930 c23931;
        AbstractC13487 abstractC13487M37967;
        C0063 c0063M1042;
        C18708 c18708;
        C20550 c20550M30805;
        ArrayList arrayListM30809;
        boolean zM43502;
        AbstractC17216 c23932;
        AbstractC17216 c6030;
        C18708 c18709;
        C20946 c20946M31619get;
        InterfaceC22239 interfaceC22239M47898;
        C5085 c5085M19308;
        C9012 c9013;
        C8267 c8267;
        int i6 = i2;
        int size = c1400.m5118().size() + this.f57079;
        int iM30789 = m30789();
        if (iM30789 == 0) {
            c0063 = C0063.f947;
        } else {
            int iM30808 = m30808();
            if (iM30808 >= 0) {
                c0063 = new C0063(1);
                c0063.m31604(0, C20946.m47883(iM30808, m30791(0)));
            } else {
                C0063 c0064 = new C0063(iM30789);
                int iM47901 = size;
                for (int i7 = 0; i7 < iM30789; i7++) {
                    C20946 c20946M47883 = C20946.m47883(iM47901, m30791(i7));
                    c0064.m31604(i7, c20946M47883);
                    iM47901 += c20946M47883.m47901();
                }
                if (i6 == 79) {
                    if (iM30789 != 3) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    C20946 c20946M31619get2 = c0064.m31619get(0);
                    C20946 c20946M31619get3 = c0064.m31619get(1);
                    c0064.m31604(0, c0064.m31619get(2));
                    c0064.m31604(1, c20946M31619get2);
                    c0064.m31604(2, c20946M31619get3);
                } else if (i6 == 181) {
                    if (iM30789 != 2) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    C20946 c20946M31619get4 = c0064.m31619get(0);
                    c0064.m31604(0, c0064.m31619get(1));
                    c0064.m31604(1, c20946M31619get4);
                }
                c0063 = c0064;
            }
            c0063.mo15005();
        }
        C0063 c0065 = c0063;
        int size2 = c0065.size();
        super.mo30795(c1400, i, i2);
        C19299 c19299 = this.f57083;
        C9012 c9012M44663 = c19299.m44663(i);
        C20946 c20946M30790 = m30790(i6 == 54);
        int iM30807 = m30807();
        ArrayList arrayList2 = this.f57073;
        if (iM30807 != 0) {
            if (c20946M30790 == null) {
                if (iM30807 == 1) {
                    c20946M30790 = C20946.m47883(size, m30788());
                } else {
                    int iM39742 = this.f57076.m39742();
                    C20946[] c20946Arr = new C20946[size2];
                    for (int i8 = 0; i8 < size2; i8++) {
                        C20946 c20946M31619get5 = c0065.m31619get(i8);
                        InterfaceC22239 interfaceC22239M47899 = c20946M31619get5.m47898();
                        C20946 c20946M47899 = c20946M31619get5.m47899(iM39742);
                        arrayList2.add(new C23930(C0809.m3258(interfaceC22239M47899), c9012M44663, c20946M47899, c20946M31619get5));
                        c20946Arr[i8] = c20946M47899;
                        iM39742 += c20946M31619get5.m47901();
                    }
                    for (int iM30810 = m30810(); iM30810 != 0; iM30810 >>= 4) {
                        C20946 c20948 = c20946Arr[(iM30810 & 15) - 1];
                        InterfaceC22239 interfaceC22239M478910 = c20948.m47898();
                        arrayList2.add(new C23930(C0809.m3258(interfaceC22239M478910), c9012M44663, c20948.m47899(size), c20948));
                        size += interfaceC22239M478910.getType().m15371();
                    }
                    return;
                }
            }
            c20946 = c20946M30790;
        } else if (i6 == 87 || i6 == 88) {
            return;
        } else {
            c20946 = null;
        }
        InterfaceC22239 interfaceC22239 = c20946 != null ? c20946 : C5085.f17731;
        AbstractC13487 abstractC13487M30815 = m30815();
        if (i6 == 197) {
            this.f57072 = true;
            this.f57074 = 6;
            int iM47897 = c20946.m47897();
            C5085 c5085 = C5085.f17752;
            C20946 c20946M47884 = C20946.m47883(iM47897, c5085);
            abstractC13487 = abstractC13487M30815;
            arrayList = arrayList2;
            arrayList.add(new C8267(C0809.m3249(size2, c5085), c9012M44663, c0065, this.f57082, C1028.f3719));
            arrayList.add(new C23930(new C18708(55, c5085, C13705.f43487, null), c9012M44663, c20946M47884, C0063.f947));
            C5085 c5085M3933 = ((C1028) abstractC13487).m3933();
            for (int i9 = 0; i9 < size2; i9++) {
                c5085M3933 = c5085M3933.m15378();
            }
            C20946 c20946M47885 = C20946.m47883(c20946.m47903(), C5085.f17761);
            if (c5085M3933.m15376()) {
                c9013 = c9012M44663;
                c8267 = new C8267(C0809.f3013, c9012M44663, C0063.f947, this.f57082, C16689.m39456(c5085M3933));
            } else {
                c9013 = c9012M44663;
                c8267 = new C8267(C0809.f2913, c9013, C0063.f947, this.f57082, new C1028(c5085M3933));
            }
            arrayList.add(c8267);
            C18708 c18708M3259 = C0809.m3259(c20946M47885.getType());
            C0063 c0066 = C0063.f947;
            arrayList.add(new C23930(c18708M3259, c9013, c20946M47885, c0066));
            C20946 c20946M47886 = C20946.m47883(c20946.m47903(), C5085.f17733);
            C18181 c18181 = f57069;
            arrayList.add(new C8267(new C18708(49, c18181.m51054().m19310(), C13705.f43476), c9013, C0063.m1031(c20946M47885, c20946M47884), this.f57082, c18181));
            C5085 c5085M19309 = c18181.m51054().m19308();
            c5085M19309.getClass();
            arrayList.add(new C23930(new C18708(55, c5085M19309, C13705.f43487, null), c9013, c20946M47886, c0066));
            C0063 c0063M1033 = C0063.m1033(c20946M47886);
            c9012 = c9013;
            c0065 = c0063M1033;
            i6 = 192;
        } else {
            abstractC13487 = abstractC13487M30815;
            arrayList = arrayList2;
            c9012 = c9012M44663;
            if (i6 == 168) {
                this.f57085 = true;
                return;
            } else if (i6 == 169) {
                try {
                    this.f57075 = (C10853) m30791(0);
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
                        case EnumC24309.f78687 /* 154 */:
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
                                    C18181 c18182 = (C18181) abstractC13487;
                                    if (c18182.m34884().equals(c19299.mo8782())) {
                                        int i10 = 0;
                                        while (true) {
                                            C19630 c19630 = this.f57080;
                                            if (i10 < c19630.size()) {
                                                InterfaceC8616 interfaceC8616M31612get = c19630.m31612get(i10);
                                                if ((interfaceC8616M31612get.mo8783() & 2) == 0 || !c18182.m34885().equals(interfaceC8616M31612get.mo8780())) {
                                                    i10++;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    i3 = c18182.m51053() ? 58 : 50;
                                    break;
                                case 183:
                                    C18181 c18183 = (C18181) abstractC13487;
                                    i3 = (!c18183.m34885().m1844() && !c18183.m34884().equals(c19299.mo8782())) ? 51 : 52;
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
        InterfaceC22239 interfaceC222310 = interfaceC22239;
        C18708 c18708M3250 = C0809.m3250(i3, interfaceC222310, c0065, abstractC13487);
        if (c20946 != null && c18708M3250.m43505()) {
            this.f57074++;
            if (c18708M3250.m43509() == 59) {
                c5085M19308 = ((C5503) abstractC13487).m16330();
            } else {
                c5085M19308 = ((C18181) abstractC13487).m51054().m19308();
            }
            c5085M19308.getClass();
            i4 = i6;
            c23930 = new C23930(new C18708(55, c5085M19308, C13705.f43487, null), c9012, c20946, C0063.f947);
        } else {
            i4 = i6;
            if (c20946 == null || !c18708M3250.m43502()) {
                i5 = 41;
                c23930 = null;
            } else {
                this.f57074++;
                c23930 = new C23930(C0809.m3259(c20946.m47898()), c9012, c20946, C0063.f947);
            }
            c20947 = c20946;
            c23931 = c23930;
            if (i3 == i5) {
                abstractC13487M37967 = C1028.m3931(c18708M3250.m43507());
            } else if (abstractC13487 == null || size2 != 2) {
                abstractC13487M37967 = abstractC13487;
            } else {
                InterfaceC22239 interfaceC22239M478911 = c0065.m31619get(0).m47898();
                InterfaceC22239 interfaceC22239M478912 = c0065.m31619get(1).m47898();
                if (!interfaceC22239M478912.mo8409() && !interfaceC22239M478911.mo8409()) {
                    abstractC13487M37967 = abstractC13487;
                } else if (this.f57084.m15881(c18708M3250, c0065.m31619get(0), c0065.m31619get(1))) {
                    if (interfaceC22239M478912.mo8409()) {
                        abstractC13487M37967 = (AbstractC13487) interfaceC22239M478912;
                        c0063M1042 = c0065.m1034();
                        if (c18708M3250.m43509() == 15) {
                            abstractC13487M37967 = C15943.m37967(-((C15943) interfaceC22239M478912).mo17877());
                            i3 = 14;
                        }
                    } else {
                        abstractC13487M37967 = (AbstractC13487) interfaceC22239M478911;
                        c0063M1042 = c0065.m1042();
                    }
                    c0065 = c0063M1042;
                    c18708M3250 = C0809.m3250(i3, interfaceC222310, c0065, abstractC13487M37967);
                } else {
                    abstractC13487M37967 = abstractC13487;
                }
            }
            c18708 = c18708M3250;
            c20550M30805 = m30805();
            arrayListM30809 = m30809();
            zM43502 = c18708.m43502();
            this.f57072 |= zM43502;
            if (c20550M30805 != null) {
                if (i3 == 33) {
                    if (c0065.size() != 0) {
                        c20946M31619get = c0065.m31619get(0);
                        interfaceC22239M47898 = c20946M31619get.m47898();
                        if (c20946M31619get.m47903() != 0) {
                            arrayList.add(new C23930(C0809.m3258(interfaceC22239M47898), c9012, C20946.m47883(0, interfaceC22239M47898), c20946M31619get));
                        }
                    }
                    c6030 = new C23930(C0809.f3062, c9012, (C20946) null, C0063.f947);
                    this.f57070 = 0;
                    c18709 = this.f57081;
                    if (c18709 == null) {
                        this.f57081 = c18708;
                        this.f57077 = c9012;
                    } else {
                        if (c18709 == c18708) {
                            throw new C16074("return op mismatch: " + c18708 + ", " + this.f57081, null);
                        }
                        if (c9012.m24067() > this.f57077.m24067()) {
                            this.f57077 = c9012;
                        }
                    }
                    this.f57071 = true;
                } else if (abstractC13487M37967 != null) {
                    if (zM43502) {
                        if (c18708.m43509() == 58) {
                            c23932 = new C8267(c18708, c9012, c0065, this.f57082, abstractC13487M37967);
                        } else {
                            c23932 = new C23184(c18708, c9012, c0065, this.f57082, (C18181) abstractC13487M37967);
                        }
                        this.f57078 = true;
                        this.f57070 = this.f57082.size();
                    } else {
                        c6030 = new C6030(c18708, c9012, c20947, c0065, abstractC13487M37967);
                    }
                } else if (zM43502) {
                    c23932 = new C6776(c18708, c9012, c0065, this.f57082);
                    this.f57078 = true;
                    if (i4 == 191) {
                        this.f57070 = -1;
                    } else {
                        this.f57070 = this.f57082.size();
                    }
                } else {
                    c23932 = new C23930(c18708, c9012, c20947, c0065);
                }
                c23932 = c6030;
            } else if (c20550M30805.size() == 0) {
                c23932 = new C23930(C0809.f3062, c9012, (C20946) null, C0063.f947);
                this.f57070 = 0;
            } else {
                C24698 c24698M47115 = c20550M30805.m47115();
                c6030 = new C2301(c18708, c9012, c20947, c0065, c24698M47115);
                this.f57070 = c24698M47115.size();
                c23932 = c6030;
            }
            arrayList.add(c23932);
            if (c23931 != null) {
                arrayList.add(c23931);
            }
            if (arrayListM30809 != null) {
                this.f57074++;
                arrayList.add(new C11249(C0809.f2943, c9012, C0063.m1033(c23931.m40437()), arrayListM30809, abstractC13487M37967));
            }
        }
        i5 = 41;
        c20946 = null;
        c20947 = c20946;
        c23931 = c23930;
        if (i3 == i5) {
            abstractC13487M37967 = C1028.m3931(c18708M3250.m43507());
        } else if (abstractC13487 == null) {
            abstractC13487M37967 = abstractC13487;
        } else {
            abstractC13487M37967 = abstractC13487;
        }
        c18708 = c18708M3250;
        c20550M30805 = m30805();
        arrayListM30809 = m30809();
        zM43502 = c18708.m43502();
        this.f57072 |= zM43502;
        if (c20550M30805 != null) {
            if (i3 == 33) {
                if (c0065.size() != 0) {
                    c20946M31619get = c0065.m31619get(0);
                    interfaceC22239M47898 = c20946M31619get.m47898();
                    if (c20946M31619get.m47903() != 0) {
                        arrayList.add(new C23930(C0809.m3258(interfaceC22239M47898), c9012, C20946.m47883(0, interfaceC22239M47898), c20946M31619get));
                    }
                }
                c6030 = new C23930(C0809.f3062, c9012, (C20946) null, C0063.f947);
                this.f57070 = 0;
                c18709 = this.f57081;
                if (c18709 == null) {
                    this.f57081 = c18708;
                    this.f57077 = c9012;
                } else {
                    if (c18709 == c18708) {
                        throw new C16074("return op mismatch: " + c18708 + ", " + this.f57081, null);
                    }
                    if (c9012.m24067() > this.f57077.m24067()) {
                        this.f57077 = c9012;
                    }
                }
                this.f57071 = true;
            } else if (abstractC13487M37967 != null) {
                if (zM43502) {
                    if (c18708.m43509() == 58) {
                        c23932 = new C8267(c18708, c9012, c0065, this.f57082, abstractC13487M37967);
                    } else {
                        c23932 = new C23184(c18708, c9012, c0065, this.f57082, (C18181) abstractC13487M37967);
                    }
                    this.f57078 = true;
                    this.f57070 = this.f57082.size();
                } else {
                    c6030 = new C6030(c18708, c9012, c20947, c0065, abstractC13487M37967);
                }
            } else if (zM43502) {
                c23932 = new C6776(c18708, c9012, c0065, this.f57082);
                this.f57078 = true;
                if (i4 == 191) {
                    this.f57070 = -1;
                } else {
                    this.f57070 = this.f57082.size();
                }
            } else {
                c23932 = new C23930(c18708, c9012, c20947, c0065);
            }
            c23932 = c6030;
        } else if (c20550M30805.size() == 0) {
            c23932 = new C23930(C0809.f3062, c9012, (C20946) null, C0063.f947);
            this.f57070 = 0;
        } else {
            C24698 c24698M47116 = c20550M30805.m47115();
            c6030 = new C2301(c18708, c9012, c20947, c0065, c24698M47116);
            this.f57070 = c24698M47116.size();
            c23932 = c6030;
        }
        arrayList.add(c23932);
        if (c23931 != null) {
            arrayList.add(c23931);
        }
        if (arrayListM30809 != null) {
            this.f57074++;
            arrayList.add(new C11249(C0809.f2943, c9012, C0063.m1033(c23931.m40437()), arrayListM30809, abstractC13487M37967));
        }
    }
}
