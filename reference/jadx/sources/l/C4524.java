package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.alipay.sdk.m.p.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8V3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4524 implements InterfaceC6951 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C3422 f16100;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C6245 f16101;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f16102;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Paint f16103;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17534 f16104;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Canvas f16105;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Paint f16106;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f16099 = {0, 7, 8, 15};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final byte[] f16097 = {0, 119, -120, -1};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f16098 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12633(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC9753 mo11108(int i, int i2, byte[] bArr) {
        return C22474.m49977(this, bArr, i2);
    }

    public C4524(List list) {
        C2460 c2460 = new C2460((byte[]) list.get(0));
        int iM7519 = c2460.m7519();
        int iM75110 = c2460.m7519();
        Paint paint = new Paint();
        this.f16103 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f16106 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f16105 = new Canvas();
        this.f16101 = new C6245(719, 575, 0, 719, 0, 575);
        this.f16104 = new C17534(0, new int[]{0, -1, -16777216, -8421505}, m12638(), m12639());
        this.f16100 = new C3422(iM7519, iM75110);
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo11109(byte[] bArr, int i, int i2, C4128 c4128, InterfaceC1008 interfaceC1008) {
        C3422 c3422;
        C17513 c17513;
        int i3;
        int[] iArr;
        C2011 c2011;
        int iM29039;
        int iM290310;
        int iM290311;
        int iM290312;
        C11634 c11634 = new C11634(bArr, i + i2);
        c11634.m29029(i);
        while (true) {
            int iM29030 = c11634.m29030();
            c3422 = this.f16100;
            if (iM29030 >= 48 && c11634.m29039(8) == 15) {
                int iM290313 = c11634.m29039(8);
                int i4 = 16;
                int iM290314 = c11634.m29039(16);
                int iM290315 = c11634.m29039(16);
                int iM29036 = c11634.m29036() + iM290315;
                if (iM290315 * 8 > c11634.m29030()) {
                    C0303.m1848("Data field length exceeds limit");
                    c11634.m29034(c11634.m29030());
                } else {
                    switch (iM290313) {
                        case 16:
                            if (iM290314 == c3422.f12626) {
                                C23885 c23885 = c3422.f12624;
                                c11634.m29039(8);
                                int iM290316 = c11634.m29039(4);
                                int iM290317 = c11634.m29039(2);
                                c11634.m29034(2);
                                int i5 = iM290315 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i5 > 0) {
                                    int iM290318 = c11634.m29039(8);
                                    c11634.m29034(8);
                                    i5 -= 6;
                                    sparseArray.put(iM290318, new C14713(c11634.m29039(16), c11634.m29039(16)));
                                }
                                C23885 c23886 = new C23885(iM290316, iM290317, sparseArray);
                                if (iM290317 != 0) {
                                    c3422.f12624 = c23886;
                                    c3422.f12630.clear();
                                    c3422.f12625.clear();
                                    c3422.f12632.clear();
                                } else if (c23885 != null && c23885.f77372 != iM290316) {
                                    c3422.f12624 = c23886;
                                }
                            }
                            break;
                        case 17:
                            C23885 c23887 = c3422.f12624;
                            SparseArray sparseArray2 = c3422.f12630;
                            if (iM290314 == c3422.f12626 && c23887 != null) {
                                int iM290319 = c11634.m29039(8);
                                c11634.m29034(4);
                                boolean zM29035 = c11634.m29035();
                                c11634.m29034(3);
                                int iM290320 = c11634.m29039(16);
                                int iM290321 = c11634.m29039(16);
                                c11634.m29039(3);
                                int iM290322 = c11634.m29039(3);
                                c11634.m29034(2);
                                int iM290323 = c11634.m29039(8);
                                int iM290324 = c11634.m29039(8);
                                int iM290325 = c11634.m29039(4);
                                int iM290326 = c11634.m29039(2);
                                c11634.m29034(2);
                                int i6 = iM290315 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i6 > 0) {
                                    int iM290327 = c11634.m29039(i4);
                                    int iM290328 = c11634.m29039(2);
                                    c11634.m29039(2);
                                    int iM290329 = c11634.m29039(12);
                                    c11634.m29034(4);
                                    int iM290330 = c11634.m29039(12);
                                    int i7 = i6 - 6;
                                    if (iM290328 == 1 || iM290328 == 2) {
                                        c11634.m29039(8);
                                        c11634.m29039(8);
                                        i6 -= 8;
                                    } else {
                                        i6 = i7;
                                    }
                                    sparseArray3.put(iM290327, new C9774(iM290329, iM290330));
                                    i4 = 16;
                                }
                                C2011 c2012 = new C2011(iM290319, zM29035, iM290320, iM290321, iM290322, iM290323, iM290324, iM290325, iM290326, sparseArray3);
                                if (c23887.f77373 == 0 && (c2011 = (C2011) sparseArray2.get(iM290319)) != null) {
                                    SparseArray sparseArray4 = c2011.f7514;
                                    for (int i8 = 0; i8 < sparseArray4.size(); i8++) {
                                        c2012.f7514.put(sparseArray4.keyAt(i8), (C9774) sparseArray4.valueAt(i8));
                                    }
                                }
                                sparseArray2.put(c2012.f7516, c2012);
                            }
                            break;
                        case 18:
                            if (iM290314 == c3422.f12626) {
                                C17534 c17534M12635 = m12635(c11634, iM290315);
                                c3422.f12625.put(c17534M12635.f55734, c17534M12635);
                            } else if (iM290314 == c3422.f12629) {
                                C17534 c17534M12636 = m12635(c11634, iM290315);
                                c3422.f12627.put(c17534M12636.f55734, c17534M12636);
                            }
                            break;
                        case 19:
                            if (iM290314 == c3422.f12626) {
                                C11185 c11185M12634 = m12634(c11634);
                                c3422.f12632.put(c11185M12634.f37882, c11185M12634);
                            } else if (iM290314 == c3422.f12629) {
                                C11185 c11185M12635 = m12634(c11634);
                                c3422.f12631.put(c11185M12635.f37882, c11185M12635);
                            }
                            break;
                        case 20:
                            if (iM290314 == c3422.f12626) {
                                c11634.m29034(4);
                                boolean zM29036 = c11634.m29035();
                                c11634.m29034(3);
                                int iM290331 = c11634.m29039(16);
                                int iM290332 = c11634.m29039(16);
                                if (zM29036) {
                                    iM290311 = c11634.m29039(16);
                                    iM29039 = c11634.m29039(16);
                                    iM290312 = c11634.m29039(16);
                                    iM290310 = c11634.m29039(16);
                                } else {
                                    iM29039 = iM290331;
                                    iM290310 = iM290332;
                                    iM290311 = 0;
                                    iM290312 = 0;
                                }
                                c3422.f12628 = new C6245(iM290331, iM290332, iM290311, iM29039, iM290312, iM290310);
                            }
                            break;
                    }
                    c11634.m29043(iM29036 - c11634.m29036());
                }
            }
        }
        C23885 c23888 = c3422.f12624;
        if (c23888 == null) {
            c17513 = new C17513(-9223372036854775807L, -9223372036854775807L, AbstractC22433.of());
        } else {
            C6245 c6245 = c3422.f12628;
            if (c6245 == null) {
                c6245 = this.f16101;
            }
            Bitmap bitmap = this.f16102;
            Canvas canvas = this.f16105;
            if (bitmap == null || c6245.f21188 + 1 != bitmap.getWidth() || c6245.f21184 + 1 != this.f16102.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c6245.f21188 + 1, c6245.f21184 + 1, Bitmap.Config.ARGB_8888);
                this.f16102 = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = c23888.f77371;
            int i9 = 0;
            while (i9 < sparseArray5.size()) {
                canvas.save();
                C14713 c14713 = (C14713) sparseArray5.valueAt(i9);
                C2011 c2013 = (C2011) c3422.f12630.get(sparseArray5.keyAt(i9));
                int i10 = c14713.f48124;
                int i11 = c6245.f21186;
                int i12 = c6245.f21184;
                int i13 = c6245.f21188;
                int i14 = i10 + i11;
                int i15 = c14713.f48125 + c6245.f21185;
                int i16 = c2013.f7517;
                int i17 = c2013.f7515;
                int i18 = c2013.f7513;
                int i19 = i14 + i16;
                SparseArray sparseArray6 = sparseArray5;
                int i20 = i9;
                int i21 = i15 + i18;
                int i22 = i19;
                canvas.clipRect(i14, i15, Math.min(i19, c6245.f21187), Math.min(i21, c6245.f21183));
                C17534 c17534 = (C17534) c3422.f12625.get(i17);
                if (c17534 == null && (c17534 = (C17534) c3422.f12627.get(i17)) == null) {
                    c17534 = this.f16104;
                }
                SparseArray sparseArray7 = c2013.f7514;
                int i23 = 0;
                C6245 c6246 = c6245;
                while (i23 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i23);
                    int i24 = i23;
                    C9774 c9774 = (C9774) sparseArray7.valueAt(i23);
                    SparseArray sparseArray8 = sparseArray7;
                    C11185 c11185 = (C11185) c3422.f12632.get(iKeyAt);
                    if (c11185 == null) {
                        c11185 = (C11185) c3422.f12631.get(iKeyAt);
                    }
                    C11185 c11186 = c11185;
                    if (c11186 != null) {
                        Paint paint = c11186.f37881 ? null : this.f16103;
                        int i25 = c2013.f7520;
                        int i26 = c9774.f33465 + i14;
                        int i27 = i15 + c9774.f33466;
                        if (i25 == 3) {
                            iArr = c17534.f55736;
                        } else if (i25 == 2) {
                            iArr = c17534.f55737;
                        } else {
                            iArr = c17534.f55735;
                        }
                        int[] iArr2 = iArr;
                        m12636(c11186.f37879, iArr2, i25, i26, i27, paint, canvas);
                        m12636(c11186.f37880, iArr2, i25, i26, i27 + 1, paint, canvas);
                    }
                    i23 = i24 + 1;
                    i14 = i14;
                    sparseArray7 = sparseArray8;
                    c3422 = c3422;
                    i18 = i18;
                    i16 = i16;
                    i13 = i13;
                    i12 = i12;
                    i21 = i21;
                    i22 = i22;
                    arrayList = arrayList;
                }
                ArrayList arrayList2 = arrayList;
                C3422 c3423 = c3422;
                int i28 = i18;
                int i29 = i16;
                int i30 = i13;
                int i31 = i12;
                int i32 = i22;
                int i33 = i21;
                int i34 = i14;
                if (c2013.f7518) {
                    int i35 = c2013.f7520;
                    if (i35 == 3) {
                        i3 = c17534.f55736[c2013.f7519];
                    } else if (i35 == 2) {
                        i3 = c17534.f55737[c2013.f7512];
                    } else {
                        i3 = c17534.f55735[c2013.f7521];
                    }
                    Paint paint2 = this.f16106;
                    paint2.setColor(i3);
                    canvas.drawRect(i34, i15, i32, i33, paint2);
                }
                C20369 c20369 = new C20369();
                c20369.m46000(Bitmap.createBitmap(this.f16102, i34, i15, i29, i28));
                float f = i34;
                float f2 = i30;
                c20369.m46009(f / f2);
                c20369.m46011(0);
                float f3 = i31;
                c20369.m45998(i15 / f3, 0);
                c20369.m45999(0);
                c20369.m45994(i29 / f2);
                c20369.m45997(i28 / f3);
                arrayList = arrayList2;
                arrayList.add(c20369.m45996());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i9 = i20 + 1;
                sparseArray5 = sparseArray6;
                c6245 = c6246;
                c3422 = c3423;
            }
            c17513 = new C17513(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        interfaceC1008.accept(c17513);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17534 m12635(C11634 c11634, int i) {
        int[] iArr;
        int i2;
        int iM29039;
        int iM290310;
        int iM290311;
        int iM290312;
        int i3 = 8;
        int iM290313 = c11634.m29039(8);
        c11634.m29034(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrM12638 = m12638();
        int[] iArrM12639 = m12639();
        while (i5 > 0) {
            int iM290314 = c11634.m29039(i3);
            int iM290315 = c11634.m29039(i3);
            if ((iM290315 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM290315 & 64) != 0 ? iArrM12638 : iArrM12639;
            }
            if ((iM290315 & 1) != 0) {
                iM29039 = c11634.m29039(i3);
                iM290312 = c11634.m29039(i3);
                iM290311 = c11634.m29039(i3);
                iM290310 = c11634.m29039(i3);
                i2 = i5 - 6;
            } else {
                int iM290316 = c11634.m29039(6) << i4;
                int iM290317 = c11634.m29039(4) << 4;
                int iM290318 = c11634.m29039(4) << 4;
                int iM290319 = c11634.m29039(i4) << 6;
                i2 = i5 - 4;
                iM29039 = iM290316;
                iM290310 = iM290319;
                iM290311 = iM290318;
                iM290312 = iM290317;
            }
            if (iM29039 == 0) {
                iM290312 = 0;
                iM290311 = 0;
                iM290310 = 255;
            }
            double d = iM29039;
            double d2 = iM290312 + a.g;
            int i6 = i2;
            double d3 = iM290311 + a.g;
            iArr[iM290314] = m12633((byte) (255 - (iM290310 & 255)), C17983.m41813((int) ((1.402d * d2) + d), 0, 255), C17983.m41813((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), C17983.m41813((int) ((d3 * 1.772d) + d), 0, 255));
            i3 = 8;
            i4 = 2;
            i5 = i6;
            iArr2 = iArr2;
        }
        return new C17534(iM290313, iArr2, iArrM12638, iArrM12639);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11185 m12634(C11634 c11634) {
        byte[] bArr;
        int iM29039 = c11634.m29039(16);
        c11634.m29034(4);
        int iM290310 = c11634.m29039(2);
        boolean zM29035 = c11634.m29035();
        c11634.m29034(1);
        byte[] bArr2 = C17983.f57507;
        if (iM290310 == 1) {
            c11634.m29034(c11634.m29039(8) * 16);
        } else {
            if (iM290310 == 0) {
                int iM290311 = c11634.m29039(16);
                int iM290312 = c11634.m29039(16);
                if (iM290311 > 0) {
                    bArr2 = new byte[iM290311];
                    c11634.m29041(iM290311, bArr2);
                }
                if (iM290312 > 0) {
                    bArr = new byte[iM290312];
                    c11634.m29041(iM290312, bArr);
                }
            }
            return new C11185(bArr2, bArr, iM29039, zM29035);
        }
        bArr = bArr2;
        return new C11185(bArr2, bArr, iM29039, zM29035);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m12638() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m12633(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m12633(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int[] m12639() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m12633(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m12633(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m12633(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m12633(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m12633(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12636(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z;
        int i4;
        int iM29039;
        int iM290310;
        byte[] bArr4;
        int iM290311;
        int iM290312;
        int i5;
        boolean z2;
        int iM290313;
        boolean z3;
        int i6;
        C11634 c11634 = new C11634(bArr, bArr.length);
        byte[] bArrM12637 = null;
        byte[] bArrM12638 = null;
        byte[] bArrM12639 = null;
        int i7 = i2;
        int i8 = i3;
        while (c11634.m29030() != 0) {
            int iM290314 = c11634.m29039(8);
            if (iM290314 != 240) {
                int i9 = 3;
                int i10 = 2;
                int i11 = 4;
                switch (iM290314) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArrM12639 == null) {
                                bArr2 = f16099;
                            } else {
                                bArr3 = bArrM12639;
                            }
                            bArr3 = bArr2;
                        } else if (bArrM12637 == null) {
                            bArr2 = f16097;
                            bArr3 = bArr2;
                        } else {
                            bArr3 = bArrM12637;
                        }
                        boolean z4 = false;
                        int i12 = i7;
                        while (true) {
                            int iM290315 = c11634.m29039(2);
                            if (iM290315 == 0) {
                                if (c11634.m29035()) {
                                    iM29039 = c11634.m29039(3) + 3;
                                    iM290310 = c11634.m29039(2);
                                } else if (c11634.m29035()) {
                                    iM290315 = 0;
                                    z = z4;
                                    i4 = 1;
                                } else {
                                    int iM290316 = c11634.m29039(2);
                                    if (iM290316 == 0) {
                                        iM290315 = 0;
                                        z4 = true;
                                    } else if (iM290316 == 1) {
                                        iM290315 = 0;
                                        z = z4;
                                        i4 = 2;
                                    } else if (iM290316 == 2) {
                                        int iM290317 = c11634.m29039(4) + 12;
                                        iM290315 = c11634.m29039(2);
                                        z = z4;
                                        i4 = iM290317;
                                    } else if (iM290316 != 3) {
                                        iM290315 = 0;
                                    } else {
                                        iM29039 = c11634.m29039(8) + 29;
                                        iM290310 = c11634.m29039(2);
                                    }
                                    z = z4;
                                    i4 = 0;
                                }
                                i4 = iM29039;
                                z = z4;
                                iM290315 = iM290310;
                            } else {
                                z = z4;
                                i4 = 1;
                            }
                            if (i4 != 0 && paint != null) {
                                if (bArr3 != 0) {
                                    iM290315 = bArr3[iM290315];
                                }
                                paint.setColor(iArr[iM290315]);
                                canvas.drawRect(i12, i8, i12 + i4, i8 + 1, paint);
                            }
                            i12 += i4;
                            if (z) {
                                c11634.m29040();
                                i7 = i12;
                            } else {
                                z4 = z;
                            }
                            break;
                        }
                        break;
                    case 17:
                        if (i == 3) {
                            bArr4 = bArrM12638 == null ? f16098 : bArrM12638;
                        } else {
                            bArr4 = null;
                        }
                        byte[] bArr5 = bArr4;
                        boolean z5 = false;
                        int i13 = i7;
                        int i14 = 8;
                        while (true) {
                            int iM290318 = c11634.m29039(i11);
                            if (iM290318 != 0) {
                                z2 = z5;
                                i5 = 1;
                            } else {
                                if (!c11634.m29035()) {
                                    int iM290319 = c11634.m29039(i9);
                                    if (iM290319 != 0) {
                                        iM290311 = iM290319 + 2;
                                    } else {
                                        z5 = true;
                                        iM290311 = 0;
                                    }
                                    iM290318 = 0;
                                } else {
                                    if (!c11634.m29035()) {
                                        iM290311 = c11634.m29039(i10) + 4;
                                        iM290312 = c11634.m29039(i11);
                                    } else {
                                        int iM290320 = c11634.m29039(i10);
                                        if (iM290320 == 0) {
                                            iM290311 = 1;
                                        } else if (iM290320 == 1) {
                                            iM290311 = 2;
                                        } else if (iM290320 != i10) {
                                            if (iM290320 == i9) {
                                                iM290311 = c11634.m29039(i14) + 25;
                                                iM290312 = c11634.m29039(i11);
                                            }
                                            iM290311 = 0;
                                        } else {
                                            iM290311 = c11634.m29039(i11) + 9;
                                            iM290312 = c11634.m29039(i11);
                                        }
                                        iM290318 = 0;
                                    }
                                    iM290318 = iM290312;
                                }
                                i5 = iM290311;
                                z2 = z5;
                            }
                            if (i5 != 0 && paint != null) {
                                if (bArr5 != 0) {
                                    iM290318 = bArr5[iM290318];
                                }
                                paint.setColor(iArr[iM290318]);
                                canvas.drawRect(i13, i8, i13 + i5, i8 + 1, paint);
                            }
                            i13 += i5;
                            if (z2) {
                                c11634.m29040();
                                i7 = i13;
                            } else {
                                i9 = 3;
                                i10 = 2;
                                i11 = 4;
                                i14 = 8;
                                z5 = z2;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z6 = false;
                        int i15 = i7;
                        while (true) {
                            int iM290321 = c11634.m29039(8);
                            if (iM290321 != 0) {
                                z3 = z6;
                                i6 = 1;
                            } else {
                                if (!c11634.m29035()) {
                                    iM290313 = c11634.m29039(7);
                                    iM290321 = 0;
                                    if (iM290313 == 0) {
                                        z3 = true;
                                        i6 = 0;
                                    }
                                } else {
                                    iM290313 = c11634.m29039(7);
                                    iM290321 = c11634.m29039(8);
                                }
                                z3 = z6;
                                i6 = iM290313;
                            }
                            if (i6 != 0 && paint != null) {
                                paint.setColor(iArr[iM290321]);
                                canvas.drawRect(i15, i8, i15 + i6, i8 + 1, paint);
                            }
                            i15 += i6;
                            if (z3) {
                                i7 = i15;
                            } else {
                                z6 = z3;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iM290314) {
                            case 32:
                                bArrM12639 = m12637(4, 4, c11634);
                                break;
                            case 33:
                                bArrM12637 = m12637(4, 8, c11634);
                                break;
                            case 34:
                                bArrM12638 = m12637(16, 8, c11634);
                                break;
                        }
                        break;
                }
            } else {
                i8 += 2;
                i7 = i2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m12637(int i, int i2, C11634 c11634) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c11634.m29039(i2);
        }
        return bArr;
    }

    @Override // l.InterfaceC6951
    public final void reset() {
        C3422 c3422 = this.f16100;
        c3422.f12630.clear();
        c3422.f12625.clear();
        c3422.f12632.clear();
        c3422.f12627.clear();
        c3422.f12631.clear();
        c3422.f12628 = null;
        c3422.f12624 = null;
    }
}
