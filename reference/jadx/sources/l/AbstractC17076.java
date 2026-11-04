package l;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺ᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4WH */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17076 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40211(int i) {
        return (i & 240) >>> 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m40213(short[] sArr) {
        Arrays.fill(sArr, (short) 1024);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40212(Canvas canvas, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Layout layoutM26319 = C10200.m26319(spanned);
            if (layoutM26319 != null) {
                return layoutM26319.getWidth();
            }
            TextView textViewM4534 = C1252.m4534(spanned);
            if (textViewM4534 != null) {
                return (textViewM4534.getWidth() - textViewM4534.getPaddingLeft()) - textViewM4534.getPaddingRight();
            }
        }
        return canvas.getWidth();
    }
}
