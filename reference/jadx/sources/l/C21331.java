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

/* JADX INFO: renamed from: l.᩶۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7NG */
/* JADX INFO: loaded from: classes5.dex */
public final class C21331 extends LayerDrawable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Path f67965;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Drawable f67966;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final BitmapDrawable f67967;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f67968;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Paint f67969;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final BitmapDrawable f67970;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21331 m48556(long j) {
        Random random = new Random(j);
        Drawable drawableM49058 = C21576.m49058(R.drawable.MT_Protector);
        C14617 c14617 = new C14617(random);
        return new C21331(drawableM49058.mutate(), new BitmapDrawable(C21576.m49055(), c14617.m35260()), new BitmapDrawable(C21576.m49055(), c14617.m35259()), random.nextInt(360));
    }

    public C21331(Drawable drawable, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2, float f) {
        super(new Drawable[]{drawable, bitmapDrawable});
        this.f67966 = drawable;
        this.f67970 = bitmapDrawable;
        this.f67967 = bitmapDrawable2;
        this.f67968 = f;
        Paint paint = new Paint();
        this.f67969 = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
        this.f67965 = new Path();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect dirtyBounds = getDirtyBounds();
        m48558(canvas, dirtyBounds.width(), dirtyBounds.height(), 0.0f, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48558(Canvas canvas, int i, int i2, float f, boolean z, boolean z2) {
        float f2;
        int i3;
        if (z) {
            float fMin = Math.min(i, i2) / 2.0f;
            Path path = this.f67965;
            path.reset();
            path.addCircle(i / 2.0f, i2 / 2.0f, fMin, Path.Direction.CW);
            int iSave = canvas.save();
            canvas.clipPath(path);
            f2 = f + this.f67968;
            i3 = iSave;
        } else {
            f2 = f;
            i3 = 0;
        }
        BitmapDrawable bitmapDrawable = this.f67970;
        BitmapDrawable bitmapDrawable2 = this.f67967;
        if (f2 != 0.0f) {
            int iSave2 = canvas.save();
            canvas.rotate(f2, i / 2.0f, i2 / 2.0f);
            m48557(canvas, z2 ? bitmapDrawable2 : bitmapDrawable, i, i2, i, i2, false);
            canvas.restoreToCount(iSave2);
        } else {
            m48557(canvas, z2 ? bitmapDrawable2 : bitmapDrawable, i, i2, i, i2, false);
        }
        this.f67966.setTint(z2 ? -11184811 : -15658735);
        m48557(canvas, this.f67966, (i * 2) / 5, (i2 * 2) / 5, i, i2, true);
        if (z) {
            canvas.restoreToCount(i3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48557(Canvas canvas, Drawable drawable, int i, int i2, int i3, int i4, boolean z) {
        int i5 = (i3 - i) / 2;
        int i6 = (i4 - i2) / 2;
        int i7 = i + i5;
        int i8 = i2 + i6;
        if (z) {
            int iSaveLayer = canvas.saveLayer(i5, i6, i7, i8, this.f67969);
            drawable.setBounds(i5, i6, i7, i8);
            drawable.draw(canvas);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        drawable.setBounds(i5, i6, i7, i8);
        drawable.draw(canvas);
    }
}
