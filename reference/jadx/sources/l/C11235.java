package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C19N */
/* JADX INFO: loaded from: classes4.dex */
public class C11235 extends C6295 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f38009;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C10884 f38010;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public Paint f38011;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float[] f38012;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Matrix f38013;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public float f38014;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f38015;

    public C11235(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38011 = new Paint();
        this.f38012 = new float[2];
        this.f38013 = new Matrix();
        this.f38009 = 0;
        this.f38015 = -65281;
        this.f38014 = 0.25f;
        m28206(context, attributeSet);
    }

    public C11235(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38011 = new Paint();
        this.f38012 = new float[2];
        this.f38013 = new Matrix();
        this.f38009 = 0;
        this.f38015 = -65281;
        this.f38014 = 0.25f;
        m28206(context, attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28206(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16029.f51885);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f38015 = typedArrayObtainStyledAttributes.getColor(index, this.f38015);
                } else if (index == 2) {
                    this.f38009 = typedArrayObtainStyledAttributes.getInt(index, this.f38009);
                } else if (index == 1) {
                    this.f38014 = typedArrayObtainStyledAttributes.getFloat(index, this.f38014);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.f38015;
        Paint paint = this.f38011;
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

    @Override // l.C6295, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Matrix matrix = getMatrix();
        Matrix matrix2 = this.f38013;
        matrix.invert(matrix2);
        if (this.f38010 == null) {
            ViewParent parent = getParent();
            if (parent instanceof C10884) {
                this.f38010 = (C10884) parent;
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
                this.f38010.m27284(this, f2, f, this.f38012, this.f38009);
                float[] fArr2 = this.f38012;
                matrix2.mapVectors(fArr2);
                float f3 = width * f2;
                float f4 = height * f;
                float f5 = fArr2[0];
                float f6 = this.f38014;
                float f7 = f4 - (fArr2[1] * f6);
                matrix2.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f38011);
            }
        }
    }
}
