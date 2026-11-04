package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: l.᩵ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N90X */
/* JADX INFO: loaded from: classes5.dex */
public final class C20643 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15421 f66207;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Rect f66208 = AbstractC0506.m2475();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Paint f66206 = AbstractC0506.m2473();

    public C20643(C15421 c15421) {
        this.f66207 = c15421;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f66207.m36926();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iM36933 = this.f66207.m36933();
        Paint paint2 = this.f66206;
        paint2.set(paint);
        int iM13638 = AbstractC4279.m13638(paint2.getColor(), 25);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iM13638);
        int i8 = i2 * iM36933;
        int i9 = i + i8;
        int i10 = i8 + i9;
        int iMin = Math.min(i9, i10);
        int iMax = Math.max(i9, i10);
        Rect rect = this.f66208;
        rect.set(iMin, i3, iMax, i5);
        canvas.drawRect(rect, paint2);
    }
}
