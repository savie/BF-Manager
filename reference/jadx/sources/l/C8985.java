package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N8FX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8985 extends Drawable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16214 f30758;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Drawable f30759 = C16737.m39263(R.drawable.MT_Protector);

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 512;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 512;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C8985(AbstractC16214 abstractC16214) {
        this.f30758 = abstractC16214;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Drawable m23291() {
        return new C8985(C0690.f2881);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Drawable m23292() {
        return new C8985(C0690.f2899);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC16214 abstractC16214 = this.f30758;
        canvas.drawColor(abstractC16214.mo38326());
        Rect dirtyBounds = getDirtyBounds();
        int iWidth = (dirtyBounds.width() * 3) / 10;
        int iHeight = (dirtyBounds.height() * 3) / 10;
        int i = dirtyBounds.left + iWidth;
        int i2 = dirtyBounds.top + iHeight;
        int i3 = dirtyBounds.right - iWidth;
        int i4 = dirtyBounds.bottom - iHeight;
        Drawable drawable = this.f30759;
        drawable.setBounds(i, i2, i3, i4);
        drawable.setTint(abstractC16214.mo38328());
        drawable.draw(canvas);
    }
}
