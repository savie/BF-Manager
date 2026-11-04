package l;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VJ */
/* JADX INFO: loaded from: classes.dex */
public final class C25009 extends LayerDrawable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f80951;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable[] f80952;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25009 m55842(Resources resources, Resources.Theme theme) {
        Drawable drawableM24392 = C9217.m24392(resources, R.drawable.MT_Protector, theme);
        C17359.requireNonNull(drawableM24392);
        Drawable drawableMutate = drawableM24392.mutate();
        Drawable drawableM24393 = C9217.m24392(resources, R.drawable.MT_Protector, theme);
        C17359.requireNonNull(drawableM24393);
        Drawable drawableMutate2 = drawableM24393.mutate();
        Drawable drawableM24394 = C9217.m24392(resources, R.drawable.MT_Protector, theme);
        C17359.requireNonNull(drawableM24394);
        Drawable drawableMutate3 = drawableM24394.mutate();
        Drawable drawableM24395 = C9217.m24392(resources, R.drawable.MT_Protector, theme);
        C17359.requireNonNull(drawableM24395);
        Drawable[] drawableArr = {drawableMutate, drawableMutate2, drawableMutate3, drawableM24395.mutate()};
        C25009 c25009 = new C25009(drawableArr);
        c25009.f80951 = 0;
        c25009.f80952 = drawableArr;
        c25009.setColorFilter(new PorterDuffColorFilter(C3296.f10762, PorterDuff.Mode.SRC_IN));
        for (int i = 0; i < 4; i++) {
            drawableArr[i].setAlpha(0);
        }
        return c25009;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55843(int i) {
        Drawable[] drawableArr = this.f80952;
        if (this.f80951 != i) {
            this.f80951 = i;
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
