package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: l.᩵۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8YA */
/* JADX INFO: loaded from: classes4.dex */
public final class C19467 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17474 f62679;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Rect f62681 = AbstractC15234.m36489();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Paint f62680 = AbstractC15234.m36487();

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public C19467(C17474 c17474) {
        this.f62679 = c17474;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int iM9602 = C3184.m9602(i5, i3, 2, i3);
        Paint paint2 = this.f62680;
        paint2.set(paint);
        this.f62679.m40661(paint2);
        int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            width = i;
            i -= canvas.getWidth();
        }
        int i8 = iM9602 - strokeWidth;
        int i9 = iM9602 + strokeWidth;
        Rect rect = this.f62681;
        rect.set(i, i8, width, i9);
        canvas.drawRect(rect, paint2);
    }
}
