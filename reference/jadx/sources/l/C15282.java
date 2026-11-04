package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܳۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4IR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15282 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f49948;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f49949;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12628 f49951;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f49954;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f49959;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f49961;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f49962;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f49964;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f49965;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f49967;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final String[] f49946 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final char[] f49945 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final RectF f49955 = new RectF();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final RectF f49952 = new RectF();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final RectF f49966 = new RectF();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23073 f49947 = new C23073(3);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f49957 = C9498.f30777;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean[] f49953 = C10244.f32728;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[] f49958 = new int[0];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f49956 = new byte[0];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char[] f49963 = new char[2];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] f49950 = new char[1];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final char[] f49960 = new char[13];

    public C15282(C12628 c12628) {
        this.f49951 = c12628;
        C5171 c5171 = c12628.f40497;
        this.f49949 = (Math.max(Math.max(c5171.f18032.getIntrinsicHeight(), c5171.f18022.getIntrinsicHeight()), c5171.f18020.getIntrinsicHeight()) * 3) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:256:0x069c  */
    /* JADX WARN: Code duplicated, block: B:258:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:260:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:261:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:264:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:268:0x06ea A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:271:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:272:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:275:0x073e  */
    /* JADX WARN: Code duplicated, block: B:280:0x0788  */
    /* JADX WARN: Code duplicated, block: B:282:0x079c  */
    /* JADX WARN: Code duplicated, block: B:284:0x07a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:285:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:286:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:288:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:289:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:293:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:296:0x0807  */
    /* JADX WARN: Code duplicated, block: B:298:0x080d  */
    /* JADX WARN: Code duplicated, block: B:301:0x0819  */
    /* JADX WARN: Code duplicated, block: B:310:0x0852  */
    /* JADX WARN: Code duplicated, block: B:313:0x085a  */
    /* JADX WARN: Code duplicated, block: B:315:0x0860  */
    /* JADX WARN: Code duplicated, block: B:317:0x0872  */
    /* JADX WARN: Code duplicated, block: B:319:0x088a  */
    /* JADX WARN: Code duplicated, block: B:321:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:322:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:324:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:325:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:328:0x08df  */
    /* JADX WARN: Code duplicated, block: B:329:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:331:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:333:0x0924  */
    /* JADX WARN: Code duplicated, block: B:334:0x0927  */
    /* JADX WARN: Code duplicated, block: B:336:0x0939  */
    /* JADX WARN: Code duplicated, block: B:337:0x093e  */
    /* JADX WARN: Code duplicated, block: B:341:0x094b  */
    /* JADX WARN: Code duplicated, block: B:343:0x097f  */
    /* JADX WARN: Code duplicated, block: B:345:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:346:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:350:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:382:0x0751 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x07d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0198  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36661(Canvas canvas, boolean z, boolean z2, float f, boolean z3) {
        int i;
        C3176 c3176;
        int i2;
        int iM17190;
        long j;
        int i3;
        long j2;
        int i4;
        char[] cArr;
        int i5;
        int i6;
        int i7;
        Drawable drawable;
        Drawable drawable2;
        float f2;
        int i8;
        C5171 c5171;
        long j3;
        boolean z4;
        boolean z5;
        boolean z6;
        Drawable drawable3;
        int i9;
        int i10;
        int i11;
        float f3;
        int i12;
        int i13;
        int i14;
        C12628 c12628;
        boolean z7;
        float f4;
        int i15;
        int i16;
        float f5;
        int i17;
        int i18;
        float f6;
        String[] strArr;
        float f7;
        long jM36675;
        long j4;
        long j5;
        float fM31378;
        float f8;
        float f9;
        int i19;
        float f10;
        float f11;
        long jM29929;
        int i20;
        float f12;
        int i21;
        int i22;
        long j6;
        float f13;
        float f14;
        int i23;
        int i24;
        int i25;
        int iMin;
        int i26;
        int i27;
        float fM36657;
        int i28;
        int i29;
        float f15;
        int i30;
        int i31;
        int i32;
        int i33;
        Drawable drawable4;
        int i34;
        int i35;
        int i36;
        boolean z8;
        int i37;
        int i38;
        int i39;
        C10232 c10232;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        C10232 c10233;
        char[] cArr2;
        C15282 c15282 = this;
        c15282.f49948 = false;
        c15282.f49961 = false;
        C12628 c12629 = c15282.f49951;
        C5917 c5917 = c12629.f40509;
        C5171 c5172 = c12629.f40497;
        int width = c12629.getWidth();
        int height = c12629.getHeight();
        int i45 = c5172.f18053;
        int i46 = c5172.f18035;
        float f16 = c5172.f18046;
        float f17 = c5172.f18021;
        int iM36667 = m36667();
        float f18 = c5172.f18049;
        float fM36670 = m36670();
        int iM17204 = c5917.m17204();
        C10232 c10234 = c5172.f18048;
        int i47 = c5172.f18045;
        long jM31378 = c12629.m31378();
        int i48 = i46;
        long j7 = iM36667;
        int iM36651 = c15282.m36651(jM31378 + j7);
        int iMax = Math.max(iM36651, c15282.m36651(jM31378 + ((long) height)));
        float fM36656 = m36656();
        long j8 = j7 - jM31378;
        long j9 = iM36651;
        long j10 = i45;
        long j11 = (j9 * j10) + j8;
        int i49 = width;
        long j12 = ((long) i47) + j11;
        int i50 = (int) j12;
        if (j12 != i50) {
            throw new ArithmeticException();
        }
        long j13 = iMax;
        long j14 = (j13 - j9) + 1;
        int i51 = iMax;
        long j15 = (int) j14;
        if (j14 != j15) {
            throw new ArithmeticException();
        }
        long j16 = iM17204;
        long j17 = j15 * j16;
        int i52 = (int) j17;
        long j18 = i52;
        if (j17 != j18) {
            throw new ArithmeticException();
        }
        if (c15282.f49957.length < i52) {
            c15282.f49957 = new byte[i52];
            c15282.f49953 = new boolean[i52];
        }
        long j19 = j9 * j16;
        C3176 c3177 = c12629.f40510;
        if (c3177 == null) {
            i = (int) j19;
            if (j19 != i) {
                throw new ArithmeticException();
            }
            c3176 = c3177;
            iM17190 = c5917.m17190(i, i52, c15282.f49957, c15282.f49953);
            i2 = i45;
        } else {
            C13616 c13616 = c3177.f10302;
            if (c15282.f49958.length < i52) {
                c15282.f49958 = new int[i52];
                c15282.f49956 = new byte[i52];
            }
            int iMax2 = (int) Math.max(0L, Math.min(j18, c13616.f43259 - j19));
            int i53 = 0;
            int i54 = -1;
            i = -1;
            while (i53 < iMax2) {
                int i55 = i45;
                long j20 = ((long) i53) + j19;
                int iM10367 = c3177.m10367(j20);
                C3176 c3178 = c3177;
                c15282.f49958[i53] = iM10367;
                byte[] bArr = c15282.f49956;
                int i56 = iMax2;
                C4933 c4933 = c13616.f43256;
                if (c4933 == null) {
                    i3 = 0;
                    j = j19;
                } else {
                    while (true) {
                        C4933 c4934 = c4933.f17200;
                        if (c4934 == null) {
                            break;
                        }
                        long j21 = j19;
                        long j22 = c4934.f17208;
                        if (j20 < j22) {
                            c4933 = c4934;
                        } else {
                            j20 -= j22;
                            c4933 = c4933.f17202;
                        }
                        j19 = j21;
                    }
                    j = j19;
                    i3 = c4933.f17201;
                }
                bArr[i53] = (byte) i3;
                if (iM10367 >= 0) {
                    if (i < 0) {
                        i = iM10367;
                    }
                    i54 = iM10367;
                }
                i53++;
                i45 = i55;
                c3177 = c3178;
                iMax2 = i56;
                c13616 = c13616;
                j19 = j;
            }
            c3176 = c3177;
            int i57 = iMax2;
            i2 = i45;
            if (i >= 0) {
                c5917.m17190(i, (i54 - i) + 1, c15282.f49957, c15282.f49953);
            }
            iM17190 = i57;
        }
        canvas.drawColor(c5172.f18036);
        c10234.setColor(c5172.f18052);
        float f19 = height;
        C10232 c10235 = c10234;
        C3176 c3179 = c3176;
        int i58 = iM36651;
        int i59 = iM17204;
        canvas.drawRect(0.0f, 0.0f, fM36670, f19, c10235);
        if (c3179 != null) {
            long j23 = c3179.f10294;
            if (j23 < 0) {
                j2 = -1;
            } else {
                j2 = j23 / j16;
            }
        } else {
            j2 = -1;
        }
        if (j2 < j9 || j2 > j13) {
            i4 = i2;
        } else {
            float f20 = (j2 * j10) + j8;
            c10235.setColor(c5172.f18034);
            int i60 = i2;
            i4 = i60;
            canvas.drawRect(0.0f, f20, fM36670, f20 + i60, c10235);
        }
        c10235.setColor(c5172.f18024);
        float f21 = f18 / 2.0f;
        float paddingLeft = c12629.getPaddingLeft() + f21;
        int i61 = i50;
        int i62 = i58;
        while (true) {
            cArr = f49945;
            i5 = i51;
            if (i62 > i5) {
                break;
            }
            long j24 = ((long) i62) * j16;
            if (c3179 != null) {
                int i63 = (i62 - i58) * i59;
                int i64 = i63;
                while (true) {
                    if (i64 >= Math.min(i63 + i59, iM17190)) {
                        j24 = -1;
                        break;
                    }
                    int i65 = c15282.f49958[i64];
                    if (i65 >= 0) {
                        j24 = i65;
                        break;
                    }
                    i64++;
                }
            }
            if (j24 >= 0) {
                C3176 c31710 = c12629.f40510;
                int iM17209 = c31710 == null ? c12629.f40509.m17209() : c31710.f10292;
                int i66 = iM17209 - 1;
                while (true) {
                    cArr2 = c15282.f49960;
                    if (i66 < 0) {
                        break;
                    }
                    cArr2[i66] = cArr[(int) (j24 & 15)];
                    j24 >>>= 4;
                    i66--;
                    i = i;
                    i59 = i59;
                }
                i42 = i;
                i43 = i59;
                cArr2[iM17209] = ' ';
                cArr2[iM17209 + 1] = ' ';
                cArr2[iM17209 + 2] = ' ';
                cArr2[iM17209 + 3] = ' ';
                cArr2[iM17209 + 4] = '.';
                i40 = i5;
                i41 = i61;
                canvas.drawText(c15282.f49960, 0, iM17209 + 5, paddingLeft, i61, c10235);
                c10233 = c10235;
                i44 = i4;
            } else {
                i40 = i5;
                i41 = i61;
                i42 = i;
                i43 = i59;
                C10232 c10236 = c10235;
                i44 = i4;
                c10233 = c10236;
                c15282.m36652(canvas, c10233, paddingLeft + f21, (i44 / 2.0f) + (i41 - i47));
            }
            int i67 = i41 + i44;
            i62++;
            i4 = i44;
            i48 = i48;
            i58 = i58;
            i = i42;
            i59 = i43;
            i51 = i40;
            c10235 = c10233;
            i61 = i67;
        }
        C10232 c10237 = c10235;
        int i68 = i;
        int i69 = i59;
        int i70 = i48;
        int i71 = i58;
        int i72 = i4;
        boolean z9 = r6 != 0 && (r6.f10293 || r6.f10298);
        long jM36676 = z9 ? r6.f10299 : c15282.m36676(c5917.m17202());
        long jM36677 = z9 ? r6.f10291 : c15282.m36676(c5917.m17208());
        boolean zM17206 = z9 ? r6.f10304 : c5917.m17206();
        boolean zM17220 = z9 ? r6.f10295 : c5917.m17220();
        boolean z10 = (r6 == 0 || c12629.isFocused()) ? false : true;
        if (z10) {
            int i73 = c5172.f18030;
            i6 = (((i73 >>> 24) / 2) << 24) | (i73 & 16777215);
        } else {
            i6 = c5172.f18030;
        }
        int i74 = i6;
        int i75 = zM17206 ? -1 : (int) (jM36676 / j16);
        c15282.f49964 = false;
        int i76 = (int) j11;
        if (j11 != i76) {
            throw new ArithmeticException();
        }
        int i77 = i76;
        int i78 = i71;
        int i79 = i5;
        while (i78 <= i79) {
            if (i78 == i75) {
                c15282.f49964 = true;
            }
            if (r6 != 0 ? i78 != j2 : i78 != i75) {
                i37 = i79;
                i39 = i74;
                z8 = zM17220;
                i35 = i70;
                i36 = i49;
                i38 = i75;
                c10232 = c10237;
                if (i78 % 2 != 0) {
                    c10232.setColor(c5172.f18028);
                    canvas.drawRect(fM36670, i77, i36, i77 + i72, c10232);
                } else {
                    c10232.setColor(c5172.f18036);
                    canvas.drawRect(fM36670, i77, i36, i77 + i72, c10232);
                }
            } else {
                c10237.setColor(c5172.f18034);
                int i80 = i49;
                i35 = i70;
                i36 = i80;
                z8 = zM17220;
                i37 = i79;
                i38 = i75;
                i39 = i74;
                c10232 = c10237;
                canvas.drawRect(fM36670, i77, i80, i77 + i72, c10237);
            }
            i77 += i72;
            i78++;
            i75 = i38;
            c10237 = c10232;
            zM17220 = z8;
            i79 = i37;
            i74 = i39;
            i49 = i36;
            i70 = i35;
        }
        int i81 = i79;
        int i82 = i74;
        boolean z11 = zM17220;
        int i83 = i70;
        int i84 = i49;
        int i85 = i75;
        C10232 c10238 = c10237;
        if (r6 != 0) {
            int i86 = 0;
            while (i86 < iM17190) {
                if (c15282.f49956[i86] == 0) {
                    i34 = iM17190;
                } else {
                    int i87 = i86 % i69;
                    float f22 = (((long) (i71 + (i86 / i69))) * j10) + j8;
                    float fM36658 = c15282.m36657(i87) - ((m36665() - (f18 * 2.0f)) / 2.0f);
                    C10232 c10239 = c10238;
                    c10239.setColor(C3176.m10366((int) c15282.f49956[i86]));
                    int i88 = i69 - 1;
                    float f23 = i72 + f22;
                    i34 = iM17190;
                    c10238 = c10239;
                    canvas.drawRect(fM36658, f22, (i87 != i88 || c12629.m31351()) ? m36665() + fM36658 : i84, f23, c10238);
                    if (c12629.m31351()) {
                        float f24 = (i87 * f18) + fM36656;
                        canvas.drawRect(f24, f22, i87 == i88 ? i84 : f24 + f18, f23, c10238);
                    }
                }
                i86++;
                iM17190 = i34;
            }
        }
        int i89 = iM17190;
        if (zM17206) {
            c10238 = c10238;
            i7 = i81;
            int i90 = (int) (jM36676 / j16);
            int i91 = (int) (jM36677 / j16);
            if ((i71 <= i90 && i90 <= i7) || ((i71 <= i91 && i91 <= i7) || (i90 < i71 && i91 > i7))) {
                c10238.setColor(i82);
                Drawable drawable5 = null;
                Drawable drawable6 = null;
                int i92 = i71;
                while (i92 <= i7) {
                    long j25 = i92;
                    long j26 = ((j25 * j10) + j7) - jM31378;
                    int i93 = (int) j26;
                    C5171 c5173 = c5172;
                    if (j26 != i93) {
                        throw new ArithmeticException();
                    }
                    long j27 = j25 * j16;
                    long j28 = (j27 + j16) - 1;
                    if ((j27 > jM36676 || jM36676 > j28) && ((j27 > jM36677 || jM36677 > j28) && (jM36676 >= j27 || jM36677 <= j28))) {
                        i8 = i92;
                        c5171 = c5173;
                        i84 = i84;
                    } else {
                        if (jM36676 >= j27) {
                            c15282.f49948 = z2;
                            z4 = true;
                            c15282.f49961 = true;
                            z5 = z2;
                            j3 = jM36676;
                        } else {
                            j3 = j27;
                            z4 = true;
                            z5 = false;
                        }
                        if (jM36677 <= j28) {
                            c15282.f49948 = z2;
                            c15282.f49961 = z4;
                            z6 = z2;
                            j28 = jM36677;
                        } else {
                            z6 = false;
                        }
                        long j29 = j3 % j16;
                        float fM36659 = c15282.m36657((int) j29);
                        long j30 = j28 % j16;
                        float fM366510 = (f18 * 2.0f) + c15282.m36657((int) j30);
                        float f25 = (j29 * f18) + fM36656;
                        float f26 = (j30 * f18) + fM36656 + f18;
                        float f27 = i93;
                        float f28 = i93 + i72;
                        i8 = i92;
                        canvas.drawRect(fM36659, f27, fM366510, f28, c10238);
                        if (c12629.m31351()) {
                            canvas.drawRect(f25, f27, f26, f28, c10238);
                        }
                        if (z5) {
                            c5171 = c5173;
                            Drawable drawable7 = c5171.f18032;
                            float intrinsicWidth = (fM36659 - ((drawable7.getIntrinsicWidth() * 3) / 4)) - (f16 * 1.5f);
                            float intrinsicWidth2 = drawable7.getIntrinsicWidth() + intrinsicWidth;
                            float intrinsicHeight = drawable7.getIntrinsicHeight() + f28;
                            drawable7.setBounds((int) intrinsicWidth, (int) f28, (int) intrinsicWidth2, (int) intrinsicHeight);
                            c15282.f49952.set(intrinsicWidth, f28, intrinsicWidth2, intrinsicHeight);
                            drawable6 = drawable7;
                        } else {
                            c5171 = c5173;
                        }
                        if (z6) {
                            Drawable drawable8 = c5171.f18022;
                            float intrinsicWidth3 = (f16 * 1.5f) + (fM366510 - (drawable8.getIntrinsicWidth() / 4.0f));
                            float intrinsicWidth4 = drawable8.getIntrinsicWidth() + intrinsicWidth3;
                            float intrinsicHeight2 = drawable8.getIntrinsicHeight() + f28;
                            drawable8.setBounds((int) intrinsicWidth3, (int) f28, (int) intrinsicWidth4, (int) intrinsicHeight2);
                            c15282.f49966.set(intrinsicWidth3, f28, intrinsicWidth4, intrinsicHeight2);
                            drawable5 = drawable8;
                        }
                    }
                    i92 = i8 + 1;
                    c5172 = c5171;
                    i84 = i84;
                }
                c5172 = c5172;
                i84 = i84;
                drawable = drawable5;
                drawable2 = drawable6;
                f2 = 4.0f;
            }
            i9 = i71;
            i10 = i50;
            while (i9 <= i7) {
                i24 = (i9 - i71) * i69;
                i25 = i89;
                iMin = Math.min(i24 + i69, i25);
                i26 = i24;
                while (i26 < iMin) {
                    i27 = i26 - i24;
                    fM36657 = c15282.m36657(i27);
                    if (r6 == 0) {
                        i28 = i26;
                    } else {
                        i28 = c15282.f49958[i26] - i68;
                    }
                    if (r6 != 0) {
                    }
                    if (c15282.f49953[i28]) {
                        i29 = c5172.f18025;
                    } else {
                        i29 = c5172.f18033;
                    }
                    c10238.setColor(i29);
                    byte b = c15282.f49957[i28];
                    int i94 = b & 255;
                    char c = cArr[i94 >>> 4];
                    char[] cArr3 = c15282.f49963;
                    cArr3[0] = c;
                    cArr3[1] = cArr[b & 15];
                    c15282.f49950[0] = (char) i94;
                    f15 = i10;
                    i30 = iMin;
                    i31 = i25;
                    i32 = i9;
                    i33 = i72;
                    canvas.drawText(cArr3, 0, 2, fM36657, f15, c10238);
                    if (c12629.m31351()) {
                        canvas.drawText(c15282.f49950, 0, 1, (i27 * f18) + fM36656, f15, c10238);
                    }
                    i26++;
                    i9 = i32;
                    iMin = i30;
                    i72 = i33;
                    i25 = i31;
                }
                i10 += i72;
                i9++;
                i89 = i25;
            }
            i11 = i72;
            c10238.setColor(c5172.f18039);
            f3 = iM36667;
            canvas.drawLine(fM36670, f3, fM36670, f19, c10238);
            if (c12629.m31351()) {
                f11 = f18 * 3.0f * f2;
                jM29929 = C11958.m29929(j13, j10, j8, j10);
                i20 = (int) jM29929;
                if (jM29929 != i20) {
                    throw new ArithmeticException();
                }
                f12 = fM36670;
                i21 = i69;
                i22 = 0;
                j6 = j13 * j16;
                while (i22 < i21) {
                    if (i22 == 0) {
                        f14 = f19;
                    } else {
                        if (j6 <= m36649()) {
                            f13 = i20;
                        } else {
                            f13 = i20 - i11;
                        }
                        f14 = f13;
                    }
                    int i95 = i21;
                    float f29 = f14;
                    i23 = i22;
                    canvas.drawLine(f12, f3, f12, f29, c10238);
                    if (i23 == 0) {
                        f12 += f21;
                    }
                    f12 += f11;
                    j6 += 4;
                    i22 = i23 + 4;
                    i21 = i95;
                }
                i12 = i21;
                float f30 = f12 + f18;
                c10238.setColor(c5172.f18052);
                float f31 = f30 - (f18 * 0.5f);
                Paint paint = c10238;
                canvas.drawRect(f31, f3, f30, f19, paint);
                c10238.setColor(c5172.f18039);
                canvas.drawLine(f31, f3, f31, f19, paint);
                canvas.drawLine(f30, f3, f30, f19, paint);
            } else {
                i12 = i69;
            }
            c12629.m31360(canvas, drawable2, drawable);
            if (r6 == 0) {
                i13 = i83;
            } else {
                i13 = i83;
            }
            if (f > 0.0f) {
                c12628 = c12629;
                if (c12628.f40533) {
                    int height2 = c12628.getHeight() - iM36667;
                    jM36675 = m36675();
                    j4 = height2;
                    j5 = jM36675 + j4;
                    if (jM36675 > 0) {
                        fM31378 = ((c12628.m31378() * 10000) / jM36675) / 10000.0f;
                        if (j5 / j4 > 3) {
                            c10238.setColor((i13 & 16777215) | (((int) (((i13 >>> 24) & 255) * f)) << 24));
                            f9 = f17 * f;
                            float f32 = c5172.f18027;
                            if (r6 == 0) {
                                int i96 = i84;
                                float f33 = i96;
                                i14 = i96;
                                canvas.drawRect(f33 - f9, f3, f33, f19, c10238);
                            } else {
                                i14 = i84;
                            }
                            if (z3) {
                                i19 = c5172.f18037;
                            } else {
                                i19 = c5172.f18040;
                            }
                            c10238.setColor((((int) (((i19 >>> 24) & 255) * f)) << 24) | (i19 & 16777215));
                            int i97 = iM36667 + ((int) (((((double) height) - ((double) iM36667)) - ((double) f32)) * ((double) fM31378)));
                            float f34 = i14;
                            if (r6 == 0) {
                                f10 = 1.5f;
                            } else {
                                f10 = 1.0f;
                            }
                            float f35 = i97;
                            float f36 = f35 + f32;
                            c15282.f49947.m51985(f34 - (f10 * f17), f35, f34, f36);
                            canvas.drawRect(f34 - f9, f35, f34, f36, c10238);
                            z7 = true;
                        } else {
                            i14 = i84;
                            int i98 = c5172.f18044;
                            c10238.setColor((((int) (((i98 >>> 24) & 255) * f)) << 24) | (i98 & 16777215));
                            float f37 = (j4 * j4) / j5;
                            int i99 = iM36667 + ((int) (((height - iM36667) - f37) * fM31378));
                            float f38 = i14;
                            if (r6 == 0) {
                                f8 = c5172.f18019;
                            } else {
                                f8 = f17;
                            }
                            float f39 = i99;
                            canvas.drawRect(f38 - f8, f39, f38, f39 + f37, c10238);
                        }
                    } else {
                        i14 = i84;
                    }
                } else {
                    i14 = i84;
                }
                c15282.f49954 = z7;
                if (c12628.f40524) {
                    c10238.setColor(c5172.f18052);
                    float f40 = i14;
                    Paint paint2 = c10238;
                    canvas.drawRect(0.0f, 0.0f, f40, f3, paint2);
                    c10238.setColor(c5172.f18038);
                    canvas.drawRect(0.0f, iM36667 - 1, f40, iM36667 + 1, paint2);
                    f4 = c5172.f18029 / 2.0f;
                    int i100 = c5172.f18031;
                    i15 = iM36667 - i100;
                    i16 = i100 / 4;
                    f5 = fM36656;
                    i17 = i12;
                    i18 = 0;
                    while (i18 < i17) {
                        float fM366511 = c15282.m36657(i18) + f18;
                        float f41 = fM366511 - f4;
                        f6 = i15;
                        int i101 = i17;
                        canvas.drawRect(f41, f6, fM366511 + f4, f3, c10238);
                        strArr = f49946;
                        f7 = (i15 - i11) + i47 + i16;
                        canvas.drawText(strArr[i18], f41 - f21, f7, c10238);
                        if (!c12628.m31351()) {
                            float f42 = f5 + f21;
                            canvas.drawRect(f42 - f4, f6, f42 + f4, f3, c10238);
                            canvas.drawText(strArr[i18], f5, f7, c10238);
                            f5 += f18;
                        }
                        i18++;
                        c15282 = this;
                        i17 = i101;
                        c12628 = c12628;
                    }
                }
                if (r6 != 0) {
                }
            }
            i14 = i84;
            c12628 = r7;
            z7 = false;
            c15282.f49954 = z7;
            if (c12628.f40524) {
                c10238.setColor(c5172.f18052);
                float f43 = i14;
                Paint paint3 = c10238;
                canvas.drawRect(0.0f, 0.0f, f43, f3, paint3);
                c10238.setColor(c5172.f18038);
                canvas.drawRect(0.0f, iM36667 - 1, f43, iM36667 + 1, paint3);
                f4 = c5172.f18029 / 2.0f;
                int i102 = c5172.f18031;
                i15 = iM36667 - i102;
                i16 = i102 / 4;
                f5 = fM36656;
                i17 = i12;
                i18 = 0;
                while (i18 < i17) {
                    float fM366512 = c15282.m36657(i18) + f18;
                    float f44 = fM366512 - f4;
                    f6 = i15;
                    int i103 = i17;
                    canvas.drawRect(f44, f6, fM366512 + f4, f3, c10238);
                    strArr = f49946;
                    f7 = (i15 - i11) + i47 + i16;
                    canvas.drawText(strArr[i18], f44 - f21, f7, c10238);
                    if (!c12628.m31351()) {
                        float f45 = f5 + f21;
                        canvas.drawRect(f45 - f4, f6, f45 + f4, f3, c10238);
                        canvas.drawText(strArr[i18], f5, f7, c10238);
                        f5 += f18;
                    }
                    i18++;
                    c15282 = this;
                    i17 = i103;
                    c12628 = c12628;
                }
            }
            if (r6 != 0) {
            }
        }
        if (i71 <= i85) {
            i7 = i81;
            if (i85 <= i7) {
                c15282.f49961 = true;
                int i104 = (int) (jM36676 % j16);
                long j31 = ((((long) i85) * j10) + j7) - jM31378;
                int i105 = (int) j31;
                f2 = 4.0f;
                if (j31 != i105) {
                    throw new ArithmeticException();
                }
                float fM366513 = c15282.m36657(i104) - f18;
                float f46 = z11 ? fM366513 + f18 : fM366513 + f18 + f18;
                if (z) {
                    int i106 = c5172.f18033;
                    if (z10) {
                        i106 = (i106 & 16777215) | 1610612736;
                    }
                    C10232 c102310 = c10238;
                    c102310.setColor(i106);
                    if (r6 == 0 || !r6.f10298) {
                        c10238 = c102310;
                        canvas.drawRect(f46, i105, f46 + 3.0f, i105 + i72, c102310);
                    } else {
                        c102310.setStyle(Paint.Style.STROKE);
                        c10238 = c102310;
                        canvas.drawRect(c15282.m36657(i104), i105 + 1, (f18 * 2.0f) + c15282.m36657(i104), (i105 + i72) - 1, c10238);
                        c10238.setStyle(Paint.Style.FILL);
                    }
                }
                boolean z12 = z2 && (r6 == 0 || !r6.f10298);
                c15282.f49948 = z12;
                if (z12) {
                    drawable4 = c5172.f18020;
                    float intrinsicWidth5 = drawable4.getIntrinsicWidth() / 2;
                    float f47 = (f46 - intrinsicWidth5) + 3.0f;
                    float f48 = i105 + i72;
                    float f49 = f46 + intrinsicWidth5;
                    float intrinsicHeight3 = drawable4.getIntrinsicHeight() + f48;
                    c15282.f49955.set(f47, f48, f49, intrinsicHeight3);
                    drawable4.setBounds((int) f47, (int) f48, (int) f49, (int) intrinsicHeight3);
                } else {
                    drawable4 = null;
                }
                drawable3 = drawable4;
                float f50 = (i104 * f18) + fM36656;
                c10238 = c10238;
                c10238.setColor(i82);
                if (c12629.m31351()) {
                    if (r6 != 0 && r6.f10298) {
                        c10238.setStyle(Paint.Style.STROKE);
                    }
                    canvas.drawRect(f50, i105, f50 + f18, i105 + i72, c10238);
                    c10238.setStyle(Paint.Style.FILL);
                }
                drawable = null;
            }
            drawable2 = drawable3;
            i9 = i71;
            i10 = i50;
            while (i9 <= i7) {
                i24 = (i9 - i71) * i69;
                i25 = i89;
                iMin = Math.min(i24 + i69, i25);
                i26 = i24;
                while (i26 < iMin) {
                    i27 = i26 - i24;
                    fM36657 = c15282.m36657(i27);
                    if (r6 == 0) {
                        i28 = i26;
                    } else {
                        i28 = c15282.f49958[i26] - i68;
                    }
                    if (r6 != 0 || c15282.f49958[i26] >= 0) {
                        if (c15282.f49953[i28]) {
                            i29 = c5172.f18025;
                        } else {
                            i29 = c5172.f18033;
                        }
                        c10238.setColor(i29);
                        byte b2 = c15282.f49957[i28];
                        int i910 = b2 & 255;
                        char c2 = cArr[i910 >>> 4];
                        char[] cArr4 = c15282.f49963;
                        cArr4[0] = c2;
                        cArr4[1] = cArr[b2 & 15];
                        c15282.f49950[0] = (char) i910;
                        f15 = i10;
                        i30 = iMin;
                        i31 = i25;
                        i32 = i9;
                        i33 = i72;
                        canvas.drawText(cArr4, 0, 2, fM36657, f15, c10238);
                        if (c12629.m31351()) {
                            canvas.drawText(c15282.f49950, 0, 1, (i27 * f18) + fM36656, f15, c10238);
                        }
                    } else {
                        c10238.setColor(c5172.f18024);
                        i26 = i26;
                        c15282.m36652(canvas, c10238, fM36657 + f18, (i72 / 2.0f) + (i10 - i47));
                        i30 = iMin;
                        i31 = i25;
                        i32 = i9;
                        i33 = i72;
                    }
                    i26++;
                    i9 = i32;
                    iMin = i30;
                    i72 = i33;
                    i25 = i31;
                }
                i10 += i72;
                i9++;
                i89 = i25;
            }
            i11 = i72;
            c10238.setColor(c5172.f18039);
            f3 = iM36667;
            canvas.drawLine(fM36670, f3, fM36670, f19, c10238);
            if (c12629.m31351()) {
                f11 = f18 * 3.0f * f2;
                jM29929 = C11958.m29929(j13, j10, j8, j10);
                i20 = (int) jM29929;
                if (jM29929 != i20) {
                    throw new ArithmeticException();
                }
                f12 = fM36670;
                i21 = i69;
                i22 = 0;
                j6 = j13 * j16;
                while (i22 < i21) {
                    if (i22 == 0) {
                        f14 = f19;
                    } else {
                        if (j6 <= m36649()) {
                            f13 = i20;
                        } else {
                            f13 = i20 - i11;
                        }
                        f14 = f13;
                    }
                    int i911 = i21;
                    float f210 = f14;
                    i23 = i22;
                    canvas.drawLine(f12, f3, f12, f210, c10238);
                    if (i23 == 0) {
                        f12 += f21;
                    }
                    f12 += f11;
                    j6 += 4;
                    i22 = i23 + 4;
                    i21 = i911;
                }
                i12 = i21;
                float f310 = f12 + f18;
                c10238.setColor(c5172.f18052);
                float f311 = f310 - (f18 * 0.5f);
                Paint paint4 = c10238;
                canvas.drawRect(f311, f3, f310, f19, paint4);
                c10238.setColor(c5172.f18039);
                canvas.drawLine(f311, f3, f311, f19, paint4);
                canvas.drawLine(f310, f3, f310, f19, paint4);
            } else {
                i12 = i69;
            }
            c12629.m31360(canvas, drawable2, drawable);
            if (r6 == 0 && c12629.f40533) {
                if (f <= 0.0f || m36675() <= 0) {
                    i13 = i83;
                } else {
                    i13 = i83;
                    c10238.setColor(i13);
                    float f51 = i84;
                    canvas.drawRect(f51 - f17, f3, f51, f19, c10238);
                }
                r6.m10369(canvas, c5172, i84, iM36667, height, i12);
            } else {
                i13 = i83;
            }
            if (f > 0.0f) {
                c12628 = c12629;
                if (c12628.f40533) {
                    int height3 = c12628.getHeight() - iM36667;
                    jM36675 = m36675();
                    j4 = height3;
                    j5 = jM36675 + j4;
                    if (jM36675 > 0) {
                        fM31378 = ((c12628.m31378() * 10000) / jM36675) / 10000.0f;
                        if (j5 / j4 > 3) {
                            c10238.setColor((i13 & 16777215) | (((int) (((i13 >>> 24) & 255) * f)) << 24));
                            f9 = f17 * f;
                            float f312 = c5172.f18027;
                            if (r6 == 0) {
                                int i912 = i84;
                                float f313 = i912;
                                i14 = i912;
                                canvas.drawRect(f313 - f9, f3, f313, f19, c10238);
                            } else {
                                i14 = i84;
                            }
                            if (z3) {
                                i19 = c5172.f18037;
                            } else {
                                i19 = c5172.f18040;
                            }
                            c10238.setColor((((int) (((i19 >>> 24) & 255) * f)) << 24) | (i19 & 16777215));
                            int i913 = iM36667 + ((int) (((((double) height) - ((double) iM36667)) - ((double) f312)) * ((double) fM31378)));
                            float f314 = i14;
                            if (r6 == 0) {
                                f10 = 1.5f;
                            } else {
                                f10 = 1.0f;
                            }
                            float f315 = i913;
                            float f316 = f315 + f312;
                            c15282.f49947.m51985(f314 - (f10 * f17), f315, f314, f316);
                            canvas.drawRect(f314 - f9, f315, f314, f316, c10238);
                            z7 = true;
                        } else {
                            i14 = i84;
                            int i914 = c5172.f18044;
                            c10238.setColor((((int) (((i914 >>> 24) & 255) * f)) << 24) | (i914 & 16777215));
                            float f317 = (j4 * j4) / j5;
                            int i915 = iM36667 + ((int) (((height - iM36667) - f317) * fM31378));
                            float f318 = i14;
                            if (r6 == 0) {
                                f8 = c5172.f18019;
                            } else {
                                f8 = f17;
                            }
                            float f319 = i915;
                            canvas.drawRect(f318 - f8, f319, f318, f319 + f317, c10238);
                        }
                    } else {
                        i14 = i84;
                    }
                } else {
                    i14 = i84;
                }
                c15282.f49954 = z7;
                if (c12628.f40524) {
                    c10238.setColor(c5172.f18052);
                    float f410 = i14;
                    Paint paint5 = c10238;
                    canvas.drawRect(0.0f, 0.0f, f410, f3, paint5);
                    c10238.setColor(c5172.f18038);
                    canvas.drawRect(0.0f, iM36667 - 1, f410, iM36667 + 1, paint5);
                    f4 = c5172.f18029 / 2.0f;
                    int i107 = c5172.f18031;
                    i15 = iM36667 - i107;
                    i16 = i107 / 4;
                    f5 = fM36656;
                    i17 = i12;
                    i18 = 0;
                    while (i18 < i17) {
                        float fM366514 = c15282.m36657(i18) + f18;
                        float f411 = fM366514 - f4;
                        f6 = i15;
                        int i108 = i17;
                        canvas.drawRect(f411, f6, fM366514 + f4, f3, c10238);
                        strArr = f49946;
                        f7 = (i15 - i11) + i47 + i16;
                        canvas.drawText(strArr[i18], f411 - f21, f7, c10238);
                        if (!c12628.m31351()) {
                            float f412 = f5 + f21;
                            canvas.drawRect(f412 - f4, f6, f412 + f4, f3, c10238);
                            canvas.drawText(strArr[i18], f5, f7, c10238);
                            f5 += f18;
                        }
                        i18++;
                        c15282 = this;
                        i17 = i108;
                        c12628 = c12628;
                    }
                }
                if (r6 != 0 || r6.f10301 || r6.f10300) {
                    return;
                }
                c10238.setColor(c5172.f18039);
                canvas.drawRect(0.0f, f3, 1.0f, f19, c10238);
                return;
            }
            i14 = i84;
            c12628 = r7;
            z7 = false;
            c15282.f49954 = z7;
            if (c12628.f40524) {
                c10238.setColor(c5172.f18052);
                float f413 = i14;
                Paint paint6 = c10238;
                canvas.drawRect(0.0f, 0.0f, f413, f3, paint6);
                c10238.setColor(c5172.f18038);
                canvas.drawRect(0.0f, iM36667 - 1, f413, iM36667 + 1, paint6);
                f4 = c5172.f18029 / 2.0f;
                int i109 = c5172.f18031;
                i15 = iM36667 - i109;
                i16 = i109 / 4;
                f5 = fM36656;
                i17 = i12;
                i18 = 0;
                while (i18 < i17) {
                    float fM366515 = c15282.m36657(i18) + f18;
                    float f414 = fM366515 - f4;
                    f6 = i15;
                    int i1010 = i17;
                    canvas.drawRect(f414, f6, fM366515 + f4, f3, c10238);
                    strArr = f49946;
                    f7 = (i15 - i11) + i47 + i16;
                    canvas.drawText(strArr[i18], f414 - f21, f7, c10238);
                    if (!c12628.m31351()) {
                        float f415 = f5 + f21;
                        canvas.drawRect(f415 - f4, f6, f415 + f4, f3, c10238);
                        canvas.drawText(strArr[i18], f5, f7, c10238);
                        f5 += f18;
                    }
                    i18++;
                    c15282 = this;
                    i17 = i1010;
                    c12628 = c12628;
                }
            }
            if (r6 != 0) {
            }
        }
        i7 = i81;
        f2 = 4.0f;
        drawable3 = null;
        drawable = null;
        drawable2 = drawable3;
        i9 = i71;
        i10 = i50;
        while (i9 <= i7) {
            i24 = (i9 - i71) * i69;
            i25 = i89;
            iMin = Math.min(i24 + i69, i25);
            i26 = i24;
            while (i26 < iMin) {
                i27 = i26 - i24;
                fM36657 = c15282.m36657(i27);
                if (r6 == 0) {
                    i28 = i26;
                } else {
                    i28 = c15282.f49958[i26] - i68;
                }
                if (r6 != 0) {
                }
                if (c15282.f49953[i28]) {
                    i29 = c5172.f18025;
                } else {
                    i29 = c5172.f18033;
                }
                c10238.setColor(i29);
                byte b3 = c15282.f49957[i28];
                int i916 = b3 & 255;
                char c3 = cArr[i916 >>> 4];
                char[] cArr5 = c15282.f49963;
                cArr5[0] = c3;
                cArr5[1] = cArr[b3 & 15];
                c15282.f49950[0] = (char) i916;
                f15 = i10;
                i30 = iMin;
                i31 = i25;
                i32 = i9;
                i33 = i72;
                canvas.drawText(cArr5, 0, 2, fM36657, f15, c10238);
                if (c12629.m31351()) {
                    canvas.drawText(c15282.f49950, 0, 1, (i27 * f18) + fM36656, f15, c10238);
                }
                i26++;
                i9 = i32;
                iMin = i30;
                i72 = i33;
                i25 = i31;
            }
            i10 += i72;
            i9++;
            i89 = i25;
        }
        i11 = i72;
        c10238.setColor(c5172.f18039);
        f3 = iM36667;
        canvas.drawLine(fM36670, f3, fM36670, f19, c10238);
        if (c12629.m31351()) {
            f11 = f18 * 3.0f * f2;
            jM29929 = C11958.m29929(j13, j10, j8, j10);
            i20 = (int) jM29929;
            if (jM29929 != i20) {
                throw new ArithmeticException();
            }
            f12 = fM36670;
            i21 = i69;
            i22 = 0;
            j6 = j13 * j16;
            while (i22 < i21) {
                if (i22 == 0) {
                    f14 = f19;
                } else {
                    if (j6 <= m36649()) {
                        f13 = i20;
                    } else {
                        f13 = i20 - i11;
                    }
                    f14 = f13;
                }
                int i917 = i21;
                float f211 = f14;
                i23 = i22;
                canvas.drawLine(f12, f3, f12, f211, c10238);
                if (i23 == 0) {
                    f12 += f21;
                }
                f12 += f11;
                j6 += 4;
                i22 = i23 + 4;
                i21 = i917;
            }
            i12 = i21;
            float f3110 = f12 + f18;
            c10238.setColor(c5172.f18052);
            float f3111 = f3110 - (f18 * 0.5f);
            Paint paint7 = c10238;
            canvas.drawRect(f3111, f3, f3110, f19, paint7);
            c10238.setColor(c5172.f18039);
            canvas.drawLine(f3111, f3, f3111, f19, paint7);
            canvas.drawLine(f3110, f3, f3110, f19, paint7);
        } else {
            i12 = i69;
        }
        c12629.m31360(canvas, drawable2, drawable);
        if (r6 == 0) {
            i13 = i83;
        } else {
            i13 = i83;
        }
        if (f > 0.0f) {
            c12628 = c12629;
            if (c12628.f40533) {
                int height4 = c12628.getHeight() - iM36667;
                jM36675 = m36675();
                j4 = height4;
                j5 = jM36675 + j4;
                if (jM36675 > 0) {
                    fM31378 = ((c12628.m31378() * 10000) / jM36675) / 10000.0f;
                    if (j5 / j4 > 3) {
                        c10238.setColor((i13 & 16777215) | (((int) (((i13 >>> 24) & 255) * f)) << 24));
                        f9 = f17 * f;
                        float f3112 = c5172.f18027;
                        if (r6 == 0) {
                            int i918 = i84;
                            float f3113 = i918;
                            i14 = i918;
                            canvas.drawRect(f3113 - f9, f3, f3113, f19, c10238);
                        } else {
                            i14 = i84;
                        }
                        if (z3) {
                            i19 = c5172.f18037;
                        } else {
                            i19 = c5172.f18040;
                        }
                        c10238.setColor((((int) (((i19 >>> 24) & 255) * f)) << 24) | (i19 & 16777215));
                        int i919 = iM36667 + ((int) (((((double) height) - ((double) iM36667)) - ((double) f3112)) * ((double) fM31378)));
                        float f3114 = i14;
                        if (r6 == 0) {
                            f10 = 1.5f;
                        } else {
                            f10 = 1.0f;
                        }
                        float f3115 = i919;
                        float f3116 = f3115 + f3112;
                        c15282.f49947.m51985(f3114 - (f10 * f17), f3115, f3114, f3116);
                        canvas.drawRect(f3114 - f9, f3115, f3114, f3116, c10238);
                        z7 = true;
                    } else {
                        i14 = i84;
                        int i9110 = c5172.f18044;
                        c10238.setColor((((int) (((i9110 >>> 24) & 255) * f)) << 24) | (i9110 & 16777215));
                        float f3117 = (j4 * j4) / j5;
                        int i9111 = iM36667 + ((int) (((height - iM36667) - f3117) * fM31378));
                        float f3118 = i14;
                        if (r6 == 0) {
                            f8 = c5172.f18019;
                        } else {
                            f8 = f17;
                        }
                        float f3119 = i9111;
                        canvas.drawRect(f3118 - f8, f3119, f3118, f3119 + f3117, c10238);
                    }
                } else {
                    i14 = i84;
                }
            } else {
                i14 = i84;
            }
            c15282.f49954 = z7;
            if (c12628.f40524) {
                c10238.setColor(c5172.f18052);
                float f416 = i14;
                Paint paint8 = c10238;
                canvas.drawRect(0.0f, 0.0f, f416, f3, paint8);
                c10238.setColor(c5172.f18038);
                canvas.drawRect(0.0f, iM36667 - 1, f416, iM36667 + 1, paint8);
                f4 = c5172.f18029 / 2.0f;
                int i1011 = c5172.f18031;
                i15 = iM36667 - i1011;
                i16 = i1011 / 4;
                f5 = fM36656;
                i17 = i12;
                i18 = 0;
                while (i18 < i17) {
                    float fM366516 = c15282.m36657(i18) + f18;
                    float f417 = fM366516 - f4;
                    f6 = i15;
                    int i1012 = i17;
                    canvas.drawRect(f417, f6, fM366516 + f4, f3, c10238);
                    strArr = f49946;
                    f7 = (i15 - i11) + i47 + i16;
                    canvas.drawText(strArr[i18], f417 - f21, f7, c10238);
                    if (!c12628.m31351()) {
                        float f418 = f5 + f21;
                        canvas.drawRect(f418 - f4, f6, f418 + f4, f3, c10238);
                        canvas.drawText(strArr[i18], f5, f7, c10238);
                        f5 += f18;
                    }
                    i18++;
                    c15282 = this;
                    i17 = i1012;
                    c12628 = c12628;
                }
            }
            if (r6 != 0) {
            }
        }
        i14 = i84;
        c12628 = r7;
        z7 = false;
        c15282.f49954 = z7;
        if (c12628.f40524) {
            c10238.setColor(c5172.f18052);
            float f419 = i14;
            Paint paint9 = c10238;
            canvas.drawRect(0.0f, 0.0f, f419, f3, paint9);
            c10238.setColor(c5172.f18038);
            canvas.drawRect(0.0f, iM36667 - 1, f419, iM36667 + 1, paint9);
            f4 = c5172.f18029 / 2.0f;
            int i1013 = c5172.f18031;
            i15 = iM36667 - i1013;
            i16 = i1013 / 4;
            f5 = fM36656;
            i17 = i12;
            i18 = 0;
            while (i18 < i17) {
                float fM366517 = c15282.m36657(i18) + f18;
                float f4110 = fM366517 - f4;
                f6 = i15;
                int i1014 = i17;
                canvas.drawRect(f4110, f6, fM366517 + f4, f3, c10238);
                strArr = f49946;
                f7 = (i15 - i11) + i47 + i16;
                canvas.drawText(strArr[i18], f4110 - f21, f7, c10238);
                if (!c12628.m31351()) {
                    float f4111 = f5 + f21;
                    canvas.drawRect(f4111 - f4, f6, f4111 + f4, f3, c10238);
                    canvas.drawText(strArr[i18], f5, f7, c10238);
                    f5 += f18;
                }
                i18++;
                c15282 = this;
                i17 = i1014;
                c12628 = c12628;
            }
        }
        if (r6 != 0) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36660(int i, C16379 c16379, boolean z) {
        long jM36676 = m36676(i);
        long jM36667 = m36667();
        C12628 c12628 = this.f49951;
        long jM17204 = jM36676 / ((long) c12628.f40509.m17204());
        C5171 c5171 = c12628.f40497;
        long j = (jM17204 * ((long) c5171.f18053)) + jM36667;
        int iM36657 = (int) (m36657((int) (jM36676 % ((long) c12628.f40509.m17204()))) + (z ? c5171.f18049 * 2.0f : 0.0f));
        long j2 = ((long) c5171.f18053) + j;
        c16379.f53169 = iM36657;
        c16379.f53170 = j;
        c16379.f53168 = iM36657;
        c16379.f53167 = j2;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m36676(int i) {
        C12628 c12628 = this.f49951;
        C3176 c3176 = c12628.f40510;
        if (c3176 != null && c3176.f10298 && i == c12628.f40509.m17202()) {
            return c3176.f10294;
        }
        return c3176 == null ? i : c3176.f10302.m33369(i, c3176.f10301);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m36680(int i) {
        long jM36676 = m36676(i) / ((long) this.f49951.f40509.m17204());
        int i2 = (int) jM36676;
        if (jM36676 == i2) {
            return i2;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private long m36649() {
        C12628 c12628 = this.f49951;
        C3176 c3176 = c12628.f40510;
        if (c3176 == null) {
            return c12628.f40509.m17218();
        }
        return c3176.f10302.f43259 + (c3176.f10303 ? 1L : 0L);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m36653() {
        long jM36649 = m36649();
        C12628 c12628 = this.f49951;
        return (int) Math.max(1L, ((jM36649 + ((long) c12628.f40509.m17204())) - 1) / ((long) c12628.f40509.m17204()));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m36670() {
        C12628 c12628 = this.f49951;
        float paddingLeft = c12628.getPaddingLeft();
        C3176 c3176 = c12628.f40510;
        return (((c3176 == null ? c12628.f40509.m17209() : c3176.f10292) + 1) * c12628.f40497.f18049) + paddingLeft;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m36665() {
        C12628 c12628 = this.f49951;
        if (c12628.m31351()) {
            return c12628.f40497.f18049 * 3.0f;
        }
        return (((c12628.getWidth() - c12628.getPaddingRight()) - (c12628.f40510 == null ? c12628.f40497.f18021 * 1.5f : 0.0f)) - m36670()) / c12628.f40509.m17204();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m36657(int i) {
        float fM36665 = (i * m36665()) + m36670();
        C12628 c12628 = this.f49951;
        return fM36665 + (c12628.m31351() ? c12628.f40497.f18049 : (m36665() / 2.0f) - c12628.f40497.f18049);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m36674() {
        return this.f49964;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m36672() {
        return this.f49961;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final RectF m36669() {
        return this.f49955;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final RectF m36663() {
        return this.f49952;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final RectF m36654() {
        return this.f49966;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23073 m36681() {
        return this.f49947;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m36666(int i) {
        return ((long) i) * ((long) this.f49951.f40497.f18053);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m36679(int i) {
        C12628 c12628 = this.f49951;
        C5171 c5171 = c12628.f40497;
        return Math.max(((((((long) i) + 1) * ((long) c5171.f18053)) + ((long) m36667())) + ((long) this.f49949)) - ((long) c12628.getHeight()), 0L);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m36675() {
        return m36679(m36653());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m36667() {
        C12628 c12628 = this.f49951;
        if (!c12628.f40524) {
            return 0;
        }
        C5171 c5171 = c12628.f40497;
        return c5171.f18053 + c5171.f18031 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m36656() {
        C12628 c12628 = this.f49951;
        C5917 c5917 = c12628.f40509;
        C5171 c5171 = c12628.f40497;
        float paddingLeft = c12628.getPaddingLeft();
        C3176 c3176 = c12628.f40510;
        return ((C12669.m31436(c5917.m17204(), 3, (c3176 == null ? c12628.f40509.m17209() : c3176.f10292) + 1, 1) + 0.5f + 1.0f) * c5171.f18049) + paddingLeft;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m36664() {
        return this.f49948;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m36682() {
        return this.f49954;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m36651(long j) {
        C12628 c12628 = this.f49951;
        C5917 c5917 = c12628.f40509;
        C5171 c5171 = c12628.f40497;
        if (m36649() == 0) {
            this.f49965 = true;
            return 0;
        }
        long jM36667 = (j - ((long) m36667())) / ((long) c5171.f18053);
        int i = (int) jM36667;
        if (jM36667 != i) {
            throw new ArithmeticException();
        }
        if (i < 0) {
            this.f49965 = true;
            return 0;
        }
        long jM36649 = m36649() % ((long) c5917.m17204());
        int iM36653 = m36653();
        if (jM36649 != 0) {
            iM36653--;
        }
        if (i <= iM36653) {
            return i;
        }
        this.f49965 = true;
        return iM36653;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float m36684() {
        return m36667() + this.f49949;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m36678() {
        return this.f49951.getHeight() - this.f49949;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m36677() {
        return this.f49965;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36658(float f, long j, boolean z) {
        int iMax;
        this.f49965 = false;
        this.f49967 = false;
        int iM36651 = m36651(j);
        C12628 c12628 = this.f49951;
        C5917 c5917 = c12628.f40509;
        C5917 c5918 = c12628.f40509;
        float f2 = c12628.f40497.f18049;
        if (!c12628.m31351()) {
            int iFloor = (int) Math.floor((f - m36670()) / m36665());
            if (iFloor < 0 || iFloor >= c5917.m17204()) {
                this.f49965 = true;
            }
            iMax = Math.max(0, Math.min(c5917.m17204() - 1, iFloor));
            this.f49962 = f < m36657(iMax) + f2;
        } else {
            float fM36670 = (f2 / 2.0f) + m36670();
            if (f <= fM36670) {
                this.f49965 = true;
                this.f49962 = true;
            } else {
                int iM17204 = c5917.m17204();
                int i = 0;
                while (true) {
                    if (i >= iM17204) {
                        if (z || f <= fM36670 + f2) {
                            this.f49965 = true;
                            this.f49962 = false;
                        } else {
                            this.f49962 = true;
                            float fM36656 = m36656();
                            if (f <= fM36656) {
                                this.f49965 = true;
                            } else {
                                float f3 = fM36656;
                                iMax = 0;
                                while (true) {
                                    if (iMax < iM17204) {
                                        f3 += f2;
                                        if (f <= f3) {
                                            break;
                                        }
                                        iMax++;
                                    } else {
                                        this.f49965 = true;
                                    }
                                }
                            }
                        }
                        iMax = iM17204 - 1;
                        break;
                    }
                    float f4 = fM36670 + f2;
                    if (f <= f4) {
                        this.f49962 = true;
                    } else {
                        fM36670 = f4 + (f2 * 2.0f);
                        if (f <= fM36670) {
                            this.f49962 = false;
                        } else {
                            i++;
                        }
                    }
                    iMax = i;
                    break;
                }
            }
            iMax = 0;
            break;
        }
        if (c12628.f40510 == null) {
            return c5918.m17189(iM36651, iMax);
        }
        long jM17204 = (((long) iM36651) * ((long) c5918.m17204())) + ((long) iMax);
        this.f49959 = jM17204;
        C3176 c3176 = c12628.f40510;
        if (c3176.f10303 && jM17204 == c3176.f10302.f43259) {
            return c5918.m17218();
        }
        int iM10367 = c3176.m10367(jM17204);
        boolean z2 = iM10367 < 0;
        this.f49967 = z2;
        return z2 ? c5918.m17202() : iM10367;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m36655() {
        return this.f49967;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long m36673() {
        return this.f49959;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m36683() {
        C12628 c12628 = this.f49951;
        C3176 c3176 = c12628.f40510;
        C5917 c5917 = c12628.f40509;
        if (!this.f49967 || this.f49965 || c3176 == null || !c5917.m17206()) {
            return false;
        }
        long jM36676 = c3176.f10293 ? c3176.f10299 : m36676(c5917.m17202());
        long jM36677 = c3176.f10293 ? c3176.f10291 : m36676(c5917.m17208());
        long j = this.f49959;
        return j >= jM36676 && j <= jM36677;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m36671(int i) {
        int i2;
        int i3;
        C3176 c3176 = this.f49951.f40510;
        long j = this.f49959;
        C13616 c13616 = c3176.f10302;
        boolean z = c3176.f10301;
        boolean z2 = j >= c13616.m33369(i, z);
        C13616 c13617 = c3176.f10302;
        int iM10367 = c3176.m10367(j);
        if (iM10367 >= 0) {
            return iM10367;
        }
        int i4 = z ? c13617.f43254 : c13617.f43257;
        if (i4 != 0) {
            int iM33367 = c13617.m33367(j);
            if (iM33367 >= 0) {
                C9141 c9141 = c13617.f43255.get(iM33367);
                if (z) {
                    i2 = c9141.f29708;
                    i3 = c9141.f29713;
                } else {
                    i2 = c9141.f29711;
                    i3 = c9141.f29710;
                }
                int i5 = i2 + i3;
                int i6 = i4 - 1;
                if (!z2) {
                    i5--;
                }
                return Math.max(0, Math.min(i6, i5));
            }
            if (j > 0) {
                return i4 - 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36659(long j, float f) {
        int i;
        boolean z;
        C12628 c12628 = this.f49951;
        C3176 c3176 = c12628.f40510;
        C5917 c5917 = c12628.f40509;
        if (c3176 == null) {
            return -1;
        }
        boolean z2 = c3176.f10301;
        C13616 c13616 = c3176.f10302;
        if (c5917.m17218() == 0) {
            return -1;
        }
        boolean z3 = c12628.m31351() && f >= m36656();
        int iM10368 = c3176.m10368(this.f49959, false);
        int iM10369 = c3176.m10368(this.f49959, true);
        if (iM10368 >= 0) {
            if (iM10369 >= 0) {
                i = iM10369;
                boolean z4 = z3;
                if (m36650(f, j, c13616.m33369(iM10368, z2), z4) > m36650(f, j, c13616.m33369(i, z2), z4)) {
                }
            }
            if (iM10368 >= 0) {
                int iM33369 = (int) (c13616.m33369(iM10368, z2) % ((long) c5917.m17204()));
                if (!z3 || f < m36657(iM33369) + c12628.f40497.f18049) {
                    z = true;
                } else {
                    z = false;
                }
                this.f49962 = z;
            }
            this.f49965 = true;
            return iM10368;
        }
        i = iM10369;
        iM10368 = i;
        if (iM10368 >= 0) {
            int iM333610 = (int) (c13616.m33369(iM10368, z2) % ((long) c5917.m17204()));
            if (z3) {
                z = true;
            } else {
                z = true;
            }
            this.f49962 = z;
        }
        this.f49965 = true;
        return iM10368;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private double m36650(float f, long j, long j2, boolean z) {
        double dM36657;
        C12628 c12628 = this.f49951;
        int iM17204 = c12628.f40509.m17204();
        double d = c12628.f40497.f18049;
        if (z) {
            dM36657 = ((j2 % ((long) iM17204)) * d) + ((double) m36656());
        } else {
            dM36657 = m36657((int) (j2 % ((long) iM17204)));
        }
        if (!z) {
            d *= 2.0d;
        }
        double dM36667 = ((j2 / ((long) iM17204)) * ((double) c12628.f40497.f18053)) + ((double) m36667());
        double d2 = f;
        double dMax = Math.max(0.0d, Math.max(dM36657 - d2, d2 - (d + dM36657)));
        double d3 = j;
        double dMax2 = Math.max(0.0d, Math.max(dM36667 - d3, (d3 - dM36667) - ((double) c12628.f40497.f18053)));
        return (dMax2 * dMax2) + (dMax * dMax);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m36668() {
        return this.f49962;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36652(Canvas canvas, C10232 c10232, float f, float f2) {
        C5171 c5171 = this.f49951.f40497;
        float f3 = c5171.f18049 / 2.0f;
        float fMax = Math.max(1, Math.round(c5171.f18046)) / 2.0f;
        int color = c10232.getColor();
        c10232.setColor(c5171.f18042);
        canvas.drawRect(f - f3, f2 - fMax, f + f3, f2 + fMax, c10232);
        c10232.setColor(color);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36662(C16379 c16379) {
        C5171 c5171;
        float fM36657;
        C12628 c12628 = this.f49951;
        C5917 c5917 = c12628.f40509;
        C5171 c5172 = c12628.f40497;
        long jM36676 = m36676(c5917.m17202());
        C5917 c5918 = c12628.f40509;
        long jM36677 = m36676(c5918.m17208());
        long jM17204 = c5918.m17204();
        long j = jM36676 / jM17204;
        if (j != jM36677 / jM17204) {
            return false;
        }
        long jM36667 = (j * ((long) c5172.f18053)) + ((long) m36667());
        float fM36658 = m36657((int) (jM36676 % jM17204));
        if (jM36676 == jM36677 && !c5918.m17206()) {
            if (c5918.m17220()) {
                c5171 = c5172;
            } else {
                c5171 = c5172;
                fM36658 += c5171.f18049;
            }
            fM36657 = fM36658;
        } else {
            c5171 = c5172;
            fM36657 = m36657((int) (jM36677 % jM17204)) + (c5171.f18049 * 2.0f);
        }
        long j2 = ((long) c5171.f18053) + jM36667;
        c16379.f53169 = (int) fM36658;
        c16379.f53170 = jM36667;
        c16379.f53168 = (int) fM36657;
        c16379.f53167 = j2;
        return true;
    }
}
