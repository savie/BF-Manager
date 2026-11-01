package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۜ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: XA43 */
/* JADX INFO: loaded from: classes2.dex */
public class C7084 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Paint f23755;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f23756;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HandlerC4261 f23757;

    public C7084(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7084(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23757 = new HandlerC4261(this);
        Paint paint = new Paint(1);
        this.f23755 = paint;
        int iM33769 = isInEditMode() ? 20 : C13932.m33769(20.0f);
        this.f23756 = iM33769;
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(new LinearGradient(0.0f, 0.0f, iM33769, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (getChildCount() > 0) {
            return getChildAt(0).getBaseline();
        }
        return super.getBaseline();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        View childAt = getChildAt(0);
        childAt.measure(0, i2);
        setMeasuredDimension(View.getDefaultSize(childAt.getMeasuredWidth(), i), childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        HandlerC4261 handlerC4261 = this.f23757;
        handlerC4261.removeMessages(0);
        handlerC4261.sendMessage(handlerC4261.obtainMessage(0, 0, 0));
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        HandlerC4261 handlerC4261 = this.f23757;
        handlerC4261.removeMessages(0);
        if (i == 0) {
            handlerC4261.sendMessage(handlerC4261.obtainMessage(0, 0, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerC4261 handlerC4261 = this.f23757;
        handlerC4261.removeMessages(0);
        handlerC4261.sendMessage(handlerC4261.obtainMessage(0, 0, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23757.removeMessages(0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int width = getWidth();
        int height = getHeight();
        if (view.getWidth() < width) {
            return super.drawChild(canvas, view, j);
        }
        float f = width;
        float f2 = height;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, f, f2, null, 31);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        int i = this.f23756;
        Paint paint = this.f23755;
        canvas.drawRect(0.0f, 0.0f, i, f2, paint);
        canvas.rotate(180.0f, f / 2.0f, f2 / 2.0f);
        canvas.drawRect(0.0f, 0.0f, i, f2, paint);
        canvas.restoreToCount(iSaveLayer);
        return zDrawChild;
    }
}
