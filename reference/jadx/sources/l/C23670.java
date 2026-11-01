package l;

import android.os.Build;
import android.text.TextPaint;

/* JADX INFO: renamed from: l.᩻ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAME */
/* JADX INFO: loaded from: classes.dex */
public final class C23670 implements InterfaceC13523 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f76594 = new ThreadLocal();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextPaint f76595;

    public C23670() {
        TextPaint textPaint = new TextPaint();
        this.f76595 = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52113(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23 && i3 > i4) {
            return false;
        }
        ThreadLocal threadLocal = f76594;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb = (StringBuilder) threadLocal.get();
        sb.setLength(0);
        while (i < i2) {
            sb.append(charSequence.charAt(i));
            i++;
        }
        return C2663.m8192(this.f76595, sb.toString());
    }
}
