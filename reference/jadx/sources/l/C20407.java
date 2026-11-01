package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V1C0 */
/* JADX INFO: loaded from: classes5.dex */
public class C20407 extends C14121 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public LayerDrawable f66112;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public RectF f66113;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f66114;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f66115;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ViewOutlineProvider f66116;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f66117;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Drawable[] f66118;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Path f66119;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12646 f66120;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f66121;

    public C20407(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66120 = new C12646();
        this.f66117 = 0.0f;
        this.f66121 = 0.0f;
        this.f66114 = Float.NaN;
        this.f66115 = true;
        m46045(attributeSet);
    }

    public C20407(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f66120 = new C12646();
        this.f66117 = 0.0f;
        this.f66121 = 0.0f;
        this.f66114 = Float.NaN;
        this.f66115 = true;
        m46045(attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46045(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16029.f51900);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f66117 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else {
                    C12646 c12646 = this.f66120;
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
                            this.f66114 = dimension;
                            float f = this.f66121;
                            this.f66121 = -1.0f;
                            m46047(f);
                        } else {
                            boolean z = this.f66114 != dimension;
                            this.f66114 = dimension;
                            if (dimension != 0.0f) {
                                if (this.f66119 == null) {
                                    this.f66119 = new Path();
                                }
                                if (this.f66113 == null) {
                                    this.f66113 = new RectF();
                                }
                                if (this.f66116 == null) {
                                    C16174 c16174 = new C16174(this);
                                    this.f66116 = c16174;
                                    setOutlineProvider(c16174);
                                }
                                setClipToOutline(true);
                                this.f66113.set(0.0f, 0.0f, getWidth(), getHeight());
                                this.f66119.reset();
                                Path path = this.f66119;
                                RectF rectF = this.f66113;
                                float f2 = this.f66114;
                                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                            } else {
                                setClipToOutline(false);
                            }
                            if (z) {
                                invalidateOutline();
                            }
                        }
                    } else if (index == 6) {
                        m46047(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                    } else if (index == 4) {
                        this.f66115 = typedArrayObtainStyledAttributes.getBoolean(index, this.f66115);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f66118 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f66118[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f66118);
                this.f66112 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f66117 * 255.0f));
                super.setImageDrawable(this.f66112);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46047(float f) {
        boolean z = this.f66121 != f;
        this.f66121 = f;
        if (f != 0.0f) {
            if (this.f66119 == null) {
                this.f66119 = new Path();
            }
            if (this.f66113 == null) {
                this.f66113 = new RectF();
            }
            if (this.f66116 == null) {
                C21112 c21112 = new C21112(this);
                this.f66116 = c21112;
                setOutlineProvider(c21112);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f66121) / 2.0f;
            this.f66113.set(0.0f, 0.0f, width, height);
            this.f66119.reset();
            this.f66119.addRoundRect(this.f66113, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }
}
