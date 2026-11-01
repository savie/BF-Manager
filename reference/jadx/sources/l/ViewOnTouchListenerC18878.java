package l;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩴܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnTouchListenerC18878 implements InterfaceC4060, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final AccelerateDecelerateInterpolator f61126 = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f61129;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f61131;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f61132;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public View.OnLongClickListener f61133;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19584 f61134;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f61137;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public GestureDetector f61138;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public RunnableC18172 f61140;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f61143;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f61144;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f61147;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public WeakReference f61149;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public float f61130 = 1.0f;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public float f61139 = 3.0f;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f61145 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Matrix f61127 = new Matrix();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Matrix f61135 = new Matrix();

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final Matrix f61141 = new Matrix();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final RectF f61146 = new RectF();

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final float[] f61142 = new float[9];

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f61128 = 2;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public ImageView.ScaleType f61148 = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final float[] f61136 = new float[9];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43546(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
        }
        if (scaleType == null || scaleType == this.f61148) {
            return;
        }
        this.f61148 = scaleType;
        m43540();
    }

    public ViewOnTouchListenerC18878(C6883 c6883) {
        this.f61149 = new WeakReference(c6883);
        c6883.setDrawingCacheEnabled(true);
        c6883.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = c6883.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (c6883.isInEditMode()) {
            return;
        }
        this.f61134 = C8295.m21732(c6883.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(c6883.getContext(), new C23112(this));
        this.f61138 = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC13234(this));
        this.f61132 = true;
        m43540();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43541() {
        WeakReference weakReference = this.f61149;
        if (weakReference == null) {
            return;
        }
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            imageView.setOnTouchListener(null);
            RunnableC18172 runnableC18172 = this.f61140;
            if (runnableC18172 != null) {
                runnableC18172.m42294();
                this.f61140 = null;
            }
        }
        GestureDetector gestureDetector = this.f61138;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f61149 = null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RectF m43551() {
        m43537();
        return m43529(m43548());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ImageView m43539() {
        WeakReference weakReference = this.f61149;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView == null) {
            m43541();
        }
        return imageView;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float m43553() {
        return this.f61130;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m43547() {
        return this.f61139;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ImageView.ScaleType m43550() {
        return this.f61148;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43542(float f, float f2) {
        InterfaceC19584 interfaceC19584 = this.f61134;
        if (interfaceC19584.mo26311()) {
            return;
        }
        ImageView imageViewM43539 = m43539();
        boolean z = this.f61145;
        Matrix matrix = this.f61141;
        if (!z) {
            float[] fArr = this.f61136;
            matrix.getValues(fArr);
            float fRound = Math.round(fArr[2]);
            float fRound2 = Math.round(fArr[5]);
            matrix.postTranslate(f, f2);
            m43533();
            matrix.getValues(fArr);
            float fRound3 = Math.round(fArr[2]);
            float fRound4 = Math.round(fArr[5]);
            if (fRound != fRound3 || fRound2 != fRound4) {
                this.f61145 = true;
            }
        } else {
            matrix.postTranslate(f, f2);
            m43533();
        }
        ViewParent parent = imageViewM43539.getParent();
        if (interfaceC19584.mo26311() || this.f61145) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i = this.f61128;
        if ((i == 2 || ((i == 0 && f >= 1.0f) || (i == 1 && f <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m43552(float f, float f2) {
        ImageView imageViewM43539 = m43539();
        RunnableC18172 runnableC18172 = new RunnableC18172(imageViewM43539.getContext(), this);
        this.f61140 = runnableC18172;
        runnableC18172.m42295(m43534(imageViewM43539), m43528(imageViewM43539), (int) f, (int) f2);
        imageViewM43539.post(this.f61140);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ImageView imageViewM43539 = m43539();
        if (imageViewM43539 != null) {
            if (this.f61132) {
                int top = imageViewM43539.getTop();
                int right = imageViewM43539.getRight();
                int bottom = imageViewM43539.getBottom();
                int left = imageViewM43539.getLeft();
                if (top == this.f61131 && bottom == this.f61143 && left == this.f61129 && right == this.f61137) {
                    return;
                }
                m43531(imageViewM43539.getDrawable());
                this.f61131 = top;
                this.f61137 = right;
                this.f61143 = bottom;
                this.f61129 = left;
                return;
            }
            m43531(imageViewM43539.getDrawable());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43543(float f, float f2, float f3) {
        if (m43538() > this.f61130 / 2.0f || f > 1.0f) {
            this.f61144 = f2;
            this.f61147 = f3;
            this.f61141.postScale(f, f, f2, f3);
            m43533();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView;
        boolean z = false;
        if (this.f61132 && (imageView = (ImageView) view) != null && imageView.getDrawable() != null) {
            ViewParent parent = view.getParent();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                RunnableC18172 runnableC18172 = this.f61140;
                if (runnableC18172 != null) {
                    runnableC18172.m42294();
                    this.f61140 = null;
                }
                this.f61145 = false;
            } else if (actionMasked == 1 || actionMasked == 3) {
                float fM43538 = m43538();
                float f = this.f61130;
                if (fM43538 < f) {
                    view.post(new RunnableC21700(this, fM43538, f, this.f61144, this.f61147));
                } else {
                    float f2 = this.f61139;
                    if (fM43538 > f2) {
                        view.post(new RunnableC21700(this, fM43538, f2, this.f61144, this.f61147));
                    }
                }
                z = true;
            } else if (actionMasked == 5) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.f61145 = true;
            }
            InterfaceC19584 interfaceC19584 = this.f61134;
            if (interfaceC19584 != null) {
                interfaceC19584.mo26310(motionEvent);
                z = true;
            }
            GestureDetector gestureDetector = this.f61138;
            if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m43549(float f, float f2) {
        if (f >= f2) {
            throw new IllegalArgumentException("MinZoom has to be less than MaxZoom");
        }
        this.f61130 = f;
        this.f61139 = f2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43545(View.OnLongClickListener onLongClickListener) {
        this.f61133 = onLongClickListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43544(float f, float f2, float f3, boolean z) {
        ImageView imageViewM43539 = m43539();
        if (imageViewM43539 == null || f < this.f61130 || f > this.f61139) {
            return;
        }
        if (z) {
            imageViewM43539.post(new RunnableC21700(this, m43538(), f, f2, f3));
        } else {
            this.f61141.setScale(f, f, f2, f3);
            m43533();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m43540() {
        ImageView imageViewM43539 = m43539();
        if (imageViewM43539 != null) {
            if (this.f61132) {
                if (!(imageViewM43539 instanceof InterfaceC4060)) {
                    ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
                    if (!scaleType.equals(imageViewM43539.getScaleType())) {
                        imageViewM43539.setScaleType(scaleType);
                    }
                }
                m43531(imageViewM43539.getDrawable());
                return;
            }
            Matrix matrix = this.f61141;
            matrix.reset();
            matrix.postRotate(0.0f);
            m43533();
            m43536(m43548());
            m43537();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Matrix m43548() {
        Matrix matrix = this.f61127;
        Matrix matrix2 = this.f61135;
        matrix2.set(matrix);
        matrix2.postConcat(this.f61141);
        return matrix2;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m43533() {
        if (m43537()) {
            m43536(m43548());
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private boolean m43537() {
        RectF rectFM43529;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        ImageView imageViewM43539 = m43539();
        if (imageViewM43539 == null || (rectFM43529 = m43529(m43548())) == null) {
            return false;
        }
        float fHeight = rectFM43529.height();
        float fWidth = rectFM43529.width();
        float fM43528 = m43528(imageViewM43539);
        float f7 = 0.0f;
        if (fHeight <= fM43528) {
            int i = C15351.f50025[this.f61148.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    fM43528 -= fHeight;
                    f2 = rectFM43529.top;
                } else {
                    fM43528 = (fM43528 - fHeight) / 2.0f;
                    f2 = rectFM43529.top;
                }
            } else {
                f = rectFM43529.top;
                f3 = -f;
            }
        } else {
            f = rectFM43529.top;
            if (f > 0.0f) {
                f3 = -f;
            } else {
                f2 = rectFM43529.bottom;
                f3 = f2 < fM43528 ? fM43528 - f2 : 0.0f;
            }
        }
        float fM43534 = m43534(imageViewM43539);
        if (fWidth <= fM43534) {
            int i2 = C15351.f50025[this.f61148.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    f5 = fM43534 - fWidth;
                    f6 = rectFM43529.left;
                } else {
                    f5 = (fM43534 - fWidth) / 2.0f;
                    f6 = rectFM43529.left;
                }
                f4 = f5 - f6;
            } else {
                f4 = -rectFM43529.left;
            }
            f7 = f4;
            this.f61128 = 2;
        } else {
            float f8 = rectFM43529.left;
            if (f8 > 0.0f) {
                this.f61128 = 0;
                f7 = -f8;
            } else {
                float f9 = rectFM43529.right;
                if (f9 < fM43534) {
                    f7 = fM43534 - f9;
                    this.f61128 = 1;
                } else {
                    this.f61128 = -1;
                }
            }
        }
        this.f61141.postTranslate(f7, f3);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private RectF m43529(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewM43539 = m43539();
        if (imageViewM43539 == null || (drawable = imageViewM43539.getDrawable()) == null) {
            return null;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f61146;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        matrix.mapRect(rectF);
        return rectF;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float m43538() {
        Matrix matrix = this.f61141;
        float[] fArr = this.f61142;
        matrix.getValues(fArr);
        float fPow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m43536(Matrix matrix) {
        ImageView imageViewM43539 = m43539();
        if (imageViewM43539 != null) {
            ImageView imageViewM435310 = m43539();
            if (imageViewM435310 != null && !(imageViewM435310 instanceof InterfaceC4060) && !ImageView.ScaleType.MATRIX.equals(imageViewM435310.getScaleType())) {
                throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
            }
            imageViewM43539.setImageMatrix(matrix);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43531(Drawable drawable) {
        ImageView imageViewM43539 = m43539();
        if (imageViewM43539 == null || drawable == null) {
            return;
        }
        float fM43534 = m43534(imageViewM43539);
        float fM43528 = m43528(imageViewM43539);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f61127;
        matrix.reset();
        float f = intrinsicWidth;
        float f2 = fM43534 / f;
        float f3 = intrinsicHeight;
        float f4 = fM43528 / f3;
        ImageView.ScaleType scaleType = this.f61148;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((fM43534 - f) / 2.0f, (fM43528 - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f2, f4);
            matrix.postScale(fMax, fMax);
            matrix.postTranslate((fM43534 - (f * fMax)) / 2.0f, (fM43528 - (f3 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f2, f4));
            matrix.postScale(fMin, fMin);
            matrix.postTranslate((fM43534 - (f * fMin)) / 2.0f, (fM43528 - (f3 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM43534, fM43528);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = C15351.f50025[this.f61148.ordinal()];
            if (i == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.f61141;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        m43533();
        m43536(m43548());
        m43537();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m43534(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43528(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }
}
