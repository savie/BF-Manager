package l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes3.dex */
public final class C10529 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Matrix f36038 = new Matrix();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public PathMeasure f36039;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Matrix f36040;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f36041;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f36042;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Boolean f36043;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C8412 f36044;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Paint f36045;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Path f36046;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f36047;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Paint f36048;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f36049;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f36050;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21445 f36051;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Path f36052;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f36053;

    public C10529() {
        this.f36040 = new Matrix();
        this.f36047 = 0.0f;
        this.f36042 = 0.0f;
        this.f36050 = 0.0f;
        this.f36049 = 0.0f;
        this.f36041 = 255;
        this.f36053 = null;
        this.f36043 = null;
        this.f36051 = new C21445();
        this.f36044 = new C8412();
        this.f36052 = new Path();
        this.f36046 = new Path();
    }

    public C10529(C10529 c10529) {
        this.f36040 = new Matrix();
        this.f36047 = 0.0f;
        this.f36042 = 0.0f;
        this.f36050 = 0.0f;
        this.f36049 = 0.0f;
        this.f36041 = 255;
        this.f36053 = null;
        this.f36043 = null;
        C21445 c21445 = new C21445();
        this.f36051 = c21445;
        this.f36044 = new C8412(c10529.f36044, c21445);
        this.f36052 = new Path(c10529.f36052);
        this.f36046 = new Path(c10529.f36046);
        this.f36047 = c10529.f36047;
        this.f36042 = c10529.f36042;
        this.f36050 = c10529.f36050;
        this.f36049 = c10529.f36049;
        this.f36041 = c10529.f36041;
        this.f36053 = c10529.f36053;
        String str = c10529.f36053;
        if (str != null) {
            c21445.put(str, this);
        }
        this.f36043 = c10529.f36043;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26670(C8412 c8412, Matrix matrix, Canvas canvas, int i, int i2) {
        C10529 c10529;
        float f;
        int i3;
        float f2;
        C10529 c105210 = this;
        Matrix matrix2 = c8412.f29162;
        ArrayList arrayList = c8412.f29163;
        matrix2.set(matrix);
        Matrix matrix3 = c8412.f29162;
        matrix3.preConcat(c8412.f29166);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            AbstractC19701 abstractC19701 = (AbstractC19701) arrayList.get(i4);
            if (abstractC19701 instanceof C8412) {
                m26670((C8412) abstractC19701, matrix3, canvas, i, i2);
            } else {
                if (abstractC19701 instanceof AbstractC9118) {
                    AbstractC9118 abstractC9118 = (AbstractC9118) abstractC19701;
                    float f3 = i / c105210.f36050;
                    float f4 = i2 / c105210.f36049;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix4 = c105210.f36040;
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
                        c10529 = this;
                    } else {
                        c10529 = this;
                        Path path = c10529.f36052;
                        path.reset();
                        C5486[] c5486Arr = abstractC9118.f31055;
                        if (c5486Arr != null) {
                            try {
                                C22420.m49738(c5486Arr, path);
                            } catch (ArrayIndexOutOfBoundsException unused) {
                                path.reset();
                            }
                        }
                        Path path2 = c10529.f36046;
                        path2.reset();
                        if (abstractC9118 instanceof C18289) {
                            path2.setFillType(abstractC9118.f31053 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            C18995 c18995 = (C18995) abstractC9118;
                            float f6 = c18995.f61483;
                            if (f6 != 0.0f || c18995.f61484 != 1.0f) {
                                float f7 = c18995.f61482;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (c18995.f61484 + f7) % 1.0f;
                                if (c10529.f36039 == null) {
                                    c10529.f36039 = new PathMeasure();
                                }
                                c10529.f36039.setPath(path, false);
                                float length = c10529.f36039.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    c10529.f36039.getSegment(f10, length, path, true);
                                    f = 0.0f;
                                    c10529.f36039.getSegment(0.0f, f11, path, true);
                                } else {
                                    c10529.f36039.getSegment(f10, f11, path, true);
                                    f = 0.0f;
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            if (c18995.f61485.m4122()) {
                                C1107 c1107 = c18995.f61485;
                                if (c10529.f36045 == null) {
                                    i3 = 16777215;
                                    Paint paint = new Paint(1);
                                    c10529.f36045 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i3 = 16777215;
                                }
                                Paint paint2 = c10529.f36045;
                                if (c1107.m4123()) {
                                    Shader shaderM4124 = c1107.m4124();
                                    C13638.requireNonNull(shaderM4124);
                                    shaderM4124.setLocalMatrix(matrix4);
                                    paint2.setShader(shaderM4124);
                                    paint2.setAlpha(Math.round(c18995.f61478 * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int iM4119 = c1107.m4119();
                                    float f12 = c18995.f61478;
                                    int i5 = C21111.f68767;
                                    paint2.setColor((iM4119 & i3) | (((int) (Color.alpha(iM4119) * f12)) << 24));
                                }
                                f2 = 255.0f;
                                paint2.setColorFilter(null);
                                path2.setFillType(c18995.f31053 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                i3 = 16777215;
                                f2 = 255.0f;
                            }
                            if (c18995.f61480.m4122()) {
                                C1107 c1108 = c18995.f61480;
                                if (c10529.f36048 == null) {
                                    Paint paint3 = new Paint(1);
                                    c10529.f36048 = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = c10529.f36048;
                                Paint.Join join = c18995.f61479;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = c18995.f61477;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(c18995.f61486);
                                if (c1108.m4123()) {
                                    Shader shaderM4125 = c1108.m4124();
                                    C13638.requireNonNull(shaderM4125);
                                    shaderM4125.setLocalMatrix(matrix4);
                                    paint4.setShader(shaderM4125);
                                    paint4.setAlpha(Math.round(c18995.f61476 * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int iM41110 = c1108.m4119();
                                    float f13 = c18995.f61476;
                                    int i6 = C21111.f68767;
                                    paint4.setColor((iM41110 & i3) | (((int) (Color.alpha(iM41110) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(c18995.f61481 * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i4++;
                c105210 = c10529;
                c = 0;
            }
            c10529 = c105210;
            i4++;
            c105210 = c10529;
            c = 0;
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26671(Canvas canvas, int i, int i2) {
        m26670(this.f36044, f36038, canvas, i, i2);
    }
}
