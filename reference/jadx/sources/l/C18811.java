package l;

import android.graphics.Typeface;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩴܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes5.dex */
public final class C18811 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float f60963;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f60964;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f60965;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f60966;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f60967;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object f60968;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f60969;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float f60970;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f60971;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f60972;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f60973;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f60974;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f60975;

    public C18811(Typeface typeface, float f, float f2, float f3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, C20889 c20889) {
        this.f60968 = typeface;
        this.f60963 = f;
        this.f60974 = f2;
        this.f60970 = f3;
        this.f60965 = i;
        this.f60966 = z;
        this.f60975 = z2;
        this.f60964 = z3;
        this.f60967 = z4;
        this.f60971 = z5;
        this.f60973 = z6;
        this.f60972 = i2;
        this.f60969 = c20889;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18811)) {
            return false;
        }
        C18811 c18811 = (C18811) obj;
        return this.f60966 == c18811.f60966 && this.f60975 == c18811.f60975 && this.f60964 == c18811.f60964 && this.f60967 == c18811.f60967 && this.f60971 == c18811.f60971 && this.f60973 == c18811.f60973 && this.f60965 == c18811.f60965 && this.f60972 == c18811.f60972 && this.f60963 == c18811.f60963 && this.f60974 == c18811.f60974 && this.f60970 == c18811.f60970 && C13638.equals(this.f60968, c18811.f60968) && C13638.equals(this.f60969, c18811.f60969);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f60969) + ((C13638.hashCode(this.f60968) + ((Float.floatToIntBits(this.f60970) + ((Float.floatToIntBits(this.f60974) + ((Float.floatToIntBits(this.f60963) + ((((((((((((((((this.f60966 ? 1231 : 1237) * 31) + (this.f60975 ? 1231 : 1237)) * 31) + (this.f60964 ? 1231 : 1237)) * 31) + (this.f60967 ? 1231 : 1237)) * 31) + (this.f60971 ? 1231 : 1237)) * 31) + (this.f60973 ? 1231 : 1237)) * 31) + this.f60965) * 31) + this.f60972) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f60968, Float.valueOf(this.f60963), Float.valueOf(this.f60974), Float.valueOf(this.f60970), Integer.valueOf(this.f60965), Boolean.valueOf(this.f60966), Boolean.valueOf(this.f60975), Boolean.valueOf(this.f60964), Boolean.valueOf(this.f60967), Boolean.valueOf(this.f60971), Boolean.valueOf(this.f60973), Integer.valueOf(this.f60972), this.f60969};
        String[] strArrSplit = "typeface;size;scale;skew;tabSize;ascii;unicode;lineNumbers;lineNumbersLeft;fixedNumbers;wrapArrows;wrap;language".length() == 0 ? new String[0] : "typeface;size;scale;skew;tabSize;ascii;unicode;lineNumbers;lineNumbersLeft;fixedNumbers;wrapArrows;wrap;language".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C18811.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
