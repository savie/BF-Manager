package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: renamed from: l.ܰۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB7Z */
/* JADX INFO: loaded from: classes3.dex */
public class C13550 extends LinearLayout {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f44721;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13550(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        int i = 948988650;
        int i2 = C1025.f4800;
        int i3 = C2788.f10625;
        int iM45029 = C19806.m45029("ۖۨ") ^ i2;
        int i4 = ((iM45029 ^ i3) * 29991) ^ 2114550859;
        int i5 = 248061464;
        while (true) {
            i = (iM45029 ^ i5) ^ (i4 & (((i ^ i3) * 27865) >> 31));
            switch (i) {
                case -1803529211:
                case -771454371:
                    C0671.m3008();
                    if (C1025.f4800 < 0) {
                        iM45029 = C19806.m45029("᩺ۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29057) ^ (-212032336);
                        i5 = -1794374533;
                    } else {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۨ֡")) * (-73);
                        i4 = ((iM45029 ^ i3) * 13491) ^ (-1512055758);
                        i5 = 1581757701;
                    }
                    break;
                case -939528924:
                case 1489401156:
                    C1460.m5050();
                    C1937.m6279();
                    throw new RuntimeException();
                case -603555318:
                case 379951005:
                    return;
                case -584876023:
                case 590900671:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 > 0) {
                        iM45029 = C19806.m45029("᩺ۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29057) ^ (-212032336);
                        i5 = -1794374533;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 26611) ^ (-1234014041);
                        i5 = 390931247;
                    }
                    break;
                case -331157116:
                case 1088542003:
                    C0278.m1789();
                    ThreadFactoryC3888.m11300();
                    iM45029 = ThreadFactoryC3888.m11306("ᩳۗ") ^ i2;
                    i4 = ((iM45029 ^ i3) * 26611) ^ (-1234014041);
                    i5 = 390931247;
                    break;
                case 82244733:
                case 1699215197:
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("᩺ۘ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29057) ^ (-212032336);
                        i5 = -1794374533;
                    } else {
                        iM45029 = (C19806.m45029("ᩳ۫") ^ i2) * 25;
                        i4 = ((iM45029 ^ i3) * 12001) ^ 1749346961;
                        i5 = -1284330910;
                    }
                    break;
                default:
                    if (RunnableC1606.f6488 >= 0) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۡܰ")) * (-95);
                        i4 = ((iM45029 ^ i2) * 12117) ^ (-1962538360);
                        i5 = -101756774;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩸ܰ") ^ i3) * (-53);
                        i4 = ((iM45029 ^ i2) * (-21061)) ^ (-1058906528);
                        i5 = -1553583193;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13550(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ArrayList arrayList = null;
        int i2 = 299328543;
        int i3 = C2249.f8050;
        int i4 = C2124.f7782;
        int iM45029 = C19806.m45029("۠᩸") ^ i3;
        int i5 = ((iM45029 ^ i4) * 13725) ^ 360108250;
        int i6 = 1074158557;
        while (true) {
            i2 = (iM45029 ^ i6) ^ (i5 & (((i2 ^ i4) * (-13621)) >> 31));
            switch (i2) {
                case -2140805846:
                case -1575736452:
                    arrayList = new ArrayList();
                    if (C1419.f5860 >= 0) {
                        iM45029 = (i4 - C19806.m45029("֫ܿ")) * 69;
                        i5 = ((iM45029 ^ i3) * (-16927)) ^ (-900695757);
                        i6 = -1959140475;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡۛ") + i4) * 23;
                        i5 = ((iM45029 ^ i3) * 4235) ^ 1058305234;
                        i6 = 1384499346;
                    }
                    break;
                case -2058604084:
                case 122056612:
                    super.setOrientation(1);
                    return;
                case -1956113196:
                case 813066198:
                    this.f44721 = arrayList;
                    if (RunnableC0195.m1431()) {
                        iM45029 = (C19806.m45029("ܽۧ") ^ i4) * 53;
                        i5 = ((iM45029 ^ i3) * (-30965)) ^ 1740633718;
                        i6 = 1181160377;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۘۡ")) * (-9);
                        i5 = ((iM45029 ^ i3) * 23329) ^ 738464097;
                        i6 = 1863156500;
                    }
                    break;
                case -1737735892:
                case -474778396:
                    if (C0962.f3784) {
                        iM45029 = (i4 - C19806.m45029("ۘۡ")) * (-9);
                        i5 = ((iM45029 ^ i3) * 23329) ^ 738464097;
                        i6 = 1863156500;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۚ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM45029 ^ i4) * (-26717)) ^ 1330262037;
                        i6 = -559338646;
                    }
                    break;
                case -1601763663:
                case 97256690:
                    C2642.m8171();
                    C1148.m4232();
                    throw new RuntimeException();
                case -1534951430:
                case 598300218:
                    RunnableC0195.m1431();
                    if (C1025.f4800 < 0) {
                        iM45029 = (i4 - C19806.m45029("֫ܿ")) * 69;
                        i5 = ((iM45029 ^ i3) * (-16927)) ^ (-900695757);
                        i6 = -1959140475;
                    } else {
                        iM45029 = (C19806.m45029("֫ۙ") ^ i4) * 101;
                        i5 = ((iM45029 ^ i3) * 16115) ^ 353314898;
                        i6 = 508435974;
                    }
                    break;
                case -1476469486:
                case 2013918446:
                    if (C1148.f5161 <= 0) {
                        iM45029 = C19806.m45029("۫ۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 31963) ^ 592738422;
                        i6 = -978351914;
                    } else {
                        iM45029 = (C19806.m45029("ۘ۟") ^ i4) * (-117);
                        i5 = ((iM45029 ^ i3) * (-27969)) ^ 379631275;
                        i6 = -309606613;
                    }
                    break;
                case -1233549999:
                case -1200243025:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM45029 = C19806.m45029("۫ۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 31963) ^ 592738422;
                        i6 = -978351914;
                    } else {
                        iM45029 = C19806.m45029("ۡ֫") ^ i3;
                        i5 = ((iM45029 ^ i4) * 21147) ^ (-1362459601);
                        i6 = -1251060143;
                    }
                    break;
                case -946340910:
                case 477233128:
                    if (RunnableC1895.m6170() == 0) {
                        iM45029 = (i4 - C19806.m45029("֫ܿ")) * 69;
                        i5 = ((iM45029 ^ i3) * (-16927)) ^ (-900695757);
                        i6 = -1959140475;
                    } else {
                        iM45029 = C19806.m45029("۫ۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 31963) ^ 592738422;
                        i6 = -978351914;
                    }
                    break;
                case -309782079:
                case -82637433:
                    if (C3286.f12186) {
                        iM45029 = (i4 - C19806.m45029("ۘۡ")) * (-9);
                        i5 = ((iM45029 ^ i3) * 23329) ^ 738464097;
                        i6 = 1863156500;
                    } else {
                        iM45029 = (C19806.m45029("ۧܳ") ^ i3) * (-123);
                        i5 = ((iM45029 ^ i4) * (-18653)) ^ 1005139698;
                        i6 = -573981212;
                    }
                    break;
                case -197237297:
                case 779369087:
                    CallableC1627.m5507();
                    if (C1066.f4915 > 0) {
                        iM45029 = (C19806.m45029("ۗᩳ") ^ i3) * 13;
                        i5 = ((iM45029 ^ i4) * (-8859)) ^ (-1284711338);
                        i6 = 42420261;
                    } else {
                        iM45029 = C19806.m45029("۫ۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 31963) ^ 592738422;
                        i6 = -978351914;
                    }
                    break;
                case 43793685:
                case 1306666539:
                    if (C1668.f6641 >= 0) {
                        iM45029 = C19806.m45029("۫ۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 31963) ^ 592738422;
                        i6 = -978351914;
                    } else {
                        iM45029 = C19806.m45029("᩵֫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 14967) ^ (-504398474);
                        i6 = -269156623;
                    }
                    break;
                case 205580545:
                case 1963843028:
                    if (C19806.f63586) {
                        iM45029 = (C19806.m45029("ۗᩳ") ^ i3) * 13;
                        i5 = ((iM45029 ^ i4) * (-8859)) ^ (-1284711338);
                        i6 = 42420261;
                    } else {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۤۢ")) * 65;
                        i5 = ((iM45029 ^ i4) * (-1399)) ^ 944259336;
                        i6 = 1402447333;
                    }
                    break;
                case 511595327:
                case 1764651677:
                    if (C0817.f3443) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("۫֫")) * (-67);
                        i5 = ((iM45029 ^ i4) * (-6883)) ^ 371755524;
                        i6 = -567101251;
                    } else {
                        iM45029 = C19806.m45029("۫ۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 31963) ^ 592738422;
                        i6 = -978351914;
                    }
                    break;
                case 832567020:
                case 1694610238:
                    if (C1875.m6086() != 0) {
                        iM45029 = (i4 - C19806.m45029("ۘۡ")) * (-9);
                        i5 = ((iM45029 ^ i3) * 23329) ^ 738464097;
                        i6 = 1863156500;
                    } else {
                        iM45029 = C19806.m45029("֨᩵") ^ i4;
                        i5 = ((iM45029 ^ i3) * 3823) ^ 620887141;
                        i6 = 515194203;
                    }
                    break;
                default:
                    C1377.m4833();
                    C2871.m8646();
                    iM45029 = C19806.m45029("۫ۖ") ^ i3;
                    i5 = ((iM45029 ^ i4) * 31963) ^ 592738422;
                    i6 = -978351914;
                    break;
            }
        }
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x010f A[PHI: r9 r10 r16
      0x010f: PHI (r9v4 android.view.View) = (r9v3 android.view.View), (r9v2 android.view.View), (r9v2 android.view.View) binds: [B:38:0x010d, B:31:0x00b6, B:25:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r10v5 l.ۨۗۨ) = (r10v2 l.ۨۗۨ), (r10v4 l.ۨۗۨ), (r10v2 l.ۨۗۨ) binds: [B:38:0x010d, B:31:0x00b6, B:25:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r16v29 int) = (r16v22 int), (r16v24 int), (r16v31 int) binds: [B:38:0x010d, B:31:0x00b6, B:25:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0298 A[PHI: r2 r16
      0x0298: PHI (r2v6 int) = (r2v2 int), (r2v2 int), (r2v3 int), (r2v2 int), (r2v2 int) binds: [B:73:0x027e, B:64:0x0230, B:60:0x020f, B:6:0x0049, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r16v38 int) = (r16v5 int), (r16v7 int), (r16v8 int), (r16v17 int), (r16v44 int) binds: [B:73:0x027e, B:64:0x0230, B:60:0x020f, B:6:0x0049, B:15:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0312 A[PHI: r16
      0x0312: PHI (r16v15 int) = (r16v2 int), (r16v3 int), (r16v16 int) binds: [B:87:0x0310, B:83:0x02f4, B:11:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int iM45029;
        int i4;
        int iM450210;
        int i5;
        int i6;
        C13550 c13550 = this;
        int i7 = C1398.f5802;
        int i8 = C0278.f1572;
        int iM450211 = (C19806.m45029("ۨ᩷") ^ i8) * 67;
        int i9 = ((iM450211 ^ i7) * 7245) ^ (-773821074);
        ArrayList arrayList = null;
        C11433 c11433 = null;
        int i10 = iM450211 ^ 1681240200;
        int i11 = 0;
        int iMakeMeasureSpec = 0;
        int iM6173 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -309249734;
        View viewM9872 = null;
        Iterator itM10563 = null;
        int i16 = 0;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i7) * 11015) >> 31));
            switch (i15) {
                case -2137717928:
                case -81154913:
                    View viewM10566 = C3577.m10566(c11433, i12);
                    C2249.m6905(arrayList, viewM10566);
                    viewM10566.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth = viewM10566.getMeasuredWidth();
                    if (i13 < measuredWidth) {
                        i14 = measuredWidth;
                        iMakeMeasureSpec = iMakeMeasureSpec;
                    } else {
                        iMakeMeasureSpec = iMakeMeasureSpec;
                        i14 = i13;
                    }
                    iM450210 = ThreadFactoryC3888.m11306("ۖᩴ") ^ i7;
                    i5 = ((iM450210 ^ i8) * (-17329)) ^ (-1230837035);
                    i6 = 2117585849;
                    int i17 = iMakeMeasureSpec;
                    i10 = iM450210 ^ i6;
                    i9 = i5;
                    iMakeMeasureSpec = i17;
                    break;
                case -2107004826:
                case 156715876:
                    C1398.m4890((View) C0278.m1776(itM10563)).width = i13;
                    iM450210 = ThreadFactoryC3888.m11306("ۢ۠") ^ i8;
                    i5 = ((iM450210 ^ i7) * 51) ^ (-884257309);
                    i6 = -1766397957;
                    int i18 = iMakeMeasureSpec;
                    i10 = iM450210 ^ i6;
                    i9 = i5;
                    iMakeMeasureSpec = i18;
                    break;
                case -1950271326:
                case -1791046675:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    if (RunnableC1564.m5348(itM10563)) {
                        iM450210 = (ThreadFactoryC3888.m11306("᩺ܰ") ^ i8) * 57;
                        i5 = ((iM450210 ^ i7) * (-9453)) ^ 1142817630;
                        i6 = 210317359;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("۠ۜ") ^ i8) * (-39);
                        i5 = ((iM450210 ^ i7) * 21913) ^ 160028555;
                        i6 = -307027560;
                    }
                    int i19 = iMakeMeasureSpec;
                    i10 = iM450210 ^ i6;
                    i9 = i5;
                    iMakeMeasureSpec = i19;
                    break;
                case -1894345927:
                case -1796118930:
                    i12 = 0;
                    i16 = 0;
                    i13 = 0;
                    iM450210 = C19806.m45029("ܳܺ") ^ i7;
                    i5 = ((iM450210 ^ i8) * (-17969)) ^ (-1198070679);
                    i6 = 2069297547;
                    int i110 = iMakeMeasureSpec;
                    i10 = iM450210 ^ i6;
                    i9 = i5;
                    iMakeMeasureSpec = i110;
                    break;
                case -1840241738:
                case 306824335:
                    C0526.m2437();
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    iM450210 = (ThreadFactoryC3888.m11306("ۧ᩷") ^ i7) * 127;
                    i5 = ((iM450210 ^ i8) * 16531) ^ 364691679;
                    i6 = 1658240524;
                    int i111 = iMakeMeasureSpec;
                    i10 = iM450210 ^ i6;
                    i9 = i5;
                    iMakeMeasureSpec = i111;
                    break;
                case -1581858636:
                case 1989962451:
                    i3 = iMakeMeasureSpec;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (i8 - C19806.m45029("ᩴ֨")) * (-91);
                        i9 = ((iM45029 ^ i7) * 30457) ^ 1666995375;
                        i4 = 1483795817;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֡") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-1883)) ^ (-1551149597);
                        i4 = -1860980239;
                    }
                    int i20 = iM45029 ^ i4;
                    iMakeMeasureSpec = i3;
                    i10 = i20;
                    c13550 = this;
                    break;
                case -1353883785:
                case 478764055:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    viewM9872 = ViewTreeObserverOnPreDrawListenerC3327.m9872(c13550, i16);
                    if (viewM9872 instanceof C11433) {
                        iM450210 = ThreadFactoryC3888.m11306("᩸ܳ") ^ i7;
                        i5 = ((iM450210 ^ i8) * (-3155)) ^ 106912541;
                        i6 = 828550693;
                    } else {
                        i14 = i13;
                        iM450210 = ThreadFactoryC3888.m11306("ۖᩴ") ^ i7;
                        i5 = ((iM450210 ^ i8) * (-17329)) ^ (-1230837035);
                        i6 = 2117585849;
                    }
                    int i112 = iMakeMeasureSpec;
                    i10 = iM450210 ^ i6;
                    i9 = i5;
                    iMakeMeasureSpec = i112;
                    break;
                case -1256208617:
                case 52417918:
                    i3 = iMakeMeasureSpec;
                    if (C1148.f5161 <= 0) {
                        iM45029 = (C19806.m45029("ۜ᩻") + i8) * 51;
                        i9 = ((iM45029 ^ i7) * 10737) ^ 2108126621;
                        i4 = -1722679897;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬ۢ") + i7) * q.h;
                        i9 = ((iM45029 ^ i8) * (-29685)) ^ (-1133687629);
                        i4 = 1728690633;
                    }
                    int i21 = iM45029 ^ i4;
                    iMakeMeasureSpec = i3;
                    i10 = i21;
                    c13550 = this;
                    break;
                case -1173987829:
                case -271543591:
                    C1377.m4833();
                    if (!C0526.f2219) {
                        i3 = iMakeMeasureSpec;
                        iM45029 = ThreadFactoryC3888.m11306("ܺۧ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 30727) ^ 1316134008;
                        i4 = 255729925;
                        int i22 = iM45029 ^ i4;
                        iMakeMeasureSpec = i3;
                        i10 = i22;
                        c13550 = this;
                    } else {
                        iMakeMeasureSpec = iMakeMeasureSpec;
                        iM450210 = (ThreadFactoryC3888.m11306("ۧ᩷") ^ i7) * 127;
                        i5 = ((iM450210 ^ i8) * 16531) ^ 364691679;
                        i6 = 1658240524;
                        int i113 = iMakeMeasureSpec;
                        i10 = iM450210 ^ i6;
                        i9 = i5;
                        iMakeMeasureSpec = i113;
                    }
                    break;
                case -1075981318:
                case 288302474:
                    itM10563 = C3577.m10563(arrayList);
                    iM450210 = ThreadFactoryC3888.m11306("ۢ۠") ^ i8;
                    i5 = ((iM450210 ^ i7) * 51) ^ (-884257309);
                    i6 = -1766397957;
                    int i114 = iMakeMeasureSpec;
                    i10 = iM450210 ^ i6;
                    i9 = i5;
                    iMakeMeasureSpec = i114;
                    break;
                case -864483169:
                case -766417616:
                    i3 = iMakeMeasureSpec;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (C19806.m45029("ۜ᩻") + i8) * 51;
                        i9 = ((iM45029 ^ i7) * 10737) ^ 2108126621;
                        i4 = -1722679897;
                    } else {
                        iM45029 = (i8 - C19806.m45029("ۛ֨")) * 17;
                        i9 = ((iM45029 ^ i7) * 10217) ^ (-1208559850);
                        i4 = 1103592397;
                    }
                    int i23 = iM45029 ^ i4;
                    iMakeMeasureSpec = i3;
                    i10 = i23;
                    c13550 = this;
                    break;
                case -843003597:
                case 443850851:
                    c11433 = (C11433) viewM9872;
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    if (RunnableC1895.m6173(c11433) >= 1) {
                        iM450210 = (C19806.m45029("᩵ۡ") + i8) * (-113);
                        i5 = ((iM450210 ^ i7) * (-8079)) ^ (-473718521);
                        i6 = 2107599973;
                    } else {
                        i14 = i13;
                        iM450210 = ThreadFactoryC3888.m11306("ۖᩴ") ^ i7;
                        i5 = ((iM450210 ^ i8) * (-17329)) ^ (-1230837035);
                        i6 = 2117585849;
                    }
                    int i115 = iMakeMeasureSpec;
                    i10 = iM450210 ^ i6;
                    i9 = i5;
                    iMakeMeasureSpec = i115;
                    break;
                case -542662602:
                case 272233739:
                    i3 = iMakeMeasureSpec;
                    if (C0050.f912 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳۡ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-11107)) ^ (-199974499);
                        i4 = 322850076;
                        int i24 = iM45029 ^ i4;
                        iMakeMeasureSpec = i3;
                        i10 = i24;
                        c13550 = this;
                    } else {
                        iMakeMeasureSpec = i3;
                        int iM450212 = C19806.m45029("ۤۙ") ^ i7;
                        i9 = ((iM450212 ^ i8) * 4445) ^ 181912104;
                        i10 = iM450212 ^ 1028507723;
                        c13550 = this;
                    }
                    break;
                case -116231204:
                case 1025228543:
                    C1668.m5583();
                    break;
                case 24157370:
                case 1522631703:
                    i3 = iMakeMeasureSpec;
                    i11 = Mod.M30;
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֡") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-1883)) ^ (-1551149597);
                        i4 = -1860980239;
                    } else {
                        iM45029 = (i8 - C19806.m45029("᩻ܺ")) * 5;
                        i9 = ((iM45029 ^ i7) * 1021) ^ 82557954;
                        i4 = -671942690;
                    }
                    int i25 = iM45029 ^ i4;
                    iMakeMeasureSpec = i3;
                    i10 = i25;
                    c13550 = this;
                    break;
                case 32117376:
                case 602975444:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    iM6173 = RunnableC1895.m6173(this);
                    arrayList = c13550.f44721;
                    MenuItemOnMenuItemClickListenerC3244.m9710(arrayList);
                    if (C0050.m946() <= 0) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۧ᩷") ^ i7) * 127;
                        i5 = ((iM450210 ^ i8) * 16531) ^ 364691679;
                        i6 = 1658240524;
                    } else {
                        iM450210 = (C19806.m45029("ۢۛ") ^ i7) * (-51);
                        i5 = ((iM450210 ^ i8) * 12947) ^ 1690353982;
                        i6 = -28111974;
                    }
                    int i116 = iMakeMeasureSpec;
                    i10 = iM450210 ^ i6;
                    i9 = i5;
                    iMakeMeasureSpec = i116;
                    break;
                case 374874563:
                case 1325847608:
                    if (C2477.f9839 <= 0) {
                        i3 = iMakeMeasureSpec;
                        iM45029 = (C19806.m45029("ۜ᩻") + i8) * 51;
                        i9 = ((iM45029 ^ i7) * 10737) ^ 2108126621;
                        i4 = -1722679897;
                        int i26 = iM45029 ^ i4;
                        iMakeMeasureSpec = i3;
                        i10 = i26;
                        c13550 = this;
                    }
                    i3 = iMakeMeasureSpec;
                    iM45029 = ThreadFactoryC3888.m11306("ܺۧ") ^ i8;
                    i9 = ((iM45029 ^ i7) * 30727) ^ 1316134008;
                    i4 = 255729925;
                    int i27 = iM45029 ^ i4;
                    iMakeMeasureSpec = i3;
                    i10 = i27;
                    c13550 = this;
                    break;
                case 648312606:
                case 1863131643:
                    C1461.m5085(arrayList);
                    super.onMeasure(i, i2);
                    break;
                case 942162479:
                case 1734016054:
                    i3 = iMakeMeasureSpec;
                    if (C1419.m4973()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֡") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-1883)) ^ (-1551149597);
                        i4 = -1860980239;
                    } else {
                        iM45029 = C19806.m45029("᩵֨") ^ i7;
                        i9 = ((iM45029 ^ i8) * 10245) ^ 1643752640;
                        i4 = 1909950521;
                    }
                    int i28 = iM45029 ^ i4;
                    iMakeMeasureSpec = i3;
                    i10 = i28;
                    c13550 = this;
                    break;
                case 971758749:
                case 1859045102:
                    i3 = iMakeMeasureSpec;
                    if (C3722.m10894() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܺۧ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 30727) ^ 1316134008;
                        i4 = 255729925;
                    } else {
                        iM45029 = (C19806.m45029("ۤۡ") ^ i8) * (-83);
                        i9 = ((iM45029 ^ i7) * 30035) ^ (-185189648);
                        i4 = 1241198494;
                    }
                    int i29 = iM45029 ^ i4;
                    iMakeMeasureSpec = i3;
                    i10 = i29;
                    c13550 = this;
                    break;
                case 1033559767:
                case 1203023125:
                    if (!C0817.f3443) {
                        iMakeMeasureSpec = iMakeMeasureSpec;
                        iM450210 = (ThreadFactoryC3888.m11306("ۧ᩷") ^ i7) * 127;
                        i5 = ((iM450210 ^ i8) * 16531) ^ 364691679;
                        i6 = 1658240524;
                        int i117 = iMakeMeasureSpec;
                        i10 = iM450210 ^ i6;
                        i9 = i5;
                        iMakeMeasureSpec = i117;
                    } else {
                        i3 = iMakeMeasureSpec;
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֡") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-1883)) ^ (-1551149597);
                        i4 = -1860980239;
                        int i210 = iM45029 ^ i4;
                        iMakeMeasureSpec = i3;
                        i10 = i210;
                        c13550 = this;
                    }
                    break;
                case 1152390070:
                case 1986359541:
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
                    if (C19806.f63586) {
                        int iM450213 = C19806.m45029("ۤۙ") ^ i7;
                        i9 = ((iM450213 ^ i8) * 4445) ^ 181912104;
                        i10 = iM450213 ^ 1028507723;
                    } else {
                        int iM450214 = C19806.m45029("ܰܰ") ^ i8;
                        i10 = iM450214 ^ 1049053619;
                        i9 = ((iM450214 ^ i7) * 19353) ^ 1446081630;
                    }
                    c13550 = this;
                    break;
                case 1346578961:
                case 2032476139:
                    iMakeMeasureSpec = iMakeMeasureSpec;
                    if (i16 < iM6173) {
                        iM450210 = C19806.m45029("ᩴ֡") ^ i7;
                        i5 = ((iM450210 ^ i8) * (-20221)) ^ 481638341;
                        i6 = -2074389721;
                    } else {
                        iM450210 = C19806.m45029("᩸ܽ") ^ i8;
                        i5 = ((iM450210 ^ i7) * 4515) ^ (-1084480499);
                        i6 = -1565922472;
                    }
                    int i118 = iMakeMeasureSpec;
                    i10 = iM450210 ^ i6;
                    i9 = i5;
                    iMakeMeasureSpec = i118;
                    break;
                case 1428295706:
                case 1701588659:
                    i16++;
                    i13 = i14;
                    iM450210 = C19806.m45029("ܳܺ") ^ i7;
                    i5 = ((iM450210 ^ i8) * (-17969)) ^ (-1198070679);
                    i6 = 2069297547;
                    int i119 = iMakeMeasureSpec;
                    i10 = iM450210 ^ i6;
                    i9 = i5;
                    iMakeMeasureSpec = i119;
                    break;
                default:
                    i3 = iMakeMeasureSpec;
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("ܿۧ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 10799) ^ (-446956503);
                        i4 = 1569306790;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚ֡") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-1883)) ^ (-1551149597);
                        i4 = -1860980239;
                    }
                    int i211 = iM45029 ^ i4;
                    iMakeMeasureSpec = i3;
                    i10 = i211;
                    c13550 = this;
                    break;
            }
            return;
        }
    }
}
