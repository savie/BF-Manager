package l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۨۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G2S4 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC11405 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܽۢ᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f38407 = {9460, 2753, 10650, 7626, 8605, -6691, 6128, 753, 11712, -4213, -397, -2288, 4374, 1918, 16325, 5782};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f38408;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f38409;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18419 f38410;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f38411;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5054 f38412;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f38413;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C18419 c18419 = null;
        String strM6281 = null;
        ImageView imageView = null;
        Drawable drawable = null;
        boolean z = false;
        ActivityC5054 activityC5054 = null;
        int i = 1114756570;
        int i2 = C1875.f7103;
        int i3 = C2788.f10625;
        int iM45029 = C19806.m45029("᩶֡") ^ i2;
        int i4 = ((iM45029 ^ i3) * 29575) ^ 919509124;
        int i5 = -2029779088;
        while (true) {
            i = ((((i ^ i3) * (-15691)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2047045792:
                case 1964081534:
                    C3743.m10966();
                    if (C1066.f4915 > 0) {
                        iM45029 = C19806.m45029("۬۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31955) ^ 1928901962;
                        i5 = -1480621638;
                    } else {
                        iM45029 = C19806.m45029("ܿۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8945) ^ (-1262129159);
                        i5 = 768577060;
                    }
                    break;
                case -1822554232:
                case 1813020918:
                    c18419 = this.f38410;
                    if (C0278.f1572 <= 0) {
                        iM45029 = C19806.m45029("۬۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31955) ^ 1928901962;
                        i5 = -1480621638;
                    } else {
                        iM45029 = (C19806.m45029("ܺ᩹") + i3) * (-75);
                        i4 = ((iM45029 ^ i2) * 10663) ^ (-201760997);
                        i5 = -1782721934;
                    }
                    break;
                case -1694064340:
                case 934849267:
                    C0278.m1789();
                    C2249.m6915();
                    iM45029 = C19806.m45029("ܽۛ") ^ i3;
                    i4 = ((iM45029 ^ i2) * (-16733)) ^ (-24836173);
                    i5 = -245261359;
                    break;
                case -1607263573:
                case -956400908:
                    C3660.m10791();
                    if (!C0817.m3399()) {
                        iM45029 = C19806.m45029("ܽۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16733)) ^ (-24836173);
                        i5 = -245261359;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙᩳ") ^ i2) * 3;
                        i4 = ((iM45029 ^ i3) * 3905) ^ (-985656180);
                        i5 = 1519605353;
                    }
                    break;
                case -1520662253:
                case 2024443778:
                    if (C1668.m5583()) {
                        iM45029 = C19806.m45029("᩻ܰ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-26429)) ^ (-873764337);
                        i5 = 955309061;
                    } else {
                        iM45029 = C19806.m45029("ܽۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16733)) ^ (-24836173);
                        i5 = -245261359;
                    }
                    break;
                case -1464720612:
                case -955645333:
                    strM6281 = C1937.m6281(c18419);
                    imageView = this.f38413;
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = C19806.m45029("ܰۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1289)) ^ (-1636129499);
                        i5 = 1343389712;
                    } else {
                        iM45029 = C19806.m45029("᩹ܳ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 25709) ^ (-1557300916);
                        i5 = 933177820;
                    }
                    break;
                case -1266785877:
                case -685956420:
                    activityC5054 = this.f38412;
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("ܿۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8945) ^ (-1262129159);
                        i5 = 768577060;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۘ᩷") ^ i3) * (-53);
                        i4 = ((iM45029 ^ i2) * (-27515)) ^ 641377266;
                        i5 = 2090750347;
                    }
                    break;
                case -920171160:
                case 1495721244:
                    ActivityC5760.m15860(activityC5054, strM6281, drawable, z, activityC5054.f17632);
                    break;
                case -742198339:
                case 702294904:
                    if (C1189.f5284 <= 0) {
                        iM45029 = C19806.m45029("ܽۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16733)) ^ (-24836173);
                        i5 = -245261359;
                    } else {
                        iM45029 = (C19806.m45029("᩷᩶") ^ i3) * (-33);
                        i4 = ((iM45029 ^ i2) * 20613) ^ (-1523299556);
                        i5 = 5069345;
                    }
                    break;
                case -671922604:
                case -380631431:
                    if (C2332.f8260) {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i3;
                        i4 = ((iM45029 ^ i2) * 14043) ^ (-961208885);
                        i5 = 135995572;
                    } else {
                        iM45029 = C19806.m45029("ܽۛ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-16733)) ^ (-24836173);
                        i5 = -245261359;
                    }
                    break;
                case -592641621:
                case 2139470442:
                    drawable = imageView.getDrawable();
                    z = false;
                    if (C3535.f13026 <= 0) {
                        iM45029 = C19806.m45029("ܰۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1289)) ^ (-1636129499);
                        i5 = 1343389712;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠᩸") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-29851)) ^ (-1142092904);
                        i5 = 1599053214;
                    }
                    break;
                case -403334123:
                case 1917957651:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۙᩳ") ^ i2) * 3;
                        i4 = ((iM45029 ^ i3) * 3905) ^ (-985656180);
                        i5 = 1519605353;
                    } else {
                        iM45029 = C19806.m45029("ܿۜ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 8945) ^ (-1262129159);
                        i5 = 768577060;
                    }
                    break;
                case 168988226:
                case 1815489846:
                    if (C1668.m5583()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܿ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 1981) ^ (-1944112441);
                        i5 = -698978437;
                    } else {
                        iM45029 = C19806.m45029("ܰۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1289)) ^ (-1636129499);
                        i5 = 1343389712;
                    }
                    break;
                case 613389881:
                case 1481173605:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C3286.m9798();
                    break;
                case 903033342:
                case 1030203294:
                    if (C2704.f10408) {
                        iM45029 = C19806.m45029("᩻ܳ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-30093)) ^ 1150437716;
                        i5 = 1019072695;
                    } else {
                        iM45029 = C19806.m45029("۬۫") ^ i3;
                        i4 = ((iM45029 ^ i2) * 31955) ^ 1928901962;
                        i5 = -1480621638;
                    }
                    break;
                default:
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = C19806.m45029("ܰۖ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-1289)) ^ (-1636129499);
                        i5 = 1343389712;
                    } else {
                        iM45029 = (i2 - C19806.m45029("֨֫")) * (-11);
                        i4 = ((iM45029 ^ i3) * (-31621)) ^ (-1027691875);
                        i5 = -1673436880;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:51:0x01d1 A[PHI: r5 r12 r13 r14 r15 r18
      0x01d1: PHI (r5v5 android.widget.TextView) = 
      (r5v2 android.widget.TextView)
      (r5v2 android.widget.TextView)
      (r5v2 android.widget.TextView)
      (r5v2 android.widget.TextView)
      (r5v4 android.widget.TextView)
      (r5v2 android.widget.TextView)
     binds: [B:50:0x01cf, B:46:0x01a7, B:38:0x0149, B:34:0x0122, B:30:0x0100, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:50:0x01cf, B:46:0x01a7, B:38:0x0149, B:34:0x0122, B:30:0x0100, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:50:0x01cf, B:46:0x01a7, B:38:0x0149, B:34:0x0122, B:30:0x0100, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:50:0x01cf, B:46:0x01a7, B:38:0x0149, B:34:0x0122, B:30:0x0100, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:50:0x01cf, B:46:0x01a7, B:38:0x0149, B:34:0x0122, B:30:0x0100, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01d1: PHI (r18v4 android.view.View) = 
      (r18v3 android.view.View)
      (r18v2 android.view.View)
      (r18v2 android.view.View)
      (r18v2 android.view.View)
      (r18v2 android.view.View)
      (r18v2 android.view.View)
     binds: [B:50:0x01cf, B:46:0x01a7, B:38:0x0149, B:34:0x0122, B:30:0x0100, B:10:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0210 A[PHI: r7
      0x0210: PHI (r7v5 java.lang.String) = 
      (r7v3 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:54:0x020e, B:20:0x009b, B:17:0x0080, B:10:0x0070, B:83:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC11405(ActivityC5054 activityC5054, View view) {
        int iM45029;
        int i;
        int iM11306;
        int iM450210;
        int i2;
        int i3;
        super(view);
        int i4 = C1189.f5284;
        int i5 = C1460.f5948;
        short s = f38407[0];
        int i6 = s + 11798;
        int i7 = (s * s) + 139192804;
        int i8 = (i7 + i7) - (i6 * i6) < 0 ? 62000 : 28936;
        this.f38412 = activityC5054;
        int iM11307 = (i5 - ThreadFactoryC3888.m11306("ۜۧ")) * 79;
        int i9 = ((iM11307 ^ i4) * (-14769)) ^ 137015478;
        int i10 = iM11307 ^ (-1407883401);
        String strM6241 = null;
        short[] sArr = null;
        int i11 = 0;
        TextView textView = null;
        int iM11308 = 0;
        int i12 = 0;
        int iM11309 = 0;
        int i13 = 0;
        int i14 = 0;
        View viewM8167 = null;
        int i15 = -1505653741;
        View viewM8168 = null;
        short[] sArr2 = null;
        int i16 = 0;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i4) * 3883) >> 31));
            switch (i15) {
                case -2001216475:
                case -493030772:
                    if (C3535.f13026 <= 0) {
                        iM11306 = i11;
                        iM450210 = C19806.m45029("᩹᩸") ^ i4;
                        i2 = ((iM450210 ^ i5) * 28469) ^ (-441651798);
                        i3 = -2043933554;
                        i11 = iM11306;
                        i10 = iM450210 ^ i3;
                        i9 = i2;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܰ") ^ i5;
                        i9 = ((iM45029 ^ i4) * (-28471)) ^ (-1998220871);
                        i = 1129787746;
                        i10 = iM45029 ^ i;
                    }
                    break;
                case -1954714042:
                case -175009636:
                    iM11308 = ThreadFactoryC3888.m11306(C3722.m10901(sArr2, 7, 3, i8));
                    i12 = 2125804044;
                    if (C3743.f13569) {
                        iM45029 = ThreadFactoryC3888.m11306("֡ۘ") ^ i5;
                        i9 = ((iM45029 ^ i4) * (-2947)) ^ 112271442;
                        i = 1795883990;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ֡") ^ i5;
                        i9 = ((iM45029 ^ i4) * (-18293)) ^ (-1385881857);
                        i = 1822524374;
                    }
                    i10 = iM45029 ^ i;
                    break;
                case -1893911753:
                case 763237621:
                    this.f38409 = (TextView) C3743.m10957(view, iM11308 ^ i12);
                    if (C1066.m4023() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩵") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((iM45029 ^ i4) * 20435) ^ (-696231347);
                        i = -754120977;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۜ") ^ i5;
                        i9 = ((iM45029 ^ i4) * 18329) ^ 1409062683;
                        i = 1954092153;
                    }
                    i10 = iM45029 ^ i;
                    break;
                case -1871754611:
                case -799506133:
                    sArr = f38407;
                    i13 = 10;
                    i14 = 3;
                    if (C2249.m6915() <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩵") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((iM45029 ^ i4) * 20435) ^ (-696231347);
                        i = -754120977;
                    } else {
                        iM45029 = C19806.m45029("ۙ᩶") ^ i4;
                        i9 = ((iM45029 ^ i5) * 2933) ^ 676898339;
                        i = -2041426405;
                    }
                    i10 = iM45029 ^ i;
                    break;
                case -1616797386:
                case -166454633:
                    textView = (TextView) C3743.m10957(view, C19806.m45029(RunnableC1564.m5344(sArr, i13, i14, i8)) ^ 2099329276);
                    if (C0050.f912 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩵") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((iM45029 ^ i4) * 20435) ^ (-696231347);
                        i = -754120977;
                    } else {
                        iM45029 = C19806.m45029("ܿ۟") ^ i5;
                        i9 = ((iM45029 ^ i4) * (-11803)) ^ 1236322092;
                        i = -1792388196;
                    }
                    i10 = iM45029 ^ i;
                    break;
                case -1488883805:
                case 553533034:
                    RunnableC3388.m10064();
                    throw new RuntimeException();
                case -1078477518:
                case -626554249:
                    this.f38413 = (ImageView) viewM8168;
                    strM6241 = ViewGroupOnHierarchyChangeListenerC1916.m6241(f38407, 4, 3, i8);
                    if (C0629.m2907()) {
                        iM45029 = (C19806.m45029("ۡ֨") ^ i5) * (-93);
                        i9 = ((iM45029 ^ i4) * 13451) ^ 1155288678;
                        i = -85643118;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܰ") ^ i5;
                        i9 = ((iM45029 ^ i4) * (-28471)) ^ (-1998220871);
                        i = 1129787746;
                    }
                    i10 = iM45029 ^ i;
                    break;
                case -999477027:
                case -250654036:
                    viewM8168 = C2642.m8167(view, i11 ^ 2127679873);
                    if (C0050.f912 > 0) {
                        iM45029 = C19806.m45029("ܳᩴ") ^ i4;
                        i9 = ((iM45029 ^ i5) * (-22789)) ^ 1620630535;
                        i = -806224222;
                        i10 = iM45029 ^ i;
                    } else {
                        iM11306 = i11;
                        iM450210 = C19806.m45029("᩹᩸") ^ i4;
                        i2 = ((iM450210 ^ i5) * 28469) ^ (-441651798);
                        i3 = -2043933554;
                        i11 = iM11306;
                        i10 = iM450210 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -826612686:
                case 946087496:
                    iM11306 = ThreadFactoryC3888.m11306(C0629.m2906(f38407, 1, 3, i8));
                    if (CallableC1627.f6528) {
                        iM450210 = (C19806.m45029("᩹֨") ^ i5) * 87;
                        i2 = ((iM450210 ^ i4) * (-20003)) ^ 160566599;
                        i3 = 1191775554;
                    } else {
                        iM450210 = C19806.m45029("᩹᩸") ^ i4;
                        i2 = ((iM450210 ^ i5) * 28469) ^ (-441651798);
                        i3 = -2043933554;
                    }
                    i11 = iM11306;
                    i10 = iM450210 ^ i3;
                    i9 = i2;
                    break;
                case -650481919:
                case 986888081:
                    viewM8167 = C2642.m8167(view, ThreadFactoryC3888.m11306(strM6241) ^ 2118838311);
                    if (RunnableC1564.f6300) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩵") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((iM45029 ^ i4) * 20435) ^ (-696231347);
                        i = -754120977;
                    } else {
                        iM45029 = C19806.m45029("ᩴ᩶") ^ i4;
                        i9 = ((iM45029 ^ i5) * 10619) ^ 1147638280;
                        i = 1800461301;
                    }
                    i10 = iM45029 ^ i;
                    break;
                case -332725307:
                case 1899770282:
                    this.f38408 = textView;
                    iM11309 = ThreadFactoryC3888.m11306(C1066.m4040(f38407, 13, 3, i8));
                    i16 = 2127340037;
                    if (!C0526.f2219) {
                        iM45029 = (ThreadFactoryC3888.m11306("۠ۧ") ^ i4) * (-89);
                        i9 = ((iM45029 ^ i5) * 14041) ^ 1223160851;
                        i = -893992060;
                        i10 = iM45029 ^ i;
                    } else {
                        iM11306 = i11;
                        iM450210 = C19806.m45029("᩹᩸") ^ i4;
                        i2 = ((iM450210 ^ i5) * 28469) ^ (-441651798);
                        i3 = -2043933554;
                        i11 = iM11306;
                        i10 = iM450210 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -171205305:
                case 1897063412:
                    C2332.m7079();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM45029 = ThreadFactoryC3888.m11306("ۙܰ") ^ i5;
                    i9 = ((iM45029 ^ i4) * (-28471)) ^ (-1998220871);
                    i = 1129787746;
                    i10 = iM45029 ^ i;
                    break;
                case -29120727:
                case 454373190:
                    this.f38411 = (TextView) viewM8167;
                    sArr2 = f38407;
                    if (AbstractC0464.f2088 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩵") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((iM45029 ^ i4) * 20435) ^ (-696231347);
                        i = -754120977;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩹") ^ i4) * (-105);
                        i9 = ((iM45029 ^ i5) * 1865) ^ 1248657279;
                        i = 113167959;
                    }
                    i10 = iM45029 ^ i;
                    break;
                case 1026602174:
                case 1557159937:
                    C3722.m10890((Button) C3743.m10957(view, iM11309 ^ i16), 8);
                    C1937.m6291(view, this);
                    return;
                case 1588509905:
                case 1726827457:
                    if (C10634.f36300 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܰ") ^ i5;
                        i9 = ((iM45029 ^ i4) * (-28471)) ^ (-1998220871);
                        i = 1129787746;
                    } else {
                        iM45029 = (C19806.m45029("֫ۙ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i9 = ((iM45029 ^ i5) * (-14911)) ^ 987449090;
                        i = -468723968;
                    }
                    i10 = iM45029 ^ i;
                    break;
                default:
                    if (C3577.f13150 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۙܰ") ^ i5;
                        i9 = ((iM45029 ^ i4) * (-28471)) ^ (-1998220871);
                        i = 1129787746;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܽ᩵") + i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((iM45029 ^ i4) * 20435) ^ (-696231347);
                        i = -754120977;
                    }
                    i10 = iM45029 ^ i;
                    break;
            }
        }
    }
}
