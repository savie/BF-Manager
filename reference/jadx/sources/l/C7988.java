package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.style.ReplacementSpan;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes3.dex */
public final class C7988 extends ReplacementSpan {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Paint f26223;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Path f26224;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int iM5054 = 0;
        float fM26822 = 0.0f;
        int iM3867 = 0;
        int iM5055 = 0;
        int iRound = 0;
        Paint.FontMetricsInt fontMetricsInt2 = null;
        int i3 = -755080568;
        int i4 = RunnableC3388.f12514;
        int i5 = RunnableC1606.f6488;
        int iM45029 = C19806.m45029("ܺۨ") ^ i5;
        int i6 = ((iM45029 ^ i4) * (-1939)) ^ (-1443452042);
        int i7 = -61615862;
        while (true) {
            i3 = ((((i3 ^ i4) * 23181) >> 31) & i6) ^ (iM45029 ^ i7);
            switch (i3) {
                case -1707049995:
                case 821578453:
                    iM5054 = C1460.m5054(3.0f);
                    fM26822 = C10634.m26822(paint) * 0.2f;
                    if (C3577.f13150 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩻") + i4) * (-11);
                        i6 = ((iM45029 ^ i5) * 10695) ^ 2136009673;
                        i7 = 291865146;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۗ") + i5) * 65;
                        i6 = ((iM45029 ^ i4) * 16013) ^ (-1707030353);
                        i7 = -674215881;
                    }
                    break;
                case -1640130419:
                case -187390358:
                    C0671.m3008();
                    iM45029 = (ThreadFactoryC3888.m11306("֫ۢ") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i6 = ((iM45029 ^ i5) * 29781) ^ 1252589665;
                    i7 = -1804380167;
                    break;
                case -1451612992:
                case -1141860677:
                    fontMetricsInt2 = paint.getFontMetricsInt();
                    fontMetricsInt.ascent = fontMetricsInt2.ascent;
                    fontMetricsInt.descent = fontMetricsInt2.descent;
                    if (RunnableC3388.m10064()) {
                        iM45029 = ThreadFactoryC3888.m11306("ܽۚ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 14345) ^ 232325328;
                        i7 = 1687793422;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۢ") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM45029 ^ i5) * 29781) ^ 1252589665;
                        i7 = -1804380167;
                    }
                    break;
                case -1374396735:
                case -300567703:
                    RunnableC1895.m6170();
                    if (C2124.f7782 > 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩻") + i4) * (-11);
                        i6 = ((iM45029 ^ i5) * 10695) ^ 2136009673;
                        i7 = 291865146;
                    } else {
                        iM45029 = C19806.m45029("ۡۛ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-4723)) ^ (-962461122);
                        i7 = 453225640;
                    }
                    break;
                case -1317516445:
                case 841723475:
                    iM3867 = C1025.m3867(iM5054, Math.round(fM26822));
                    iM5055 = C1460.m5054(4.0f);
                    if (C0671.f2816 != 0) {
                        iM45029 = C19806.m45029("۟ۗ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 30961) ^ 790926016;
                        i7 = 83924021;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠᩻") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-3315)) ^ (-2043703718);
                        i7 = -908458217;
                    }
                    break;
                case -1131358160:
                case 1307512252:
                    if (CallableC1627.m5507() != 0) {
                        iM45029 = C19806.m45029("۟ۗ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 30961) ^ 790926016;
                        i7 = 83924021;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֡ܽ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 25329) ^ 250063875;
                        i7 = -73642862;
                    }
                    break;
                case -974534026:
                case -90588788:
                    fontMetricsInt.top = fontMetricsInt2.top;
                    fontMetricsInt.bottom = fontMetricsInt2.bottom;
                    iM45029 = ThreadFactoryC3888.m11306("ۖۚ") ^ i4;
                    i6 = ((iM45029 ^ i5) * (-16265)) ^ 1095112677;
                    i7 = -1359453778;
                    break;
                case -648891719:
                case 1704724625:
                    if (C3577.f13150 >= 0) {
                        iM45029 = C19806.m45029("۟ۗ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 30961) ^ 790926016;
                        i7 = 83924021;
                    } else {
                        iM45029 = (i5 - C19806.m45029("ۗ֫")) * (-57);
                        i6 = ((iM45029 ^ i4) * 17647) ^ (-719987030);
                        i7 = -35599207;
                    }
                    break;
                case -466836352:
                case 978515473:
                    C0797.m3359();
                    return 0;
                case -196756545:
                case 1332861374:
                    if (C1066.f4915 <= 0) {
                        iM45029 = C19806.m45029("۟ۗ") ^ i4;
                        i6 = ((iM45029 ^ i5) * 30961) ^ 790926016;
                        i7 = 83924021;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۨ᩺")) * (-9);
                        i6 = ((iM45029 ^ i5) * (-18887)) ^ 1843519831;
                        i7 = -848351909;
                    }
                    break;
                case 10704159:
                case 327475516:
                    if (ThreadFactoryC3888.f14547 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩻") + i4) * (-11);
                        i6 = ((iM45029 ^ i5) * 10695) ^ 2136009673;
                        i7 = 291865146;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۠֨") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i6 = ((iM45029 ^ i4) * 26413) ^ (-2109956510);
                        i7 = -1950326321;
                    }
                    break;
                case 26771495:
                case 613337588:
                    if (!C3743.f13569) {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ۢ") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((iM45029 ^ i5) * 29781) ^ 1252589665;
                        i7 = -1804380167;
                    } else {
                        iM45029 = C19806.m45029("ۡۛ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-4723)) ^ (-962461122);
                        i7 = 453225640;
                    }
                    break;
                case 83467680:
                case 680514188:
                    if (C0962.f3784) {
                        iM45029 = C19806.m45029("֫ܽ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 30229) ^ (-204967279);
                        i7 = 29545283;
                    } else {
                        iM45029 = C19806.m45029("᩺ۨ") ^ i5;
                        i6 = ((iM45029 ^ i4) * (-2411)) ^ (-1307549042);
                        i7 = -1718157941;
                    }
                    break;
                case 638402132:
                case 1927469250:
                    iRound = Math.round(C1066.m4030(paint) * 0.14f);
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("۫֡") ^ i4;
                        i6 = ((iM45029 ^ i5) * 26711) ^ 1356452435;
                        i7 = -591796693;
                    } else {
                        iM45029 = C19806.m45029("֫ܽ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 30229) ^ (-204967279);
                        i7 = 29545283;
                    }
                    break;
                case 856069262:
                case 1984041213:
                    if (fontMetricsInt != null) {
                        iM45029 = (i5 - ThreadFactoryC3888.m11306("ۗܿ")) * (-101);
                        i6 = ((iM45029 ^ i4) * 26879) ^ (-424687862);
                        i7 = -606185845;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۚ") ^ i4;
                        i6 = ((iM45029 ^ i5) * (-16265)) ^ 1095112677;
                        i7 = -1359453778;
                    }
                    break;
                case 871249730:
                case 1690398309:
                    if (C1419.f5860 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩻") + i4) * (-11);
                        i6 = ((iM45029 ^ i5) * 10695) ^ 2136009673;
                        i7 = 291865146;
                    } else {
                        iM45029 = C19806.m45029("֫᩻") ^ i4;
                        i6 = ((iM45029 ^ i5) * 21997) ^ 985846695;
                        i7 = -1232082685;
                    }
                    break;
                case 1119472514:
                case 2095858358:
                    return (C0797.m3360(iM5055, iRound) * 2) + iM3867;
                default:
                    C10634.m26820();
                    if (C1377.m4833() == 0) {
                        iM45029 = C19806.m45029("֫ܽ") ^ i5;
                        i6 = ((iM45029 ^ i4) * 30229) ^ (-204967279);
                        i7 = 29545283;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۤ᩻") + i4) * (-11);
                        i6 = ((iM45029 ^ i5) * 10695) ^ 2136009673;
                        i7 = 291865146;
                    }
                    break;
            }
        }
    }

    public C7988() {
        int iM11306;
        int i;
        int i2 = -148818661;
        int i3 = C3722.f13525;
        int i4 = C1419.f5860;
        int iM11307 = ThreadFactoryC3888.m11306("ۤᩴ") ^ i3;
        int i5 = ((iM11307 ^ i4) * 30475) ^ 20912023;
        int i6 = -2067854852;
        while (true) {
            int i7 = iM11307 ^ i6;
            Paint paint = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-3453)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1847367805:
                    case -1084496316:
                        if (!C1377.f5749) {
                            iM11307 = (ThreadFactoryC3888.m11306("۠ۢ") + i3) * 15;
                            i5 = ((iM11307 ^ i4) * (-11611)) ^ 199323773;
                            i6 = 1975463160;
                        } else {
                            iM11307 = C19806.m45029("ܿ᩵") ^ i4;
                            i5 = ((iM11307 ^ i3) * 21977) ^ (-1432813815);
                            i6 = 301315050;
                        }
                        break;
                    case -1581134282:
                    case 1264085041:
                        if (C2477.f9839 > 0) {
                            if (C1377.f5749) {
                                if (C3577.f13150 >= 0) {
                                    iM11307 = (ThreadFactoryC3888.m11306("۬۟") + i4) * 123;
                                    i5 = ((iM11307 ^ i3) * 13553) ^ 2138991045;
                                    i6 = -255880283;
                                } else if (C2704.m8255() > 0) {
                                    if (RunnableC1895.f7152 && RunnableC3388.f12514 < 0) {
                                        if (C2477.m7593() < 0) {
                                            if (!RunnableC1564.f6300) {
                                                paint = new Paint(1);
                                                if (C3722.f13525 > 0) {
                                                    iM11306 = (ThreadFactoryC3888.m11306("ۘۡ") + i4) * 31;
                                                    i5 = ((iM11306 ^ i3) * (-23531)) ^ 1705244758;
                                                    i = -1559879095;
                                                    i7 = iM11306 ^ i;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    iM11307 = (ThreadFactoryC3888.m11306("۠ۢ") + i3) * 15;
                                    i5 = ((iM11307 ^ i4) * (-11611)) ^ 199323773;
                                    i6 = 1975463160;
                                } else {
                                    iM11307 = C19806.m45029("ܿ᩵") ^ i4;
                                    i5 = ((iM11307 ^ i3) * 21977) ^ (-1432813815);
                                    i6 = 301315050;
                                }
                                break;
                            }
                            iM11307 = ThreadFactoryC3888.m11306("ܽ᩷") ^ i3;
                            i5 = ((iM11307 ^ i4) * 10345) ^ (-1257280750);
                            i6 = -878979840;
                            break;
                        }
                        iM11307 = (ThreadFactoryC3888.m11306("᩻۟") ^ i4) * (-87);
                        i5 = ((iM11307 ^ i3) * 10437) ^ (-1813743293);
                        i6 = -623761622;
                        break;
                    case -1388935926:
                    case 1425105018:
                        C0671.m3008();
                        C2332.m7079();
                        throw new RuntimeException();
                    case -1040460520:
                    case -286976000:
                        C0050.m946();
                        iM11307 = (ThreadFactoryC3888.m11306("۬۟") + i4) * 123;
                        i5 = ((iM11307 ^ i3) * 13553) ^ 2138991045;
                        i6 = -255880283;
                        break;
                    case -1001045626:
                    case 1253489609:
                        if (CallableC1627.m5507() != 0) {
                            iM11307 = (ThreadFactoryC3888.m11306("۠ۢ") + i3) * 15;
                            i5 = ((iM11307 ^ i4) * (-11611)) ^ 199323773;
                            i6 = 1975463160;
                        } else {
                            iM11307 = (ThreadFactoryC3888.m11306("۬۟") + i4) * 123;
                            i5 = ((iM11307 ^ i3) * 13553) ^ 2138991045;
                            i6 = -255880283;
                        }
                        break;
                    case -764657526:
                    case 65922452:
                        this.f26224 = new Path();
                        return;
                    case -457255753:
                    case 1204618524:
                        C10634.m26820();
                        if (RunnableC3388.f12514 >= 0) {
                            iM11307 = ThreadFactoryC3888.m11306("ܽ᩷") ^ i3;
                            i5 = ((iM11307 ^ i4) * 10345) ^ (-1257280750);
                            i6 = -878979840;
                        } else {
                            iM11307 = (ThreadFactoryC3888.m11306("۬۟") + i4) * 123;
                            i5 = ((iM11307 ^ i3) * 13553) ^ 2138991045;
                            i6 = -255880283;
                        }
                        break;
                    default:
                        this.f26223 = paint;
                        if (!C0817.f3443) {
                            iM11307 = (ThreadFactoryC3888.m11306("᩻۟") ^ i4) * (-87);
                            i5 = ((iM11307 ^ i3) * 10437) ^ (-1813743293);
                            i6 = -623761622;
                        } else {
                            iM11306 = (i3 - ThreadFactoryC3888.m11306("ۤܺ")) * (-93);
                            i5 = ((iM11306 ^ i4) * (-28045)) ^ (-2091341412);
                            i = 1654131224;
                            i7 = iM11306 ^ i;
                        }
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0154 A[PHI: r10 r11 r12 r13 r14
      0x0154: PHI (r10v4 float) = (r10v2 float), (r10v3 float), (r10v2 float) binds: [B:73:0x0154, B:33:0x0152, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r11v4 float) = (r11v2 float), (r11v3 float), (r11v2 float) binds: [B:73:0x0154, B:33:0x0152, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r12v4 float) = (r12v2 float), (r12v3 float), (r12v2 float) binds: [B:73:0x0154, B:33:0x0152, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r13v4 float) = (r13v2 float), (r13v3 float), (r13v2 float) binds: [B:73:0x0154, B:33:0x0152, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r14v4 android.graphics.Paint) = (r14v2 android.graphics.Paint), (r14v3 android.graphics.Paint), (r14v2 android.graphics.Paint) binds: [B:73:0x0154, B:33:0x0152, B:29:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0296  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iM45029;
        int i6;
        int i7;
        float f2;
        int iM11306;
        int i8;
        int iM450210;
        int i9;
        int i10;
        C7988 c7988 = this;
        int i11 = C0629.f2722;
        int i12 = RunnableC3388.f12514;
        int iM450211 = (C19806.m45029("۟ܽ") ^ i11) * 37;
        int i13 = ((iM450211 ^ i12) * 32659) ^ (-155618107);
        Path path = null;
        int i14 = iM450211 ^ (-1398838784);
        float f3 = 0.0f;
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        float fM5054 = 0.0f;
        float fMax3 = 0.0f;
        float f4 = 0.0f;
        int i15 = 0;
        int i16 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        int i17 = 0;
        int i18 = 444265352;
        Paint paint2 = null;
        float f8 = 0.0f;
        while (true) {
            i18 = i14 ^ (i13 & (((i18 ^ i12) * 14615) >> 31));
            switch (i18) {
                case -2140444413:
                case -2087856940:
                    C3743.m10966();
                    if (C3660.f13403 >= 0) {
                        iM450210 = C19806.m45029("ܶۖ") ^ i12;
                        i9 = ((iM450210 ^ i11) * 23547) ^ 230329009;
                        i10 = -1885662002;
                        i14 = iM450210 ^ i10;
                        i13 = i9;
                    } else {
                        iM45029 = (C19806.m45029("᩹᩷") ^ i11) * 31;
                        i13 = ((iM45029 ^ i12) * (-6725)) ^ (-1897146419);
                        i6 = 343802141;
                        i14 = iM45029 ^ i6;
                        c7988 = this;
                    }
                    break;
                case -2047040543:
                case 387918139:
                    C3743.m10966();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        f2 = f3;
                        iM11306 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i12;
                        f3 = f2;
                        i7 = ((iM11306 ^ i11) * 5297) ^ (-2054561060);
                        i8 = 510359484;
                        i14 = iM11306 ^ i8;
                        i13 = i7;
                        c7988 = this;
                    }
                    iM45029 = (C19806.m45029("᩹᩷") ^ i11) * 31;
                    i13 = ((iM45029 ^ i12) * (-6725)) ^ (-1897146419);
                    i6 = 343802141;
                    i14 = iM45029 ^ i6;
                    c7988 = this;
                    break;
                case -1831529219:
                case -1250498418:
                    path.rewind();
                    float f9 = fMax2 / f5;
                    path.moveTo(f7, f6 - f9);
                    path.lineTo(f8, f6);
                    path.lineTo(f7, f6 + f9);
                    canvas.drawPath(path, paint2);
                    break;
                case -1792852172:
                case 811936230:
                    if (C1419.f5860 >= 0) {
                        iM45029 = (C19806.m45029("᩹᩷") ^ i11) * 31;
                        i13 = ((iM45029 ^ i12) * (-6725)) ^ (-1897146419);
                        i6 = 343802141;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖۨ") ^ i11) * (-123);
                        i13 = ((iM45029 ^ i12) * 109) ^ 1667906204;
                        i6 = 1566973582;
                    }
                    i14 = iM45029 ^ i6;
                    c7988 = this;
                    break;
                case -1740414685:
                case 393516169:
                    fMax = Math.max(C1460.m5054(3.0f), C1066.m4030(paint) * 0.2f);
                    if (C1875.f7103 >= 0) {
                        f2 = 6.0f;
                        iM11306 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i12;
                        f3 = f2;
                        i7 = ((iM11306 ^ i11) * 5297) ^ (-2054561060);
                        i8 = 510359484;
                        i14 = iM11306 ^ i8;
                    } else {
                        int iM11307 = (ThreadFactoryC3888.m11306("۬ܳ") + i12) * 67;
                        i7 = ((iM11307 ^ i11) * 6501) ^ 275456025;
                        i14 = iM11307 ^ 1240199941;
                        f3 = 6.0f;
                    }
                    i13 = i7;
                    c7988 = this;
                    break;
                case -1683195514:
                case 53073607:
                    paint2.setAlpha(paint.getAlpha());
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeCap(Paint.Cap.ROUND);
                    paint2.setStrokeJoin(Paint.Join.ROUND);
                    if (RunnableC0195.f1321 >= 0) {
                        iM450210 = C19806.m45029("ܶۖ") ^ i12;
                        i9 = ((iM450210 ^ i11) * 23547) ^ 230329009;
                        i10 = -1885662002;
                    } else {
                        iM450210 = (ThreadFactoryC3888.m11306("ۡۤ") + i11) * 99;
                        i9 = ((iM450210 ^ i12) * (-25823)) ^ 896092442;
                        i10 = -946413417;
                    }
                    i14 = iM450210 ^ i10;
                    i13 = i9;
                    break;
                case -1217262350:
                case 1124351426:
                    paint2.setStrokeWidth(Math.max(C1460.m5054(0.75f), C1066.m4030(paint) * 0.055f));
                    path = c7988.f26224;
                    if (C3286.m9798() > 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۨ֡") ^ i12;
                        i9 = ((iM450210 ^ i11) * (-427)) ^ 832258585;
                        i10 = 215301883;
                        i14 = iM450210 ^ i10;
                        i13 = i9;
                    } else {
                        int iM450212 = (i11 - C19806.m45029("᩵ᩳ")) * (-117);
                        i13 = ((iM450212 ^ i12) * (-3235)) ^ 833598518;
                        i14 = iM450212 ^ 1353695723;
                    }
                    break;
                case -1190042262:
                case -449883303:
                    if (i17 >= 0) {
                        iM45029 = (C19806.m45029("᩹᩷") ^ i11) * 31;
                        i13 = ((iM45029 ^ i12) * (-6725)) ^ (-1897146419);
                        i6 = 343802141;
                    } else {
                        iM45029 = (i11 - C19806.m45029("ۡۢ")) * (-31);
                        i13 = ((iM45029 ^ i12) * 30145) ^ 1609575470;
                        i6 = -1779086939;
                    }
                    i14 = iM45029 ^ i6;
                    c7988 = this;
                    break;
                case -1043671783:
                case 183056270:
                    f5 = 2.0f;
                    f6 = ((i15 + i16) / 2.0f) + f4;
                    f7 = f + fMax3;
                    f8 = fMax + f7;
                    int color = paint.getColor();
                    paint2 = c7988.f26223;
                    paint2.setColor(color);
                    if (C10634.m26820()) {
                        iM450210 = C19806.m45029("ܶۖ") ^ i12;
                        i9 = ((iM450210 ^ i11) * 23547) ^ 230329009;
                        i10 = -1885662002;
                    } else {
                        iM450210 = C19806.m45029("֡᩶") ^ i12;
                        i9 = ((iM450210 ^ i11) * (-22823)) ^ 323265055;
                        i10 = -1658196083;
                    }
                    i14 = iM450210 ^ i10;
                    i13 = i9;
                    break;
                case -882318346:
                case 1338459465:
                    C1398.m4895();
                    iM45029 = (C19806.m45029("᩹᩷") ^ i11) * 31;
                    i13 = ((iM45029 ^ i12) * (-6725)) ^ (-1897146419);
                    i6 = 343802141;
                    i14 = iM45029 ^ i6;
                    c7988 = this;
                    break;
                case -649698251:
                case 1314478715:
                    C1419.m4973();
                    break;
                case -560963478:
                case 669183335:
                    if (RunnableC3388.f12514 < 0) {
                        iM45029 = (i11 - C19806.m45029("ܺᩳ")) * (-45);
                        i13 = ((iM45029 ^ i12) * (-21683)) ^ (-456144452);
                        i6 = 231159282;
                        i14 = iM45029 ^ i6;
                        c7988 = this;
                    }
                    f2 = f3;
                    iM11306 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i12;
                    f3 = f2;
                    i7 = ((iM11306 ^ i11) * 5297) ^ (-2054561060);
                    i8 = 510359484;
                    i14 = iM11306 ^ i8;
                    i13 = i7;
                    c7988 = this;
                    break;
                case -188728864:
                case 631469441:
                    if (C0671.m3008() < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۖۖ") ^ i12;
                        i13 = ((iM45029 ^ i11) * 7833) ^ 1579143630;
                        i6 = 1083198229;
                        i14 = iM45029 ^ i6;
                        c7988 = this;
                    }
                    f2 = f3;
                    iM11306 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i12;
                    f3 = f2;
                    i7 = ((iM11306 ^ i11) * 5297) ^ (-2054561060);
                    i8 = 510359484;
                    i14 = iM11306 ^ i8;
                    i13 = i7;
                    c7988 = this;
                    break;
                case 295371537:
                case 1954503129:
                    C3722.m10894();
                    if (C1977.f7413 <= 0) {
                        int iM450213 = (i11 - C19806.m45029("᩵ᩳ")) * (-117);
                        i13 = ((iM450213 ^ i12) * (-3235)) ^ 833598518;
                        i14 = iM450213 ^ 1353695723;
                    } else {
                        iM45029 = (C19806.m45029("᩹᩷") ^ i11) * 31;
                        i13 = ((iM45029 ^ i12) * (-6725)) ^ (-1897146419);
                        i6 = 343802141;
                        i14 = iM45029 ^ i6;
                        c7988 = this;
                    }
                    break;
                case 327286464:
                case 1670613538:
                    i17 = C7105.f23796;
                    iM45029 = C19806.m45029("ܶ᩷") ^ i12;
                    i13 = ((iM45029 ^ i11) * (-29431)) ^ (-446111879);
                    i6 = 655453908;
                    i14 = iM45029 ^ i6;
                    c7988 = this;
                    break;
                case 856980655:
                case 1740877769:
                    fMax3 = Math.max(fM5054, C10634.m26822(paint) * 0.14f);
                    Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                    f4 = i4;
                    i15 = fontMetricsInt.ascent;
                    i16 = fontMetricsInt.descent;
                    if (!C0817.f3443) {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۖ") ^ i11;
                        i7 = ((iM11306 ^ i12) * 24207) ^ (-1295715318);
                        i8 = -1768706450;
                        i14 = iM11306 ^ i8;
                        i13 = i7;
                        c7988 = this;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩶ܽ") ^ i12;
                        i13 = ((iM45029 ^ i11) * 30621) ^ 821318171;
                        i6 = -1796538954;
                        i14 = iM45029 ^ i6;
                        c7988 = this;
                    }
                    break;
                default:
                    fMax2 = Math.max(C1460.m5054(f3), C10634.m26822(paint) * 0.42f);
                    fM5054 = C1460.m5054(4.0f);
                    if (AbstractC0464.m2313() == 0) {
                        iM45029 = (i11 - C19806.m45029("ᩳᩳ")) * (-41);
                        i13 = ((iM45029 ^ i12) * (-10561)) ^ 693736603;
                        i6 = -2074299851;
                        i14 = iM45029 ^ i6;
                        c7988 = this;
                    }
                    f2 = f3;
                    iM11306 = ThreadFactoryC3888.m11306("ۛ᩻") ^ i12;
                    f3 = f2;
                    i7 = ((iM11306 ^ i11) * 5297) ^ (-2054561060);
                    i8 = 510359484;
                    i14 = iM11306 ^ i8;
                    i13 = i7;
                    c7988 = this;
                    break;
            }
            return;
        }
    }
}
