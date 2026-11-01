package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C5WO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21881 extends C13415 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ColorStateList f70992;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f70993;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C15532 f70994;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f70995;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f70996;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Drawable f70997;

    public C21881(C15532 c15532) {
        super(c15532);
        this.f70992 = null;
        this.f70996 = null;
        this.f70993 = false;
        this.f70995 = false;
        this.f70994 = c15532;
    }

    @Override // l.C13415
    /* JADX INFO: renamed from: ۙ */
    public final void mo32902(AttributeSet attributeSet, int i) {
        super.mo32902(attributeSet, i);
        C15532 c15532 = this.f70994;
        Context context = c15532.getContext();
        int[] iArr = C12108.f40526;
        C1977 c1977M6353 = C1977.m6353(context, attributeSet, iArr, i, 0);
        C5031.m13983(c15532, c15532.getContext(), iArr, attributeSet, c1977M6353.m6382(), i);
        Drawable drawableM6378 = c1977M6353.m6378(0);
        if (drawableM6378 != null) {
            c15532.setThumb(drawableM6378);
        }
        Drawable drawableM6370 = c1977M6353.m6370(1);
        Drawable drawable = this.f70997;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f70997 = drawableM6370;
        if (drawableM6370 != null) {
            drawableM6370.setCallback(c15532);
            C7603.m20134(drawableM6370, c15532.getLayoutDirection());
            if (drawableM6370.isStateful()) {
                drawableM6370.setState(c15532.getDrawableState());
            }
            m48672();
        }
        c15532.invalidate();
        if (c1977M6353.m6383(3)) {
            this.f70996 = C20946.m47119(c1977M6353.m6381(3, -1), this.f70996);
            this.f70995 = true;
        }
        if (c1977M6353.m6383(2)) {
            this.f70992 = c1977M6353.m6385(2);
            this.f70993 = true;
        }
        c1977M6353.m6379();
        m48672();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m48672() {
        Drawable drawable = this.f70997;
        if (drawable != null) {
            if (this.f70993 || this.f70995) {
                Drawable drawableM20139 = C7603.m20139(drawable.mutate());
                this.f70997 = drawableM20139;
                if (this.f70993) {
                    C7603.m20129(drawableM20139, this.f70992);
                }
                if (this.f70995) {
                    C7603.m20132(this.f70997, this.f70996);
                }
                if (this.f70997.isStateful()) {
                    this.f70997.setState(this.f70994.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m48674() {
        Drawable drawable = this.f70997;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m48675() {
        Drawable drawable = this.f70997;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C15532 c15532 = this.f70994;
        if (drawable.setState(c15532.getDrawableState())) {
            c15532.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48673(Canvas canvas) {
        if (this.f70997 != null) {
            C15532 c15532 = this.f70994;
            int max = c15532.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f70997.getIntrinsicWidth();
                int intrinsicHeight = this.f70997.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f70997.setBounds(-i, -i2, i, i2);
                float width = ((c15532.getWidth() - c15532.getPaddingLeft()) - c15532.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c15532.getPaddingLeft(), c15532.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f70997.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
