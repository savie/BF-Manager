package l;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17877 extends LayerDrawable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f56586;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable[] f56587;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17877 m41476(Resources resources, Resources.Theme theme) {
        Drawable drawableM39101 = C16631.m39101(resources, R.drawable.MT_Protector, theme);
        C13638.requireNonNull(drawableM39101);
        Drawable drawableMutate = drawableM39101.mutate();
        Drawable drawableM39102 = C16631.m39101(resources, R.drawable.MT_Protector, theme);
        C13638.requireNonNull(drawableM39102);
        Drawable drawableMutate2 = drawableM39102.mutate();
        Drawable drawableM39103 = C16631.m39101(resources, R.drawable.MT_Protector, theme);
        C13638.requireNonNull(drawableM39103);
        Drawable drawableMutate3 = drawableM39103.mutate();
        Drawable drawableM39104 = C16631.m39101(resources, R.drawable.MT_Protector, theme);
        C13638.requireNonNull(drawableM39104);
        Drawable[] drawableArr = {drawableMutate, drawableMutate2, drawableMutate3, drawableM39104.mutate()};
        C17877 c17877 = new C17877(drawableArr);
        c17877.f56586 = 0;
        c17877.f56587 = drawableArr;
        c17877.setColorFilter(new PorterDuffColorFilter(C20368.f65993, PorterDuff.Mode.SRC_IN));
        for (int i = 0; i < 4; i++) {
            drawableArr[i].setAlpha(0);
        }
        return c17877;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41477(int i) {
        Drawable[] drawableArr = this.f56587;
        if (this.f56586 != i) {
            this.f56586 = i;
            if (i == -1) {
                for (Drawable drawable : drawableArr) {
                    drawable.setAlpha(0);
                }
            } else {
                int length = drawableArr.length;
                int i2 = 0;
                while (i2 < length) {
                    drawableArr[i2].setAlpha(i2 == i ? 255 : 0);
                    i2++;
                }
            }
            invalidateSelf();
        }
    }
}
