package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: l.ۖ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N90X */
/* JADX INFO: loaded from: classes2.dex */
public final class C2532 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17474 f10038;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Rect f10040 = AbstractC15234.m36489();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Paint f10039 = AbstractC15234.m36487();

    public C2532(C17474 c17474) {
        this.f10038 = c17474;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f10038.m40662();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iM40669 = this.f10038.m40669();
        Paint paint2 = this.f10039;
        paint2.set(paint);
        int iM31802 = AbstractC12807.m31802(paint2.getColor(), 25);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iM31802);
        int i8 = i2 * iM40669;
        int i9 = i + i8;
        int i10 = i8 + i9;
        int iMin = Math.min(i9, i10);
        int iMax = Math.max(i9, i10);
        Rect rect = this.f10040;
        rect.set(iMin, i3, iMax, i5);
        canvas.drawRect(rect, paint2);
    }
}
