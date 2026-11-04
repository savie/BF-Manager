package l;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4PJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5171 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface f18018;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f18019;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Drawable f18020;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f18021;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Drawable f18022;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f18023;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f18024;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f18025;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C12628 f18026;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f18027;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f18028;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f18029;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f18030;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f18031;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Drawable f18032;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f18033;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f18034;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f18035;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f18036;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f18037;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f18038;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f18039;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f18040;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f18041;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f18042;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f18043 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f18044;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f18045;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f18046;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f18047;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10232 f18048;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f18049;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5917 f18050;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f18051;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f18052;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f18053;

    public C5171(C12628 c12628, C5917 c5917) {
        this.f18050 = c5917;
        this.f18026 = c12628;
        C10232 c10232 = new C10232(0);
        this.f18048 = c10232;
        if (f18018 == null) {
            f18018 = C21576.m49083();
        }
        c10232.setTypeface(f18018);
        c10232.setStrokeWidth(1.0f);
        float f = c12628.getContext().getResources().getDisplayMetrics().density;
        this.f18046 = f;
        this.f18040 = -579373193;
        this.f18035 = 964130679;
        this.f18021 = 8.0f * f;
        this.f18027 = 48.0f * f;
        this.f18044 = 2003199590;
        this.f18019 = f * 4.0f;
        Resources resources = c12628.getResources();
        Drawable drawableMutate = resources.getDrawable(R.drawable.MT_Protector).mutate();
        this.f18032 = drawableMutate;
        Drawable drawableMutate2 = resources.getDrawable(R.drawable.MT_Protector).mutate();
        this.f18022 = drawableMutate2;
        Drawable drawableMutate3 = resources.getDrawable(R.drawable.MT_Protector).mutate();
        this.f18020 = drawableMutate3;
        drawableMutate.setAlpha(210);
        drawableMutate2.setAlpha(210);
        drawableMutate3.setAlpha(230);
        int i = C3296.f10738;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        drawableMutate.setColorFilter(porterDuffColorFilter);
        drawableMutate2.setColorFilter(porterDuffColorFilter);
        drawableMutate3.setColorFilter(porterDuffColorFilter);
        this.f18037 = i;
        this.f18030 = C3296.m10871(-1593835521, 1627389951) & i;
        if (C3296.m10878()) {
            this.f18033 = -5654586;
            this.f18025 = -1007616;
            this.f18036 = -13948117;
            this.f18028 = -13948117;
            this.f18024 = -7829368;
            this.f18042 = -5197648;
            this.f18052 = -13223878;
            this.f18039 = -8947849;
            this.f18038 = -10066330;
            this.f18034 = -12106427;
            return;
        }
        this.f18033 = -16777216;
        this.f18025 = -2267648;
        this.f18036 = -1;
        this.f18028 = -1248257;
        this.f18024 = -5197648;
        this.f18042 = -7829368;
        this.f18052 = -986896;
        this.f18039 = -6250336;
        this.f18038 = -5197648;
        this.f18034 = -1309;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15590(int i) {
        float fMeasureText;
        if (i <= 0) {
            return;
        }
        C12628 c12628 = this.f18026;
        C3176 c3176 = c12628.f40510;
        int iM17209 = c3176 == null ? c12628.f40509.m17209() : c3176.f10292;
        int iM17204 = this.f18050.m17204();
        boolean zM31351 = c12628.m31351();
        boolean z = c12628.f40510 != null;
        if (this.f18047 == i && this.f18023 == iM17209 && this.f18041 == iM17204 && this.f18043 == zM31351 && this.f18051 == z) {
            return;
        }
        this.f18047 = i;
        this.f18023 = iM17209;
        this.f18041 = iM17204;
        this.f18043 = zM31351;
        this.f18051 = z;
        float f = z ? i : i - (this.f18021 * 1.5f);
        float fM31436 = C12669.m31436(iM17204, 3, iM17209 + 1, 1) + (zM31351 ? iM17204 + 1.5f : 0.0f);
        float f2 = i / fM31436;
        C10232 c10232 = this.f18048;
        c10232.setTextSize(f2);
        float fMeasureText2 = c10232.measureText("0");
        this.f18049 = fMeasureText2;
        if (fMeasureText2 * fM31436 > f) {
            do {
                f2 /= 1.01f;
                c10232.setTextSize(f2);
                fMeasureText = c10232.measureText("0");
                this.f18049 = fMeasureText;
            } while (fMeasureText * fM31436 > f);
        } else {
            while (true) {
                float f3 = f2 * 1.01f;
                c10232.setTextSize(f3);
                float fMeasureText3 = c10232.measureText("0");
                this.f18049 = fMeasureText3;
                if (fMeasureText3 * fM31436 >= f) {
                    break;
                } else {
                    f2 = f3;
                }
            }
            c10232.setTextSize(f2);
            this.f18049 = c10232.measureText("0");
        }
        Paint.FontMetrics fontMetrics = c10232.getFontMetrics();
        float f4 = fontMetrics.descent;
        float f5 = fontMetrics.ascent;
        this.f18053 = ((int) (f4 - f5)) + 1;
        this.f18045 = Math.round(-f5);
        float f6 = this.f18049;
        this.f18029 = 0.22f * f6;
        this.f18031 = Math.round(f6 * 0.27f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15589() {
        m15590(this.f18047);
    }
}
