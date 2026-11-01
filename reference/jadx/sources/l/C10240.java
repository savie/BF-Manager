package l;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z21V */
/* JADX INFO: loaded from: classes3.dex */
public final class C10240 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextDirectionHeuristic f34930;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f34931;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextPaint f34932;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f34933;

    public C10240(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f34932 = textPaint;
        this.f34930 = textDirectionHeuristic;
        this.f34931 = i;
        this.f34933 = i2;
    }

    public C10240(PrecomputedText.Params params) {
        this.f34932 = params.getTextPaint();
        this.f34930 = params.getTextDirection();
        this.f34931 = params.getBreakStrategy();
        this.f34933 = params.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextPaint m26030() {
        return this.f34932;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextDirectionHeuristic m26033() {
        return this.f34930;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26031() {
        return this.f34931;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m26034() {
        return this.f34933;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26032(C10240 c10240) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && (this.f34931 != c10240.f34931 || this.f34933 != c10240.f34933)) {
            return false;
        }
        TextPaint textPaint = this.f34932;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c10240.f34932;
        TextPaint textPaint3 = c10240.f34932;
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
        if (!(obj instanceof C10240)) {
            return false;
        }
        C10240 c10240 = (C10240) obj;
        return m26032(c10240) && this.f34930 == c10240.f34930;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = this.f34930;
        int i2 = this.f34933;
        int i3 = this.f34931;
        TextPaint textPaint = this.f34932;
        return i >= 24 ? C13638.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2)) : C13638.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f34932;
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
        sb.append(", textDir=" + this.f34930);
        sb.append(", breakStrategy=" + this.f34931);
        sb.append(", hyphenationFrequency=" + this.f34933);
        sb.append(l.d);
        return sb.toString();
    }
}
