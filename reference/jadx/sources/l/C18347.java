package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8FX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18347 extends Drawable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23597 f59817;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Drawable f59818 = C21576.m49058(R.drawable.MT_Protector);

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

    public C18347(AbstractC23597 abstractC23597) {
        this.f59817 = abstractC23597;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Drawable m42803() {
        return new C18347(C20613.f66057);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Drawable m42804() {
        return new C18347(C20613.f66082);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC23597 abstractC23597 = this.f59817;
        canvas.drawColor(abstractC23597.mo36859());
        Rect dirtyBounds = getDirtyBounds();
        int iWidth = (dirtyBounds.width() * 3) / 10;
        int iHeight = (dirtyBounds.height() * 3) / 10;
        int i = dirtyBounds.left + iWidth;
        int i2 = dirtyBounds.top + iHeight;
        int i3 = dirtyBounds.right - iWidth;
        int i4 = dirtyBounds.bottom - iHeight;
        Drawable drawable = this.f59818;
        drawable.setBounds(i, i2, i3, i4);
        drawable.setTint(abstractC23597.mo36860());
        drawable.draw(canvas);
    }
}
