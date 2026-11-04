package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C19N */
/* JADX INFO: loaded from: classes.dex */
public class C22094 extends C4940 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public Paint f71229;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Matrix f71230;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public float f71231;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21855 f71232;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float[] f71233;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f71234;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f71235;

    public C22094(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71229 = new Paint();
        this.f71233 = new float[2];
        this.f71230 = new Matrix();
        this.f71235 = 0;
        this.f71234 = -65281;
        this.f71231 = 0.25f;
        m50060(context, attributeSet);
    }

    public C22094(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71229 = new Paint();
        this.f71233 = new float[2];
        this.f71230 = new Matrix();
        this.f71235 = 0;
        this.f71234 = -65281;
        this.f71231 = 0.25f;
        m50060(context, attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50060(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1211.f4428);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f71234 = typedArrayObtainStyledAttributes.getColor(index, this.f71234);
                } else if (index == 2) {
                    this.f71235 = typedArrayObtainStyledAttributes.getInt(index, this.f71235);
                } else if (index == 1) {
                    this.f71231 = typedArrayObtainStyledAttributes.getFloat(index, this.f71231);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.f71234;
        Paint paint = this.f71229;
        paint.setColor(i2);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    @Override // l.C4940, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Matrix matrix = getMatrix();
        Matrix matrix2 = this.f71230;
        matrix.invert(matrix2);
        if (this.f71232 == null) {
            ViewParent parent = getParent();
            if (parent instanceof C21855) {
                this.f71232 = (C21855) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f71232.m49549(this, f2, f, this.f71233, this.f71235);
                float[] fArr2 = this.f71233;
                matrix2.mapVectors(fArr2);
                float f3 = width * f2;
                float f4 = height * f;
                float f5 = fArr2[0];
                float f6 = this.f71231;
                float f7 = f4 - (fArr2[1] * f6);
                matrix2.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f71229);
            }
        }
    }
}
