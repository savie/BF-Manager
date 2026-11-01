package l;

import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۖܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 12B7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2624 extends AbstractC0414 {

    /* JADX INFO: renamed from: ᩺ᩴۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f10250 = {1341, 20554, 24147, -20236};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC13209 f10251;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC13209 f10252;

    /* JADX WARN: Code duplicated, block: B:17:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x01df A[PHI: r5 r10 r11 r15
      0x01df: PHI (r5v4 android.view.View) = (r5v2 android.view.View), (r5v2 android.view.View), (r5v3 android.view.View), (r5v2 android.view.View) binds: [B:54:0x01dd, B:35:0x011b, B:107:0x01df, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x01df: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:54:0x01dd, B:35:0x011b, B:107:0x01df, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x01df: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:54:0x01dd, B:35:0x011b, B:107:0x01df, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x01df: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:54:0x01dd, B:35:0x011b, B:107:0x01df, B:14:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        short[] sArr;
        int i2;
        int iM45029;
        int i3;
        int i4;
        int iM11306;
        C2624 c2624 = this;
        int i5 = C3577.f13150;
        int i6 = C1189.f5284;
        int iM450210 = C19806.m45029("᩷֫") ^ i5;
        int i7 = ((iM450210 ^ i6) * 10047) ^ 1840958795;
        View viewInflate = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM450210 ^ 2099425209;
        LayoutInflater layoutInflaterFrom = null;
        int i9 = 0;
        boolean z = false;
        int iM450211 = 0;
        short s = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1385244247;
        while (true) {
            i15 = i8 ^ (i7 & (((i15 ^ i6) * 24397) >> 31));
            switch (i15) {
                case -2034995053:
                case 61606970:
                    viewInflate = layoutInflaterFrom.inflate(i9, viewGroup, z);
                    if (C0817.f3443) {
                        int iM450212 = (C19806.m45029("֨۟") ^ i5) * 5;
                        i7 = ((iM450212 ^ i6) * (-2361)) ^ (-1106863410);
                        i8 = iM450212 ^ (-415067483);
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i5;
                        i2 = ((iM45029 ^ i6) * 4573) ^ (-1910814335);
                        i3 = -1023602491;
                        i8 = iM45029 ^ i3;
                        i7 = i2;
                    }
                    break;
                case -1996186842:
                case -79053497:
                    i13 = 40814;
                    iM45029 = (C19806.m45029("ۢܺ") + i6) * 61;
                    i2 = ((iM45029 ^ i5) * 731) ^ 425113098;
                    i3 = -1358192422;
                    i8 = iM45029 ^ i3;
                    i7 = i2;
                    break;
                case -1993185978:
                case 1498377077:
                    i14 = 1;
                    if (CallableC1627.f6528) {
                        iM45029 = (C19806.m45029("ܽۢ") ^ i5) * (-57);
                        i2 = ((iM45029 ^ i6) * (-23535)) ^ 937456958;
                        i3 = -1435060651;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i5;
                        i2 = ((iM45029 ^ i6) * 4573) ^ (-1910814335);
                        i3 = -1023602491;
                    }
                    i8 = iM45029 ^ i3;
                    i7 = i2;
                    break;
                case -1535376944:
                case 1326094271:
                    i12 = 216707841;
                    if (!C19806.f63586) {
                        iM45029 = ThreadFactoryC3888.m11306("ܿۖ") ^ i5;
                        i2 = ((iM45029 ^ i6) * 32275) ^ (-1726915486);
                        i3 = 1201549269;
                        i8 = iM45029 ^ i3;
                        i7 = i2;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩺") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-28353)) ^ (-2105241338);
                        i4 = 454364416;
                        i8 = iM11306 ^ i4;
                        c2624 = this;
                    }
                    break;
                case -1512213988:
                case -581727503:
                    int i16 = i11 + i12;
                    if (i10 - (i16 + i16) > 0) {
                        iM45029 = C19806.m45029("ۗ֨") ^ i5;
                        i2 = ((iM45029 ^ i6) * 13765) ^ 962367550;
                        i3 = 1636050597;
                    } else {
                        iM45029 = (i6 - ThreadFactoryC3888.m11306("ܽ᩹")) * 101;
                        i2 = ((iM45029 ^ i5) * (-1069)) ^ 814340394;
                        i3 = -1785949243;
                    }
                    i8 = iM45029 ^ i3;
                    i7 = i2;
                    break;
                case -1405465103:
                case 733069195:
                    int i17 = s + s2;
                    i10 = i17 * i17;
                    i11 = s * s;
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i5;
                        i2 = ((iM45029 ^ i6) * 4573) ^ (-1910814335);
                        i3 = -1023602491;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛۗ") ^ i6;
                        i2 = ((iM45029 ^ i5) * (-12099)) ^ (-110366039);
                        i3 = -734371651;
                    }
                    i8 = iM45029 ^ i3;
                    i7 = i2;
                    break;
                case -1318797571:
                case 1420132369:
                    C3743.m10966();
                    C1875.m6086();
                    return null;
                case -734097494:
                case 27852365:
                    i9 = iM450211 ^ 2125955389;
                    z = false;
                    if (CallableC1627.m5507() == 0) {
                        iM45029 = ThreadFactoryC3888.m11306("֫᩵") ^ i5;
                        i2 = ((iM45029 ^ i6) * (-2519)) ^ (-1521729247);
                        i3 = -1721662397;
                        i8 = iM45029 ^ i3;
                        i7 = i2;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩺") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-28353)) ^ (-2105241338);
                        i4 = 454364416;
                        i8 = iM11306 ^ i4;
                        c2624 = this;
                    }
                    break;
                case -727586595:
                case 1447076565:
                    s = sArr2[0];
                    s2 = 14721;
                    if (!RunnableC1564.m5345()) {
                        iM45029 = (C19806.m45029("᩸ܽ") ^ i5) * (-115);
                        i2 = ((iM45029 ^ i6) * (-5289)) ^ 1525661443;
                        i3 = 1586421269;
                        i8 = iM45029 ^ i3;
                        i7 = i2;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩺") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-28353)) ^ (-2105241338);
                        i4 = 454364416;
                        i8 = iM11306 ^ i4;
                        c2624 = this;
                    }
                    break;
                case -649496136:
                case 1025311865:
                    if (C0216.f1393 != 0) {
                        iM45029 = (C19806.m45029("ۨܳ") ^ i6) * (-81);
                        i2 = ((iM45029 ^ i5) * 22057) ^ (-2140870511);
                        i3 = 756859511;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۤ") ^ i6;
                        i2 = ((iM45029 ^ i5) * 17837) ^ 955368521;
                        i3 = -1365641734;
                    }
                    i8 = iM45029 ^ i3;
                    i7 = i2;
                    break;
                case -569839796:
                case -5915192:
                    i13 = 8663;
                    iM45029 = (C19806.m45029("ۢܺ") + i6) * 61;
                    i2 = ((iM45029 ^ i5) * 731) ^ 425113098;
                    i3 = -1358192422;
                    i8 = iM45029 ^ i3;
                    i7 = i2;
                    break;
                case -555767387:
                case 422766576:
                    C1148.m4232();
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (C19806.m45029("ۨܳ") ^ i6) * (-81);
                        i2 = ((iM45029 ^ i5) * 22057) ^ (-2140870511);
                        i3 = 756859511;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i5;
                        i2 = ((iM45029 ^ i6) * 4573) ^ (-1910814335);
                        i3 = -1023602491;
                    }
                    i8 = iM45029 ^ i3;
                    i7 = i2;
                    break;
                case -515418287:
                case 339439036:
                    return new ViewOnClickListenerC1213(c2624.f10252, viewInflate);
                case -403908610:
                case 118607807:
                    if (C1066.f4915 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩺") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-28353)) ^ (-2105241338);
                        i4 = 454364416;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ۫") ^ i6;
                        i7 = ((iM11306 ^ i5) * (-10037)) ^ (-1744737891);
                        i4 = 1070538541;
                    }
                    i8 = iM11306 ^ i4;
                    c2624 = this;
                    break;
                case -384145007:
                case 1334409627:
                    sArr = f10250;
                    if (C0671.f2816 == 0) {
                        int iM450213 = (i5 - C19806.m45029("ۚܰ")) * (-19);
                        i2 = ((iM450213 ^ i6) * (-9689)) ^ (-1532748944);
                        i8 = iM450213 ^ (-728433364);
                        c2624 = this;
                        sArr2 = sArr;
                        i7 = i2;
                    } else {
                        int iM11307 = ThreadFactoryC3888.m11306("۠᩻") ^ i6;
                        i8 = iM11307 ^ 1297830355;
                        sArr2 = sArr;
                        i7 = ((iM11307 ^ i5) * (-28887)) ^ (-823816160);
                        c2624 = this;
                    }
                    break;
                case 442085290:
                case 574654543:
                    iM450211 = C19806.m45029(C1875.m6105(sArr3, i14, 3, i13));
                    if (C0216.f1393 == 0) {
                        iM45029 = C19806.m45029("֡᩻") ^ i6;
                        i2 = ((iM45029 ^ i5) * 1935) ^ 125975823;
                        i3 = 1911458950;
                        i8 = iM45029 ^ i3;
                        i7 = i2;
                    } else {
                        sArr = sArr2;
                        int iM11308 = ThreadFactoryC3888.m11306("۠᩻") ^ i6;
                        i8 = iM11308 ^ 1297830355;
                        sArr2 = sArr;
                        i7 = ((iM11308 ^ i5) * (-28887)) ^ (-823816160);
                        c2624 = this;
                    }
                    break;
                case 1479588908:
                case 1622992341:
                    C1398.m4895();
                    AbstractC0464.m2313();
                    iM45029 = (C19806.m45029("ۨܳ") ^ i6) * (-81);
                    i2 = ((iM45029 ^ i5) * 22057) ^ (-2140870511);
                    i3 = 756859511;
                    i8 = iM45029 ^ i3;
                    i7 = i2;
                    break;
                case 1845841215:
                case 1888831367:
                    layoutInflaterFrom = LayoutInflater.from(c2624.f10251);
                    sArr3 = f10250;
                    if (C3286.m9798() > 0) {
                        iM45029 = (i6 - C19806.m45029("᩸ۨ")) * (-99);
                        i2 = ((iM45029 ^ i5) * 15069) ^ (-2140544219);
                        i3 = -861237208;
                        i8 = iM45029 ^ i3;
                        i7 = i2;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩺") ^ i5;
                        i7 = ((iM11306 ^ i6) * (-28353)) ^ (-2105241338);
                        i4 = 454364416;
                        i8 = iM11306 ^ i4;
                        c2624 = this;
                    }
                    break;
                default:
                    C1377.m4833();
                    if (!C19806.f63586) {
                        sArr = sArr2;
                        int iM11309 = ThreadFactoryC3888.m11306("۠᩻") ^ i6;
                        i8 = iM11309 ^ 1297830355;
                        sArr2 = sArr;
                        i7 = ((iM11309 ^ i5) * (-28887)) ^ (-823816160);
                        c2624 = this;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶۤ") ^ i6;
                        i2 = ((iM45029 ^ i5) * 17837) ^ 955368521;
                        i3 = -1365641734;
                        i8 = iM45029 ^ i3;
                        i7 = i2;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ViewOnClickListenerC1213 viewOnClickListenerC1213 = null;
        ImageView imageView = null;
        ImageView imageView2 = null;
        Drawable drawable = null;
        PorterDuffColorFilter porterDuffColorFilterM24638 = null;
        int i2 = 70669489;
        int i3 = C1189.f5284;
        int i4 = C3577.f13150;
        int iM11306 = ThreadFactoryC3888.m11306("᩶ۜ") ^ i3;
        int i5 = ((iM11306 ^ i4) * 16599) ^ 1660785451;
        int i6 = -1876417177;
        while (true) {
            i2 = ((((i2 ^ i4) * 29921) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1836823233:
                case -170798322:
                    imageView.setImageResource(ViewOnClickListenerC13209.f43952[i]);
                    if (C19806.m45024()) {
                        iM11306 = C19806.m45029("֨ܰ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 27661) ^ 1820331621;
                        i6 = -1106152748;
                    } else {
                        iM11306 = C19806.m45029("ۛۛ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 27625) ^ 1750322554;
                        i6 = -1439063267;
                    }
                    break;
                case -1453421022:
                case -1221685761:
                    if (RunnableC1564.f6300) {
                        iM11306 = (i4 - C19806.m45029("᩵ܺ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM11306 ^ i3) * 17663) ^ 1737494932;
                        i6 = -130920479;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢᩴ") + i4) * 45;
                        i5 = ((iM11306 ^ i3) * (-24743)) ^ 1631711428;
                        i6 = 2116763686;
                    }
                    break;
                case -1394470309:
                case -976207484:
                    if (C2642.m8171() != 0) {
                        iM11306 = C19806.m45029("᩸ܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 26559) ^ 1154836917;
                        i6 = 723334620;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩸ܰ")) * 79;
                        i5 = ((iM11306 ^ i3) * 1977) ^ (-1506571545);
                        i6 = 917244790;
                    }
                    break;
                case -1202604901:
                case 463208899:
                    if (C1025.f4800 >= 0) {
                        iM11306 = (C19806.m45029("ۖۨ") ^ i3) * (-47);
                        i5 = ((iM11306 ^ i4) * (-7783)) ^ 1714167462;
                        i6 = 855166731;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩵ܺ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM11306 ^ i3) * 17663) ^ 1737494932;
                        i6 = -130920479;
                    }
                    break;
                case -928355142:
                case 1245883035:
                    C10634.m26820();
                    RunnableC0195.m1431();
                    iM11306 = C19806.m45029("᩸ܶ") ^ i3;
                    i5 = ((iM11306 ^ i4) * 26559) ^ 1154836917;
                    i6 = 723334620;
                    break;
                case -903171074:
                case 1374484824:
                    RunnableC1606.m5473();
                    if (C3660.f13403 >= 0) {
                        iM11306 = (i4 - C19806.m45029("᩵ܺ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM11306 ^ i3) * 17663) ^ 1737494932;
                        i6 = -130920479;
                    } else {
                        iM11306 = C19806.m45029("᩸ܶ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 26559) ^ 1154836917;
                        i6 = 723334620;
                    }
                    break;
                case -833126803:
                case 210422250:
                    if (ThreadFactoryC3888.f14547 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-29309)) ^ 972849105;
                        i6 = -2125328911;
                    } else {
                        iM11306 = (i4 - C19806.m45029("᩵ܺ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM11306 ^ i3) * 17663) ^ 1737494932;
                        i6 = -130920479;
                    }
                    break;
                case -629161396:
                case 308854244:
                    imageView2 = viewOnClickListenerC1213.f5341;
                    if (C3577.m10565()) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ܿۨ")) * 17;
                        i5 = ((iM11306 ^ i3) * 11595) ^ 1032008040;
                        i6 = -1372422980;
                    } else {
                        iM11306 = C19806.m45029("֨ܰ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 27661) ^ 1820331621;
                        i6 = -1106152748;
                    }
                    break;
                case -375358506:
                case 348074519:
                    drawable = imageView2.getDrawable();
                    porterDuffColorFilterM24638 = C9682.m24638(C20368.f66007);
                    if (C2871.f10837 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-29309)) ^ 972849105;
                        i6 = -2125328911;
                    } else {
                        iM11306 = (C19806.m45029("ۛ֡") ^ i3) * 101;
                        i5 = ((iM11306 ^ i4) * 31753) ^ 335914265;
                        i6 = 454788103;
                    }
                    break;
                case -218889565:
                case 1440527232:
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳᩴ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-29309)) ^ 972849105;
                        i6 = -2125328911;
                    } else {
                        iM11306 = C19806.m45029("۬᩷") ^ i3;
                        i5 = ((iM11306 ^ i4) * 6173) ^ (-2069720675);
                        i6 = 1629360045;
                    }
                    break;
                case -165410989:
                case 1209372839:
                    viewOnClickListenerC1213 = (ViewOnClickListenerC1213) abstractC12554;
                    imageView = viewOnClickListenerC1213.f5341;
                    if (C1977.f7413 <= 0) {
                        iM11306 = C19806.m45029("֨ܰ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 27661) ^ 1820331621;
                        i6 = -1106152748;
                    } else {
                        iM11306 = (C19806.m45029("ᩳ֨") + i3) * (-3);
                        i5 = ((iM11306 ^ i4) * 27929) ^ 1416583556;
                        i6 = 1525938080;
                    }
                    break;
                case 257637871:
                case 290997399:
                    if (C2642.f10294 <= 0) {
                        iM11306 = (C19806.m45029("ۖۨ") ^ i3) * (-47);
                        i5 = ((iM11306 ^ i4) * (-7783)) ^ 1714167462;
                        i6 = 855166731;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩻ܺ") ^ i4) * (-23);
                        i5 = ((iM11306 ^ i3) * (-5715)) ^ 300552772;
                        i6 = -1104402162;
                    }
                    break;
                case 492468418:
                case 1532539987:
                    AbstractC0464.m2313();
                    C1377.m4833();
                    break;
                case 816500045:
                case 1356360980:
                    drawable.setColorFilter(porterDuffColorFilterM24638);
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("ۖۨ") ^ i3) * (-47);
                        i5 = ((iM11306 ^ i4) * (-7783)) ^ 1714167462;
                        i6 = 855166731;
                    } else {
                        iM11306 = C19806.m45029("ۛ᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-433)) ^ 220774316;
                        i6 = -403022808;
                    }
                    break;
                case 983711209:
                case 2100818299:
                    ThreadFactoryC3888.m11303(viewOnClickListenerC1213.f5342, ViewOnClickListenerC13209.f43953[i]);
                    break;
                default:
                    if (C2332.f8260) {
                        iM11306 = (i3 - C19806.m45029("ۛ᩸")) * (-109);
                        i5 = ((iM11306 ^ i4) * 7839) ^ 778875150;
                        i6 = -141018280;
                    } else {
                        iM11306 = C19806.m45029("֨ܰ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 27661) ^ 1820331621;
                        i6 = -1106152748;
                    }
                    break;
            }
            return;
        }
    }

    public C2624(ViewOnClickListenerC13209 viewOnClickListenerC13209, ViewOnClickListenerC13209 viewOnClickListenerC132010) {
        int i = -75093157;
        int i2 = C2249.f8050;
        int i3 = C2788.f10625;
        this.f10252 = viewOnClickListenerC13209;
        int iM11306 = ThreadFactoryC3888.m11306("۟ܳ") ^ i2;
        int i4 = ((iM11306 ^ i3) * 4539) ^ (-1559794374);
        int i5 = -47792155;
        while (true) {
            i = ((((i ^ i3) * (-28897)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1779352349:
                case -1023589523:
                    if (CallableC1627.m5507() == 0) {
                        iM11306 = (C19806.m45029("֫᩵") ^ i3) * 93;
                        i4 = ((iM11306 ^ i2) * (-30899)) ^ 1178159962;
                        i5 = 335175855;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13157) ^ (-35302881);
                        i5 = -1658226083;
                    }
                    break;
                case -1736941685:
                case -1241267651:
                    if (C0526.f2219) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۫᩶")) * 79;
                        i4 = ((iM11306 ^ i3) * 199) ^ (-92087530);
                        i5 = -127085998;
                    } else {
                        iM11306 = C19806.m45029("ۧᩳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16167) ^ (-159723021);
                        i5 = 148561142;
                    }
                    break;
                case -1535403229:
                case 237685566:
                    C0526.m2437();
                    if (C1189.f5284 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13157) ^ (-35302881);
                        i5 = -1658226083;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۫᩶")) * 79;
                        i4 = ((iM11306 ^ i3) * 199) ^ (-92087530);
                        i5 = -127085998;
                    }
                    break;
                case -1506338066:
                case -981991010:
                    C0962.m3746();
                    throw new RuntimeException();
                case -1336952873:
                case 294460658:
                    if (C2249.m6915() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * 28969) ^ (-1901932355);
                        i5 = 387141369;
                    } else {
                        iM11306 = C19806.m45029("ۧܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 11891) ^ (-16890389);
                        i5 = 1724285038;
                    }
                    break;
                case -1328271467:
                case -16167414:
                    C1025.m3861();
                    RunnableC1564.m5345();
                    iM11306 = (i2 - ThreadFactoryC3888.m11306("۫᩶")) * 79;
                    i4 = ((iM11306 ^ i3) * 199) ^ (-92087530);
                    i5 = -127085998;
                    break;
                case -1289177196:
                case 1529161872:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (i3 - C19806.m45029("᩵ᩳ")) * 31;
                        i4 = ((iM11306 ^ i2) * 10107) ^ 1285684130;
                        i5 = 1465107805;
                    } else {
                        iM11306 = (C19806.m45029("᩶ᩳ") ^ i3) * 35;
                        i4 = ((iM11306 ^ i2) * 23313) ^ 98301945;
                        i5 = -40288550;
                    }
                    break;
                case -1133944965:
                case 1027945150:
                    this.f10251 = viewOnClickListenerC132010;
                    if (C1189.m4368() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * 28969) ^ (-1901932355);
                        i5 = 387141369;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫۫") + i2) * (-37);
                        i4 = ((iM11306 ^ i3) * 10033) ^ 1561014198;
                        i5 = 537381159;
                    }
                    break;
                case -1059632404:
                case 1210988208:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܽ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 31437) ^ 1691998874;
                        i5 = 689914693;
                    } else {
                        iM11306 = (i3 - C19806.m45029("᩵ᩳ")) * 31;
                        i4 = ((iM11306 ^ i2) * 10107) ^ 1285684130;
                        i5 = 1465107805;
                    }
                    break;
                case -1025227653:
                case 1840025900:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (C19806.m45029("֫᩵") ^ i3) * 93;
                        i4 = ((iM11306 ^ i2) * (-30899)) ^ 1178159962;
                        i5 = 335175855;
                    } else {
                        iM11306 = (C19806.m45029("֨ۡ") ^ i2) * 65;
                        i4 = ((iM11306 ^ i3) * (-3867)) ^ 823869426;
                        i5 = 945223696;
                    }
                    break;
                case -583743924:
                case 627175372:
                    if (C2788.m8472() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13157) ^ (-35302881);
                        i5 = -1658226083;
                    } else {
                        iM11306 = C19806.m45029("ܶۤ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-4573)) ^ (-248463582);
                        i5 = -1262374128;
                    }
                    break;
                case -519355194:
                case -149187276:
                    if (C0278.f1572 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13157) ^ (-35302881);
                        i5 = -1658226083;
                    } else {
                        iM11306 = C19806.m45029("ܳۨ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-28267)) ^ 299003050;
                        i5 = 1478224113;
                    }
                    break;
                case -377686679:
                case 757577665:
                    if (ThreadFactoryC3888.m11300() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܽ۟") ^ i3;
                        i4 = ((iM11306 ^ i2) * 28969) ^ (-1901932355);
                        i5 = 387141369;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۧ᩶")) * (-73);
                        i4 = ((iM11306 ^ i2) * 20095) ^ 2138516909;
                        i5 = -696272065;
                    }
                    break;
                case 693904286:
                case 1217130241:
                    return;
                case 1557016696:
                case 1565091158:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (i3 - C19806.m45029("᩵ᩳ")) * 31;
                        i4 = ((iM11306 ^ i2) * 10107) ^ 1285684130;
                        i5 = 1465107805;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۫᩶")) * 79;
                        i4 = ((iM11306 ^ i3) * 199) ^ (-92087530);
                        i5 = -127085998;
                    }
                    break;
                default:
                    if (C1398.m4895() <= 0) {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("۫᩶")) * 79;
                        i4 = ((iM11306 ^ i3) * 199) ^ (-92087530);
                        i5 = -127085998;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ֨") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-15659)) ^ 972309354;
                        i5 = -2008171208;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        int[] unused = ViewOnClickListenerC13209.f43952;
        return 15;
    }
}
