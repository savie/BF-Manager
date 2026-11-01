package l;

import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺ۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 28V5 */
/* JADX INFO: loaded from: classes.dex */
public final class C22814 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float[] f74217;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f74218;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Typeface f74219;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] f74220;

    public C22814(Typeface typeface) {
        float[] fArr = new float[C21402.f69584];
        this.f74217 = fArr;
        this.f74220 = new char[40];
        this.f74219 = typeface;
        Paint paint = new Paint(1);
        this.f74218 = paint;
        paint.setTypeface(typeface);
        paint.setTextSize(15.0f);
        Arrays.fill(fArr, Float.NaN);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50491(C22814 c22814, char c, char c2) {
        char[] cArr = c22814.f74220;
        int iM47946 = C21402.m47946(c);
        int iM47947 = C21402.m47946(c2);
        float fM50489 = c22814.m50489(iM47946);
        float fM504810 = c22814.m50489(iM47947);
        for (int i = 0; i < 40; i += 2) {
            cArr[i] = c;
            cArr[i + 1] = c2;
        }
        return Math.abs(((fM50489 + fM504810) * 20.0f) - c22814.f74218.measureText(cArr, 0, 40)) < 1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m50489(int i) {
        float[] fArr = this.f74217;
        float f = fArr[i];
        if (!Float.isNaN(f)) {
            return f;
        }
        char c = C21402.f69582[i];
        char[] cArr = this.f74220;
        cArr[0] = c;
        float fMeasureText = this.f74218.measureText(cArr, 0, 1);
        fArr[i] = fMeasureText;
        return fMeasureText;
    }
}
