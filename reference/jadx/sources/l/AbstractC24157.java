package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* JADX INFO: renamed from: l.᩺۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H4IH */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24157 extends AbstractC12222 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Paint f78172;

    @Override // android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo34927(Canvas canvas, Paint paint, int i, int i2);

    @Override // l.AbstractC12222
    /* JADX INFO: renamed from: ۙ */
    public final void mo30500(Canvas canvas, int i, int i2) {
        if (this.f78172 == null) {
            Paint paint = new Paint();
            this.f78172 = paint;
            paint.setAntiAlias(true);
            this.f78172.setColor(-16777216);
            this.f78172.setStyle(Paint.Style.FILL);
        }
        this.f78172.setAlpha(this.f39271);
        Paint paint2 = this.f78172;
        ColorFilter colorFilter = this.f39274;
        if (colorFilter == null) {
            colorFilter = this.f39269;
        }
        paint2.setColorFilter(colorFilter);
        mo34927(canvas, this.f78172, i, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f39271;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f39274;
    }
}
