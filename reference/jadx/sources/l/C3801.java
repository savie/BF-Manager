package l;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z21V */
/* JADX INFO: loaded from: classes2.dex */
public final class C3801 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12991;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextPaint f12992;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f12993;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextDirectionHeuristic f12994;

    public C3801(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f12992 = textPaint;
        this.f12994 = textDirectionHeuristic;
        this.f12991 = i;
        this.f12993 = i2;
    }

    public C3801(PrecomputedText.Params params) {
        this.f12992 = params.getTextPaint();
        this.f12994 = params.getTextDirection();
        this.f12991 = params.getBreakStrategy();
        this.f12993 = params.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextPaint m12338() {
        return this.f12992;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TextDirectionHeuristic m12336() {
        return this.f12994;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12334() {
        return this.f12991;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m12337() {
        return this.f12993;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12335(C3801 c3801) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && (this.f12991 != c3801.f12991 || this.f12993 != c3801.f12993)) {
            return false;
        }
        TextPaint textPaint = this.f12992;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c3801.f12992;
        TextPaint textPaint3 = c3801.f12992;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint3.getTextScaleX() || textPaint.getTextSkewX() != textPaint3.getTextSkewX() || textPaint.getLetterSpacing() != textPaint3.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint3.getFontFeatureSettings()) || textPaint.getFlags() != textPaint3.getFlags()) {
            return false;
        }
        if (i >= 24) {
            if (!textPaint.getTextLocales().equals(textPaint3.getTextLocales())) {
                return false;
            }
        } else if (!textPaint.getTextLocale().equals(textPaint3.getTextLocale())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            return textPaint3.getTypeface() == null;
        }
        return textPaint.getTypeface().equals(textPaint3.getTypeface());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3801)) {
            return false;
        }
        C3801 c3801 = (C3801) obj;
        return m12335(c3801) && this.f12994 == c3801.f12994;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = this.f12994;
        int i2 = this.f12993;
        int i3 = this.f12991;
        TextPaint textPaint = this.f12992;
        return i >= 24 ? C17359.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2)) : C17359.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f12992;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f12994);
        sb.append(", breakStrategy=" + this.f12991);
        sb.append(", hyphenationFrequency=" + this.f12993);
        sb.append(l.d);
        return sb.toString();
    }
}
