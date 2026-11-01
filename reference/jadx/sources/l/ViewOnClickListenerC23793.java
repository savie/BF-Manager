package l;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩻ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAQP */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23793 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ᩷ܽۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f76919 = {8582, 5486, 3521, -319, 2819, 12948, -1753, -8184, 7789, -3023, 8569, -7937, -8004, -8027, -8030, -8023, 4251, 25325, 28193, -32212, 30242, 32549, -18368};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20889 f76920;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f76921;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public TextView f76922;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1919 f76923;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f76924;

    /* JADX WARN: Code duplicated, block: B:31:0x00ff A[PHI: r7
      0x00ff: PHI (r7v5 android.widget.TextView) = (r7v4 android.widget.TextView), (r7v2 android.widget.TextView), (r7v2 android.widget.TextView) binds: [B:30:0x00fd, B:18:0x00b1, B:10:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01b5 A[PHI: r6 r10
      0x01b5: PHI (r6v4 android.view.View) = 
      (r6v2 android.view.View)
      (r6v2 android.view.View)
      (r6v3 android.view.View)
      (r6v2 android.view.View)
      (r6v2 android.view.View)
      (r6v2 android.view.View)
     binds: [B:86:0x01b5, B:50:0x01b3, B:46:0x0193, B:38:0x0151, B:20:0x00b5, B:18:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x01b5: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:86:0x01b5, B:50:0x01b3, B:46:0x0193, B:38:0x0151, B:20:0x00b5, B:18:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    public ViewOnClickListenerC23793(ActivityC1919 activityC1919, ViewGroup viewGroup) {
        int iM11306;
        int i;
        String strM7604;
        short[] sArr;
        int i2;
        int i3;
        int i4;
        int i5 = C0050.f912;
        int i6 = C10634.f36300;
        short s = f76919[0];
        int i7 = s + 7821;
        int i8 = (s * 31284) - (i7 * i7) > 0 ? 32294 : 27372;
        this.f76923 = activityC1919;
        super(LayoutInflater.from(activityC1919).inflate(C19806.m45029(C0526.m2424(f76919, 1, 3, i8)) ^ 2129049754, viewGroup, false));
        int iM11307 = (ThreadFactoryC3888.m11306("ܺۜ") ^ i6) * 123;
        int i9 = ((iM11307 ^ i5) * 23143) ^ (-2065166193);
        String str = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int iM11308 = 0;
        View view = null;
        TextView textView = null;
        View view2 = null;
        int iM11309 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1154435895;
        int i14 = iM11307 ^ (-986376397);
        View view3 = null;
        while (true) {
            i13 = i14 ^ (i9 & (((i13 ^ i5) * 9399) >> 31));
            switch (i13) {
                case -2091745127:
                case 650633745:
                    i10 = 2098339563;
                    if (C2788.f10625 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܰ᩷") ^ i6;
                        i9 = ((iM11306 ^ i5) * 14521) ^ (-1778720687);
                        i = 264222270;
                        i14 = iM11306 ^ i;
                    } else {
                        strM7604 = str;
                        sArr = sArr2;
                        i2 = i12;
                        int iM45029 = C19806.m45029("ۛ۟") ^ i6;
                        int i15 = i8;
                        int i16 = ((iM45029 ^ i5) * (-18405)) ^ (-1668162193);
                        str = strM7604;
                        i14 = iM45029 ^ (-2146104803);
                        sArr2 = sArr;
                        int i17 = i2;
                        i9 = i16;
                        i8 = i15;
                        i12 = i17;
                    }
                    break;
                case -1993803563:
                case 1419009961:
                    sArr = sArr2;
                    i2 = i12;
                    strM7604 = C2477.m7604(sArr, i2, 3, i8);
                    if (C2249.f8050 >= 0) {
                        int iM450210 = C19806.m45029("ۛ۟") ^ i6;
                        int i18 = i8;
                        int i19 = ((iM450210 ^ i5) * (-18405)) ^ (-1668162193);
                        str = strM7604;
                        i14 = iM450210 ^ (-2146104803);
                        sArr2 = sArr;
                        int i110 = i2;
                        i9 = i19;
                        i8 = i18;
                        i12 = i110;
                    } else {
                        int i20 = i8;
                        int iM450211 = (C19806.m45029("ܿᩴ") + i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        View view4 = view3;
                        int i21 = ((iM450211 ^ i5) * 15209) ^ 213757841;
                        str = strM7604;
                        i14 = iM450211 ^ 1119123186;
                        i8 = i20;
                        i12 = i2;
                        i9 = i21;
                        view3 = view4;
                        sArr2 = sArr;
                    }
                    break;
                case -1761802765:
                case 273685640:
                    C7105.m18993(view2, this);
                    this.itemView.setOnLongClickListener(this);
                    return;
                case -1329876206:
                case -876754220:
                    textView = (TextView) C3743.m10957(view, iM11309 ^ i10);
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i6;
                        i9 = ((iM11306 ^ i5) * 26411) ^ (-1233786212);
                        i = 1362932640;
                    } else {
                        iM11306 = C19806.m45029("ۙܺ") ^ i6;
                        i9 = ((iM11306 ^ i5) * (-2881)) ^ (-811790050);
                        i = -1219095315;
                    }
                    i14 = iM11306 ^ i;
                    break;
                case -1016922627:
                case -298273360:
                    C19806.m45024();
                    C3743.m10966();
                    iM11306 = ThreadFactoryC3888.m11306("ۖ᩷") ^ i5;
                    i9 = ((iM11306 ^ i6) * (-7055)) ^ (-622094797);
                    i = -1691438514;
                    i14 = iM11306 ^ i;
                    break;
                case -862585707:
                case 251288240:
                    C1377.m4833();
                    if (CallableC1627.m5507() == 0) {
                        strM7604 = str;
                        sArr = sArr2;
                        i2 = i12;
                        int iM450212 = C19806.m45029("ۛ۟") ^ i6;
                        int i111 = i8;
                        int i112 = ((iM450212 ^ i5) * (-18405)) ^ (-1668162193);
                        str = strM7604;
                        i14 = iM450212 ^ (-2146104803);
                        sArr2 = sArr;
                        int i113 = i2;
                        i9 = i112;
                        i8 = i111;
                        i12 = i113;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩷") ^ i5;
                        i9 = ((iM11306 ^ i6) * (-7055)) ^ (-622094797);
                        i = -1691438514;
                        i14 = iM11306 ^ i;
                    }
                    break;
                case -687553076:
                case 1305548326:
                    C7105.m18985();
                    throw new RuntimeException();
                case -113738066:
                case 139604743:
                    this.f76922 = textView;
                    C2766.m8438(this.itemView);
                    view2 = this.itemView;
                    if (!C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۜ") ^ i5;
                        i9 = ((iM11306 ^ i6) * 16835) ^ (-1626679380);
                        i = 1551522238;
                        i14 = iM11306 ^ i;
                    } else {
                        int i22 = i12;
                        i3 = i8;
                        i4 = i22;
                        int iM450213 = C19806.m45029("᩸۟") ^ i6;
                        i9 = ((iM450213 ^ i5) * (-32251)) ^ (-182705584);
                        i14 = iM450213 ^ (-985991259);
                        int i23 = i3;
                        i12 = i4;
                        i8 = i23;
                    }
                    break;
                case 63809760:
                case 1021281599:
                    i3 = i8;
                    view3 = this.itemView;
                    sArr2 = f76919;
                    i4 = 4;
                    if (C1875.m6086() != 0) {
                        int iM450214 = C19806.m45029("᩸۟") ^ i6;
                        i9 = ((iM450214 ^ i5) * (-32251)) ^ (-182705584);
                        i14 = iM450214 ^ (-985991259);
                        int i24 = i3;
                        i12 = i4;
                        i8 = i24;
                    } else {
                        int iM450215 = C19806.m45029("ۤۛ") ^ i5;
                        i9 = ((iM450215 ^ i6) * (-13833)) ^ 1168313205;
                        i14 = iM450215 ^ (-989676223);
                        i8 = i3;
                        i12 = 4;
                    }
                    break;
                case 191204722:
                case 1678772600:
                    iM11308 = 2121329331 ^ ThreadFactoryC3888.m11306(str);
                    if (RunnableC3388.f12514 < 0) {
                        iM11306 = (C19806.m45029("ۚܿ") + i6) * (-9);
                        i9 = ((iM11306 ^ i5) * (-25711)) ^ (-984838816);
                        i = 1740576584;
                        i14 = iM11306 ^ i;
                    } else {
                        int i25 = i12;
                        i3 = i8;
                        i4 = i25;
                        int iM450216 = C19806.m45029("᩸۟") ^ i6;
                        i9 = ((iM450216 ^ i5) * (-32251)) ^ (-182705584);
                        i14 = iM450216 ^ (-985991259);
                        int i26 = i3;
                        i12 = i4;
                        i8 = i26;
                    }
                    break;
                case 599470745:
                case 1058090258:
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i6;
                        i9 = ((iM11306 ^ i5) * 26411) ^ (-1233786212);
                        i = 1362932640;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩷") ^ i5;
                        i9 = ((iM11306 ^ i6) * (-7055)) ^ (-622094797);
                        i = -1691438514;
                    }
                    i14 = iM11306 ^ i;
                    break;
                case 625461105:
                case 1174854461:
                    sArr3 = f76919;
                    i11 = 7;
                    if (!CallableC1627.f6528) {
                        int i27 = i12;
                        i3 = i8;
                        i4 = i27;
                        int iM450217 = C19806.m45029("᩸۟") ^ i6;
                        i9 = ((iM450217 ^ i5) * (-32251)) ^ (-182705584);
                        i14 = iM450217 ^ (-985991259);
                        int i28 = i3;
                        i12 = i4;
                        i8 = i28;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܳ") + i5) * 73;
                        i9 = ((iM11306 ^ i6) * 17857) ^ 1811909716;
                        i = -1932553071;
                        i14 = iM11306 ^ i;
                    }
                    break;
                case 796160056:
                case 1890176795:
                    this.f76921 = (TextView) C2642.m8167(view3, iM11308);
                    if (C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩷") ^ i5;
                        i9 = ((iM11306 ^ i6) * (-7055)) ^ (-622094797);
                        i = -1691438514;
                    } else {
                        iM11306 = (C19806.m45029("᩺ۧ") + i5) * 9;
                        i9 = ((iM11306 ^ i6) * 14433) ^ 950456699;
                        i = -1693746115;
                    }
                    i14 = iM11306 ^ i;
                    break;
                case 882220402:
                case 2041500334:
                    iM11309 = ThreadFactoryC3888.m11306(RunnableC0195.m1429(sArr3, i11, 3, i8));
                    if (C2642.m8171() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩷") ^ i5;
                        i9 = ((iM11306 ^ i6) * (-7055)) ^ (-622094797);
                        i = -1691438514;
                    } else {
                        iM11306 = C19806.m45029("ۖ֡") ^ i5;
                        i9 = ((iM11306 ^ i6) * 27107) ^ 1746440993;
                        i = -814169871;
                    }
                    i14 = iM11306 ^ i;
                    break;
                case 915930669:
                case 1766063053:
                    view = this.itemView;
                    if (C0216.m1591() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۖ᩷") ^ i5;
                        i9 = ((iM11306 ^ i6) * (-7055)) ^ (-622094797);
                        i = -1691438514;
                    } else {
                        iM11306 = C19806.m45029("ۖܶ") ^ i6;
                        i9 = ((iM11306 ^ i5) * 31853) ^ 1275171268;
                        i = -117244810;
                    }
                    i14 = iM11306 ^ i;
                    break;
                default:
                    RunnableC3388.m10064();
                    if (C0278.m1789() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺ᩵") ^ i6;
                        i9 = ((iM11306 ^ i5) * 26411) ^ (-1233786212);
                        i = 1362932640;
                    } else {
                        iM11306 = (C19806.m45029("᩻ܺ") + i5) * (-125);
                        i9 = ((iM11306 ^ i6) * (-28443)) ^ 792536228;
                        i = -1016800330;
                    }
                    i14 = iM11306 ^ i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0138 A[PHI: r6
      0x0138: PHI (r6v5 int) = (r6v4 int), (r6v2 int) binds: [B:39:0x0136, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0166 A[PHI: r10 r11 r15
      0x0166: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v5 int) binds: [B:27:0x00bf, B:17:0x007a, B:15:0x0076, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v5 int) binds: [B:27:0x00bf, B:17:0x007a, B:15:0x0076, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v5 short[]) binds: [B:27:0x00bf, B:17:0x007a, B:15:0x0076, B:9:0x006a, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x01a5 A[PHI: r4 r5
      0x01a5: PHI (r4v4 l.ܺ᩸) = (r4v3 l.ܺ᩸), (r4v2 l.ܺ᩸), (r4v2 l.ܺ᩸) binds: [B:45:0x01a3, B:15:0x0076, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r5v4 l.۫۬) = (r5v3 l.۫۬), (r5v2 l.۫۬), (r5v2 l.۫۬) binds: [B:45:0x01a3, B:15:0x0076, B:12:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0286 A[PHI: r7 r8 r9 r12 r17
      0x0286: PHI (r7v4 android.view.MenuItem) = (r7v2 android.view.MenuItem), (r7v3 android.view.MenuItem), (r7v2 android.view.MenuItem), (r7v2 android.view.MenuItem) binds: [B:65:0x0284, B:35:0x010c, B:31:0x00e8, B:23:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r8v3 l.ܰۤۘ) = (r8v2 l.ܰۤۘ), (r8v2 l.ܰۤۘ), (r8v2 l.ܰۤۘ), (r8v4 l.ܰۤۘ) binds: [B:65:0x0284, B:35:0x010c, B:31:0x00e8, B:23:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v4 int), (r9v2 int) binds: [B:65:0x0284, B:35:0x010c, B:31:0x00e8, B:23:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:65:0x0284, B:35:0x010c, B:31:0x00e8, B:23:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x0286: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:65:0x0284, B:35:0x010c, B:31:0x00e8, B:23:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x02b8 A[PHI: r16 r18 r23
      0x02b8: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:69:0x02b6, B:61:0x0266, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r18v4 short) = (r18v2 short), (r18v3 short), (r18v2 short) binds: [B:69:0x02b6, B:61:0x0266, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x02b8: PHI (r23v5 short) = (r23v3 short), (r23v4 short), (r23v3 short) binds: [B:69:0x02b6, B:61:0x0266, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int iM11306;
        int i;
        int i2;
        int i3 = C1025.f4800;
        int i4 = C3577.f13150;
        int iM11307 = (ThreadFactoryC3888.m11306("ۨܽ") ^ i3) * (-71);
        int i5 = ((iM11307 ^ i4) * (-4745)) ^ (-1013119370);
        C12418 c12418M38298 = null;
        C13750 c13750 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM11307 ^ 333101545;
        int iM11308 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        char c = 0;
        short s = 0;
        int i10 = 1924240059;
        short s2 = 0;
        C16195 c16195 = null;
        MenuItem menuItemM11301 = null;
        boolean z = false;
        int iM11309 = 0;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i4) * 17641) >> 31));
            switch (i10) {
                case -2092780189:
                case -236184085:
                    C3660.m10791();
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    return false;
                case -1979409962:
                case -1954806982:
                    iM11309 = 2099071078 ^ ThreadFactoryC3888.m11306(C3743.m10964(sArr2, i7, i8, i9));
                    if (C2642.f10294 <= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۤ᩶")) * 41;
                        i = ((iM11306 ^ i3) * (-4545)) ^ 963103133;
                        i2 = 1574646118;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡ᩶") ^ i3;
                        i = ((iM11306 ^ i4) * (-27427)) ^ (-1286935954);
                        i2 = 2081420502;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1755177713:
                case 1727295560:
                    if (C19806.f63586) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i3) * 69;
                        i = ((iM11306 ^ i4) * (-2035)) ^ (-2068433773);
                        i2 = -835965569;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩹") ^ i3;
                        i = ((iM11306 ^ i4) * (-10919)) ^ 1812156052;
                        i2 = -1237836232;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1734341107:
                case -1330520887:
                    return z;
                case -1396772948:
                case -934303321:
                    menuItemM11301 = ThreadFactoryC3888.m11301(c12418M38298, z ? 1 : 0, iM11309, z ? 1 : 0, iM11309);
                    sArr3 = f76919;
                    if (C2124.f7782 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ۛܶ")) * (-77);
                        i = ((iM11306 ^ i3) * 26387) ^ 1566755131;
                        i2 = 1319010754;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ۨ") ^ i4) * 81;
                        i = ((iM11306 ^ i3) * 3755) ^ 1514671849;
                        i2 = 722089865;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1359591152:
                case -23206111:
                    i9 = 58672;
                    iM11306 = (C19806.m45029("ܽۘ") ^ i3) * (-103);
                    i = ((iM11306 ^ i4) * 14997) ^ 1730199463;
                    i2 = 1139152404;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -914542874:
                case 368255594:
                    c = 16;
                    if (C1461.f5957 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ۛܶ")) * (-77);
                        i = ((iM11306 ^ i3) * 26387) ^ 1566755131;
                        i2 = 1319010754;
                    } else {
                        iM11306 = C19806.m45029("ۨۛ") ^ i4;
                        i = ((iM11306 ^ i3) * 25775) ^ (-1547458398);
                        i2 = -593854987;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -799113685:
                case 1757875469:
                    iM11308 = ThreadFactoryC3888.m11306(C1025.m3859(sArr3, 20, 3, i9));
                    if (C1066.f4915 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ۛܶ")) * (-77);
                        i = ((iM11306 ^ i3) * 26387) ^ 1566755131;
                        i2 = 1319010754;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢۨ") + i4) * (-31);
                        i = ((iM11306 ^ i3) * (-16603)) ^ 2138477824;
                        i2 = 1698218490;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -788481359:
                case 1880719314:
                    c16195.m38292();
                    c13750 = new C13750(this);
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ۛܶ")) * (-77);
                        i = ((iM11306 ^ i3) * 26387) ^ 1566755131;
                        i2 = 1319010754;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۘ") ^ i4;
                        i = ((iM11306 ^ i3) * 23925) ^ 1407980389;
                        i2 = -1104535058;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -587706739:
                case 1165198560:
                    c16195 = new C16195(this.f76923, view, z ? 1 : 0);
                    c12418M38298 = c16195.m38298();
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩹") ^ i3;
                        i = ((iM11306 ^ i4) * (-10919)) ^ 1812156052;
                        i2 = -1237836232;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۧ") ^ i4;
                        i = ((iM11306 ^ i3) * (-5101)) ^ (-988800973);
                        i2 = 2078924811;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -521422984:
                case 1641309687:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩹") ^ i3;
                        i = ((iM11306 ^ i4) * (-10919)) ^ 1812156052;
                        i2 = -1237836232;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۤ᩶")) * 41;
                        i = ((iM11306 ^ i3) * (-4545)) ^ 963103133;
                        i2 = 1574646118;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -516909750:
                case 218615715:
                    sArr = f76919;
                    if (C1668.f6641 >= 0) {
                        iM11306 = (i3 - C19806.m45029("ۚۙ")) * (-109);
                        i = ((iM11306 ^ i4) * (-17871)) ^ (-1759470852);
                        i2 = 1162639431;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩺ۛ") ^ i3;
                        i = ((iM11306 ^ i4) * (-11341)) ^ 2010252331;
                        i2 = -985535228;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 145479151:
                case 1720255885:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    C1668.m5583();
                    iM11306 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i3) * 69;
                    i = ((iM11306 ^ i4) * (-2035)) ^ (-2068433773);
                    i2 = -835965569;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 570286916:
                case 1158888030:
                    i9 = 10756;
                    iM11306 = (C19806.m45029("ܽۘ") ^ i3) * (-103);
                    i = ((iM11306 ^ i4) * 14997) ^ 1730199463;
                    i2 = 1139152404;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 607292035:
                case 1060200653:
                    C1066.m4032(menuItemM11301, 2100501867 ^ iM11308);
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i3) * 69;
                        i = ((iM11306 ^ i4) * (-2035)) ^ (-2068433773);
                        i2 = -835965569;
                    } else {
                        iM11306 = (C19806.m45029("֨᩷") ^ i3) * 69;
                        i = ((iM11306 ^ i4) * (-11921)) ^ (-1405368674);
                        i2 = 1339821778;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 619152739:
                case 1156791852:
                    c16195.m38296(c13750);
                    C2766.m8440(view, c16195);
                    return true;
                case 843479028:
                case 1260842688:
                    z = false;
                    z = false;
                    if (this.f76924) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֡") ^ i4;
                        i = ((iM11306 ^ i3) * (-11925)) ^ 554431199;
                        i2 = -541197127;
                    } else {
                        iM11306 = (C19806.m45029("ۖܽ") ^ i3) * 5;
                        i = ((iM11306 ^ i4) * 20769) ^ 130115327;
                        i2 = -1547422911;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1041999242:
                case 1084794804:
                    C1148.m4232();
                    if (AbstractC0464.f2088 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i3) * 69;
                        i = ((iM11306 ^ i4) * (-2035)) ^ (-2068433773);
                        i2 = -835965569;
                    } else {
                        iM11306 = (i3 - C19806.m45029("ۚۙ")) * (-109);
                        i = ((iM11306 ^ i4) * (-17871)) ^ (-1759470852);
                        i2 = 1162639431;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1084607574:
                case 1620174487:
                    if (((s * s) + 11458225) - (s * s2) >= 0) {
                        iM11306 = C19806.m45029("᩻ۘ") ^ i3;
                        i = ((iM11306 ^ i4) * 17911) ^ 309371366;
                        i2 = 774842451;
                    } else {
                        iM11306 = C19806.m45029("ۜۨ") ^ i4;
                        i = ((iM11306 ^ i3) * (-29597)) ^ 140260394;
                        i2 = -1154450789;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1180164949:
                case 1630819862:
                    s = sArr[c];
                    s2 = 6770;
                    if (C3535.f13026 <= 0) {
                        iM11306 = (i3 - C19806.m45029("ۚۙ")) * (-109);
                        i = ((iM11306 ^ i4) * (-17871)) ^ (-1759470852);
                        i2 = 1162639431;
                    } else {
                        iM11306 = (C19806.m45029("ۘ۟") ^ i4) * (-45);
                        i = ((iM11306 ^ i3) * (-24641)) ^ 1837924492;
                        i2 = -1988509590;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr2 = f76919;
                    i7 = 17;
                    i8 = 3;
                    if (RunnableC1895.f7152) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚܳ") + i3) * 29;
                        i = ((iM11306 ^ i4) * 9321) ^ 1999083135;
                        i2 = 776274462;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ۖ") ^ i3) * 69;
                        i = ((iM11306 ^ i4) * (-2035)) ^ (-2068433773);
                        i2 = -835965569;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0308 A[PHI: r12 r17 r18 r19
      0x0308: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:86:0x0306, B:59:0x01dc, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0308: PHI (r17v25 java.lang.Exception) = (r17v7 java.lang.Exception), (r17v13 java.lang.Exception), (r17v29 java.lang.Exception) binds: [B:86:0x0306, B:59:0x01dc, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0308: PHI (r18v20 char) = (r18v3 char), (r18v8 char), (r18v21 char) binds: [B:86:0x0306, B:59:0x01dc, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x0308: PHI (r19v20 short) = (r19v3 short), (r19v8 short), (r19v24 short) binds: [B:86:0x0306, B:59:0x01dc, B:14:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x036f A[PHI: r10 r11 r17 r18 r19
      0x036f: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:94:0x036d, B:63:0x0200, B:24:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x036f: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:94:0x036d, B:63:0x0200, B:24:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x036f: PHI (r17v21 java.lang.Exception) = (r17v5 java.lang.Exception), (r17v12 java.lang.Exception), (r17v22 java.lang.Exception) binds: [B:94:0x036d, B:63:0x0200, B:24:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x036f: PHI (r18v16 char) = (r18v1 char), (r18v7 char), (r18v17 char) binds: [B:94:0x036d, B:63:0x0200, B:24:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x036f: PHI (r19v16 short) = (r19v1 short), (r19v7 short), (r19v17 short) binds: [B:94:0x036d, B:63:0x0200, B:24:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (l.C0817.m3399() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        if (l.ThreadFactoryC3888.f14547 <= 0) goto L36;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC23793.onClick(android.view.View):void");
    }
}
