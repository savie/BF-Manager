package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: l.ۡܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I8YA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9454 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15421 f30654;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Rect f30655 = AbstractC0506.m2475();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Paint f30653 = AbstractC0506.m2473();

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public C9454(C15421 c15421) {
        this.f30654 = c15421;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int iM18182 = C6421.m18182(i5, i3, 2, i3);
        Paint paint2 = this.f30653;
        paint2.set(paint);
        this.f30654.m36936(paint2);
        int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            width = i;
            i -= canvas.getWidth();
        }
        int i8 = iM18182 - strokeWidth;
        int i9 = iM18182 + strokeWidth;
        Rect rect = this.f30655;
        rect.set(i, i8, width, i9);
        canvas.drawRect(rect, paint2);
    }
}
