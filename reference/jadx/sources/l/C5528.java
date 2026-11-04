package l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚ۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5528 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Matrix f19222 = new Matrix();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f19223;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f19224;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Path f19225;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Paint f19226;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19698 f19227;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public PathMeasure f19228;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Path f19229;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f19230;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Paint f19231;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14307 f19232;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Boolean f19233;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f19234;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Matrix f19235;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f19236;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f19237;

    public C5528() {
        this.f19235 = new Matrix();
        this.f19234 = 0.0f;
        this.f19224 = 0.0f;
        this.f19236 = 0.0f;
        this.f19230 = 0.0f;
        this.f19223 = 255;
        this.f19237 = null;
        this.f19233 = null;
        this.f19232 = new C14307();
        this.f19227 = new C19698();
        this.f19229 = new Path();
        this.f19225 = new Path();
    }

    public void setRootAlpha(int i) {
        this.f19223 = i;
    }

    public int getRootAlpha() {
        return this.f19223;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public C5528(C5528 c5528) {
        this.f19235 = new Matrix();
        this.f19234 = 0.0f;
        this.f19224 = 0.0f;
        this.f19236 = 0.0f;
        this.f19230 = 0.0f;
        this.f19223 = 255;
        this.f19237 = null;
        this.f19233 = null;
        C14307 c14307 = new C14307();
        this.f19232 = c14307;
        this.f19227 = new C19698(c5528.f19227, c14307);
        this.f19229 = new Path(c5528.f19229);
        this.f19225 = new Path(c5528.f19225);
        this.f19234 = c5528.f19234;
        this.f19224 = c5528.f19224;
        this.f19236 = c5528.f19236;
        this.f19230 = c5528.f19230;
        this.f19223 = c5528.f19223;
        this.f19237 = c5528.f19237;
        String str = c5528.f19237;
        if (str != null) {
            c14307.put(str, this);
        }
        this.f19233 = c5528.f19233;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16444(C19698 c19698, Matrix matrix, Canvas canvas, int i, int i2) {
        C5528 c5528;
        float f;
        int i3;
        float f2;
        C5528 c5529 = this;
        Matrix matrix2 = c19698.f63423;
        ArrayList arrayList = c19698.f63424;
        matrix2.set(matrix);
        Matrix matrix3 = c19698.f63423;
        matrix3.preConcat(c19698.f63426);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            AbstractC15222 abstractC15222 = (AbstractC15222) arrayList.get(i4);
            if (abstractC15222 instanceof C19698) {
                m16444((C19698) abstractC15222, matrix3, canvas, i, i2);
            } else {
                if (abstractC15222 instanceof AbstractC12985) {
                    AbstractC12985 abstractC12985 = (AbstractC12985) abstractC15222;
                    float f3 = i / c5529.f19236;
                    float f4 = i2 / c5529.f19230;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix4 = c5529.f19235;
                    matrix4.set(matrix3);
                    matrix4.postScale(f3, f4);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f5) / fMax : 0.0f;
                    if (fAbs == 0.0f) {
                        c5528 = this;
                    } else {
                        c5528 = this;
                        Path path = c5528.f19229;
                        path.reset();
                        C11783[] c11783Arr = abstractC12985.f41619;
                        if (c11783Arr != null) {
                            C25210.m56207(c11783Arr, path);
                        }
                        Path path2 = c5528.f19225;
                        path2.reset();
                        if (abstractC12985 instanceof C10747) {
                            path2.setFillType(abstractC12985.f41617 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C22682 c22682 = (C22682) abstractC12985;
                            float f6 = c22682.f73652;
                            if (f6 != 0.0f || c22682.f73653 != 1.0f) {
                                float f7 = c22682.f73654;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (c22682.f73653 + f7) % 1.0f;
                                if (c5528.f19228 == null) {
                                    c5528.f19228 = new PathMeasure();
                                }
                                c5528.f19228.setPath(path, false);
                                float length = c5528.f19228.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    c5528.f19228.getSegment(f10, length, path, true);
                                    f = 0.0f;
                                    c5528.f19228.getSegment(0.0f, f11, path, true);
                                } else {
                                    c5528.f19228.getSegment(f10, f11, path, true);
                                    f = 0.0f;
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            if (c22682.f73655.m40905()) {
                                C17422 c17422 = c22682.f73655;
                                if (c5528.f19226 == null) {
                                    i3 = 16777215;
                                    Paint paint = new Paint(1);
                                    c5528.f19226 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i3 = 16777215;
                                }
                                Paint paint2 = c5528.f19226;
                                if (c17422.m40904()) {
                                    Shader shaderM40906 = c17422.m40906();
                                    shaderM40906.setLocalMatrix(matrix4);
                                    paint2.setShader(shaderM40906);
                                    paint2.setAlpha(Math.round(c22682.f73656 * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int iM40901 = c17422.m40901();
                                    float f12 = c22682.f73656;
                                    PorterDuff.Mode mode = C24920.f80648;
                                    paint2.setColor((iM40901 & i3) | (((int) (Color.alpha(iM40901) * f12)) << 24));
                                }
                                f2 = 255.0f;
                                paint2.setColorFilter(null);
                                path2.setFillType(c22682.f41617 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                i3 = 16777215;
                                f2 = 255.0f;
                            }
                            if (c22682.f73650.m40905()) {
                                C17422 c17423 = c22682.f73650;
                                if (c5528.f19231 == null) {
                                    Paint paint3 = new Paint(1);
                                    c5528.f19231 = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = c5528.f19231;
                                Paint.Join join = c22682.f73647;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c22682.f73648;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c22682.f73649);
                                if (c17423.m40904()) {
                                    Shader shaderM40907 = c17423.m40906();
                                    shaderM40907.setLocalMatrix(matrix4);
                                    paint4.setShader(shaderM40907);
                                    paint4.setAlpha(Math.round(c22682.f73651 * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int iM40902 = c17423.m40901();
                                    float f13 = c22682.f73651;
                                    PorterDuff.Mode mode2 = C24920.f80648;
                                    paint4.setColor((iM40902 & i3) | (((int) (Color.alpha(iM40902) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c22682.f73657 * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i4++;
                c5529 = c5528;
                c = 0;
            }
            c5528 = c5529;
            i4++;
            c5529 = c5528;
            c = 0;
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16445(Canvas canvas, int i, int i2) {
        m16444(this.f19227, f19222, canvas, i, i2);
    }
}
