package l;

import android.os.Build;
import android.text.TextPaint;

/* JADX INFO: renamed from: l.ۡۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAME */
/* JADX INFO: loaded from: classes4.dex */
public final class C9308 implements InterfaceC5186 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f30244 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextPaint f30245;

    public C9308() {
        TextPaint textPaint = new TextPaint();
        this.f30245 = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24533(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23 && i3 > i4) {
            return false;
        }
        ThreadLocal threadLocal = f30244;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb = (StringBuilder) threadLocal.get();
        sb.setLength(0);
        while (i < i2) {
            sb.append(charSequence.charAt(i));
            i++;
        }
        return C2089.m7187(this.f30245, sb.toString());
    }
}
