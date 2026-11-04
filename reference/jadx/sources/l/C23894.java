package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C5WO */
/* JADX INFO: loaded from: classes.dex */
public final class C23894 extends C11959 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16434 f77375;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f77376;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ColorStateList f77377;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Drawable f77378;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f77379;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f77380;

    public C23894(C16434 c16434) {
        super(c16434);
        this.f77377 = null;
        this.f77376 = null;
        this.f77380 = false;
        this.f77379 = false;
        this.f77375 = c16434;
    }

    @Override // l.C11959
    /* JADX INFO: renamed from: ۙ */
    public final void mo29937(AttributeSet attributeSet, int i) {
        super.mo29937(attributeSet, i);
        C16434 c16434 = this.f77375;
        Context context = c16434.getContext();
        int[] iArr = C10401.f33062;
        C5204 c5204M15649 = C5204.m15649(context, attributeSet, iArr, i, 0);
        C22666.m51088(c16434, c16434.getContext(), iArr, attributeSet, c5204M15649.m15658(), i);
        Drawable drawableM15663 = c5204M15649.m15663(0);
        if (drawableM15663 != null) {
            c16434.setThumb(drawableM15663);
        }
        Drawable drawableM15669 = c5204M15649.m15669(1);
        Drawable drawable = this.f77378;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f77378 = drawableM15669;
        if (drawableM15669 != null) {
            drawableM15669.setCallback(c16434);
            C0597.m2695(drawableM15669, c16434.getLayoutDirection());
            if (drawableM15669.isStateful()) {
                drawableM15669.setState(c16434.getDrawableState());
            }
            m53397();
        }
        c16434.invalidate();
        if (c5204M15649.m15655(3)) {
            this.f77376 = C21414.m48720(c5204M15649.m15657(3, -1), this.f77376);
            this.f77379 = true;
        }
        if (c5204M15649.m15655(2)) {
            this.f77377 = c5204M15649.m15666(2);
            this.f77380 = true;
        }
        c5204M15649.m15664();
        m53397();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m53397() {
        Drawable drawable = this.f77378;
        if (drawable != null) {
            if (this.f77380 || this.f77379) {
                Drawable drawableM2697 = C0597.m2697(drawable.mutate());
                this.f77378 = drawableM2697;
                if (this.f77380) {
                    C0597.m2690(drawableM2697, this.f77377);
                }
                if (this.f77379) {
                    C0597.m2693(this.f77378, this.f77376);
                }
                if (this.f77378.isStateful()) {
                    this.f77378.setState(this.f77375.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m53399() {
        Drawable drawable = this.f77378;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53400() {
        Drawable drawable = this.f77378;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C16434 c16434 = this.f77375;
        if (drawable.setState(c16434.getDrawableState())) {
            c16434.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53398(Canvas canvas) {
        if (this.f77378 != null) {
            C16434 c16434 = this.f77375;
            int max = c16434.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f77378.getIntrinsicWidth();
                int intrinsicHeight = this.f77378.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f77378.setBounds(-i, -i2, i, i2);
                float width = ((c16434.getWidth() - c16434.getPaddingLeft()) - c16434.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c16434.getPaddingLeft(), c16434.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f77378.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
