package l;

import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: l.ۙᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F7U3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4801 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f16873;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f16874;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f16875;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f16876;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f16877;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f16878;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f16879;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f16880;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4801 m13334(int i, AbstractC12068 abstractC12068) {
        if (abstractC12068 instanceof C17606) {
            return new C4801(i, (C17606) abstractC12068);
        }
        throw new RuntimeException();
    }

    public C4801(int i, C17606 c17606) {
        this.f16878 = i;
        this.f16875 = c17606.f55949;
        this.f16873 = c17606.f55953;
        this.f16874 = c17606.f55948;
        this.f16879 = c17606.f55952;
        this.f16877 = c17606.f55951;
        this.f16880 = c17606.f55950;
        this.f16876 = c17606.f55947 == 5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final URI m13335() {
        String strConcat = this.f16877;
        if (TextUtils.isEmpty(strConcat)) {
            return null;
        }
        String lowerCase = strConcat.toLowerCase();
        if (!lowerCase.startsWith("http://") && !lowerCase.startsWith("https://")) {
            strConcat = "https://".concat(strConcat);
        }
        try {
            return new URI(strConcat);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4801.class == obj.getClass()) {
            C4801 c4801 = (C4801) obj;
            if (this.f16878 == c4801.f16878 && this.f16875.equals(c4801.f16875) && this.f16873.equals(c4801.f16873) && this.f16874.equals(c4801.f16874) && this.f16879.equals(c4801.f16879) && this.f16877.equals(c4801.f16877) && this.f16880 == c4801.f16880 && this.f16876 == c4801.f16876) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((C13958.m33812(C13958.m33812(C13958.m33812(C13958.m33812(C13958.m33812(this.f16878 * 31, 31, this.f16875), 31, this.f16873), 31, this.f16874), 31, this.f16879), 31, this.f16877) + (this.f16880 ? 1231 : 1237)) * 31) + (this.f16876 ? 1231 : 1237);
    }
}
