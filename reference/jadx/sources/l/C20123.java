package l;

import android.app.Activity;
import android.text.TextUtils;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩶ۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20123 extends AbstractC21013 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12362 f65342;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f65343;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20123(C12362 c12362, AbstractActivityC12483 abstractActivityC12483, byte[] bArr) {
        super(abstractActivityC12483);
        this.f65342 = c12362;
        this.f65343 = bArr;
    }

    @Override // l.AbstractC21013
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo13875() {
        if (!C1709.m5693()) {
            C15829.m37611(R.string.MT_Protector);
            return false;
        }
        final String string = m47193(0).getText().toString();
        final String string2 = m47193(1).getText().toString();
        final String string3 = m47193(2).getText().toString();
        if (string.isEmpty()) {
            m47193(0).requestFocus();
            return false;
        }
        if (string2.isEmpty()) {
            m47193(1).requestFocus();
            return false;
        }
        if (string3.isEmpty()) {
            m47193(2).requestFocus();
            return false;
        }
        final byte[] bArr = this.f65343;
        if (bArr.length < 4) {
            C15829.m37618(R.string.MT_Protector);
            return false;
        }
        C12362 c12362 = this.f65342;
        C17485 c17485 = new C17485(c12362.f41338, R.string.MT_Protector);
        c17485.m40704();
        final AbstractActivityC12483 abstractActivityC12483 = c12362.f41338;
        final C15890 c15890 = new C15890(this, c17485, string, string2, string3);
        if (bArr.length > 102400 || TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            c15890.mo3852(new C1313(2));
            return false;
        }
        new Thread(new Runnable() { // from class: l.᩵ۤ᩺
            /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
            /* JADX WARN: Code duplicated, block: B:50:0x015f A[PHI: r11 r16
              0x015f: PHI (r11v6 byte[]) = (r11v3 byte[]), (r11v4 byte[]), (r11v3 byte[]) binds: [B:49:0x015d, B:25:0x0097, B:30:0x00b6] A[DONT_GENERATE, DONT_INLINE]
              0x015f: PHI (r16v3 l.ۜ۟᩺) = (r16v1 l.ۜ۟᩺), (r16v1 l.ۜ۟᩺), (r16v5 l.ۜ۟᩺) binds: [B:49:0x015d, B:25:0x0097, B:30:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:54:0x018b A[PHI: r12 r13
              0x018b: PHI (r12v2 java.lang.String) = 
              (r12v1 java.lang.String)
              (r12v1 java.lang.String)
              (r12v1 java.lang.String)
              (r12v1 java.lang.String)
              (r12v3 java.lang.String)
             binds: [B:53:0x0189, B:45:0x0143, B:41:0x0127, B:9:0x0041, B:6:0x003b] A[DONT_GENERATE, DONT_INLINE]
              0x018b: PHI (r13v2 java.lang.String) = 
              (r13v1 java.lang.String)
              (r13v1 java.lang.String)
              (r13v1 java.lang.String)
              (r13v1 java.lang.String)
              (r13v3 java.lang.String)
             binds: [B:53:0x0189, B:45:0x0143, B:41:0x0127, B:9:0x0041, B:6:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:58:0x01bb A[PHI: r15
              0x01bb: PHI (r15v3 android.app.Activity) = (r15v2 android.app.Activity), (r15v1 android.app.Activity), (r15v1 android.app.Activity), (r15v1 android.app.Activity) binds: [B:57:0x01b9, B:37:0x0107, B:15:0x0053, B:12:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.lang.Runnable
            public final void run() {
                int iM45029;
                int i;
                int i2 = -313831304;
                int i3 = C1460.f5948;
                int i4 = C0278.f1572;
                int iM11306 = (ThreadFactoryC3888.m11306("᩶ۚ") + i3) * (-23);
                int i5 = ((iM11306 ^ i4) * 2497) ^ (-1981527056);
                int i6 = iM11306 ^ (-1893824066);
                Activity activity = null;
                InterfaceC6627 interfaceC6627 = null;
                byte[] bArr2 = null;
                String str = null;
                String str2 = null;
                while (true) {
                    i2 = i6 ^ ((((i2 ^ i4) * (-10139)) >> 31) & i5);
                    switch (i2) {
                        case -2032640195:
                        case -1246849465:
                            if (C2477.f9839 <= 0) {
                                iM45029 = (C19806.m45029("ۤܳ") ^ i3) * 119;
                                i5 = ((iM45029 ^ i4) * (-25317)) ^ (-1441492154);
                                i = 75043087;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ۧ֡") ^ i4;
                                i5 = ((iM45029 ^ i3) * 23303) ^ (-1842580465);
                                i = 516209104;
                            }
                            i6 = iM45029 ^ i;
                            break;
                        case -1882060854:
                        case -1230010419:
                            C0278.m1789();
                            iM45029 = C19806.m45029("ۖ᩷") ^ i3;
                            i5 = ((iM45029 ^ i4) * (-26981)) ^ 832340682;
                            i = 830719366;
                            i6 = iM45029 ^ i;
                            break;
                        case -1782478036:
                        case -1612644510:
                            if (C3286.f12186) {
                                iM45029 = (C19806.m45029("᩸ܳ") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                i5 = ((iM45029 ^ i3) * 8381) ^ (-668159005);
                                i = -1926768184;
                            } else {
                                iM45029 = (i4 - ThreadFactoryC3888.m11306("᩸ᩳ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                i5 = ((iM45029 ^ i3) * (-2027)) ^ 660593684;
                                i = 1798866286;
                            }
                            i6 = iM45029 ^ i;
                            break;
                        case -1753062694:
                        case 578202421:
                            InterfaceC6627 interfaceC6628 = c15890;
                            if (C2788.f10625 >= 0) {
                                interfaceC6627 = interfaceC6628;
                                iM45029 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i3;
                                i5 = ((iM45029 ^ i4) * (-12463)) ^ (-405428958);
                                i = -1720243413;
                                i6 = iM45029 ^ i;
                            } else {
                                int iM450210 = (C19806.m45029("۠ۛ") ^ i4) * (-51);
                                i5 = ((iM450210 ^ i3) * (-14737)) ^ 1874436347;
                                i6 = iM450210 ^ 1892431697;
                                interfaceC6627 = interfaceC6628;
                            }
                            break;
                        case -1632439413:
                        case 1562284561:
                            C21444.m48055(bArr2, str, str2, string3, activity, interfaceC6627);
                            break;
                        case -1514658402:
                        case 2103530525:
                            if (C3743.f13569) {
                                iM45029 = C19806.m45029("᩵᩵") ^ i4;
                                i5 = ((iM45029 ^ i3) * 17809) ^ (-1868248883);
                                i = 617064297;
                            } else {
                                iM45029 = (C19806.m45029("ۤܳ") ^ i3) * 119;
                                i5 = ((iM45029 ^ i4) * (-25317)) ^ (-1441492154);
                                i = 75043087;
                            }
                            i6 = iM45029 ^ i;
                            break;
                        case -1225005148:
                        case 610593866:
                            if (C2704.f10408) {
                                iM45029 = (C19806.m45029("ۙۡ") ^ i3) * 63;
                                i5 = ((iM45029 ^ i4) * 2949) ^ (-188269834);
                                i = 66577367;
                            } else {
                                iM45029 = C19806.m45029("᩵᩵") ^ i4;
                                i5 = ((iM45029 ^ i3) * 17809) ^ (-1868248883);
                                i = 617064297;
                            }
                            i6 = iM45029 ^ i;
                            break;
                        case -1089177802:
                        case -689600344:
                            if (RunnableC1606.f6488 >= 0) {
                                iM45029 = (C19806.m45029("ۤܳ") ^ i3) * 119;
                                i5 = ((iM45029 ^ i4) * (-25317)) ^ (-1441492154);
                                i = 75043087;
                            } else {
                                iM45029 = C19806.m45029("ܰ֫") ^ i3;
                                i5 = ((iM45029 ^ i4) * (-19721)) ^ 611662255;
                                i = 322866070;
                            }
                            i6 = iM45029 ^ i;
                            break;
                        case -711610799:
                        case 1286123019:
                            C2477.m7593();
                            C0797.m3359();
                            break;
                        case -148313509:
                        case 599504370:
                            if (C7105.f23796 >= 0) {
                                iM45029 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i3;
                                i5 = ((iM45029 ^ i4) * (-12463)) ^ (-405428958);
                                i = -1720243413;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ۢ֨") ^ i3;
                                i5 = ((iM45029 ^ i4) * 18145) ^ (-45446515);
                                i = 1657667981;
                            }
                            i6 = iM45029 ^ i;
                            break;
                        case -62119121:
                        case 62087469:
                            if (C3743.m10966() <= 0) {
                                iM45029 = (C19806.m45029("ۤܳ") ^ i3) * 119;
                                i5 = ((iM45029 ^ i4) * (-25317)) ^ (-1441492154);
                                i = 75043087;
                            } else {
                                iM45029 = (C19806.m45029("ۗۜ") + i3) * (-69);
                                i5 = ((iM45029 ^ i4) * (-4017)) ^ (-807293876);
                                i = 441583963;
                            }
                            i6 = iM45029 ^ i;
                            break;
                        case 35292720:
                        case 1304660030:
                            C2788.m8472();
                            if (C1937.f7317 >= 0) {
                                iM45029 = (C19806.m45029("᩸ܳ") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                i5 = ((iM45029 ^ i3) * 8381) ^ (-668159005);
                                i = -1926768184;
                            } else {
                                iM45029 = C19806.m45029("᩵᩵") ^ i4;
                                i5 = ((iM45029 ^ i3) * 17809) ^ (-1868248883);
                                i = 617064297;
                            }
                            i6 = iM45029 ^ i;
                            break;
                        case 246490580:
                        case 1523975145:
                            activity = abstractActivityC12483;
                            if (C2642.f10294 <= 0) {
                                iM45029 = (C19806.m45029("᩸ܳ") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                i5 = ((iM45029 ^ i3) * 8381) ^ (-668159005);
                                i = -1926768184;
                            } else {
                                iM45029 = C19806.m45029("۬ۛ") ^ i4;
                                i5 = ((iM45029 ^ i3) * (-6745)) ^ 2371948;
                                i = -879602016;
                            }
                            i6 = iM45029 ^ i;
                            break;
                        case 968092334:
                        case 1240391522:
                            C3743.m10966();
                            if (C10634.f36300 >= 0) {
                                iM45029 = C19806.m45029("ۖ᩷") ^ i3;
                                i5 = ((iM45029 ^ i4) * (-26981)) ^ 832340682;
                                i = 830719366;
                            } else {
                                iM45029 = (C19806.m45029("᩸ܳ") + i4) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                i5 = ((iM45029 ^ i3) * 8381) ^ (-668159005);
                                i = -1926768184;
                            }
                            i6 = iM45029 ^ i;
                            break;
                        case 1372843965:
                        case 1904433472:
                            bArr2 = bArr;
                            if (RunnableC1895.f7152) {
                                iM45029 = C19806.m45029("ܽۚ") ^ i3;
                                i5 = ((iM45029 ^ i4) * (-5457)) ^ (-1612744278);
                                i = -1244114870;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ܺ᩺") ^ i3;
                                i5 = ((iM45029 ^ i4) * (-12463)) ^ (-405428958);
                                i = -1720243413;
                            }
                            i6 = iM45029 ^ i;
                            break;
                        default:
                            str = string;
                            str2 = string2;
                            if (CallableC1627.f6528) {
                                iM45029 = (i4 - ThreadFactoryC3888.m11306("֫ۢ")) * 119;
                                i5 = ((iM45029 ^ i3) * 11161) ^ 425733900;
                                i = -320657759;
                            } else {
                                iM45029 = (C19806.m45029("ۤܳ") ^ i3) * 119;
                                i5 = ((iM45029 ^ i4) * (-25317)) ^ (-1441492154);
                                i = 75043087;
                            }
                            i6 = iM45029 ^ i;
                            break;
                    }
                    return;
                }
            }

            {
                int i = -1113546610;
                int i2 = C1148.f5161;
                int i3 = C1398.f5802;
                int iM45029 = (i3 - C19806.m45029("ۘۚ")) * 69;
                int i4 = ((iM45029 ^ i2) * 17057) ^ (-1333545315);
                int i5 = -2074185793;
                while (true) {
                    i = ((((i ^ i2) * (-25495)) >> 31) & i4) ^ (iM45029 ^ i5);
                    switch (i) {
                        case -2114332067:
                        case -1377680007:
                            if (ThreadFactoryC3888.f14547 <= 0) {
                                iM45029 = (ThreadFactoryC3888.m11306("ۘܳ") + i2) * (-23);
                                i4 = ((iM45029 ^ i3) * (-20659)) ^ (-1096603969);
                                i5 = -1723989158;
                            } else {
                                iM45029 = (ThreadFactoryC3888.m11306("ܳ֡") + i2) * (-93);
                                i4 = ((iM45029 ^ i3) * 24311) ^ 1877619598;
                                i5 = -207844651;
                            }
                            break;
                        case -2113078006:
                        case -1373042382:
                            return;
                        case -1746242059:
                        case -1108277990:
                            if (C1977.m6356()) {
                                iM45029 = C19806.m45029("ۡۗ") ^ i3;
                                i4 = ((iM45029 ^ i2) * (-14579)) ^ 1445985914;
                                i5 = 571546130;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("᩹ܿ") ^ i2;
                                i4 = ((iM45029 ^ i3) * (-8769)) ^ 855688061;
                                i5 = -1597576192;
                            }
                            break;
                        case -1719321592:
                        case 113969054:
                            if (C1668.f6641 >= 0) {
                                iM45029 = (ThreadFactoryC3888.m11306("ۘܳ") + i2) * (-23);
                                i4 = ((iM45029 ^ i3) * (-20659)) ^ (-1096603969);
                                i5 = -1723989158;
                            } else {
                                iM45029 = (i2 - C19806.m45029("ᩴᩳ")) * (-81);
                                i4 = ((iM45029 ^ i3) * (-1227)) ^ 1024884614;
                                i5 = 245454317;
                            }
                            break;
                        case -1712468946:
                        case 324179731:
                            if (C0962.m3746() >= 0) {
                                iM45029 = ThreadFactoryC3888.m11306("᩸᩻") ^ i2;
                                i4 = ((iM45029 ^ i3) * 2227) ^ (-959101405);
                                i5 = -1183737778;
                            } else {
                                iM45029 = (C19806.m45029("᩸֨") + i3) * (-65);
                                i4 = ((iM45029 ^ i2) * (-1281)) ^ 509744820;
                                i5 = -1933084263;
                            }
                            break;
                        case -1639410696:
                        case 1751051605:
                            if (MenuItemOnMenuItemClickListenerC3244.m9701() >= 0) {
                                iM45029 = C19806.m45029("ۡۗ") ^ i3;
                                i4 = ((iM45029 ^ i2) * (-14579)) ^ 1445985914;
                                i5 = 571546130;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ۡ֡") ^ i2;
                                i4 = ((iM45029 ^ i3) * 28821) ^ (-1175662401);
                                i5 = -430027991;
                            }
                            break;
                        case -1566787704:
                        case 812865866:
                            if (C2704.m8255() <= 0) {
                                iM45029 = (ThreadFactoryC3888.m11306("ۘܳ") + i2) * (-23);
                                i4 = ((iM45029 ^ i3) * (-20659)) ^ (-1096603969);
                                i5 = -1723989158;
                            } else {
                                iM45029 = (i3 - ThreadFactoryC3888.m11306("۫ᩳ")) * 25;
                                i4 = ((iM45029 ^ i2) * (-16741)) ^ 376583224;
                                i5 = 842119315;
                            }
                            break;
                        case -1525758747:
                        case 1024974470:
                            C0671.m3008();
                            iM45029 = C19806.m45029("ۡۗ") ^ i3;
                            i4 = ((iM45029 ^ i2) * (-14579)) ^ 1445985914;
                            i5 = 571546130;
                            break;
                        case -987296552:
                        case 1795598122:
                            if (C1398.f5802 <= 0) {
                                iM45029 = (i2 - ThreadFactoryC3888.m11306("ۢ᩻")) * 91;
                                i4 = ((iM45029 ^ i3) * 23683) ^ 1106088694;
                                i5 = -1050420705;
                            } else {
                                iM45029 = (ThreadFactoryC3888.m11306("ܰᩴ") + i2) * 57;
                                i4 = ((iM45029 ^ i3) * (-27809)) ^ 1309096720;
                                i5 = -843325669;
                            }
                            break;
                        case -960394582:
                        case 1487393522:
                            C2871.m8646();
                            if (C1066.m4023() > 0) {
                                iM45029 = (ThreadFactoryC3888.m11306("ۘܳ") + i2) * (-23);
                                i4 = ((iM45029 ^ i3) * (-20659)) ^ (-1096603969);
                                i5 = -1723989158;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("ۡ۠") ^ i3;
                                i4 = ((iM45029 ^ i2) * 793) ^ (-1012482254);
                                i5 = -834116767;
                            }
                            break;
                        case -912456886:
                        case 1746882282:
                            if (RunnableC3388.f12514 >= 0) {
                                iM45029 = ThreadFactoryC3888.m11306("᩸᩻") ^ i2;
                                i4 = ((iM45029 ^ i3) * 2227) ^ (-959101405);
                                i5 = -1183737778;
                            } else {
                                iM45029 = (i3 - ThreadFactoryC3888.m11306("۫ܳ")) * (-79);
                                i4 = ((iM45029 ^ i2) * (-12479)) ^ (-432222896);
                                i5 = 1906290973;
                            }
                            break;
                        case -545879551:
                        case 1621654648:
                            if (C3722.f13525 <= 0) {
                                iM45029 = ThreadFactoryC3888.m11306("ۡ۠") ^ i3;
                                i4 = ((iM45029 ^ i2) * 793) ^ (-1012482254);
                                i5 = -834116767;
                            } else {
                                iM45029 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i3;
                                i4 = ((iM45029 ^ i2) * (-32755)) ^ 1416772279;
                                i5 = -1252091363;
                            }
                            break;
                        case 151319545:
                        case 1900770591:
                            C1148.m4232();
                            C2704.m8255();
                            throw new RuntimeException();
                        case 366919700:
                        case 535877704:
                            C1189.m4368();
                            if (C3535.f13026 <= 0) {
                                iM45029 = ThreadFactoryC3888.m11306("ۡ۠") ^ i3;
                                i4 = ((iM45029 ^ i2) * 793) ^ (-1012482254);
                                i5 = -834116767;
                            } else {
                                iM45029 = (i2 - ThreadFactoryC3888.m11306("ۢ᩻")) * 91;
                                i4 = ((iM45029 ^ i3) * 23683) ^ 1106088694;
                                i5 = -1050420705;
                            }
                            break;
                        case 404941336:
                        case 1943461061:
                            if (C0216.f1393 != 0) {
                                iM45029 = C19806.m45029("ۡۗ") ^ i3;
                                i4 = ((iM45029 ^ i2) * (-14579)) ^ 1445985914;
                                i5 = 571546130;
                            } else {
                                iM45029 = (C19806.m45029("ۚۛ") ^ i3) * (-9);
                                i4 = ((iM45029 ^ i2) * 2587) ^ (-313355531);
                                i5 = -774316515;
                            }
                            break;
                        default:
                            MenuItemOnMenuItemClickListenerC3244.m9701();
                            if (!RunnableC1564.f6300) {
                                iM45029 = (i2 - ThreadFactoryC3888.m11306("ۢ᩻")) * 91;
                                i4 = ((iM45029 ^ i3) * 23683) ^ 1106088694;
                                i5 = -1050420705;
                            } else {
                                iM45029 = C19806.m45029("ۡۗ") ^ i3;
                                i4 = ((iM45029 ^ i2) * (-14579)) ^ 1445985914;
                                i5 = 571546130;
                            }
                            break;
                    }
                }
            }
        }).start();
        return false;
    }
}
