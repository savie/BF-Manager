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

/* JADX INFO: renamed from: l.ۚۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AG9 */
/* JADX INFO: loaded from: classes2.dex */
public class C5438 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f18953;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final C19393 f18954;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f18955;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f18956;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f18957;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f18958;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f18959;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f18960;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f18961;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] f18962;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f18963;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f18964;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C16624 f18965;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f18966;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C10232 f18967;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f18968;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f18969;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final char[] f18970;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f18971;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f18972;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f18973;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C15878 f18974;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f18975;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f18976;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC22592 f18977;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f18978;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f18979;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12895 f18980;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f18981;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f18982;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f18983;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f18984;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float[] f18985;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19570 f18986;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Rect f18987;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f18988;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f18989;

    static {
        String[] strArr = new String[128];
        for (char c = 0; c < 128; c = (char) (c + 1)) {
            strArr[c] = String.valueOf(c);
        }
        f18955 = strArr;
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
        f18953 = strArr2;
        char[] cArr = {129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 173, 8192, 8193, 8194, 8195, 8196, 8197, 8198, 8199, 8200, 8201, 8202, 8203, 8204, 8205, 8206, 8207, 8232, 8233, 8234, 8235, 8236, 8237, 8238, 8239, 8287, 8288, 8289, 8290, 8291, 8292, 8294, 8295, 8296, 8297, 8298, 8299, 8300, 8301, 8302, 8303, 65279};
        String[] strArr3 = {"HOP", "BPH", "NBH", "IND", "NEL", "SSA", "ESA", "HTS", "HTJ", "VTS", "PLD", "PLU", "RI", "SS2", "SS3", "DCS", "PU1", "PU2", "STS", "CCH", "MW", "SPA", "EPA", "SOS", "SGCI", "SCI", "CSI", "ST", "OSC", "PM", "APC", "NBSP", "SHY", "NQSP", "MQSP", "ENSP", "EMSP", "3/MSP", "4/MSP", "6/MSP", "FSP", "PSP", "THSP", "HSP", "ZWSP", "ZWNJ", "ZWJ", "LRM", "RLM", "LSEP", "PSEP", "LRE", "RLE", "PDF", "LRO", "RLO", "NNBSP", "MMSP", "WJ", "f()", "x", ",", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "LRI", "RLI", "FSI", "PDI", "ISS", "ASS", "IAFS", "AAFS", "NADS", "NODS", "ZWNBSP"};
        C19393 c19393 = new C19393(74);
        for (int i = 0; i < 74; i++) {
            c19393.mo11584(cArr[i], strArr3[i]);
        }
        f18954 = c19393;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16200(C12895 c12895) {
        this.f18980 = c12895;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12895 m16226() {
        return this.f18980;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float m16175(int i, int i2, CharSequence charSequence) {
        float fMeasureText;
        int iMax = Math.max(i, this.f18980.m31937());
        int iMin = Math.min(i2, this.f18980.m31936());
        int iMax2 = Math.max(0, iMin - iMax);
        float fM16186 = ((i2 - i) - iMax2) * m16186((char) 8226);
        if (iMax2 == 0) {
            fMeasureText = 0.0f;
        } else {
            fMeasureText = this.f18967.measureText(charSequence.subSequence(iMax, iMin).toString());
        }
        return fM16186 + fMeasureText;
    }

    public C5438(Context context) {
        this.f18975 = 1.0f;
        this.f18974 = new C15878();
        this.f18986 = C15094.m36353(new C24046());
        this.f18984 = true;
        this.f18973 = false;
        this.f18963 = false;
        this.f18983 = false;
        this.f18968 = 4;
        this.f18956 = false;
        this.f18966 = true;
        this.f18960 = false;
        this.f18985 = new float[128];
        this.f18962 = new float[128];
        this.f18987 = new Rect();
        this.f18970 = new char[256];
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f18976 = displayMetrics.density;
        this.f18979 = displayMetrics.scaledDensity;
        C10232 c10232 = new C10232(0);
        this.f18967 = c10232;
        c10232.setTextAlign(Paint.Align.LEFT);
        c10232.setStyle(Paint.Style.FILL);
        c10232.setTypeface(Typeface.DEFAULT);
        m16225();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5438 m16219() {
        return new C5438(this);
    }

    public C5438(C5438 c5438) {
        this.f18975 = 1.0f;
        this.f18974 = new C15878();
        this.f18986 = C15094.m36353(new C24046());
        this.f18984 = true;
        this.f18973 = false;
        this.f18963 = false;
        this.f18983 = false;
        this.f18968 = 4;
        this.f18956 = false;
        this.f18966 = true;
        this.f18960 = false;
        float[] fArr = new float[128];
        this.f18985 = fArr;
        float[] fArr2 = new float[128];
        this.f18962 = fArr2;
        this.f18987 = new Rect();
        this.f18970 = new char[256];
        this.f18980 = c5438.f18980;
        this.f18976 = c5438.f18976;
        this.f18979 = c5438.f18979;
        this.f18967 = new C10232(c5438.f18967);
        this.f18959 = c5438.f18959;
        this.f18989 = c5438.f18989;
        this.f18978 = c5438.f18978;
        this.f18971 = c5438.f18971;
        this.f18975 = c5438.f18975;
        this.f18961 = c5438.f18961;
        this.f18988 = c5438.f18988;
        this.f18982 = c5438.f18982;
        this.f18958 = c5438.f18958;
        this.f18981 = c5438.f18981;
        this.f18957 = c5438.f18957;
        this.f18973 = c5438.f18973;
        this.f18963 = c5438.f18963;
        this.f18983 = c5438.f18983;
        this.f18968 = c5438.f18968;
        this.f18964 = c5438.f18964;
        this.f18972 = c5438.f18972;
        this.f18956 = c5438.f18956;
        this.f18966 = c5438.f18966;
        this.f18969 = c5438.f18969;
        System.arraycopy(c5438.f18985, 0, fArr, 0, 128);
        System.arraycopy(c5438.f18962, 0, fArr2, 0, 128);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float m16215() {
        return this.f18971;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m16189() {
        return this.f18961;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m16203() {
        return this.f18988;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m16208() {
        return this.f18975;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo16197(float f) {
        if (f < 0.8f || f > 2.0f) {
            throw new IllegalArgumentException("Line spacing must be between 0.8 and 2.0");
        }
        this.f18975 = f;
        m16184(this.f18967.getFontMetrics());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16184(Paint.FontMetrics fontMetrics) {
        float fontSpacing = this.f18967.getFontSpacing() * this.f18975;
        this.f18961 = fontSpacing;
        Math.ceil(fontSpacing);
        float f = fontMetrics.ascent;
        this.f18988 = ((this.f18961 - (fontMetrics.descent - f)) / 2.0f) + (-f);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m16211() {
        return this.f18989;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m16210() {
        return this.f18978;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float m16222() {
        return this.f18982;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float m16213() {
        return this.f18981;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m16212() {
        return this.f18959;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16220(int i) {
        this.f18959 = i;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m16190() {
        return this.f18973;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16201(boolean z) {
        this.f18973 = z;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m16216() {
        return this.f18983;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16221(boolean z) {
        this.f18983 = z;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m16214() {
        return this.f18968;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16198(int i) {
        this.f18968 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m16209() {
        return this.f18956;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m16207(boolean z) {
        this.f18956 = z;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m16204() {
        return this.f18966;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m16223(boolean z) {
        this.f18966 = z;
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
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m16224() {
        float[] fArr;
        C10232 c10232 = this.f18967;
        Paint.FontMetrics fontMetrics = c10232.getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        this.f18989 = f;
        this.f18978 = (int) Math.ceil(f);
        this.f18969 = (int) Math.ceil(this.f18989 / 25.0f);
        this.f18982 = c10232.measureText("我");
        this.f18958 = c10232.measureText("�");
        this.f18971 = -fontMetrics.top;
        m16184(fontMetrics);
        m16185();
        int i = 0;
        while (true) {
            fArr = this.f18985;
            if (i >= 128) {
                break;
            }
            String str = f18955[i];
            String str2 = f18953[i];
            boolean zEquals = str.equals(str2);
            float[] fArr2 = this.f18962;
            if (zEquals) {
                float fMeasureText = c10232.measureText(str);
                fArr2[i] = fMeasureText;
                fArr[i] = fMeasureText;
            } else {
                fArr[i] = c10232.measureText(str);
                fArr2[i] = c10232.measureText(str2) + (this.f18969 * 2);
            }
            i++;
        }
        m16174();
        this.f18963 = fArr[105] == fArr[119] && fArr[46] == fArr[109];
        int iMeasureText = (int) (c10232.measureText("Z") + 1.0f);
        int i2 = (int) (this.f18989 + 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMeasureText, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        c10232.setColor(-16777216);
        canvas.drawText("Z", 0.0f, this.f18971, c10232);
        int[] iArr = new int[i2];
        bitmapCreateBitmap.getPixels(iArr, 0, 1, iMeasureText / 2, 0, 1, i2);
        bitmapCreateBitmap.recycle();
        this.f18964 = 0.0f;
        this.f18972 = this.f18989;
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != -1) {
                this.f18964 = i3;
                break;
            }
        }
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (iArr[i4] != -1) {
                this.f18972 = i4;
                break;
            }
        }
        this.f18974.m37850();
        this.f18986.clear();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m16206() {
        if (this.f18984) {
            this.f18984 = false;
            m16185();
            m16174();
            this.f18974.m37850();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m16185() {
        C10232 c10232 = this.f18967;
        float fMeasureText = c10232.measureText(" ");
        float fMeasureText2 = this.f18984 ? c10232.measureText("n") : fMeasureText;
        if (fMeasureText < fMeasureText2) {
            fMeasureText = C19967.m45884(fMeasureText2, fMeasureText, 0.62f, fMeasureText);
        }
        this.f18981 = (float) Math.ceil(fMeasureText);
        this.f18957 = (float) Math.ceil(fMeasureText / 2.0f);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m16174() {
        float f = this.f18981;
        float[] fArr = this.f18985;
        fArr[0] = f / 50.0f;
        fArr[32] = f;
        fArr[10] = f;
        fArr[13] = f;
        float[] fArr2 = this.f18962;
        fArr2[32] = f;
        fArr2[10] = f;
        fArr2[13] = f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m16195(CharSequence charSequence, int i, int i2, float f, float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid maximum text width");
        }
        if (this.f18980 != null && i >= 0) {
            return Math.min(m16175(i, i2, charSequence), f2);
        }
        return m16187(charSequence, i, i2, f, f2);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m16205(CharSequence charSequence, int i, int i2, float f) {
        if (this.f18980 != null && i >= 0) {
            return Math.min(m16175(i, i2, charSequence), Float.POSITIVE_INFINITY);
        }
        return m16187(charSequence, i, i2, f, Float.POSITIVE_INFINITY);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m16218(CharSequence charSequence, int i, int i2, float f) {
        return m16187(charSequence, i, i2, f, Float.POSITIVE_INFINITY);
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:97:0x016c A[PHI: r7
      0x016c: PHI (r7v29 java.lang.String) = (r7v25 java.lang.String), (r7v28 java.lang.String), (r7v37 java.lang.String) binds: [B:96:0x016a, B:90:0x0157, B:85:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x0116. Please report as an issue. */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private float m16187(CharSequence charSequence, int i, int i2, float f, float f2) {
        C10232 c10232;
        C15878 c15878;
        boolean z;
        boolean z2;
        char c;
        char c2;
        C15132 c15132;
        int i3;
        boolean z3;
        float fM16186;
        float fFloatValue;
        int iM6073;
        String str;
        Float fM37849;
        float fFloatValue2;
        int i4;
        int i5;
        String string;
        Float fM378410;
        if (i < 0) {
            return 0.0f;
        }
        boolean z4 = this.f18956;
        float[] fArr = this.f18985;
        float[] fArr2 = z4 ? this.f18962 : fArr;
        boolean z5 = this.f18966;
        C15132 c15133 = (f2 == Float.POSITIVE_INFINITY && (charSequence instanceof C15132)) ? (C15132) charSequence : null;
        int i6 = i;
        int i7 = i6;
        float fFloatValue3 = 0.0f;
        boolean z6 = false;
        while (true) {
            c10232 = this.f18967;
            c15878 = this.f18974;
            if (i6 >= i2 || fFloatValue3 >= f2) {
                z = z6;
                i6 = i7;
                z2 = z;
            } else {
                if (z6) {
                    int iM6074 = C1709.m6073(i6, i2, charSequence);
                    c2 = 0;
                    boolean z7 = z6;
                    if (iM6074 - i6 == 1) {
                        char cCharAt = charSequence.charAt(i6);
                        byte bM2252 = C0435.m2252(cCharAt);
                        i5 = iM6074;
                        if (bM2252 == 15) {
                            if (C9383.m24706(cCharAt)) {
                                string = charSequence.subSequence(i7, i6).toString();
                                fM378410 = c15878.m37849(string);
                                if (fM378410 == null) {
                                    fM378410 = Float.valueOf(c10232.measureText(string));
                                    c15878.m37851(string, fM378410);
                                }
                                fFloatValue3 += fM378410.floatValue();
                                if (fFloatValue3 >= f2) {
                                    z2 = false;
                                } else {
                                    i7 = i6;
                                    z6 = false;
                                    c = 1;
                                }
                            }
                        } else if (bM2252 != 8 || z5) {
                            string = charSequence.subSequence(i7, i6).toString();
                            fM378410 = c15878.m37849(string);
                            if (fM378410 == null) {
                                fM378410 = Float.valueOf(c10232.measureText(string));
                                c15878.m37851(string, fM378410);
                            }
                            fFloatValue3 += fM378410.floatValue();
                            if (fFloatValue3 >= f2) {
                                z2 = false;
                            } else {
                                i7 = i6;
                                z6 = false;
                                c = 1;
                            }
                        }
                    } else {
                        i5 = iM6074;
                    }
                    z6 = z7;
                    i6 = i5;
                } else {
                    c = 1;
                    c2 = 0;
                }
                if (c15133 != null) {
                    c15133.m36411(i6);
                    char[] cArr = c15133.f49369;
                    i3 = i7;
                    int iMin = Math.min(i2, c15133.f49367);
                    int i8 = i6 - c15133.f49368;
                    while (true) {
                        if (i6 < iMin) {
                            c15132 = c15133;
                            char c3 = cArr[i8];
                            z3 = z6;
                            if (c3 <= 127 && c3 != '\t') {
                                int i9 = C19080.f61794;
                                if ((('0' <= c3 && c3 <= '9') || c3 == '#' || c3 == '*') && (i4 = i6 + 1) < i2) {
                                    if (i4 == iMin || cArr[i8 + 1] > 127) {
                                    }
                                }
                                fFloatValue3 += fArr2[c3];
                                i8++;
                                i6++;
                                c15133 = c15132;
                                z6 = z3;
                                cArr = cArr;
                            }
                        } else {
                            c15132 = c15133;
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
                        c15133 = c15132;
                    }
                } else {
                    c15132 = c15133;
                    i3 = i7;
                    z3 = z6;
                }
                char cCharAt2 = charSequence.charAt(i6);
                byte bM2253 = C0435.m2252(cCharAt2);
                C19393 c19393 = f18954;
                switch (bM2253) {
                    case 0:
                        fM16186 = this.f18982;
                        fFloatValue3 += fM16186;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 1:
                        fM16186 = this.f18981;
                        fFloatValue3 += fM16186;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 2:
                        float f3 = f + fFloatValue3;
                        float f4 = this.f18981;
                        float f5 = this.f18968 * f4;
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
                            Float fM378411 = c15878.m37849(str2);
                            if (fM378411 == null) {
                                fM378411 = Float.valueOf(c10232.measureText(str2));
                                c15878.m37851(str2, fM378411);
                            }
                            fFloatValue = fM378411.floatValue() + fFloatValue3;
                            i6 += 3;
                        } else if (i10 >= 2 && charSequence.charAt(i6 + 1) == 8419) {
                            char[] cArr3 = new char[2];
                            cArr3[c2] = cCharAt2;
                            cArr3[c] = 8419;
                            String str3 = new String(cArr3);
                            Float fM378412 = c15878.m37849(str3);
                            if (fM378412 == null) {
                                fM378412 = Float.valueOf(c10232.measureText(str3));
                                c15878.m37851(str3, fM378412);
                            }
                            fFloatValue = fM378412.floatValue() + fFloatValue3;
                            i6 += 2;
                        } else {
                            fM16186 = fArr2[cCharAt2];
                            fFloatValue3 += fM16186;
                            i6++;
                            i7 = i3;
                            z6 = z3;
                        }
                        i7 = i3;
                        fFloatValue3 = fFloatValue;
                        z6 = z3;
                        break;
                    case 4:
                        fM16186 = fArr2[cCharAt2];
                        fFloatValue3 += fM16186;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 5:
                        fM16186 = this.f18958;
                        fFloatValue3 += fM16186;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 6:
                        fM16186 = fArr[c2];
                        fFloatValue3 += fM16186;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 7:
                        fM16186 = m16186(cCharAt2);
                        fFloatValue3 += fM16186;
                        i6++;
                        i7 = i3;
                        z6 = z3;
                        break;
                    case 8:
                        if (!z5) {
                            iM6073 = C1709.m6073(i6, i2, charSequence);
                            i7 = i6;
                            z6 = true;
                            i6 = iM6073;
                        } else {
                            str = (String) c19393.mo19863(cCharAt2);
                            fM37849 = c15878.m37849(str);
                            if (fM37849 == null) {
                                fM37849 = Float.valueOf(c10232.measureText(str));
                                c15878.m37851(str, fM37849);
                            }
                            fFloatValue2 = fM37849.floatValue() + (this.f18969 * 2);
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
                            str = (String) c19393.mo19863(cCharAt2);
                            fM37849 = c15878.m37849(str);
                            if (fM37849 == null) {
                                fM37849 = Float.valueOf(c10232.measureText(str));
                                c15878.m37851(str, fM37849);
                            }
                            fFloatValue2 = fM37849.floatValue() + (this.f18969 * 2);
                        }
                        fFloatValue = fFloatValue2 + fFloatValue3;
                        i6++;
                        i7 = i3;
                        fFloatValue3 = fFloatValue;
                        z6 = z3;
                        break;
                    case 10:
                        if (!z5) {
                            fFloatValue2 = this.f18981;
                        } else {
                            str = (String) c19393.mo19863(cCharAt2);
                            fM37849 = c15878.m37849(str);
                            if (fM37849 == null) {
                                fM37849 = Float.valueOf(c10232.measureText(str));
                                c15878.m37851(str, fM37849);
                            }
                            fFloatValue2 = fM37849.floatValue() + (this.f18969 * 2);
                        }
                        fFloatValue = fFloatValue2 + fFloatValue3;
                        i6++;
                        i7 = i3;
                        fFloatValue3 = fFloatValue;
                        z6 = z3;
                        break;
                    default:
                        if (C9383.m24706(cCharAt2)) {
                            if (i6 > 0 && C9383.m24706(charSequence.charAt(i6 - 1))) {
                                if (C9383.m24705(cCharAt2)) {
                                    fM16186 = m16186(cCharAt2);
                                } else {
                                    fM16186 = this.f18957;
                                }
                                fFloatValue3 += fM16186;
                            }
                            i6++;
                            i7 = i3;
                            z6 = z3;
                        } else {
                            iM6073 = C1709.m6073(i6, i2, charSequence);
                            i7 = i6;
                            z6 = true;
                            i6 = iM6073;
                        }
                        break;
                }
                c15133 = c15132;
            }
        }
        if (z2) {
            String string2 = charSequence.subSequence(i6, i2).toString();
            Float fM378413 = c15878.m37849(string2);
            if (fM378413 == null) {
                fM378413 = Float.valueOf(c10232.measureText(string2));
                c15878.m37851(string2, fM378413);
            }
            fFloatValue3 += fM378413.floatValue();
        }
        return Math.min(fFloatValue3, f2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19608 m16196(CharSequence charSequence, int i, int i2, float f, C0568 c0568) {
        if (i < 0 || i2 < i || i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        return new C19608(this, charSequence, i, i2, f, c0568);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private float m16186(char c) {
        C19570 c19570 = this.f18986;
        float fM45161 = c19570.m45161(c);
        if (fM45161 != -1.0f) {
            return fM45161;
        }
        float fMeasureText = this.f18967.measureText(String.valueOf(c));
        c19570.mo9814(fMeasureText, c);
        return fMeasureText;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m16191(char c) {
        return (this.f18956 ? this.f18962 : this.f18985)[c];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] m16202() {
        return this.f18956 ? this.f18962 : this.f18985;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0057 A[PHI: r12
      0x0057: PHI (r12v23 java.lang.String) = (r12v19 java.lang.String), (r12v22 java.lang.String), (r12v28 java.lang.String) binds: [B:25:0x0055, B:19:0x0043, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m16194(CharSequence charSequence, int i, int i2, float f) {
        String str;
        Float fM37849;
        boolean z = this.f18956;
        float[] fArr = this.f18985;
        float[] fArr2 = z ? this.f18962 : fArr;
        boolean z2 = this.f18966;
        int i3 = i2 - i;
        C15878 c15878 = this.f18974;
        if (i3 == 1) {
            char cCharAt = charSequence.charAt(i);
            byte bM2252 = C0435.m2252(cCharAt);
            C10232 c10232 = this.f18967;
            C19393 c19393 = f18954;
            switch (bM2252) {
                case 0:
                    return this.f18982;
                case 1:
                    return this.f18981;
                case 2:
                    return m16205(charSequence, i, i2, f);
                case 3:
                case 4:
                    return fArr2[cCharAt];
                case 5:
                    return this.f18958;
                case 6:
                    return fArr[0];
                case 7:
                    return m16186(cCharAt);
                case 8:
                    if (z2) {
                        str = (String) c19393.mo19863(cCharAt);
                        fM37849 = c15878.m37849(str);
                        if (fM37849 == null) {
                            fM37849 = Float.valueOf(c10232.measureText(str));
                            c15878.m37851(str, fM37849);
                        }
                        return fM37849.floatValue() + (this.f18969 * 2);
                    }
                    if (C9383.m24706(cCharAt)) {
                        if (i > 0 && C9383.m24706(charSequence.charAt(i - 1))) {
                            if (C9383.m24705(cCharAt)) {
                                return m16186(cCharAt);
                            }
                            return this.f18957;
                        }
                    } else if (cCharAt != 8205) {
                        return m16186(cCharAt);
                    }
                    return 0.0f;
                case 9:
                    if (!z2) {
                        return fArr[0];
                    }
                    str = (String) c19393.mo19863(cCharAt);
                    fM37849 = c15878.m37849(str);
                    if (fM37849 == null) {
                        fM37849 = Float.valueOf(c10232.measureText(str));
                        c15878.m37851(str, fM37849);
                    }
                    return fM37849.floatValue() + (this.f18969 * 2);
                case 10:
                    if (!z2) {
                        return this.f18981;
                    }
                    str = (String) c19393.mo19863(cCharAt);
                    fM37849 = c15878.m37849(str);
                    if (fM37849 == null) {
                        fM37849 = Float.valueOf(c10232.measureText(str));
                        c15878.m37851(str, fM37849);
                    }
                    return fM37849.floatValue() + (this.f18969 * 2);
                default:
                    if (C9383.m24706(cCharAt)) {
                        if (i > 0) {
                            if (C9383.m24705(cCharAt)) {
                                return m16186(cCharAt);
                            }
                            return this.f18957;
                        }
                    } else if (cCharAt != 8205) {
                        return m16186(cCharAt);
                    }
                    return 0.0f;
            }
        }
        String string = charSequence.subSequence(i, i2).toString();
        Float fM378410 = c15878.m37849(string);
        if (fM378410 == null) {
            fM378410 = Float.valueOf(m16205(string, 0, string.length(), 0.0f));
            c15878.m37851(string, fM378410);
        }
        return fM378410.floatValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m16193(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z, C4275 c4275) {
        InterfaceC22592 interfaceC22592 = this.f18977;
        this.f18977 = c4275;
        try {
            return m16217(canvas, charSequence, i, i2, f, f2, i3, i4, f3, paint, i5, z);
        } finally {
            this.f18977 = interfaceC22592;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16182(final Canvas canvas, final CharSequence charSequence, final int i, final int i2, final float f, final float f2, final Paint paint) {
        if (this.f18977 == null) {
            canvas.drawText(charSequence, i, i2, f, f2, paint);
            return;
        }
        boolean z = charSequence instanceof String;
        Rect rect = this.f18987;
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
        m16179(canvas, f, f2, paint, new Runnable() { // from class: l.ۙۚܺ
            @Override // java.lang.Runnable
            public final void run() {
                canvas.drawText(charSequence, i, i2, f, f2, paint);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16183(final Canvas canvas, final char[] cArr, final int i, final float f, final float f2, final Paint paint) {
        if (this.f18977 == null) {
            canvas.drawText(cArr, 0, i, f, f2, paint);
        } else {
            paint.getTextBounds(cArr, 0, i, this.f18987);
            m16179(canvas, f, f2, paint, new Runnable() { // from class: l.۬۫ܺ
                @Override // java.lang.Runnable
                public final void run() {
                    canvas.drawText(cArr, 0, i, f, f2, paint);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16179(Canvas canvas, float f, float f2, Paint paint, Runnable runnable) {
        Rect rect = this.f18987;
        if (rect.isEmpty()) {
            runnable.run();
        } else if (this.f18977.mo13628(canvas, paint, f + rect.left, f2 + rect.top, f + rect.right, f2 + rect.bottom, runnable)) {
            this.f18977 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16181(final Canvas canvas, final Paint paint, final float f, final float f2, final float f3, final float f4) {
        InterfaceC22592 interfaceC22592 = this.f18977;
        if (interfaceC22592 == null) {
            canvas.drawRect(f, f2, f3, f4, paint);
        } else if (interfaceC22592.mo13628(canvas, paint, f, f2, f3, f4, new Runnable() { // from class: l.᩷ۚܺ
            @Override // java.lang.Runnable
            public final void run() {
                canvas.drawRect(f, f2, f3, f4, paint);
            }
        })) {
            this.f18977 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16180(Canvas canvas, int i, float f, float f2, int i2, int i3, Paint paint, float f3) {
        if (f3 <= 0.0f) {
            return;
        }
        int iMin = Math.min(i, ((int) Math.ceil((i3 - f) / f3)) + 1);
        for (int iMax = Math.max(0, (int) Math.floor((i2 - f) / f3)); iMax < iMin; iMax++) {
            canvas.drawText("•", (iMax * f3) + f, f2, paint);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16199(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, C10232 c10232) {
        m16217(canvas, charSequence, i, i2, 0.0f, f, i3, i4, 0.0f, c10232, 0, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m16217(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z) {
        C12895 c12895 = this.f18980;
        if (c12895 != null) {
            int iMax = Math.max(i, Math.min(i2, c12895.m31937()));
            int iMax2 = Math.max(iMax, Math.min(i2, this.f18980.m31936()));
            float fM16186 = m16186((char) 8226);
            int i6 = iMax - i;
            m16180(canvas, i6, f, f2, i3, i4, paint, fM16186);
            float f4 = (i6 * fM16186) + f;
            if (iMax2 > iMax) {
                String string = charSequence.subSequence(iMax, iMax2).toString();
                float fMeasureText = this.f18967.measureText(string);
                if (f4 <= i4 && f4 + fMeasureText >= i3) {
                    canvas.drawText(string, f4, f2, paint);
                }
                f4 += fMeasureText;
            }
            int i7 = i2 - iMax2;
            m16180(canvas, i7, f4, f2, i3, i4, paint, fM16186);
            return (i7 * fM16186) + (f4 - f);
        }
        return m16192(canvas, charSequence, i, i2, f, f2, i3, i4, f3, paint, i5, z);
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
    public final float m16192(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z) {
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
        C16624 c16624;
        int i8;
        char c;
        C16624 c16625;
        int i9;
        boolean z4;
        float f7;
        char cCharAt;
        boolean z5;
        int i10;
        C16624 c16626;
        char c2;
        float fMeasureText3;
        int i11;
        boolean z6;
        float f8;
        int i12;
        int iM6073;
        float f9;
        C16624 c16627;
        float f10;
        C16624 c16628;
        float f11;
        int i13;
        C16624 c16629;
        boolean z7;
        int i14;
        boolean zM24706;
        canvas = canvas;
        CharSequence charSequence3 = charSequence;
        paint = paint;
        boolean z8 = this.f18960;
        boolean z9 = this.f18956;
        String[] strArr = z9 ? f18953 : f18955;
        float[] fArr = this.f18985;
        float[] fArr2 = z9 ? this.f18962 : fArr;
        boolean z10 = this.f18966;
        boolean z11 = (i5 & 1) != 0;
        boolean z12 = (i5 & 2) != 0;
        boolean z13 = (i5 & 4) != 0;
        boolean z14 = (i5 & 8) != 0;
        boolean z15 = (z || !(z13 || z14)) ? z : true;
        if (z11) {
            paint.setFakeBoldText(true);
        }
        final InterfaceC22592 interfaceC22592 = this.f18977;
        if (z12) {
            int iSave = canvas.save();
            float f12 = this.f18989 / 2.0f;
            canvas.translate(0.0f, (f2 - this.f18971) + f12);
            float f13 = this.f18971 - f12;
            canvas.skew(-0.2f, 0.0f);
            if (interfaceC22592 != null) {
                final float f14 = (f2 - this.f18971) + f12;
                this.f18977 = new InterfaceC22592() { // from class: l.ۜ۫ܺ
                    @Override // l.InterfaceC22592
                    /* JADX INFO: renamed from: ۙ */
                    public final boolean mo13628(final Canvas canvas2, Paint paint2, float f15, float f16, float f17, float f18, final Runnable runnable) {
                        final float f19 = f14;
                        InterfaceC22592 interfaceC22593 = interfaceC22592;
                        int iSave2 = canvas2.save();
                        try {
                            canvas2.skew(0.2f, 0.0f);
                            canvas2.translate(0.0f, -f19);
                            return interfaceC22593.mo13628(canvas2, paint2, f15 - (f18 * 0.2f), f16 + f19, f17 - (f16 * 0.2f), f18 + f19, new Runnable() { // from class: l.ۤۚܺ
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
        C16624 c166210 = this.f18965;
        int i15 = i;
        int iM6074 = i15;
        float f15 = f;
        boolean z16 = false;
        boolean z17 = false;
        while (true) {
            boolean z18 = false;
            while (true) {
                if (iM6074 < i2) {
                    if (z8) {
                        int iM6075 = C1709.m6073(iM6074, i2, charSequence3);
                        c16624 = c166210;
                        i6 = i6;
                        if (iM6075 - iM6074 == 1) {
                            char cCharAt2 = charSequence3.charAt(iM6074);
                            byte bM2252 = C0435.m2252(cCharAt2);
                            interfaceC22592 = interfaceC22592;
                            if (bM2252 == 15) {
                                zM24706 = C9383.m24706(cCharAt2);
                                if (!zM24706) {
                                    interfaceC22592 = interfaceC22592;
                                }
                                if (zM24706) {
                                    if (cCharAt2 >= 768 || cCharAt2 > 1023) {
                                        zM24706 = false;
                                    } else {
                                        zM24706 = true;
                                    }
                                }
                                float fMeasureText4 = paint.measureText(charSequence3, i15, iM6074);
                                if (!z16 || f15 + fMeasureText4 < i3) {
                                    z2 = z16;
                                } else {
                                    z2 = true;
                                }
                                if (zM24706) {
                                    iM6074++;
                                }
                                i7 = iM6074;
                                if (z2) {
                                    c = 0;
                                    f5 = 0.0f;
                                    c16624 = c16624;
                                    m16182(canvas, charSequence, i15, i7, f15, f4, paint);
                                } else {
                                    c16624 = c16624;
                                    c = 0;
                                    f5 = 0.0f;
                                }
                                f15 += fMeasureText4;
                                z7 = this.f18960;
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
                            } else if (bM2252 != 8 || z10) {
                                zM24706 = false;
                                if (zM24706) {
                                    if (cCharAt2 >= 768) {
                                        zM24706 = false;
                                    } else {
                                        zM24706 = false;
                                    }
                                }
                                float fMeasureText5 = paint.measureText(charSequence3, i15, iM6074);
                                if (z16) {
                                    z2 = z16;
                                } else {
                                    z2 = z16;
                                }
                                if (zM24706) {
                                    iM6074++;
                                }
                                i7 = iM6074;
                                if (z2) {
                                    c = 0;
                                    f5 = 0.0f;
                                    c16624 = c16624;
                                    m16182(canvas, charSequence, i15, i7, f15, f4, paint);
                                } else {
                                    c16624 = c16624;
                                    c = 0;
                                    f5 = 0.0f;
                                }
                                f15 += fMeasureText5;
                                z7 = this.f18960;
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
                                interfaceC22592 = interfaceC22592;
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
                                    m16182(canvas, charSequence, i7, i2, f15, f4, paint);
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
                            this.f18977 = interfaceC22592;
                            f6 = this.f18976;
                            if (z13) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    underlinePosition = paint.getUnderlinePosition();
                                    textSize2 = paint.getUnderlineThickness();
                                } else {
                                    underlinePosition = (this.f18989 * 0.85f) - this.f18971;
                                    textSize2 = paint.getTextSize() * 0.019f * f6;
                                }
                                float f16 = underlinePosition + f4;
                                m16181(canvas, paint, (int) f, f16, (int) (f15 + 1.0f), f16 + textSize2);
                            }
                            if (z14) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    strikeThruPosition = paint.getStrikeThruPosition();
                                    textSize = paint.getStrikeThruThickness();
                                } else {
                                    strikeThruPosition = (this.f18989 * 0.551f) - this.f18971;
                                    textSize = paint.getTextSize() * 0.021f * f6;
                                }
                                float f17 = f4 + strikeThruPosition;
                                m16181(canvas, paint, (int) f, f17, (int) (f15 + 1.0f), f17 + textSize);
                            }
                            if (z15) {
                                return f15 - f;
                            }
                            return f5;
                        }
                        interfaceC22592 = interfaceC22592;
                        i15 = i15;
                        iM6074 = iM6075;
                        c166210 = c16624;
                        z10 = z10;
                        i6 = i6;
                        interfaceC22592 = interfaceC22592;
                        fArr = fArr;
                        canvas = canvas;
                    } else {
                        c16624 = c166210;
                        i6 = i6;
                        interfaceC22592 = interfaceC22592;
                        z10 = z10;
                        fArr = fArr;
                        i8 = i15;
                        c = 0;
                        f5 = 0.0f;
                        i7 = iM6074;
                    }
                    char cCharAt3 = charSequence3.charAt(i7);
                    if (!z17) {
                        cCharAt3 = cCharAt3;
                        z18 = z18;
                        f15 = f15;
                        z17 = z17;
                        i15 = i8;
                    } else {
                        if (!C0435.m2253(cCharAt3)) {
                            float fMeasureText6 = paint.measureText(charSequence3, i8, i7);
                            z2 = (z16 || f15 + fMeasureText6 < ((float) i3)) ? z16 : true;
                            if (z2) {
                                m16182(canvas, charSequence, i8, i7, f15, f4, paint);
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
                                    m16182(canvas, charSequence, i7, i2, f15, f4, paint);
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
                                    m16182(canvas, charSequence, i7, i2, f15, f4, paint);
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
                            this.f18977 = interfaceC22592;
                            f6 = this.f18976;
                            if (z13) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    underlinePosition = paint.getUnderlinePosition();
                                    textSize2 = paint.getUnderlineThickness();
                                } else {
                                    underlinePosition = (this.f18989 * 0.85f) - this.f18971;
                                    textSize2 = paint.getTextSize() * 0.019f * f6;
                                }
                                float f18 = underlinePosition + f4;
                                m16181(canvas, paint, (int) f, f18, (int) (f15 + 1.0f), f18 + textSize2);
                            }
                            if (z14) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    strikeThruPosition = paint.getStrikeThruPosition();
                                    textSize = paint.getStrikeThruThickness();
                                } else {
                                    strikeThruPosition = (this.f18989 * 0.551f) - this.f18971;
                                    textSize = paint.getTextSize() * 0.021f * f6;
                                }
                                float f19 = f4 + strikeThruPosition;
                                m16181(canvas, paint, (int) f, f19, (int) (f15 + 1.0f), f19 + textSize);
                            }
                            if (z15) {
                                return f15 - f;
                            }
                            return f5;
                        }
                        i15 = i8;
                        iM6074 = i7 + 1;
                        c166210 = c16624;
                        z10 = z10;
                        i6 = i6;
                        interfaceC22592 = interfaceC22592;
                        fArr = fArr;
                        canvas = canvas;
                    }
                    byte bM2253 = C0435.m2252(cCharAt3);
                    C10232 c10232 = this.f18967;
                    C19393 c19393 = f18954;
                    C15878 c15878 = this.f18974;
                    char[] cArr = this.f18970;
                    switch (bM2253) {
                        case 0:
                            char c3 = cCharAt3;
                            c16629 = c16624;
                            charSequence2 = charSequence3;
                            canvas = canvas;
                            boolean z19 = (z16 || f15 + this.f18982 < ((float) i3)) ? z16 : true;
                            if (z19) {
                                cArr[0] = c3;
                                m16183(canvas, cArr, 1, f15, f4, paint);
                            }
                            float f20 = f15 + this.f18982;
                            int i16 = i7 + 1;
                            if (z19 && f20 > i4) {
                                z16 = z19;
                                boolean z20 = z17;
                                f15 = f20;
                                i15 = i15;
                                z17 = z20;
                            } else {
                                f7 = f20;
                                iM6074 = i16;
                                z16 = z19;
                                c166210 = c16629;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas2 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas2;
                            }
                            break;
                        case 1:
                            CharSequence charSequence4 = charSequence3;
                            c16625 = c16624;
                            charSequence2 = charSequence4;
                            boolean z21 = (z16 || f15 + this.f18981 < ((float) i3)) ? z16 : true;
                            if (z21 && this.f18973) {
                                if (this.f18983 && !z18 && (i7 >= charSequence.length() - 1 || (cCharAt = charSequence2.charAt(i7 + 1)) == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n')) {
                                    z18 = true;
                                }
                                if (!this.f18983 || z18) {
                                    float fCeil = (float) Math.ceil((this.f18981 / 2.0f) + f15);
                                    float fCeil2 = (float) Math.ceil((this.f18989 / 2.0f) + (f4 - this.f18971));
                                    float f21 = this.f18989 * 0.042f;
                                    int color = paint.getColor();
                                    paint.setColor((this.f18959 & 16777215) | (C3296.m10871(100, 50) << 24));
                                    canvas = canvas;
                                    canvas.drawCircle(fCeil, fCeil2, f21, paint);
                                    paint.setColor(color);
                                } else {
                                    canvas = canvas;
                                }
                            } else {
                                canvas = canvas;
                            }
                            float f22 = f15 + this.f18981;
                            i9 = i7 + 1;
                            if (z21 && f22 > i4) {
                                z2 = z21;
                                i7 = i15;
                                z3 = z17;
                                f15 = f22;
                            } else {
                                z4 = z21;
                                f7 = f22;
                                iM6074 = i9;
                                z16 = z4;
                                c166210 = c16625;
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
                            C16624 c166211 = c16624;
                            charSequence2 = charSequence5;
                            float f23 = (f3 + f15) - f;
                            float f24 = this.f18981;
                            float f25 = this.f18968 * f24;
                            float f26 = ((((int) (f23 / f25)) + 1) * f25) - f23;
                            if (f26 < f24) {
                                f26 += f25;
                            }
                            float f27 = f26;
                            z4 = (z16 || f15 + f27 < ((float) i3)) ? z16 : true;
                            if (z4 && this.f18973) {
                                float f28 = f24 * 0.15f;
                                float f29 = f28 + f15;
                                float f30 = (f15 + f27) - f28;
                                float f31 = f4 - this.f18971;
                                float f32 = this.f18989;
                                float f33 = (f32 / 2.0f) + f31;
                                int iMax = Math.max((int) (f32 * 0.02f), 1);
                                int iCeil = (int) Math.ceil(f33 - iMax);
                                int color2 = paint.getColor();
                                paint.setColor((this.f18959 & 16777215) | (C3296.m10871(100, 50) << 24));
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
                                c16625 = c166211;
                                canvas = canvas;
                                iM6074 = i9;
                                z16 = z4;
                                c166210 = c16625;
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
                            c16626 = c16624;
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
                                                int i18 = C16624.f53754;
                                                if ((('a' <= cCharAt4 && cCharAt4 <= 'z') || (('A' <= cCharAt4 && cCharAt4 <= 'Z') || ('0' <= cCharAt4 && cCharAt4 <= '9'))) && c16626.m39327(c4, cCharAt4)) {
                                                    cArr[i11] = cCharAt4;
                                                    fMeasureText3 += fArr2[cCharAt4];
                                                    i11++;
                                                    c4 = cCharAt4;
                                                } else if (C9383.m24708(cCharAt4)) {
                                                    cArr[i11] = cCharAt4;
                                                    i12 = i11 + 1;
                                                }
                                            }
                                            i12 = i11;
                                        }
                                    }
                                    m16183(canvas, cArr, i12, f15, f4, paint);
                                    i11 = i12;
                                    fMeasureText3 = fMeasureText3;
                                }
                                f8 = f15 + fMeasureText3;
                                iM6074 = i11 + i7;
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
                                    c166210 = c16626;
                                    z10 = z10;
                                    i6 = i6;
                                    interfaceC22592 = interfaceC22592;
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
                            } else if (this.f18963 && (c4 == '#' || c4 == '*')) {
                                iM6073 = i7 + 1;
                                z17 = true;
                                c166210 = c16626;
                                charSequence3 = charSequence2;
                                iM6074 = iM6073;
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
                                m16183(canvas, cArr, i12, f15, f4, paint);
                                i11 = i12;
                                fMeasureText3 = fMeasureText3;
                            }
                            f8 = f15 + fMeasureText3;
                            iM6074 = i11 + i7;
                            if (!z6) {
                            }
                            z18 = false;
                            z16 = z6;
                            c166210 = c16626;
                            z10 = z10;
                            i6 = i6;
                            interfaceC22592 = interfaceC22592;
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
                            C16624 c166212 = c16624;
                            charSequence2 = charSequence3;
                            if (this.f18963 && C0435.m2253(c5)) {
                                iM6073 = i7 + 1;
                                c16626 = c166212;
                                paint = paint;
                                z17 = true;
                                c166210 = c16626;
                                charSequence3 = charSequence2;
                                iM6074 = iM6073;
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
                                            int i19 = C16624.f53754;
                                            if (('a' > c5 || c5 > 'z') && (('A' > c5 || c5 > 'Z') && ('0' > c5 || c5 > '9'))) {
                                                c16628 = c166212;
                                                f11 = f9;
                                                i13 = 1;
                                            } else {
                                                int iMin2 = Math.min(cArr.length, i2 - i7);
                                                int i20 = 1;
                                                f11 = f9;
                                                char c6 = c5;
                                                while (true) {
                                                    if (i20 >= iMin2) {
                                                        c16628 = c166212;
                                                    } else {
                                                        char cCharAt5 = charSequence2.charAt(i7 + i20);
                                                        if (('a' > cCharAt5 || cCharAt5 > 'z') && (('A' > cCharAt5 || cCharAt5 > 'Z') && ('0' > cCharAt5 || cCharAt5 > '9'))) {
                                                            c16628 = c166212;
                                                        } else {
                                                            c16628 = c166212;
                                                            if (c16628.m39327(c6, cCharAt5)) {
                                                                cArr[i20] = cCharAt5;
                                                                f11 += fArr2[cCharAt5];
                                                                i20++;
                                                                c6 = cCharAt5;
                                                                c166212 = c16628;
                                                            }
                                                        }
                                                        if (C9383.m24708(cCharAt5)) {
                                                            cArr[i20] = cCharAt5;
                                                            i13 = i20 + 1;
                                                        }
                                                    }
                                                    i13 = i20;
                                                }
                                            }
                                            float f35 = f11;
                                            c16627 = c16628;
                                            m16183(canvas, cArr, i13, f15, f4, paint);
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
                                            c16629 = c16627;
                                            iM6074 = i10;
                                            z16 = z5;
                                            canvas = canvas;
                                            c166210 = c16629;
                                            z17 = z17;
                                            f15 = f7;
                                            Canvas canvas5 = canvas;
                                            charSequence3 = charSequence2;
                                            canvas = canvas5;
                                        }
                                    } else {
                                        int i21 = this.f18969;
                                        float f36 = i21;
                                        float f37 = f15 + f36;
                                        m16182(canvas, str, 0, str.length(), f37, f4, paint);
                                        float f38 = f4 - this.f18971;
                                        int i22 = i21 * 3;
                                        float f39 = i22;
                                        int iCeil2 = (int) Math.ceil((this.f18964 + f38) - f39);
                                        int iCeil3 = (int) Math.ceil(f38 + this.f18972 + f39);
                                        float f40 = f15 + f34;
                                        float f41 = iCeil2 + i21;
                                        float f42 = f15;
                                        f9 = f34;
                                        m16181(canvas, paint, f42, iCeil2, f40, f41);
                                        float f43 = iCeil2 + i22;
                                        m16181(canvas, paint, f42, f41, f37, f43);
                                        float f44 = f40 - f36;
                                        m16181(canvas, paint, f44, f41, f40, f43);
                                        float f45 = iCeil3 - i21;
                                        float f46 = f15;
                                        m16181(canvas, paint, f46, f45, f40, iCeil3);
                                        float f47 = iCeil3 - i22;
                                        m16181(canvas, paint, f46, f45, f37, f47);
                                        m16181(canvas, paint, f44, f45, f40, f47);
                                    }
                                } else {
                                    f9 = f34;
                                }
                                c16627 = c166212;
                                f10 = f9;
                                f7 = f15 + f10;
                                i10 = i7 + 1;
                                if (!z24) {
                                }
                                z5 = z24;
                                paint = paint;
                                c16629 = c16627;
                                iM6074 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c166210 = c16629;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas6 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas6;
                            }
                            break;
                        case 5:
                            c16624 = c16624;
                            charSequence2 = charSequence3;
                            z6 = (z16 || this.f18958 + f15 < ((float) i3)) ? z16 : true;
                            if (z6) {
                                cArr[c] = 65533;
                                m16183(canvas, cArr, 1, f15, f4, paint);
                            }
                            f7 = f15 + this.f18958;
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
                                c16627 = c16624;
                                paint = paint;
                                c16629 = c16627;
                                iM6074 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c166210 = c16629;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas7 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas7;
                            }
                            break;
                        case 6:
                            c16624 = c16624;
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
                                c16627 = c16624;
                                paint = paint;
                                c16629 = c16627;
                                iM6074 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c166210 = c16629;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas8 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas8;
                            }
                            break;
                        case 7:
                            char c7 = cCharAt3;
                            c16624 = c16624;
                            charSequence2 = charSequence3;
                            float fM16186 = m16186(c7);
                            boolean z25 = (z16 || f15 + fM16186 < ((float) i3)) ? z16 : true;
                            if (z25) {
                                cArr[c] = c7;
                                m16183(canvas, cArr, 1, f15, f4, paint);
                            }
                            f7 = f15 + fM16186;
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
                                c16627 = c16624;
                                paint = paint;
                                c16629 = c16627;
                                iM6074 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c166210 = c16629;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas9 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas9;
                            }
                            break;
                        case 8:
                            char c8 = cCharAt3;
                            c16624 = c16624;
                            if (!z10) {
                                iM6073 = C1709.m6073(i7, i2, charSequence);
                                z8 = true;
                                c166210 = c16624;
                                paint = paint;
                                charSequence3 = charSequence;
                                z17 = z17;
                                iM6074 = iM6073;
                                i15 = i7;
                            } else {
                                String str2 = (String) c19393.mo19863(c8);
                                Float fM37849 = c15878.m37849(str2);
                                if (fM37849 == null) {
                                    fM37849 = Float.valueOf(paint.measureText(str2));
                                    c15878.m37851(str2, fM37849);
                                }
                                float fFloatValue = fM37849.floatValue() + (this.f18969 * 2);
                                boolean z26 = (z16 || f15 + fFloatValue < ((float) i3)) ? z16 : true;
                                if (z26) {
                                    int i23 = this.f18969;
                                    float f48 = i23;
                                    float f49 = f15 + f48;
                                    m16182(canvas, str2, 0, str2.length(), f49, f4, paint);
                                    float f50 = f4 - this.f18971;
                                    int i24 = i23 * 3;
                                    float f51 = i24;
                                    int iCeil4 = (int) Math.ceil((this.f18964 + f50) - f51);
                                    int iCeil5 = (int) Math.ceil(f50 + this.f18972 + f51);
                                    float f52 = f15 + fFloatValue;
                                    float f53 = iCeil4 + i23;
                                    float f54 = f15;
                                    m16181(canvas, paint, f54, iCeil4, f52, f53);
                                    float f55 = iCeil4 + i24;
                                    m16181(canvas, paint, f54, f53, f49, f55);
                                    float f56 = f52 - f48;
                                    m16181(canvas, paint, f56, f53, f52, f55);
                                    float f57 = iCeil5 - i23;
                                    float f58 = f15;
                                    m16181(canvas, paint, f58, f57, f52, iCeil5);
                                    float f59 = iCeil5 - i24;
                                    m16181(canvas, paint, f58, f57, f49, f59);
                                    m16181(canvas, paint, f56, f57, f52, f59);
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
                                    c16627 = c16624;
                                    paint = paint;
                                    c16629 = c16627;
                                    iM6074 = i10;
                                    z16 = z5;
                                    canvas = canvas;
                                    c166210 = c16629;
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
                            c16624 = c16624;
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
                                c16627 = c16624;
                                paint = paint;
                                c16629 = c16627;
                                iM6074 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c166210 = c16629;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas11 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas11;
                            } else {
                                String str3 = (String) c19393.mo19863(c9);
                                String str4 = (String) c19393.mo19863(c9);
                                Float fM378410 = c15878.m37849(str4);
                                if (fM378410 == null) {
                                    fM378410 = Float.valueOf(c10232.measureText(str4));
                                    c15878.m37851(str4, fM378410);
                                }
                                float fFloatValue2 = fM378410.floatValue();
                                int i25 = this.f18969;
                                float f60 = fFloatValue2 + (i25 * 2);
                                z5 = (z16 || f15 + f60 < ((float) i3)) ? z16 : true;
                                if (z5) {
                                    float f61 = i25;
                                    float f62 = f15 + f61;
                                    m16182(canvas, str3, 0, str3.length(), f62, f4, paint);
                                    float f63 = f4 - this.f18971;
                                    int i26 = i25 * 3;
                                    float f64 = i26;
                                    int iCeil6 = (int) Math.ceil((this.f18964 + f63) - f64);
                                    int iCeil7 = (int) Math.ceil(f63 + this.f18972 + f64);
                                    float f65 = f15 + f60;
                                    float f66 = iCeil6 + i25;
                                    float f67 = f15;
                                    m16181(canvas, paint, f67, iCeil6, f65, f66);
                                    float f68 = iCeil6 + i26;
                                    m16181(canvas, paint, f67, f66, f62, f68);
                                    float f69 = f65 - f61;
                                    m16181(canvas, paint, f69, f66, f65, f68);
                                    float f70 = iCeil7 - i25;
                                    float f71 = f15;
                                    m16181(canvas, paint, f71, f70, f65, iCeil7);
                                    float f72 = iCeil7 - i26;
                                    m16181(canvas, paint, f71, f70, f62, f72);
                                    m16181(canvas, paint, f69, f70, f65, f72);
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
                                c16627 = c16624;
                                paint = paint;
                                c16629 = c16627;
                                iM6074 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c166210 = c16629;
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
                                String str5 = (String) c19393.mo19863(c10);
                                String str6 = (String) c19393.mo19863(c10);
                                Float fM378411 = c15878.m37849(str6);
                                if (fM378411 == null) {
                                    fM378411 = Float.valueOf(c10232.measureText(str6));
                                    c15878.m37851(str6, fM378411);
                                }
                                float fFloatValue3 = fM378411.floatValue();
                                int i27 = this.f18969;
                                float f73 = fFloatValue3 + (i27 * 2);
                                z5 = (z16 || f15 + f73 < ((float) i3)) ? z16 : true;
                                if (z5) {
                                    float f74 = i27;
                                    float f75 = f15 + f74;
                                    m16182(canvas, str5, 0, str5.length(), f75, f4, paint);
                                    float f76 = f4 - this.f18971;
                                    int i28 = i27 * 3;
                                    float f77 = i28;
                                    int iCeil8 = (int) Math.ceil((this.f18964 + f76) - f77);
                                    int iCeil9 = (int) Math.ceil(f76 + this.f18972 + f77);
                                    float f78 = f15 + f73;
                                    float f79 = iCeil8 + i27;
                                    float f80 = f15;
                                    m16181(canvas, paint, f80, iCeil8, f78, f79);
                                    float f81 = iCeil8 + i28;
                                    m16181(canvas, paint, f80, f79, f75, f81);
                                    float f82 = f78 - f74;
                                    m16181(canvas, paint, f82, f79, f78, f81);
                                    float f83 = iCeil9 - i27;
                                    float f84 = f15;
                                    m16181(canvas, paint, f84, f83, f78, iCeil9);
                                    float f85 = iCeil9 - i28;
                                    m16181(canvas, paint, f84, f83, f75, f85);
                                    m16181(canvas, paint, f82, f83, f78, f85);
                                }
                                f7 = f15 + f73;
                                i10 = i7 + 1;
                                if (z5 && f7 > i4) {
                                }
                                charSequence2 = charSequence;
                                c16627 = c16624;
                                paint = paint;
                                c16629 = c16627;
                                iM6074 = i10;
                                z16 = z5;
                                canvas = canvas;
                                c166210 = c16629;
                                z17 = z17;
                                f15 = f7;
                                Canvas canvas13 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas13;
                            } else {
                                C16624 c166213 = c16624;
                                if (!z16 && f15 + this.f18981 >= i3) {
                                    z16 = true;
                                }
                                f7 = f15 + this.f18981;
                                int i29 = i7 + 1;
                                if (!z16 || f7 <= i4) {
                                    c16625 = c166213;
                                    charSequence2 = charSequence3;
                                    iM6074 = i29;
                                    canvas = canvas;
                                    c166210 = c16625;
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
                            C16624 c166214 = c16624;
                            charSequence2 = charSequence3;
                            canvas = canvas;
                            if (!C9383.m24706(c11)) {
                                z8 = true;
                                c166210 = c166214;
                                f15 = f15;
                                z18 = z18;
                                iM6074 = C1709.m6073(i7, i2, charSequence2);
                                i15 = i7;
                                Canvas canvas15 = canvas;
                                charSequence3 = charSequence2;
                                canvas = canvas15;
                            } else {
                                float fM16187 = (i7 <= 0 || !C9383.m24706(charSequence2.charAt(i7 - 1))) ? 0.0f : C9383.m24705(c11) ? m16186(c11) : this.f18957;
                                boolean z27 = (z16 || f15 + fM16187 < ((float) i3)) ? z16 : true;
                                if (z27) {
                                    cArr[c] = c11;
                                    m16183(canvas, cArr, 1, f15, f4, paint);
                                }
                                float f86 = f15 + fM16187;
                                iM6074 = i7 + 1;
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
                                    c166210 = c166214;
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
                            m16182(canvas, charSequence, i7, i2, f15, f4, paint);
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
                            m16182(canvas, charSequence, i7, i2, f15, f4, paint);
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
                    this.f18977 = interfaceC22592;
                    f6 = this.f18976;
                    if (z13) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            underlinePosition = paint.getUnderlinePosition();
                            textSize2 = paint.getUnderlineThickness();
                        } else {
                            underlinePosition = (this.f18989 * 0.85f) - this.f18971;
                            textSize2 = paint.getTextSize() * 0.019f * f6;
                        }
                        float f110 = underlinePosition + f4;
                        m16181(canvas, paint, (int) f, f110, (int) (f15 + 1.0f), f110 + textSize2);
                    }
                    if (z14) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            strikeThruPosition = paint.getStrikeThruPosition();
                            textSize = paint.getStrikeThruThickness();
                        } else {
                            strikeThruPosition = (this.f18989 * 0.551f) - this.f18971;
                            textSize = paint.getTextSize() * 0.021f * f6;
                        }
                        float f111 = f4 + strikeThruPosition;
                        m16181(canvas, paint, (int) f, f111, (int) (f15 + 1.0f), f111 + textSize);
                    }
                    if (z15) {
                        return f15 - f;
                    }
                    return f5;
                }
                i6 = i6;
                interfaceC22592 = interfaceC22592;
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
                        m16182(canvas, charSequence, i7, i2, f15, f4, paint);
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
                        m16182(canvas, charSequence, i7, i2, f15, f4, paint);
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
                this.f18977 = interfaceC22592;
                f6 = this.f18976;
                if (z13) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        underlinePosition = paint.getUnderlinePosition();
                        textSize2 = paint.getUnderlineThickness();
                    } else {
                        underlinePosition = (this.f18989 * 0.85f) - this.f18971;
                        textSize2 = paint.getTextSize() * 0.019f * f6;
                    }
                    float f112 = underlinePosition + f4;
                    m16181(canvas, paint, (int) f, f112, (int) (f15 + 1.0f), f112 + textSize2);
                }
                if (z14) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        strikeThruPosition = paint.getStrikeThruPosition();
                        textSize = paint.getStrikeThruThickness();
                    } else {
                        strikeThruPosition = (this.f18989 * 0.551f) - this.f18971;
                        textSize = paint.getTextSize() * 0.021f * f6;
                    }
                    float f113 = f4 + strikeThruPosition;
                    m16181(canvas, paint, (int) f, f113, (int) (f15 + 1.0f), f113 + textSize);
                }
                if (z15) {
                    return f15 - f;
                }
                return f5;
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m16225() {
        C16624 c16624 = this.f18965;
        C10232 c10232 = this.f18967;
        if (c16624 == null || !c16624.f53758.equals(c10232.getTypeface())) {
            this.f18965 = C16624.m39324(c10232.getTypeface());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16177(int i, int i2) {
        float fAlpha = Color.alpha(i2) / 255.0f;
        float f = 1.0f - fAlpha;
        return Color.rgb((int) ((Color.red(i2) * fAlpha) + (Color.red(i) * f)), (int) ((Color.green(i2) * fAlpha) + (Color.green(i) * f)), (int) ((Color.blue(i2) * fAlpha) + (Color.blue(i) * f)));
    }
}
