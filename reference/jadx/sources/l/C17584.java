package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes5.dex */
public class C17584 extends C2830 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public LayerDrawable f55882;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public RectF f55883;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f55884;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f55885;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ViewOutlineProvider f55886;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f55887;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Drawable[] f55888;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Path f55889;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12646 f55890;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f55891;

    public C17584(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55890 = new C12646();
        this.f55885 = true;
        this.f55887 = 0.0f;
        this.f55891 = 0.0f;
        this.f55884 = Float.NaN;
        m40881(attributeSet);
    }

    public C17584(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55890 = new C12646();
        this.f55885 = true;
        this.f55887 = 0.0f;
        this.f55891 = 0.0f;
        this.f55884 = Float.NaN;
        m40881(attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40881(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16029.f51900);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f55887 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else {
                    C12646 c12646 = this.f55890;
                    if (index == 8) {
                        c12646.f42244 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        c12646.m31430(this);
                    } else if (index == 7) {
                        c12646.f42247 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        c12646.m31430(this);
                    } else if (index == 2) {
                        c12646.f42245 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        c12646.m31430(this);
                    } else if (index == 5) {
                        float dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                        if (Float.isNaN(dimension)) {
                            this.f55884 = dimension;
                            float f = this.f55891;
                            this.f55891 = -1.0f;
                            m40883(f);
                        } else {
                            boolean z = this.f55884 != dimension;
                            this.f55884 = dimension;
                            if (dimension != 0.0f) {
                                if (this.f55889 == null) {
                                    this.f55889 = new Path();
                                }
                                if (this.f55883 == null) {
                                    this.f55883 = new RectF();
                                }
                                if (this.f55886 == null) {
                                    C16879 c16879 = new C16879(this);
                                    this.f55886 = c16879;
                                    setOutlineProvider(c16879);
                                }
                                setClipToOutline(true);
                                this.f55883.set(0.0f, 0.0f, getWidth(), getHeight());
                                this.f55889.reset();
                                Path path = this.f55889;
                                RectF rectF = this.f55883;
                                float f2 = this.f55884;
                                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                            } else {
                                setClipToOutline(false);
                            }
                            if (z) {
                                invalidateOutline();
                            }
                        }
                    } else if (index == 6) {
                        m40883(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                    } else if (index == 4) {
                        this.f55885 = typedArrayObtainStyledAttributes.getBoolean(index, this.f55885);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f55888 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f55888[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f55888);
                this.f55882 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f55887 * 255.0f));
                super.setImageDrawable(this.f55882);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40883(float f) {
        boolean z = this.f55891 != f;
        this.f55891 = f;
        if (f != 0.0f) {
            if (this.f55889 == null) {
                this.f55889 = new Path();
            }
            if (this.f55883 == null) {
                this.f55883 = new RectF();
            }
            if (this.f55886 == null) {
                C0650 c0650 = new C0650(this);
                this.f55886 = c0650;
                setOutlineProvider(c0650);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f55891) / 2.0f;
            this.f55883.set(0.0f, 0.0f, width, height);
            this.f55889.reset();
            this.f55889.addRoundRect(this.f55883, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }
}
