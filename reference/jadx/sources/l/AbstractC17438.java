package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* JADX INFO: renamed from: l.ܿܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H4IH */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17438 extends AbstractC16733 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Paint f55538;

    @Override // android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo27979(Canvas canvas, Paint paint, int i, int i2);

    @Override // l.AbstractC16733
    /* JADX INFO: renamed from: ۙ */
    public final void mo39248(Canvas canvas, int i, int i2) {
        if (this.f55538 == null) {
            Paint paint = new Paint();
            this.f55538 = paint;
            paint.setAntiAlias(true);
            this.f55538.setColor(-16777216);
            this.f55538.setStyle(Paint.Style.FILL);
        }
        this.f55538.setAlpha(this.f53591);
        Paint paint2 = this.f55538;
        ColorFilter colorFilter = this.f53594;
        if (colorFilter == null) {
            colorFilter = this.f53592;
        }
        paint2.setColorFilter(colorFilter);
        mo27979(canvas, this.f55538, i, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f53591;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f53594;
    }
}
