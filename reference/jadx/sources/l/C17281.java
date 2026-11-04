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

/* JADX INFO: renamed from: l.ܽۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1WB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17281 extends Animation {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f56288;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f56289;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f56291;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f56292;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f56293;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f56295;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f56297;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f56298;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f56299;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f56303;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f56305;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Camera f56290 = new Camera();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f56304 = 1.0f;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f56296 = 1.0f;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f56294 = 1.0f;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final RectF f56302 = new RectF();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RectF f56301 = new RectF();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Matrix f56300 = new Matrix();

    static {
        f56289 = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        f56288 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17281 m40570(View view) {
        WeakHashMap weakHashMap = f56288;
        C17281 c17281 = (C17281) weakHashMap.get(view);
        if (c17281 != null && c17281 == view.getAnimation()) {
            return c17281;
        }
        C17281 c17282 = new C17281(view);
        weakHashMap.put(view, c17282);
        return c17282;
    }

    public C17281(View view) {
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        this.f56299 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m40578() {
        return this.f56304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40579(float f) {
        if (this.f56304 != f) {
            this.f56304 = f;
            View view = (View) this.f56299.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m40596() {
        return this.f56303;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40597(float f) {
        if (this.f56295 && this.f56303 == f) {
            return;
        }
        m40573();
        this.f56295 = true;
        this.f56303 = f;
        m40574();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m40582() {
        return this.f56298;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m40583(float f) {
        if (this.f56295 && this.f56298 == f) {
            return;
        }
        m40573();
        this.f56295 = true;
        this.f56298 = f;
        m40574();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float m40593() {
        return this.f56292;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m40598(float f) {
        if (this.f56292 != f) {
            m40573();
            this.f56292 = f;
            m40574();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m40587() {
        return this.f56291;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m40594(float f) {
        if (this.f56291 != f) {
            m40573();
            this.f56291 = f;
            m40574();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m40580() {
        return this.f56297;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m40588(float f) {
        if (this.f56297 != f) {
            m40573();
            this.f56297 = f;
            m40574();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m40575() {
        return this.f56296;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m40586(float f) {
        if (this.f56296 != f) {
            m40573();
            this.f56296 = f;
            m40574();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m40584() {
        return this.f56294;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m40581(float f) {
        if (this.f56294 != f) {
            m40573();
            this.f56294 = f;
            m40574();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m40599() {
        View view = (View) this.f56299.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m40590() {
        View view = (View) this.f56299.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m40592() {
        return this.f56293;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40576(float f) {
        if (this.f56293 != f) {
            m40573();
            this.f56293 = f;
            m40574();
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final float m40589() {
        return this.f56305;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40585(float f) {
        if (this.f56305 != f) {
            m40573();
            this.f56305 = f;
            m40574();
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float m40577() {
        View view = (View) this.f56299.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getLeft() + this.f56293;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m40600(float f) {
        View view = (View) this.f56299.get();
        if (view != null) {
            m40576(f - view.getLeft());
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final float m40595() {
        View view = (View) this.f56299.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getTop() + this.f56305;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m40591(float f) {
        View view = (View) this.f56299.get();
        if (view != null) {
            m40585(f - view.getTop());
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private void m40573() {
        View view = (View) this.f56299.get();
        if (view != null) {
            m40572(view, this.f56302);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m40574() {
        View view = (View) this.f56299.get();
        if (view == null || view.getParent() == null) {
            return;
        }
        RectF rectF = this.f56301;
        m40572(view, rectF);
        rectF.union(this.f56302);
        ((View) view.getParent()).invalidate((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m40572(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Matrix matrix = this.f56300;
        matrix.reset();
        m40571(view, matrix);
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
    private void m40571(View view, Matrix matrix) {
        float width = view.getWidth();
        float height = view.getHeight();
        boolean z = this.f56295;
        float f = z ? this.f56303 : width / 2.0f;
        float f2 = z ? this.f56298 : height / 2.0f;
        float f3 = this.f56291;
        float f4 = this.f56297;
        float f5 = this.f56292;
        if (f3 != 0.0f || f4 != 0.0f || f5 != 0.0f) {
            Camera camera = this.f56290;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        float f6 = this.f56296;
        float f7 = this.f56294;
        if (f6 != 1.0f || f7 != 1.0f) {
            matrix.postScale(f6, f7);
            matrix.postTranslate(((f6 * width) - width) * (-(f / width)), ((f7 * height) - height) * (-(f2 / height)));
        }
        matrix.postTranslate(this.f56293, this.f56305);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        View view = (View) this.f56299.get();
        if (view != null) {
            transformation.setAlpha(this.f56304);
            m40571(view, transformation.getMatrix());
        }
    }
}
