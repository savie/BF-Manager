package l;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4PJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10682 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface f36444;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f36445;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f36446;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C13732 f36447;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f36448;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f36449;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f36450;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Drawable f36451;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f36452;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C4916 f36453;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f36454;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f36455;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f36456;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f36457;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f36458;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Drawable f36459;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f36460;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f36461;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f36462;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f36463;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f36464;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f36465;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Drawable f36466;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f36467;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f36468;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f36469;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f36470;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f36471;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f36472;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f36473;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f36474;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f36475;

    public C10682(C13026 c13026, C13732 c13732) {
        this.f36447 = c13732;
        C4916 c4916 = new C4916(0);
        this.f36453 = c4916;
        if (f36444 == null) {
            f36444 = C16737.m39295();
        }
        c4916.setTypeface(f36444);
        c4916.setStrokeWidth(1.0f);
        float f = c13026.getContext().getResources().getDisplayMetrics().density;
        this.f36450 = f;
        this.f36473 = -579373193;
        this.f36452 = 964130679;
        this.f36448 = 8.0f * f;
        this.f36460 = 48.0f * f;
        this.f36471 = 2003199590;
        this.f36464 = f * 4.0f;
        Resources resources = c13026.getResources();
        Drawable drawableMutate = resources.getDrawable(R.drawable.MT_Protector).mutate();
        this.f36466 = drawableMutate;
        Drawable drawableMutate2 = resources.getDrawable(R.drawable.MT_Protector).mutate();
        this.f36451 = drawableMutate2;
        Drawable drawableMutate3 = resources.getDrawable(R.drawable.MT_Protector).mutate();
        this.f36459 = drawableMutate3;
        drawableMutate.setAlpha(210);
        drawableMutate2.setAlpha(210);
        drawableMutate3.setAlpha(230);
        int i = C20368.f65970;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        drawableMutate.setColorFilter(porterDuffColorFilter);
        drawableMutate2.setColorFilter(porterDuffColorFilter);
        drawableMutate3.setColorFilter(porterDuffColorFilter);
        this.f36446 = i;
        this.f36470 = C20368.m45983(-1593835521, 1627389951) & i;
        if (C20368.m45991()) {
            this.f36465 = -5654586;
            this.f36449 = -1007616;
            this.f36468 = -13948117;
            this.f36454 = -13948117;
            this.f36455 = -7829368;
            this.f36469 = -13223878;
            this.f36456 = -8947849;
            this.f36462 = -10066330;
            this.f36458 = -12106427;
            return;
        }
        this.f36465 = -16777216;
        this.f36449 = -2267648;
        this.f36468 = -1;
        this.f36454 = -1248257;
        this.f36455 = -5197648;
        this.f36469 = -986896;
        this.f36456 = -6250336;
        this.f36462 = -5197648;
        this.f36458 = -1309;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26894(int i) {
        if (this.f36467 == i) {
            return;
        }
        m26891(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26892() {
        m26893(this.f36467);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26893(int i) {
        int i2 = this.f36472;
        C13732 c13732 = this.f36447;
        if (!(i2 == c13732.m33441() && this.f36463 == c13732.m33464()) && i > 0) {
            m26891(i);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m26891(int i) {
        float fMeasureText;
        this.f36467 = i;
        C13732 c13732 = this.f36447;
        int iM33441 = c13732.m33441();
        this.f36472 = iM33441;
        int iM33464 = c13732.m33464();
        this.f36463 = iM33464;
        float f = i;
        float f2 = f - (this.f36448 * 1.5f);
        float fM5620 = C1694.m5620(c13732.m33464(), 3, iM33441 + 1, 1) + 0.5f + 1.0f + iM33464;
        float f3 = f / fM5620;
        C4916 c4916 = this.f36453;
        c4916.setTextSize(f3);
        float fMeasureText2 = c4916.measureText("0");
        this.f36461 = fMeasureText2;
        if (fMeasureText2 * fM5620 > f2) {
            do {
                f3 /= 1.01f;
                c4916.setTextSize(f3);
                fMeasureText = c4916.measureText("0");
                this.f36461 = fMeasureText;
            } while (fMeasureText * fM5620 > f2);
        } else {
            while (true) {
                float f4 = f3 * 1.01f;
                c4916.setTextSize(f4);
                float fMeasureText3 = c4916.measureText("0");
                this.f36461 = fMeasureText3;
                if (fMeasureText3 * fM5620 >= f2) {
                    break;
                } else {
                    f3 = f4;
                }
            }
            c4916.setTextSize(f3);
            this.f36461 = c4916.measureText("0");
        }
        Paint.FontMetrics fontMetrics = c4916.getFontMetrics();
        float f5 = fontMetrics.descent;
        float f6 = fontMetrics.ascent;
        this.f36474 = ((int) (f5 - f6)) + 1;
        this.f36445 = Math.round(-f6);
        float f7 = this.f36461;
        this.f36475 = 0.22f * f7;
        this.f36457 = Math.round(f7 * 0.27f);
    }
}
