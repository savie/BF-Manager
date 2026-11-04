package l;

import android.text.SpannableStringBuilder;
import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.۠۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAEE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8485 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m22801(C23352 c23352) {
        return C15300.m36728(JSON.object().add("workspaceId", c23352.f75633).add("editSessionId", c23352.f75630).add("locator", C4375.m13905(c23352.f75631, c23352.f75632)).add("deleted", true), JSON.array());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static char m22804(int i) {
        if (i >= 0 && 65535 >= i) {
            return (char) i;
        }
        throw new IllegalArgumentException(i + " can't be represented as char");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m22799(int i) {
        if (i >= -128 && 127 >= i) {
            return (byte) i;
        }
        throw new IllegalArgumentException(i + " can't be represented as byte (out of range)");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC24149 m22802(C5085 c5085) {
        switch (c5085.mo8408()) {
            case 1:
                return C19673.f63356;
            case 2:
                return C15197.f49609;
            case 3:
                return C1774.f6080;
            case 4:
                return C11468.f36058;
            case 5:
                return C17435.f56701;
            case 6:
                return C15943.f51773;
            case 7:
                return C4011.f13701;
            case 8:
                return C18927.f61399;
            case 9:
                return C20419.f65422;
            default:
                throw new UnsupportedOperationException("no zero for type: " + c5085.mo1843());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22803(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m22800(double d) {
        if (Double.isNaN(d)) {
            return Float.NaN;
        }
        if (Double.isInfinite(d)) {
            return d < 0.0d ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
        }
        if (d < -3.4028234663852886E38d || 3.4028234663852886E38d < d) {
            throw new IllegalArgumentException(d + " can't be represented as float (out of range)");
        }
        float f = (float) d;
        if (f == d) {
            return f;
        }
        throw new IllegalArgumentException(d + " can't be represented as float (imprecise)");
    }
}
