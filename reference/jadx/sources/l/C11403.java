package l;

import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28V5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11403 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f35866;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Typeface f35867;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char[] f35868;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float[] f35869;

    public C11403(Typeface typeface) {
        float[] fArr = new float[C16624.f53751];
        this.f35869 = fArr;
        this.f35868 = new char[40];
        this.f35867 = typeface;
        Paint paint = new Paint(1);
        this.f35866 = paint;
        paint.setTypeface(typeface);
        paint.setTextSize(15.0f);
        Arrays.fill(fArr, Float.NaN);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28755(C11403 c11403, char c, char c2) {
        char[] cArr = c11403.f35868;
        int iM39323 = C16624.m39323(c);
        int iM39324 = C16624.m39323(c2);
        float fM28753 = c11403.m28753(iM39323);
        float fM28754 = c11403.m28753(iM39324);
        for (int i = 0; i < 40; i += 2) {
            cArr[i] = c;
            cArr[i + 1] = c2;
        }
        return Math.abs(((fM28753 + fM28754) * 20.0f) - c11403.f35866.measureText(cArr, 0, 40)) < 1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m28753(int i) {
        float[] fArr = this.f35869;
        float f = fArr[i];
        if (!Float.isNaN(f)) {
            return f;
        }
        char c = C16624.f53752[i];
        char[] cArr = this.f35868;
        cArr[0] = c;
        float fMeasureText = this.f35866.measureText(cArr, 0, 1);
        fArr[i] = fMeasureText;
        return fMeasureText;
    }
}
