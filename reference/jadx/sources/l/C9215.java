package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.ۡ᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3346 */
/* JADX INFO: loaded from: classes3.dex */
public class C9215 extends AbstractC19798 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Path f31335 = new Path();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Matrix f31336 = new Matrix();

    public C9215(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21208.f69010);
        try {
            String strM30835 = C12398.m30835(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strM30835 == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            m23734(C22420.m49743(strM30835));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public C9215(Path path) {
        m23734(path);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23734(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        Matrix matrix = this.f31336;
        matrix.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fSqrt = 1.0f / ((float) Math.sqrt((f6 * f6) + (f5 * f5)));
        matrix.postScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(matrix, this.f31335);
    }

    @Override // l.AbstractC19798
    public final Path getPath(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float fSqrt = (float) Math.sqrt((f6 * f6) + (f5 * f5));
        double dAtan2 = Math.atan2(f6, f5);
        Matrix matrix = this.f31336;
        matrix.setScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f, f2);
        Path path = new Path();
        this.f31335.transform(matrix, path);
        return path;
    }
}
