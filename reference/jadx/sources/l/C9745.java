package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۢ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: FA3A */
/* JADX INFO: loaded from: classes3.dex */
public class C9745 extends Drawable {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f31427 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Canvas f31428;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Paint f31429;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f31430;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f31431;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float f31432;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BitmapDrawable f31433;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f31434;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        Paint paint = null;
        Canvas canvas2 = null;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = -1231684986;
        int i2 = C1321.f4751;
        int i3 = C1542.f5343;
        int iM3169 = (C0773.m3169("ܳ᩹") + i2) * (-89);
        int i4 = ((iM3169 ^ i3) * (-21257)) ^ 1410210821;
        int i5 = 1457260848;
        while (true) {
            i = ((((i ^ i3) * 11893) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2091501709:
                case 954924824:
                    canvas2.drawCircle(f4, f5, f3, paint);
                    this.f31433.draw(canvas);
                    break;
                case -2082082828:
                case -297593957:
                    f3 = f * f2;
                    paint = this.f31429;
                    if (C3033.m9845() <= 0) {
                        iM3169 = (i2 - C0619.m2761("ۤܿ")) * 63;
                        i4 = ((iM3169 ^ i3) * 4401) ^ (-722820528);
                        i5 = -527732438;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩵֡")) * 101;
                        i4 = ((iM3169 ^ i2) * (-28557)) ^ 1031421424;
                        i5 = 1568013341;
                    }
                    break;
                case -1658152853:
                case 771140168:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("ܳ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25847) ^ 1087893895;
                        i5 = -1169038004;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۛ۟")) * (-97);
                        i4 = ((iM3169 ^ i2) * 16379) ^ 770784906;
                        i5 = -2054121609;
                    }
                    break;
                case -1604528744:
                case -527885303:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("ܳ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25847) ^ 1087893895;
                        i5 = -1169038004;
                    } else {
                        iM3169 = C0619.m2761("᩵ܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 1677) ^ (-1186789475);
                        i5 = -1955770798;
                    }
                    break;
                case -1490070138:
                case 1175893403:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0619.m2761("ܽܶ") + i3) * 59;
                        i4 = ((iM3169 ^ i2) * 10683) ^ 134157250;
                        i5 = 996974588;
                    } else {
                        iM3169 = C0773.m3169("ۛۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 2771) ^ (-876261958);
                        i5 = 10940890;
                    }
                    break;
                case -1390359217:
                case 1859506832:
                    C2834.m9344();
                    RunnableC1848.m6360();
                    break;
                case -1354825731:
                case -118715476:
                    canvas2 = this.f31428;
                    f4 = this.f31431;
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("ܳ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25847) ^ 1087893895;
                        i5 = -1169038004;
                    } else {
                        iM3169 = (C0619.m2761("ܶ᩸") + i3) * 123;
                        i4 = ((iM3169 ^ i2) * (-23433)) ^ 1154899025;
                        i5 = -2055183567;
                    }
                    break;
                case -1210464433:
                case -510653836:
                    f = this.f31432;
                    if (C1146.f4234 >= 0) {
                        iM3169 = (i2 - C0619.m2761("ۤܿ")) * 63;
                        i4 = ((iM3169 ^ i3) * 4401) ^ (-722820528);
                        i5 = -527732438;
                    } else {
                        iM3169 = (i2 - C0619.m2761("᩸ۚ")) * 13;
                        i4 = ((iM3169 ^ i3) * (-3825)) ^ 41216970;
                        i5 = 1996014424;
                    }
                    break;
                case -1131472490:
                case 535024714:
                    AbstractC0116.m1243();
                    if (!C2878.f9462) {
                        iM3169 = (C0619.m2761("ܽܶ") + i3) * 59;
                        i4 = ((iM3169 ^ i2) * 10683) ^ 134157250;
                        i5 = 996974588;
                    } else {
                        iM3169 = (C0619.m2761("۟᩶") + i3) * 47;
                        i4 = ((iM3169 ^ i2) * (-663)) ^ 719162870;
                        i5 = 2029987023;
                    }
                    break;
                case -940632277:
                case -290421395:
                    f5 = this.f31430;
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0619.m2761("۟᩶") + i3) * 47;
                        i4 = ((iM3169 ^ i2) * (-663)) ^ 719162870;
                        i5 = 2029987023;
                    } else {
                        iM3169 = (C0619.m2761("᩹᩸") + i2) * 87;
                        i4 = ((iM3169 ^ i3) * (-9761)) ^ (-800573907);
                        i5 = -1476843186;
                    }
                    break;
                case -758106725:
                case 1934369069:
                    C4238.m13540();
                    RunnableC3055.m9933();
                    iM3169 = C0619.m2761("۠֡") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-6699)) ^ (-1861252079);
                    i5 = -934422742;
                    break;
                case 14346224:
                case 56727069:
                    f2 = this.f31434;
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("۠֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6699)) ^ (-1861252079);
                        i5 = -934422742;
                    } else {
                        iM3169 = C0773.m3169("᩷ܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 16613) ^ 1504113195;
                        i5 = 1222178627;
                    }
                    break;
                case 31529506:
                case 848384850:
                    if (C23916.m53419() != 0) {
                        iM3169 = C0773.m3169("ܳ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * 25847) ^ 1087893895;
                        i5 = -1169038004;
                    } else {
                        iM3169 = C0619.m2761("۠֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6699)) ^ (-1861252079);
                        i5 = -934422742;
                    }
                    break;
                case 482991150:
                case 1938567147:
                    C0773.m3161();
                    if (C3099.f10023 > 0) {
                        iM3169 = (C0619.m2761("ܽܶ") + i3) * 59;
                        i4 = ((iM3169 ^ i2) * 10683) ^ 134157250;
                        i5 = 996974588;
                    } else {
                        iM3169 = C0619.m2761("۠֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6699)) ^ (-1861252079);
                        i5 = -934422742;
                    }
                    break;
                case 1095416655:
                case 1113557687:
                    if (C0619.f2439) {
                        iM3169 = (i2 - C0619.m2761("ۤܿ")) * 63;
                        i4 = ((iM3169 ^ i3) * 4401) ^ (-722820528);
                        i5 = -527732438;
                    } else {
                        iM3169 = C0773.m3169("۫ۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12611) ^ 2109524297;
                        i5 = -527517781;
                    }
                    break;
                default:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("۠֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6699)) ^ (-1861252079);
                        i5 = -934422742;
                    } else {
                        iM3169 = C0773.m3169("᩵ۘ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-14453)) ^ (-630273011);
                        i5 = -1444157658;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i = -1317491548;
        int i2 = C3099.f10023;
        int i3 = C0950.f3488;
        int iM3169 = (i2 - C0773.m3169("ܺܳ")) * (-21);
        int i4 = ((iM3169 ^ i3) * (-1841)) ^ 1593838394;
        int i5 = -1043283124;
        while (true) {
            i = ((((i ^ i3) * (-23895)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2144178685:
                case 2032374570:
                    super.onBoundsChange(rect);
                    if (C3690.m11987()) {
                        iM3169 = C0619.m2761("᩺ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-32739)) ^ 1852336518;
                        i5 = -793102435;
                    } else {
                        iM3169 = (C0619.m2761("۫֫") ^ i3) * (-27);
                        i4 = ((iM3169 ^ i2) * 5827) ^ 1269827012;
                        i5 = 1785392235;
                    }
                    break;
                case -1997801797:
                case -1277869281:
                    RunnableC0334.m2063();
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0619.m2761("ۗۨ") + i2) * (-103);
                        i4 = ((iM3169 ^ i3) * 17291) ^ (-378384038);
                        i5 = -1730480640;
                    } else {
                        iM3169 = (C0619.m2761("ۛ֨") ^ i2) * (-21);
                        i4 = ((iM3169 ^ i3) * 28499) ^ (-263059285);
                        i5 = -33406208;
                    }
                    break;
                case -1907025580:
                case -308826524:
                    C1080.m4050();
                    C2702.m8876();
                    iM3169 = (C0619.m2761("ۛ֨") ^ i2) * (-21);
                    i4 = ((iM3169 ^ i3) * 28499) ^ (-263059285);
                    i5 = -33406208;
                    break;
                case -1759407109:
                case 1532221440:
                    if (C13473.f42873 != 0) {
                        iM3169 = (i3 - C0773.m3169("֫ܿ")) * (-113);
                        i4 = ((iM3169 ^ i2) * (-979)) ^ (-845075142);
                        i5 = 1516576278;
                    } else {
                        iM3169 = C0773.m3169("ۛ᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-15761)) ^ 1896750646;
                        i5 = 561088343;
                    }
                    break;
                case -1699771054:
                case 477521502:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩺") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * (-31783)) ^ (-1055331256);
                        i5 = -165252902;
                    } else {
                        iM3169 = (C0619.m2761("ۛ֨") ^ i2) * (-21);
                        i4 = ((iM3169 ^ i3) * 28499) ^ (-263059285);
                        i5 = -33406208;
                    }
                    break;
                case -1688995687:
                case -961514673:
                    if (AbstractC3624.f12429 <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩺") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * (-31783)) ^ (-1055331256);
                        i5 = -165252902;
                    } else {
                        iM3169 = (C0773.m3169("۫ۚ") ^ i3) * (-125);
                        i4 = ((iM3169 ^ i2) * (-19101)) ^ (-1783689982);
                        i5 = -862538344;
                    }
                    break;
                case -1250620442:
                case 812466908:
                    if (C1080.m4050()) {
                        iM3169 = (C0619.m2761("ܿ᩶") + i3) * 51;
                        i4 = ((iM3169 ^ i2) * (-30429)) ^ 39370151;
                        i5 = -1570447454;
                    } else {
                        iM3169 = (C0619.m2761("ۘ᩺") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * (-31783)) ^ (-1055331256);
                        i5 = -165252902;
                    }
                    break;
                case -1114816675:
                case 1061229305:
                    C1080.m4050();
                    C1519.m5403();
                    break;
                case -1081856005:
                case 2039824673:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("ۗۨ") + i2) * (-103);
                        i4 = ((iM3169 ^ i3) * 17291) ^ (-378384038);
                        i5 = -1730480640;
                    } else {
                        iM3169 = C0773.m3169("᩹᩺") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32547) ^ 227063479;
                        i5 = -272485655;
                    }
                    break;
                case -968605049:
                case 1903903544:
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("ۙ᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-9395)) ^ (-1060944377);
                        i5 = 340782628;
                    } else {
                        iM3169 = (C0619.m2761("ۘ᩺") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * (-31783)) ^ (-1055331256);
                        i5 = -165252902;
                    }
                    break;
                case -481655503:
                case 270131998:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0619.m2761("ۛ֨") ^ i2) * (-21);
                        i4 = ((iM3169 ^ i3) * 28499) ^ (-263059285);
                        i5 = -33406208;
                    } else {
                        iM3169 = (C0773.m3169("۟۫") ^ i2) * (-5);
                        i4 = ((iM3169 ^ i3) * 31277) ^ (-595950304);
                        i5 = -217033976;
                    }
                    break;
                case -291509473:
                case 1386108916:
                    RunnableC3055.m9933();
                    if (C2834.f9334 <= 0) {
                        iM3169 = (i3 - C0773.m3169("֫ܿ")) * (-113);
                        i4 = ((iM3169 ^ i2) * (-979)) ^ (-845075142);
                        i5 = 1516576278;
                    } else {
                        iM3169 = (C0619.m2761("ۘ᩺") + i3) * 73;
                        i4 = ((iM3169 ^ i2) * (-31783)) ^ (-1055331256);
                        i5 = -165252902;
                    }
                    break;
                case 9742819:
                case 993900340:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (i3 - C0773.m3169("֫ܿ")) * (-113);
                        i4 = ((iM3169 ^ i2) * (-979)) ^ (-845075142);
                        i5 = 1516576278;
                    } else {
                        iM3169 = (C0773.m3169("ۧ۬") + i2) * 97;
                        i4 = ((iM3169 ^ i3) * (-27919)) ^ 1459740641;
                        i5 = -1317737276;
                    }
                    break;
                case 801627965:
                case 1678105815:
                    this.f31433.setBounds(rect);
                    break;
                case 1277033058:
                case 1533827975:
                    if (C1343.m4943()) {
                        iM3169 = C0773.m3169("᩸ۖ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31313) ^ 1070749647;
                        i5 = -864324238;
                    } else {
                        iM3169 = (i3 - C0773.m3169("֫ܿ")) * (-113);
                        i4 = ((iM3169 ^ i2) * (-979)) ^ (-845075142);
                        i5 = 1516576278;
                    }
                    break;
                default:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (C0619.m2761("ۗۨ") + i2) * (-103);
                        i4 = ((iM3169 ^ i3) * 17291) ^ (-378384038);
                        i5 = -1730480640;
                    } else {
                        iM3169 = C0773.m3169("᩺ۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 687) ^ 2121301985;
                        i5 = -430707012;
                    }
                    break;
            }
            return;
        }
    }

    public C9745(Bitmap bitmap, float f, float f2) {
        int iM3169;
        int i;
        int iM31610;
        Canvas canvas;
        int i2;
        int i3;
        C9745 c9745 = this;
        Canvas canvas2 = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        double dSqrt = 0.0d;
        int i7 = 0;
        int i8 = 577676545;
        int i9 = C0950.f3488;
        int i10 = C3033.f9831;
        int iM2761 = C0619.m2761("ܺ᩶") ^ i10;
        int i11 = ((iM2761 ^ i9) * (-13183)) ^ (-82167769);
        int i12 = 306167224;
        while (true) {
            int i13 = iM2761 ^ i12;
            Paint paint = null;
            while (true) {
                i8 = ((((i8 ^ i9) * 19699) >> 31) & i11) ^ i13;
                switch (i8) {
                    case -2112199963:
                    case -574762830:
                        paint.setColor(i7);
                        paint.setStyle(Paint.Style.FILL);
                        if (C3734.f12817 < 0) {
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                            return;
                        }
                        iM31610 = C0619.m2761("۟᩵") ^ i10;
                        canvas = canvas2;
                        i2 = ((iM31610 ^ i9) * (-24393)) ^ (-1841156776);
                        i3 = -2091237751;
                        i11 = i2;
                        i13 = iM31610 ^ i3;
                        canvas2 = canvas;
                        break;
                    case -1891241796:
                    case -1286577563:
                        c9745.f31432 = (float) dSqrt;
                        if (C2966.f9654 >= 0) {
                            iM2761 = (C0619.m2761("۫ܶ") + i9) * 123;
                            i11 = ((iM2761 ^ i10) * 16689) ^ 1486050433;
                            i12 = 1553492299;
                        } else if (AbstractC0641.f2496 < 0) {
                            paint = new Paint(1);
                            c9745.f31429 = paint;
                            i7 = 0;
                            if (RunnableC0334.f1808 <= 0) {
                                iM3169 = (C0773.m3169("֨ۨ") ^ i9) * 7;
                                i11 = ((iM3169 ^ i10) * (-27887)) ^ 573688702;
                                i = -61738229;
                            } else {
                                iM3169 = C0619.m2761("֫ᩳ") ^ i10;
                                i11 = ((iM3169 ^ i9) * 31591) ^ (-901035179);
                                i = 845232432;
                            }
                            i13 = iM3169 ^ i;
                        } else {
                            iM2761 = (C0773.m3169("ۗ۫") + i10) * (-79);
                            i11 = ((iM2761 ^ i9) * (-26827)) ^ (-1455934742);
                            i12 = 1105848865;
                        }
                        break;
                    case -1453389565:
                    case 1011977714:
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        int i14 = width * width;
                        if (C3779.f12953 > 0) {
                            int iM2762 = C0619.m2761("ۚ᩵") ^ i10;
                            i11 = ((iM2762 ^ i9) * (-13037)) ^ (-573496215);
                            i13 = iM2762 ^ (-2083765127);
                            i5 = i14;
                            i4 = height;
                        } else {
                            i5 = i14;
                            i4 = height;
                            iM2761 = (C0773.m3169("ۗ۫") + i10) * (-79);
                            i11 = ((iM2761 ^ i9) * (-26827)) ^ (-1455934742);
                            i12 = 1105848865;
                        }
                        break;
                    case -1155234017:
                    case 298528079:
                        C1519.m5403();
                        C2023.m6964();
                        int iM31611 = (C0773.m3169("ۢᩳ") + i9) * 87;
                        i11 = ((iM31611 ^ i10) * 4433) ^ (-1191083714);
                        i13 = iM31611 ^ (-1568783135);
                        c9745 = this;
                        break;
                    case -1097213773:
                    case -35429266:
                        c9745.f31433 = new BitmapDrawable(bitmap);
                        if (C0619.f2439) {
                            int iM31612 = (C0773.m3169("ۢᩳ") + i9) * 87;
                            i11 = ((iM31612 ^ i10) * 4433) ^ (-1191083714);
                            i13 = iM31612 ^ (-1568783135);
                        } else {
                            int iM2763 = C0619.m2761("ۨ᩵") ^ i10;
                            i13 = iM2763 ^ (-659626604);
                            i11 = ((iM2763 ^ i9) * (-5909)) ^ (-1674492702);
                        }
                        c9745 = this;
                        break;
                    case -1033909222:
                    case 486398085:
                        AbstractC0641.m2813();
                        throw new RuntimeException();
                    case -562294273:
                    case 1106578367:
                        if (C1321.f4751 >= 0) {
                            iM2761 = (C0773.m3169("ۗ۫") + i10) * (-79);
                            i11 = ((iM2761 ^ i9) * (-26827)) ^ (-1455934742);
                            i12 = 1105848865;
                        }
                        int iM31613 = (C0773.m3169("ۢᩳ") + i9) * 87;
                        i11 = ((iM31613 ^ i10) * 4433) ^ (-1191083714);
                        i13 = iM31613 ^ (-1568783135);
                        c9745 = this;
                        break;
                    case -416810064:
                    case -20725498:
                        C3492.m11488();
                        if (C23916.f77426 <= 0) {
                            iM2761 = (C0773.m3169("ۗ۫") + i10) * (-79);
                            i11 = ((iM2761 ^ i9) * (-26827)) ^ (-1455934742);
                            i12 = 1105848865;
                        }
                        iM31610 = C0619.m2761("۟᩵") ^ i10;
                        canvas = canvas2;
                        i2 = ((iM31610 ^ i9) * (-24393)) ^ (-1841156776);
                        i3 = -2091237751;
                        i11 = i2;
                        i13 = iM31610 ^ i3;
                        canvas2 = canvas;
                        break;
                    case -122377107:
                    case 1215007151:
                        c9745.f31428 = canvas2;
                        c9745.f31431 = f;
                        c9745.f31430 = f2;
                        if (RunnableC0334.m2063()) {
                            int iM31614 = (C0773.m3169("ۢᩳ") + i9) * 87;
                            i11 = ((iM31614 ^ i10) * 4433) ^ (-1191083714);
                            i13 = iM31614 ^ (-1568783135);
                            c9745 = this;
                        } else {
                            int iM2764 = C0619.m2761("᩺᩹") ^ i9;
                            i11 = ((iM2764 ^ i10) * 1029) ^ (-1514320532);
                            i13 = iM2764 ^ 1048039440;
                        }
                        break;
                    case 39045016:
                    case 1379558139:
                        dSqrt = Math.sqrt(i6 + i5);
                        if (C2354.f7599 < 0) {
                            iM3169 = C0773.m3169("ᩴܰ") ^ i10;
                            i11 = ((iM3169 ^ i9) * 29337) ^ 229487603;
                            i = 1552906995;
                            i13 = iM3169 ^ i;
                        } else {
                            iM2761 = (C0619.m2761("۫ܶ") + i9) * 123;
                            i11 = ((iM2761 ^ i10) * 16689) ^ 1486050433;
                            i12 = 1553492299;
                        }
                        break;
                    case 930231987:
                    case 2009082696:
                        canvas2 = new Canvas(bitmap);
                        if (C1343.f4799 != 0) {
                            iM31610 = C0619.m2761("۟᩵") ^ i10;
                            canvas = canvas2;
                            i2 = ((iM31610 ^ i9) * (-24393)) ^ (-1841156776);
                            i3 = -2091237751;
                        } else {
                            iM31610 = C0773.m3169("ۢ᩹") ^ i9;
                            canvas = canvas2;
                            i2 = ((iM31610 ^ i10) * (-21043)) ^ 454306335;
                            i3 = -549392300;
                        }
                        i11 = i2;
                        i13 = iM31610 ^ i3;
                        canvas2 = canvas;
                        break;
                    case 1216143005:
                    case 1820783189:
                        if (!C1146.m4231()) {
                            int iM31615 = (C0773.m3169("ۢᩳ") + i9) * 87;
                            i11 = ((iM31615 ^ i10) * 4433) ^ (-1191083714);
                            i13 = iM31615 ^ (-1568783135);
                            c9745 = this;
                        } else {
                            iM3169 = (C0773.m3169("֨ۨ") ^ i9) * 7;
                            i11 = ((iM3169 ^ i10) * (-27887)) ^ 573688702;
                            i = -61738229;
                            i13 = iM3169 ^ i;
                        }
                        break;
                    default:
                        i6 = i4 * i4;
                        if (C2702.f8586 > 0) {
                            iM3169 = C0619.m2761("ۗۚ") ^ i9;
                            i11 = ((iM3169 ^ i10) * 2431) ^ (-440175240);
                            i = -988729804;
                            i13 = iM3169 ^ i;
                        } else {
                            iM2761 = (C0773.m3169("ۗ۫") + i10) * (-79);
                            i11 = ((iM2761 ^ i9) * (-26827)) ^ (-1455934742);
                            i12 = 1105848865;
                        }
                        break;
                }
            }
        }
    }

    @InterfaceC19352
    public void setProgress(float f) {
        this.f31434 = f;
        invalidateSelf();
    }
}
