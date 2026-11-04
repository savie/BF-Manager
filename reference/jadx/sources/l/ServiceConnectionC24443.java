package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.᩺ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N5VT */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceConnectionC24443 extends AbstractActivityC17204 implements CompoundButton.OnCheckedChangeListener, ServiceConnection {

    /* JADX INFO: renamed from: ֡۫ۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f79354 = {2954, 15836, 15281, -478, 13669, -216, -3822, 25529, 25523, 25520, 25534, 25515, 25526, 25521, 25528, 25472, 25533, 25514, 25515, 25515, 25520, 25521, 25472, 25516, 25515, 25526, 25532, 25524, 25472, 25515, 25520, 25472, 25530, 25531, 25528, 25530, -2921, 15824, 7841, 25530, 25521, 25534, 25533, 25523, 25530, 25472, 25533, 25526, 25521, 25472, 25532, 25520, 25521, 25513, 25530, 25517, 25515, 25530, 25521, 25534, 25533, 25523, 25530, 25472, 25520, 25532, 25515, 25472, 25532, 25520, 25521, 25513, 25530, 25517, 25515, 3509, 16518, -28029, 17624, -30047, -29943, 19559, 25014, -28777, 26561, 32406, -25207, 28913, 6285, 6279, 6276, 6282, 6303, 6274, 6277, 6284, 6324, 6281, 6302, 6303, 6303, 6276, 6277, 6324, 6296, 6303, 6274, 6280, 6272, 6324, 6303, 6276, 6324, 6286, 6287, 6284, 6286, 27795, -25216, 19829, 6286, 6277, 6282, 6281, 6279, 6286, 6324, 6281, 6274, 6277, 6324, 6280, 6276, 6277, 6301, 6286, 6297, 6303, -25737, -27581, 25630, 6286, 6277, 6282, 6281, 6279, 6286, 6324, 6276, 6280, 6303, 6324, 6280, 6276, 6277, 6301, 6286, 6297, 6303, 577, 29767, -28579, 29948, 29655, -29899, 21918, 2209, -24049, -24004, -24003, -24019, -24033, -24005, -24021, -24004, -24009, -24035, -24021, -24006, -24006, -24025, -24032, -24023, -24003};

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f79355 = 0;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public BinderC3559 f79356;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ۙ */
    public final void mo110(C2813 c2813) {
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -460745276;
        int i6 = C3492.f12043;
        int i7 = C2287.f7432;
        int iM2761 = C0619.m2761("۠ۙ") ^ i6;
        int i8 = ((iM2761 ^ i7) * (-27573)) ^ 1982984184;
        int i9 = -1240509325;
        while (true) {
            i5 = ((((i5 ^ i7) * 15021) >> 31) & i8) ^ (iM2761 ^ i9);
            switch (i5) {
                case -2059221208:
                case -1308882973:
                    i2 = i + 1;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0619.m2761("᩸ᩳ") + i6) * (-47);
                        i8 = ((iM2761 ^ i7) * 13059) ^ 2004932885;
                        i9 = 1449256182;
                    } else {
                        iM2761 = (C0619.m2761("۠۫") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM2761 ^ i7) * 6637) ^ 320271050;
                        i9 = 1056175975;
                    }
                    break;
                case -2037654570:
                case -782468822:
                    C1564.m5509();
                    C13473.m33144();
                    return null;
                case -1858698444:
                case 492458661:
                    c = 166;
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0619.m2761("֡ܿ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-6571)) ^ (-722685473);
                        i9 = -1226029242;
                    } else {
                        iM2761 = C0619.m2761("ܰۧ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 15367) ^ 87660029;
                        i9 = 792950382;
                    }
                    break;
                case -1511198901:
                case 1823606563:
                    C3077.m10041();
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0773.m3169("ۢܽ") + i7) * (-41);
                        i8 = ((iM2761 ^ i6) * (-15277)) ^ (-1401439791);
                        i9 = -957761895;
                    } else {
                        iM2761 = (C0619.m2761("᩹᩺") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM2761 ^ i6) * 14461) ^ 1938967423;
                        i9 = 220663520;
                    }
                    break;
                case -1510403261:
                case -665949432:
                    sArr = f79354;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("֡ܿ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-6571)) ^ (-722685473);
                        i9 = -1226029242;
                    } else {
                        iM2761 = (i7 - C0619.m2761("۬ۧ")) * (-123);
                        i8 = ((iM2761 ^ i6) * (-27513)) ^ 1361886294;
                        i9 = 1041921370;
                    }
                    break;
                case -1503649096:
                case 1886100668:
                    i3 = 41550;
                    iM2761 = C0619.m2761("ۜ᩶") ^ i6;
                    i8 = ((iM2761 ^ i7) * 14837) ^ (-1280046107);
                    i9 = -1265159243;
                    break;
                case -1486798746:
                case -1040490463:
                    sArr2 = f79354;
                    i4 = 167;
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("ۢܽ") + i7) * (-41);
                        i8 = ((iM2761 ^ i6) * (-15277)) ^ (-1401439791);
                        i9 = -957761895;
                    } else {
                        iM2761 = C0773.m3169("᩷ᩴ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 29907) ^ 1289235174;
                        i9 = 1616035137;
                    }
                    break;
                case -1353445936:
                case 1459658860:
                    s = sArr[c];
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0619.m2761("᩸ᩳ") + i6) * (-47);
                        i8 = ((iM2761 ^ i7) * 13059) ^ 2004932885;
                        i9 = 1449256182;
                    } else {
                        iM2761 = (C0773.m3169("ۛ֡") + i6) * (-79);
                        i8 = ((iM2761 ^ i7) * (-13993)) ^ 686666181;
                        i9 = -1798296592;
                    }
                    break;
                case -1157763803:
                case 156068379:
                    RunnableC1848.m6360();
                    C1564.m5509();
                    iM2761 = (C0619.m2761("᩹᩺") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i8 = ((iM2761 ^ i6) * 14461) ^ 1938967423;
                    i9 = 220663520;
                    break;
                case -999353929:
                case 1018958460:
                    i3 = 63412;
                    iM2761 = C0619.m2761("ۜ᩶") ^ i6;
                    i8 = ((iM2761 ^ i7) * 14837) ^ (-1280046107);
                    i9 = -1265159243;
                    break;
                case -816251400:
                case 922447089:
                    if (C3734.f12817 < 0) {
                        iM2761 = (C0619.m2761("᩸ᩳ") + i6) * (-47);
                        i8 = ((iM2761 ^ i7) * 13059) ^ 2004932885;
                        i9 = 1449256182;
                    } else {
                        iM2761 = (C0619.m2761("᩹᩺") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM2761 ^ i6) * 14461) ^ 1938967423;
                        i9 = 220663520;
                    }
                    break;
                case -373228520:
                case -76197750:
                    if (C2023.m6964() <= 0) {
                        iM2761 = C0619.m2761("֡ܿ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-6571)) ^ (-722685473);
                        i9 = -1226029242;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ۚۡ")) * 69;
                        i8 = ((iM2761 ^ i7) * (-23669)) ^ 847080752;
                        i9 = 2087156399;
                    }
                    break;
                case -240084800:
                case 58479602:
                    if (RunnableC1848.f6235) {
                        iM2761 = (i6 - C0773.m3169("᩶ۨ")) * 59;
                        i8 = ((iM2761 ^ i7) * 4457) ^ (-1725724916);
                        i9 = 1023120006;
                    } else {
                        iM2761 = (C0619.m2761("᩹᩺") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM2761 ^ i6) * 14461) ^ 1938967423;
                        i9 = 220663520;
                    }
                    break;
                case 222232656:
                case 1114793935:
                    i = s * 2;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("֡ܿ") ^ i7;
                        i8 = ((iM2761 ^ i6) * (-6571)) ^ (-722685473);
                        i9 = -1226029242;
                    } else {
                        iM2761 = (C0773.m3169("ܶۜ") + i7) * q.h;
                        i8 = ((iM2761 ^ i6) * 4415) ^ 1771626829;
                        i9 = 247098651;
                    }
                    break;
                case 284725768:
                case 1763632753:
                    s2 = 1;
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0773.m3169("ۢܽ") + i7) * (-41);
                        i8 = ((iM2761 ^ i6) * (-15277)) ^ (-1401439791);
                        i9 = -957761895;
                    } else {
                        iM2761 = C0773.m3169("֡ۡ") ^ i6;
                        i8 = ((iM2761 ^ i7) * 4557) ^ 1462916230;
                        i9 = 2052041887;
                    }
                    break;
                case 1259015836:
                case 1962358307:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0619.m2761("᩸ᩳ") + i6) * (-47);
                        i8 = ((iM2761 ^ i7) * 13059) ^ 2004932885;
                        i9 = 1449256182;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩵") ^ i6;
                        i8 = ((iM2761 ^ i7) * 20861) ^ 499019484;
                        i9 = 2002112139;
                    }
                    break;
                case 1367251540:
                case 1940352853:
                    return C2878.m9486(sArr2, i4, 17, i3);
                case 1450867344:
                case 1773765942:
                    int i10 = s + s2;
                    if (i2 - (i10 * i10) > 0) {
                        iM2761 = (C0619.m2761("᩶ܺ") ^ i7) * (-91);
                        i8 = ((iM2761 ^ i6) * 13315) ^ 1262243251;
                        i9 = 1142240413;
                    } else {
                        iM2761 = C0619.m2761("ܽܳ") ^ i7;
                        i8 = ((iM2761 ^ i6) * 24591) ^ (-1237905906);
                        i9 = 645356327;
                    }
                    break;
                default:
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0619.m2761("᩸ᩳ") + i6) * (-47);
                        i8 = ((iM2761 ^ i7) * 13059) ^ 2004932885;
                        i9 = 1449256182;
                    } else {
                        iM2761 = (C0773.m3169("᩺ܽ") ^ i7) * (-35);
                        i8 = ((iM2761 ^ i6) * 6631) ^ 1664910111;
                        i9 = -2041018328;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onStop() {
        BinderC3559 binderC3559 = null;
        int i = 145211132;
        int i2 = C2834.f9334;
        int i3 = C3033.f9831;
        int iM3169 = (C0773.m3169("۫ۡ") + i3) * 5;
        int i4 = ((iM3169 ^ i2) * 10637) ^ (-180669868);
        int i5 = 1200058458;
        while (true) {
            i = ((((i ^ i2) * (-7859)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2029561597:
                case 415372080:
                    C2419.m8174();
                    C3077.m10041();
                    break;
                case -1984491432:
                case -1088332341:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("ܶᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3407)) ^ 50366517;
                        i5 = -391941744;
                    } else {
                        iM3169 = C0619.m2761("۫ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 26617) ^ (-23750116);
                        i5 = 875760009;
                    }
                    break;
                case -1795400250:
                case -224842941:
                    break;
                case -1582750644:
                case 2009265448:
                    if (C1826.f6190 <= 0) {
                        iM3169 = C0773.m3169("᩵ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5983) ^ (-812527809);
                        i5 = 1502796547;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۢۛ")) * (-59);
                        i4 = ((iM3169 ^ i3) * 22275) ^ 52766486;
                        i5 = -779412201;
                    }
                    break;
                case -1477820995:
                case 2144473055:
                    C11235.m28309();
                    if (C0269.f1558 > 0) {
                        iM3169 = C0773.m3169("᩵ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5983) ^ (-812527809);
                        i5 = 1502796547;
                    } else {
                        iM3169 = C0773.m3169("ۡۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30041) ^ (-2019857063);
                        i5 = 1152952981;
                    }
                    break;
                case -1425947236:
                case 1364082029:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0773.m3169("ܶᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3407)) ^ 50366517;
                        i5 = -391941744;
                    } else {
                        iM3169 = C0619.m2761("۫ۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18637) ^ (-842368432);
                        i5 = -533117833;
                    }
                    break;
                case -1419487964:
                case 572131524:
                    AbstractC3624.m11755();
                    if (C2287.f7432 < 0) {
                        iM3169 = (C0773.m3169("ۛܽ") + i2) * (-35);
                        i4 = ((iM3169 ^ i3) * 8431) ^ (-931089005);
                        i5 = -1873660403;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֨᩷")) * (-79);
                        i4 = ((iM3169 ^ i3) * 28555) ^ 1774997914;
                        i5 = 259551922;
                    }
                    break;
                case -1351602953:
                case -167029243:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (i2 - C0619.m2761("֨᩷")) * (-79);
                        i4 = ((iM3169 ^ i3) * 28555) ^ 1774997914;
                        i5 = 259551922;
                    } else {
                        iM3169 = (C0773.m3169("᩶᩸") ^ i3) * (-125);
                        i4 = ((iM3169 ^ i2) * (-14701)) ^ (-1195772823);
                        i5 = -302518399;
                    }
                    break;
                case -1307933887:
                case -1160931802:
                    C0950.m3790(this);
                    iM3169 = (C0619.m2761("ܶܳ") + i2) * (-37);
                    i4 = ((iM3169 ^ i3) * (-16259)) ^ (-2104814748);
                    i5 = 2024699100;
                    break;
                case -1236417599:
                case 1487592272:
                    AbstractC0116.m1243();
                    iM3169 = (i2 - C0619.m2761("֨᩷")) * (-79);
                    i4 = ((iM3169 ^ i3) * 28555) ^ 1774997914;
                    i5 = 259551922;
                    break;
                case -1197723897:
                case 1363419636:
                    RunnableC1848.m6360();
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("᩵ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5983) ^ (-812527809);
                        i5 = 1502796547;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֨᩷")) * (-79);
                        i4 = ((iM3169 ^ i3) * 28555) ^ 1774997914;
                        i5 = 259551922;
                    }
                    break;
                case -1077631462:
                case -763438446:
                    binderC3559.m11606();
                    iM3169 = (C0619.m2761("ۤ᩷") ^ i2) * 97;
                    i4 = ((iM3169 ^ i3) * 28791) ^ 2023315570;
                    i5 = 354506049;
                    break;
                case -771616361:
                case 711900413:
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("᩵ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5983) ^ (-812527809);
                        i5 = 1502796547;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۢ") ^ i2) * 65;
                        i4 = ((iM3169 ^ i3) * (-10467)) ^ 2147318568;
                        i5 = -1630594090;
                    }
                    break;
                case -605030520:
                case 1741535453:
                    binderC3559 = this.f79356;
                    if (binderC3559 != null) {
                        iM3169 = (C0773.m3169("ۖۡ") ^ i3) * 77;
                        i4 = ((iM3169 ^ i2) * 26679) ^ 595735507;
                        i5 = -150349633;
                    } else {
                        iM3169 = (C0619.m2761("ۤ᩷") ^ i2) * 97;
                        i4 = ((iM3169 ^ i3) * 28791) ^ 2023315570;
                        i5 = 354506049;
                    }
                    break;
                case -388598438:
                case 2080896414:
                    super.onStop();
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("ܶᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3407)) ^ 50366517;
                        i5 = -391941744;
                    } else {
                        iM3169 = C0619.m2761("ۗ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-29331)) ^ 1187794493;
                        i5 = -682929799;
                    }
                    break;
                case -318043143:
                case 1807664932:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ܶᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3407)) ^ 50366517;
                        i5 = -391941744;
                    } else {
                        iM3169 = C0773.m3169("ܳᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-10801)) ^ (-945035190);
                        i5 = -1767462777;
                    }
                    break;
                case 31077331:
                case 2038067852:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("ܶᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3407)) ^ 50366517;
                        i5 = -391941744;
                    } else {
                        iM3169 = C0773.m3169("ᩴۙ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-21913)) ^ 114205843;
                        i5 = 1696871368;
                    }
                    break;
                case 534920098:
                case 1411891007:
                    if (C2966.m9669(this)) {
                        iM3169 = (C0619.m2761("ܶܳ") + i2) * (-37);
                        i4 = ((iM3169 ^ i3) * (-16259)) ^ (-2104814748);
                        i5 = 2024699100;
                    } else {
                        iM3169 = (C0773.m3169("ۛܺ") + i3) * (-73);
                        i4 = ((iM3169 ^ i2) * (-1687)) ^ 606864656;
                        i5 = 737257550;
                    }
                    break;
                case 949460140:
                case 1155664304:
                    if (C2834.m9344() >= 0) {
                        iM3169 = (C0773.m3169("ۛܽ") + i2) * (-35);
                        i4 = ((iM3169 ^ i3) * 8431) ^ (-931089005);
                        i5 = -1873660403;
                    } else {
                        iM3169 = C0619.m2761("ۙ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15737)) ^ 2134448482;
                        i5 = -465000029;
                    }
                    break;
                default:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("ܶᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-3407)) ^ 50366517;
                        i5 = -391941744;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * 65) ^ 328943426;
                        i5 = 1316355386;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, android.content.ServiceConnection, java.lang.Object, l.ܽ֡֫] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        short[] sArr;
        short[] sArr2;
        CheckBox checkBox;
        int iM2761;
        int i;
        int i2;
        int i3;
        int iM3169;
        int i4;
        int i5;
        int iM31610;
        int i6;
        int iM2762;
        int i7;
        int i8;
        ?? r0 = this;
        int i9 = C1080.f3865;
        int i10 = RunnableC0334.f1808;
        int iM2763 = C0619.m2761("ۚۧ") ^ i9;
        int i11 = ((iM2763 ^ i10) * 1297) ^ (-1066604561);
        View viewM5518 = null;
        CheckBox checkBox2 = null;
        InterfaceC9801 interfaceC9801 = null;
        InterfaceC9801 interfaceC9802 = null;
        InterfaceC9801 interfaceC9803 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i12 = iM2763 ^ 862960779;
        int i13 = 0;
        int i14 = 0;
        int iM31611 = 0;
        int i15 = 0;
        int iM31612 = 0;
        short s = 0;
        int i16 = 0;
        int iM2764 = 0;
        int i17 = 0;
        int i18 = 0;
        int iM2765 = 0;
        int i19 = 0;
        int i20 = -61525668;
        CheckBox checkBox3 = null;
        CheckBox checkBox4 = null;
        short[] sArr7 = null;
        boolean z = false;
        String strM8881 = null;
        int i21 = 0;
        while (true) {
            i20 = i12 ^ (i11 & (((i20 ^ i10) * (-30079)) >> 31));
            switch (i20) {
                case -1908886063:
                case -1585255112:
                    sArr = sArr7;
                    i14 = 6379;
                    iM31610 = C0619.m2761("ܽܽ") ^ i10;
                    i11 = ((iM31610 ^ i9) * (-19549)) ^ 1143843940;
                    i6 = 1520401634;
                    int i22 = iM31610 ^ i6;
                    checkBox2 = checkBox2;
                    sArr4 = sArr4;
                    i12 = i22;
                    r0 = this;
                    short[] sArr8 = sArr3;
                    i18 = i18;
                    sArr6 = sArr6;
                    sArr7 = sArr;
                    i19 = i19;
                    sArr3 = sArr8;
                    break;
                case -1688628276:
                case -1422849451:
                    sArr4 = sArr4;
                    z = false;
                    z = false;
                    RunnableC0334.m2050(checkBox3, C0950.m3781(interfaceC9802, AbstractC0641.m2820(sArr6, i13, 18, i14), false));
                    if (C11235.m28309() == 0) {
                        iM3169 = (C0773.m3169("ܳۘ") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM3169 ^ i10) * (-11205)) ^ (-1495852124);
                        i5 = 1270824683;
                        short[] sArr9 = sArr4;
                        i12 = iM3169 ^ i5;
                        i11 = i4;
                        sArr4 = sArr9;
                    } else {
                        sArr4 = sArr4;
                        iM2762 = C0619.m2761("ܶ᩶") ^ i10;
                        i7 = ((iM2762 ^ i9) * (-15861)) ^ 473747727;
                        i8 = -917845508;
                        i12 = iM2762 ^ i8;
                        i11 = i7;
                    }
                    break;
                case -1669345764:
                case 1864394125:
                    sArr4 = sArr4;
                    checkBox2 = checkBox2;
                    short[] sArr10 = sArr7;
                    sArr6 = sArr6;
                    i18 = i18;
                    sArr3 = sArr3;
                    i19 = i19;
                    sArr = sArr10;
                    super.onCreate(bundle);
                    iM2764 = C0619.m2761(C11235.m28300(f79354, 76, 3, i14));
                    i17 = 2119107978;
                    if (C13473.f42873 != 0) {
                        iM31610 = (C0773.m3169("᩵֨") + i9) * (-21);
                        i11 = ((iM31610 ^ i10) * 21049) ^ 2061758030;
                        i6 = -303240300;
                    } else {
                        iM31610 = C0619.m2761("֫᩷") ^ i10;
                        i11 = ((iM31610 ^ i9) * (-14159)) ^ (-1062757055);
                        i6 = 1835236771;
                    }
                    int i23 = iM31610 ^ i6;
                    checkBox2 = checkBox2;
                    sArr4 = sArr4;
                    i12 = i23;
                    r0 = this;
                    short[] sArr11 = sArr3;
                    i18 = i18;
                    sArr6 = sArr6;
                    sArr7 = sArr;
                    i19 = i19;
                    sArr3 = sArr11;
                    break;
                case -1525849939:
                case -247045114:
                    AbstractC0641.m2813();
                    RunnableC3055.m9933();
                    break;
                case -1495157597:
                case 1109920350:
                    RunnableC3055.m9944(checkBox4, r0);
                    r0.bindService(new Intent((Context) r0, (Class<?>) ServiceC20713.class), r0, z ? 1 : 0);
                    break;
                case -1476283527:
                case 1240503891:
                    sArr4 = sArr4;
                    checkBox3 = (CheckBox) C1564.m5518(r0, iM31611 ^ i15);
                    interfaceC9802 = ApplicationC17729.f58258;
                    sArr6 = f79354;
                    i13 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                    iM3169 = C0773.m3169("ۧܿ") ^ i9;
                    i4 = ((iM3169 ^ i10) * 27997) ^ 1807034074;
                    i5 = 1884782981;
                    short[] sArr12 = sArr4;
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    sArr4 = sArr12;
                    break;
                case -1230917666:
                case 1837327076:
                    sArr4 = sArr4;
                    RunnableC3055.m9944(checkBox3, r0);
                    iM31612 = C0773.m3169(AbstractC3624.m11769(f79354, 138, 3, i14));
                    iM3169 = C0619.m2761("ۡۗ") ^ i10;
                    i4 = ((iM3169 ^ i9) * 14493) ^ 275008893;
                    i5 = -687811449;
                    short[] sArr13 = sArr4;
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    sArr4 = sArr13;
                    break;
                case -1046237017:
                case 1859511369:
                    checkBox2 = (CheckBox) viewM5518;
                    interfaceC9801 = ApplicationC17729.f58258;
                    sArr4 = f79354;
                    i21 = 88;
                    if (C2023.f6737) {
                        iM2762 = C0619.m2761("ܶ᩶") ^ i10;
                        i7 = ((iM2762 ^ i9) * (-15861)) ^ 473747727;
                        i8 = -917845508;
                    } else {
                        iM2762 = C0619.m2761("֨۠") ^ i10;
                        i7 = ((iM2762 ^ i9) * (-3243)) ^ (-1574339825);
                        i8 = 591672876;
                    }
                    i12 = iM2762 ^ i8;
                    i11 = i7;
                    break;
                case -849261812:
                case 398603325:
                    sArr4 = sArr4;
                    checkBox = checkBox2;
                    short[] sArr14 = sArr7;
                    sArr6 = sArr6;
                    int i24 = i19;
                    sArr = sArr14;
                    sArr3 = sArr3;
                    i19 = i24;
                    i18 = i18;
                    iM2765 = C0619.m2761(C13473.m33137(sArr3, i18, 3, i14)) ^ 2127588289;
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("ۗۙ") ^ i9;
                        sArr3 = sArr3;
                        i = ((iM2761 ^ i10) * (-18763)) ^ 1356478434;
                        i2 = 706799628;
                    } else {
                        sArr3 = sArr3;
                        iM2761 = (C0619.m2761("ᩳ֫") ^ i9) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2761 ^ i10) * (-9383)) ^ (-418311346);
                        i2 = 1426072593;
                    }
                    int i25 = iM2761 ^ i2;
                    checkBox2 = checkBox;
                    sArr2 = sArr4;
                    i12 = i25;
                    i11 = i;
                    r0 = r0;
                    sArr4 = sArr2;
                    short[] sArr15 = sArr3;
                    i18 = i18;
                    sArr6 = sArr6;
                    sArr7 = sArr;
                    i19 = i19;
                    sArr3 = sArr15;
                    break;
                case -817640529:
                case -11216083:
                    sArr4 = sArr4;
                    C1519.m5405(checkBox4, C4238.m13535(interfaceC9803, C1826.m6310(f79354, 141, 18, i14), z));
                    iM3169 = C0619.m2761("ۡۙ") ^ i9;
                    i4 = ((iM3169 ^ i10) * 7835) ^ (-41846056);
                    i5 = 2106015315;
                    short[] sArr16 = sArr4;
                    i12 = iM3169 ^ i5;
                    i11 = i4;
                    sArr4 = sArr16;
                    break;
                case -721334374:
                case -197261457:
                    sArr4 = sArr4;
                    int i26 = i19;
                    short[] sArr17 = sArr7;
                    short[] sArr18 = sArr6;
                    C2878.m9476(r0, C0773.m3169(strM8881) ^ 2100978858);
                    short[] sArr19 = f79354;
                    i18 = 82;
                    int iM2766 = C0619.m2761("ۘۤ") ^ i10;
                    int i27 = ((iM2766 ^ i9) * 26863) ^ (-1989639660);
                    i3 = iM2766 ^ 578621950;
                    checkBox2 = checkBox2;
                    sArr3 = sArr19;
                    i11 = i27;
                    sArr6 = sArr18;
                    sArr7 = sArr17;
                    i19 = i26;
                    short[] sArr20 = sArr4;
                    i12 = i3;
                    sArr4 = sArr20;
                    break;
                case -490736034:
                case -31637202:
                    sArr4 = sArr4;
                    checkBox4 = (CheckBox) C2878.m9476(r0, iM31612 ^ 2130022657);
                    interfaceC9803 = ApplicationC17729.f58258;
                    if (C1564.f5401 > 0) {
                        iM3169 = C0773.m3169("ۤܽ") ^ i10;
                        i4 = ((iM3169 ^ i9) * (-22689)) ^ 957418688;
                        i5 = -84088391;
                        short[] sArr110 = sArr4;
                        i12 = iM3169 ^ i5;
                        i11 = i4;
                        sArr4 = sArr110;
                    } else {
                        checkBox2 = checkBox2;
                        short[] sArr21 = sArr7;
                        sArr6 = sArr6;
                        i18 = i18;
                        sArr3 = sArr3;
                        i19 = i19;
                        sArr = sArr21;
                        iM31610 = (C0773.m3169("᩵֨") + i9) * (-21);
                        i11 = ((iM31610 ^ i10) * 21049) ^ 2061758030;
                        i6 = -303240300;
                        int i28 = iM31610 ^ i6;
                        checkBox2 = checkBox2;
                        sArr4 = sArr4;
                        i12 = i28;
                        r0 = this;
                        short[] sArr111 = sArr3;
                        i18 = i18;
                        sArr6 = sArr6;
                        sArr7 = sArr;
                        i19 = i19;
                        sArr3 = sArr111;
                    }
                    break;
                case -446538808:
                case 1979413889:
                    sArr4 = sArr4;
                    checkBox = checkBox2;
                    short[] sArr22 = sArr7;
                    sArr6 = sArr6;
                    int i29 = i19;
                    sArr = sArr22;
                    C16390 c16390 = (C16390) C2878.m9476(r0, iM2765);
                    r0.f56046 = c16390;
                    C11235.m28312(r0, c16390);
                    AbstractC0116.m1238(this);
                    C16390 c16391 = r0.f56046;
                    if (C1519.f5300 < 0) {
                        C3099.m10093(c16391, new ViewOnClickListenerC6543(0, r0));
                        short[] sArr23 = f79354;
                        i19 = 85;
                        if (C3033.f9831 < 0) {
                            int iM31613 = C0773.m3169("۫ۖ") ^ i10;
                            int i30 = ((iM31613 ^ i9) * 29017) ^ (-774380819);
                            i3 = iM31613 ^ 179563780;
                            checkBox2 = checkBox;
                            sArr7 = sArr23;
                            i11 = i30;
                            sArr6 = sArr6;
                            short[] sArr24 = sArr4;
                            i12 = i3;
                            sArr4 = sArr24;
                        } else {
                            sArr = sArr23;
                            sArr3 = sArr3;
                            i18 = i18;
                            i19 = 85;
                        }
                    } else {
                        i19 = i29;
                        i18 = i18;
                    }
                    iM2761 = C0773.m3169("ۗۙ") ^ i9;
                    sArr3 = sArr3;
                    i = ((iM2761 ^ i10) * (-18763)) ^ 1356478434;
                    i2 = 706799628;
                    int i210 = iM2761 ^ i2;
                    checkBox2 = checkBox;
                    sArr2 = sArr4;
                    i12 = i210;
                    i11 = i;
                    r0 = r0;
                    sArr4 = sArr2;
                    short[] sArr112 = sArr3;
                    i18 = i18;
                    sArr6 = sArr6;
                    sArr7 = sArr;
                    i19 = i19;
                    sArr3 = sArr112;
                    break;
                case -403236503:
                case 594829024:
                    sArr = sArr7;
                    i14 = 57025;
                    iM31610 = C0619.m2761("ܽܽ") ^ i10;
                    i11 = ((iM31610 ^ i9) * (-19549)) ^ 1143843940;
                    i6 = 1520401634;
                    int i211 = iM31610 ^ i6;
                    checkBox2 = checkBox2;
                    sArr4 = sArr4;
                    i12 = i211;
                    r0 = this;
                    short[] sArr113 = sArr3;
                    i18 = i18;
                    sArr6 = sArr6;
                    sArr7 = sArr;
                    i19 = i19;
                    sArr3 = sArr113;
                    break;
                case -402050770:
                case 869558987:
                    sArr4 = sArr4;
                    checkBox2 = checkBox2;
                    short[] sArr25 = sArr7;
                    sArr6 = sArr6;
                    i18 = i18;
                    sArr3 = sArr3;
                    i19 = i19;
                    sArr = sArr25;
                    short s2 = f79354[75];
                    int i31 = s2 + 4101;
                    if (!RunnableC0334.m2063()) {
                        int iM2767 = C0619.m2761("ܿۙ") ^ i10;
                        s = s2;
                        i16 = i31;
                        checkBox2 = checkBox2;
                        i11 = ((iM2767 ^ i9) * (-9079)) ^ (-1055319355);
                        r0 = this;
                        sArr2 = sArr4;
                        i12 = iM2767 ^ 1175908995;
                        sArr4 = sArr2;
                        short[] sArr114 = sArr3;
                        i18 = i18;
                        sArr6 = sArr6;
                        sArr7 = sArr;
                        i19 = i19;
                        sArr3 = sArr114;
                    } else {
                        s = s2;
                        i16 = i31;
                        iM31610 = C0773.m3169("᩹ܽ") ^ i10;
                        i11 = ((iM31610 ^ i9) * 4397) ^ (-385529630);
                        i6 = 50282491;
                        int i212 = iM31610 ^ i6;
                        checkBox2 = checkBox2;
                        sArr4 = sArr4;
                        i12 = i212;
                        r0 = this;
                        short[] sArr115 = sArr3;
                        i18 = i18;
                        sArr6 = sArr6;
                        sArr7 = sArr;
                        i19 = i19;
                        sArr3 = sArr115;
                    }
                    break;
                case -390769951:
                case 1057803904:
                    short[] sArr26 = sArr4;
                    short[] sArr27 = sArr7;
                    short[] sArr28 = sArr6;
                    int i32 = i19;
                    viewM5518 = C1564.m5518(r0, C0773.m3169(C3779.m12266(sArr27, i32, 3, i14)) ^ 2124106451);
                    int iM31614 = (C0773.m3169("ۜۢ") ^ i9) * (-95);
                    checkBox2 = checkBox2;
                    i12 = iM31614 ^ 1431450761;
                    i11 = ((iM31614 ^ i10) * 6343) ^ 284215305;
                    sArr4 = sArr26;
                    i19 = i32;
                    sArr6 = sArr28;
                    sArr7 = sArr27;
                    break;
                case -306459843:
                case 256775621:
                    C2287.m7745();
                    if (C13473.f42873 == 0) {
                        iM2762 = C0619.m2761("۫ۧ") ^ i10;
                        i7 = ((iM2762 ^ i9) * (-3789)) ^ (-1227904072);
                        i8 = -870458927;
                        i12 = iM2762 ^ i8;
                        i11 = i7;
                    } else {
                        sArr4 = sArr4;
                        i19 = i19;
                        checkBox = checkBox2;
                        sArr = sArr7;
                        sArr6 = sArr6;
                        i18 = i18;
                        iM2761 = C0773.m3169("ۗۙ") ^ i9;
                        sArr3 = sArr3;
                        i = ((iM2761 ^ i10) * (-18763)) ^ 1356478434;
                        i2 = 706799628;
                        int i213 = iM2761 ^ i2;
                        checkBox2 = checkBox;
                        sArr2 = sArr4;
                        i12 = i213;
                        i11 = i;
                        r0 = r0;
                        sArr4 = sArr2;
                        short[] sArr116 = sArr3;
                        i18 = i18;
                        sArr6 = sArr6;
                        sArr7 = sArr;
                        i19 = i19;
                        sArr3 = sArr116;
                    }
                    break;
                case -242051786:
                case 1940515638:
                    sArr4 = sArr4;
                    checkBox2 = checkBox2;
                    short[] sArr29 = sArr7;
                    sArr6 = sArr6;
                    i18 = i18;
                    sArr3 = sArr3;
                    i19 = i19;
                    sArr = sArr29;
                    int i33 = (s * s) + 16818201;
                    if ((i16 * i16) - (i33 + i33) > 0) {
                        iM31610 = C0773.m3169("ۡ᩺") ^ i9;
                        i11 = ((iM31610 ^ i10) * (-17271)) ^ (-540926969);
                        i6 = -132978767;
                    } else {
                        iM31610 = (i9 - C0773.m3169("ۤ۠")) * 99;
                        i11 = ((iM31610 ^ i10) * (-30973)) ^ 1344573640;
                        i6 = 2042411772;
                    }
                    int i214 = iM31610 ^ i6;
                    checkBox2 = checkBox2;
                    sArr4 = sArr4;
                    i12 = i214;
                    r0 = this;
                    short[] sArr117 = sArr3;
                    i18 = i18;
                    sArr6 = sArr6;
                    sArr7 = sArr;
                    i19 = i19;
                    sArr3 = sArr117;
                    break;
                case -211982177:
                case 385580763:
                    InterfaceC9801 interfaceC9804 = interfaceC9801;
                    CheckBox checkBox5 = checkBox2;
                    RunnableC0334.m2050(checkBox5, C4238.m13535(interfaceC9804, C13473.m33137(sArr4, i21, 29, i14), true));
                    RunnableC3055.m9944(checkBox5, r0);
                    short[] sArr30 = f79354;
                    int iM2768 = C0619.m2761("᩻ۡ") ^ i9;
                    i11 = ((iM2768 ^ i10) * (-2739)) ^ 2051709571;
                    interfaceC9801 = interfaceC9804;
                    sArr5 = sArr30;
                    i12 = iM2768 ^ (-1428730817);
                    checkBox2 = checkBox5;
                    break;
                case -51000013:
                case 1102580113:
                    RunnableC3646.m11813();
                    if (AbstractC0641.f2496 >= 0) {
                        sArr4 = sArr4;
                        checkBox2 = checkBox2;
                        short[] sArr31 = sArr7;
                        sArr6 = sArr6;
                        i18 = i18;
                        sArr3 = sArr3;
                        i19 = i19;
                        sArr = sArr31;
                        iM31610 = C0773.m3169("᩹ܽ") ^ i10;
                        i11 = ((iM31610 ^ i9) * 4397) ^ (-385529630);
                        i6 = 50282491;
                        int i215 = iM31610 ^ i6;
                        checkBox2 = checkBox2;
                        sArr4 = sArr4;
                        i12 = i215;
                        r0 = this;
                        short[] sArr118 = sArr3;
                        i18 = i18;
                        sArr6 = sArr6;
                        sArr7 = sArr;
                        i19 = i19;
                        sArr3 = sArr118;
                    }
                    sArr4 = sArr4;
                    checkBox2 = checkBox2;
                    short[] sArr210 = sArr7;
                    sArr6 = sArr6;
                    i18 = i18;
                    sArr3 = sArr3;
                    i19 = i19;
                    sArr = sArr210;
                    iM31610 = (C0773.m3169("᩵֨") + i9) * (-21);
                    i11 = ((iM31610 ^ i10) * 21049) ^ 2061758030;
                    i6 = -303240300;
                    int i216 = iM31610 ^ i6;
                    checkBox2 = checkBox2;
                    sArr4 = sArr4;
                    i12 = i216;
                    r0 = this;
                    short[] sArr119 = sArr3;
                    i18 = i18;
                    sArr6 = sArr6;
                    sArr7 = sArr;
                    i19 = i19;
                    sArr3 = sArr119;
                    break;
                case 245478810:
                case 1490831680:
                    sArr4 = sArr4;
                    checkBox2 = checkBox2;
                    short[] sArr32 = sArr7;
                    sArr6 = sArr6;
                    i18 = i18;
                    sArr3 = sArr3;
                    i19 = i19;
                    sArr = sArr32;
                    C1564.m5518(r0, iM2764 ^ i17);
                    strM8881 = C2702.m8881(f79354, 79, 3, i14);
                    if (C3492.f12043 <= 0) {
                        iM31610 = C0773.m3169("᩹ܽ") ^ i10;
                        i11 = ((iM31610 ^ i9) * 4397) ^ (-385529630);
                        i6 = 50282491;
                    } else {
                        iM31610 = (C0773.m3169("۬ᩳ") + i9) * (-95);
                        i11 = ((iM31610 ^ i10) * 8253) ^ (-151107979);
                        i6 = 1101857237;
                    }
                    int i217 = iM31610 ^ i6;
                    checkBox2 = checkBox2;
                    sArr4 = sArr4;
                    i12 = i217;
                    r0 = this;
                    short[] sArr1110 = sArr3;
                    i18 = i18;
                    sArr6 = sArr6;
                    sArr7 = sArr;
                    i19 = i19;
                    sArr3 = sArr1110;
                    break;
                case 927202000:
                case 1585274485:
                    if (C2354.f7599 < 0) {
                        sArr4 = sArr4;
                        checkBox2 = checkBox2;
                        short[] sArr211 = sArr7;
                        sArr6 = sArr6;
                        i18 = i18;
                        sArr3 = sArr3;
                        i19 = i19;
                        sArr = sArr211;
                        iM31610 = (C0773.m3169("᩵֨") + i9) * (-21);
                        i11 = ((iM31610 ^ i10) * 21049) ^ 2061758030;
                        i6 = -303240300;
                        int i218 = iM31610 ^ i6;
                        checkBox2 = checkBox2;
                        sArr4 = sArr4;
                        i12 = i218;
                        r0 = this;
                        short[] sArr1111 = sArr3;
                        i18 = i18;
                        sArr6 = sArr6;
                        sArr7 = sArr;
                        i19 = i19;
                        sArr3 = sArr1111;
                    } else {
                        iM2762 = C0619.m2761("۫ۧ") ^ i10;
                        i7 = ((iM2762 ^ i9) * (-3789)) ^ (-1227904072);
                        i8 = -870458927;
                        i12 = iM2762 ^ i8;
                        i11 = i7;
                    }
                    break;
                case 1907499281:
                case 2023453759:
                    sArr4 = sArr4;
                    iM31611 = C0773.m3169(C3734.m12149(sArr5, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i14));
                    i15 = 2127541484;
                    if (C0773.f2792 > 0) {
                        iM3169 = (C0773.m3169("᩶ᩴ") + i10) * 85;
                        i4 = ((iM3169 ^ i9) * (-4331)) ^ 1843232135;
                        i5 = -1876416126;
                        short[] sArr1112 = sArr4;
                        i12 = iM3169 ^ i5;
                        i11 = i4;
                        sArr4 = sArr1112;
                    } else {
                        i19 = i19;
                        checkBox = checkBox2;
                        sArr = sArr7;
                        sArr6 = sArr6;
                        i18 = i18;
                        iM2761 = C0773.m3169("ۗۙ") ^ i9;
                        sArr3 = sArr3;
                        i = ((iM2761 ^ i10) * (-18763)) ^ 1356478434;
                        i2 = 706799628;
                        int i219 = iM2761 ^ i2;
                        checkBox2 = checkBox;
                        sArr2 = sArr4;
                        i12 = i219;
                        i11 = i;
                        r0 = r0;
                        sArr4 = sArr2;
                        short[] sArr1113 = sArr3;
                        i18 = i18;
                        sArr6 = sArr6;
                        sArr7 = sArr;
                        i19 = i19;
                        sArr3 = sArr1113;
                    }
                    break;
                default:
                    C2485.m8357();
                    sArr4 = sArr4;
                    i19 = i19;
                    checkBox = checkBox2;
                    sArr = sArr7;
                    sArr6 = sArr6;
                    i18 = i18;
                    iM2761 = C0773.m3169("ۗۙ") ^ i9;
                    sArr3 = sArr3;
                    i = ((iM2761 ^ i10) * (-18763)) ^ 1356478434;
                    i2 = 706799628;
                    int i2110 = iM2761 ^ i2;
                    checkBox2 = checkBox;
                    sArr2 = sArr4;
                    i12 = i2110;
                    i11 = i;
                    r0 = r0;
                    sArr4 = sArr2;
                    short[] sArr1114 = sArr3;
                    i18 = i18;
                    sArr6 = sArr6;
                    sArr7 = sArr;
                    i19 = i19;
                    sArr3 = sArr1114;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0214 A[PHI: r3 r8 r20 r21
      0x0214: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:63:0x026e, B:55:0x0212, B:31:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:63:0x026e, B:55:0x0212, B:31:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r20v13 int) = (r20v3 int), (r20v5 int), (r20v14 int) binds: [B:63:0x026e, B:55:0x0212, B:31:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x0214: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char) binds: [B:63:0x026e, B:55:0x0212, B:31:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0271 A[PHI: r1 r3 r4 r5 r8 r21
      0x0271: PHI (r1v44 int) = (r1v33 int), (r1v2 int), (r1v48 int) binds: [B:56:0x0214, B:27:0x00d3, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r3v5 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:56:0x0214, B:27:0x00d3, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:56:0x0214, B:27:0x00d3, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r5v3 short[]) = (r5v2 short[]), (r5v2 short[]), (r5v4 short[]) binds: [B:56:0x0214, B:27:0x00d3, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r8v5 int) = (r8v4 int), (r8v2 int), (r8v2 int) binds: [B:56:0x0214, B:27:0x00d3, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r21v6 char) = (r21v5 char), (r21v3 char), (r21v3 char) binds: [B:56:0x0214, B:27:0x00d3, B:6:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x02a9 A[PHI: r2 r9 r10 r11 r13 r14 r15 r16 r20
      0x02a9: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v3 int), (r2v2 int) binds: [B:68:0x02a7, B:51:0x01f0, B:40:0x0165, B:36:0x0140, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:68:0x02a7, B:51:0x01f0, B:40:0x0165, B:36:0x0140, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:68:0x02a7, B:51:0x01f0, B:40:0x0165, B:36:0x0140, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:68:0x02a7, B:51:0x01f0, B:40:0x0165, B:36:0x0140, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:68:0x02a7, B:51:0x01f0, B:40:0x0165, B:36:0x0140, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:68:0x02a7, B:51:0x01f0, B:40:0x0165, B:36:0x0140, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:68:0x02a7, B:51:0x01f0, B:40:0x0165, B:36:0x0140, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:68:0x02a7, B:51:0x01f0, B:40:0x0165, B:36:0x0140, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r20v16 int) = (r20v2 int), (r20v6 int), (r20v11 int), (r20v12 int), (r20v17 int) binds: [B:68:0x02a7, B:51:0x01f0, B:40:0x0165, B:36:0x0140, B:11:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC17204, l.ActivityC3409, android.app.Activity
    public final void onPause() {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        int i4;
        int i5 = C3690.f12684;
        int i6 = C2419.f7754;
        int iM2762 = C0619.m2761("ۗۡ") ^ i5;
        int i7 = ((iM2762 ^ i6) * 5403) ^ 1214180596;
        String strM9847 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM2762 ^ 1549167877;
        int i9 = 0;
        int iM2763 = 0;
        int iM31610 = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = -563825173;
        char c = 0;
        while (true) {
            i17 = i8 ^ (i7 & (((i17 ^ i6) * (-1519)) >> 31));
            switch (i17) {
                case -1774215745:
                case -679245091:
                    C1146.m4231();
                    C3077.m10041();
                    break;
                case -1751686209:
                case -567793868:
                    C2310.m7813();
                    C0950.m3785();
                    iM3169 = C0619.m2761("ۚܳ") ^ i5;
                    i3 = ((iM3169 ^ i6) * (-13985)) ^ 180628943;
                    i4 = -1463023802;
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case -1712443049:
                case 155221868:
                    i9 = i9;
                    iM2763 = C0619.m2761(C1519.m5399(sArr2, i15, i16, i14));
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ۚ᩻") ^ i6;
                        i = ((iM2761 ^ i5) * (-15453)) ^ (-1224361237);
                        i2 = -782572259;
                    } else {
                        iM2761 = C0619.m2761("ܰۨ") ^ i6;
                        i = ((iM2761 ^ i5) * 8229) ^ (-219863080);
                        i2 = -1144785062;
                    }
                    int i18 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i18;
                    break;
                case -1687872962:
                case 296603376:
                    iM31610 = C0773.m3169(strM9847);
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("ᩳۛ") ^ i5;
                        i9 = i9;
                        i = ((iM2761 ^ i6) * 1227) ^ (-1621185466);
                        i2 = 117297963;
                    } else {
                        iM2761 = C0619.m2761("ᩴ۠") ^ i6;
                        i9 = i9;
                        i = ((iM2761 ^ i5) * 13305) ^ 1493947975;
                        i2 = 1837914196;
                    }
                    int i19 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i19;
                    break;
                case -1550053856:
                case -844830812:
                    i14 = 2559;
                    iM2761 = (C0773.m3169("ۙۖ") ^ i6) * 91;
                    i = ((iM2761 ^ i5) * (-1461)) ^ (-862670459);
                    i2 = 1438077069;
                    int i110 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i110;
                    break;
                case -1505755957:
                case -1312562148:
                    i14 = 5455;
                    iM2761 = (C0773.m3169("ۙۖ") ^ i6) * 91;
                    i = ((iM2761 ^ i5) * (-1461)) ^ (-862670459);
                    i2 = 1438077069;
                    int i111 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i111;
                    break;
                case -1488597802:
                case -1211774924:
                    i9 = i9;
                    i10 = s + 9912;
                    if (C0862.f3233 != 0) {
                        i9 = i9;
                        iM2761 = C0619.m2761("ᩳۛ") ^ i5;
                        i9 = i9;
                        i = ((iM2761 ^ i6) * 1227) ^ (-1621185466);
                        i2 = 117297963;
                    } else {
                        iM2761 = C0773.m3169("᩻ܺ") ^ i5;
                        i = ((iM2761 ^ i6) * 3747) ^ (-728093775);
                        i2 = -414016091;
                    }
                    int i112 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i112;
                    break;
                case -1443201388:
                case -643637030:
                    i9 = i9;
                    i11 = i10 * i10;
                    i12 = s * s;
                    i13 = 98247744;
                    if (C1321.m4852()) {
                        iM2761 = C0619.m2761("ᩴ֡") ^ i6;
                        i = ((iM2761 ^ i5) * 6559) ^ 195771743;
                        i2 = 1737616742;
                    } else {
                        iM2761 = C0619.m2761("ۚ᩻") ^ i6;
                        i = ((iM2761 ^ i5) * (-15453)) ^ (-1224361237);
                        i2 = -782572259;
                    }
                    int i113 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i113;
                    break;
                case -803869321:
                case 1704112093:
                    i9 = i9;
                    c = 159;
                    if (C20932.f66974 <= 0) {
                        i9 = i9;
                        iM2761 = C0619.m2761("ᩳۛ") ^ i5;
                        i9 = i9;
                        i = ((iM2761 ^ i6) * 1227) ^ (-1621185466);
                        i2 = 117297963;
                    } else {
                        iM2761 = C0773.m3169("ۖۜ") ^ i6;
                        i = ((iM2761 ^ i5) * (-31763)) ^ (-668907471);
                        i2 = 1565038739;
                    }
                    int i114 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i114;
                    break;
                case -717257761:
                case 1432434002:
                    i9 = i9;
                    s = sArr[c];
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("۟ۢ") + i6) * 71;
                        i = ((iM2761 ^ i5) * (-335)) ^ 1277013536;
                        i2 = -45261038;
                    } else {
                        iM2761 = (i6 - C0773.m3169("֡ܽ")) * (-9);
                        i = ((iM2761 ^ i5) * 20149) ^ 631158376;
                        i2 = -1802151660;
                    }
                    int i115 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i115;
                    break;
                case -673111264:
                case 2118157994:
                    i9 = i9;
                    sArr2 = f79354;
                    i15 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                    i16 = 3;
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("ۚ᩻") ^ i6;
                        i = ((iM2761 ^ i5) * (-15453)) ^ (-1224361237);
                        i2 = -782572259;
                    } else {
                        iM2761 = (C0773.m3169("᩺ᩴ") + i5) * (-101);
                        i = ((iM2761 ^ i6) * (-32065)) ^ 1863086711;
                        i2 = -1319714199;
                    }
                    int i116 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i116;
                    break;
                case -436690126:
                case 685790371:
                    overridePendingTransition(i9, 2128331487 ^ iM31610);
                    super.onPause();
                    break;
                case -270199487:
                case 2066360839:
                    i9 = i9;
                    int i20 = i12 + i13;
                    if (i11 - (i20 + i20) > 0) {
                        iM2761 = C0619.m2761("֨ۜ") ^ i5;
                        i = ((iM2761 ^ i6) * 24669) ^ (-177785231);
                        i2 = -1892674744;
                    } else {
                        iM2761 = C0773.m3169("᩸۫") ^ i5;
                        i = ((iM2761 ^ i6) * 27571) ^ 845805439;
                        i2 = -1653836749;
                    }
                    int i117 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i117;
                    break;
                case 437771843:
                case 1823755046:
                    i9 = i9;
                    strM9847 = C3033.m9847(sArr3, 163, 3, i14);
                    if (C3448.m11248() != 0) {
                        i9 = i9;
                        iM2761 = C0619.m2761("ᩳۛ") ^ i5;
                        i9 = i9;
                        i = ((iM2761 ^ i6) * 1227) ^ (-1621185466);
                        i2 = 117297963;
                    } else {
                        iM2761 = (i5 - C0773.m3169("᩻᩵")) * (-121);
                        i = ((iM2761 ^ i6) * (-5101)) ^ (-949097170);
                        i2 = -604798700;
                    }
                    int i118 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i118;
                    break;
                case 608106025:
                case 1718397154:
                    if (C3492.m11488()) {
                        iM3169 = (C0773.m3169("᩻ۢ") + i5) * 61;
                        i3 = ((iM3169 ^ i6) * 30189) ^ (-1605748186);
                        i4 = -1758678540;
                    } else {
                        iM3169 = C0619.m2761("ۚܳ") ^ i5;
                        i3 = ((iM3169 ^ i6) * (-13985)) ^ 180628943;
                        i4 = -1463023802;
                    }
                    i8 = iM3169 ^ i4;
                    i7 = i3;
                    break;
                case 833381499:
                case 1655043727:
                    i9 = i9;
                    sArr = f79354;
                    if (RunnableC3055.m9933() != 0) {
                        iM2761 = C0619.m2761("ۚ᩻") ^ i6;
                        i = ((iM2761 ^ i5) * (-15453)) ^ (-1224361237);
                        i2 = -782572259;
                    } else {
                        iM2761 = C0619.m2761("ۚۙ") ^ i5;
                        i = ((iM2761 ^ i6) * (-22247)) ^ 1647367783;
                        i2 = -286886104;
                    }
                    int i119 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i119;
                    break;
                case 940419203:
                case 2077893683:
                    AbstractC0116.m1243();
                    if (C3779.f12953 > 0) {
                        i9 = i9;
                        iM2761 = C0619.m2761("ۚ᩻") ^ i6;
                        i = ((iM2761 ^ i5) * (-15453)) ^ (-1224361237);
                        i2 = -782572259;
                        int i1110 = i9;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                        i9 = i1110;
                    }
                    i9 = i9;
                    iM2761 = (C0773.m3169("۟ۢ") + i6) * 71;
                    i = ((iM2761 ^ i5) * (-335)) ^ 1277013536;
                    i2 = -45261038;
                    int i1111 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i1111;
                    break;
                case 1177617052:
                case 1496173174:
                    C20932.m47848();
                    if (C1542.f5343 <= 0) {
                        i9 = i9;
                        iM2761 = (C0773.m3169("۟ۢ") + i6) * 71;
                        i = ((iM2761 ^ i5) * (-335)) ^ 1277013536;
                        i2 = -45261038;
                        int i1112 = i9;
                        i8 = iM2761 ^ i2;
                        i7 = i;
                        i9 = i1112;
                    } else {
                        iM3169 = C0619.m2761("ۚܳ") ^ i5;
                        i3 = ((iM3169 ^ i6) * (-13985)) ^ 180628943;
                        i4 = -1463023802;
                        i8 = iM3169 ^ i4;
                        i7 = i3;
                    }
                    break;
                default:
                    i9 = iM2763 ^ 2129266503;
                    sArr3 = f79354;
                    if (C2354.m7983()) {
                        iM2761 = C0619.m2761("ۛ᩷") ^ i6;
                        i9 = i9;
                        i = ((iM2761 ^ i5) * (-9791)) ^ 464663027;
                        i2 = -1839140555;
                    } else {
                        iM2761 = C0619.m2761("ᩳۛ") ^ i5;
                        i9 = i9;
                        i = ((iM2761 ^ i6) * 1227) ^ (-1621185466);
                        i2 = 117297963;
                    }
                    int i1113 = i9;
                    i8 = iM2761 ^ i2;
                    i7 = i;
                    i9 = i1113;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unbindService(this);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0321 A[PHI: r3 r5 r7 r15 r22
      0x0321: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:76:0x031f, B:45:0x01c4, B:35:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x0321: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:76:0x031f, B:45:0x01c4, B:35:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x0321: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:76:0x031f, B:45:0x01c4, B:35:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x0321: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:76:0x031f, B:45:0x01c4, B:35:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x0321: PHI (r22v9 short) = (r22v8 short), (r22v3 short), (r22v3 short) binds: [B:76:0x031f, B:45:0x01c4, B:35:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
    
        if (l.C0619.f2439 != false) goto L15;
     */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCheckedChanged(android.widget.CompoundButton r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ServiceConnectionC24443.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BinderC3559 binderC3559 = null;
        int i = -1814003647;
        int i2 = C3734.f12817;
        int i3 = C2419.f7754;
        int iM3169 = C0773.m3169("۟ۙ") ^ i2;
        int i4 = ((iM3169 ^ i3) * 21065) ^ (-1184148409);
        int i5 = -905497214;
        while (true) {
            i = ((((i ^ i3) * (-14289)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1756452711:
                case -1605513035:
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0619.m2761("᩵ۚ") ^ i3) * 5;
                        i4 = ((iM3169 ^ i2) * 20249) ^ (-1641316240);
                        i5 = -1759754314;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩷֨")) * (-99);
                        i4 = ((iM3169 ^ i3) * 2693) ^ 477243;
                        i5 = 995739969;
                    }
                    break;
                case -1593356431:
                case -740507094:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("ᩳ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16745)) ^ 547720547;
                        i5 = 1908326129;
                    } else {
                        iM3169 = C0773.m3169("᩸ܳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14101)) ^ (-508207887);
                        i5 = 1289815775;
                    }
                    break;
                case -1312032987:
                case 784706936:
                    if (C3779.m12264()) {
                        iM3169 = C0619.m2761("᩵ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13479)) ^ 1308774062;
                        i5 = 523915890;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۚ") ^ i3) * 5;
                        i4 = ((iM3169 ^ i2) * 20249) ^ (-1641316240);
                        i5 = -1759754314;
                    }
                    break;
                case -1186814984:
                case 1625705033:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("ۘܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27969)) ^ 396135513;
                        i5 = 1121548900;
                    } else {
                        iM3169 = (C0773.m3169("ܺۚ") + i2) * 9;
                        i4 = ((iM3169 ^ i3) * 767) ^ (-599598787);
                        i5 = 297742956;
                    }
                    break;
                case -1186769544:
                case -458408405:
                    if (C3099.f10023 > 0) {
                        iM3169 = C0619.m2761("ۘܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27969)) ^ 396135513;
                        i5 = 1121548900;
                    } else {
                        iM3169 = C0619.m2761("۬ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13417) ^ (-1062104253);
                        i5 = 1169004009;
                    }
                    break;
                case -1022821474:
                case 1778970097:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0619.m2761("᩵ۚ") ^ i3) * 5;
                        i4 = ((iM3169 ^ i2) * 20249) ^ (-1641316240);
                        i5 = -1759754314;
                    } else {
                        iM3169 = C0619.m2761("ܰۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 1687) ^ 361118260;
                        i5 = 2052928669;
                    }
                    break;
                case -943034321:
                case 1028957053:
                    C1080.m4050();
                    C13473.m33144();
                    break;
                case -792885720:
                case 910191016:
                    C17202.m40372();
                    AbstractC0116.m1243();
                    iM3169 = (C0619.m2761("᩵ۚ") ^ i3) * 5;
                    i4 = ((iM3169 ^ i2) * 20249) ^ (-1641316240);
                    i5 = -1759754314;
                    break;
                case -638389283:
                case 926537716:
                    if (RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("ۘܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27969)) ^ 396135513;
                        i5 = 1121548900;
                    } else {
                        iM3169 = C0619.m2761("ᩴۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 13575) ^ 334235281;
                        i5 = 968821832;
                    }
                    break;
                case -422251268:
                case 457127209:
                    this.f79356 = binderC3559;
                    binderC3559.m11603();
                    this.f79356.m11604();
                    break;
                case -232124253:
                case 543577398:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ᩴۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9257) ^ (-449578571);
                        i5 = -659978019;
                    } else {
                        iM3169 = C0619.m2761("۫ۨ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 7465) ^ 179086533;
                        i5 = 873946261;
                    }
                    break;
                case -194931675:
                case 740315149:
                    binderC3559 = (BinderC3559) iBinder;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("ᩴۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 9257) ^ (-449578571);
                        i5 = -659978019;
                    } else {
                        iM3169 = (C0619.m2761("ᩳܳ") ^ i3) * 13;
                        i4 = ((iM3169 ^ i2) * (-22573)) ^ 1699319444;
                        i5 = -154169461;
                    }
                    break;
                case 17031061:
                case 1395926228:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("ᩳ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16745)) ^ 547720547;
                        i5 = 1908326129;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۡ۬")) * (-83);
                        i4 = ((iM3169 ^ i2) * 3609) ^ 77935381;
                        i5 = 41638317;
                    }
                    break;
                case 1118973143:
                case 1595351265:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("ۘܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-27969)) ^ 396135513;
                        i5 = 1121548900;
                    } else {
                        iM3169 = (C0773.m3169("ܳۜ") + i2) * 37;
                        i4 = ((iM3169 ^ i3) * 27773) ^ (-1113595711);
                        i5 = -658832162;
                    }
                    break;
                case 1356690362:
                case 2037469825:
                    C2287.m7745();
                    if (!C13473.m33144()) {
                        iM3169 = C0619.m2761("۬ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13417) ^ (-1062104253);
                        i5 = 1169004009;
                    } else {
                        iM3169 = C0619.m2761("ᩳ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-16745)) ^ 547720547;
                        i5 = 1908326129;
                    }
                    break;
                default:
                    if (C4282.f15546 > 0) {
                        iM3169 = C0619.m2761("۬ۤ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13417) ^ (-1062104253);
                        i5 = 1169004009;
                    } else {
                        iM3169 = (C0619.m2761("᩵ۚ") ^ i3) * 5;
                        i4 = ((iM3169 ^ i2) * 20249) ^ (-1641316240);
                        i5 = -1759754314;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f79356 = null;
    }
}
