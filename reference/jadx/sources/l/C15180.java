package l;

import android.graphics.Typeface;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܳۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes5.dex */
public final class C15180 extends AbstractC2323 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float f49548;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f49549;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float f49550;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object f49551;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f49552;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f49553;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12895 f49554;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f49555;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f49556;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f49557;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f49558;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f49559;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f49560;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object f49561;

    public C15180(Typeface typeface, float f, float f2, float f3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, C16800 c16800, C12895 c12895) {
        this.f49561 = typeface;
        this.f49550 = f;
        this.f49553 = f2;
        this.f49548 = f3;
        this.f49552 = i;
        this.f49549 = z;
        this.f49556 = z2;
        this.f49560 = z3;
        this.f49558 = z4;
        this.f49559 = z5;
        this.f49555 = z6;
        this.f49557 = i2;
        this.f49551 = c16800;
        this.f49554 = c12895;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15180)) {
            return false;
        }
        C15180 c15180 = (C15180) obj;
        return this.f49549 == c15180.f49549 && this.f49556 == c15180.f49556 && this.f49560 == c15180.f49560 && this.f49558 == c15180.f49558 && this.f49559 == c15180.f49559 && this.f49555 == c15180.f49555 && this.f49552 == c15180.f49552 && this.f49557 == c15180.f49557 && this.f49550 == c15180.f49550 && this.f49553 == c15180.f49553 && this.f49548 == c15180.f49548 && C17359.equals(this.f49561, c15180.f49561) && C17359.equals(this.f49551, c15180.f49551) && C17359.equals(this.f49554, c15180.f49554);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f49554) + ((C17359.hashCode(this.f49551) + ((C17359.hashCode(this.f49561) + ((Float.floatToIntBits(this.f49548) + ((Float.floatToIntBits(this.f49553) + ((Float.floatToIntBits(this.f49550) + ((((((((((((((((this.f49549 ? 1231 : 1237) * 31) + (this.f49556 ? 1231 : 1237)) * 31) + (this.f49560 ? 1231 : 1237)) * 31) + (this.f49558 ? 1231 : 1237)) * 31) + (this.f49559 ? 1231 : 1237)) * 31) + (this.f49555 ? 1231 : 1237)) * 31) + this.f49552) * 31) + this.f49557) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f49561, Float.valueOf(this.f49550), Float.valueOf(this.f49553), Float.valueOf(this.f49548), Integer.valueOf(this.f49552), Boolean.valueOf(this.f49549), Boolean.valueOf(this.f49556), Boolean.valueOf(this.f49560), Boolean.valueOf(this.f49558), Boolean.valueOf(this.f49559), Boolean.valueOf(this.f49555), Integer.valueOf(this.f49557), this.f49551, this.f49554};
        String[] strArrSplit = "typeface;size;scale;skew;tabSize;ascii;unicode;lineNumbers;lineNumbersLeft;fixedNumbers;wrapArrows;wrap;language;passwordMask".length() == 0 ? new String[0] : "typeface;size;scale;skew;tabSize;ascii;unicode;lineNumbers;lineNumbersLeft;fixedNumbers;wrapArrows;wrap;language;passwordMask".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C15180.class, sb, "[");
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
