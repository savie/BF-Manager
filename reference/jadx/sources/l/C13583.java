package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes4.dex */
public class C13583 extends C15688 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Drawable[] f43138;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f43139;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ViewOutlineProvider f43140;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f43141;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f43142;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public RectF f43143;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f43144;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public LayerDrawable f43145;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Path f43146;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C6872 f43147;

    public C13583(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43147 = new C6872();
        this.f43141 = true;
        this.f43144 = 0.0f;
        this.f43142 = 0.0f;
        this.f43139 = Float.NaN;
        m33289(attributeSet);
    }

    public C13583(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43147 = new C6872();
        this.f43141 = true;
        this.f43144 = 0.0f;
        this.f43142 = 0.0f;
        this.f43139 = Float.NaN;
        m33289(attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33289(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1211.f4431);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f43144 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else {
                    C6872 c6872 = this.f43147;
                    if (index == 8) {
                        c6872.f22827 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        c6872.m19132(this);
                    } else if (index == 7) {
                        c6872.f22829 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        c6872.m19132(this);
                    } else if (index == 2) {
                        c6872.f22831 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        c6872.m19132(this);
                    } else if (index == 5) {
                        float dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                        if (Float.isNaN(dimension)) {
                            this.f43139 = dimension;
                            float f = this.f43142;
                            this.f43142 = -1.0f;
                            m33291(f);
                        } else {
                            boolean z = this.f43139 != dimension;
                            this.f43139 = dimension;
                            if (dimension != 0.0f) {
                                if (this.f43146 == null) {
                                    this.f43146 = new Path();
                                }
                                if (this.f43143 == null) {
                                    this.f43143 = new RectF();
                                }
                                if (this.f43140 == null) {
                                    C8363 c8363 = new C8363(this);
                                    this.f43140 = c8363;
                                    setOutlineProvider(c8363);
                                }
                                setClipToOutline(true);
                                this.f43143.set(0.0f, 0.0f, getWidth(), getHeight());
                                this.f43146.reset();
                                Path path = this.f43146;
                                RectF rectF = this.f43143;
                                float f2 = this.f43139;
                                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                            } else {
                                setClipToOutline(false);
                            }
                            if (z) {
                                invalidateOutline();
                            }
                        }
                    } else if (index == 6) {
                        m33291(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                    } else if (index == 4) {
                        this.f43141 = typedArrayObtainStyledAttributes.getBoolean(index, this.f43141);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f43138 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f43138[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f43138);
                this.f43145 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f43144 * 255.0f));
                super.setImageDrawable(this.f43145);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33291(float f) {
        boolean z = this.f43142 != f;
        this.f43142 = f;
        if (f != 0.0f) {
            if (this.f43146 == null) {
                this.f43146 = new Path();
            }
            if (this.f43143 == null) {
                this.f43143 = new RectF();
            }
            if (this.f43140 == null) {
                C2397 c2397 = new C2397(this);
                this.f43140 = c2397;
                setOutlineProvider(c2397);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f43142) / 2.0f;
            this.f43143.set(0.0f, 0.0f, width, height);
            this.f43146.reset();
            this.f43146.addRoundRect(this.f43143, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }
}
