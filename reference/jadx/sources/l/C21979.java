package l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩹֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58Y6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21979 extends AbstractC17412 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Resources f71288;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21979 m48800() {
        return new C21979(Resources.getSystem());
    }

    public C21979(Resources resources) {
        this.f71288 = resources;
    }

    @Override // l.AbstractC17412
    /* JADX INFO: renamed from: ۙ */
    public final Drawable mo23247(InputStream inputStream) {
        try {
            C11644 c11644M29081 = C11644.m29081(inputStream);
            float fM29084 = c11644M29081.m29084();
            float fM29096 = c11644M29081.m29096();
            Resources resources = this.f71288;
            float f = resources.getDisplayMetrics().density;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) ((fM29084 * f) + 0.5f), (int) ((fM29096 * f) + 0.5f), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(f, f);
            c11644M29081.m29090(canvas);
            return new BitmapDrawable(resources, bitmapCreateBitmap);
        } catch (C8116 e) {
            throw new IllegalStateException("Exception decoding SVG", e);
        }
    }
}
