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

/* JADX INFO: renamed from: l.ܰ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F8V3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14915 implements InterfaceC2763 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f48708;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16407 f48709;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C4475 f48710;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Paint f48711;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Paint f48712;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Canvas f48713;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23867 f48714;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f48706 = {0, 7, 8, 15};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f48705 = {0, 119, -120, -1};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f48707 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m35886(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC24393 mo5929(int i, int i2, byte[] bArr) {
        return C19171.m44438(this, bArr, i2);
    }

    public C14915(List list) {
        C21287 c21287 = new C21287((byte[]) list.get(0));
        int iM48494 = c21287.m48494();
        int iM48495 = c21287.m48494();
        Paint paint = new Paint();
        this.f48712 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f48711 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f48713 = new Canvas();
        this.f48714 = new C23867(719, 575, 0, 719, 0, 575);
        this.f48709 = new C16407(0, new int[]{0, -1, -16777216, -8421505}, m35891(), m35892());
        this.f48710 = new C4475(iM48494, iM48495);
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final void mo5930(byte[] bArr, int i, int i2, C9474 c9474, InterfaceC8103 interfaceC8103) {
        C4475 c4475;
        C16187 c16187;
        int i3;
        int[] iArr;
        C6713 c6713;
        int iM35163;
        int iM35164;
        int iM35165;
        int iM35166;
        C14573 c14573 = new C14573(bArr, i + i2);
        c14573.m35167(i);
        while (true) {
            int iM35152 = c14573.m35152();
            c4475 = this.f48710;
            if (iM35152 >= 48 && c14573.m35163(8) == 15) {
                int iM35167 = c14573.m35163(8);
                int i4 = 16;
                int iM35168 = c14573.m35163(16);
                int iM35169 = c14573.m35163(16);
                int iM35156 = c14573.m35156() + iM35169;
                if (iM35169 * 8 > c14573.m35152()) {
                    C1896.m6517("Data field length exceeds limit");
                    c14573.m35161(c14573.m35152());
                } else {
                    switch (iM35167) {
                        case 16:
                            if (iM35168 == c4475.f16005) {
                                C20883 c20883 = c4475.f16009;
                                c14573.m35163(8);
                                int iM351610 = c14573.m35163(4);
                                int iM351611 = c14573.m35163(2);
                                c14573.m35161(2);
                                int i5 = iM35169 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i5 > 0) {
                                    int iM351612 = c14573.m35163(8);
                                    c14573.m35161(8);
                                    i5 -= 6;
                                    sparseArray.put(iM351612, new C12678(c14573.m35163(16), c14573.m35163(16)));
                                }
                                C20883 c20884 = new C20883(iM351610, iM351611, sparseArray);
                                if (iM351611 != 0) {
                                    c4475.f16009 = c20884;
                                    c4475.f16007.clear();
                                    c4475.f16013.clear();
                                    c4475.f16010.clear();
                                } else if (c20883 != null && c20883.f66835 != iM351610) {
                                    c4475.f16009 = c20884;
                                }
                            }
                            break;
                        case 17:
                            C20883 c20885 = c4475.f16009;
                            SparseArray sparseArray2 = c4475.f16007;
                            if (iM35168 == c4475.f16005 && c20885 != null) {
                                int iM351613 = c14573.m35163(8);
                                c14573.m35161(4);
                                boolean zM35162 = c14573.m35162();
                                c14573.m35161(3);
                                int iM351614 = c14573.m35163(16);
                                int iM351615 = c14573.m35163(16);
                                c14573.m35163(3);
                                int iM351616 = c14573.m35163(3);
                                c14573.m35161(2);
                                int iM351617 = c14573.m35163(8);
                                int iM351618 = c14573.m35163(8);
                                int iM351619 = c14573.m35163(4);
                                int iM351620 = c14573.m35163(2);
                                c14573.m35161(2);
                                int i6 = iM35169 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i6 > 0) {
                                    int iM351621 = c14573.m35163(i4);
                                    int iM351622 = c14573.m35163(2);
                                    c14573.m35163(2);
                                    int iM351623 = c14573.m35163(12);
                                    c14573.m35161(4);
                                    int iM351624 = c14573.m35163(12);
                                    int i7 = i6 - 6;
                                    if (iM351622 == 1 || iM351622 == 2) {
                                        c14573.m35163(8);
                                        c14573.m35163(8);
                                        i6 -= 8;
                                    } else {
                                        i6 = i7;
                                    }
                                    sparseArray3.put(iM351621, new C24613(iM351623, iM351624));
                                    i4 = 16;
                                }
                                C6713 c6714 = new C6713(iM351613, zM35162, iM351614, iM351615, iM351616, iM351617, iM351618, iM351619, iM351620, sparseArray3);
                                if (c20885.f66836 == 0 && (c6713 = (C6713) sparseArray2.get(iM351613)) != null) {
                                    SparseArray sparseArray4 = c6713.f22330;
                                    for (int i8 = 0; i8 < sparseArray4.size(); i8++) {
                                        c6714.f22330.put(sparseArray4.keyAt(i8), (C24613) sparseArray4.valueAt(i8));
                                    }
                                }
                                sparseArray2.put(c6714.f22337, c6714);
                            }
                            break;
                        case 18:
                            if (iM35168 == c4475.f16005) {
                                C16407 c16407M35888 = m35888(c14573, iM35169);
                                c4475.f16013.put(c16407M35888.f53249, c16407M35888);
                            } else if (iM35168 == c4475.f16008) {
                                C16407 c16407M35889 = m35888(c14573, iM35169);
                                c4475.f16006.put(c16407M35889.f53249, c16407M35889);
                            }
                            break;
                        case 19:
                            if (iM35168 == c4475.f16005) {
                                C3729 c3729M35887 = m35887(c14573);
                                c4475.f16010.put(c3729M35887.f12811, c3729M35887);
                            } else if (iM35168 == c4475.f16008) {
                                C3729 c3729M35888 = m35887(c14573);
                                c4475.f16012.put(c3729M35888.f12811, c3729M35888);
                            }
                            break;
                        case 20:
                            if (iM35168 == c4475.f16005) {
                                c14573.m35161(4);
                                boolean zM35163 = c14573.m35162();
                                c14573.m35161(3);
                                int iM351625 = c14573.m35163(16);
                                int iM351626 = c14573.m35163(16);
                                if (zM35163) {
                                    iM35165 = c14573.m35163(16);
                                    iM35163 = c14573.m35163(16);
                                    iM35166 = c14573.m35163(16);
                                    iM35164 = c14573.m35163(16);
                                } else {
                                    iM35163 = iM351625;
                                    iM35164 = iM351626;
                                    iM35165 = 0;
                                    iM35166 = 0;
                                }
                                c4475.f16011 = new C23867(iM351625, iM351626, iM35165, iM35163, iM35166, iM35164);
                            }
                            break;
                    }
                    c14573.m35160(iM35156 - c14573.m35156());
                }
            }
        }
        C20883 c20886 = c4475.f16009;
        if (c20886 == null) {
            c16187 = new C16187(-9223372036854775807L, -9223372036854775807L, AbstractC1928.of());
        } else {
            C23867 c23867 = c4475.f16011;
            if (c23867 == null) {
                c23867 = this.f48714;
            }
            Bitmap bitmap = this.f48708;
            Canvas canvas = this.f48713;
            if (bitmap == null || c23867.f77268 + 1 != bitmap.getWidth() || c23867.f77266 + 1 != this.f48708.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c23867.f77268 + 1, c23867.f77266 + 1, Bitmap.Config.ARGB_8888);
                this.f48708 = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = c20886.f66834;
            int i9 = 0;
            while (i9 < sparseArray5.size()) {
                canvas.save();
                C12678 c12678 = (C12678) sparseArray5.valueAt(i9);
                C6713 c6715 = (C6713) c4475.f16007.get(sparseArray5.keyAt(i9));
                int i10 = c12678.f40603;
                int i11 = c23867.f77267;
                int i12 = c23867.f77266;
                int i13 = c23867.f77268;
                int i14 = i10 + i11;
                int i15 = c12678.f40604 + c23867.f77269;
                int i16 = c6715.f22334;
                int i17 = c6715.f22331;
                int i18 = c6715.f22339;
                int i19 = i14 + i16;
                SparseArray sparseArray6 = sparseArray5;
                int i20 = i9;
                int i21 = i15 + i18;
                int i22 = i19;
                canvas.clipRect(i14, i15, Math.min(i19, c23867.f77270), Math.min(i21, c23867.f77271));
                C16407 c16407 = (C16407) c4475.f16013.get(i17);
                if (c16407 == null && (c16407 = (C16407) c4475.f16006.get(i17)) == null) {
                    c16407 = this.f48709;
                }
                SparseArray sparseArray7 = c6715.f22330;
                int i23 = 0;
                C23867 c23868 = c23867;
                while (i23 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i23);
                    int i24 = i23;
                    C24613 c24613 = (C24613) sparseArray7.valueAt(i23);
                    SparseArray sparseArray8 = sparseArray7;
                    C3729 c3729 = (C3729) c4475.f16010.get(iKeyAt);
                    if (c3729 == null) {
                        c3729 = (C3729) c4475.f16012.get(iKeyAt);
                    }
                    C3729 c37210 = c3729;
                    if (c37210 != null) {
                        Paint paint = c37210.f12810 ? null : this.f48712;
                        int i25 = c6715.f22338;
                        int i26 = c24613.f79723 + i14;
                        int i27 = i15 + c24613.f79724;
                        if (i25 == 3) {
                            iArr = c16407.f53247;
                        } else if (i25 == 2) {
                            iArr = c16407.f53248;
                        } else {
                            iArr = c16407.f53246;
                        }
                        int[] iArr2 = iArr;
                        m35889(c37210.f12812, iArr2, i25, i26, i27, paint, canvas);
                        m35889(c37210.f12809, iArr2, i25, i26, i27 + 1, paint, canvas);
                    }
                    i23 = i24 + 1;
                    i14 = i14;
                    sparseArray7 = sparseArray8;
                    c4475 = c4475;
                    i18 = i18;
                    i16 = i16;
                    i13 = i13;
                    i12 = i12;
                    i21 = i21;
                    i22 = i22;
                    arrayList = arrayList;
                }
                ArrayList arrayList2 = arrayList;
                C4475 c4476 = c4475;
                int i28 = i18;
                int i29 = i16;
                int i30 = i13;
                int i31 = i12;
                int i32 = i22;
                int i33 = i21;
                int i34 = i14;
                if (c6715.f22333) {
                    int i35 = c6715.f22338;
                    if (i35 == 3) {
                        i3 = c16407.f53247[c6715.f22332];
                    } else if (i35 == 2) {
                        i3 = c16407.f53248[c6715.f22335];
                    } else {
                        i3 = c16407.f53246[c6715.f22336];
                    }
                    Paint paint2 = this.f48711;
                    paint2.setColor(i3);
                    canvas.drawRect(i34, i15, i32, i33, paint2);
                }
                C5866 c5866 = new C5866();
                c5866.m17077(Bitmap.createBitmap(this.f48708, i34, i15, i29, i28));
                float f = i34;
                float f2 = i30;
                c5866.m17086(f / f2);
                c5866.m17088(0);
                float f3 = i31;
                c5866.m17075(i15 / f3, 0);
                c5866.m17076(0);
                c5866.m17091(i29 / f2);
                c5866.m17074(i28 / f3);
                arrayList = arrayList2;
                arrayList.add(c5866.m17073());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i9 = i20 + 1;
                sparseArray5 = sparseArray6;
                c23867 = c23868;
                c4475 = c4476;
            }
            c16187 = new C16187(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        interfaceC8103.accept(c16187);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16407 m35888(C14573 c14573, int i) {
        int[] iArr;
        int i2;
        int iM35163;
        int iM35164;
        int iM35165;
        int iM35166;
        int i3 = 8;
        int iM35167 = c14573.m35163(8);
        c14573.m35161(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrM35891 = m35891();
        int[] iArrM35892 = m35892();
        while (i5 > 0) {
            int iM35168 = c14573.m35163(i3);
            int iM35169 = c14573.m35163(i3);
            if ((iM35169 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM35169 & 64) != 0 ? iArrM35891 : iArrM35892;
            }
            if ((iM35169 & 1) != 0) {
                iM35163 = c14573.m35163(i3);
                iM35166 = c14573.m35163(i3);
                iM35165 = c14573.m35163(i3);
                iM35164 = c14573.m35163(i3);
                i2 = i5 - 6;
            } else {
                int iM351610 = c14573.m35163(6) << i4;
                int iM351611 = c14573.m35163(4) << 4;
                int iM351612 = c14573.m35163(4) << 4;
                int iM351613 = c14573.m35163(i4) << 6;
                i2 = i5 - 4;
                iM35163 = iM351610;
                iM35164 = iM351613;
                iM35165 = iM351612;
                iM35166 = iM351611;
            }
            if (iM35163 == 0) {
                iM35166 = 0;
                iM35165 = 0;
                iM35164 = 255;
            }
            double d = iM35163;
            double d2 = iM35166 + a.g;
            int i6 = i2;
            double d3 = iM35165 + a.g;
            iArr[iM35168] = m35886((byte) (255 - (iM35164 & 255)), C7116.m19460((int) ((1.402d * d2) + d), 0, 255), C7116.m19460((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), C7116.m19460((int) ((d3 * 1.772d) + d), 0, 255));
            i3 = 8;
            i4 = 2;
            i5 = i6;
            iArr2 = iArr2;
        }
        return new C16407(iM35167, iArr2, iArrM35891, iArrM35892);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3729 m35887(C14573 c14573) {
        byte[] bArr;
        int iM35163 = c14573.m35163(16);
        c14573.m35161(4);
        int iM35164 = c14573.m35163(2);
        boolean zM35162 = c14573.m35162();
        c14573.m35161(1);
        byte[] bArr2 = C7116.f23453;
        if (iM35164 == 1) {
            c14573.m35161(c14573.m35163(8) * 16);
        } else {
            if (iM35164 == 0) {
                int iM35165 = c14573.m35163(16);
                int iM35166 = c14573.m35163(16);
                if (iM35165 > 0) {
                    bArr2 = new byte[iM35165];
                    c14573.m35165(iM35165, bArr2);
                }
                if (iM35166 > 0) {
                    bArr = new byte[iM35166];
                    c14573.m35165(iM35166, bArr);
                }
            }
            return new C3729(bArr2, bArr, iM35163, zM35162);
        }
        bArr = bArr2;
        return new C3729(bArr2, bArr, iM35163, zM35162);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m35891() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m35886(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m35886(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int[] m35892() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m35886(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m35886(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m35886(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m35886(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m35886(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35889(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z;
        int i4;
        int iM35163;
        int iM35164;
        byte[] bArr4;
        int iM35165;
        int iM35166;
        int i5;
        boolean z2;
        int iM35167;
        boolean z3;
        int i6;
        C14573 c14573 = new C14573(bArr, bArr.length);
        byte[] bArrM35890 = null;
        byte[] bArrM35891 = null;
        byte[] bArrM35892 = null;
        int i7 = i2;
        int i8 = i3;
        while (c14573.m35152() != 0) {
            int iM35168 = c14573.m35163(8);
            if (iM35168 != 240) {
                int i9 = 3;
                int i10 = 2;
                int i11 = 4;
                switch (iM35168) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArrM35892 == null) {
                                bArr2 = f48706;
                            } else {
                                bArr3 = bArrM35892;
                            }
                            bArr3 = bArr2;
                        } else if (bArrM35890 == null) {
                            bArr2 = f48705;
                            bArr3 = bArr2;
                        } else {
                            bArr3 = bArrM35890;
                        }
                        boolean z4 = false;
                        int i12 = i7;
                        while (true) {
                            int iM35169 = c14573.m35163(2);
                            if (iM35169 == 0) {
                                if (c14573.m35162()) {
                                    iM35163 = c14573.m35163(3) + 3;
                                    iM35164 = c14573.m35163(2);
                                } else if (c14573.m35162()) {
                                    iM35169 = 0;
                                    z = z4;
                                    i4 = 1;
                                } else {
                                    int iM351610 = c14573.m35163(2);
                                    if (iM351610 == 0) {
                                        iM35169 = 0;
                                        z4 = true;
                                    } else if (iM351610 == 1) {
                                        iM35169 = 0;
                                        z = z4;
                                        i4 = 2;
                                    } else if (iM351610 == 2) {
                                        int iM351611 = c14573.m35163(4) + 12;
                                        iM35169 = c14573.m35163(2);
                                        z = z4;
                                        i4 = iM351611;
                                    } else if (iM351610 != 3) {
                                        iM35169 = 0;
                                    } else {
                                        iM35163 = c14573.m35163(8) + 29;
                                        iM35164 = c14573.m35163(2);
                                    }
                                    z = z4;
                                    i4 = 0;
                                }
                                i4 = iM35163;
                                z = z4;
                                iM35169 = iM35164;
                            } else {
                                z = z4;
                                i4 = 1;
                            }
                            if (i4 != 0 && paint != null) {
                                if (bArr3 != 0) {
                                    iM35169 = bArr3[iM35169];
                                }
                                paint.setColor(iArr[iM35169]);
                                canvas.drawRect(i12, i8, i12 + i4, i8 + 1, paint);
                            }
                            i12 += i4;
                            if (z) {
                                c14573.m35164();
                                i7 = i12;
                            } else {
                                z4 = z;
                            }
                            break;
                        }
                        break;
                    case 17:
                        if (i == 3) {
                            bArr4 = bArrM35891 == null ? f48707 : bArrM35891;
                        } else {
                            bArr4 = null;
                        }
                        byte[] bArr5 = bArr4;
                        boolean z5 = false;
                        int i13 = i7;
                        int i14 = 8;
                        while (true) {
                            int iM351612 = c14573.m35163(i11);
                            if (iM351612 != 0) {
                                z2 = z5;
                                i5 = 1;
                            } else {
                                if (!c14573.m35162()) {
                                    int iM351613 = c14573.m35163(i9);
                                    if (iM351613 != 0) {
                                        iM35165 = iM351613 + 2;
                                    } else {
                                        z5 = true;
                                        iM35165 = 0;
                                    }
                                    iM351612 = 0;
                                } else {
                                    if (!c14573.m35162()) {
                                        iM35165 = c14573.m35163(i10) + 4;
                                        iM35166 = c14573.m35163(i11);
                                    } else {
                                        int iM351614 = c14573.m35163(i10);
                                        if (iM351614 == 0) {
                                            iM35165 = 1;
                                        } else if (iM351614 == 1) {
                                            iM35165 = 2;
                                        } else if (iM351614 != i10) {
                                            if (iM351614 == i9) {
                                                iM35165 = c14573.m35163(i14) + 25;
                                                iM35166 = c14573.m35163(i11);
                                            }
                                            iM35165 = 0;
                                        } else {
                                            iM35165 = c14573.m35163(i11) + 9;
                                            iM35166 = c14573.m35163(i11);
                                        }
                                        iM351612 = 0;
                                    }
                                    iM351612 = iM35166;
                                }
                                i5 = iM35165;
                                z2 = z5;
                            }
                            if (i5 != 0 && paint != null) {
                                if (bArr5 != 0) {
                                    iM351612 = bArr5[iM351612];
                                }
                                paint.setColor(iArr[iM351612]);
                                canvas.drawRect(i13, i8, i13 + i5, i8 + 1, paint);
                            }
                            i13 += i5;
                            if (z2) {
                                c14573.m35164();
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
                            int iM351615 = c14573.m35163(8);
                            if (iM351615 != 0) {
                                z3 = z6;
                                i6 = 1;
                            } else {
                                if (!c14573.m35162()) {
                                    iM35167 = c14573.m35163(7);
                                    iM351615 = 0;
                                    if (iM35167 == 0) {
                                        z3 = true;
                                        i6 = 0;
                                    }
                                } else {
                                    iM35167 = c14573.m35163(7);
                                    iM351615 = c14573.m35163(8);
                                }
                                z3 = z6;
                                i6 = iM35167;
                            }
                            if (i6 != 0 && paint != null) {
                                paint.setColor(iArr[iM351615]);
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
                        switch (iM35168) {
                            case 32:
                                bArrM35892 = m35890(4, 4, c14573);
                                break;
                            case 33:
                                bArrM35890 = m35890(4, 8, c14573);
                                break;
                            case 34:
                                bArrM35891 = m35890(16, 8, c14573);
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
    public static byte[] m35890(int i, int i2, C14573 c14573) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c14573.m35163(i2);
        }
        return bArr;
    }

    @Override // l.InterfaceC2763
    public final void reset() {
        C4475 c4475 = this.f48710;
        c4475.f16007.clear();
        c4475.f16013.clear();
        c4475.f16010.clear();
        c4475.f16006.clear();
        c4475.f16012.clear();
        c4475.f16011 = null;
        c4475.f16009 = null;
    }
}
