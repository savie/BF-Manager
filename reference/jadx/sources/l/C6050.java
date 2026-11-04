package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۛ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes3.dex */
public final class C6050 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f20694;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f20695;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f20696;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f20697;

    public /* synthetic */ C6050(int i, String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z);
    }

    public C6050(String str, String str2, String str3, boolean z) {
        this.f20694 = str;
        this.f20697 = str2;
        this.f20695 = str3;
        this.f20696 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6050)) {
            return false;
        }
        C6050 c6050 = (C6050) obj;
        return this.f20696 == c6050.f20696 && C17359.equals(this.f20694, c6050.f20694) && C17359.equals(this.f20697, c6050.f20697) && C17359.equals(this.f20695, c6050.f20695);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f20695) + C24966.m55771(C24966.m55771((this.f20696 ? 1231 : 1237) * 31, 31, this.f20694), 31, this.f20697);
    }

    public final String toString() {
        Object[] objArr = {this.f20694, this.f20697, this.f20695, Boolean.valueOf(this.f20696)};
        String[] strArrSplit = "pattern;search;replace;regex".length() == 0 ? new String[0] : "pattern;search;replace;regex".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C6050.class, sb, "[");
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6050 m17558(C20348 c20348) {
        return new C6050(c20348.m46758(), c20348.m46758(), c20348.m46758(), c20348.readByte() != 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17563(C6178 c6178) {
        c6178.m17800(this.f20694);
        c6178.m17800(this.f20697);
        c6178.m17800(this.f20695);
        c6178.writeByte(this.f20696 ? 1 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m17562() {
        String str = this.f20694;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.replace('\n', ' '));
        String str2 = this.f20697;
        if (!str2.isEmpty()) {
            spannableStringBuilder.append((CharSequence) " [").append((CharSequence) str2.replace('\n', ' ')).append((CharSequence) "] > [").append((CharSequence) this.f20695.replace('\n', ' ')).append((CharSequence) "]");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C3296.f10741), str.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), str.length(), spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
