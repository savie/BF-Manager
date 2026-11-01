package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ܰ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q152 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC13819 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ܽۚ᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f45606 = {3573, 23330, 18603, -18770, 26608, 32039, 19721, 22416, 21794, 29939, 31099, 30345, 20757, -22241, 29021, -23246, -22741, 20976, -17824, -18520, 28758, 16425, 17031, 30216, -19437, 17676, -23284, 31464, -18048, 31136, 20713, -17671, 21621, -22937, 10379, 10386, 10375, 10374, 10421, 10393, 10383, 10379, 10392, 10377, 10370, 10421, 10398, 10387, 10394, 10383, 10379, 10386, 10375, 10374, 10421, 10393, 10383, 10379, 10392, 10377, 10370, 10421, 10375, 10379, 10398, 10377, 10370, 10421, 10377, 10379, 10393, 10383, 10379, 10386, 10375, 10374, 10421, 10393, 10383, 10379, 10392, 10377, 10370, 10421, 10392, 10383, 10381, 10383, 10386, 10379, 10386, 10375, 10374, 10421, 10393, 10383, 10379, 10392, 10377, 10370, 10421, 10370, 10383, 10386, 10379, 10386, 10375, 10374, 10421, 10393, 10383, 10379, 10392, 10377, 10370, 10421, 10371, 10382, 10456, 10372, 10379, 10375, 10383, 10379, 10386, 10375, 10374, 10421, 10393, 10383, 10379, 10392, 10377, 10370, 10421, 10383, 10386, 10379, 10377, 10398, 10374, 10387, 10421, 10375, 10379, 10398, 10377, 10370, 19740, 20153, -18196, 21450, 26129, -17992, 30262, 19534, -19370, 6084, 3317, 3288, 3279, 3290, 3204, 3294, 3271, 3290, 9536, -256, -2176, 10106, -6231, 3012, 2346, -6206, 11392, 11824, 28756, 28700, 28756, 28732, 28743, 28740, 28748, 28743, 28726, 28726, 28707, 28707, 28710, 28710, 28744, 28740, 28743, 28709, 28709, 28726, 28726, 28707, 28707, 28710, 28710, 28746, 28746, 28746, 28749, 28728, 28682, 3679, -5323, -8042, 28782, -4319, 4063, 9461, 8731, 15991, 5112, 28677, 28700, 28681, 28680, 28731, 28695, 28673, 28677, 28694, 28679, 28684, 28731, 28688, 28701, 28692, 28673, 28677, 28700, 28681, 28680, 28731, 28695, 28673, 28677, 28694, 28679, 28684, 28731, 28681, 28677, 28688, 28679, 28684, 28731, 28679, 28677, 28695, 28673, 28677, 28700, 28681, 28680, 28731, 28695, 28673, 28677, 28694, 28679, 28684, 28731, 28694, 28673, 28675, 28673, 28700, 28677, 28700, 28681, 28680, 28731, 28695, 28673, 28677, 28694, 28679, 28684, 28731, 28684, 28673, 28700, 28677, 28700, 28681, 28680, 28731, 28695, 28673, 28677, 28694, 28679, 28684, 28731, 28685, 28672, 28758, 28682, 28677, 28681, 28673, 28677, 28700, 28681, 28680, 28731, 28695, 28673, 28677, 28694, 28679, 28684, 28731, 28673, 28700, 28677, 28679, 28688, 28680, 28701, 28731, 28681, 28677, 28688, 28679, 28684, 28728, 28694, 28777, 10359, 2800, 9183, 28728, 28688, 28781, 28728, 28674, 28776, 28728, 28678, 28780};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f45607;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Spinner f45608;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f45609;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C11545 f45610;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CheckBox f45611;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f45612;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9160 f45613;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f45614;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CheckBox f45615;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CheckBox f45616;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CheckBox f45617;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9160 f45618;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38641. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public ViewOnClickListenerC13819(l.AbstractC20745 r66, l.C11545 r67, java.lang.String r68) {
        /*
            Method dump skipped, instruction units count: 3864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC13819.<init>(l.᩷۠ۚ, l.ۨۜ᩹, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33628() {
        CheckBox checkBox = null;
        boolean z = false;
        int i = 545113864;
        int i2 = C0050.f912;
        int i3 = C1461.f5957;
        int iM45029 = (i3 - C19806.m45029("ۧܿ")) * 23;
        int i4 = ((iM45029 ^ i2) * 7041) ^ (-351699248);
        int i5 = -1281276317;
        while (true) {
            i = ((((i ^ i2) * (-15377)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -1931207943:
                case -155895922:
                    if (C0629.m2909(checkBox)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧ۬") ^ i3) * (-75);
                        i4 = ((iM45029 ^ i2) * (-14281)) ^ 591193028;
                        i5 = -812770920;
                    } else {
                        iM45029 = (C19806.m45029("ۢۤ") ^ i2) * 99;
                        i4 = ((iM45029 ^ i3) * (-18609)) ^ (-1704892454);
                        i5 = -1909944954;
                    }
                    break;
                case -1697699760:
                case 1118171134:
                    checkBox = this.f45611;
                    if (C1461.m5080()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12137) ^ (-923409924);
                        i5 = 1225577691;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛ֫") + i2) * 123;
                        i4 = ((iM45029 ^ i3) * 5487) ^ 338020722;
                        i5 = -91577280;
                    }
                    break;
                case -1562313217:
                case -592418057:
                    C1398.m4895();
                    if (C3722.f13525 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15931) ^ (-506518245);
                        i5 = -1424242651;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19345) ^ (-250263315);
                        i5 = 233109402;
                    }
                    break;
                case -1403657487:
                case 7282981:
                    if (C0216.f1393 != 0) {
                        iM45029 = (i3 - C19806.m45029("᩺ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i2) * (-4389)) ^ (-286255365);
                        i5 = -1046253162;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤۙ") ^ i3) * (-35);
                        i4 = ((iM45029 ^ i2) * 3371) ^ 1674053134;
                        i5 = -1609648825;
                    }
                    break;
                case -1320860731:
                case 37084172:
                    this.f45618.m23514(z);
                    break;
                case -710338074:
                case 1975800473:
                    if (checkBox.getVisibility() == 0) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("ۢ֨")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i3) * 4803) ^ (-2123402465);
                        i5 = -618098653;
                    } else {
                        iM45029 = (C19806.m45029("ۢۤ") ^ i2) * 99;
                        i4 = ((iM45029 ^ i3) * (-18609)) ^ (-1704892454);
                        i5 = -1909944954;
                    }
                    break;
                case -623345661:
                case 816898861:
                    if (C1377.f5749) {
                        iM45029 = (C19806.m45029("ۙܺ") + i3) * (-15);
                        i4 = ((iM45029 ^ i2) * (-30553)) ^ (-337913626);
                        i5 = 1591778333;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15931) ^ (-506518245);
                        i5 = -1424242651;
                    }
                    break;
                case -477763992:
                case 1243392761:
                    if (C0278.f1572 <= 0) {
                        iM45029 = (C19806.m45029("֫ۢ") + i3) * 25;
                        i4 = ((iM45029 ^ i2) * 15291) ^ (-2072420517);
                        i5 = 2101654365;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۨۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-22147)) ^ (-1643086107);
                        i5 = 221652845;
                    }
                    break;
                case -424806169:
                case -416172087:
                    if (C1875.m6086() != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12137) ^ (-923409924);
                        i5 = 1225577691;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܶ֨") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19345) ^ (-250263315);
                        i5 = 233109402;
                    }
                    break;
                case -322107652:
                case 1350712654:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (C19806.m45029("֫ۢ") + i3) * 25;
                        i4 = ((iM45029 ^ i2) * 15291) ^ (-2072420517);
                        i5 = 2101654365;
                    } else {
                        iM45029 = C19806.m45029("ܺ۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-2995)) ^ (-1898012653);
                        i5 = 1758804095;
                    }
                    break;
                case -231991039:
                case 1567107615:
                    this.f45613.m23518(z);
                    if (C0629.m2907()) {
                        iM45029 = ThreadFactoryC3888.m11306("᩸᩸") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-18427)) ^ 1881540489;
                        i5 = 1515433647;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩺ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i2) * (-4389)) ^ (-286255365);
                        i5 = -1046253162;
                    }
                    break;
                case -204877900:
                case 1779226590:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i3 - C19806.m45029("᩺ۙ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM45029 ^ i2) * (-4389)) ^ (-286255365);
                        i5 = -1046253162;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-25047)) ^ 1656387235;
                        i5 = -528730675;
                    }
                    break;
                case -93298491:
                case 1720881727:
                    z = false;
                    iM45029 = (ThreadFactoryC3888.m11306("֨ܳ") + i2) * 41;
                    i4 = ((iM45029 ^ i3) * 13103) ^ (-1776638675);
                    i5 = 1871170433;
                    break;
                case 20365901:
                case 1651138913:
                    if (C3722.m10894() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12137) ^ (-923409924);
                        i5 = 1225577691;
                    } else {
                        iM45029 = C19806.m45029("᩺ܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 22961) ^ 893899926;
                        i5 = -1414542869;
                    }
                    break;
                case 86420283:
                case 746533052:
                    C0526.m2437();
                    iM45029 = ThreadFactoryC3888.m11306("ܶ֨") ^ i3;
                    i4 = ((iM45029 ^ i2) * 19345) ^ (-250263315);
                    i5 = 233109402;
                    break;
                case 495194228:
                case 1434529547:
                    C0216.m1591();
                    C2477.m7593();
                    break;
                case 935649147:
                case 1092379258:
                    if (C2871.f10837 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15931) ^ (-506518245);
                        i5 = -1424242651;
                    } else {
                        iM45029 = (C19806.m45029("ܶ֫") + i3) * (-21);
                        i4 = ((iM45029 ^ i2) * (-4057)) ^ (-400005722);
                        i5 = -897956981;
                    }
                    break;
                case 941965839:
                case 2145606344:
                    z = true;
                    iM45029 = (ThreadFactoryC3888.m11306("֨ܳ") + i2) * 41;
                    i4 = ((iM45029 ^ i3) * 13103) ^ (-1776638675);
                    i5 = 1871170433;
                    break;
                case 1494759272:
                case 1977968579:
                    if (C0050.f912 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12137) ^ (-923409924);
                        i5 = 1225577691;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֨ۜ") ^ i2) * (-65);
                        i4 = ((iM45029 ^ i3) * (-28983)) ^ (-515558872);
                        i5 = -104077529;
                    }
                    break;
                default:
                    if (!C3743.f13569) {
                        iM45029 = (C19806.m45029("֫ۢ") + i3) * 25;
                        i4 = ((iM45029 ^ i2) * 15291) ^ (-2072420517);
                        i5 = 2101654365;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܳۢ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 15931) ^ (-506518245);
                        i5 = -1424242651;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x077f A[PHI: r2 r13 r16 r21 r23 r35 r39 r40 r41 r45
      0x077f: PHI (r2v43 java.lang.String) = (r2v30 java.lang.String), (r2v44 java.lang.String) binds: [B:137:0x0768, B:107:0x0541] A[DONT_GENERATE, DONT_INLINE]
      0x077f: PHI (r13v56 java.lang.String) = (r13v44 java.lang.String), (r13v57 java.lang.String) binds: [B:137:0x0768, B:107:0x0541] A[DONT_GENERATE, DONT_INLINE]
      0x077f: PHI (r16v4 l.ۛᩳۨ) = (r16v3 l.ۛᩳۨ), (r16v2 l.ۛᩳۨ) binds: [B:137:0x0768, B:107:0x0541] A[DONT_GENERATE, DONT_INLINE]
      0x077f: PHI (r21v50 java.lang.String) = (r21v38 java.lang.String), (r21v51 java.lang.String) binds: [B:137:0x0768, B:107:0x0541] A[DONT_GENERATE, DONT_INLINE]
      0x077f: PHI (r23v56 boolean) = (r23v44 boolean), (r23v57 boolean) binds: [B:137:0x0768, B:107:0x0541] A[DONT_GENERATE, DONT_INLINE]
      0x077f: PHI (r35v46 boolean) = (r35v35 boolean), (r35v47 boolean) binds: [B:137:0x0768, B:107:0x0541] A[DONT_GENERATE, DONT_INLINE]
      0x077f: PHI (r39v66 java.lang.String) = (r39v56 java.lang.String), (r39v67 java.lang.String) binds: [B:137:0x0768, B:107:0x0541] A[DONT_GENERATE, DONT_INLINE]
      0x077f: PHI (r40v23 java.lang.String) = (r40v15 java.lang.String), (r40v24 java.lang.String) binds: [B:137:0x0768, B:107:0x0541] A[DONT_GENERATE, DONT_INLINE]
      0x077f: PHI (r41v35 java.lang.String) = (r41v23 java.lang.String), (r41v36 java.lang.String) binds: [B:137:0x0768, B:107:0x0541] A[DONT_GENERATE, DONT_INLINE]
      0x077f: PHI (r45v42 l.ۡ᩸᩺) = (r45v31 l.ۡ᩸᩺), (r45v43 l.ۡ᩸᩺) binds: [B:137:0x0768, B:107:0x0541] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int iM11306;
        int i2;
        int i3;
        int iM10058;
        int iM10059;
        String strM18989;
        String str;
        String str2;
        String str3;
        String strM6105;
        String str4;
        int iM45029;
        int i4;
        int i5;
        int iM11307;
        int i6;
        int i7;
        int iM450210;
        int i8;
        int i9;
        boolean z;
        int iM11308;
        int i10;
        int iM450211;
        int i11;
        int i12;
        int iM11309;
        int i13;
        int i14;
        int selectedItemPosition = 0;
        boolean zM2909 = false;
        boolean zM6229 = false;
        boolean z2 = false;
        String strM4840 = null;
        int iM17646 = 0;
        String str5 = null;
        Exception exc = null;
        int iM17654 = 0;
        C6222 c6222 = null;
        C6222 c6223 = null;
        String str6 = null;
        int i15 = 0;
        int i16 = 0;
        String strM4841 = null;
        int i17 = -1083045797;
        int i18 = C2477.f9839;
        int i19 = C1875.f7103;
        int iM113010 = (i19 - ThreadFactoryC3888.m11306("ۢۢ")) * 99;
        int i20 = ((iM113010 ^ i18) * 13893) ^ (-579447431);
        int i21 = iM113010 ^ (-940104887);
        C11545 c11545 = null;
        C6222 c6222Matcher = null;
        String str7 = null;
        String strM5516 = null;
        int i22 = 0;
        boolean zM62210 = false;
        boolean zM29010 = false;
        String str8 = null;
        DialogInterfaceC19356 dialogInterfaceC19356 = null;
        Exception exc2 = null;
        String str9 = null;
        C9160 c9160 = null;
        String str10 = null;
        C6222 c6224 = null;
        String str11 = null;
        int i23 = 0;
        int iM450212 = 0;
        C9160 c9161 = null;
        String str12 = null;
        boolean z3 = false;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i18) * (-6085)) >> 31));
            switch (i17) {
                case -2128172831:
                case 244167628:
                    zM6229 = zM6229;
                    str9 = str9;
                    iM17654 = C6461.m17654(strM4840);
                    z2 = z2;
                    String str13 = str11;
                    if (C3535.m10420(str10, str13)) {
                        str11 = str13;
                        iM45029 = (i19 - C19806.m45029("֫᩺")) * 37;
                        i4 = ((iM45029 ^ i18) * (-29491)) ^ (-1107454960);
                        i5 = -1413925410;
                    } else {
                        iM45029 = (C19806.m45029("᩷ۗ") + i19) * (-47);
                        str11 = str13;
                        i4 = ((iM45029 ^ i18) * (-16147)) ^ (-857463031);
                        i5 = 305270344;
                    }
                    i21 = iM45029 ^ i5;
                    i20 = i4;
                    z2 = z2;
                    str9 = str9;
                    zM6229 = zM6229;
                    break;
                case -2110181690:
                case -69319615:
                    C1668.m5582(iM450212);
                    C1977.m6361(c9160);
                    break;
                case -2009849542:
                case -370900398:
                    str12 = str12;
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    strM5516 = strM5516;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (selectedItemPosition != 4) {
                        c6223 = c6224;
                        str5 = str10;
                        iM450210 = ThreadFactoryC3888.m11306("ܰܶ") ^ i19;
                        i8 = ((iM450210 ^ i18) * 24425) ^ 510027265;
                        i9 = -1235257010;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩹ۢ") ^ i19;
                        i8 = ((iM450210 ^ i18) * (-11949)) ^ (-37535811);
                        i9 = -600414939;
                    }
                    int i24 = iM450210 ^ i9;
                    strM5516 = strM5516;
                    zM6229 = zM6229;
                    str12 = str12;
                    str10 = str10;
                    i21 = i24;
                    i20 = i8;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1866086093:
                case -1547000974:
                    C2477.m7591(c11545).m30996(C19806.m45029(C1377.m4832(f45606, 167, 3, i22)) ^ 2100893327, ThreadFactoryC3888.m11306(C0278.m1774(f45606, 170, 3, i22)) ^ 2103135016, z3);
                    break;
                case -1842650420:
                case 1117052805:
                    C2704.m8256(ViewTreeObserverOnPreDrawListenerC3327.m9865(C1875.m6085(C19806.m45029(C2124.m6685(f45606, 214, 3, i22)) ^ 2116914656), str9));
                    C2871.m8645(c9161);
                    break;
                case -1814348946:
                case 609380269:
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    str = strM5516;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    String strM2424 = C0526.m2424(f45606, PicnicEngine.MAX_AUX_BYTES, 2, i22);
                    boolean zM10420 = C3535.m10420(str8, strM2424);
                    str11 = strM2424;
                    strM18989 = C7105.m18989(f45606, 178, 2, i22);
                    if (zM10420) {
                        iM11308 = ThreadFactoryC3888.m11306("ۘۘ") ^ i18;
                        i6 = ((iM11308 ^ i19) * (-31605)) ^ 1441002009;
                        i10 = -1325786728;
                    } else {
                        iM11308 = (ThreadFactoryC3888.m11306("֡ۙ") ^ i19) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i6 = ((iM11308 ^ i18) * (-28773)) ^ (-2042418498);
                        i10 = -1878723386;
                    }
                    i21 = iM11308 ^ i10;
                    c9161 = c9161;
                    strM5516 = str;
                    zM6229 = zM6229;
                    str12 = strM18989;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1765016358:
                case 1533282781:
                    C1668.m5582(ThreadFactoryC3888.m11306(C1025.m3859(f45606, Primes.SMALL_FACTOR_LIMIT, 3, i22)) ^ 2104993139);
                    C2871.m8645(c9160);
                    break;
                case -1738512455:
                case 28229404:
                    C2704.m8256(ViewTreeObserverOnPreDrawListenerC3327.m9865(C1875.m6085(ThreadFactoryC3888.m11306(ViewGroupOnHierarchyChangeListenerC1916.m6241(f45606, 207, 3, i22)) ^ 2130653300), str9));
                    C1977.m6361(c9160);
                    break;
                case -1730591247:
                case 1212397259:
                    String str14 = str12;
                    zM6229 = zM6229;
                    boolean z4 = z3;
                    String str15 = str9;
                    String str16 = str7;
                    String str17 = strM5516;
                    boolean z5 = z2;
                    c9160 = this.f45613;
                    String strM6674 = C2124.m6674(c9160.m23513());
                    C9160 c9162 = this.f45618;
                    String strM6675 = C2124.m6674(c9162.m23513());
                    boolean zM10786 = C3660.m10786(strM6674);
                    DialogInterfaceC19356 dialogInterfaceC19357 = this.f45614;
                    if (zM10786) {
                        int iM113011 = ThreadFactoryC3888.m11306("ۨ֨") ^ i19;
                        i20 = ((iM113011 ^ i18) * (-15067)) ^ (-1152034058);
                        strM5516 = str17;
                        z3 = z4;
                        c9161 = c9162;
                        str10 = strM6675;
                        dialogInterfaceC19356 = dialogInterfaceC19357;
                        str7 = str16;
                        z2 = z5;
                        str12 = str14;
                        str9 = str15;
                        str8 = strM6674;
                        i21 = iM113011 ^ (-1374208312);
                    } else {
                        int iM450213 = (C19806.m45029("ܿ۫") + i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM450213 ^ i19) * (-13671)) ^ (-1330971661);
                        strM5516 = str17;
                        z3 = z4;
                        c9161 = c9162;
                        str10 = strM6675;
                        dialogInterfaceC19356 = dialogInterfaceC19357;
                        str7 = str16;
                        z2 = z5;
                        str12 = str14;
                        str9 = str15;
                        str8 = strM6674;
                        i21 = iM450213 ^ (-1246188975);
                        i20 = i;
                    }
                    zM6229 = zM6229;
                    break;
                case -1593064874:
                case 365965012:
                    str12 = str12;
                    c9161 = c9161;
                    z3 = z3;
                    str8 = str8;
                    str9 = str9;
                    str7 = str7;
                    strM5516 = strM5516;
                    str10 = str10;
                    zM62210 = ViewGroupOnHierarchyChangeListenerC1916.m6229(this.f45615);
                    zM2909 = C0629.m2909(this.f45611);
                    zM29010 = C0629.m2909(this.f45616);
                    zM6229 = ViewGroupOnHierarchyChangeListenerC1916.m6229(this.f45612);
                    boolean zM29011 = C0629.m2909(this.f45617);
                    if (selectedItemPosition != 0) {
                        int iM113012 = (ThreadFactoryC3888.m11306("ۚ᩹") ^ i19) * (-13);
                        z = zM29011;
                        i20 = ((iM113012 ^ i18) * (-1533)) ^ 144172648;
                        strM5516 = strM5516;
                        str12 = str12;
                        str9 = str9;
                        i21 = iM113012 ^ 47547689;
                    } else {
                        z = zM29011;
                        int iM450214 = (C19806.m45029("ۛۢ") ^ i18) * 47;
                        strM5516 = strM5516;
                        str12 = str12;
                        str9 = str9;
                        i21 = iM450214 ^ (-439301727);
                        i20 = ((iM450214 ^ i19) * (-24307)) ^ 36113673;
                    }
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z;
                    z3 = z3;
                    c9161 = c9161;
                    break;
                case -1578471680:
                case 1447275240:
                    strM4841 = C1377.m4840(str10, 2);
                    iM11309 = ThreadFactoryC3888.m11306("ۗܳ") ^ i18;
                    i13 = ((iM11309 ^ i19) * 18277) ^ (-1211155889);
                    i14 = 1864187662;
                    i21 = iM11309 ^ i14;
                    i20 = i13;
                    break;
                case -1487841700:
                case 784336850:
                    C1668.m5582(ThreadFactoryC3888.m11306(C1398.m4892(f45606, 334, 3, i22)) ^ 2118894002);
                    C2871.m8645(c9161);
                    break;
                case -1481575047:
                case -1273801980:
                    C1668.m5582(iM450212);
                    C1977.m6361(c9161);
                    break;
                case -1452979187:
                case 1663752607:
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    if (C6461.m17651(strM4840)) {
                        iM11306 = C19806.m45029("ۤۗ") ^ i18;
                        i2 = ((iM11306 ^ i19) * (-26467)) ^ 840235357;
                        i3 = 2126276945;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨۧ") + i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i2 = ((iM11306 ^ i19) * 15491) ^ 568547583;
                        i3 = -1856026657;
                    }
                    i21 = iM11306 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM6229 = zM6229;
                    break;
                case -1365079895:
                case 1567526117:
                    zM6229 = zM6229;
                    str9 = str9;
                    z2 = z2;
                    c9161 = c9161;
                    str8 = str8;
                    str6 = str5;
                    c6222 = c6223;
                    str7 = str7;
                    i15 = 0;
                    i16 = 0;
                    iM11306 = (ThreadFactoryC3888.m11306("ᩳۧ") ^ i19) * 29;
                    i2 = ((iM11306 ^ i18) * 22311) ^ 611078948;
                    i3 = 2034600454;
                    i21 = iM11306 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM6229 = zM6229;
                    break;
                case -1306452485:
                case -591697881:
                    str12 = str12;
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    strM5516 = strM5516;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    selectedItemPosition = this.f45608.getSelectedItemPosition();
                    c11545 = this.f45610;
                    z3 = false;
                    if (selectedItemPosition == 0) {
                        iM450210 = (C19806.m45029("᩶᩵") + i19) * (-21);
                        i8 = ((iM450210 ^ i18) * 7083) ^ 1546240847;
                        i9 = -1403922271;
                    } else {
                        iM450210 = (C19806.m45029("ۢۘ") + i18) * (-71);
                        i8 = ((iM450210 ^ i19) * 25983) ^ (-2045705643);
                        i9 = -134598704;
                    }
                    int i25 = iM450210 ^ i9;
                    strM5516 = strM5516;
                    zM6229 = zM6229;
                    str12 = str12;
                    str10 = str10;
                    i21 = i25;
                    i20 = i8;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -1060387722:
                case 1353694222:
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    strM4840 = C1377.m4840(str8, 2);
                    iM11306 = C19806.m45029("ۧۜ") ^ i18;
                    i2 = ((iM11306 ^ i19) * (-13647)) ^ (-884332252);
                    i3 = 320537508;
                    i21 = iM11306 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM6229 = zM6229;
                    break;
                case -1017672651:
                case 900355883:
                    if (!C3535.m10420(str10, str12)) {
                        strM4841 = str10;
                        iM11309 = ThreadFactoryC3888.m11306("ۗܳ") ^ i18;
                        i13 = ((iM11309 ^ i19) * 18277) ^ (-1211155889);
                        i14 = 1864187662;
                        i21 = iM11309 ^ i14;
                        i20 = i13;
                    } else {
                        zM6229 = zM6229;
                        str9 = str9;
                        z2 = z2;
                        iM45029 = (i19 - C19806.m45029("֫᩺")) * 37;
                        i4 = ((iM45029 ^ i18) * (-29491)) ^ (-1107454960);
                        i5 = -1413925410;
                        i21 = iM45029 ^ i5;
                        i20 = i4;
                        z2 = z2;
                        str9 = str9;
                        zM6229 = zM6229;
                    }
                    break;
                case -931829368:
                case 523035356:
                    if (C6461.m17651(strM4841)) {
                        iM11309 = (C19806.m45029("᩸ۙ") ^ i19) * 3;
                        i13 = ((iM11309 ^ i18) * (-23661)) ^ (-12882131);
                        i14 = 873046544;
                    } else {
                        iM11309 = C19806.m45029("᩻ۙ") ^ i19;
                        i13 = ((iM11309 ^ i18) * 12825) ^ 1273778491;
                        i14 = -973983807;
                    }
                    i21 = iM11309 ^ i14;
                    i20 = i13;
                    break;
                case -906622020:
                case 1160181413:
                    C1189.m4367(dialogInterfaceC19356);
                    break;
                case -875420161:
                case 212050975:
                    str12 = str12;
                    c9161 = c9161;
                    zM6229 = zM6229;
                    z3 = z3;
                    str9 = str9;
                    strM5516 = strM5516;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    i23 = 1;
                    if (selectedItemPosition == 1) {
                        z = z2;
                        zM6229 = zM6229;
                        int iM450215 = (C19806.m45029("ۛۢ") ^ i18) * 47;
                        strM5516 = strM5516;
                        str12 = str12;
                        str9 = str9;
                        i21 = iM450215 ^ (-439301727);
                        i20 = ((iM450215 ^ i19) * (-24307)) ^ 36113673;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z;
                        z3 = z3;
                        c9161 = c9161;
                    } else {
                        iM11307 = (C19806.m45029("ۢ᩻") + i19) * 57;
                        i6 = ((iM11307 ^ i18) * 18461) ^ (-1613770885);
                        i7 = 1467984929;
                        int i26 = iM11307 ^ i7;
                        strM5516 = strM5516;
                        z3 = z3;
                        zM6229 = zM6229;
                        str12 = str12;
                        c9161 = c9161;
                        i21 = i26;
                        i20 = i6;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case -840051031:
                case -98176024:
                    str12 = str12;
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    strM5516 = strM5516;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (selectedItemPosition != 3) {
                        iM450210 = (i19 - C19806.m45029("ۚܿ")) * (-17);
                        i8 = ((iM450210 ^ i18) * 25097) ^ (-187557586);
                        i9 = -2010594006;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("֡ۗ") ^ i18;
                        i8 = ((iM450210 ^ i19) * (-29639)) ^ 2027187367;
                        i9 = 1484009857;
                    }
                    int i27 = iM450210 ^ i9;
                    strM5516 = strM5516;
                    zM6229 = zM6229;
                    str12 = str12;
                    str10 = str10;
                    i21 = i27;
                    i20 = i8;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case -798838282:
                case -767418601:
                    C2704.m8256(C3535.m10415(exc2));
                    C2871.m8645(c9160);
                    break;
                case -571787085:
                case 1394085194:
                    c9160.m23519();
                    c9161.m23519();
                    C2249.m6906(C1066.m4033(C1066.m4033(C10634.m26827(C1066.m4033(C10634.m26827(CallableC1627.m5517(ApplicationC0716.f2992).mo4065(selectedItemPosition, C3722.m10901(f45606, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 16, i22)), C3286.m9788(f45606, 233, 22, i22), zM29010), C2871.m8640(f45606, 255, 17, i22), zM2909), MenuItemOnMenuItemClickListenerC3244.m9715(f45606, 272, 15, i22), zM62210), C2871.m8640(f45606, 287, 19, i22), zM6229), C2788.m8470(f45606, 306, 25, i22), z2));
                    C1668.m5572(dialogInterfaceC19356);
                    Main mainM7591 = C2477.m7591(c11545);
                    final int i28 = selectedItemPosition;
                    final C6222 c6225 = c6222;
                    final boolean z6 = zM2909;
                    final boolean z7 = z2;
                    final boolean z8 = zM6229;
                    final String str18 = str6;
                    final int i29 = i15;
                    final int i30 = i16;
                    C11005.m27761(new InterfaceC17354(this) { // from class: l.ۧܽۨ

                        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC13819 f37747;

                        @Override // l.InterfaceC17354
                        public final /* synthetic */ void onCanceled() {
                        }

                        @Override // l.InterfaceC17354
                        /* JADX INFO: renamed from: ۙ */
                        public final /* synthetic */ boolean mo6537(Exception exc3) {
                            return false;
                        }

                        {
                            int i31 = -390119774;
                            int i32 = C0629.f2722;
                            int i33 = C1066.f4915;
                            int iM450216 = C19806.m45029("۫ۧ") ^ i32;
                            int i34 = ((iM450216 ^ i33) * 24693) ^ (-1158901625);
                            int i35 = 233182284;
                            while (true) {
                                i31 = ((((i31 ^ i33) * (-32085)) >> 31) & i34) ^ (iM450216 ^ i35);
                                switch (i31) {
                                    case -2082531644:
                                    case -1075358201:
                                        if (C0962.f3784) {
                                            iM450216 = C19806.m45029("ۚ۫") ^ i32;
                                            i34 = ((iM450216 ^ i33) * (-11663)) ^ (-2030368598);
                                            i35 = 510681565;
                                        } else {
                                            iM450216 = C19806.m45029("ۧۤ") ^ i33;
                                            i34 = ((iM450216 ^ i32) * (-23483)) ^ (-257389465);
                                            i35 = -1397476691;
                                        }
                                        break;
                                    case -2013162457:
                                    case -686055928:
                                        if (C2124.f7782 <= 0) {
                                            iM450216 = C19806.m45029("ۖۘ") ^ i32;
                                            i34 = ((iM450216 ^ i33) * (-8349)) ^ (-1093815514);
                                            i35 = -181984378;
                                        } else {
                                            iM450216 = (C19806.m45029("ۖۨ") + i33) * (-35);
                                            i34 = ((iM450216 ^ i32) * (-30091)) ^ 161940744;
                                            i35 = 886396895;
                                        }
                                        break;
                                    case -1853658069:
                                    case 89053:
                                        return;
                                    case -1356617781:
                                    case 275501732:
                                        if (C1977.f7413 <= 0) {
                                            iM450216 = C19806.m45029("ۖۘ") ^ i32;
                                            i34 = ((iM450216 ^ i33) * (-8349)) ^ (-1093815514);
                                            i35 = -181984378;
                                        } else {
                                            iM450216 = (C19806.m45029("᩵ۛ") + i33) * 7;
                                            i34 = ((iM450216 ^ i32) * 12673) ^ 1526415786;
                                            i35 = 771597755;
                                        }
                                        break;
                                    case -922171618:
                                    case 483532394:
                                        if (C3535.f13026 <= 0) {
                                            iM450216 = C19806.m45029("ۚ۫") ^ i32;
                                            i34 = ((iM450216 ^ i33) * (-11663)) ^ (-2030368598);
                                            i35 = 510681565;
                                        } else {
                                            iM450216 = (C19806.m45029("ܰۙ") ^ i33) * 23;
                                            i34 = ((iM450216 ^ i32) * 21641) ^ 1689781182;
                                            i35 = 186167669;
                                        }
                                        break;
                                    case -838606141:
                                    case 603798687:
                                        if (C0671.f2816 != 0) {
                                            iM450216 = C19806.m45029("ۖۘ") ^ i32;
                                            i34 = ((iM450216 ^ i33) * (-8349)) ^ (-1093815514);
                                            i35 = -181984378;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("ۤ᩷") ^ i32;
                                            i34 = ((iM450216 ^ i33) * (-32725)) ^ 2086400270;
                                            i35 = 603553085;
                                        }
                                        break;
                                    case -667308739:
                                    case 512301524:
                                        this.f37747 = this;
                                        if (C1419.f5860 >= 0) {
                                            iM450216 = ThreadFactoryC3888.m11306("۟ۡ") ^ i33;
                                            i34 = ((iM450216 ^ i32) * 21477) ^ 775916368;
                                            i35 = -2063925133;
                                        } else {
                                            iM450216 = C19806.m45029("ܿۖ") ^ i32;
                                            i34 = ((iM450216 ^ i33) * (-25059)) ^ (-1742625334);
                                            i35 = -1867505289;
                                        }
                                        break;
                                    case -515378433:
                                    case 1904442311:
                                        if (RunnableC0195.f1321 >= 0) {
                                            iM450216 = C19806.m45029("ۖۘ") ^ i32;
                                            i34 = ((iM450216 ^ i33) * (-8349)) ^ (-1093815514);
                                            i35 = -181984378;
                                        } else {
                                            iM450216 = C19806.m45029("ۚ۫") ^ i32;
                                            i34 = ((iM450216 ^ i33) * (-11663)) ^ (-2030368598);
                                            i35 = 510681565;
                                        }
                                        break;
                                    case -440001897:
                                    case 298488021:
                                        if (C1419.m4973()) {
                                            iM450216 = ThreadFactoryC3888.m11306("۟ۡ") ^ i33;
                                            i34 = ((iM450216 ^ i32) * 21477) ^ 775916368;
                                            i35 = -2063925133;
                                        } else {
                                            iM450216 = (i32 - ThreadFactoryC3888.m11306("ᩴۗ")) * 9;
                                            i34 = ((iM450216 ^ i33) * 14065) ^ (-1998240264);
                                            i35 = -1099891538;
                                        }
                                        break;
                                    case 151860265:
                                    case 220162632:
                                        MenuItemOnMenuItemClickListenerC3244.m9701();
                                        throw new RuntimeException();
                                    case 257584040:
                                    case 279033927:
                                        if (C2871.f10837 >= 0) {
                                            iM450216 = C19806.m45029("ۚ۫") ^ i32;
                                            i34 = ((iM450216 ^ i33) * (-11663)) ^ (-2030368598);
                                            i35 = 510681565;
                                        } else {
                                            iM450216 = ThreadFactoryC3888.m11306("֫᩶") ^ i33;
                                            i34 = ((iM450216 ^ i32) * (-31331)) ^ (-196760341);
                                            i35 = -197161106;
                                        }
                                        break;
                                    case 686740628:
                                    case 1038402535:
                                        if (C0671.m3008() >= 0) {
                                            iM450216 = (i33 - C19806.m45029("ۢܳ")) * (-39);
                                            i34 = ((iM450216 ^ i32) * (-11119)) ^ 671699644;
                                            i35 = -437764387;
                                        } else {
                                            iM450216 = (C19806.m45029("᩸ۙ") + i32) * (-99);
                                            i34 = ((iM450216 ^ i33) * (-5487)) ^ 179434080;
                                            i35 = -226240106;
                                        }
                                        break;
                                    case 732986793:
                                    case 775965435:
                                        C3722.m10894();
                                        iM450216 = C19806.m45029("ۚ۫") ^ i32;
                                        i34 = ((iM450216 ^ i33) * (-11663)) ^ (-2030368598);
                                        i35 = 510681565;
                                        break;
                                    case 815160810:
                                    case 1012633335:
                                        if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                                            iM450216 = C19806.m45029("ۚ۫") ^ i32;
                                            i34 = ((iM450216 ^ i33) * (-11663)) ^ (-2030368598);
                                            i35 = 510681565;
                                        } else {
                                            iM450216 = C19806.m45029("۫۬") ^ i32;
                                            i34 = ((iM450216 ^ i33) * 29563) ^ 1337043942;
                                            i35 = -1135826322;
                                        }
                                        break;
                                    case 1539868181:
                                    case 1704948872:
                                        RunnableC3388.m10064();
                                        if (RunnableC1606.f6488 < 0) {
                                            iM450216 = (C19806.m45029("ܳᩴ") + i33) * (-83);
                                            i34 = ((iM450216 ^ i32) * (-27967)) ^ 281635189;
                                            i35 = 770566360;
                                        } else {
                                            iM450216 = C19806.m45029("ۚ۫") ^ i32;
                                            i34 = ((iM450216 ^ i33) * (-11663)) ^ (-2030368598);
                                            i35 = 510681565;
                                        }
                                        break;
                                    default:
                                        if (ThreadFactoryC3888.f14547 > 0) {
                                            iM450216 = (i33 - C19806.m45029("ۢܳ")) * (-39);
                                            i34 = ((iM450216 ^ i32) * (-11119)) ^ 671699644;
                                            i35 = -437764387;
                                        } else {
                                            iM450216 = (C19806.m45029("ܳᩴ") + i33) * (-83);
                                            i34 = ((iM450216 ^ i32) * (-27967)) ^ 281635189;
                                            i35 = 770566360;
                                        }
                                        break;
                                }
                            }
                        }

                        /* JADX WARN: Code duplicated, block: B:41:0x0125 A[PHI: r20
                          0x0125: PHI (r20v4 int) = (r20v1 int), (r20v2 int), (r20v1 int), (r20v1 int), (r20v1 int) binds: [B:40:0x0123, B:33:0x00e8, B:18:0x0071, B:16:0x006d, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:51:0x018a A[PHI: r13 r14 r21
                          0x018a: PHI (r13v5 l.ܰ۫ۨ) = (r13v3 l.ܰ۫ۨ), (r13v3 l.ܰ۫ۨ), (r13v3 l.ܰ۫ۨ), (r13v4 l.ܰ۫ۨ), (r13v3 l.ܰ۫ۨ) binds: [B:48:0x0172, B:44:0x0153, B:36:0x0108, B:29:0x00c2, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
                          0x018a: PHI (r14v3 int) = (r14v1 int), (r14v1 int), (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:48:0x0172, B:44:0x0153, B:36:0x0108, B:29:0x00c2, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]
                          0x018a: PHI (r21v4 int) = (r21v1 int), (r21v1 int), (r21v1 int), (r21v2 int), (r21v1 int) binds: [B:48:0x0172, B:44:0x0153, B:36:0x0108, B:29:0x00c2, B:6:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:55:0x01b9 A[PHI: r15 r16 r17
                          0x01b9: PHI (r15v3 l.ۛᩳۨ) = (r15v2 l.ۛᩳۨ), (r15v1 l.ۛᩳۨ), (r15v1 l.ۛᩳۨ), (r15v1 l.ۛᩳۨ) binds: [B:25:0x0094, B:54:0x01b7, B:16:0x006d, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
                          0x01b9: PHI (r16v4 boolean) = (r16v2 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean) binds: [B:25:0x0094, B:54:0x01b7, B:16:0x006d, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]
                          0x01b9: PHI (r17v4 boolean) = (r17v2 boolean), (r17v1 boolean), (r17v1 boolean), (r17v1 boolean) binds: [B:25:0x0094, B:54:0x01b7, B:16:0x006d, B:13:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:59:0x01e5  */
                        @Override // l.InterfaceC17354
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo6536(C14558 c14558, boolean z9) {
                            int iM113013;
                            int i31;
                            int i32 = -1900408767;
                            int i33 = ThreadFactoryC3888.f14547;
                            int i34 = C10634.f36300;
                            int iM113014 = (i34 - ThreadFactoryC3888.m11306("ۤۤ")) * 35;
                            int i35 = ((iM113014 ^ i33) * 11281) ^ 477588026;
                            int i36 = iM113014 ^ (-608860573);
                            ViewOnClickListenerC13819 viewOnClickListenerC13819 = null;
                            C6222 c6226 = null;
                            int i37 = 0;
                            boolean z10 = false;
                            boolean z11 = false;
                            int i38 = 0;
                            int i39 = 0;
                            while (true) {
                                i32 = i36 ^ ((((i32 ^ i33) * 26853) >> 31) & i35);
                                switch (i32) {
                                    case -2122306423:
                                    case -254419537:
                                        if (C1189.f5284 <= 0) {
                                            iM113013 = ThreadFactoryC3888.m11306("ۜۧ") ^ i34;
                                            i35 = ((iM113013 ^ i33) * 11417) ^ (-1792403471);
                                            i31 = -1937334289;
                                        } else {
                                            iM113013 = C19806.m45029("۫ۢ") ^ i33;
                                            i35 = ((iM113013 ^ i34) * (-3589)) ^ (-1004872929);
                                            i31 = 1869325692;
                                        }
                                        i36 = iM113013 ^ i31;
                                        break;
                                    case -1559682953:
                                    case 572781990:
                                        if (RunnableC1606.f6488 >= 0) {
                                            iM113013 = (i34 - C19806.m45029("᩹ۚ")) * 123;
                                            i35 = ((iM113013 ^ i33) * 19441) ^ (-538842236);
                                            i31 = -1864340059;
                                        } else {
                                            iM113013 = (i34 - C19806.m45029("ۡ᩷")) * (-119);
                                            i35 = ((iM113013 ^ i33) * (-27675)) ^ (-443704730);
                                            i31 = 1906180982;
                                        }
                                        i36 = iM113013 ^ i31;
                                        break;
                                    case -1311632990:
                                    case -658769657:
                                        ViewOnClickListenerC13819.m33630(viewOnClickListenerC13819, i37, c6226, z10, z11, z8, str18, i38, i39, c14558, z9);
                                        break;
                                    case -1281241055:
                                    case 863912618:
                                        if (C0671.f2816 != 0) {
                                            iM113013 = ThreadFactoryC3888.m11306("ۜۧ") ^ i34;
                                            i35 = ((iM113013 ^ i33) * 11417) ^ (-1792403471);
                                            i31 = -1937334289;
                                        } else {
                                            iM113013 = ThreadFactoryC3888.m11306("ۤۡ") ^ i33;
                                            i35 = ((iM113013 ^ i34) * (-25949)) ^ (-1010271413);
                                            i31 = -1856759863;
                                        }
                                        i36 = iM113013 ^ i31;
                                        break;
                                    case -1205284518:
                                    case 2136079389:
                                        if (C3535.m10431() <= 0) {
                                            iM113013 = (i34 - C19806.m45029("᩹ۚ")) * 123;
                                            i35 = ((iM113013 ^ i33) * 19441) ^ (-538842236);
                                            i31 = -1864340059;
                                        } else {
                                            iM113013 = ThreadFactoryC3888.m11306("ۨᩴ") ^ i34;
                                            i35 = ((iM113013 ^ i33) * (-19777)) ^ 403614860;
                                            i31 = 470625424;
                                        }
                                        i36 = iM113013 ^ i31;
                                        break;
                                    case -1026203492:
                                    case 1111109494:
                                        if (C1460.m5050() != 0) {
                                            iM113013 = (i34 - C19806.m45029("᩹ۚ")) * 123;
                                            i35 = ((iM113013 ^ i33) * 19441) ^ (-538842236);
                                            i31 = -1864340059;
                                        } else {
                                            iM113013 = C19806.m45029("᩺ۘ") ^ i34;
                                            i35 = ((iM113013 ^ i33) * 8587) ^ 1327655391;
                                            i31 = 1187953475;
                                        }
                                        i36 = iM113013 ^ i31;
                                        break;
                                    case -970597566:
                                    case 779686925:
                                        if (C2788.f10625 >= 0) {
                                            iM113013 = ThreadFactoryC3888.m11306("ۤۡ") ^ i33;
                                            i35 = ((iM113013 ^ i34) * (-25949)) ^ (-1010271413);
                                            i31 = -1856759863;
                                        } else {
                                            iM113013 = (i34 - ThreadFactoryC3888.m11306("۠ۤ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i35 = ((iM113013 ^ i33) * 9121) ^ 1401358141;
                                            i31 = -651073866;
                                        }
                                        i36 = iM113013 ^ i31;
                                        break;
                                    case -952680016:
                                    case 1270949773:
                                        RunnableC1564.m5345();
                                        if (C0962.f3784) {
                                            iM113013 = C19806.m45029("᩶ܳ") ^ i33;
                                            i35 = ((iM113013 ^ i34) * (-31047)) ^ (-2017075884);
                                            i31 = 912537966;
                                        } else {
                                            iM113013 = ThreadFactoryC3888.m11306("ۜۧ") ^ i34;
                                            i35 = ((iM113013 ^ i33) * 11417) ^ (-1792403471);
                                            i31 = -1937334289;
                                        }
                                        i36 = iM113013 ^ i31;
                                        break;
                                    case -740543389:
                                    case -393858068:
                                        int i40 = i30;
                                        viewOnClickListenerC13819 = this.f37747;
                                        i37 = i28;
                                        if (C1148.f5161 <= 0) {
                                            i39 = i40;
                                            iM113013 = (i34 - C19806.m45029("᩹ۚ")) * 123;
                                            i35 = ((iM113013 ^ i33) * 19441) ^ (-538842236);
                                            i31 = -1864340059;
                                            i36 = iM113013 ^ i31;
                                        } else {
                                            int iM450216 = (i34 - C19806.m45029("ۖᩴ")) * (-87);
                                            i35 = ((iM450216 ^ i33) * (-11229)) ^ (-1545028387);
                                            i36 = iM450216 ^ 79822216;
                                            i39 = i40;
                                        }
                                        break;
                                    case -160255302:
                                    case 864204815:
                                        C0629.m2907();
                                        iM113013 = C19806.m45029("᩶ܳ") ^ i33;
                                        i35 = ((iM113013 ^ i34) * (-31047)) ^ (-2017075884);
                                        i31 = 912537966;
                                        i36 = iM113013 ^ i31;
                                        break;
                                    case -104235850:
                                    case 292124594:
                                        int i41 = i29;
                                        if (C1875.f7103 >= 0) {
                                            i38 = i41;
                                            iM113013 = C19806.m45029("᩶ܳ") ^ i33;
                                            i35 = ((iM113013 ^ i34) * (-31047)) ^ (-2017075884);
                                            i31 = 912537966;
                                            i36 = iM113013 ^ i31;
                                        } else {
                                            int iM113015 = ThreadFactoryC3888.m11306("ۚ᩷") ^ i33;
                                            i35 = ((iM113015 ^ i34) * 14693) ^ 495249333;
                                            i36 = iM113015 ^ (-2051059526);
                                            i38 = i41;
                                        }
                                        break;
                                    case 291423261:
                                    case 1847187475:
                                        c6226 = c6225;
                                        boolean z12 = z6;
                                        boolean z13 = z7;
                                        if (C2871.f10837 >= 0) {
                                            z10 = z12;
                                            z11 = z13;
                                            iM113013 = ThreadFactoryC3888.m11306("ۜۧ") ^ i34;
                                            i35 = ((iM113013 ^ i33) * 11417) ^ (-1792403471);
                                            i31 = -1937334289;
                                            i36 = iM113013 ^ i31;
                                        } else {
                                            int iM450217 = (i33 - C19806.m45029("֨ۛ")) * (-111);
                                            i35 = ((iM450217 ^ i34) * (-22757)) ^ 178064299;
                                            i36 = iM450217 ^ 1402851686;
                                            z10 = z12;
                                            z11 = z13;
                                        }
                                        break;
                                    case 572866768:
                                    case 1149244587:
                                        if (C1977.f7413 <= 0) {
                                            iM113013 = C19806.m45029("᩶ܳ") ^ i33;
                                            i35 = ((iM113013 ^ i34) * (-31047)) ^ (-2017075884);
                                            i31 = 912537966;
                                        } else {
                                            iM113013 = (ThreadFactoryC3888.m11306("ۧۢ") + i33) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i35 = ((iM113013 ^ i34) * 2251) ^ (-2140991180);
                                            i31 = -1218577875;
                                        }
                                        i36 = iM113013 ^ i31;
                                        break;
                                    case 989875009:
                                    case 1610909719:
                                        C1066.m4023();
                                        break;
                                    case 1394490757:
                                    case 1429724619:
                                        if (C2249.m6915() <= 0) {
                                            iM113013 = C19806.m45029("᩶ܳ") ^ i33;
                                            i35 = ((iM113013 ^ i34) * (-31047)) ^ (-2017075884);
                                            i31 = 912537966;
                                        } else {
                                            iM113013 = (ThreadFactoryC3888.m11306("ۙ᩺") ^ i34) * 89;
                                            i35 = ((iM113013 ^ i33) * (-9227)) ^ 1846393661;
                                            i31 = 1528053680;
                                        }
                                        i36 = iM113013 ^ i31;
                                        break;
                                    default:
                                        if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                                            iM113013 = (i34 - C19806.m45029("᩹ۚ")) * 123;
                                            i35 = ((iM113013 ^ i33) * 19441) ^ (-538842236);
                                            i31 = -1864340059;
                                        } else {
                                            iM113013 = ThreadFactoryC3888.m11306("۠֨") ^ i33;
                                            i35 = ((iM113013 ^ i34) * 22443) ^ (-460047926);
                                            i31 = 691186897;
                                        }
                                        i36 = iM113013 ^ i31;
                                        break;
                                }
                                return;
                            }
                        }
                    }, mainM7591, this.f45609);
                    break;
                case -413561157:
                case -89641468:
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    if (!C1398.m4899(str8, str12)) {
                        strM4840 = str8;
                        iM11306 = C19806.m45029("ۧۜ") ^ i18;
                        i2 = ((iM11306 ^ i19) * (-13647)) ^ (-884332252);
                        i3 = 320537508;
                        i21 = iM11306 ^ i3;
                        i20 = i2;
                        str7 = str7;
                        c9161 = c9161;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        zM6229 = zM6229;
                    } else {
                        strM18989 = str12;
                        str10 = str10;
                        str9 = str9;
                        str = strM5516;
                        iM11308 = ThreadFactoryC3888.m11306("ۘۘ") ^ i18;
                        i6 = ((iM11308 ^ i19) * (-31605)) ^ 1441002009;
                        i10 = -1325786728;
                        i21 = iM11308 ^ i10;
                        c9161 = c9161;
                        strM5516 = str;
                        zM6229 = zM6229;
                        str12 = strM18989;
                        i20 = i6;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case -302716969:
                case 722288485:
                    iM10059 = C6461.m17646(C0050.m931(str10, i23));
                    iM10058 = iM17646;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    i16 = iM10059;
                    i15 = iM10058;
                    str6 = str10;
                    c6222 = c6224;
                    iM11306 = (ThreadFactoryC3888.m11306("ᩳۧ") ^ i19) * 29;
                    i2 = ((iM11306 ^ i18) * 22311) ^ 611078948;
                    i3 = 2034600454;
                    i21 = iM11306 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM6229 = zM6229;
                    break;
                case -174073740:
                case 541775463:
                    iM10059 = C6461.m17654(strM4841);
                    iM10058 = iM17654;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    i16 = iM10059;
                    i15 = iM10058;
                    str6 = str10;
                    c6222 = c6224;
                    iM11306 = (ThreadFactoryC3888.m11306("ᩳۧ") ^ i19) * 29;
                    i2 = ((iM11306 ^ i18) * 22311) ^ 611078948;
                    i3 = 2034600454;
                    i21 = iM11306 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM6229 = zM6229;
                    break;
                case -116540310:
                case 1472997560:
                    if (!C6461.m17652(C1377.m4840(str10, i23))) {
                        c9161 = c9161;
                        zM6229 = zM6229;
                        str9 = str9;
                        z2 = z2;
                        str8 = str8;
                        str7 = str7;
                        iM11306 = (i19 - C19806.m45029("۫ۙ")) * 87;
                        i2 = ((iM11306 ^ i18) * 7707) ^ (-1328149804);
                        i3 = -1342790196;
                        i21 = iM11306 ^ i3;
                        i20 = i2;
                        str7 = str7;
                        c9161 = c9161;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        zM6229 = zM6229;
                    } else {
                        int iM450216 = C19806.m45029("۟ۘ") ^ i18;
                        zM6229 = zM6229;
                        i = ((iM450216 ^ i19) * (-24719)) ^ (-605352120);
                        i21 = iM450216 ^ 1530716754;
                        i20 = i;
                        zM6229 = zM6229;
                    }
                    break;
                case 57796874:
                case 1851551465:
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    try {
                        try {
                            iM10058 = RunnableC3388.m10058(str8);
                            iM10059 = RunnableC3388.m10058(str10);
                            i16 = iM10059;
                            i15 = iM10058;
                            str6 = str10;
                            c6222 = c6224;
                            iM11306 = (ThreadFactoryC3888.m11306("ᩳۧ") ^ i19) * 29;
                            i2 = ((iM11306 ^ i18) * 22311) ^ 611078948;
                            i3 = 2034600454;
                        } catch (NumberFormatException unused) {
                            iM11306 = (i18 - ThreadFactoryC3888.m11306("ܳ᩻")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i2 = ((iM11306 ^ i19) * (-23699)) ^ (-160463866);
                            i3 = -1757019090;
                        }
                    } catch (NumberFormatException unused2) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۢ۟") + i19) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM11306 ^ i18) * 27751) ^ 1937586095;
                        i3 = 24724023;
                    }
                    i21 = iM11306 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM6229 = zM6229;
                    break;
                case 92709166:
                case 1728650204:
                    i22 = 28772;
                    iM11307 = ThreadFactoryC3888.m11306("ܳᩳ") ^ i19;
                    i6 = ((iM11307 ^ i18) * (-19979)) ^ (-565028091);
                    i7 = 1944629244;
                    int i210 = iM11307 ^ i7;
                    strM5516 = strM5516;
                    z3 = z3;
                    zM6229 = zM6229;
                    str12 = str12;
                    c9161 = c9161;
                    i21 = i210;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 157115639:
                case 1554823124:
                    str12 = str12;
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    strM5516 = strM5516;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    c6224 = null;
                    if (selectedItemPosition != 2) {
                        iM450210 = ThreadFactoryC3888.m11306("֨ۚ") ^ i18;
                        i8 = ((iM450210 ^ i19) * 26395) ^ (-1390700886);
                        i9 = -1109629323;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩹ۢ") ^ i19;
                        i8 = ((iM450210 ^ i18) * (-11949)) ^ (-37535811);
                        i9 = -600414939;
                    }
                    int i211 = iM450210 ^ i9;
                    strM5516 = strM5516;
                    zM6229 = zM6229;
                    str12 = str12;
                    str10 = str10;
                    i21 = i211;
                    i20 = i8;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 265874722:
                case 1880746116:
                    str12 = str12;
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    strM5516 = strM5516;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (!zM2909) {
                        strM5516 = str10;
                        int iM450217 = (C19806.m45029("᩹ܽ") ^ i18) * (-9);
                        c9161 = c9161;
                        zM6229 = zM6229;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        String str19 = str12;
                        i21 = iM450217 ^ 1248097681;
                        i20 = ((iM450217 ^ i19) * (-2737)) ^ 1764998132;
                        str12 = str19;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩻᩷") ^ i19;
                        i8 = ((iM450210 ^ i18) * (-27309)) ^ (-258487895);
                        i9 = -1857407471;
                        int i212 = iM450210 ^ i9;
                        strM5516 = strM5516;
                        zM6229 = zM6229;
                        str12 = str12;
                        str10 = str10;
                        i21 = i212;
                        i20 = i8;
                        str7 = str7;
                        c9161 = c9161;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case 417478021:
                case 1452948260:
                    str12 = str12;
                    c9161 = c9161;
                    zM6229 = zM6229;
                    z3 = z3;
                    str9 = str9;
                    strM5516 = strM5516;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (!C2871.m8642()) {
                        iM11307 = C19806.m45029("᩺֡") ^ i18;
                        i6 = ((iM11307 ^ i19) * 2521) ^ (-1319873595);
                        i7 = -738680837;
                        int i213 = iM11307 ^ i7;
                        strM5516 = strM5516;
                        z3 = z3;
                        zM6229 = zM6229;
                        str12 = str12;
                        c9161 = c9161;
                        i21 = i213;
                        i20 = i6;
                        str10 = str10;
                        str7 = str7;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    } else {
                        z3 = z3;
                        iM450210 = (C19806.m45029("ۢۘ") + i18) * (-71);
                        i8 = ((iM450210 ^ i19) * 25983) ^ (-2045705643);
                        i9 = -134598704;
                        int i214 = iM450210 ^ i9;
                        strM5516 = strM5516;
                        zM6229 = zM6229;
                        str12 = str12;
                        str10 = str10;
                        i21 = i214;
                        i20 = i8;
                        str7 = str7;
                        c9161 = c9161;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                    }
                    break;
                case 450659750:
                case 1147121463:
                    str12 = str12;
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    try {
                        strM5516 = strM5516;
                        try {
                            C9751.m24733(c6222Matcher.pattern(), strM5516);
                            str5 = strM5516;
                            c6223 = c6222Matcher;
                            iM450210 = ThreadFactoryC3888.m11306("ܰܶ") ^ i19;
                            i8 = ((iM450210 ^ i18) * 24425) ^ 510027265;
                            i9 = -1235257010;
                        } catch (Exception e) {
                            e = e;
                            exc = e;
                            iM450210 = (ThreadFactoryC3888.m11306("ۗ۟") + i18) * (-75);
                            i8 = ((iM450210 ^ i19) * (-31135)) ^ (-1046163910);
                            i9 = -263471513;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        strM5516 = strM5516;
                    }
                    int i215 = iM450210 ^ i9;
                    strM5516 = strM5516;
                    zM6229 = zM6229;
                    str12 = str12;
                    str10 = str10;
                    i21 = i215;
                    i20 = i8;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 616819853:
                case 2096588166:
                    str12 = str12;
                    c9161 = c9161;
                    zM6229 = zM6229;
                    z3 = z3;
                    str9 = str9;
                    strM5516 = strM5516;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    try {
                        c6222Matcher = C12733.m31638(str8, zM2909, zM29010).matcher((CharSequence) "");
                        iM11307 = (C19806.m45029("ܺۧ") + i18) * 69;
                        i6 = ((iM11307 ^ i19) * (-25657)) ^ (-881123712);
                        i7 = 1298986115;
                    } catch (Exception e3) {
                        exc2 = e3;
                        iM11307 = C19806.m45029("᩹᩹") ^ i18;
                        i6 = ((iM11307 ^ i19) * 13111) ^ (-90535260);
                        i7 = -1605306312;
                    }
                    int i216 = iM11307 ^ i7;
                    strM5516 = strM5516;
                    z3 = z3;
                    zM6229 = zM6229;
                    str12 = str12;
                    c9161 = c9161;
                    i21 = i216;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 675643961:
                case 1779158579:
                    str2 = str12;
                    c9161 = c9161;
                    str3 = str10;
                    zM6229 = zM6229;
                    z2 = z2;
                    str8 = str8;
                    str4 = strM5516;
                    String strM4832 = C1377.m4832(f45606, 180, 1, i22);
                    boolean zM4899 = C1398.m4899(str8, strM4832);
                    str7 = strM4832;
                    strM6105 = C1875.m6105(f45606, 181, 24, i22);
                    if (zM4899) {
                        iM450211 = ThreadFactoryC3888.m11306("ᩴ᩵") ^ i19;
                        i11 = ((iM450211 ^ i18) * 9409) ^ 1256629357;
                        i12 = -1042987434;
                    } else {
                        iM450211 = (C19806.m45029("ۤۨ") + i18) * (-27);
                        i11 = ((iM450211 ^ i19) * 2777) ^ 296140826;
                        i12 = -1294113469;
                    }
                    int i31 = iM450211 ^ i12;
                    strM5516 = str4;
                    zM6229 = zM6229;
                    str12 = str2;
                    i21 = i31;
                    c9161 = c9161;
                    boolean z9 = z2;
                    str9 = strM6105;
                    i20 = i11;
                    str10 = str3;
                    str7 = str7;
                    str8 = str8;
                    z2 = z9;
                    break;
                case 719788922:
                case 913230421:
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    if (!C6461.m17652(C1377.m4840(str8, i23))) {
                        str2 = str12;
                        str3 = str10;
                        strM6105 = str9;
                        str4 = strM5516;
                        iM450211 = (C19806.m45029("ۤۨ") + i18) * (-27);
                        i11 = ((iM450211 ^ i19) * 2777) ^ 296140826;
                        i12 = -1294113469;
                        int i32 = iM450211 ^ i12;
                        strM5516 = str4;
                        zM6229 = zM6229;
                        str12 = str2;
                        i21 = i32;
                        c9161 = c9161;
                        boolean z10 = z2;
                        str9 = strM6105;
                        i20 = i11;
                        str10 = str3;
                        str7 = str7;
                        str8 = str8;
                        z2 = z10;
                    } else {
                        iM11306 = C19806.m45029("ۗۤ") ^ i19;
                        i2 = ((iM11306 ^ i18) * 1603) ^ (-1888126166);
                        i3 = -1240692167;
                        i21 = iM11306 ^ i3;
                        i20 = i2;
                        str7 = str7;
                        c9161 = c9161;
                        str8 = str8;
                        z2 = z2;
                        str9 = str9;
                        zM6229 = zM6229;
                    }
                    break;
                case 745861178:
                case 877808750:
                    str12 = str12;
                    c9161 = c9161;
                    zM6229 = zM6229;
                    z3 = z3;
                    str9 = str9;
                    strM5516 = strM5516;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    short s = f45606[166];
                    int i33 = s + 10727;
                    if ((i33 * i33) - (s * 42908) < 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۢ᩺") ^ i19;
                        i6 = ((iM11307 ^ i18) * 21967) ^ (-57066943);
                        i7 = -2041641465;
                    } else {
                        iM11307 = (i18 - ThreadFactoryC3888.m11306("۫ۡ")) * 59;
                        i6 = ((iM11307 ^ i19) * 7059) ^ (-1882022323);
                        i7 = -1139765804;
                    }
                    int i217 = iM11307 ^ i7;
                    strM5516 = strM5516;
                    z3 = z3;
                    zM6229 = zM6229;
                    str12 = str12;
                    c9161 = c9161;
                    i21 = i217;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 923028737:
                case 1723230146:
                    str12 = str12;
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    strM5516 = strM5516;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    if (zM62210) {
                        iM450210 = ThreadFactoryC3888.m11306("ܳۤ") ^ i19;
                        i8 = ((iM450210 ^ i18) * (-20281)) ^ (-2042963843);
                        i9 = 2028654290;
                    } else {
                        iM450210 = C19806.m45029("ۡ᩵") ^ i19;
                        i8 = ((iM450210 ^ i18) * 19115) ^ (-523760036);
                        i9 = -1677846331;
                    }
                    int i218 = iM450210 ^ i9;
                    strM5516 = strM5516;
                    zM6229 = zM6229;
                    str12 = str12;
                    str10 = str10;
                    i21 = i218;
                    i20 = i8;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 954718822:
                case 1837038194:
                    i22 = 36069;
                    iM11307 = ThreadFactoryC3888.m11306("ܳᩳ") ^ i19;
                    i6 = ((iM11307 ^ i18) * (-19979)) ^ (-565028091);
                    i7 = 1944629244;
                    int i219 = iM11307 ^ i7;
                    strM5516 = strM5516;
                    z3 = z3;
                    zM6229 = zM6229;
                    str12 = str12;
                    c9161 = c9161;
                    i21 = i219;
                    i20 = i6;
                    str10 = str10;
                    str7 = str7;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 1110762109:
                case 1892672732:
                    str12 = str12;
                    c9161 = c9161;
                    zM6229 = zM6229;
                    str9 = str9;
                    strM5516 = strM5516;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    str10 = str10;
                    iM450212 = C19806.m45029(C2704.m8240(f45606, 173, 3, i22)) ^ 2102849374;
                    iM450210 = (ThreadFactoryC3888.m11306("᩸ܿ") + i18) * q.h;
                    i8 = ((iM450210 ^ i19) * (-18387)) ^ 1615591231;
                    i9 = -1478951800;
                    int i2110 = iM450210 ^ i9;
                    strM5516 = strM5516;
                    zM6229 = zM6229;
                    str12 = str12;
                    str10 = str10;
                    i21 = i2110;
                    i20 = i8;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    break;
                case 1146902233:
                case 1564296057:
                    zM6229 = zM6229;
                    str9 = str9;
                    z2 = z2;
                    str8 = str8;
                    iM17646 = C6461.m17646(C1377.m4840(str8, i23));
                    c9161 = c9161;
                    String str20 = str7;
                    if (C1398.m4899(str10, str20)) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۗ") ^ i18) * 41;
                        str7 = str20;
                        i2 = ((iM11306 ^ i19) * 10829) ^ (-248542866);
                        i3 = 250729835;
                    } else {
                        str7 = str20;
                        iM11306 = (i19 - C19806.m45029("۫ۙ")) * 87;
                        i2 = ((iM11306 ^ i18) * 7707) ^ (-1328149804);
                        i3 = -1342790196;
                    }
                    i21 = iM11306 ^ i3;
                    i20 = i2;
                    str7 = str7;
                    c9161 = c9161;
                    str8 = str8;
                    z2 = z2;
                    str9 = str9;
                    zM6229 = zM6229;
                    break;
                case 1367662660:
                case 2054712032:
                    c9161 = c9161;
                    zM6229 = zM6229;
                    String str21 = str9;
                    z2 = z2;
                    str8 = str8;
                    str7 = str7;
                    try {
                        str12 = str12;
                        try {
                            try {
                                str9 = str21;
                                try {
                                    str10 = str10;
                                    try {
                                        strM5516 = CallableC1627.m5516(C2704.m8249(C2704.m8249(C2704.m8249(C2704.m8249(str10, C1398.m4892(f45606, 205, 2, i22), MenuItemOnMenuItemClickListenerC3244.m9715(f45606, 210, 1, i22)), C0278.m1774(f45606, 331, 2, i22), C2642.m8172(f45606, 333, 1, i22)), C1937.m6288(f45606, 337, 2, i22), C0797.m3361(f45606, 339, 1, i22)), C0278.m1774(f45606, 340, 2, i22), C3577.m10571(f45606, 342, 1, i22)), C1398.m4892(f45606, 343, 2, i22), C0216.m1588(f45606, 345, 1, i22));
                                        int iM450218 = (C19806.m45029("᩹ܽ") ^ i18) * (-9);
                                        c9161 = c9161;
                                        zM6229 = zM6229;
                                        str10 = str10;
                                        str7 = str7;
                                        str8 = str8;
                                        z2 = z2;
                                        str9 = str9;
                                        String str110 = str12;
                                        i21 = iM450218 ^ 1248097681;
                                        i20 = ((iM450218 ^ i19) * (-2737)) ^ 1764998132;
                                        str12 = str110;
                                    } catch (Exception e4) {
                                        e = e4;
                                        exc2 = e;
                                        z3 = z3;
                                        strM5516 = strM5516;
                                        iM11307 = C19806.m45029("᩹᩹") ^ i18;
                                        i6 = ((iM11307 ^ i19) * 13111) ^ (-90535260);
                                        i7 = -1605306312;
                                        int i2111 = iM11307 ^ i7;
                                        strM5516 = strM5516;
                                        z3 = z3;
                                        zM6229 = zM6229;
                                        str12 = str12;
                                        c9161 = c9161;
                                        i21 = i2111;
                                        i20 = i6;
                                        str10 = str10;
                                        str7 = str7;
                                        str8 = str8;
                                        z2 = z2;
                                        str9 = str9;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    str10 = str10;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                str10 = str10;
                                str9 = str21;
                                exc2 = e;
                                z3 = z3;
                                strM5516 = strM5516;
                                iM11307 = C19806.m45029("᩹᩹") ^ i18;
                                i6 = ((iM11307 ^ i19) * 13111) ^ (-90535260);
                                i7 = -1605306312;
                                int i2112 = iM11307 ^ i7;
                                strM5516 = strM5516;
                                z3 = z3;
                                zM6229 = zM6229;
                                str12 = str12;
                                c9161 = c9161;
                                i21 = i2112;
                                i20 = i6;
                                str10 = str10;
                                str7 = str7;
                                str8 = str8;
                                z2 = z2;
                                str9 = str9;
                                break;
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        str12 = str12;
                    }
                    break;
                default:
                    C2704.m8256(C1398.m4893(exc));
                    C1977.m6361(c9161);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x018b A[PHI: r0 r3 r20
      0x018b: PHI (r0v4 l.᩷۠ۚ) = (r0v1 l.᩷۠ۚ), (r0v1 l.᩷۠ۚ), (r0v3 l.᩷۠ۚ), (r0v1 l.᩷۠ۚ) binds: [B:46:0x0189, B:38:0x014d, B:23:0x009e, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r3v5 short[]) = (r3v1 short[]), (r3v1 short[]), (r3v4 short[]), (r3v1 short[]) binds: [B:46:0x0189, B:38:0x014d, B:23:0x009e, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r20v3 l.᩷۠ۚ) = (r20v1 l.᩷۠ۚ), (r20v1 l.᩷۠ۚ), (r20v2 l.᩷۠ۚ), (r20v1 l.᩷۠ۚ) binds: [B:46:0x0189, B:38:0x014d, B:23:0x009e, B:16:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0228  */
    /* JADX WARN: Code duplicated, block: B:67:0x0255  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33630(ViewOnClickListenerC13819 viewOnClickListenerC13819, int i, C6222 c6222, boolean z, boolean z2, boolean z3, String str, int i2, int i3, C14558 c14558, boolean z4) {
        int iM45029;
        int i4;
        AbstractC20745 abstractC20745 = null;
        int i5 = 0;
        short[] sArr = null;
        boolean zM26820 = false;
        int i6 = 951483549;
        int i7 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i8 = RunnableC3388.f12514;
        int iM11306 = ThreadFactoryC3888.m11306("᩺֨") ^ i8;
        int i9 = ((iM11306 ^ i7) * (-25997)) ^ (-63727137);
        int i10 = iM11306 ^ 53599137;
        AbstractC20745 abstractC20745M46692 = null;
        while (true) {
            i6 = i10 ^ ((((i6 ^ i7) * 14005) >> 31) & i9);
            switch (i6) {
                case -2117788049:
                case -414797566:
                    if (C1377.m4833() != 0) {
                        iM45029 = C19806.m45029("۫۫") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-20745)) ^ 2023421273;
                        i4 = -457329236;
                    } else {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ۜ᩸")) * (-15);
                        i9 = ((iM45029 ^ i8) * 30651) ^ (-354958533);
                        i4 = 1185401908;
                    }
                    i10 = iM45029 ^ i4;
                    break;
                case -2065236735:
                case -711799109:
                    if (C1460.f5948 >= 0) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ܿۤ")) * (-27);
                        i9 = ((iM45029 ^ i8) * (-13761)) ^ 2125826097;
                        i4 = -164390368;
                    } else {
                        iM45029 = (i8 - C19806.m45029("᩺ۢ")) * (-89);
                        i9 = ((iM45029 ^ i7) * (-12519)) ^ (-1109054417);
                        i4 = -1827754898;
                    }
                    i10 = iM45029 ^ i4;
                    break;
                case -1858957695:
                case 220559872:
                    if (C10634.f36300 >= 0) {
                        iM45029 = C19806.m45029("᩺ۖ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-15007)) ^ 609261156;
                        i4 = -2123272977;
                    } else {
                        iM45029 = (i7 - C19806.m45029("᩷֫")) * 33;
                        i9 = ((iM45029 ^ i8) * 7261) ^ 1743252667;
                        i4 = -1708072761;
                    }
                    i10 = iM45029 ^ i4;
                    break;
                case -1824495336:
                case 527607500:
                    if (C1189.f5284 > 0) {
                        iM45029 = (C19806.m45029("۟֫") ^ i8) * (-75);
                        i9 = ((iM45029 ^ i7) * (-27581)) ^ 467825794;
                        i4 = 1382287091;
                        i10 = iM45029 ^ i4;
                    }
                    iM45029 = (i7 - ThreadFactoryC3888.m11306("᩶۠")) * (-115);
                    i9 = ((iM45029 ^ i8) * 14689) ^ (-2020737331);
                    i4 = 1242164907;
                    i10 = iM45029 ^ i4;
                    break;
                case -1805142973:
                case -343481448:
                    short s = f45606[157];
                    int i11 = s + 8154;
                    int i12 = (s * s) + 66487716;
                    if ((i12 + i12) - (i11 * i11) >= 0) {
                        iM45029 = (C19806.m45029("ܰᩴ") + i7) * 115;
                        i9 = ((iM45029 ^ i8) * 16565) ^ 773700228;
                        i4 = -281133769;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("᩵ܰ") ^ i8) * 81;
                        i9 = ((iM45029 ^ i7) * 12809) ^ (-74619802);
                        i4 = -1179550648;
                    }
                    i10 = iM45029 ^ i4;
                    break;
                case -1657663376:
                case 1384253961:
                    zM26820 = C10634.m26820();
                    iM45029 = C19806.m45029("ۘ᩶") ^ i8;
                    i9 = ((iM45029 ^ i7) * 2909) ^ 1917344950;
                    i4 = -1672698314;
                    i10 = iM45029 ^ i4;
                    break;
                case -1654740752:
                case -767154685:
                    abstractC20745 = viewOnClickListenerC13819.f45607;
                    abstractC20745M46692 = abstractC20745.m46692(RunnableC1564.m5344(f45606, 158, 4, i5));
                    sArr = f45606;
                    if (C2477.m7593() >= 0) {
                        iM45029 = C19806.m45029("۫۫") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-20745)) ^ 2023421273;
                        i4 = -457329236;
                    } else {
                        iM45029 = (C19806.m45029("ܺ֡") + i7) * (-37);
                        i9 = ((iM45029 ^ i8) * 12027) ^ (-1308327092);
                        i4 = 593930487;
                    }
                    i10 = iM45029 ^ i4;
                    break;
                case -1569290144:
                case -230671565:
                    if (C1398.f5802 <= 0) {
                        iM45029 = (C19806.m45029("۟֫") ^ i8) * (-75);
                        i9 = ((iM45029 ^ i7) * (-27581)) ^ 467825794;
                        i4 = 1382287091;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("ۖ֡")) * (-89);
                        i9 = ((iM45029 ^ i7) * (-8605)) ^ (-457338598);
                        i4 = 178700381;
                    }
                    i10 = iM45029 ^ i4;
                    break;
                case -1542583916:
                case 67137442:
                    i5 = 3242;
                    iM45029 = C19806.m45029("ۘۚ") ^ i8;
                    i9 = ((iM45029 ^ i7) * (-20129)) ^ 1323308769;
                    i4 = 1279659198;
                    i10 = iM45029 ^ i4;
                    break;
                case -1282201946:
                case -250718832:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("۫۫") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-20745)) ^ 2023421273;
                        i4 = -457329236;
                        i10 = iM45029 ^ i4;
                    }
                    iM45029 = (i7 - ThreadFactoryC3888.m11306("᩶۠")) * (-115);
                    i9 = ((iM45029 ^ i8) * 14689) ^ (-2020737331);
                    i4 = 1242164907;
                    i10 = iM45029 ^ i4;
                    break;
                case -1084706178:
                case 1271246953:
                    C2332.m7081(new C3358(viewOnClickListenerC13819, abstractC20745.m46733(C0671.m3009(sArr, 162, 4, i5)), c14558, z4, i, c6222, z, z2, str, i2, i3, abstractC20745M46692, z3));
                    break;
                case -1023267433:
                case 384300458:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ܿۤ")) * (-27);
                        i9 = ((iM45029 ^ i8) * (-13761)) ^ 2125826097;
                        i4 = -164390368;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܿܽ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-4695)) ^ (-1145268238);
                        i4 = 1068238237;
                    }
                    i10 = iM45029 ^ i4;
                    break;
                case -887582363:
                case 1182944876:
                    i5 = 49959;
                    iM45029 = C19806.m45029("ۘۚ") ^ i8;
                    i9 = ((iM45029 ^ i7) * (-20129)) ^ 1323308769;
                    i4 = 1279659198;
                    i10 = iM45029 ^ i4;
                    break;
                case 28711295:
                case 1278444499:
                    if (C0962.f3784) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ܿۤ")) * (-27);
                        i9 = ((iM45029 ^ i8) * (-13761)) ^ 2125826097;
                        i4 = -164390368;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽ᩸") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-25631)) ^ (-1655655382);
                        i4 = 1560422131;
                    }
                    i10 = iM45029 ^ i4;
                    break;
                case 38582551:
                case 1338823947:
                    if (zM26820) {
                        iM45029 = (C19806.m45029("۟֫") ^ i8) * (-75);
                        i9 = ((iM45029 ^ i7) * (-27581)) ^ 467825794;
                        i4 = 1382287091;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩳۤ") ^ i7) * (-25);
                        i9 = ((iM45029 ^ i8) * (-22565)) ^ 277574471;
                        i4 = -1810278051;
                    }
                    i10 = iM45029 ^ i4;
                    break;
                case 52323454:
                case 2059245939:
                    RunnableC1895.m6170();
                    RunnableC0195.m1431();
                    iM45029 = (i7 - ThreadFactoryC3888.m11306("᩶۠")) * (-115);
                    i9 = ((iM45029 ^ i8) * 14689) ^ (-2020737331);
                    i4 = 1242164907;
                    i10 = iM45029 ^ i4;
                    break;
                case 371360992:
                case 1995059152:
                    if (C0671.m3008() >= 0) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("᩶۠")) * (-115);
                        i9 = ((iM45029 ^ i8) * 14689) ^ (-2020737331);
                        i4 = 1242164907;
                    } else {
                        iM45029 = C19806.m45029("ܺۧ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-8483)) ^ 1047069991;
                        i4 = -1663769147;
                    }
                    i10 = iM45029 ^ i4;
                    break;
                case 458315185:
                case 1094229942:
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("۫۫") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-20745)) ^ 2023421273;
                        i4 = -457329236;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ܽ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-12097)) ^ 923976278;
                        i4 = 254887163;
                    }
                    i10 = iM45029 ^ i4;
                    break;
                case 1554830462:
                case 1782417305:
                    C1875.m6086();
                    C0278.m1789();
                    break;
                default:
                    C1066.m4023();
                    if (!C0526.f2219) {
                        iM45029 = (i7 - ThreadFactoryC3888.m11306("ܿۤ")) * (-27);
                        i9 = ((iM45029 ^ i8) * (-13761)) ^ 2125826097;
                        i4 = -164390368;
                        i10 = iM45029 ^ i4;
                    }
                    iM45029 = (i7 - ThreadFactoryC3888.m11306("᩶۠")) * (-115);
                    i9 = ((iM45029 ^ i8) * 14689) ^ (-2020737331);
                    i4 = 1242164907;
                    i10 = iM45029 ^ i4;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0388 A[PHI: r18
      0x0388: PHI (r18v36 int) = (r18v5 int), (r18v9 int), (r18v37 int) binds: [B:100:0x0386, B:84:0x02fa, B:25:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x03bb A[PHI: r7 r8 r18
      0x03bb: PHI (r7v3 android.widget.CheckBox) = 
      (r7v2 android.widget.CheckBox)
      (r7v2 android.widget.CheckBox)
      (r7v2 android.widget.CheckBox)
      (r7v4 android.widget.CheckBox)
     binds: [B:104:0x03b9, B:96:0x0368, B:88:0x0319, B:59:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x03bb: PHI (r8v3 android.widget.CheckBox) = 
      (r8v2 android.widget.CheckBox)
      (r8v2 android.widget.CheckBox)
      (r8v2 android.widget.CheckBox)
      (r8v4 android.widget.CheckBox)
     binds: [B:104:0x03b9, B:96:0x0368, B:88:0x0319, B:59:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x03bb: PHI (r18v20 int) = (r18v4 int), (r18v6 int), (r18v8 int), (r18v21 int) binds: [B:104:0x03b9, B:96:0x0368, B:88:0x0319, B:59:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0131 A[PHI: r18
      0x0131: PHI (r18v33 int) = (r18v28 int), (r18v34 int) binds: [B:41:0x011a, B:32:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0279 A[PHI: r18
      0x0279: PHI (r18v18 int) = (r18v14 int), (r18v19 int) binds: [B:70:0x025f, B:63:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x02e1 A[PHI: r3 r4 r18
      0x02e1: PHI (r3v4 int) = (r3v3 int), (r3v2 int) binds: [B:80:0x02c8, B:74:0x0290] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r4v4 int) = (r4v3 int), (r4v2 int) binds: [B:80:0x02c8, B:74:0x0290] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r18v12 int) = (r18v10 int), (r18v13 int) binds: [B:80:0x02c8, B:74:0x0290] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (l.C1461.f5957 > 0) goto L19;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemSelected(android.widget.AdapterView r18, android.view.View r19, int r20, long r21) {
        /*
            Method dump skipped, instruction units count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC13819.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
