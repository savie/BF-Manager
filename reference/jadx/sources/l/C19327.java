package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩵۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes5.dex */
public final class C19327 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f62340;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f62341;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f62342;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f62343;

    public /* synthetic */ C19327(int i, String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z);
    }

    public C19327(String str, String str2, String str3, boolean z) {
        this.f62341 = str;
        this.f62340 = str2;
        this.f62342 = str3;
        this.f62343 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19327)) {
            return false;
        }
        C19327 c19327 = (C19327) obj;
        return this.f62343 == c19327.f62343 && C13638.equals(this.f62341, c19327.f62341) && C13638.equals(this.f62340, c19327.f62340) && C13638.equals(this.f62342, c19327.f62342);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f62342) + C0589.m2789(C0589.m2789((this.f62343 ? 1231 : 1237) * 31, 31, this.f62341), 31, this.f62340);
    }

    public final String toString() {
        Object[] objArr = {this.f62341, this.f62340, this.f62342, Boolean.valueOf(this.f62343)};
        String[] strArrSplit = "pattern;search;replace;regex".length() == 0 ? new String[0] : "pattern;search;replace;regex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C19327.class, sb, "[");
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
    public static C19327 m44311(C17367 c17367) {
        return new C19327(c17367.m40458(), c17367.m40458(), c17367.m40458(), c17367.readByte() != 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44315(C11018 c11018) {
        c11018.m27786(this.f62341);
        c11018.m27786(this.f62340);
        c11018.m27786(this.f62342);
        c11018.writeByte(this.f62343 ? 1 : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m44314() {
        String str = this.f62341;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.replace('\n', ' '));
        String str2 = this.f62340;
        if (!str2.isEmpty()) {
            spannableStringBuilder.append((CharSequence) " [").append((CharSequence) str2.replace('\n', ' ')).append((CharSequence) "] > [").append((CharSequence) this.f62342.replace('\n', ' ')).append((CharSequence) "]");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C20368.f65988), str.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), str.length(), spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
