package l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes3.dex */
public final class C12301 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Matrix f39538 = new Matrix();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39539;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f39540;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Path f39541;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Paint f39542;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23490 f39543;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public PathMeasure f39544;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Path f39545;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f39546;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Paint f39547;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14307 f39548;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Boolean f39549;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f39550;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Matrix f39551;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f39552;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f39553;

    public C12301() {
        this.f39551 = new Matrix();
        this.f39550 = 0.0f;
        this.f39540 = 0.0f;
        this.f39552 = 0.0f;
        this.f39546 = 0.0f;
        this.f39539 = 255;
        this.f39553 = null;
        this.f39549 = null;
        this.f39548 = new C14307();
        this.f39543 = new C23490();
        this.f39545 = new Path();
        this.f39541 = new Path();
    }

    public C12301(C12301 c12301) {
        this.f39551 = new Matrix();
        this.f39550 = 0.0f;
        this.f39540 = 0.0f;
        this.f39552 = 0.0f;
        this.f39546 = 0.0f;
        this.f39539 = 255;
        this.f39553 = null;
        this.f39549 = null;
        C14307 c14307 = new C14307();
        this.f39548 = c14307;
        this.f39543 = new C23490(c12301.f39543, c14307);
        this.f39545 = new Path(c12301.f39545);
        this.f39541 = new Path(c12301.f39541);
        this.f39550 = c12301.f39550;
        this.f39540 = c12301.f39540;
        this.f39552 = c12301.f39552;
        this.f39546 = c12301.f39546;
        this.f39539 = c12301.f39539;
        this.f39553 = c12301.f39553;
        String str = c12301.f39553;
        if (str != null) {
            c14307.put(str, this);
        }
        this.f39549 = c12301.f39549;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m30696(C23490 c23490, Matrix matrix, Canvas canvas, int i, int i2) {
        C12301 c12301;
        float f;
        int i3;
        float f2;
        C12301 c12302 = this;
        Matrix matrix2 = c23490.f75950;
        ArrayList arrayList = c23490.f75951;
        matrix2.set(matrix);
        Matrix matrix3 = c23490.f75950;
        matrix3.preConcat(c23490.f75953);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            AbstractC3352 abstractC3352 = (AbstractC3352) arrayList.get(i4);
            if (abstractC3352 instanceof C23490) {
                m30696((C23490) abstractC3352, matrix3, canvas, i, i2);
            } else {
                if (abstractC3352 instanceof AbstractC20506) {
                    AbstractC20506 abstractC20506 = (AbstractC20506) abstractC3352;
                    float f3 = i / c12302.f39552;
                    float f4 = i2 / c12302.f39546;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix4 = c12302.f39551;
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
                        c12301 = this;
                    } else {
                        c12301 = this;
                        Path path = c12301.f39545;
                        path.reset();
                        C11783[] c11783Arr = abstractC20506.f65698;
                        if (c11783Arr != null) {
                            try {
                                C25210.m56207(c11783Arr, path);
                            } catch (ArrayIndexOutOfBoundsException unused) {
                                path.reset();
                            }
                        }
                        Path path2 = c12301.f39541;
                        path2.reset();
                        if (abstractC20506 instanceof C17522) {
                            path2.setFillType(abstractC20506.f65696 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C16030 c16030 = (C16030) abstractC20506;
                            float f6 = c16030.f52008;
                            if (f6 != 0.0f || c16030.f52006 != 1.0f) {
                                float f7 = c16030.f52004;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (c16030.f52006 + f7) % 1.0f;
                                if (c12301.f39544 == null) {
                                    c12301.f39544 = new PathMeasure();
                                }
                                c12301.f39544.setPath(path, false);
                                float length = c12301.f39544.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    c12301.f39544.getSegment(f10, length, path, true);
                                    f = 0.0f;
                                    c12301.f39544.getSegment(0.0f, f11, path, true);
                                } else {
                                    c12301.f39544.getSegment(f10, f11, path, true);
                                    f = 0.0f;
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            if (c16030.f52003.m40905()) {
                                C17422 c17422 = c16030.f52003;
                                if (c12301.f39542 == null) {
                                    i3 = 16777215;
                                    Paint paint = new Paint(1);
                                    c12301.f39542 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i3 = 16777215;
                                }
                                Paint paint2 = c12301.f39542;
                                if (c17422.m40904()) {
                                    Shader shaderM40906 = c17422.m40906();
                                    C17359.requireNonNull(shaderM40906);
                                    shaderM40906.setLocalMatrix(matrix4);
                                    paint2.setShader(shaderM40906);
                                    paint2.setAlpha(Math.round(c16030.f52007 * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int iM40901 = c17422.m40901();
                                    float f12 = c16030.f52007;
                                    int i5 = C24236.f78487;
                                    paint2.setColor((iM40901 & i3) | (((int) (Color.alpha(iM40901) * f12)) << 24));
                                }
                                f2 = 255.0f;
                                paint2.setColorFilter(null);
                                path2.setFillType(c16030.f65696 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                i3 = 16777215;
                                f2 = 255.0f;
                            }
                            if (c16030.f52000.m40905()) {
                                C17422 c17423 = c16030.f52000;
                                if (c12301.f39547 == null) {
                                    Paint paint3 = new Paint(1);
                                    c12301.f39547 = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = c12301.f39547;
                                Paint.Join join = c16030.f52001;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c16030.f51999;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c16030.f52009);
                                if (c17423.m40904()) {
                                    Shader shaderM40907 = c17423.m40906();
                                    C17359.requireNonNull(shaderM40907);
                                    shaderM40907.setLocalMatrix(matrix4);
                                    paint4.setShader(shaderM40907);
                                    paint4.setAlpha(Math.round(c16030.f52002 * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int iM40902 = c17423.m40901();
                                    float f13 = c16030.f52002;
                                    int i6 = C24236.f78487;
                                    paint4.setColor((iM40902 & i3) | (((int) (Color.alpha(iM40902) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c16030.f52005 * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i4++;
                c12302 = c12301;
                c = 0;
            }
            c12301 = c12302;
            i4++;
            c12302 = c12301;
            c = 0;
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30697(Canvas canvas, int i, int i2) {
        m30696(this.f39543, f39538, canvas, i, i2);
    }
}
