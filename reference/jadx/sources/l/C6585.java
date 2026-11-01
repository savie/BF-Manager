package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: renamed from: l.ۜۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AG9 */
/* JADX INFO: loaded from: classes2.dex */
public class C6585 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String[] f22162;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final C7952 f22163;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String[] f22164;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f22165;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f22166;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18580 f22167;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C6353 f22168;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f22169;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] f22170;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f22171;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f22172;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f22173;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f22174;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f22175;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f22176;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f22177;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f22178;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final char[] f22179;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f22180;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f22181;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float[] f22182;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21402 f22183;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f22184;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f22185;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f22186;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f22187;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC0940 f22188;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Rect f22189;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f22190;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f22191;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f22192;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f22193;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f22194;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f22195;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C4916 f22196;

    static {
        String[] strArr = new String[128];
        for (char c = 0; c < 128; c = (char) (c + 1)) {
            strArr[c] = String.valueOf(c);
        }
        f22162 = strArr;
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = "NUL";
        strArr2[1] = "SOH";
        strArr2[2] = "STX";
        strArr2[3] = "ETX";
        strArr2[4] = "EOT";
        strArr2[5] = "ENQ";
        strArr2[6] = "ACK";
        strArr2[7] = "BEL";
        strArr2[8] = "BS";
        strArr2[11] = "VT";
        strArr2[12] = "FF";
        strArr2[14] = "SO";
        strArr2[15] = "SI";
        strArr2[16] = "DLE";
        strArr2[17] = "DC1";
        strArr2[18] = "DC2";
        strArr2[19] = "DC3";
        strArr2[20] = "DC4";
        strArr2[21] = "NAK";
        strArr2[22] = "SYN";
        strArr2[23] = "ETB";
        strArr2[24] = "CAN";
        strArr2[25] = "EM";
        strArr2[26] = "SUB";
        strArr2[27] = "ESC";
        strArr2[28] = "FS";
        strArr2[29] = "GS";
        strArr2[30] = "RS";
        strArr2[31] = "US";
        strArr2[127] = "DEL";
        f22164 = strArr2;
        char[] cArr = {129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 173, 8192, 8193, 8194, 8195, 8196, 8197, 8198, 8199, 8200, 8201, 8202, 8203, 8204, 8205, 8206, 8207, 8232, 8233, 8234, 8235, 8236, 8237, 8238, 8239, 8287, 8288, 8289, 8290, 8291, 8292, 8294, 8295, 8296, 8297, 8298, 8299, 8300, 8301, 8302, 8303, 65279};
        String[] strArr3 = {"HOP", "BPH", "NBH", "IND", "NEL", "SSA", "ESA", "HTS", "HTJ", "VTS", "PLD", "PLU", "RI", "SS2", "SS3", "DCS", "PU1", "PU2", "STS", "CCH", "MW", "SPA", "EPA", "SOS", "SGCI", "SCI", "CSI", "ST", "OSC", "PM", "APC", "NBSP", "SHY", "NQSP", "MQSP", "ENSP", "EMSP", "3/MSP", "4/MSP", "6/MSP", "FSP", "PSP", "THSP", "HSP", "ZWSP", "ZWNJ", "ZWJ", "LRM", "RLM", "LSEP", "PSEP", "LRE", "RLE", "PDF", "LRO", "RLO", "NNBSP", "MMSP", "WJ", "f()", "x", ",", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "LRI", "RLI", "FSI", "PDI", "ISS", "ASS", "IAFS", "AAFS", "NADS", "NODS", "ZWNBSP"};
        C7952 c7952 = new C7952(74);
        for (int i = 0; i < 74; i++) {
            c7952.mo7435(cArr[i], strArr3[i]);
        }
        f22163 = c7952;
    }

    public C6585(Context context) {
        this.f22185 = 1.0f;
        this.f22167 = new C18580();
        this.f22168 = C11293.m28304(new C3614());
        this.f22166 = false;
        this.f22181 = false;
        this.f22190 = false;
        this.f22172 = 4;
        this.f22191 = false;
        this.f22165 = true;
        this.f22175 = false;
        this.f22182 = new float[128];
        this.f22170 = new float[128];
        this.f22189 = new Rect();
        this.f22179 = new char[256];
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f22194 = displayMetrics.density;
        this.f22193 = displayMetrics.scaledDensity;
        C4916 c4916 = new C4916(0);
        this.f22196 = c4916;
        c4916.setTextAlign(Paint.Align.LEFT);
        c4916.setStyle(Paint.Style.FILL);
        c4916.setTypeface(Typeface.DEFAULT);
        m17867();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6585 m17872() {
        return new C6585(this);
    }

    public C6585(C6585 c6585) {
        this.f22185 = 1.0f;
        this.f22167 = new C18580();
        this.f22168 = C11293.m28304(new C3614());
        this.f22166 = false;
        this.f22181 = false;
        this.f22190 = false;
        this.f22172 = 4;
        this.f22191 = false;
        this.f22165 = true;
        this.f22175 = false;
        float[] fArr = new float[128];
        this.f22182 = fArr;
        float[] fArr2 = new float[128];
        this.f22170 = fArr2;
        this.f22189 = new Rect();
        this.f22179 = new char[256];
        this.f22194 = c6585.f22194;
        this.f22193 = c6585.f22193;
        this.f22196 = new C4916(c6585.f22196);
        this.f22178 = c6585.f22178;
        this.f22195 = c6585.f22195;
        this.f22184 = c6585.f22184;
        this.f22173 = c6585.f22173;
        this.f22185 = c6585.f22185;
        this.f22192 = c6585.f22192;
        this.f22174 = c6585.f22174;
        this.f22171 = c6585.f22171;
        this.f22169 = c6585.f22169;
        this.f22186 = c6585.f22186;
        this.f22187 = c6585.f22187;
        this.f22166 = c6585.f22166;
        this.f22181 = c6585.f22181;
        this.f22190 = c6585.f22190;
        this.f22172 = c6585.f22172;
        this.f22177 = c6585.f22177;
        this.f22176 = c6585.f22176;
        this.f22191 = c6585.f22191;
        this.f22165 = c6585.f22165;
        this.f22180 = c6585.f22180;
        System.arraycopy(c6585.f22182, 0, fArr, 0, 128);
        System.arraycopy(c6585.f22170, 0, fArr2, 0, 128);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m17852() {
        return this.f22173;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float m17870() {
        return this.f22192;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float m17851() {
        return this.f22174;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float m17854() {
        return this.f22185;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo5423(float f) {
        if (f < 0.8f || f > 2.0f) {
            throw new IllegalArgumentException("Line spacing must be between 0.8 and 2.0");
        }
        this.f22185 = f;
        m17847(this.f22196.getFontMetrics());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17847(Paint.FontMetrics fontMetrics) {
        float fontSpacing = this.f22196.getFontSpacing() * this.f22185;
        this.f22192 = fontSpacing;
        Math.ceil(fontSpacing);
        float f = fontMetrics.ascent;
        this.f22174 = ((this.f22192 - (fontMetrics.descent - f)) / 2.0f) + (-f);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m17864() {
        return this.f22195;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m17880() {
        return this.f22184;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m17868() {
        return this.f22171;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m17865() {
        return this.f22186;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m17875() {
        return this.f22178;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17873(int i) {
        this.f22178 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m17876() {
        return this.f22166;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17862(boolean z) {
        this.f22166 = z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m17877() {
        return this.f22190;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17874(boolean z) {
        this.f22190 = z;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m17881() {
        return this.f22172;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17861(int i) {
        this.f22172 = i;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m17866() {
        return this.f22191;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m17869(boolean z) {
        this.f22191 = z;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m17878() {
        return this.f22165;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m17853(boolean z) {
        this.f22165 = z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m17879() {
        float[] fArr;
        float[] fArr2;
        C4916 c4916 = this.f22196;
        Paint.FontMetrics fontMetrics = c4916.getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        this.f22195 = f;
        this.f22184 = (int) Math.ceil(f);
        this.f22180 = (int) Math.ceil(this.f22195 / 25.0f);
        this.f22171 = c4916.measureText("我");
        this.f22169 = c4916.measureText("�");
        this.f22173 = -fontMetrics.top;
        m17847(fontMetrics);
        float fMeasureText = c4916.measureText("n");
        float fMeasureText2 = c4916.measureText(" ");
        if (fMeasureText2 < fMeasureText) {
            fMeasureText2 = C0280.m1792(fMeasureText, fMeasureText2, 0.62f, fMeasureText2);
        }
        this.f22186 = (float) Math.ceil(fMeasureText2);
        this.f22187 = (float) Math.ceil(fMeasureText2 / 2.0f);
        int i = 0;
        while (true) {
            fArr = this.f22170;
            fArr2 = this.f22182;
            if (i >= 128) {
                break;
            }
            String str = f22162[i];
            String str2 = f22164[i];
            if (str.equals(str2)) {
                float fMeasureText3 = c4916.measureText(str);
                fArr[i] = fMeasureText3;
                fArr2[i] = fMeasureText3;
            } else {
                fArr2[i] = c4916.measureText(str);
                fArr[i] = c4916.measureText(str2) + (this.f22180 * 2);
            }
            i++;
        }
        float f2 = this.f22186;
        fArr2[0] = f2 / 50.0f;
        fArr2[32] = f2;
        fArr2[10] = f2;
        fArr2[13] = f2;
        fArr[32] = f2;
        fArr[10] = f2;
        fArr[13] = f2;
        this.f22181 = fArr2[105] == fArr2[119] && fArr2[46] == fArr2[109];
        int iMeasureText = (int) (c4916.measureText("Z") + 1.0f);
        int i2 = (int) (this.f22195 + 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMeasureText, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        c4916.setColor(-16777216);
        canvas.drawText("Z", 0.0f, this.f22173, c4916);
        int[] iArr = new int[i2];
        bitmapCreateBitmap.getPixels(iArr, 0, 1, iMeasureText / 2, 0, 1, i2);
        bitmapCreateBitmap.recycle();
        this.f22177 = 0.0f;
        this.f22176 = this.f22195;
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != -1) {
                this.f22177 = i3;
                break;
            }
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (iArr[i4] != -1) {
                this.f22176 = i4;
                break;
            }
        }
        this.f22167.m42978();
        this.f22168.clear();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m17871(CharSequence charSequence, int i, int i2, float f) {
        return m17850(charSequence, i, i2, f, Float.POSITIVE_INFINITY);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m17859(CharSequence charSequence, int i, int i2, float f, float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid maximum text width");
        }
        return m17850(charSequence, i, i2, f, f2);
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:97:0x016c A[PHI: r7
      0x016c: PHI (r7v29 java.lang.String) = (r7v25 java.lang.String), (r7v28 java.lang.String), (r7v37 java.lang.String) binds: [B:96:0x016a, B:90:0x0157, B:85:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x0116. Please report as an issue. */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private float m17850(CharSequence charSequence, int i, int i2, float f, float f2) {
        C4916 c4916;
        C18580 c18580;
        boolean z;
        boolean z2;
        char c;
        char c2;
        C3762 c3762;
        int i3;
        boolean z3;
        float fM17849;
        float fFloatValue;
        int iM45558;
        String str;
        Float fM42977;
        float fFloatValue2;
        int i4;
        int i5;
        String string;
        Float fM42978;
        if (i < 0) {
            return 0.0f;
        }
        boolean z4 = this.f22191;
        float[] fArr = this.f22182;
        float[] fArr2 = z4 ? this.f22170 : fArr;
        boolean z5 = this.f22165;
        C3762 c3763 = (f2 == Float.POSITIVE_INFINITY && (charSequence instanceof C3762)) ? (C3762) charSequence : null;
        int i6 = i;
        int i7 = i6;
        float fFloatValue3 = 0.0f;
        boolean z6 = false;
        while (true) {
            c4916 = this.f22196;
            c18580 = this.f22167;
            if (i6 >= i2 || fFloatValue3 >= f2) {
                z = z6;
                i6 = i7;
                z2 = z;
            } else {
                if (z6) {
                    int iM45559 = C20149.m45558(i6, i2, charSequence);
                    c2 = 0;
                    boolean z7 = z6;
                    if (iM45559 - i6 == 1) {
                        char cCharAt = charSequence.charAt(i6);
                        byte bM17214 = C6210.m17214(cCharAt);
                        i5 = iM45559;
                        if (bM17214 == 15) {
                            if (C9739.m24695(cCharAt)) {
                                string = charSequence.subSequence(i7, i6).toString();
                                fM42978 = c18580.m42977(string);
                                if (fM42978 == null) {
                                    fM42978 = Float.valueOf(c4916.measureText(string));
                                    c18580.m42979(string, fM42978);
                                }
                                fFloatValue3 += fM42978.floatValue();
                                if (fFloatValue3 >= f2) {
                                    z2 = false;
                                } else {
                                    i7 = i6;
                                    z6 = false;
                                    c = 1;
                                }
                            }
                        } else if (bM17214 != 8 || z5) {
                            string = charSequence.subSequence(i7, i6).toString();
                            fM42978 = c18580.m42977(string);
                            if (fM42978 == null) {
                                fM42978 = Float.valueOf(c4916.measureText(string));
                                c18580.m42979(string, fM42978);
                            }
                            fFloatValue3 += fM42978.floatValue();
                            if (fFloatValue3 >= f2) {
                                z2 = false;
                            } else {
                                i7 = i6;
                                z6 = false;
                                c = 1;
                            }
                        }
                    } else {
                        i5 = iM45559;
                    }
                    z6 = z7;
                    i6 = i5;
                } else {
                    c = 1;
                    c2 = 0;
                }
                if (c3763 != null) {
                    c3763.m11004(i6);
                    char[] cArr = c3763.f13619;
                    i3 = i7;
                    int iMin = Math.min(i2, c3763.f13620);
                    int i8 = i6 - c3763.f13618;
                    while (true) {
                        if (i6 < iMin) {
                            c3762 = c3763;
                            char c3 = cArr[i8];
                            z3 = z6;
                            if (c3 <= 127 && c3 != '\t') {
                                int i9 = C23850.f77103;
                                if ((('0' <= c3 && c3 <= '9') || c3 == '#' || c3 == '*') && (i4 = i6 + 1) < i2) {
                                    if (i4 == iMin || cArr[i8 + 1] > 127) {
                                    }
                                }
                                fFloatValue3 += fArr2[c3];
                                i8++;
                                i6++;
                                c3763 = c3762;
                                z6 = z3;
                                cArr = cArr;
                            }
                        } else {
                            c3762 = c3763;
                            z3 = z6;
                        }
                    }
                    if (i6 == i2) {
                        i6 = i3;
                        z = z3;
                        z2 = z;
                    } else {
                        if (i6 == iMin) {
                            i7 = i3;
                            z6 = z3;
                        }
                        c3763 = c3762;
                    }
                } else {
                    c3762 = c3763;
                    i3 = i7;
                    z3 = z6;
                }
                char cCharAt2 = charSequence.charAt(i6);
                byte bM17215 = C6210.m17214(cCharAt2);
                C7952 c7952 = f22163;
                switch (bM17215) {
                    case 0:
                        fM17849 = this.f22171;
                        fFloatValue3 += fM17849;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 1:
                        fM17849 = this.f22186;
                        fFloatValue3 += fM17849;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 2:
                        float f3 = f + fFloatValue3;
                        float f4 = this.f22186;
                        float f5 = this.f22172 * f4;
                        float f6 = ((((int) (f3 / f5)) + 1) * f5) - f3;
                        if (f6 < f4) {
                            f6 += f5;
                        }
                        fFloatValue3 += f6;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 3:
                        int i10 = i2 - i6;
                        if (i10 >= 3 && charSequence.charAt(i6 + 1) == 65039 && charSequence.charAt(i6 + 2) == 8419) {
                            char[] cArr2 = new char[3];
                            cArr2[c2] = cCharAt2;
                            cArr2[c] = 65039;
                            cArr2[2] = 8419;
                            String str2 = new String(cArr2);
                            Float fM42979 = c18580.m42977(str2);
                            if (fM42979 == null) {
                                fM42979 = Float.valueOf(c4916.measureText(str2));
                                c18580.m42979(str2, fM42979);
                            }
                            fFloatValue = fM42979.floatValue() + fFloatValue3;
                            i6 += 3;
                        } else if (i10 >= 2 && charSequence.charAt(i6 + 1) == 8419) {
                            char[] cArr3 = new char[2];
                            cArr3[c2] = cCharAt2;
                            cArr3[c] = 8419;
                            String str3 = new String(cArr3);
                            Float fM429710 = c18580.m42977(str3);
                            if (fM429710 == null) {
                                fM429710 = Float.valueOf(c4916.measureText(str3));
                                c18580.m42979(str3, fM429710);
                            }
                            fFloatValue = fM429710.floatValue() + fFloatValue3;
                            i6 += 2;
                        } else {
                            fM17849 = fArr2[cCharAt2];
                            fFloatValue3 += fM17849;
                            i6++;
                            i7 = i3;
                            z6 = z3;
                        }
                        i7 = i3;
                        fFloatValue3 = fFloatValue;
                        z6 = z3;
                        break;
                    case 4:
                        fM17849 = fArr2[cCharAt2];
                        fFloatValue3 += fM17849;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 5:
                        fM17849 = this.f22169;
                        fFloatValue3 += fM17849;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 6:
                        fM17849 = fArr[c2];
                        fFloatValue3 += fM17849;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 7:
                        fM17849 = m17849(cCharAt2);
                        fFloatValue3 += fM17849;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 8:
                        if (!z5) {
                            iM45558 = C20149.m45558(i6, i2, charSequence);
                            i7 = i6;
                            z6 = true;
                            i6 = iM45558;
                        } else {
                            str = (String) c7952.mo15966(cCharAt2);
                            fM42977 = c18580.m42977(str);
                            if (fM42977 == null) {
                                fM42977 = Float.valueOf(c4916.measureText(str));
                                c18580.m42979(str, fM42977);
                            }
                            fFloatValue2 = fM42977.floatValue() + (this.f22180 * 2);
                            fFloatValue = fFloatValue2 + fFloatValue3;
                            i6++;
                            i7 = i3;
                            fFloatValue3 = fFloatValue;
                            z6 = z3;
                        }
                        break;
                    case 9:
                        if (!z5) {
                            fFloatValue2 = fArr[c2];
                        } else {
                            str = (String) c7952.mo15966(cCharAt2);
                            fM42977 = c18580.m42977(str);
                            if (fM42977 == null) {
                                fM42977 = Float.valueOf(c4916.measureText(str));
                                c18580.m42979(str, fM42977);
                            }
                            fFloatValue2 = fM42977.floatValue() + (this.f22180 * 2);
                        }
                        fFloatValue = fFloatValue2 + fFloatValue3;
                        i6++;
                        i7 = i3;
                        fFloatValue3 = fFloatValue;
                        z6 = z3;
                        break;
                    case 10:
                        if (!z5) {
                            fFloatValue2 = this.f22186;
                        } else {
                            str = (String) c7952.mo15966(cCharAt2);
                            fM42977 = c18580.m42977(str);
                            if (fM42977 == null) {
                                fM42977 = Float.valueOf(c4916.measureText(str));
                                c18580.m42979(str, fM42977);
                            }
                            fFloatValue2 = fM42977.floatValue() + (this.f22180 * 2);
                        }
                        fFloatValue = fFloatValue2 + fFloatValue3;
                        i6++;
                        i7 = i3;
                        fFloatValue3 = fFloatValue;
                        z6 = z3;
                        break;
                    default:
                        if (C9739.m24695(cCharAt2)) {
                            if (i6 > 0 && C9739.m24695(charSequence.charAt(i6 - 1))) {
                                if (C9739.m24694(cCharAt2)) {
                                    fM17849 = m17849(cCharAt2);
                                } else {
                                    fM17849 = this.f22187;
                                }
                                fFloatValue3 += fM17849;
                            }
                            i6++;
                            i7 = i3;
                            z6 = z3;
                        } else {
                            iM45558 = C20149.m45558(i6, i2, charSequence);
                            i7 = i6;
                            z6 = true;
                            i6 = iM45558;
                        }
                        break;
                }
                c3763 = c3762;
            }
        }
        if (z2) {
            String string2 = charSequence.subSequence(i6, i2).toString();
            Float fM429711 = c18580.m42977(string2);
            if (fM429711 == null) {
                fM429711 = Float.valueOf(c4916.measureText(string2));
                c18580.m42979(string2, fM429711);
            }
            fFloatValue3 += fM429711.floatValue();
        }
        return Math.min(fFloatValue3, f2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12936 m17860(CharSequence charSequence, int i, int i2, float f, C2605 c2605) {
        if (i < 0 || i2 < i || i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        return new C12936(this, charSequence, i, i2, f, c2605);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private float m17849(char c) {
        C6353 c6353 = this.f22168;
        float fM17459 = c6353.m17459(c);
        if (fM17459 != -1.0f) {
            return fM17459;
        }
        float fMeasureText = this.f22196.measureText(String.valueOf(c));
        c6353.mo10711(fMeasureText, c);
        return fMeasureText;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m17855(char c) {
        return (this.f22191 ? this.f22170 : this.f22182)[c];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] m17863() {
        return this.f22191 ? this.f22170 : this.f22182;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m17858(CharSequence charSequence, int i, int i2, float f) {
        boolean z = this.f22191;
        float[] fArr = this.f22182;
        float[] fArr2 = z ? this.f22170 : fArr;
        boolean z2 = this.f22165;
        int i3 = i2 - i;
        C18580 c18580 = this.f22167;
        if (i3 == 1) {
            char cCharAt = charSequence.charAt(i);
            byte bM17214 = C6210.m17214(cCharAt);
            C4916 c4916 = this.f22196;
            C7952 c7952 = f22163;
            switch (bM17214) {
                case 0:
                    return this.f22171;
                case 1:
                    return this.f22186;
                case 2:
                    return m17850(charSequence, i, i2, f, Float.POSITIVE_INFINITY);
                case 3:
                case 4:
                    return fArr2[cCharAt];
                case 5:
                    return this.f22169;
                case 6:
                    return fArr[0];
                case 7:
                    return m17849(cCharAt);
                case 8:
                    if (z2) {
                        String str = (String) c7952.mo15966(cCharAt);
                        Float fM42977 = c18580.m42977(str);
                        if (fM42977 == null) {
                            fM42977 = Float.valueOf(c4916.measureText(str));
                            c18580.m42979(str, fM42977);
                        }
                        return fM42977.floatValue() + (this.f22180 * 2);
                    }
                    break;
                case 9:
                    if (!z2) {
                        return fArr[0];
                    }
                    String str2 = (String) c7952.mo15966(cCharAt);
                    Float fM42978 = c18580.m42977(str2);
                    if (fM42978 == null) {
                        fM42978 = Float.valueOf(c4916.measureText(str2));
                        c18580.m42979(str2, fM42978);
                    }
                    return fM42978.floatValue() + (this.f22180 * 2);
                case 10:
                    if (!z2) {
                        return this.f22186;
                    }
                    String str3 = (String) c7952.mo15966(cCharAt);
                    Float fM42979 = c18580.m42977(str3);
                    if (fM42979 == null) {
                        fM42979 = Float.valueOf(c4916.measureText(str3));
                        c18580.m42979(str3, fM42979);
                    }
                    return fM42979.floatValue() + (this.f22180 * 2);
            }
            if (C9739.m24695(cCharAt)) {
                if (i > 0 && C9739.m24695(charSequence.charAt(i - 1))) {
                    if (C9739.m24694(cCharAt)) {
                        return m17849(cCharAt);
                    }
                    return this.f22187;
                }
            } else if (cCharAt != 8205) {
                return m17849(cCharAt);
            }
            return 0.0f;
        }
        String string = charSequence.subSequence(i, i2).toString();
        Float fM429710 = c18580.m42977(string);
        if (fM429710 == null) {
            fM429710 = Float.valueOf(m17850(string, 0, string.length(), 0.0f, Float.POSITIVE_INFINITY));
            c18580.m42979(string, fM429710);
        }
        return fM429710.floatValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m17857(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z, C9415 c9415) {
        InterfaceC0940 interfaceC0940 = this.f22188;
        this.f22188 = c9415;
        try {
            return m17856(canvas, charSequence, i, i2, f, f2, i3, i4, f3, paint, i5, z);
        } finally {
            this.f22188 = interfaceC0940;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17845(final Canvas canvas, final CharSequence charSequence, final int i, final int i2, final float f, final float f2, final Paint paint) {
        if (this.f22188 == null) {
            canvas.drawText(charSequence, i, i2, f, f2, paint);
            return;
        }
        boolean z = charSequence instanceof String;
        Rect rect = this.f22189;
        if (z) {
            paint.getTextBounds((String) charSequence, i, i2, rect);
        } else if (Build.VERSION.SDK_INT >= 29) {
            paint.getTextBounds(charSequence, i, i2, rect);
        } else {
            int i3 = i2 - i;
            char[] cArr = new char[i3];
            TextUtils.getChars(charSequence, i, i2, cArr, 0);
            paint.getTextBounds(cArr, 0, i3, rect);
        }
        m17843(canvas, f, f2, paint, new Runnable() { // from class: l.ۖۛ᩺
            @Override // java.lang.Runnable
            public final void run() {
                canvas.drawText(charSequence, i, i2, f, f2, paint);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17846(final Canvas canvas, final char[] cArr, final int i, final float f, final float f2, final Paint paint) {
        if (this.f22188 == null) {
            canvas.drawText(cArr, 0, i, f, f2, paint);
        } else {
            paint.getTextBounds(cArr, 0, i, this.f22189);
            m17843(canvas, f, f2, paint, new Runnable() { // from class: l.ۨۛ᩺
                @Override // java.lang.Runnable
                public final void run() {
                    canvas.drawText(cArr, 0, i, f, f2, paint);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17843(Canvas canvas, float f, float f2, Paint paint, Runnable runnable) {
        Rect rect = this.f22189;
        if (rect.isEmpty()) {
            runnable.run();
        } else if (this.f22188.mo3700(canvas, paint, f + rect.left, f2 + rect.top, f + rect.right, f2 + rect.bottom, runnable)) {
            this.f22188 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17844(final Canvas canvas, final Paint paint, final float f, final float f2, final float f3, final float f4) {
        InterfaceC0940 interfaceC0940 = this.f22188;
        if (interfaceC0940 == null) {
            canvas.drawRect(f, f2, f3, f4, paint);
        } else if (interfaceC0940.mo3700(canvas, paint, f, f2, f3, f4, new Runnable() { // from class: l.ۚۛ᩺
            @Override // java.lang.Runnable
            public final void run() {
                canvas.drawRect(f, f2, f3, f4, paint);
            }
        })) {
            this.f22188 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:325:0x0794  */
    /* JADX WARN: Code duplicated, block: B:327:0x0797  */
    /* JADX WARN: Code duplicated, block: B:351:0x07e1 A[PHI: r1 r5
      0x07e1: PHI (r1v92 int) = (r1v89 int), (r1v89 int), (r1v95 int), (r1v95 int) binds: [B:328:0x0798, B:330:0x079c, B:551:0x07e1, B:349:0x07d8] A[DONT_GENERATE, DONT_INLINE]
      0x07e1: PHI (r5v39 float) = (r5v36 float), (r5v36 float), (r5v43 float), (r5v43 float) binds: [B:328:0x0798, B:330:0x079c, B:551:0x07e1, B:349:0x07d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:406:0x0911  */
    /* JADX WARN: Code duplicated, block: B:455:0x0a85 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:458:0x0a8b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:459:0x0a8d  */
    /* JADX WARN: Code duplicated, block: B:461:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:463:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:465:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:466:0x0ab7  */
    /* JADX WARN: Code duplicated, block: B:468:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:470:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:473:0x0ac7  */
    /* JADX WARN: Code duplicated, block: B:475:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:478:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:480:0x0ae4  */
    /* JADX WARN: Code duplicated, block: B:481:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:484:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:486:0x0b1b  */
    /* JADX WARN: Code duplicated, block: B:487:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:490:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:492:0x0b51 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0133  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m17856(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z) {
        float f4;
        int i6;
        CharSequence charSequence2;
        float f5;
        int i7;
        boolean z2;
        boolean z3;
        float fMeasureText;
        float fMeasureText2;
        float f6;
        float strikeThruPosition;
        float textSize;
        float underlinePosition;
        float textSize2;
        C21402 c21402;
        int i8;
        char c;
        C21402 c21403;
        int i9;
        boolean z4;
        float f7;
        char cCharAt;
        boolean z5;
        int i10;
        C21402 c21404;
        char c2;
        float fMeasureText3;
        int i11;
        boolean z6;
        float f8;
        int i12;
        int iM45558;
        float f9;
        C21402 c21405;
        float f10;
        C21402 c21406;
        float f11;
        int i13;
        C21402 c21407;
        boolean z7;
        int i14;
        boolean zM24695;
        canvas = canvas;
        CharSequence charSequence3 = charSequence;
        paint = paint;
        boolean z8 = this.f22175;
        boolean z9 = this.f22191;
        String[] strArr = z9 ? f22164 : f22162;
        float[] fArr = this.f22182;
        float[] fArr2 = z9 ? this.f22170 : fArr;
        boolean z10 = this.f22165;
        boolean z11 = (i5 & 1) != 0;
        boolean z12 = (i5 & 2) != 0;
        boolean z13 = (i5 & 4) != 0;
        boolean z14 = (i5 & 8) != 0;
        boolean z15 = (z || !(z13 || z14)) ? z : true;
        if (z11) {
            paint.setFakeBoldText(true);
        }
        final InterfaceC0940 interfaceC0940 = this.f22188;
        if (z12) {
            int iSave = canvas.save();
            float f12 = this.f22195 / 2.0f;
            canvas.translate(0.0f, (f2 - this.f22173) + f12);
            float f13 = this.f22173 - f12;
            canvas.skew(-0.2f, 0.0f);
            if (interfaceC0940 != null) {
                final float f14 = (f2 - this.f22173) + f12;
                this.f22188 = new InterfaceC0940() { // from class: l.ܰۛ᩺
                    @Override // l.InterfaceC0940
                    /* JADX INFO: renamed from: ۙ */
                    public final boolean mo3700(final Canvas canvas2, Paint paint2, float f15, float f16, float f17, float f18, final Runnable runnable) {
                        final float f19 = f14;
                        InterfaceC0940 interfaceC0941 = interfaceC0940;
                        int iSave2 = canvas2.save();
                        try {
                            canvas2.skew(0.2f, 0.0f);
                            canvas2.translate(0.0f, -f19);
                            return interfaceC0941.mo3700(canvas2, paint2, f15 - (f18 * 0.2f), f16 + f19, f17 - (f16 * 0.2f), f18 + f19, new Runnable() { // from class: l.᩹ۛ᩺
                                @Override // java.lang.Runnable
                                public final void run() {
                                    float f20 = f19;
                                    Runnable runnable2 = runnable;
                                    Canvas canvas3 = canvas2;
                                    int iSave3 = canvas3.save();
                                    try {
                                        canvas3.translate(0.0f, f20);
                                        canvas3.skew(-0.2f, 0.0f);
                                        runnable2.run();
                                    } finally {
                                        canvas3.restoreToCount(iSave3);
                                    }
                                }
                            });
                        } finally {
                            canvas2.restoreToCount(iSave2);
                        }
                    }
                };
            }
            i6 = iSave;
            f4 = f13;
        } else {
            f4 = f2;
            i6 = -1;
        }
        C21402 c21408 = this.f22183;
        int i15 = i;
        int iM45559 = i15;
        float f15 = f;
        boolean z16 = false;
        boolean z17 = false;
        while (true) {
            boolean z18 = false;
            while (true) {
                if (iM45559 < i2) {
                    if (z8) {
                        int iM455510 = C20149.m45558(iM45559, i2, charSequence3);
                        c21402 = c21408;
                        i6 = i6;
                        if (iM455510 - iM45559 == 1) {
                            char cCharAt2 = charSequence3.charAt(iM45559);
                            byte bM17214 = C6210.m17214(cCharAt2);
                            interfaceC0940 = interfaceC0940;
                            if (bM17214 == 15) {
                                zM24695 = C9739.m24695(cCharAt2);
                                if (!zM24695) {
                                    interfaceC0940 = interfaceC0940;
                                }
                                if (zM24695) {
                                    if (cCharAt2 >= 768 || cCharAt2 > 1023) {
                                        zM24695 = false;
                                    } else {
                                        zM24695 = true;
                                    }
                                }
                                float fMeasureText4 = paint.measureText(charSequence3, i15, iM45559);
                                if (!z16 || f15 + fMeasureText4 < i3) {
                                    z2 = z16;
                                } else {
                                    z2 = true;
                                }
                                if (zM24695) {
                                    iM45559++;
                                }
                                i7 = iM45559;
                                if (z2) {
                                    c = 0;
                                    f5 = 0.0f;
                                    c21402 = c21402;
                                    m17845(canvas, charSequence, i15, i7, f15, f4, paint);
                                } else {
                                    c21402 = c21402;
                                    c = 0;
                                    f5 = 0.0f;
                                }
                                f15 += fMeasureText4;
                                z7 = this.f22175;
                                if ((z2 || f15 <= i4) && i7 < i2) {
                                    z8 = z7;
                                    i8 = i7;
                                    z16 = z2;
                                    z18 = false;
                                } else {
                                    charSequence2 = charSequence3;
                                    i14 = i7;
                                    canvas = canvas;
                                    z8 = z7;
                                    i7 = i14;
                                    z3 = z17;
                                }
                            } else if (bM17214 != 8 || z10) {
                                zM24695 = false;
                                if (zM24695) {
                                    if (cCharAt2 >= 768) {
                                        zM24695 = false;
                                    } else {
                                        zM24695 = false;
                                    }
                                }
                                float fMeasureText5 = paint.measureText(charSequence3, i15, iM45559);
                                if (z16) {
                                    z2 = z16;
                                } else {
                                    z2 = z16;
                                }
                                if (zM24695) {
                                    iM45559++;
                                }
                                i7 = iM45559;
                                if (z2) {
                                    c = 0;
                                    f5 = 0.0f;
                                    c21402 = c21402;
                                    m17845(canvas, charSequence, i15, i7, f15, f4, paint);
                                } else {
                                    c21402 = c21402;
                                    c = 0;
                                    f5 = 0.0f;
                                }
                                f15 += fMeasureText5;
                                z7 = this.f22175;
                                if (z2) {
                                    z8 = z7;
                                    i8 = i7;
                                    z16 = z2;
                                    z18 = false;
                                } else {
                                    z8 = z7;
                                    i8 = i7;
                                    z16 = z2;
                                    z18 = false;
                                }
                                charSequence2 = charSequence3;
                                i14 = i7;
                                canvas = canvas;
                                z8 = z7;
                                i7 = i14;
                                z3 = z17;
                            } else {
                                interfaceC0940 = interfaceC0940;
                            }
                            if (!z8 || z3) {
                                if (z2) {
                                    fMeasureText = -1.0f;
                                } else {
                                    fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                                    if (f15 + fMeasureText2 >= i3) {
                                        z2 = true;
                                    }
                                    fMeasureText = fMeasureText2;
                                }
                                if (z2) {
                                    m17845(canvas, charSequence, i7, i2, f15, f4, paint);
                                }
                                if (z15) {
                                    if (fMeasureText < f5) {
                                        fMeasureText = paint.measureText(charSequence2, i7, i2);
                                    }
                                    f15 += fMeasureText;
                                }
                            } else {
                                f = f;
                            }
                            if (z11) {
                                paint.setFakeBoldText(false);
                            }
                            if (z12) {
                                canvas.restoreToCount(i6);
                                f4 = f2;
                            }
                            this.f22188 = interfaceC0940;
                            f6 = this.f22194;
                            if (z13) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    underlinePosition = paint.getUnderlinePosition();
                                    textSize2 = paint.getUnderlineThickness();
                                } else {
                                    underlinePosition = (this.f22195 * 0.85f) - this.f22173;
                                    textSize2 = paint.getTextSize() * 0.019f * f6;
                                }
                                float f16 = underlinePosition + f4;
                                m17844(canvas, paint, (int) f, f16, (int) (f15 + 1.0f), f16 + textSize2);
                            }
                            if (z14) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    strikeThruPosition = paint.getStrikeThruPosition();
                                    textSize = paint.getStrikeThruThickness();
                                } else {
                                    strikeThruPosition = (this.f22195 * 0.551f) - this.f22173;
                                    textSize = paint.getTextSize() * 0.021f * f6;
                                }
                                float f17 = f4 + strikeThruPosition;
                                m17844(canvas, paint, (int) f, f17, (int) (f15 + 1.0f), f17 + textSize);
                            }
                            if (z15) {
                                return f15 - f;
                            }
                            return f5;
                        }
                        interfaceC0940 = interfaceC0940;
                        i15 = i15;
                        iM45559 = iM455510;
                        c21408 = c21402;
                        z10 = z10;
                        i6 = i6;
                        interfaceC0940 = interfaceC0940;
                        fArr = fArr;
                        canvas = canvas;
                    } else {
                        c21402 = c21408;
                        i6 = i6;
                        interfaceC0940 = interfaceC0940;
                        z10 = z10;
                        fArr = fArr;
                        i8 = i15;
                        c = 0;
                        f5 = 0.0f;
                        i7 = iM45559;
                    }
                    char cCharAt3 = charSequence3.charAt(i7);
                    if (!z17) {
                        cCharAt3 = cCharAt3;
                        z18 = z18;
                        f15 = f15;
                        z17 = z17;
                        i15 = i8;
                    } else {
                        if (!C6210.m17215(cCharAt3)) {
                            float fMeasureText6 = paint.measureText(charSequence3, i8, i7);
                            z2 = (z16 || f15 + fMeasureText6 < ((float) i3)) ? z16 : true;
                            if (z2) {
                                m17845(canvas, charSequence, i8, i7, f15, f4, paint);
                            }
                            f15 += fMeasureText6;
                            if (!z2 || f15 <= i4) {
                                z18 = false;
                                i15 = i7;
                                z16 = z2;
                                f15 = f15;
                                z17 = false;
                            } else {
                                z3 = false;
                                charSequence2 = charSequence3;
                                canvas = canvas;
                            }
                            if (z8) {
                                if (z2) {
                                    fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                                    if (f15 + fMeasureText2 >= i3) {
                                        z2 = true;
                                    }
                                    fMeasureText = fMeasureText2;
                                } else {
                                    fMeasureText = -1.0f;
                                }
                                if (z2) {
                                    m17845(canvas, charSequence, i7, i2, f15, f4, paint);
                                }
                                if (z15) {
                                    if (fMeasureText < f5) {
                                        fMeasureText = paint.measureText(charSequence2, i7, i2);
                                    }
                                    f15 += fMeasureText;
                                }
                            } else {
                                if (z2) {
                                    fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                                    if (f15 + fMeasureText2 >= i3) {
                                        z2 = true;
                                    }
                                    fMeasureText = fMeasureText2;
                                } else {
                                    fMeasureText = -1.0f;
                                }
                                if (z2) {
                                    m17845(canvas, charSequence, i7, i2, f15, f4, paint);
                                }
                                if (z15) {
                                    if (fMeasureText < f5) {
                                        fMeasureText = paint.measureText(charSequence2, i7, i2);
                                    }
                                    f15 += fMeasureText;
                                }
                            }
                            if (z11) {
                                paint.setFakeBoldText(false);
                            }
                            if (z12) {
                                canvas.restoreToCount(i6);
                                f4 = f2;
                            }
                            this.f22188 = interfaceC0940;
                            f6 = this.f22194;
                            if (z13) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    underlinePosition = paint.getUnderlinePosition();
                                    textSize2 = paint.getUnderlineThickness();
                                } else {
                                    underlinePosition = (this.f22195 * 0.85f) - this.f22173;
                                    textSize2 = paint.getTextSize() * 0.019f * f6;
                                }
                                float f18 = underlinePosition + f4;
                                m17844(canvas, paint, (int) f, f18, (int) (f15 + 1.0f), f18 + textSize2);
                            }
                            if (z14) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    strikeThruPosition = paint.getStrikeThruPosition();
                                    textSize = paint.getStrikeThruThickness();
                                } else {
                                    strikeThruPosition = (this.f22195 * 0.551f) - this.f22173;
                                    textSize = paint.getTextSize() * 0.021f * f6;
                                }
                                float f19 = f4 + strikeThruPosition;
                                m17844(canvas, paint, (int) f, f19, (int) (f15 + 1.0f), f19 + textSize);
                            }
                            if (z15) {
                                return f15 - f;
                            }
                            return f5;
                        }
                        i15 = i8;
                        iM45559 = i7 + 1;
                        c21408 = c21402;
                        z10 = z10;
                        i6 = i6;
                        interfaceC0940 = interfaceC0940;
                        fArr = fArr;
                        canvas = canvas;
                    }
                    byte bM17215 = C6210.m17214(cCharAt3);
                    C4916 c4916 = this.f22196;
                    C7952 c7952 = f22163;
                    C18580 c18580 = this.f22167;
                    char[] cArr = this.f22179;
                    switch (bM17215) {
                        case 0:
                            char c3 = cCharAt3;
                            c21407 = c21402;
                            charSequence2 = charSequence3;
                            canvas = canvas;
                            boolean z19 = (z16 || f15 + this.f22171 < ((float) i3)) ? z16 : true;
                            if (z19) {
                                cArr[0] = c3;
                                m17846(canvas, cArr, 1, f15, f4, paint);
                            }
                            float f20 = f15 + this.f22171;
                            int i16 = i7 + 1;
                            if (z19 && f20 > i4) {
                                z16 = z19;
                                boolean z20 = z17;
                                f15 = f20;
                                i15 = i15;
                                z17 = z20;
                            } else {
                                f7 = f20;
                                iM45559 = i16;
                                z16 = z19;
                                c21408 = c21407;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas2 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas2;
                            }
                            break;
                        case 1:
                            CharSequence charSequence4 = charSequence3;
                            c21403 = c21402;
                            charSequence2 = charSequence4;
                            boolean z21 = (z16 || f15 + this.f22186 < ((float) i3)) ? z16 : true;
                            if (z21 && this.f22166) {
                                if (this.f22190 && !z18 && (i7 >= charSequence.length() - 1 || (cCharAt = charSequence2.charAt(i7 + 1)) == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n')) {
                                    z18 = true;
                                }
                                if (!this.f22190 || z18) {
                                    float fCeil = (float) Math.ceil((this.f22186 / 2.0f) + f15);
                                    float fCeil2 = (float) Math.ceil((this.f22195 / 2.0f) + (f4 - this.f22173));
                                    float f21 = this.f22195 * 0.042f;
                                    int color = paint.getColor();
                                    paint.setColor((this.f22178 & 16777215) | (C20368.m45983(100, 50) << 24));
                                    canvas = canvas;
                                    canvas.drawCircle(fCeil, fCeil2, f21, paint);
                                    paint.setColor(color);
                                } else {
                                    canvas = canvas;
                                }
                            } else {
                                canvas = canvas;
                            }
                            float f22 = f15 + this.f22186;
                            i9 = i7 + 1;
                            if (z21 && f22 > i4) {
                                z2 = z21;
                                i7 = i15;
                                z3 = z17;
                                f15 = f22;
                            } else {
                                z4 = z21;
                                f7 = f22;
                                iM45559 = i9;
                                z16 = z4;
                                c21408 = c21403;
                                i15 = i15;
                                f15 = f7;
                                z18 = true;
                                Canvas canvas3 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas3;
                            }
                            break;
                        case 2:
                            CharSequence charSequence5 = charSequence3;
                            C21402 c21409 = c21402;
                            charSequence2 = charSequence5;
                            float f23 = (f3 + f15) - f;
                            float f24 = this.f22186;
                            float f25 = this.f22172 * f24;
                            float f26 = ((((int) (f23 / f25)) + 1) * f25) - f23;
                            if (f26 < f24) {
                                f26 += f25;
                            }
                            float f27 = f26;
                            z4 = (z16 || f15 + f27 < ((float) i3)) ? z16 : true;
                            if (z4 && this.f22166) {
                                float f28 = f24 * 0.15f;
                                float f29 = f28 + f15;
                                float f30 = (f15 + f27) - f28;
                                float f31 = f4 - this.f22173;
                                float f32 = this.f22195;
                                float f33 = (f32 / 2.0f) + f31;
                                int iMax = Math.max((int) (f32 * 0.02f), 1);
                                int iCeil = (int) Math.ceil(f33 - iMax);
                                int color2 = paint.getColor();
                                paint.setColor((this.f22178 & 16777215) | (C20368.m45983(100, 50) << 24));
                                canvas.drawRect(f29, iCeil, f30, iCeil + iMax + iMax, paint);
                                paint.setColor(color2);
                            }
                            f7 = f15 + f27;
                            i9 = i7 + 1;
                            if (z4 && f7 > i4) {
                                canvas = canvas;
                                i7 = i15;
                                z3 = z17;
                                f15 = f7;
                                z2 = z4;
                            } else {
                                c21403 = c21409;
                                canvas = canvas;
                                iM45559 = i9;
                                z16 = z4;
                                c21408 = c21403;
                                i15 = i15;
                                f15 = f7;
                                z18 = true;
                                Canvas canvas4 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas4;
                            }
                            break;
                        case 3:
                            char c4 = cCharAt3;
                            CharSequence charSequence6 = charSequence3;
                            c21404 = c21402;
                            charSequence2 = charSequence6;
                            cArr[c] = c4;
                            int i17 = i2 - i7;
                            if (i17 >= 3 && charSequence2.charAt(i7 + 1) == 65039) {
                                c2 = 8419;
                                if (charSequence2.charAt(i7 + 2) == 8419) {
                                    cArr[1] = 65039;
                                    cArr[2] = 8419;
                                    i11 = 3;
                                    paint = paint;
                                    fMeasureText3 = paint.measureText(cArr, 0, 3);
                                }
                                if (!z16 || f15 + fMeasureText3 < i3) {
                                    z6 = z16;
                                } else {
                                    z6 = true;
                                }
                                if (z6) {
                                    if (i11 == 1 || c4 < '0') {
                                        i12 = i11;
                                    } else {
                                        int iMin = Math.min(cArr.length, i17);
                                        while (true) {
                                            if (i11 < iMin) {
                                                char cCharAt4 = charSequence2.charAt(i7 + i11);
                                                int i18 = C21402.f69583;
                                                if ((('a' <= cCharAt4 && cCharAt4 <= 'z') || (('A' <= cCharAt4 && cCharAt4 <= 'Z') || ('0' <= cCharAt4 && cCharAt4 <= '9'))) && c21404.m47950(c4, cCharAt4)) {
                                                    cArr[i11] = cCharAt4;
                                                    fMeasureText3 += fArr2[cCharAt4];
                                                    i11++;
                                                    c4 = cCharAt4;
                                                } else if (C9739.m24697(cCharAt4)) {
                                                    cArr[i11] = cCharAt4;
                                                    i12 = i11 + 1;
                                                }
                                            }
                                            i12 = i11;
                                        }
                                    }
                                    m17846(canvas, cArr, i12, f15, f4, paint);
                                    i11 = i12;
                                    fMeasureText3 = fMeasureText3;
                                }
                                f8 = f15 + fMeasureText3;
                                iM45559 = i11 + i7;
                                if (!z6 && f8 > i4) {
                                    f7 = f8;
                                    z5 = z6;
                                    z7 = z8;
                                    i14 = i15;
                                    z17 = z17;
                                    f15 = f7;
                                    z2 = z5;
                                    z8 = z7;
                                    i7 = i14;
                                    z3 = z17;
                                } else {
                                    z18 = false;
                                    z16 = z6;
                                    c21408 = c21404;
                                    z10 = z10;
                                    i6 = i6;
                                    interfaceC0940 = interfaceC0940;
                                    fArr = fArr;
                                    charSequence3 = charSequence2;
                                    canvas = canvas;
                                    boolean z22 = z17;
                                    f15 = f8;
                                    i15 = i15;
                                    z17 = z22;
                                }
                            } else {
                                c2 = 8419;
                            }
                            if (i17 >= 2 && charSequence2.charAt(i7 + 1) == c2) {
                                cArr[1] = c2;
                                fMeasureText3 = paint.measureText(cArr, 0, 2);
                                i11 = 2;
                            } else if (this.f22181 && (c4 == '#' || c4 == '*')) {
                                iM45558 = i7 + 1;
                                z17 = true;
                                c21408 = c21404;
                                charSequence3 = charSequence2;
                                iM45559 = iM45558;
                                i15 = i7;
                            } else {
                                fMeasureText3 = fArr2[c4];
                                i11 = 1;
                            }
                            if (z16) {
                                z6 = z16;
                            } else {
                                z6 = z16;
                            }
                            if (z6) {
                                if (i11 == 1) {
                                    i12 = i11;
                                } else {
                                    i12 = i11;
                                }
                                m17846(canvas, cArr, i12, f15, f4, paint);
                                i11 = i12;
                                fMeasureText3 = fMeasureText3;
                            }
                            f8 = f15 + fMeasureText3;
                            iM45559 = i11 + i7;
                            if (!z6) {
                            }
                            z18 = false;
                            z16 = z6;
                            c21408 = c21404;
                            z10 = z10;
                            i6 = i6;
                            interfaceC0940 = interfaceC0940;
                            fArr = fArr;
                            charSequence3 = charSequence2;
                            canvas = canvas;
                            boolean z23 = z17;
                            f15 = f8;
                            i15 = i15;
                            z17 = z23;
                            break;
                        case 4:
                            char c5 = cCharAt3;
                            C21402 c214010 = c21402;
                            charSequence2 = charSequence3;
                            if (this.f22181 && C6210.m17215(c5)) {
                                iM45558 = i7 + 1;
                                c21404 = c214010;
                                paint = paint;
                                z17 = true;
                                c21408 = c21404;
                                charSequence3 = charSequence2;
                                iM45559 = iM45558;
                                i15 = i7;
                            } else {
                                float f34 = fArr2[c5];
                                boolean z24 = (z16 || f15 + f34 < ((float) i3)) ? z16 : true;
                                if (f34 > f5 && z24) {
                                    String str = strArr[c5];
                                    if (str.length() <= 1) {
                                        f9 = f34;
                                        if (c5 > 0) {
                                            cArr[c] = c5;
                                            int i19 = C21402.f69583;
                                            if (('a' > c5 || c5 > 'z') && (('A' > c5 || c5 > 'Z') && ('0' > c5 || c5 > '9'))) {
                                                c21406 = c214010;
                                                f11 = f9;
                                                i13 = 1;
                                            } else {
                                                int iMin2 = Math.min(cArr.length, i2 - i7);
                                                int i20 = 1;
                                                f11 = f9;
                                                char c6 = c5;
                                                while (true) {
                                                    if (i20 >= iMin2) {
                                                        c21406 = c214010;
                                                    } else {
                                                        char cCharAt5 = charSequence2.charAt(i7 + i20);
                                                        if (('a' > cCharAt5 || cCharAt5 > 'z') && (('A' > cCharAt5 || cCharAt5 > 'Z') && ('0' > cCharAt5 || cCharAt5 > '9'))) {
                                                            c21406 = c214010;
                                                        } else {
                                                            c21406 = c214010;
                                                            if (c21406.m47950(c6, cCharAt5)) {
                                                                cArr[i20] = cCharAt5;
                                                                f11 += fArr2[cCharAt5];
                                                                i20++;
                                                                c6 = cCharAt5;
                                                                c214010 = c21406;
                                                            }
                                                        }
                                                        if (C9739.m24697(cCharAt5)) {
                                                            cArr[i20] = cCharAt5;
                                                            i13 = i20 + 1;
                                                        }
                                                    }
                                                    i13 = i20;
                                                }
                                            }
                                            float f35 = f11;
                                            c21405 = c21406;
                                            m17846(canvas, cArr, i13, f15, f4, paint);
                                            i7 += i13 - 1;
                                            f10 = f35;
                                        }
                                        f7 = f15 + f10;
                                        i10 = i7 + 1;
                                        if (!z24 && f7 > i4) {
                                            z5 = z24;
                                            paint = paint;
                                            z7 = z8;
                                            i14 = i15;
                                            z17 = z17;
                                            f15 = f7;
                                            z2 = z5;
                                            z8 = z7;
                                            i7 = i14;
                                            z3 = z17;
                                        } else {
                                            z5 = z24;
                                            paint = paint;
                                            c21407 = c21405;
                                            iM45559 = i10;
                                            z16 = z5;
                                            canvas = canvas;
                                            c21408 = c21407;
                                            z17 = z17;
                                            f15 = f7;
                                            Canvas canvas5 = canvas;
                                            charSequence3 = charSequence2;
                                            canvas = canvas5;
                                        }
                                    } else {
                                        int i21 = this.f22180;
                                        float f36 = i21;
                                        float f37 = f15 + f36;
                                        m17845(canvas, str, 0, str.length(), f37, f4, paint);
                                        float f38 = f4 - this.f22173;
                                        int i22 = i21 * 3;
                                        float f39 = i22;
                                        int iCeil2 = (int) Math.ceil((this.f22177 + f38) - f39);
                                        int iCeil3 = (int) Math.ceil(f38 + this.f22176 + f39);
                                        float f40 = f15 + f34;
                                        float f41 = iCeil2 + i21;
                                        float f42 = f15;
                                        f9 = f34;
                                        m17844(canvas, paint, f42, iCeil2, f40, f41);
                                        float f43 = iCeil2 + i22;
                                        m17844(canvas, paint, f42, f41, f37, f43);
                                        float f44 = f40 - f36;
                                        m17844(canvas, paint, f44, f41, f40, f43);
                                        float f45 = iCeil3 - i21;
                                        float f46 = f15;
                                        m17844(canvas, paint, f46, f45, f40, iCeil3);
                                        float f47 = iCeil3 - i22;
                                        m17844(canvas, paint, f46, f45, f37, f47);
                                        m17844(canvas, paint, f44, f45, f40, f47);
                                    }
                                } else {
                                    f9 = f34;
                                }
                                c21405 = c214010;
                                f10 = f9;
                                f7 = f15 + f10;
                                i10 = i7 + 1;
                                if (!z24) {
                                }
                                z5 = z24;
                                paint = paint;
                                c21407 = c21405;
                                iM45559 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c21408 = c21407;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas6 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas6;
                            }
                            break;
                        case 5:
                            c21402 = c21402;
                            charSequence2 = charSequence3;
                            z6 = (z16 || this.f22169 + f15 < ((float) i3)) ? z16 : true;
                            if (z6) {
                                cArr[c] = 65533;
                                m17846(canvas, cArr, 1, f15, f4, paint);
                            }
                            f7 = f15 + this.f22169;
                            i10 = i7 + 1;
                            if (z6 && f7 > i4) {
                                paint = paint;
                                z5 = z6;
                                z7 = z8;
                                i14 = i15;
                                z17 = z17;
                                f15 = f7;
                                z2 = z5;
                                z8 = z7;
                                i7 = i14;
                                z3 = z17;
                            } else {
                                z5 = z6;
                                c21405 = c21402;
                                paint = paint;
                                c21407 = c21405;
                                iM45559 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c21408 = c21407;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas7 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas7;
                            }
                            break;
                        case 6:
                            c21402 = c21402;
                            charSequence2 = charSequence3;
                            if (!z16 && fArr[c] + f15 >= i3) {
                                z16 = true;
                            }
                            f7 = f15 + fArr[c];
                            i10 = i7 + 1;
                            if (!z16 && f7 > i4) {
                                canvas = canvas;
                                paint = paint;
                                z5 = z16;
                                z7 = z8;
                                i14 = i15;
                                z17 = z17;
                                f15 = f7;
                                z2 = z5;
                                z8 = z7;
                                i7 = i14;
                                z3 = z17;
                            } else {
                                z5 = z16;
                                c21405 = c21402;
                                paint = paint;
                                c21407 = c21405;
                                iM45559 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c21408 = c21407;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas8 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas8;
                            }
                            break;
                        case 7:
                            char c7 = cCharAt3;
                            c21402 = c21402;
                            charSequence2 = charSequence3;
                            float fM17849 = m17849(c7);
                            boolean z25 = (z16 || f15 + fM17849 < ((float) i3)) ? z16 : true;
                            if (z25) {
                                cArr[c] = c7;
                                m17846(canvas, cArr, 1, f15, f4, paint);
                            }
                            f7 = f15 + fM17849;
                            i10 = i7 + 1;
                            if (z25 && f7 > i4) {
                                paint = paint;
                                z5 = z25;
                                canvas = canvas;
                                z7 = z8;
                                i14 = i15;
                                z17 = z17;
                                f15 = f7;
                                z2 = z5;
                                z8 = z7;
                                i7 = i14;
                                z3 = z17;
                            } else {
                                z5 = z25;
                                c21405 = c21402;
                                paint = paint;
                                c21407 = c21405;
                                iM45559 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c21408 = c21407;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas9 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas9;
                            }
                            break;
                        case 8:
                            char c8 = cCharAt3;
                            c21402 = c21402;
                            if (!z10) {
                                iM45558 = C20149.m45558(i7, i2, charSequence);
                                z8 = true;
                                c21408 = c21402;
                                paint = paint;
                                charSequence3 = charSequence;
                                z17 = z17;
                                iM45559 = iM45558;
                                i15 = i7;
                            } else {
                                String str2 = (String) c7952.mo15966(c8);
                                Float fM42977 = c18580.m42977(str2);
                                if (fM42977 == null) {
                                    fM42977 = Float.valueOf(paint.measureText(str2));
                                    c18580.m42979(str2, fM42977);
                                }
                                float fFloatValue = fM42977.floatValue() + (this.f22180 * 2);
                                boolean z26 = (z16 || f15 + fFloatValue < ((float) i3)) ? z16 : true;
                                if (z26) {
                                    int i23 = this.f22180;
                                    float f48 = i23;
                                    float f49 = f15 + f48;
                                    m17845(canvas, str2, 0, str2.length(), f49, f4, paint);
                                    float f50 = f4 - this.f22173;
                                    int i24 = i23 * 3;
                                    float f51 = i24;
                                    int iCeil4 = (int) Math.ceil((this.f22177 + f50) - f51);
                                    int iCeil5 = (int) Math.ceil(f50 + this.f22176 + f51);
                                    float f52 = f15 + fFloatValue;
                                    float f53 = iCeil4 + i23;
                                    float f54 = f15;
                                    m17844(canvas, paint, f54, iCeil4, f52, f53);
                                    float f55 = iCeil4 + i24;
                                    m17844(canvas, paint, f54, f53, f49, f55);
                                    float f56 = f52 - f48;
                                    m17844(canvas, paint, f56, f53, f52, f55);
                                    float f57 = iCeil5 - i23;
                                    float f58 = f15;
                                    m17844(canvas, paint, f58, f57, f52, iCeil5);
                                    float f59 = iCeil5 - i24;
                                    m17844(canvas, paint, f58, f57, f49, f59);
                                    m17844(canvas, paint, f56, f57, f52, f59);
                                }
                                f7 = f15 + fFloatValue;
                                i10 = i7 + 1;
                                if (z26 && f7 > i4) {
                                    z5 = z26;
                                    charSequence2 = charSequence;
                                    paint = paint;
                                    z7 = z8;
                                    i14 = i15;
                                    z17 = z17;
                                    f15 = f7;
                                    z2 = z5;
                                    z8 = z7;
                                    i7 = i14;
                                    z3 = z17;
                                } else {
                                    z5 = z26;
                                    charSequence2 = charSequence;
                                    c21405 = c21402;
                                    paint = paint;
                                    c21407 = c21405;
                                    iM45559 = i10;
                                    z16 = z5;
                                    canvas = canvas;
                                    c21408 = c21407;
                                    z17 = z17;
                                    f15 = f7;
                                    Canvas canvas10 = canvas;
                                    charSequence3 = charSequence2;
                                    canvas = canvas10;
                                }
                            }
                            break;
                        case 9:
                            char c9 = cCharAt3;
                            c21402 = c21402;
                            if (!z10) {
                                charSequence2 = charSequence;
                                if (!z16) {
                                    z16 = true;
                                }
                                f7 = f15 + fArr[c];
                                i10 = i7 + 1;
                                if (!z16) {
                                }
                                z5 = z16;
                                c21405 = c21402;
                                paint = paint;
                                c21407 = c21405;
                                iM45559 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c21408 = c21407;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas11 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas11;
                            } else {
                                String str3 = (String) c7952.mo15966(c9);
                                String str4 = (String) c7952.mo15966(c9);
                                Float fM42978 = c18580.m42977(str4);
                                if (fM42978 == null) {
                                    fM42978 = Float.valueOf(c4916.measureText(str4));
                                    c18580.m42979(str4, fM42978);
                                }
                                float fFloatValue2 = fM42978.floatValue();
                                int i25 = this.f22180;
                                float f60 = fFloatValue2 + (i25 * 2);
                                z5 = (z16 || f15 + f60 < ((float) i3)) ? z16 : true;
                                if (z5) {
                                    float f61 = i25;
                                    float f62 = f15 + f61;
                                    m17845(canvas, str3, 0, str3.length(), f62, f4, paint);
                                    float f63 = f4 - this.f22173;
                                    int i26 = i25 * 3;
                                    float f64 = i26;
                                    int iCeil6 = (int) Math.ceil((this.f22177 + f63) - f64);
                                    int iCeil7 = (int) Math.ceil(f63 + this.f22176 + f64);
                                    float f65 = f15 + f60;
                                    float f66 = iCeil6 + i25;
                                    float f67 = f15;
                                    m17844(canvas, paint, f67, iCeil6, f65, f66);
                                    float f68 = iCeil6 + i26;
                                    m17844(canvas, paint, f67, f66, f62, f68);
                                    float f69 = f65 - f61;
                                    m17844(canvas, paint, f69, f66, f65, f68);
                                    float f70 = iCeil7 - i25;
                                    float f71 = f15;
                                    m17844(canvas, paint, f71, f70, f65, iCeil7);
                                    float f72 = iCeil7 - i26;
                                    m17844(canvas, paint, f71, f70, f62, f72);
                                    m17844(canvas, paint, f69, f70, f65, f72);
                                }
                                f7 = f15 + f60;
                                i10 = i7 + 1;
                                if (z5 && f7 > i4) {
                                    charSequence2 = charSequence;
                                    paint = paint;
                                    z7 = z8;
                                    i14 = i15;
                                    z17 = z17;
                                    f15 = f7;
                                    z2 = z5;
                                    z8 = z7;
                                    i7 = i14;
                                    z3 = z17;
                                }
                                charSequence2 = charSequence;
                                c21405 = c21402;
                                paint = paint;
                                c21407 = c21405;
                                iM45559 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c21408 = c21407;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas12 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas12;
                            }
                            break;
                        case 10:
                            if (z10) {
                                char c10 = cCharAt3;
                                String str5 = (String) c7952.mo15966(c10);
                                String str6 = (String) c7952.mo15966(c10);
                                Float fM42979 = c18580.m42977(str6);
                                if (fM42979 == null) {
                                    fM42979 = Float.valueOf(c4916.measureText(str6));
                                    c18580.m42979(str6, fM42979);
                                }
                                float fFloatValue3 = fM42979.floatValue();
                                int i27 = this.f22180;
                                float f73 = fFloatValue3 + (i27 * 2);
                                z5 = (z16 || f15 + f73 < ((float) i3)) ? z16 : true;
                                if (z5) {
                                    float f74 = i27;
                                    float f75 = f15 + f74;
                                    m17845(canvas, str5, 0, str5.length(), f75, f4, paint);
                                    float f76 = f4 - this.f22173;
                                    int i28 = i27 * 3;
                                    float f77 = i28;
                                    int iCeil8 = (int) Math.ceil((this.f22177 + f76) - f77);
                                    int iCeil9 = (int) Math.ceil(f76 + this.f22176 + f77);
                                    float f78 = f15 + f73;
                                    float f79 = iCeil8 + i27;
                                    float f80 = f15;
                                    m17844(canvas, paint, f80, iCeil8, f78, f79);
                                    float f81 = iCeil8 + i28;
                                    m17844(canvas, paint, f80, f79, f75, f81);
                                    float f82 = f78 - f74;
                                    m17844(canvas, paint, f82, f79, f78, f81);
                                    float f83 = iCeil9 - i27;
                                    float f84 = f15;
                                    m17844(canvas, paint, f84, f83, f78, iCeil9);
                                    float f85 = iCeil9 - i28;
                                    m17844(canvas, paint, f84, f83, f75, f85);
                                    m17844(canvas, paint, f82, f83, f78, f85);
                                }
                                f7 = f15 + f73;
                                i10 = i7 + 1;
                                if (z5 && f7 > i4) {
                                }
                                charSequence2 = charSequence;
                                c21405 = c21402;
                                paint = paint;
                                c21407 = c21405;
                                iM45559 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c21408 = c21407;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas13 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas13;
                            } else {
                                C21402 c214011 = c21402;
                                if (!z16 && f15 + this.f22186 >= i3) {
                                    z16 = true;
                                }
                                f7 = f15 + this.f22186;
                                int i29 = i7 + 1;
                                if (!z16 || f7 <= i4) {
                                    c21403 = c214011;
                                    charSequence2 = charSequence3;
                                    iM45559 = i29;
                                    canvas = canvas;
                                    c21408 = c21403;
                                    i15 = i15;
                                    f15 = f7;
                                    z18 = true;
                                    Canvas canvas14 = canvas;
                                    charSequence3 = charSequence2;
                                    canvas = canvas14;
                                } else {
                                    z5 = z16;
                                }
                            }
                            charSequence2 = charSequence;
                            paint = paint;
                            z7 = z8;
                            i14 = i15;
                            z17 = z17;
                            f15 = f7;
                            z2 = z5;
                            z8 = z7;
                            i7 = i14;
                            z3 = z17;
                            break;
                        default:
                            char c11 = cCharAt3;
                            C21402 c214012 = c21402;
                            charSequence2 = charSequence3;
                            canvas = canvas;
                            if (!C9739.m24695(c11)) {
                                z8 = true;
                                c21408 = c214012;
                                f15 = f15;
                                z18 = z18;
                                iM45559 = C20149.m45558(i7, i2, charSequence2);
                                i15 = i7;
                                Canvas canvas15 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas15;
                            } else {
                                float fM178410 = (i7 <= 0 || !C9739.m24695(charSequence2.charAt(i7 - 1))) ? 0.0f : C9739.m24694(c11) ? m17849(c11) : this.f22187;
                                boolean z27 = (z16 || f15 + fM178410 < ((float) i3)) ? z16 : true;
                                if (z27) {
                                    cArr[c] = c11;
                                    m17846(canvas, cArr, 1, f15, f4, paint);
                                }
                                float f86 = f15 + fM178410;
                                iM45559 = i7 + 1;
                                if (z27 && f86 > i4) {
                                    f7 = f86;
                                    z5 = z27;
                                    z7 = z8;
                                    i14 = i15;
                                    z17 = z17;
                                    f15 = f7;
                                    z2 = z5;
                                    z8 = z7;
                                    i7 = i14;
                                    z3 = z17;
                                } else {
                                    c21408 = c214012;
                                    z16 = z27;
                                    boolean z28 = z17;
                                    f15 = f86;
                                    z17 = z28;
                                    charSequence3 = charSequence2;
                                    canvas = canvas;
                                }
                            }
                            break;
                    }
                    if (z8) {
                        if (z2) {
                            fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                            if (f15 + fMeasureText2 >= i3) {
                                z2 = true;
                            }
                            fMeasureText = fMeasureText2;
                        } else {
                            fMeasureText = -1.0f;
                        }
                        if (z2) {
                            m17845(canvas, charSequence, i7, i2, f15, f4, paint);
                        }
                        if (z15) {
                            if (fMeasureText < f5) {
                                fMeasureText = paint.measureText(charSequence2, i7, i2);
                            }
                            f15 += fMeasureText;
                        }
                    } else {
                        if (z2) {
                            fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                            if (f15 + fMeasureText2 >= i3) {
                                z2 = true;
                            }
                            fMeasureText = fMeasureText2;
                        } else {
                            fMeasureText = -1.0f;
                        }
                        if (z2) {
                            m17845(canvas, charSequence, i7, i2, f15, f4, paint);
                        }
                        if (z15) {
                            if (fMeasureText < f5) {
                                fMeasureText = paint.measureText(charSequence2, i7, i2);
                            }
                            f15 += fMeasureText;
                        }
                    }
                    if (z11) {
                        paint.setFakeBoldText(false);
                    }
                    if (z12) {
                        canvas.restoreToCount(i6);
                        f4 = f2;
                    }
                    this.f22188 = interfaceC0940;
                    f6 = this.f22194;
                    if (z13) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            underlinePosition = paint.getUnderlinePosition();
                            textSize2 = paint.getUnderlineThickness();
                        } else {
                            underlinePosition = (this.f22195 * 0.85f) - this.f22173;
                            textSize2 = paint.getTextSize() * 0.019f * f6;
                        }
                        float f110 = underlinePosition + f4;
                        m17844(canvas, paint, (int) f, f110, (int) (f15 + 1.0f), f110 + textSize2);
                    }
                    if (z14) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            strikeThruPosition = paint.getStrikeThruPosition();
                            textSize = paint.getStrikeThruThickness();
                        } else {
                            strikeThruPosition = (this.f22195 * 0.551f) - this.f22173;
                            textSize = paint.getTextSize() * 0.021f * f6;
                        }
                        float f111 = f4 + strikeThruPosition;
                        m17844(canvas, paint, (int) f, f111, (int) (f15 + 1.0f), f111 + textSize);
                    }
                    if (z15) {
                        return f15 - f;
                    }
                    return f5;
                }
                i6 = i6;
                interfaceC0940 = interfaceC0940;
                CharSequence charSequence7 = charSequence3;
                canvas = canvas;
                charSequence2 = charSequence7;
                f5 = 0.0f;
                i7 = i15;
                z2 = z16;
                z3 = z17;
                if (z8) {
                    if (z2) {
                        fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                        if (f15 + fMeasureText2 >= i3) {
                            z2 = true;
                        }
                        fMeasureText = fMeasureText2;
                    } else {
                        fMeasureText = -1.0f;
                    }
                    if (z2) {
                        m17845(canvas, charSequence, i7, i2, f15, f4, paint);
                    }
                    if (z15) {
                        if (fMeasureText < f5) {
                            fMeasureText = paint.measureText(charSequence2, i7, i2);
                        }
                        f15 += fMeasureText;
                    }
                } else {
                    if (z2) {
                        fMeasureText2 = paint.measureText(charSequence2, i7, i2);
                        if (f15 + fMeasureText2 >= i3) {
                            z2 = true;
                        }
                        fMeasureText = fMeasureText2;
                    } else {
                        fMeasureText = -1.0f;
                    }
                    if (z2) {
                        m17845(canvas, charSequence, i7, i2, f15, f4, paint);
                    }
                    if (z15) {
                        if (fMeasureText < f5) {
                            fMeasureText = paint.measureText(charSequence2, i7, i2);
                        }
                        f15 += fMeasureText;
                    }
                }
                if (z11) {
                    paint.setFakeBoldText(false);
                }
                if (z12) {
                    canvas.restoreToCount(i6);
                    f4 = f2;
                }
                this.f22188 = interfaceC0940;
                f6 = this.f22194;
                if (z13) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        underlinePosition = paint.getUnderlinePosition();
                        textSize2 = paint.getUnderlineThickness();
                    } else {
                        underlinePosition = (this.f22195 * 0.85f) - this.f22173;
                        textSize2 = paint.getTextSize() * 0.019f * f6;
                    }
                    float f112 = underlinePosition + f4;
                    m17844(canvas, paint, (int) f, f112, (int) (f15 + 1.0f), f112 + textSize2);
                }
                if (z14) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        strikeThruPosition = paint.getStrikeThruPosition();
                        textSize = paint.getStrikeThruThickness();
                    } else {
                        strikeThruPosition = (this.f22195 * 0.551f) - this.f22173;
                        textSize = paint.getTextSize() * 0.021f * f6;
                    }
                    float f113 = f4 + strikeThruPosition;
                    m17844(canvas, paint, (int) f, f113, (int) (f15 + 1.0f), f113 + textSize);
                }
                if (z15) {
                    return f15 - f;
                }
                return f5;
            }
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m17867() {
        C21402 c21402 = this.f22183;
        C4916 c4916 = this.f22196;
        if (c21402 == null || !c21402.f69586.equals(c4916.getTypeface())) {
            this.f22183 = C21402.m47947(c4916.getTypeface());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m17842(int i, int i2) {
        float fAlpha = Color.alpha(i2) / 255.0f;
        float f = 1.0f - fAlpha;
        return Color.rgb((int) ((Color.red(i2) * fAlpha) + (Color.red(i) * f)), (int) ((Color.green(i2) * fAlpha) + (Color.green(i) * f)), (int) ((Color.blue(i2) * fAlpha) + (Color.blue(i) * f)));
    }
}
