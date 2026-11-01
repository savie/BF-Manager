package l;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۗ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1WB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3115 extends Animation {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f11729;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f11730;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f11734;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f11735;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f11737;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f11738;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f11739;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f11740;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f11741;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f11744;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f11746;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Camera f11743 = new Camera();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f11745 = 1.0f;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f11732 = 1.0f;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f11736 = 1.0f;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final RectF f11731 = new RectF();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RectF f11742 = new RectF();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Matrix f11733 = new Matrix();

    static {
        f11729 = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        f11730 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3115 m9345(View view) {
        WeakHashMap weakHashMap = f11730;
        C3115 c3115 = (C3115) weakHashMap.get(view);
        if (c3115 != null && c3115 == view.getAnimation()) {
            return c3115;
        }
        C3115 c3116 = new C3115(view);
        weakHashMap.put(view, c3116);
        return c3116;
    }

    public C3115(View view) {
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        this.f11738 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m9355() {
        return this.f11745;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9356(float f) {
        if (this.f11745 != f) {
            this.f11745 = f;
            View view = (View) this.f11738.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m9362() {
        return this.f11744;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9366(float f) {
        if (this.f11739 && this.f11744 == f) {
            return;
        }
        m9349();
        this.f11739 = true;
        this.f11744 = f;
        m9348();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m9351() {
        return this.f11735;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m9363(float f) {
        if (this.f11739 && this.f11735 == f) {
            return;
        }
        m9349();
        this.f11739 = true;
        this.f11735 = f;
        m9348();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m9357() {
        return this.f11741;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m9352(float f) {
        if (this.f11741 != f) {
            m9349();
            this.f11741 = f;
            m9348();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float m9372() {
        return this.f11737;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m9358(float f) {
        if (this.f11737 != f) {
            m9349();
            this.f11737 = f;
            m9348();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float m9364() {
        return this.f11746;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m9373(float f) {
        if (this.f11746 != f) {
            m9349();
            this.f11746 = f;
            m9348();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float m9353() {
        return this.f11732;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m9350(float f) {
        if (this.f11732 != f) {
            m9349();
            this.f11732 = f;
            m9348();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m9359() {
        return this.f11736;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m9365(float f) {
        if (this.f11736 != f) {
            m9349();
            this.f11736 = f;
            m9348();
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m9374() {
        View view = (View) this.f11738.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m9367() {
        View view = (View) this.f11738.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float m9371() {
        return this.f11734;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m9354(float f) {
        if (this.f11734 != f) {
            m9349();
            this.f11734 = f;
            m9348();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m9369() {
        return this.f11740;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m9360(float f) {
        if (this.f11740 != f) {
            m9349();
            this.f11740 = f;
            m9348();
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final float m9361() {
        View view = (View) this.f11738.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getLeft() + this.f11734;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m9375(float f) {
        View view = (View) this.f11738.get();
        if (view != null) {
            m9354(f - view.getLeft());
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final float m9370() {
        View view = (View) this.f11738.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getTop() + this.f11740;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m9368(float f) {
        View view = (View) this.f11738.get();
        if (view != null) {
            m9360(f - view.getTop());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m9349() {
        View view = (View) this.f11738.get();
        if (view != null) {
            m9347(view, this.f11731);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m9348() {
        View view = (View) this.f11738.get();
        if (view == null || view.getParent() == null) {
            return;
        }
        RectF rectF = this.f11742;
        m9347(view, rectF);
        rectF.union(this.f11731);
        ((View) view.getParent()).invalidate((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9347(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Matrix matrix = this.f11733;
        matrix.reset();
        m9346(view, matrix);
        matrix.mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        float f = rectF.right;
        float f2 = rectF.left;
        if (f < f2) {
            rectF.right = f2;
            rectF.left = f;
        }
        float f3 = rectF.bottom;
        float f4 = rectF.top;
        if (f3 < f4) {
            rectF.top = f3;
            rectF.bottom = f4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9346(View view, Matrix matrix) {
        float width = view.getWidth();
        float height = view.getHeight();
        boolean z = this.f11739;
        float f = z ? this.f11744 : width / 2.0f;
        float f2 = z ? this.f11735 : height / 2.0f;
        float f3 = this.f11737;
        float f4 = this.f11746;
        float f5 = this.f11741;
        if (f3 != 0.0f || f4 != 0.0f || f5 != 0.0f) {
            Camera camera = this.f11743;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        float f6 = this.f11732;
        float f7 = this.f11736;
        if (f6 != 1.0f || f7 != 1.0f) {
            matrix.postScale(f6, f7);
            matrix.postTranslate(((f6 * width) - width) * (-(f / width)), ((f7 * height) - height) * (-(f2 / height)));
        }
        matrix.postTranslate(this.f11734, this.f11740);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        View view = (View) this.f11738.get();
        if (view != null) {
            transformation.setAlpha(this.f11745);
            m9346(view, transformation.getMatrix());
        }
    }
}
