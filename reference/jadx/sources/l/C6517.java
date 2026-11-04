package l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۛܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 58Y6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6517 extends AbstractC15465 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Resources f21922;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6517 m18393() {
        return new C6517(Resources.getSystem());
    }

    public C6517(Resources resources) {
        this.f21922 = resources;
    }

    @Override // l.AbstractC15465
    /* JADX INFO: renamed from: ۙ */
    public final Drawable mo9838(InputStream inputStream) {
        try {
            C1752 c1752M6176 = C1752.m6176(inputStream);
            float fM6197 = c1752M6176.m6197();
            float fM6195 = c1752M6176.m6195();
            Resources resources = this.f21922;
            float f = resources.getDisplayMetrics().density;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) ((fM6197 * f) + 0.5f), (int) ((fM6195 * f) + 0.5f), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(f, f);
            c1752M6176.m6186(canvas);
            return new BitmapDrawable(resources, bitmapCreateBitmap);
        } catch (C14429 e) {
            throw new IllegalStateException("Exception decoding SVG", e);
        }
    }
}
