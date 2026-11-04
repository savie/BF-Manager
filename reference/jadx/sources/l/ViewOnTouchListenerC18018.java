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

/* JADX INFO: renamed from: l.ܿۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnTouchListenerC18018 implements InterfaceC12051, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final AccelerateDecelerateInterpolator f58981 = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public GestureDetector f58983;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f58984;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public View.OnLongClickListener f58985;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f58987;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public RunnableC21002 f58988;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f58989;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public WeakReference f58990;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7577 f58992;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f58993;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f58994;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f58995;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f59000;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f58982 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Matrix f58997 = new Matrix();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Matrix f58991 = new Matrix();

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final Matrix f58996 = new Matrix();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RectF f58998 = new RectF();

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final float[] f59001 = new float[9];

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f58999 = 2;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public ImageView.ScaleType f59002 = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final float[] f58986 = new float[9];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42014(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
        }
        if (scaleType == null || scaleType == this.f59002) {
            return;
        }
        this.f59002 = scaleType;
        m42016();
    }

    public ViewOnTouchListenerC18018(C6086 c6086) {
        this.f58990 = new WeakReference(c6086);
        c6086.setDrawingCacheEnabled(true);
        c6086.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = c6086.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (c6086.isInEditMode()) {
            return;
        }
        this.f58992 = C0119.m1258(c6086.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(c6086.getContext(), new C23986(this));
        this.f58983 = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC20256(this));
        this.f58993 = true;
        m42016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42010() {
        WeakReference weakReference = this.f58990;
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
            RunnableC21002 runnableC21002 = this.f58988;
            if (runnableC21002 != null) {
                runnableC21002.m48018();
                this.f58988 = null;
            }
        }
        GestureDetector gestureDetector = this.f58983;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f58990 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final RectF m42019() {
        m42000();
        return m42002(m42015());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ImageView m42022() {
        WeakReference weakReference = this.f58990;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView == null) {
            m42010();
        }
        return imageView;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ImageView.ScaleType m42017() {
        return this.f59002;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42011(float f, float f2) {
        InterfaceC7577 interfaceC7577 = this.f58992;
        if (interfaceC7577.mo20718()) {
            return;
        }
        ImageView imageViewM42022 = m42022();
        boolean z = this.f58982;
        Matrix matrix = this.f58996;
        if (!z) {
            float[] fArr = this.f58986;
            matrix.getValues(fArr);
            float fRound = Math.round(fArr[2]);
            float fRound2 = Math.round(fArr[5]);
            matrix.postTranslate(f, f2);
            m42006();
            matrix.getValues(fArr);
            float fRound3 = Math.round(fArr[2]);
            float fRound4 = Math.round(fArr[5]);
            if (fRound != fRound3 || fRound2 != fRound4) {
                this.f58982 = true;
            }
        } else {
            matrix.postTranslate(f, f2);
            m42006();
        }
        ViewParent parent = imageViewM42022.getParent();
        if (interfaceC7577.mo20718() || this.f58982) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i = this.f58999;
        if ((i == 2 || ((i == 0 && f >= 1.0f) || (i == 1 && f <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m42020(float f, float f2) {
        ImageView imageViewM42022 = m42022();
        RunnableC21002 runnableC21002 = new RunnableC21002(imageViewM42022.getContext(), this);
        this.f58988 = runnableC21002;
        runnableC21002.m48019(m42007(imageViewM42022), m42001(imageViewM42022), (int) f, (int) f2);
        imageViewM42022.post(this.f58988);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ImageView imageViewM42022 = m42022();
        if (imageViewM42022 != null) {
            if (this.f58993) {
                int top = imageViewM42022.getTop();
                int right = imageViewM42022.getRight();
                int bottom = imageViewM42022.getBottom();
                int left = imageViewM42022.getLeft();
                if (top == this.f58994 && bottom == this.f58984 && left == this.f58989 && right == this.f58987) {
                    return;
                }
                m42004(imageViewM42022.getDrawable());
                this.f58994 = top;
                this.f58987 = right;
                this.f58984 = bottom;
                this.f58989 = left;
                return;
            }
            m42004(imageViewM42022.getDrawable());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42012(float f, float f2, float f3) {
        if (m42018() > 0.5f || f > 1.0f) {
            this.f58995 = f2;
            this.f59000 = f3;
            this.f58996.postScale(f, f, f2, f3);
            m42006();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView;
        boolean z = false;
        if (this.f58993 && (imageView = (ImageView) view) != null && imageView.getDrawable() != null) {
            ViewParent parent = view.getParent();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                RunnableC21002 runnableC21002 = this.f58988;
                if (runnableC21002 != null) {
                    runnableC21002.m48018();
                    this.f58988 = null;
                }
                this.f58982 = false;
            } else if (actionMasked == 1 || actionMasked == 3) {
                float fM42018 = m42018();
                if (fM42018 < 1.0f) {
                    view.post(new RunnableC14288(this, fM42018, 1.0f, this.f58995, this.f59000));
                } else if (fM42018 > 3.0f) {
                    view.post(new RunnableC14288(this, fM42018, 3.0f, this.f58995, this.f59000));
                }
                z = true;
            } else if (actionMasked == 5) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.f58982 = true;
            }
            InterfaceC7577 interfaceC7577 = this.f58992;
            if (interfaceC7577 != null) {
                interfaceC7577.mo20717(motionEvent);
                z = true;
            }
            GestureDetector gestureDetector = this.f58983;
            if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42013(View.OnLongClickListener onLongClickListener) {
        this.f58985 = onLongClickListener;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m42021(float f, float f2, float f3) {
        ImageView imageViewM42022 = m42022();
        if (imageViewM42022 == null || f < 1.0f || f > 3.0f) {
            return;
        }
        imageViewM42022.post(new RunnableC14288(this, m42018(), f, f2, f3));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m42016() {
        ImageView imageViewM42022 = m42022();
        if (imageViewM42022 != null) {
            if (this.f58993) {
                if (!(imageViewM42022 instanceof InterfaceC12051)) {
                    ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
                    if (!scaleType.equals(imageViewM42022.getScaleType())) {
                        imageViewM42022.setScaleType(scaleType);
                    }
                }
                m42004(imageViewM42022.getDrawable());
                return;
            }
            Matrix matrix = this.f58996;
            matrix.reset();
            matrix.postRotate(0.0f);
            m42006();
            m42009(m42015());
            m42000();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Matrix m42015() {
        Matrix matrix = this.f58997;
        Matrix matrix2 = this.f58991;
        matrix2.set(matrix);
        matrix2.postConcat(this.f58996);
        return matrix2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m42006() {
        if (m42000()) {
            m42009(m42015());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m42000() {
        RectF rectFM42002;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        ImageView imageViewM42022 = m42022();
        if (imageViewM42022 == null || (rectFM42002 = m42002(m42015())) == null) {
            return false;
        }
        float fHeight = rectFM42002.height();
        float fWidth = rectFM42002.width();
        float fM42001 = m42001(imageViewM42022);
        float f7 = 0.0f;
        if (fHeight <= fM42001) {
            int i = C3848.f13153[this.f59002.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    fM42001 -= fHeight;
                    f2 = rectFM42002.top;
                } else {
                    fM42001 = (fM42001 - fHeight) / 2.0f;
                    f2 = rectFM42002.top;
                }
            } else {
                f = rectFM42002.top;
                f3 = -f;
            }
        } else {
            f = rectFM42002.top;
            if (f > 0.0f) {
                f3 = -f;
            } else {
                f2 = rectFM42002.bottom;
                f3 = f2 < fM42001 ? fM42001 - f2 : 0.0f;
            }
        }
        float fM42007 = m42007(imageViewM42022);
        if (fWidth <= fM42007) {
            int i2 = C3848.f13153[this.f59002.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    f5 = fM42007 - fWidth;
                    f6 = rectFM42002.left;
                } else {
                    f5 = (fM42007 - fWidth) / 2.0f;
                    f6 = rectFM42002.left;
                }
                f4 = f5 - f6;
            } else {
                f4 = -rectFM42002.left;
            }
            f7 = f4;
            this.f58999 = 2;
        } else {
            float f8 = rectFM42002.left;
            if (f8 > 0.0f) {
                this.f58999 = 0;
                f7 = -f8;
            } else {
                float f9 = rectFM42002.right;
                if (f9 < fM42007) {
                    f7 = fM42007 - f9;
                    this.f58999 = 1;
                } else {
                    this.f58999 = -1;
                }
            }
        }
        this.f58996.postTranslate(f7, f3);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private RectF m42002(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewM42022 = m42022();
        if (imageViewM42022 == null || (drawable = imageViewM42022.getDrawable()) == null) {
            return null;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f58998;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        matrix.mapRect(rectF);
        return rectF;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float m42018() {
        Matrix matrix = this.f58996;
        float[] fArr = this.f59001;
        matrix.getValues(fArr);
        float fPow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m42009(Matrix matrix) {
        ImageView imageViewM42022 = m42022();
        if (imageViewM42022 != null) {
            ImageView imageViewM42023 = m42022();
            if (imageViewM42023 != null && !(imageViewM42023 instanceof InterfaceC12051) && !ImageView.ScaleType.MATRIX.equals(imageViewM42023.getScaleType())) {
                throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
            }
            imageViewM42022.setImageMatrix(matrix);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42004(Drawable drawable) {
        ImageView imageViewM42022 = m42022();
        if (imageViewM42022 == null || drawable == null) {
            return;
        }
        float fM42007 = m42007(imageViewM42022);
        float fM42001 = m42001(imageViewM42022);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f58997;
        matrix.reset();
        float f = intrinsicWidth;
        float f2 = fM42007 / f;
        float f3 = intrinsicHeight;
        float f4 = fM42001 / f3;
        ImageView.ScaleType scaleType = this.f59002;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((fM42007 - f) / 2.0f, (fM42001 - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f2, f4);
            matrix.postScale(fMax, fMax);
            matrix.postTranslate((fM42007 - (f * fMax)) / 2.0f, (fM42001 - (f3 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f2, f4));
            matrix.postScale(fMin, fMin);
            matrix.postTranslate((fM42007 - (f * fMin)) / 2.0f, (fM42001 - (f3 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM42007, fM42001);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = C3848.f13153[this.f59002.ordinal()];
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
        Matrix matrix2 = this.f58996;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        m42006();
        m42009(m42015());
        m42000();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m42007(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m42001(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }
}
