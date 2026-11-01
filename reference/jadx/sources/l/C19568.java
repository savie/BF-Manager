package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import bin.mt.plus.R;
import java.util.Random;

/* JADX INFO: renamed from: l.᩵ܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7NG */
/* JADX INFO: loaded from: classes4.dex */
public final class C19568 extends LayerDrawable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float f62872;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Drawable f62873;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final BitmapDrawable f62874;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Path f62875;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Paint f62876;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final BitmapDrawable f62877;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19568 m44667(long j) {
        Random random = new Random(j);
        Drawable drawableM39263 = C16737.m39263(R.drawable.MT_Protector);
        C8279 c8279 = new C8279(random);
        return new C19568(drawableM39263.mutate(), new BitmapDrawable(C16737.m39279(), c8279.m21700()), new BitmapDrawable(C16737.m39279(), c8279.m21699()), random.nextInt(360));
    }

    public C19568(Drawable drawable, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2, float f) {
        super(new Drawable[]{drawable, bitmapDrawable});
        this.f62873 = drawable;
        this.f62877 = bitmapDrawable;
        this.f62874 = bitmapDrawable2;
        this.f62872 = f;
        Paint paint = new Paint();
        this.f62876 = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
        this.f62875 = new Path();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect dirtyBounds = getDirtyBounds();
        m44669(canvas, dirtyBounds.width(), dirtyBounds.height(), 0.0f, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44669(Canvas canvas, int i, int i2, float f, boolean z, boolean z2) {
        float f2;
        int i3;
        if (z) {
            float fMin = Math.min(i, i2) / 2.0f;
            Path path = this.f62875;
            path.reset();
            path.addCircle(i / 2.0f, i2 / 2.0f, fMin, Path.Direction.CW);
            int iSave = canvas.save();
            canvas.clipPath(path);
            f2 = f + this.f62872;
            i3 = iSave;
        } else {
            f2 = f;
            i3 = 0;
        }
        BitmapDrawable bitmapDrawable = this.f62877;
        BitmapDrawable bitmapDrawable2 = this.f62874;
        if (f2 != 0.0f) {
            int iSave2 = canvas.save();
            canvas.rotate(f2, i / 2.0f, i2 / 2.0f);
            m44668(canvas, z2 ? bitmapDrawable2 : bitmapDrawable, i, i2, i, i2, false);
            canvas.restoreToCount(iSave2);
        } else {
            m44668(canvas, z2 ? bitmapDrawable2 : bitmapDrawable, i, i2, i, i2, false);
        }
        this.f62873.setTint(z2 ? -11184811 : -15658735);
        m44668(canvas, this.f62873, (i * 2) / 5, (i2 * 2) / 5, i, i2, true);
        if (z) {
            canvas.restoreToCount(i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44668(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4, boolean z) {
        int i5 = (i3 - i) / 2;
        int i6 = (i4 - i2) / 2;
        int i7 = i + i5;
        int i8 = i2 + i6;
        if (z) {
            int iSaveLayer = canvas.saveLayer(i5, i6, i7, i8, this.f62876);
            drawable.setBounds(i5, i6, i7, i8);
            drawable.draw(canvas);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        drawable.setBounds(i5, i6, i7, i8);
        drawable.draw(canvas);
    }
}
