package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1C0 */
/* JADX INFO: loaded from: classes4.dex */
public class C9108 extends C23148 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Drawable[] f29578;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f29579;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ViewOutlineProvider f29580;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f29581;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f29582;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public RectF f29583;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f29584;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public LayerDrawable f29585;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Path f29586;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C6872 f29587;

    public C9108(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29587 = new C6872();
        this.f29584 = 0.0f;
        this.f29582 = 0.0f;
        this.f29579 = Float.NaN;
        this.f29581 = true;
        m24259(attributeSet);
    }

    public C9108(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29587 = new C6872();
        this.f29584 = 0.0f;
        this.f29582 = 0.0f;
        this.f29579 = Float.NaN;
        this.f29581 = true;
        m24259(attributeSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24259(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1211.f4431);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.f29584 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else {
                    C6872 c6872 = this.f29587;
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
                            this.f29579 = dimension;
                            float f = this.f29582;
                            this.f29582 = -1.0f;
                            m24261(f);
                        } else {
                            boolean z = this.f29579 != dimension;
                            this.f29579 = dimension;
                            if (dimension != 0.0f) {
                                if (this.f29586 == null) {
                                    this.f29586 = new Path();
                                }
                                if (this.f29583 == null) {
                                    this.f29583 = new RectF();
                                }
                                if (this.f29580 == null) {
                                    C0906 c0906 = new C0906(this);
                                    this.f29580 = c0906;
                                    setOutlineProvider(c0906);
                                }
                                setClipToOutline(true);
                                this.f29583.set(0.0f, 0.0f, getWidth(), getHeight());
                                this.f29586.reset();
                                Path path = this.f29586;
                                RectF rectF = this.f29583;
                                float f2 = this.f29579;
                                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                            } else {
                                setClipToOutline(false);
                            }
                            if (z) {
                                invalidateOutline();
                            }
                        }
                    } else if (index == 6) {
                        m24261(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                    } else if (index == 4) {
                        this.f29581 = typedArrayObtainStyledAttributes.getBoolean(index, this.f29581);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f29578 = drawableArr;
                drawableArr[0] = getDrawable();
                this.f29578[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f29578);
                this.f29585 = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f29584 * 255.0f));
                super.setImageDrawable(this.f29585);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24261(float f) {
        boolean z = this.f29582 != f;
        this.f29582 = f;
        if (f != 0.0f) {
            if (this.f29586 == null) {
                this.f29586 = new Path();
            }
            if (this.f29583 == null) {
                this.f29583 = new RectF();
            }
            if (this.f29580 == null) {
                C9854 c9854 = new C9854(this);
                this.f29580 = c9854;
                setOutlineProvider(c9854);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f29582) / 2.0f;
            this.f29583.set(0.0f, 0.0f, width, height);
            this.f29586.reset();
            this.f29586.addRoundRect(this.f29583, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }
}
