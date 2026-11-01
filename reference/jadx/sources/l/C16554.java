package l;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܽۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4IR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16554 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C13026 f53162;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f53163;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f53164;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f53166;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f53172;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f53175;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f53176;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f53178;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String[] f53161 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final char[] f53160 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RectF f53173 = new RectF();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final RectF f53174 = new RectF();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final RectF f53168 = new RectF();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C22398 f53170 = new C22398(3);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f53177 = C8574.f29651;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean[] f53169 = C7868.f25897;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] f53171 = new char[2];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] f53165 = new char[1];

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final char[] f53167 = new char[13];

    public C16554(C13026 c13026) {
        this.f53162 = c13026;
        C10682 c10682 = c13026.f43457;
        this.f53175 = (Math.max(Math.max(c10682.f36466.getIntrinsicHeight(), c10682.f36451.getIntrinsicHeight()), c10682.f36459.getIntrinsicHeight()) * 3) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x05f8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38962(Canvas canvas, boolean z, boolean z2, float f, boolean z3) {
        char[] cArr;
        int i;
        int i2;
        int i3;
        C4916 c4916;
        int i4;
        int i5;
        C13732 c13732;
        Drawable drawable;
        Drawable drawable2;
        float f2;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        boolean z6;
        float f3;
        boolean z7;
        Drawable drawable3;
        int i8;
        float f4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char[] cArr2;
        this.f53172 = false;
        this.f53166 = false;
        C13026 c13026 = this.f53162;
        C13732 c13733 = c13026.f43452;
        C10682 c10682 = c13026.f43457;
        int width = c13026.getWidth();
        int height = c13026.getHeight();
        int i16 = c10682.f36474;
        float f5 = c10682.f36448;
        float f6 = c10682.f36450;
        int iM38955 = m38955();
        float f7 = c10682.f36461;
        float fM33441 = (c13733.m33441() + 1) * f7;
        int iM33464 = c13733.m33464();
        C4916 c4917 = c10682.f36453;
        int i17 = c10682.f36445;
        long jM32235 = c13026.m32235();
        long j = iM38955;
        int iM38953 = m38953(jM32235 + j);
        int iMax = Math.max(iM38953, m38953(jM32235 + ((long) height)));
        float fM38954 = m38954();
        long j2 = j - jM32235;
        long j3 = iM38953;
        long j4 = i16;
        long j5 = (j3 * j4) + j2;
        int i18 = width;
        long j6 = ((long) i17) + j5;
        int i19 = (int) j6;
        if (j6 != i19) {
            throw new ArithmeticException();
        }
        long j7 = iMax;
        long j8 = (j7 - j3) + 1;
        long j9 = (int) j8;
        if (j8 != j9) {
            throw new ArithmeticException();
        }
        long j10 = iM33464;
        long j11 = j9 * j10;
        int i20 = (int) j11;
        if (j11 != i20) {
            throw new ArithmeticException();
        }
        if (this.f53177.length < i20) {
            this.f53177 = new byte[i20];
            this.f53169 = new boolean[i20];
        }
        long j12 = j3 * j10;
        int i21 = (int) j12;
        if (j12 != i21) {
            throw new ArithmeticException();
        }
        int iM33445 = c13733.m33445(i21, i20, this.f53177, this.f53169);
        canvas.drawColor(c10682.f36468);
        c4917.setColor(c10682.f36469);
        int i22 = height;
        float f8 = i22;
        int i23 = iM38955;
        C4916 c4918 = c4917;
        canvas.drawRect(0.0f, 0.0f, fM33441, f8, c4918);
        c4918.setColor(c10682.f36455);
        float f9 = f7 / 2.0f;
        int i24 = iM38953;
        int i25 = i19;
        while (true) {
            cArr = f53160;
            if (i24 > iMax) {
                break;
            }
            long j13 = ((long) i24) * j10;
            int iM33441 = c13733.m33441();
            int i26 = iM33441 - 1;
            while (true) {
                cArr2 = this.f53167;
                if (i26 >= 0) {
                    cArr2[i26] = cArr[(int) (j13 & 15)];
                    j13 >>>= 4;
                    i26--;
                    iMax = iMax;
                    c4918 = c4918;
                }
            }
            C4916 c4919 = c4918;
            cArr2[iM33441] = ' ';
            cArr2[iM33441 + 1] = ' ';
            cArr2[iM33441 + 2] = ' ';
            cArr2[iM33441 + 3] = ' ';
            cArr2[iM33441 + 4] = '.';
            canvas.drawText(this.f53167, 0, iM33441 + 5, f9, i25, c4919);
            i25 += i16;
            i24++;
            iMax = iMax;
            c4918 = c4919;
            i22 = i22;
        }
        C4916 c49110 = c4918;
        int i27 = i22;
        int i28 = iMax;
        int iM33443 = c13733.m33443();
        int iM33465 = c13733.m33465();
        if (c13733.m33475()) {
            i = iM33464;
            i2 = -1;
        } else {
            i = iM33464;
            i2 = iM33443 / i;
        }
        this.f53163 = false;
        int i29 = (int) j5;
        int i30 = i;
        int i31 = iM33465;
        if (j5 != i29) {
            throw new ArithmeticException();
        }
        int i32 = i29;
        boolean z8 = true;
        while (i3 <= i28) {
            if (i3 == i2) {
                this.f53163 = z8;
                c49110.setColor(c10682.f36458);
                i10 = i18;
                f4 = f8;
                i12 = i2;
                i8 = iM33445;
                i11 = i30;
                i13 = i3;
                i9 = i31;
                i14 = iM33443;
                i15 = i32;
                canvas.drawRect(fM33441, i32, i18, i32 + i16, c49110);
            } else {
                i8 = iM33445;
                f4 = f8;
                i9 = i31;
                i10 = i18;
                i11 = i30;
                i12 = i2;
                i13 = i3;
                i14 = iM33443;
                i15 = i32;
                if (i13 % 2 != 0) {
                    c49110.setColor(c10682.f36454);
                    canvas.drawRect(fM33441, i15, i10, i15 + i16, c49110);
                } else {
                    c49110.setColor(c10682.f36468);
                    canvas.drawRect(fM33441, i15, i10, i15 + i16, c49110);
                }
            }
            i32 = i15 + i16;
            i3 = i13 + 1;
            z8 = true;
            i18 = i10;
            i30 = i11;
            i2 = i12;
            iM33445 = i8;
            iM33443 = i14;
            f8 = f4;
            i31 = i9;
        }
        i3 = iM38953;
        int i33 = iM33445;
        float f10 = f8;
        int i34 = i31;
        int i35 = i18;
        int i36 = i30;
        int i37 = i2;
        int i38 = iM33443;
        if (c13733.m33475()) {
            c4916 = c49110;
            int i39 = i38 / i36;
            int i40 = i34;
            int i41 = i40 / i36;
            if ((iM38953 > i39 || i39 > i28) && ((iM38953 > i41 || i41 > i28) && (i39 >= iM38953 || i41 <= i28))) {
                i4 = i35;
                i5 = i28;
                c13732 = c13733;
                f2 = 4.0f;
                drawable = null;
                drawable2 = null;
            } else {
                c4916.setColor(c10682.f36470);
                Drawable drawable4 = null;
                Drawable drawable5 = null;
                int i42 = iM38953;
                while (i42 <= i28) {
                    long j14 = ((((long) i42) * j4) + j) - jM32235;
                    int i43 = (int) j14;
                    int i44 = i28;
                    C13732 c13734 = c13733;
                    if (j14 != i43) {
                        throw new ArithmeticException();
                    }
                    int i45 = i42 * i36;
                    int i46 = (i45 + i36) - 1;
                    int i47 = i38;
                    if ((i45 > i47 || i47 > i46) && ((i45 > i40 || i40 > i46) && (i47 >= i45 || i40 <= i46))) {
                        i6 = i40;
                        i35 = i35;
                        i47 = i47;
                    } else {
                        if (i47 >= i45) {
                            this.f53172 = z2;
                            z5 = true;
                            this.f53166 = true;
                            z4 = z2;
                            i7 = i47;
                        } else {
                            z4 = false;
                            i7 = i45;
                            z5 = true;
                        }
                        if (i40 <= i46) {
                            this.f53172 = z2;
                            this.f53166 = z5;
                            i46 = i40;
                            z6 = z2;
                        } else {
                            z6 = false;
                        }
                        float f11 = (i7 % i36) * f7;
                        float f12 = (f11 * 3.0f) + fM33441 + f7;
                        float f13 = (i46 % i36) * f7;
                        float f14 = (f7 * 3.0f) + (f13 * 3.0f) + fM33441;
                        float f15 = fM38954 + f13 + f7;
                        float f16 = i43;
                        float f17 = i43 + i16;
                        i6 = i40;
                        canvas.drawRect(f12, f16, f14, f17, c4916);
                        canvas.drawRect(fM38954 + f11, f16, f15, f17, c4916);
                        if (z4) {
                            Drawable drawable6 = c10682.f36466;
                            float intrinsicWidth = (f12 - ((drawable6.getIntrinsicWidth() * 3) / 4)) - (f6 * 1.5f);
                            float intrinsicWidth2 = drawable6.getIntrinsicWidth() + intrinsicWidth;
                            f3 = f17;
                            float intrinsicHeight = drawable6.getIntrinsicHeight() + f3;
                            drawable6.setBounds((int) intrinsicWidth, (int) f3, (int) intrinsicWidth2, (int) intrinsicHeight);
                            this.f53174.set(intrinsicWidth, f3, intrinsicWidth2, intrinsicHeight);
                            drawable5 = drawable6;
                        } else {
                            f3 = f17;
                        }
                        if (z6) {
                            Drawable drawable7 = c10682.f36451;
                            float intrinsicWidth3 = (f6 * 1.5f) + (f14 - (drawable7.getIntrinsicWidth() / 4.0f));
                            float intrinsicWidth4 = drawable7.getIntrinsicWidth() + intrinsicWidth3;
                            float intrinsicHeight2 = drawable7.getIntrinsicHeight() + f3;
                            drawable7.setBounds((int) intrinsicWidth3, (int) f3, (int) intrinsicWidth4, (int) intrinsicHeight2);
                            this.f53168.set(intrinsicWidth3, f3, intrinsicWidth4, intrinsicHeight2);
                            drawable4 = drawable7;
                        }
                    }
                    i42++;
                    c13733 = c13734;
                    i35 = i35;
                    i28 = i44;
                    i38 = i47;
                    i40 = i6;
                }
                i4 = i35;
                i5 = i28;
                c13732 = c13733;
                drawable = drawable4;
                drawable2 = drawable5;
                f2 = 4.0f;
            }
        } else if (iM38953 > i37 || i37 > i28) {
            c4916 = c49110;
            i4 = i35;
            i5 = i28;
            c13732 = c13733;
            f2 = 4.0f;
            drawable = null;
            drawable2 = null;
        } else {
            this.f53166 = true;
            int i48 = i38 % i36;
            long j15 = ((((long) i37) * j4) + j) - jM32235;
            int i49 = (int) j15;
            if (j15 != i49) {
                throw new ArithmeticException();
            }
            float f18 = i48 * f7;
            float f19 = (f18 * 3.0f) + fM33441;
            float f20 = c13733.m33469() ? f19 + f7 : f19 + f7 + f7;
            if (z) {
                c49110.setColor(c10682.f36465);
                canvas.drawRect(f20, i49, f20 + 3.0f, i49 + i16, c49110);
            }
            this.f53172 = z2;
            if (z2) {
                Drawable drawable8 = c10682.f36459;
                float intrinsicWidth5 = drawable8.getIntrinsicWidth() / 2;
                float f21 = (f20 - intrinsicWidth5) + 3.0f;
                float f22 = i49 + i16;
                float f23 = f20 + intrinsicWidth5;
                float intrinsicHeight3 = drawable8.getIntrinsicHeight() + f22;
                this.f53173.set(f21, f22, f23, intrinsicHeight3);
                drawable8.setBounds((int) f21, (int) f22, (int) f23, (int) intrinsicHeight3);
                drawable3 = drawable8;
            } else {
                drawable3 = null;
            }
            f2 = 4.0f;
            float f24 = fM38954 + f18;
            c49110.setColor(c10682.f36470);
            float f25 = i49 + i16;
            c4916 = c49110;
            canvas.drawRect(f24, i49, f24 + f7, f25, c49110);
            i4 = i35;
            i5 = i28;
            c13732 = c13733;
            drawable2 = drawable3;
            drawable = null;
        }
        int i50 = iM38953;
        int i51 = i19;
        int i52 = i5;
        while (i50 <= i52) {
            int i53 = (i50 - iM38953) * i36;
            int i54 = i33;
            int iMin = Math.min(i53 + i36, i54);
            float f26 = fM33441 + f7;
            float f27 = fM38954;
            int i55 = i53;
            while (i55 < iMin) {
                c4916.setColor(this.f53169[i55] ? c10682.f36449 : c10682.f36465);
                byte b = this.f53177[i55];
                int i56 = b & 255;
                char c = cArr[i56 >>> 4];
                int i57 = iMin;
                char[] cArr3 = this.f53171;
                cArr3[0] = c;
                cArr3[1] = cArr[b & 15];
                this.f53165[0] = (char) i56;
                float f28 = i51;
                int i58 = i50;
                C4916 c49111 = c4916;
                canvas.drawText(cArr3, 0, 2, f26, f28, c49111);
                canvas.drawText(this.f53165, 0, 1, f27, f28, c49111);
                f26 = (f7 * 3.0f) + f26;
                f27 += f7;
                i55++;
                i54 = i54;
                iMin = i57;
                i52 = i52;
                i50 = i58;
            }
            i51 += i16;
            i50++;
            i33 = i54;
        }
        c4916.setColor(c10682.f36456);
        float f29 = f7 * 3.0f * f2;
        long jM19505 = C7309.m19505(j7, j4, j2, j4);
        int i59 = (int) jM19505;
        if (jM19505 != i59) {
            throw new ArithmeticException();
        }
        long jM33464 = ((long) c13732.m33464()) * j7;
        int iM33442 = c13732.m33442();
        float f30 = fM33441;
        int i60 = 0;
        while (i60 < i36) {
            long j16 = jM33464 + 4;
            int i61 = i23;
            int i62 = i59;
            int i63 = i60;
            canvas.drawLine(f30, i61, f30, i60 == 0 ? f10 : jM33464 <= ((long) iM33442) ? i59 : i59 - i16, c4916);
            if (i63 == 0) {
                f30 += f9;
            }
            f30 += f29;
            i60 = i63 + 4;
            i23 = i61;
            i59 = i62;
            jM33464 = j16;
        }
        int i64 = i23;
        float f31 = f30 + f7;
        c4916.setColor(c10682.f36469);
        float f32 = f31 - (f7 * 0.5f);
        float f33 = i64;
        C4916 c49112 = c4916;
        canvas.drawRect(f32, f33, f31, f10, c49112);
        c4916.setColor(c10682.f36456);
        canvas.drawLine(f32, f33, f32, f10, c49112);
        canvas.drawLine(f31, f33, f31, f10, c49112);
        int i65 = i4;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (f > 0.0f) {
            int height2 = c13026.getHeight() - i64;
            long jM38966 = m38966();
            long j17 = height2;
            long j18 = jM38966 + j17;
            if (jM38966 > 0) {
                float fM32235 = ((c13026.m32235() * 10000) / jM38966) / 10000.0f;
                if (j18 / j17 > 3) {
                    int i66 = c10682.f36452;
                    c4916.setColor((((int) (((i66 >>> 24) & 255) * f)) << 24) | (i66 & 16777215));
                    float f34 = c10682.f36460;
                    float f35 = i65;
                    float f36 = f35 - (f5 * f);
                    canvas.drawRect(f36, f33, f35, f10, c4916);
                    int i67 = z3 ? c10682.f36446 : c10682.f36473;
                    c4916.setColor((((int) (((i67 >>> 24) & 255) * f)) << 24) | (i67 & 16777215));
                    float f37 = f35 - (f5 * 1.5f);
                    float f38 = i64 + ((int) (((((double) i27) - ((double) i64)) - ((double) f34)) * ((double) fM32235)));
                    float f39 = f38 + f34;
                    this.f53170.m49669(f37, f38, f35, f39);
                    canvas.drawRect(f36, f38, f35, f39, c4916);
                    z7 = true;
                } else {
                    int i68 = c10682.f36471;
                    c4916.setColor((((int) (((i68 >>> 24) & 255) * f)) << 24) | (i68 & 16777215));
                    float f40 = (j17 * j17) / j18;
                    float f41 = i65;
                    float f42 = i64 + ((int) (((i27 - i64) - f40) * fM32235));
                    canvas.drawRect(f41 - c10682.f36464, f42, f41, f42 + f40, c4916);
                    z7 = false;
                }
            } else {
                z7 = false;
            }
        } else {
            z7 = false;
        }
        this.f53164 = z7;
        c4916.setColor(c10682.f36469);
        float f43 = i65;
        C4916 c49113 = c4916;
        canvas.drawRect(0.0f, 0.0f, f43, f33, c49113);
        c4916.setColor(c10682.f36462);
        canvas.drawRect(0.0f, i64 - 1, f43, i64 + 1, c49113);
        float f44 = c10682.f36475 / 2.0f;
        int i69 = c10682.f36457;
        int i70 = i64 - i69;
        int i71 = i69 / 4;
        float f45 = fM38954;
        for (int i72 = 0; i72 < i36; i72++) {
            float f46 = (((i72 * 3) + 2) * f7) + fM33441;
            float f47 = f46 - f44;
            float f48 = i70;
            canvas.drawRect(f47, f48, f46 + f44, f33, c4916);
            String[] strArr = f53161;
            float f49 = (i70 - i16) + i17 + i71;
            canvas.drawText(strArr[i72], f47 - f9, f49, c4916);
            float f50 = f45 + f9;
            canvas.drawRect(f50 - f44, f48, f50 + f44, f33, c4916);
            canvas.drawText(strArr[i72], f45, f49, c4916);
            f45 += f7;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38961(int i, C14251 c14251, boolean z) {
        C13026 c13026 = this.f53162;
        int iM33464 = c13026.f43452.m33464();
        C10682 c10682 = c13026.f43457;
        int i2 = c10682.f36474;
        float f = c10682.f36461;
        int iM33441 = (int) ((c13026.f43452.m33441() + 1) * f);
        long j = i2;
        long jM38955 = (((long) (i / iM33464)) * j) + ((long) m38955());
        long j2 = j + jM38955;
        int i3 = (i % iM33464) * 3;
        int i4 = i3 + 1;
        if (z) {
            i4 = i3 + 3;
        }
        int i5 = (int) ((i4 * f) + iM33441);
        c14251.f46662 = i5;
        c14251.f46659 = jM38955;
        c14251.f46661 = i5;
        c14251.f46660 = j2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m38957() {
        return this.f53163;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m38965() {
        return this.f53166;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final RectF m38956() {
        return this.f53173;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final RectF m38964() {
        return this.f53174;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final RectF m38973() {
        return this.f53168;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22398 m38969() {
        return this.f53170;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m38968(int i) {
        return ((long) i) * ((long) this.f53162.f43457.f36474);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m38960(int i) {
        C13026 c13026 = this.f53162;
        C10682 c10682 = c13026.f43457;
        return Math.max(((((((long) i) + 1) * ((long) c10682.f36474)) + ((long) m38955())) + ((long) this.f53175)) - ((long) c13026.getHeight()), 0L);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m38966() {
        return m38960(this.f53162.f43452.m33474());
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m38955() {
        C10682 c10682 = this.f53162.f43457;
        return c10682.f36474 + c10682.f36457 + 1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private float m38954() {
        C13026 c13026 = this.f53162;
        C13732 c13732 = c13026.f43452;
        return (C1694.m5620(c13732.m33464(), 3, c13732.m33441() + 1, 1) + 0.5f + 1.0f) * c13026.f43457.f36461;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m38971() {
        return this.f53172;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m38974() {
        return this.f53164;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m38953(long j) {
        C13026 c13026 = this.f53162;
        C13732 c13732 = c13026.f43452;
        C10682 c10682 = c13026.f43457;
        if (c13732.m33442() == 0) {
            this.f53178 = true;
            return 0;
        }
        long jM38955 = (j - ((long) m38955())) / ((long) c10682.f36474);
        int i = (int) jM38955;
        if (jM38955 != i) {
            throw new ArithmeticException();
        }
        if (i < 0) {
            this.f53178 = true;
            return 0;
        }
        int iM33474 = c13732.m33442() % c13732.m33464() == 0 ? c13732.m33474() : c13732.m33474() - 1;
        if (i <= iM33474) {
            return i;
        }
        this.f53178 = true;
        return iM33474;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float m38967() {
        return m38955() + this.f53175;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m38958() {
        return this.f53162.getHeight() - this.f53175;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m38970() {
        return this.f53178;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38959(float f, long j, boolean z) {
        int i = 0;
        this.f53178 = false;
        int iM38953 = m38953(j);
        C13026 c13026 = this.f53162;
        C13732 c13732 = c13026.f43452;
        float f2 = c13026.f43457.f36461;
        float fM33441 = (f2 / 2.0f) + ((c13732.m33441() + 1) * f2);
        if (f <= fM33441) {
            this.f53178 = true;
            this.f53176 = true;
        } else {
            int iM33464 = c13732.m33464();
            int i2 = 0;
            while (true) {
                if (i2 >= iM33464) {
                    if (z || f <= fM33441 + f2) {
                        this.f53178 = true;
                        this.f53176 = false;
                    } else {
                        this.f53176 = true;
                        float fM38954 = m38954();
                        if (f <= fM38954) {
                            this.f53178 = true;
                            break;
                        }
                        while (i < iM33464) {
                            fM38954 += f2;
                            if (f <= fM38954) {
                                break;
                            }
                            i++;
                        }
                        this.f53178 = true;
                    }
                    i = iM33464 - 1;
                    break;
                }
                float f3 = fM33441 + f2;
                if (f <= f3) {
                    this.f53176 = true;
                } else {
                    fM33441 = f3 + (f2 * 2.0f);
                    if (f <= fM33441) {
                        this.f53176 = false;
                    } else {
                        i2++;
                    }
                }
                i = i2;
                break;
            }
        }
        return c13026.f43452.m33444(iM38953, i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m38972() {
        return this.f53176;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38963(C14251 c14251) {
        C13026 c13026 = this.f53162;
        int iM33443 = c13026.f43452.m33443();
        C13732 c13732 = c13026.f43452;
        int iM33465 = c13732.m33465();
        int iM33464 = c13732.m33464();
        C10682 c10682 = c13026.f43457;
        int i = c10682.f36474;
        float f = c10682.f36461;
        int iM33441 = (int) ((c13732.m33441() + 1) * f);
        int i2 = iM33443 / iM33464;
        if (iM33443 == iM33465) {
            long j = i;
            long jM38955 = (((long) i2) * j) + ((long) m38955());
            long j2 = j + jM38955;
            int i3 = (iM33443 % iM33464) * 3;
            int i4 = i3 + 1;
            if (!c13732.m33469()) {
                i4 = i3 + 2;
            }
            int i5 = (int) ((i4 * f) + iM33441);
            c14251.f46662 = i5;
            c14251.f46659 = jM38955;
            c14251.f46661 = i5;
            c14251.f46660 = j2;
            return true;
        }
        if (iM33465 - iM33443 >= iM33464 || i2 != iM33465 / iM33464) {
            return false;
        }
        long j3 = i;
        long jM38956 = (((long) i2) * j3) + ((long) m38955());
        c14251.f46662 = ((int) ((((iM33443 % iM33464) * 3) + 1) * f)) + iM33441;
        c14251.f46659 = jM38956;
        c14251.f46661 = iM33441 + ((int) ((((iM33465 % iM33464) * 3) + 3) * f));
        c14251.f46660 = j3 + jM38956;
        return true;
    }
}
