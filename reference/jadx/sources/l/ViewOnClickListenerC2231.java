package l;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۖۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G2S4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC2231 extends AbstractC12554 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۤ۬ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f8009 = {8637, 18248, -31469, -20103, 16591, -17281, -29271, 6638, -11448, -12383, -5605};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5054 f8010;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ProgressBar f8011;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f8012;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:47:0x015a A[PHI: r3 r7
      0x015a: PHI (r3v11 int) = (r3v8 int), (r3v10 int), (r3v8 int) binds: [B:32:0x00e0, B:10:0x006f, B:84:0x015a] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:32:0x00e0, B:10:0x006f, B:84:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0220 A[PHI: r6 r11 r12 r13 r16 r19
      0x0220: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:63:0x021e, B:44:0x0142, B:36:0x0102, B:51:0x0194, B:85:0x0220] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:63:0x021e, B:44:0x0142, B:36:0x0102, B:51:0x0194, B:85:0x0220] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:63:0x021e, B:44:0x0142, B:36:0x0102, B:51:0x0194, B:85:0x0220] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:63:0x021e, B:44:0x0142, B:36:0x0102, B:51:0x0194, B:85:0x0220] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r16v4 android.view.View) = 
      (r16v2 android.view.View)
      (r16v3 android.view.View)
      (r16v2 android.view.View)
      (r16v2 android.view.View)
      (r16v2 android.view.View)
     binds: [B:63:0x021e, B:44:0x0142, B:36:0x0102, B:51:0x0194, B:85:0x0220] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r19v14 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v9 short[]), (r19v3 short[]) binds: [B:63:0x021e, B:44:0x0142, B:36:0x0102, B:51:0x0194, B:85:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    public ViewOnClickListenerC2231(ActivityC5054 activityC5054, View view) {
        int iM11306;
        int i;
        short[] sArr;
        int iM11307;
        int i2;
        int i3;
        super(view);
        int i4 = C0050.f912;
        int i5 = AbstractC0464.f2088;
        short s = f8009[0];
        int i6 = s + 4718;
        int i7 = (s * s) + 22259524;
        int i8 = (i7 + i7) - (i6 * i6) < 0 ? 7027 : 54721;
        this.f8010 = activityC5054;
        int iM45029 = C19806.m45029("᩺۫") ^ i4;
        int i9 = ((iM45029 ^ i5) * (-13727)) ^ 209384444;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int iM450210 = 0;
        int iM11308 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        View viewM8167 = null;
        View viewM10957 = null;
        int i14 = -795576718;
        int i15 = iM45029 ^ 1355895720;
        int i16 = 0;
        while (true) {
            i14 = i15 ^ (i9 & (((i14 ^ i5) * 18403) >> 31));
            switch (i14) {
                case -2104877480:
                case -785947259:
                    C0671.m3008();
                    if (C0629.f2722 > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۛ") + i4) * 87;
                        i9 = ((iM11306 ^ i5) * (-4353)) ^ (-1245023475);
                        i = 2020981507;
                        i15 = iM11306 ^ i;
                    } else {
                        sArr = sArr2;
                        iM11307 = (ThreadFactoryC3888.m11306("ۚ۟") + i4) * (-79);
                        i2 = ((iM11307 ^ i5) * 24307) ^ 1758007360;
                        i3 = 1580948500;
                        int i17 = iM11307 ^ i3;
                        sArr2 = sArr;
                        i15 = i17;
                        i9 = i2;
                    }
                    break;
                case -2054913691:
                case 218931442:
                    sArr = sArr2;
                    i10 = 1;
                    if (C19806.f63586) {
                        iM11307 = C19806.m45029("ܿ᩹") ^ i4;
                        i2 = ((iM11307 ^ i5) * 27091) ^ 994138730;
                        i3 = -615792810;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۖ᩶") ^ i4;
                        i2 = ((iM11307 ^ i5) * (-1517)) ^ (-1162982538);
                        i3 = 605275809;
                    }
                    int i18 = iM11307 ^ i3;
                    sArr2 = sArr;
                    i15 = i18;
                    i9 = i2;
                    break;
                case -1755193937:
                case 1004590143:
                    if (C3535.f13026 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ۬") ^ i5;
                        i9 = ((iM11306 ^ i4) * 11007) ^ 2131048349;
                        i = -1991962714;
                        i15 = iM11306 ^ i;
                    } else {
                        sArr = sArr2;
                        iM11307 = (ThreadFactoryC3888.m11306("ۚ۟") + i4) * (-79);
                        i2 = ((iM11307 ^ i5) * 24307) ^ 1758007360;
                        i3 = 1580948500;
                        int i19 = iM11307 ^ i3;
                        sArr2 = sArr;
                        i15 = i19;
                        i9 = i2;
                    }
                    break;
                case -1698880645:
                case -683159081:
                    if (!C3743.f13569) {
                        sArr = sArr2;
                        iM11307 = (ThreadFactoryC3888.m11306("ۚ۟") + i4) * (-79);
                        i2 = ((iM11307 ^ i5) * 24307) ^ 1758007360;
                        i3 = 1580948500;
                        int i110 = iM11307 ^ i3;
                        sArr2 = sArr;
                        i15 = i110;
                        i9 = i2;
                    } else {
                        iM11306 = C19806.m45029("᩹᩶") ^ i5;
                        i9 = ((iM11306 ^ i4) * 5007) ^ (-195033001);
                        i = 618567628;
                        i15 = iM11306 ^ i;
                    }
                    break;
                case -1173625446:
                case -853118820:
                    this.f8011 = (ProgressBar) viewM8167;
                    if (C1875.f7103 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۚ") ^ i4;
                        i9 = ((iM11306 ^ i5) * 14999) ^ 1397693692;
                        i = 1548638278;
                        i15 = iM11306 ^ i;
                    } else {
                        sArr = sArr2;
                        iM11307 = C19806.m45029("ܿ᩹") ^ i4;
                        i2 = ((iM11307 ^ i5) * 27091) ^ 994138730;
                        i3 = -615792810;
                        int i111 = iM11307 ^ i3;
                        sArr2 = sArr;
                        i15 = i111;
                        i9 = i2;
                    }
                    break;
                case -1069866424:
                case 1601137137:
                    iM11308 = ThreadFactoryC3888.m11306(RunnableC3388.m10056(sArr3, i12, i13, i8));
                    if (C3535.f13026 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۛ") + i4) * 87;
                        i9 = ((iM11306 ^ i5) * (-4353)) ^ (-1245023475);
                        i = 2020981507;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֫ܳ") ^ i4) * (-69);
                        i9 = ((iM11306 ^ i5) * (-6249)) ^ 1392138027;
                        i = 439623473;
                    }
                    i15 = iM11306 ^ i;
                    break;
                case -958866833:
                case 655665598:
                    sArr = sArr2;
                    iM450210 = C19806.m45029(RunnableC1895.m6164(sArr, i10, i11, i8));
                    if (C1148.m4232() > 0) {
                        iM11307 = (ThreadFactoryC3888.m11306("ᩳ۬") ^ i4) * (-45);
                        i2 = ((iM11307 ^ i5) * (-31137)) ^ 191636551;
                        i3 = -925255333;
                        int i112 = iM11307 ^ i3;
                        sArr2 = sArr;
                        i15 = i112;
                        i9 = i2;
                    } else {
                        sArr2 = sArr;
                        iM11306 = C19806.m45029("᩹᩶") ^ i5;
                        i9 = ((iM11306 ^ i4) * 5007) ^ (-195033001);
                        i = 618567628;
                        i15 = iM11306 ^ i;
                    }
                    break;
                case -915508909:
                case 486076922:
                    C7105.m18993(view, this);
                    sArr2 = f8009;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = C19806.m45029("᩹᩶") ^ i5;
                        i9 = ((iM11306 ^ i4) * 5007) ^ (-195033001);
                        i = 618567628;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺۖ") ^ i5) * (-47);
                        i9 = ((iM11306 ^ i4) * 15513) ^ (-1813645729);
                        i = -922856935;
                    }
                    i15 = iM11306 ^ i;
                    break;
                case -447162638:
                case 897090861:
                    viewM8167 = C2642.m8167(view, i16);
                    if (C1977.f7413 <= 0) {
                        iM11306 = C19806.m45029("᩹᩶") ^ i5;
                        i9 = ((iM11306 ^ i4) * 5007) ^ (-195033001);
                        i = 618567628;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܶۡ") ^ i4;
                        i9 = ((iM11306 ^ i5) * 9007) ^ (-605990873);
                        i = -165570030;
                    }
                    i15 = iM11306 ^ i;
                    break;
                case -224857535:
                case 548242620:
                    C1461.m5080();
                    throw new RuntimeException();
                case 38119985:
                case 1653951800:
                    viewM10957 = C3743.m10957(view, 2100734490 ^ iM11308);
                    if (RunnableC1895.m6170() == 0) {
                        iM11306 = C19806.m45029("ۨ۫") ^ i5;
                        i9 = ((iM11306 ^ i4) * 1169) ^ (-334023141);
                        i = 378197052;
                        i15 = iM11306 ^ i;
                    } else {
                        sArr = sArr2;
                        iM11307 = (ThreadFactoryC3888.m11306("ۚ۟") + i4) * (-79);
                        i2 = ((iM11307 ^ i5) * 24307) ^ 1758007360;
                        i3 = 1580948500;
                        int i113 = iM11307 ^ i3;
                        sArr2 = sArr;
                        i15 = i113;
                        i9 = i2;
                    }
                    break;
                case 64923572:
                case 1323875864:
                    this.f8012 = (TextView) viewM10957;
                    return;
                case 274996598:
                case 1053491227:
                    sArr3 = f8009;
                    i12 = 4;
                    i13 = 3;
                    if (C0526.m2437() >= 0) {
                        iM11306 = C19806.m45029("᩹᩶") ^ i5;
                        i9 = ((iM11306 ^ i4) * 5007) ^ (-195033001);
                        i = 618567628;
                    } else {
                        iM11306 = C19806.m45029("۠ۗ") ^ i5;
                        i9 = ((iM11306 ^ i4) * 17347) ^ 350967136;
                        i = -1738977640;
                    }
                    i15 = iM11306 ^ i;
                    break;
                case 511020664:
                case 1748611362:
                    sArr = sArr2;
                    i11 = 3;
                    if (RunnableC0195.m1431()) {
                        iM11307 = C19806.m45029("ܽܶ") ^ i5;
                        i2 = ((iM11307 ^ i4) * (-17779)) ^ (-1530197528);
                        i3 = 2138503424;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ۚ۟") + i4) * (-79);
                        i2 = ((iM11307 ^ i5) * 24307) ^ 1758007360;
                        i3 = 1580948500;
                    }
                    int i114 = iM11307 ^ i3;
                    sArr2 = sArr;
                    i15 = i114;
                    i9 = i2;
                    break;
                case 1719772310:
                case 2092920822:
                    RunnableC0195.m1431();
                    C10634.m26820();
                    sArr = sArr2;
                    iM11307 = (ThreadFactoryC3888.m11306("ۚ۟") + i4) * (-79);
                    i2 = ((iM11307 ^ i5) * 24307) ^ 1758007360;
                    i3 = 1580948500;
                    int i115 = iM11307 ^ i3;
                    sArr2 = sArr;
                    i15 = i115;
                    i9 = i2;
                    break;
                default:
                    i16 = 2100971063 ^ iM450210;
                    if (C1937.f7317 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۛ") + i4) * 87;
                        i9 = ((iM11306 ^ i5) * (-4353)) ^ (-1245023475);
                        i = 2020981507;
                    } else {
                        iM11306 = C19806.m45029("᩺ۚ") ^ i5;
                        i9 = ((iM11306 ^ i4) * 2415) ^ (-1603364477);
                        i = 1830357418;
                    }
                    i15 = iM11306 ^ i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00dc A[PHI: r3 r6 r14 r15
      0x00dc: PHI (r3v6 android.widget.TextView) = 
      (r3v3 android.widget.TextView)
      (r3v2 android.widget.TextView)
      (r3v2 android.widget.TextView)
      (r3v2 android.widget.TextView)
      (r3v2 android.widget.TextView)
      (r3v2 android.widget.TextView)
     binds: [B:31:0x00da, B:27:0x00bb, B:18:0x0076, B:13:0x006e, B:102:0x00dc, B:101:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r6v6 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:31:0x00da, B:27:0x00bb, B:18:0x0076, B:13:0x006e, B:102:0x00dc, B:101:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r14v6 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:31:0x00da, B:27:0x00bb, B:18:0x0076, B:13:0x006e, B:102:0x00dc, B:101:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r15v6 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:31:0x00da, B:27:0x00bb, B:18:0x0076, B:13:0x006e, B:102:0x00dc, B:101:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x015d A[PHI: r2
      0x015d: PHI (r2v4 l.ۚۖۘ) = (r2v3 l.ۚۖۘ), (r2v2 l.ۚۖۘ), (r2v2 l.ۚۖۘ) binds: [B:40:0x0143, B:36:0x0122, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f5 A[PHI: r10 r11 r12
      0x01f5: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:55:0x01f3, B:51:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r11v3 int) = (r11v2 int), (r11v4 int) binds: [B:55:0x01f3, B:51:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x01f5: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:55:0x01f3, B:51:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0249 A[PHI: r20
      0x0249: PHI (r20v5 char) = (r20v4 char), (r20v3 char), (r20v3 char) binds: [B:63:0x0247, B:13:0x006e, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM11306;
        int i;
        int i2;
        int iM11307;
        int i3;
        short[] sArr;
        ViewOnClickListenerC2231 viewOnClickListenerC2231 = this;
        int i4 = -272224645;
        int i5 = C2871.f10837;
        int i6 = C3722.f13525;
        int iM45029 = (C19806.m45029("ۤۢ") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
        int i7 = ((iM45029 ^ i6) * (-31687)) ^ (-618122836);
        int i8 = iM45029 ^ (-246979089);
        TextView textView = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        ActivityC5054 activityC5054 = null;
        int iM11308 = 0;
        int i9 = 0;
        int i10 = 0;
        short s = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        while (true) {
            i4 = i8 ^ (i7 & (((i4 ^ i6) * (-6973)) >> 31));
            switch (i4) {
                case -2140375694:
                case 1181545527:
                    C0050.m946();
                    if (C0797.m3359()) {
                        iM11306 = C19806.m45029("ۘۘ") ^ i6;
                        i = ((iM11306 ^ i5) * o.a.B) ^ 1207966824;
                        i2 = -134338053;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡۬") ^ i5;
                        i = ((iM11306 ^ i6) * 26879) ^ (-258060782);
                        i2 = 919869338;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -2134707301:
                case 1399371991:
                    activityC5054 = viewOnClickListenerC2231.f8010;
                    if (activityC5054.f17641) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܺᩴ") ^ i6) * (-37);
                        i = ((iM11306 ^ i5) * (-7491)) ^ 680999850;
                        i2 = -1109316801;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܶ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i5) * 18499) ^ (-752503563);
                        i2 = 1542205429;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -2114830391:
                case 692939999:
                    if (activityC5054.f17636) {
                        iM11306 = (ThreadFactoryC3888.m11306("۫ܶ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM11306 ^ i5) * 18499) ^ (-752503563);
                        i2 = 1542205429;
                    } else {
                        iM11306 = (C19806.m45029("ܽ֨") ^ i5) * (-57);
                        i = ((iM11306 ^ i6) * (-23121)) ^ (-721493156);
                        i2 = 2039161867;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -2077970307:
                case -1793029460:
                    C3743.m10966();
                    C1398.m4895();
                    break;
                case -2048427733:
                case -763312863:
                    if (!RunnableC1895.f7152) {
                        iM11307 = (ThreadFactoryC3888.m11306("ܰ᩻") ^ i6) * (-71);
                        i7 = ((iM11307 ^ i5) * (-3833)) ^ 1547155717;
                        i3 = -1292288705;
                        i8 = iM11307 ^ i3;
                        viewOnClickListenerC2231 = this;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡۬") ^ i5;
                        i = ((iM11306 ^ i6) * 26879) ^ (-258060782);
                        i2 = 919869338;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    }
                    break;
                case -2003804257:
                case 440780982:
                    textView = viewOnClickListenerC2231.f8012;
                    if (C2249.m6915() <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡۬") ^ i5;
                        i = ((iM11306 ^ i6) * 26879) ^ (-258060782);
                        i2 = 919869338;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۢ") ^ i5;
                        i = ((iM11306 ^ i6) * (-31515)) ^ (-115743547);
                        i2 = 2042901088;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1930118925:
                case -1326846499:
                    c = 7;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = C19806.m45029("ۘۘ") ^ i6;
                        i = ((iM11306 ^ i5) * o.a.B) ^ 1207966824;
                        i2 = -134338053;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰܳ") ^ i6;
                        i = ((iM11306 ^ i5) * (-14973)) ^ (-1019789735);
                        i2 = 2039835543;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1883980529:
                case 721530503:
                    i14 = 10948;
                    iM11306 = (i5 - C19806.m45029("۟ܽ")) * (-87);
                    i = ((iM11306 ^ i6) * (-31151)) ^ (-1802122072);
                    i2 = 1675375529;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1444652439:
                case 1729278159:
                    ThreadFactoryC3888.m11303(textView, iM11308 ^ i9);
                    activityC5054.m14072();
                    iM11306 = (ThreadFactoryC3888.m11306("۫ܶ") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i = ((iM11306 ^ i5) * 18499) ^ (-752503563);
                    i2 = 1542205429;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1433911713:
                case 368825285:
                    if (i12 - (i13 + 1) >= 0) {
                        iM11306 = (C19806.m45029("ۨᩴ") ^ i5) * (-107);
                        i = ((iM11306 ^ i6) * (-32665)) ^ 271313428;
                        i2 = -134679703;
                    } else {
                        iM11306 = (i6 - C19806.m45029("ۖۙ")) * (-105);
                        i = ((iM11306 ^ i5) * 12215) ^ 1449975603;
                        i2 = -1265271018;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1156966637:
                case 1714349381:
                    i11 = s + s2;
                    if (C2642.f10294 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۘ") ^ i5) * 49;
                        i = ((iM11306 ^ i6) * 28075) ^ 387096906;
                        i2 = -1614271885;
                    } else {
                        iM11306 = (C19806.m45029("ۖܽ") ^ i6) * q.h;
                        i = ((iM11306 ^ i5) * (-12363)) ^ (-1717928085);
                        i2 = -1294472877;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -1029080727:
                case 1993011659:
                    i14 = 45560;
                    iM11306 = (i5 - C19806.m45029("۟ܽ")) * (-87);
                    i = ((iM11306 ^ i6) * (-31151)) ^ (-1802122072);
                    i2 = 1675375529;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -885720569:
                case 2099652307:
                    sArr3 = f8009;
                    i15 = 8;
                    i10 = 3;
                    if (C10634.f36300 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡۬") ^ i5;
                        i = ((iM11306 ^ i6) * 26879) ^ (-258060782);
                        i2 = 919869338;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰۢ") ^ i5;
                        i = ((iM11306 ^ i6) * 18239) ^ 1602922955;
                        i2 = 1500539697;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case -539531369:
                case -236139593:
                    C3577.m10565();
                    if (!RunnableC3388.m10064()) {
                        sArr = sArr2;
                        int iM11309 = (ThreadFactoryC3888.m11306("֡᩸") ^ i5) * 47;
                        i8 = iM11309 ^ 1515481575;
                        sArr2 = sArr;
                        i7 = ((iM11309 ^ i6) * (-5599)) ^ 642927210;
                        viewOnClickListenerC2231 = this;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡۬") ^ i5;
                        i = ((iM11306 ^ i6) * 26879) ^ (-258060782);
                        i2 = 919869338;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    }
                    break;
                case -505415768:
                case -294680685:
                    sArr = f8009;
                    if (C2477.f9839 > 0) {
                        int iM450210 = (C19806.m45029("֫ܳ") + i5) * (-61);
                        i = ((iM450210 ^ i6) * 20647) ^ 753859140;
                        i8 = iM450210 ^ (-327806335);
                        viewOnClickListenerC2231 = this;
                        sArr2 = sArr;
                        i7 = i;
                    } else {
                        int iM113010 = (ThreadFactoryC3888.m11306("֡᩸") ^ i5) * 47;
                        i8 = iM113010 ^ 1515481575;
                        sArr2 = sArr;
                        i7 = ((iM113010 ^ i6) * (-5599)) ^ 642927210;
                        viewOnClickListenerC2231 = this;
                    }
                    break;
                case -343892977:
                case 1470792152:
                    iM11308 = ThreadFactoryC3888.m11306(C0526.m2424(sArr3, i15, i10, i14));
                    i9 = 2123373170;
                    if (C3577.f13150 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩷ᩳ") ^ i6) * 95;
                        i = ((iM11306 ^ i5) * 235) ^ 814414516;
                        i2 = -1902290443;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܰ᩻") ^ i6) * (-71);
                        i7 = ((iM11307 ^ i5) * (-3833)) ^ 1547155717;
                        i3 = -1292288705;
                        i8 = iM11307 ^ i3;
                        viewOnClickListenerC2231 = this;
                    }
                    break;
                case -64069926:
                case 1066374712:
                    i12 = i11 * i11;
                    i13 = s * 2;
                    if (C1148.f5161 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܰۘ") ^ i5) * 49;
                        i = ((iM11306 ^ i6) * 28075) ^ 387096906;
                        i2 = -1614271885;
                    } else {
                        iM11306 = (C19806.m45029("᩻ۛ") + i5) * 95;
                        i = ((iM11306 ^ i6) * 10739) ^ 447346544;
                        i2 = 2108808689;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 262416049:
                case 1964185209:
                    if (C0817.m3399()) {
                        iM11307 = ThreadFactoryC3888.m11306("ۚ᩶") ^ i6;
                        i7 = ((iM11307 ^ i5) * 28471) ^ 1985929373;
                        i3 = -888054123;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܰ᩻") ^ i6) * (-71);
                        i7 = ((iM11307 ^ i5) * (-3833)) ^ 1547155717;
                        i3 = -1292288705;
                    }
                    i8 = iM11307 ^ i3;
                    viewOnClickListenerC2231 = this;
                    break;
                case 434866442:
                case 1901768678:
                    break;
                case 724404470:
                case 2133440016:
                    C3577.m10565();
                    iM11306 = ThreadFactoryC3888.m11306("֡۬") ^ i5;
                    i = ((iM11306 ^ i6) * 26879) ^ (-258060782);
                    i2 = 919869338;
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
                case 953538920:
                case 1558952526:
                    s = sArr2[c];
                    s2 = 1;
                    if (!C0962.f3784) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۗ") + i5) * 11;
                        i = ((iM11306 ^ i6) * (-23241)) ^ (-461711336);
                        i2 = 189804523;
                        i8 = iM11306 ^ i2;
                        i7 = i;
                    } else {
                        iM11307 = (ThreadFactoryC3888.m11306("ܰ᩻") ^ i6) * (-71);
                        i7 = ((iM11307 ^ i5) * (-3833)) ^ 1547155717;
                        i3 = -1292288705;
                        i8 = iM11307 ^ i3;
                        viewOnClickListenerC2231 = this;
                    }
                    break;
                default:
                    C3722.m10890(viewOnClickListenerC2231.f8011, 0);
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("ۘۘ") ^ i6;
                        i = ((iM11306 ^ i5) * o.a.B) ^ 1207966824;
                        i2 = -134338053;
                    } else {
                        iM11306 = C19806.m45029("֨ᩳ") ^ i6;
                        i = ((iM11306 ^ i5) * (-29271)) ^ 1272593292;
                        i2 = -1376870002;
                    }
                    i8 = iM11306 ^ i2;
                    i7 = i;
                    break;
            }
            return;
        }
    }
}
