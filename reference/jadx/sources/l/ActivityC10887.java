package l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۧۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A97T */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10887 extends ActivityC4866 {

    /* JADX INFO: renamed from: ۖ۬᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f37058 = {5378, -10396, -10389, -10399, -10377, -10390, -10388, -10399, -10453, -10388, -10389, -10383, -10400, -10389, -10383, -10453, -10396, -10394, -10383, -10388, -10390, -10389, -10453, -10413, -10420, -10432, -10414, -10397, -10377, -10390, -10392, -10432, -10371, -10383, -10400, -10377, -10389, -10396, -10391, -10428, -10379, -10379};

    /* JADX WARN: Code duplicated, block: B:105:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x03df  */
    /* JADX WARN: Code duplicated, block: B:113:0x040b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0274 A[PHI: r14
      0x0274: PHI (r14v3 int) = (r14v2 int), (r14v1 int), (r14v1 int) binds: [B:76:0x0272, B:27:0x008d, B:14:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x032e A[PHI: r8 r12 r13
      0x032e: PHI (r8v3 char) = (r8v2 char), (r8v1 char), (r8v1 char), (r8v1 char) binds: [B:92:0x032c, B:80:0x02a8, B:11:0x0051, B:158:0x032e] A[DONT_GENERATE, DONT_INLINE]
      0x032e: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:92:0x032c, B:80:0x02a8, B:11:0x0051, B:158:0x032e] A[DONT_GENERATE, DONT_INLINE]
      0x032e: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:92:0x032c, B:80:0x02a8, B:11:0x0051, B:158:0x032e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0362 A[PHI: r22
      0x0362: PHI (r22v3 short[]) = (r22v2 short[]), (r22v1 short[]), (r22v1 short[]) binds: [B:96:0x0360, B:27:0x008d, B:160:0x0362] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM45029;
        int i;
        int i2;
        Uri uriM46732;
        int iM11306;
        int i3;
        int i4;
        ActivityC10887 activityC10887 = this;
        boolean zM46725 = false;
        Uri uri = null;
        SecurityException securityException = null;
        int flags = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 274898476;
        int i11 = RunnableC0195.f1321;
        int i12 = C1937.f7317;
        int iM450210 = (C19806.m45029("᩻ܺ") + i12) * (-115);
        int i13 = ((iM450210 ^ i11) * 1877) ^ (-1424066950);
        int i14 = iM450210 ^ (-804986407);
        short[] sArr = null;
        Intent intent = null;
        AbstractC20745 abstractC20745M15314 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * (-8663)) >> 31));
            switch (i10) {
                case -2040344688:
                case -583775430:
                    sArr = f37058;
                    if (C2704.f10408) {
                        iM45029 = (C19806.m45029("ۙۖ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM45029 ^ i12) * (-2289)) ^ (-1797841754);
                        i2 = -1340160976;
                    } else {
                        iM45029 = (i11 - C19806.m45029("۠ۘ")) * 33;
                        i = ((iM45029 ^ i12) * 17235) ^ (-1433129498);
                        i2 = -944252296;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -2012262751:
                case -1172485104:
                    if ((flags & 1) != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֨") ^ i12;
                        i3 = ((iM11306 ^ i11) * (-26855)) ^ (-1785815774);
                        i4 = 133973767;
                    } else {
                        iM11306 = (C19806.m45029("ۜۜ") ^ i11) * (-127);
                        i3 = ((iM11306 ^ i12) * (-28625)) ^ (-191985098);
                        i4 = -1133629708;
                    }
                    i14 = iM11306 ^ i4;
                    i13 = i3;
                    break;
                case -1931734915:
                case -156746437:
                    C0050.m946();
                    C2124.m6673();
                    return;
                case -1930852901:
                case 1665550750:
                    abstractC20745M15314 = C5553.m15314(this);
                    zM46725 = abstractC20745M15314.m46725();
                    iM45029 = C19806.m45029("ۘ۫") ^ i11;
                    i = ((iM45029 ^ i12) * (-18611)) ^ 847119460;
                    i2 = 996969313;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -1900183817:
                case 1282162195:
                    i9 = 55045;
                    iM45029 = (C19806.m45029("᩶᩸") + i11) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM45029 ^ i12) * (-20403)) ^ (-571003708);
                    i2 = 1915621305;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -1757693085:
                case 1225379151:
                    if (CallableC1627.m5507() == 0) {
                        iM45029 = (i11 - C19806.m45029("۠ۘ")) * 33;
                        i = ((iM45029 ^ i12) * 17235) ^ (-1433129498);
                        i2 = -944252296;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ֡") ^ i12;
                        i = ((iM45029 ^ i11) * 32753) ^ (-851427380);
                        i2 = 14324652;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -1732671967:
                case 515101388:
                    if (zM46725) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۛ") ^ i12) * (-25);
                        i = ((iM45029 ^ i11) * 30625) ^ 497588163;
                        i2 = 1690871404;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵۫") + i11) * q.h;
                        i = ((iM45029 ^ i12) * (-29631)) ^ 1524747711;
                        i2 = -418979275;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -1638147558:
                case 2105244060:
                    uriM46732 = abstractC20745M15314.mo40127();
                    uri = uriM46732;
                    iM45029 = C19806.m45029("᩻ܰ") ^ i11;
                    i = ((iM45029 ^ i12) * 30571) ^ (-773530266);
                    i2 = -1279598591;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -1636571958:
                case -1627920632:
                    super.onCreate(bundle);
                    iM45029 = C19806.m45029("ܿ֨") ^ i12;
                    i = ((iM45029 ^ i11) * (-6461)) ^ (-1735516192);
                    i2 = 1733629695;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -1570294146:
                case -666611378:
                    i5 = s + s2;
                    if (C1875.f7103 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ֨") ^ i12;
                        i = ((iM45029 ^ i11) * (-5143)) ^ (-78336831);
                        i2 = 629928718;
                    } else {
                        iM45029 = (C19806.m45029("᩹֫") ^ i12) * 45;
                        i = ((iM45029 ^ i11) * 2519) ^ 707347670;
                        i2 = 300860660;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -1379810602:
                case -872736826:
                    int i15 = i7 + i8;
                    if ((i15 + i15) - i6 >= 0) {
                        iM45029 = C19806.m45029("ܺᩴ") ^ i12;
                        i = ((iM45029 ^ i11) * 10691) ^ (-983850456);
                        i2 = 1694626272;
                    } else {
                        iM45029 = C19806.m45029("ܰۡ") ^ i11;
                        i = ((iM45029 ^ i12) * 5549) ^ 246457302;
                        i2 = 2144935511;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -1342385593:
                case -1255725369:
                    s = sArr[c];
                    s2 = 19519;
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i11 - C19806.m45029("ۖ᩻")) * 15;
                        i = ((iM45029 ^ i12) * 24519) ^ 2038007733;
                        i2 = 239218065;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽܶ") ^ i11;
                        i = ((iM45029 ^ i12) * (-7373)) ^ (-99441291);
                        i2 = 28444596;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -996244895:
                case -886892302:
                    i8 = 380991361;
                    if (RunnableC1564.f6300) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ֡") ^ i12;
                        i = ((iM45029 ^ i11) * 32753) ^ (-851427380);
                        i2 = 14324652;
                    } else {
                        iM45029 = (C19806.m45029("᩹᩸") + i11) * (-13);
                        i = ((iM45029 ^ i12) * 4469) ^ (-539605625);
                        i2 = 1711410928;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -979003166:
                case 1277163713:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (C19806.m45029("۟ܺ") ^ i11) * (-37);
                        i = ((iM45029 ^ i12) * (-5999)) ^ 2115829429;
                        i2 = 1751821641;
                    } else {
                        iM45029 = (C19806.m45029("᩺ܰ") + i12) * (-5);
                        i = ((iM45029 ^ i11) * (-6721)) ^ (-638478188);
                        i2 = -1200242133;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -962080939:
                case -505768384:
                    c = 0;
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۖ") ^ i12) * (-25);
                        i = ((iM45029 ^ i11) * 12747) ^ (-897733032);
                        i2 = -1144017633;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ᩴ") ^ i12) * (-105);
                        i = ((iM45029 ^ i11) * 17613) ^ (-1769918052);
                        i2 = -92059368;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -950056205:
                case 85985959:
                    throw securityException;
                case -924327995:
                case -898833788:
                    if (C2477.f9839 <= 0) {
                        iM45029 = (C19806.m45029("۟ܺ") ^ i11) * (-37);
                        i = ((iM45029 ^ i12) * (-5999)) ^ 2115829429;
                        i2 = 1751821641;
                    } else {
                        iM45029 = (C19806.m45029("᩻ܶ") ^ i11) * (-41);
                        i = ((iM45029 ^ i12) * (-2653)) ^ 919403684;
                        i2 = -1112527763;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -835230895:
                case 1886522236:
                    C1419.m4973();
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (C19806.m45029("۟ܺ") ^ i11) * (-37);
                        i = ((iM45029 ^ i12) * (-5999)) ^ 2115829429;
                        i2 = 1751821641;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۡ") ^ i11;
                        i = ((iM45029 ^ i12) * (-22891)) ^ (-273628150);
                        i2 = -522492508;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -820254196:
                case 370922069:
                    flags = intent.getFlags();
                    iM11306 = (ThreadFactoryC3888.m11306("᩸ܿ") + i11) * (-69);
                    i3 = ((iM11306 ^ i12) * (-8925)) ^ (-288514392);
                    i4 = 1584484447;
                    i14 = iM11306 ^ i4;
                    i13 = i3;
                    break;
                case -787639676:
                case 1100937060:
                    if (C0050.f912 <= 0) {
                        iM45029 = (i11 - C19806.m45029("ۖ᩻")) * 15;
                        i = ((iM45029 ^ i12) * 24519) ^ 2038007733;
                        i2 = 239218065;
                        i14 = iM45029 ^ i2;
                        i13 = i;
                        activityC10887 = this;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܰ") ^ i12) * 49;
                        i3 = ((iM11306 ^ i11) * (-24529)) ^ 343358693;
                        i4 = -1815858461;
                        i14 = iM11306 ^ i4;
                        i13 = i3;
                    }
                    break;
                case -727113731:
                case -287255773:
                    C0216.m1586(this);
                    return;
                case -641491005:
                case 1744332103:
                    C0629.m2907();
                    iM11306 = (ThreadFactoryC3888.m11306("ܽܰ") ^ i12) * 49;
                    i3 = ((iM11306 ^ i11) * (-24529)) ^ 343358693;
                    i4 = -1815858461;
                    i14 = iM11306 ^ i4;
                    i13 = i3;
                    break;
                case -603181643:
                case 1129506752:
                    i9 = 44543;
                    iM45029 = (C19806.m45029("᩶᩸") + i11) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM45029 ^ i12) * (-20403)) ^ (-571003708);
                    i2 = 1915621305;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -402955664:
                case 1706275047:
                    uriM46732 = abstractC20745M15314.m46732();
                    uri = uriM46732;
                    iM45029 = C19806.m45029("᩻ܰ") ^ i11;
                    i = ((iM45029 ^ i12) * 30571) ^ (-773530266);
                    i2 = -1279598591;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -345635994:
                case 1124557219:
                    C3660.m10791();
                    if (C2788.f10625 >= 0) {
                        iM45029 = (i11 - C19806.m45029("۠ۘ")) * 33;
                        i = ((iM45029 ^ i12) * 17235) ^ (-1433129498);
                        i2 = -944252296;
                        i14 = iM45029 ^ i2;
                        i13 = i;
                        activityC10887 = this;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܰ") ^ i12) * 49;
                        i3 = ((iM11306 ^ i11) * (-24529)) ^ 343358693;
                        i4 = -1815858461;
                        i14 = iM11306 ^ i4;
                        i13 = i3;
                    }
                    break;
                case -331151237:
                case 542718926:
                    intent.setFlags(flags & (-4));
                    RunnableC1606.m5467(activityC10887, intent);
                    iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i12;
                    i = ((iM45029 ^ i11) * (-8993)) ^ 757700956;
                    i2 = 1058427152;
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case -49605647:
                case 1632512743:
                    i6 = i5 * i5;
                    i7 = s * s;
                    if (C10634.m26820()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۖ") ^ i12) * (-25);
                        i = ((iM45029 ^ i11) * 12747) ^ (-897733032);
                        i2 = -1144017633;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ۟") ^ i12) * 89;
                        i = ((iM45029 ^ i11) * 5961) ^ (-407740728);
                        i2 = 805854897;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case 3043055:
                case 1124960476:
                    C1189.m4368();
                    if (C3286.f12186) {
                        iM45029 = C19806.m45029("ۡᩳ") ^ i12;
                        i = ((iM45029 ^ i11) * (-8995)) ^ (-1903754724);
                        i2 = -1431144643;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۖ") ^ i12) * (-25);
                        i = ((iM45029 ^ i11) * 12747) ^ (-897733032);
                        i2 = -1144017633;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case 295039779:
                case 1722316668:
                    if (C2788.f10625 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩶ۖ") ^ i12) * (-25);
                        i = ((iM45029 ^ i11) * 12747) ^ (-897733032);
                        i2 = -1144017633;
                        i14 = iM45029 ^ i2;
                        i13 = i;
                        activityC10887 = this;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܰ") ^ i12) * 49;
                        i3 = ((iM11306 ^ i11) * (-24529)) ^ 343358693;
                        i4 = -1815858461;
                        i14 = iM11306 ^ i4;
                        i13 = i3;
                    }
                    break;
                case 475209348:
                case 1957601563:
                    try {
                        RunnableC1606.m5467(activityC10887, intent);
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i12;
                        i = ((iM45029 ^ i11) * (-8993)) ^ 757700956;
                        i2 = 1058427152;
                        i14 = iM45029 ^ i2;
                        i13 = i;
                        activityC10887 = this;
                    } catch (SecurityException e) {
                        int iM450211 = (C19806.m45029("ܰܳ") ^ i12) * (-65);
                        i3 = ((iM450211 ^ i11) * (-31957)) ^ (-1151728974);
                        i14 = iM450211 ^ 855982919;
                        securityException = e;
                        i13 = i3;
                    }
                    break;
                case 532343674:
                case 666063163:
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ۡ") ^ i11;
                        i = ((iM45029 ^ i12) * (-22891)) ^ (-273628150);
                        i2 = -522492508;
                    } else {
                        iM45029 = (i11 - C19806.m45029("ۜᩳ")) * (-53);
                        i = ((iM45029 ^ i12) * 6147) ^ 263862728;
                        i2 = 1492375637;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case 842209774:
                case 2133087765:
                    if (C0050.f912 <= 0) {
                        iM45029 = C19806.m45029("ۡᩳ") ^ i12;
                        i = ((iM45029 ^ i11) * (-8995)) ^ (-1903754724);
                        i2 = -1431144643;
                    } else {
                        iM45029 = C19806.m45029("֨ۡ") ^ i12;
                        i = ((iM45029 ^ i11) * (-4759)) ^ (-561799010);
                        i2 = -200923090;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                case 979358641:
                case 2043329121:
                    C0050.m946();
                    if (C1977.f7413 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ܰ") ^ i11) * (-109);
                        i3 = ((iM11306 ^ i12) * 21919) ^ (-1440439062);
                        i4 = 803170149;
                        i14 = iM11306 ^ i4;
                        i13 = i3;
                    } else {
                        iM45029 = (i11 - C19806.m45029("ۖ᩻")) * 15;
                        i = ((iM45029 ^ i12) * 24519) ^ 2038007733;
                        i2 = 239218065;
                        i14 = iM45029 ^ i2;
                        i13 = i;
                        activityC10887 = this;
                    }
                    break;
                case 1091497442:
                case 2074774306:
                    C1461.m5080();
                    if (C3722.f13525 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺ֡") ^ i12;
                        i = ((iM45029 ^ i11) * 32753) ^ (-851427380);
                        i2 = 14324652;
                    } else {
                        iM45029 = (C19806.m45029("۟ܺ") ^ i11) * (-37);
                        i = ((iM45029 ^ i12) * (-5999)) ^ 2115829429;
                        i2 = 1751821641;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
                default:
                    try {
                        int i16 = C8265.f28733;
                        intent = new Intent(activityC10887, (Class<?>) ActivityC11632.class);
                        try {
                            C2871.m8643(intent, 268435456);
                            C2871.m8643(intent, 67108864);
                            C21273.m47737(intent, uri);
                            intent.setAction(C19806.m45020(f37058, 1, 26, i9));
                            intent.setData(uri);
                            intent.putExtra(C0797.m3361(f37058, 27, 15, i9), true);
                            iM45029 = C19806.m45029("᩺ۡ") ^ i12;
                            i = ((iM45029 ^ i11) * 5815) ^ (-2052225856);
                            i2 = -1626214447;
                        } catch (Exception unused) {
                            iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i12;
                            i = ((iM45029 ^ i11) * (-8993)) ^ 757700956;
                            i2 = 1058427152;
                        }
                    } catch (Exception unused2) {
                        intent = null;
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܶ") ^ i12;
                        i = ((iM45029 ^ i11) * (-8993)) ^ 757700956;
                        i2 = 1058427152;
                    }
                    i14 = iM45029 ^ i2;
                    i13 = i;
                    activityC10887 = this;
                    break;
            }
        }
    }
}
