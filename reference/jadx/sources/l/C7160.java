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

/* JADX INFO: renamed from: l.۟֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7160 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Matrix f23926 = new Matrix();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public PathMeasure f23927;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Matrix f23928;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f23929;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f23930;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Boolean f23931;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C19155 f23932;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Paint f23933;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Path f23934;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f23935;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Paint f23936;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f23937;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f23938;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21445 f23939;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Path f23940;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f23941;

    public C7160() {
        this.f23928 = new Matrix();
        this.f23935 = 0.0f;
        this.f23930 = 0.0f;
        this.f23938 = 0.0f;
        this.f23937 = 0.0f;
        this.f23929 = 255;
        this.f23941 = null;
        this.f23931 = null;
        this.f23939 = new C21445();
        this.f23932 = new C19155();
        this.f23940 = new Path();
        this.f23934 = new Path();
    }

    public void setRootAlpha(int i) {
        this.f23929 = i;
    }

    public int getRootAlpha() {
        return this.f23929;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public C7160(C7160 c7160) {
        this.f23928 = new Matrix();
        this.f23935 = 0.0f;
        this.f23930 = 0.0f;
        this.f23938 = 0.0f;
        this.f23937 = 0.0f;
        this.f23929 = 255;
        this.f23941 = null;
        this.f23931 = null;
        C21445 c21445 = new C21445();
        this.f23939 = c21445;
        this.f23932 = new C19155(c7160.f23932, c21445);
        this.f23940 = new Path(c7160.f23940);
        this.f23934 = new Path(c7160.f23934);
        this.f23935 = c7160.f23935;
        this.f23930 = c7160.f23930;
        this.f23938 = c7160.f23938;
        this.f23937 = c7160.f23937;
        this.f23929 = c7160.f23929;
        this.f23941 = c7160.f23941;
        String str = c7160.f23941;
        if (str != null) {
            c21445.put(str, this);
        }
        this.f23931 = c7160.f23931;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19078(C19155 c19155, Matrix matrix, Canvas canvas, int i, int i2) {
        C7160 c7160;
        float f;
        int i3;
        float f2;
        C7160 c7161 = this;
        Matrix matrix2 = c19155.f61877;
        ArrayList arrayList = c19155.f61878;
        matrix2.set(matrix);
        Matrix matrix3 = c19155.f61877;
        matrix3.preConcat(c19155.f61881);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            AbstractC8572 abstractC8572 = (AbstractC8572) arrayList.get(i4);
            if (abstractC8572 instanceof C19155) {
                m19078((C19155) abstractC8572, matrix3, canvas, i, i2);
            } else {
                if (abstractC8572 instanceof AbstractC9983) {
                    AbstractC9983 abstractC9983 = (AbstractC9983) abstractC8572;
                    float f3 = i / c7161.f23938;
                    float f4 = i2 / c7161.f23937;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix4 = c7161.f23928;
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
                        c7160 = this;
                    } else {
                        c7160 = this;
                        Path path = c7160.f23940;
                        path.reset();
                        C5486[] c5486Arr = abstractC9983.f34115;
                        if (c5486Arr != null) {
                            C22420.m49738(c5486Arr, path);
                        }
                        Path path2 = c7160.f23934;
                        path2.reset();
                        if (abstractC9983 instanceof C18449) {
                            path2.setFillType(abstractC9983.f34113 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C7866 c7866 = (C7866) abstractC9983;
                            float f6 = c7866.f25893;
                            if (f6 != 0.0f || c7866.f25892 != 1.0f) {
                                float f7 = c7866.f25894;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (c7866.f25892 + f7) % 1.0f;
                                if (c7160.f23927 == null) {
                                    c7160.f23927 = new PathMeasure();
                                }
                                c7160.f23927.setPath(path, false);
                                float length = c7160.f23927.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    c7160.f23927.getSegment(f10, length, path, true);
                                    f = 0.0f;
                                    c7160.f23927.getSegment(0.0f, f11, path, true);
                                } else {
                                    c7160.f23927.getSegment(f10, f11, path, true);
                                    f = 0.0f;
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            if (c7866.f25889.m4122()) {
                                C1107 c1107 = c7866.f25889;
                                if (c7160.f23933 == null) {
                                    i3 = 16777215;
                                    Paint paint = new Paint(1);
                                    c7160.f23933 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i3 = 16777215;
                                }
                                Paint paint2 = c7160.f23933;
                                if (c1107.m4123()) {
                                    Shader shaderM4124 = c1107.m4124();
                                    shaderM4124.setLocalMatrix(matrix4);
                                    paint2.setShader(shaderM4124);
                                    paint2.setAlpha(Math.round(c7866.f25887 * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int iM4119 = c1107.m4119();
                                    float f12 = c7866.f25887;
                                    PorterDuff.Mode mode = C19861.f63696;
                                    paint2.setColor((iM4119 & i3) | (((int) (Color.alpha(iM4119) * f12)) << 24));
                                }
                                f2 = 255.0f;
                                paint2.setColorFilter(null);
                                path2.setFillType(c7866.f34113 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                i3 = 16777215;
                                f2 = 255.0f;
                            }
                            if (c7866.f25886.m4122()) {
                                C1107 c1108 = c7866.f25886;
                                if (c7160.f23936 == null) {
                                    Paint paint3 = new Paint(1);
                                    c7160.f23936 = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = c7160.f23936;
                                Paint.Join join = c7866.f25888;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c7866.f25891;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c7866.f25890);
                                if (c1108.m4123()) {
                                    Shader shaderM4125 = c1108.m4124();
                                    shaderM4125.setLocalMatrix(matrix4);
                                    paint4.setShader(shaderM4125);
                                    paint4.setAlpha(Math.round(c7866.f25895 * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int iM41110 = c1108.m4119();
                                    float f13 = c7866.f25895;
                                    PorterDuff.Mode mode2 = C19861.f63696;
                                    paint4.setColor((iM41110 & i3) | (((int) (Color.alpha(iM41110) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c7866.f25896 * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i4++;
                c7161 = c7160;
                c = 0;
            }
            c7160 = c7161;
            i4++;
            c7161 = c7160;
            c = 0;
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19079(Canvas canvas, int i, int i2) {
        m19078(this.f23932, f23926, canvas, i, i2);
    }
}
