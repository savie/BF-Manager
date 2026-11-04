package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۧ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J2RL */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC11916 extends AbstractC11800 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩶᩻֫, reason: not valid java name and contains not printable characters */
    private static final short[] f38395 = {7983, 22104, 17053, -29301, 21848, -29415, -32216, -31704, 23879, 28203, -27042, -26955, 17038, -30864, -31776, 21899, 7889, 11865, 14264, 4396, -8684, 9348, 8416};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f38396;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f38397;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18300 f38398;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f38399;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC25343 f38400;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f38401;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:38:0x0139 A[PHI: r12 r13 r14
      0x0139: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]) binds: [B:37:0x0137, B:21:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:37:0x0137, B:21:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r14v4 int) = (r14v3 int), (r14v2 int) binds: [B:37:0x0137, B:21:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01c1 A[PHI: r5 r11
      0x01c1: PHI (r5v5 android.widget.TextView) = 
      (r5v2 android.widget.TextView)
      (r5v4 android.widget.TextView)
      (r5v2 android.widget.TextView)
      (r5v2 android.widget.TextView)
      (r5v2 android.widget.TextView)
     binds: [B:49:0x01bf, B:33:0x0115, B:23:0x00b0, B:21:0x00ac, B:17:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x01c1: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:49:0x01bf, B:33:0x0115, B:23:0x00b0, B:21:0x00ac, B:17:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0237 A[PHI: r7 r8 r9 r10 r17 r19
      0x0237: PHI (r7v4 java.lang.String) = 
      (r7v2 java.lang.String)
      (r7v3 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
      (r7v2 java.lang.String)
     binds: [B:58:0x0235, B:54:0x0211, B:45:0x019d, B:29:0x00e6, B:10:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:58:0x0235, B:54:0x0211, B:45:0x019d, B:29:0x00e6, B:10:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:58:0x0235, B:54:0x0211, B:45:0x019d, B:29:0x00e6, B:10:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:58:0x0235, B:54:0x0211, B:45:0x019d, B:29:0x00e6, B:10:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r17v7 android.view.View) = 
      (r17v6 android.view.View)
      (r17v6 android.view.View)
      (r17v6 android.view.View)
      (r17v6 android.view.View)
      (r17v8 android.view.View)
     binds: [B:58:0x0235, B:54:0x0211, B:45:0x019d, B:29:0x00e6, B:10:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0237: PHI (r19v3 android.view.View) = 
      (r19v2 android.view.View)
      (r19v1 android.view.View)
      (r19v1 android.view.View)
      (r19v1 android.view.View)
      (r19v1 android.view.View)
     binds: [B:58:0x0235, B:54:0x0211, B:45:0x019d, B:29:0x00e6, B:10:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC11916(ActivityC25343 activityC25343, View view) {
        int iM2761;
        int i;
        int iM3169;
        int iM31610;
        int i2;
        int i3;
        super(view);
        int i4 = C3779.f12953;
        int i5 = C2288.f7433;
        short s = f38395[0];
        int i6 = (s * s) + 384708996;
        int i7 = s + 19614;
        int i8 = (i6 + i6) - (i7 * i7) >= 0 ? 3551 : 39188;
        this.f38400 = activityC25343;
        int iM31611 = C0773.m3169("۠᩸") ^ i5;
        int i9 = ((iM31611 ^ i4) * 12369) ^ (-1367689605);
        int i10 = iM31611 ^ (-70622408);
        String strM2049 = null;
        short[] sArr = null;
        int i11 = 0;
        TextView textView = null;
        int iM2762 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        View viewM11246 = null;
        int i15 = -54026136;
        View viewM9333 = null;
        short[] sArr2 = null;
        int iM31612 = 0;
        while (true) {
            i15 = i10 ^ (i9 & (((i15 ^ i4) * (-32193)) >> 31));
            switch (i15) {
                case -2002342591:
                case 1411957243:
                    RunnableC3646.m11813();
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0619.m2761("᩶ۨ") ^ i5) * (-45);
                        i9 = ((iM2761 ^ i4) * 18553) ^ (-1808753892);
                        i = 1285245624;
                    } else {
                        iM2761 = C0773.m3169("ۖۧ") ^ i5;
                        i9 = ((iM2761 ^ i4) * (-29765)) ^ 192071213;
                        i = 1565281302;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -1949227415:
                case 1058976154:
                    C1321.m4852();
                    if (C1519.f5300 >= 0) {
                        iM2761 = (C0619.m2761("᩶ۨ") ^ i5) * (-45);
                        i9 = ((iM2761 ^ i4) * 18553) ^ (-1808753892);
                        i = 1285245624;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۗۖ")) * 89;
                        i9 = ((iM2761 ^ i5) * 7655) ^ (-567699382);
                        i = -1559513214;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -1899210112:
                case 1982060184:
                    C13473.m33140(C3448.m11246(view, 2098212239 ^ iM31612), 8);
                    C11235.m28299(view, this);
                    return;
                case -1728619222:
                case 396090846:
                    this.f38399 = textView;
                    iM31612 = C0773.m3169(AbstractC3624.m11769(f38395, 13, 3, i8));
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("ᩴۜ") ^ i5;
                        i9 = ((iM2761 ^ i4) * 29639) ^ 1644500970;
                        i = -1426810072;
                    } else {
                        iM2761 = (C0619.m2761("ܶܶ") + i4) * 25;
                        i9 = ((iM2761 ^ i5) * 5125) ^ (-221308449);
                        i = -2126813818;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -1718047747:
                case -1047027611:
                    iM3169 = C0773.m3169(RunnableC3646.m11809(f38395, 1, 3, i8));
                    if (C13473.f42873 != 0) {
                        iM31610 = (i4 - C0773.m3169("ۢۘ")) * 15;
                        i2 = ((iM31610 ^ i5) * (-25261)) ^ (-1319784547);
                        i3 = 1003000571;
                    } else {
                        iM31610 = C0773.m3169("ܶ۫") ^ i5;
                        i2 = ((iM31610 ^ i4) * (-12093)) ^ (-1627456058);
                        i3 = 613889827;
                    }
                    i11 = iM3169;
                    i10 = iM31610 ^ i3;
                    i9 = i2;
                    break;
                case -1544175850:
                case -1259816734:
                    textView = (TextView) C2834.m9333(view, C0619.m2761(C20932.m47853(sArr, i13, i14, i8)) ^ 2102452526);
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0619.m2761("᩶ۨ") ^ i5) * (-45);
                        i9 = ((iM2761 ^ i4) * 18553) ^ (-1808753892);
                        i = 1285245624;
                    } else {
                        iM2761 = (C0773.m3169("ۗ֡") ^ i5) * 101;
                        i9 = ((iM2761 ^ i4) * 8787) ^ 1133939371;
                        i = -584758611;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -928676195:
                case -107246686:
                    if (!C2288.m7767()) {
                        iM2761 = C0773.m3169("ۖۧ") ^ i5;
                        i9 = ((iM2761 ^ i4) * (-29765)) ^ 192071213;
                        i = 1565281302;
                        i10 = iM2761 ^ i;
                    } else {
                        iM3169 = i11;
                        iM31610 = (i4 - C0773.m3169("ۢۘ")) * 15;
                        i2 = ((iM31610 ^ i5) * (-25261)) ^ (-1319784547);
                        i3 = 1003000571;
                        i11 = iM3169;
                        i10 = iM31610 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -694068291:
                case -670999399:
                    C2878.m9491();
                    C1146.m4231();
                    iM2761 = (C0619.m2761("᩶ۨ") ^ i5) * (-45);
                    i9 = ((iM2761 ^ i4) * 18553) ^ (-1808753892);
                    i = 1285245624;
                    i10 = iM2761 ^ i;
                    break;
                case -433545814:
                case -81442107:
                    C3690.m11987();
                    C3998.m12920();
                    throw new RuntimeException();
                case -129026824:
                case 1972424980:
                    this.f38401 = (ImageView) viewM9333;
                    strM2049 = RunnableC0334.m2049(f38395, 4, 3, i8);
                    if (C23916.f77426 <= 0) {
                        iM2761 = C0619.m2761("ᩴۜ") ^ i5;
                        i9 = ((iM2761 ^ i4) * 29639) ^ 1644500970;
                        i = -1426810072;
                    } else {
                        iM2761 = (i5 - C0773.m3169("ۙ᩷")) * (-19);
                        i9 = ((iM2761 ^ i4) * (-6331)) ^ (-73194701);
                        i = -1496998559;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case 91587950:
                case 758786679:
                    iM2762 = C0619.m2761(C23916.m53420(sArr2, 7, 3, i8));
                    i12 = 2098858074;
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("ᩴۜ") ^ i5;
                        i9 = ((iM2761 ^ i4) * 29639) ^ 1644500970;
                        i = -1426810072;
                    } else {
                        iM2761 = C0619.m2761("ܽۧ") ^ i4;
                        i9 = ((iM2761 ^ i5) * (-12885)) ^ 1764974960;
                        i = 1113918757;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case 751013830:
                case 823084956:
                    sArr = f38395;
                    i13 = 10;
                    i14 = 3;
                    if (C3492.f12043 <= 0) {
                        iM2761 = (i4 - C0619.m2761("ۗۖ")) * 89;
                        i9 = ((iM2761 ^ i5) * 7655) ^ (-567699382);
                        i = -1559513214;
                    } else {
                        iM2761 = (C0619.m2761("ܰ᩻") ^ i5) * (-29);
                        i9 = ((iM2761 ^ i4) * 5973) ^ (-733443536);
                        i = 1752461152;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case 1092379682:
                case 1811788633:
                    this.f38397 = (TextView) C3448.m11246(view, iM2762 ^ i12);
                    if (C2288.f7433 > 0) {
                        iM2761 = (i4 - C0773.m3169("ܺܶ")) * 77;
                        i9 = ((iM2761 ^ i5) * 24841) ^ (-1931529795);
                        i = -1370568716;
                        i10 = iM2761 ^ i;
                    } else {
                        iM3169 = i11;
                        iM31610 = (i4 - C0773.m3169("ۢۘ")) * 15;
                        i2 = ((iM31610 ^ i5) * (-25261)) ^ (-1319784547);
                        i3 = 1003000571;
                        i11 = iM3169;
                        i10 = iM31610 ^ i3;
                        i9 = i2;
                    }
                    break;
                case 1136077480:
                case 2121019518:
                    this.f38396 = (TextView) viewM11246;
                    sArr2 = f38395;
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0619.m2761("᩶ۨ") ^ i5) * (-45);
                        i9 = ((iM2761 ^ i4) * 18553) ^ (-1808753892);
                        i = 1285245624;
                    } else {
                        iM2761 = (i5 - C0773.m3169("᩻֨")) * 61;
                        i9 = ((iM2761 ^ i4) * (-4605)) ^ (-402563349);
                        i = 1106528231;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case 1187378699:
                case 1727477015:
                    viewM9333 = C2834.m9333(view, i11 ^ 2120985999);
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ᩴۜ") ^ i5;
                        i9 = ((iM2761 ^ i4) * 29639) ^ 1644500970;
                        i = -1426810072;
                    } else {
                        iM2761 = (C0619.m2761("ۘܳ") + i4) * (-39);
                        i9 = ((iM2761 ^ i5) * 23937) ^ 1728347480;
                        i = 1374144785;
                    }
                    i10 = iM2761 ^ i;
                    break;
                default:
                    viewM11246 = C3448.m11246(view, C0619.m2761(strM2049) ^ 2119597628);
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("ᩴۜ") ^ i5;
                        i9 = ((iM2761 ^ i4) * 29639) ^ 1644500970;
                        i = -1426810072;
                    } else {
                        iM2761 = C0619.m2761("ۛ۬") ^ i4;
                        i9 = ((iM2761 ^ i5) * (-13095)) ^ 686272988;
                        i = 1781508335;
                    }
                    i10 = iM2761 ^ i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x010f A[PHI: r6
      0x010f: PHI (r6v6 java.lang.String) = (r6v3 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:35:0x010d, B:12:0x0088, B:106:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0148 A[PHI: r8 r9 r11
      0x0148: PHI (r8v4 short[]) = (r8v3 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:39:0x0146, B:12:0x0088, B:107:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:39:0x0146, B:12:0x0088, B:107:0x0148] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:39:0x0146, B:12:0x0088, B:107:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0285 A[PHI: r10 r12 r13 r16 r17 r18 r20
      0x0285: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:67:0x0283, B:63:0x0267, B:27:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:67:0x0283, B:63:0x0267, B:27:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:67:0x0283, B:63:0x0267, B:27:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r16v4 char) = (r16v3 char), (r16v2 char), (r16v2 char) binds: [B:67:0x0283, B:63:0x0267, B:27:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r17v4 int) = (r17v2 int), (r17v3 int), (r17v2 int) binds: [B:67:0x0283, B:63:0x0267, B:27:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:67:0x0283, B:63:0x0267, B:27:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r20v4 short) = (r20v2 short), (r20v3 short), (r20v2 short) binds: [B:67:0x0283, B:63:0x0267, B:27:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        short[] sArr;
        ViewOnClickListenerC11916 viewOnClickListenerC11916 = this;
        int i4 = 1829229589;
        int i5 = C0950.f3488;
        int i6 = C1519.f5300;
        int iM31611 = C0773.m3169("᩹ۤ") ^ i5;
        int i7 = ((iM31611 ^ i6) * (-26265)) ^ (-1634138367);
        int i8 = iM31611 ^ (-1436252343);
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int iM42685 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s = 0;
        short s2 = 0;
        String strM3500 = null;
        String strM6233 = null;
        ActivityC25343 activityC25343 = null;
        boolean z = false;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i6) * (-13069)) >> 31));
            switch (i4) {
                case -1947260377:
                case -1634480857:
                    c = 16;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (C0773.m3169("֨ۨ") + i5) * (-47);
                        i = ((iM3169 ^ i6) * (-17595)) ^ 1456013266;
                        i2 = 942652354;
                    } else {
                        iM3169 = (i6 - C0773.m3169("᩺ۡ")) * (-27);
                        i = ((iM3169 ^ i5) * 3547) ^ 256037628;
                        i2 = 2023664285;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1782099421:
                case 116540398:
                    if (RunnableC3055.f9898 < 0) {
                        iM31610 = (i6 - C0773.m3169("ۜۧ")) * (-5);
                        i7 = ((iM31610 ^ i5) * 29157) ^ (-559290052);
                        i3 = 502467512;
                        i8 = iM31610 ^ i3;
                        viewOnClickListenerC11916 = this;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩸") ^ i5;
                        i = ((iM3169 ^ i6) * 5045) ^ (-925992953);
                        i2 = -593229437;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1764505649:
                case 487083857:
                    C3448.m11245(new C2222(viewOnClickListenerC11916));
                    break;
                case -1554461571:
                case 1359013955:
                    if (viewOnClickListenerC11916.f38398.m42677()) {
                        iM3169 = (i6 - C0773.m3169("۬ܿ")) * 5;
                        i = ((iM3169 ^ i5) * (-6235)) ^ 2069254450;
                        i2 = 1263215248;
                    } else {
                        iM3169 = (C0773.m3169("᩺ܺ") ^ i5) * (-7);
                        i = ((iM3169 ^ i6) * 2671) ^ (-946333757);
                        i2 = -1058334819;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1553786164:
                case -1358345764:
                    activityC25343.m40398(C0619.m2761(strM3500) ^ 2103419435, z);
                    break;
                case -1376935991:
                case -574224168:
                    i14 = 18385;
                    iM3169 = C0773.m3169("ܰۡ") ^ i6;
                    i = ((iM3169 ^ i5) * (-29391)) ^ 800037028;
                    i2 = 140352487;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1146963249:
                case -685511063:
                    iM42685 = viewOnClickListenerC11916.f38398.m42685();
                    i9 = 2;
                    if (C2287.f7432 < 0) {
                        iM3169 = C0773.m3169("ۘ᩺") ^ i6;
                        i = ((iM3169 ^ i5) * 15845) ^ (-1618589894);
                        i2 = 467823918;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        sArr = sArr2;
                        int iM2761 = C0619.m2761("ܺ᩵") ^ i6;
                        i8 = iM2761 ^ (-57453305);
                        sArr2 = sArr;
                        i7 = ((iM2761 ^ i5) * 15447) ^ (-1672870061);
                        viewOnClickListenerC11916 = this;
                    }
                    break;
                case -1084687583:
                case -740624974:
                    i14 = 1024;
                    iM3169 = C0773.m3169("ܰۡ") ^ i6;
                    i = ((iM3169 ^ i5) * (-29391)) ^ 800037028;
                    i2 = 140352487;
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1082625084:
                case 1677191016:
                    C0950.m3785();
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("ܿ֡") ^ i6;
                        i = ((iM3169 ^ i5) * 19331) ^ (-461561556);
                        i2 = -1346633;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩸") ^ i5;
                        i = ((iM3169 ^ i6) * 5045) ^ (-925992953);
                        i2 = -593229437;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -1002467897:
                case 1028401902:
                    if (C1146.f4234 >= 0) {
                        iM31610 = (i6 - C0773.m3169("ۜۧ")) * (-5);
                        i7 = ((iM31610 ^ i5) * 29157) ^ (-559290052);
                        i3 = 502467512;
                    } else {
                        iM31610 = C0773.m3169("ۡۤ") ^ i5;
                        i7 = ((iM31610 ^ i6) * 18875) ^ 1205714715;
                        i3 = -1815826156;
                    }
                    i8 = iM31610 ^ i3;
                    viewOnClickListenerC11916 = this;
                    break;
                case -996404301:
                case 1985021916:
                    z = false;
                    activityC25343 = viewOnClickListenerC11916.f38400;
                    if (iM42685 <= i9) {
                        iM3169 = (i6 - C0619.m2761("ۧۤ")) * (-117);
                        i = ((iM3169 ^ i5) * 20701) ^ 1592439896;
                        i2 = -406030444;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ۬") + i5) * (-63);
                        i = ((iM3169 ^ i6) * (-26043)) ^ 824678777;
                        i2 = 1747076185;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -533683423:
                case 7807523:
                    activityC25343.m40398(C0773.m3169(strM6233) ^ 2122846604, z);
                    break;
                case -398352235:
                case 546637258:
                    C4282.m13644();
                    sArr = sArr2;
                    int iM2762 = C0619.m2761("ܺ᩵") ^ i6;
                    i8 = iM2762 ^ (-57453305);
                    sArr2 = sArr;
                    i7 = ((iM2762 ^ i5) * 15447) ^ (-1672870061);
                    viewOnClickListenerC11916 = this;
                    break;
                case 63315784:
                case 602750787:
                    C1564.m5509();
                    C2485.m8357();
                    break;
                case 82836251:
                case 316429584:
                    sArr = f38395;
                    if (C0862.f3233 == 0) {
                        int iM2763 = (C0619.m2761("ܶۛ") + i6) * 55;
                        i = ((iM2763 ^ i5) * 10409) ^ (-570799472);
                        i8 = iM2763 ^ (-1695436773);
                        viewOnClickListenerC11916 = this;
                        sArr2 = sArr;
                        i7 = i;
                    } else {
                        int iM2764 = C0619.m2761("ܺ᩵") ^ i6;
                        i8 = iM2764 ^ (-57453305);
                        sArr2 = sArr;
                        i7 = ((iM2764 ^ i5) * 15447) ^ (-1672870061);
                        viewOnClickListenerC11916 = this;
                    }
                    break;
                case 96560815:
                case 1267688877:
                    if (C20932.m47848() != 0) {
                        iM3169 = C0773.m3169("ܿ֡") ^ i6;
                        i = ((iM3169 ^ i5) * 19331) ^ (-461561556);
                        i2 = -1346633;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        sArr = sArr2;
                        int iM2765 = C0619.m2761("ܺ᩵") ^ i6;
                        i8 = iM2765 ^ (-57453305);
                        sArr2 = sArr;
                        i7 = ((iM2765 ^ i5) * 15447) ^ (-1672870061);
                        viewOnClickListenerC11916 = this;
                    }
                    break;
                case 119828493:
                case 126885819:
                    strM3500 = C0862.m3500(sArr4, i13, i11, i14);
                    if (!C3077.m10041()) {
                        iM3169 = (C0773.m3169("ᩳۖ") ^ i5) * 43;
                        i = ((iM3169 ^ i6) * 30211) ^ 1134330718;
                        i2 = -1061808407;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        iM31610 = (i6 - C0773.m3169("ۜۧ")) * (-5);
                        i7 = ((iM31610 ^ i5) * 29157) ^ (-559290052);
                        i3 = 502467512;
                        i8 = iM31610 ^ i3;
                        viewOnClickListenerC11916 = this;
                    }
                    break;
                case 358660453:
                case 1985424325:
                    s = sArr2[c];
                    i15 = s * s;
                    i16 = 81144064;
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0773.m3169("֨ۨ") + i5) * (-47);
                        i = ((iM3169 ^ i6) * (-17595)) ^ 1456013266;
                        i2 = 942652354;
                    } else {
                        iM3169 = C0773.m3169("ۖ᩶") ^ i5;
                        i = ((iM3169 ^ i6) * 24401) ^ (-1199490755);
                        i2 = -994462496;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 373251724:
                case 2090487630:
                    sArr4 = f38395;
                    i13 = 20;
                    i11 = 3;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0773.m3169("֨ۨ") + i5) * (-47);
                        i = ((iM3169 ^ i6) * (-17595)) ^ 1456013266;
                        i2 = 942652354;
                    } else {
                        iM3169 = C0619.m2761("֨ᩳ") ^ i5;
                        i = ((iM3169 ^ i6) * 11105) ^ (-757504146);
                        i2 = -1866776484;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 795004146:
                case 1402129580:
                    int i18 = i15 + i16;
                    i17 = i18 + i18;
                    s2 = 9008;
                    if (C0487.f2131 > 0) {
                        iM3169 = C0619.m2761("ۗܶ") ^ i6;
                        i = ((iM3169 ^ i5) * 6511) ^ 449434333;
                        i2 = 2142491346;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        iM31610 = (i6 - C0773.m3169("ۜۧ")) * (-5);
                        i7 = ((iM31610 ^ i5) * 29157) ^ (-559290052);
                        i3 = 502467512;
                        i8 = iM31610 ^ i3;
                        viewOnClickListenerC11916 = this;
                    }
                    break;
                case 1010922402:
                case 1541375880:
                    sArr3 = f38395;
                    i10 = 17;
                    i12 = 3;
                    if (C2702.m8876()) {
                        iM3169 = (C0619.m2761("۫ۗ") ^ i5) * 79;
                        i = ((iM3169 ^ i6) * (-17249)) ^ (-841418619);
                        i2 = -165707163;
                    } else {
                        iM3169 = C0773.m3169("ܿ֡") ^ i6;
                        i = ((iM3169 ^ i5) * 19331) ^ (-461561556);
                        i2 = -1346633;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case 1346617541:
                case 1630907521:
                    strM6233 = C1783.m6233(sArr3, i10, i12, i14);
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("ܶ᩸") ^ i5;
                        i = ((iM3169 ^ i6) * 5045) ^ (-925992953);
                        i2 = -593229437;
                    } else {
                        iM3169 = (C0773.m3169("᩶᩷") ^ i6) * (-61);
                        i = ((iM3169 ^ i5) * 24189) ^ (-1005068804);
                        i2 = -1082720423;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                default:
                    int i19 = s + s2;
                    if (i17 - (i19 * i19) >= 0) {
                        iM3169 = C0619.m2761("֫ᩴ") ^ i5;
                        i = ((iM3169 ^ i6) * 13379) ^ 735816767;
                        i2 = 986104780;
                    } else {
                        iM3169 = (C0619.m2761("᩻ۜ") ^ i5) * (-45);
                        i = ((iM3169 ^ i6) * 32535) ^ 256660171;
                        i2 = -763259274;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
            }
            return;
        }
    }
}
