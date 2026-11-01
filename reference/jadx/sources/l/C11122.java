package l;

import android.net.Uri;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.y.l;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۧܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 775Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C11122 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22411 f37752;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f37753;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11122)) {
            return false;
        }
        C11122 c11122 = (C11122) obj;
        return C13638.equals(this.f37753, c11122.f37753) && C13638.equals(this.f37752, c11122.f37752);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f37752) + (C13638.hashCode(this.f37753) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f37753, this.f37752};
        String[] strArrSplit = "url;requestConfig".length() == 0 ? new String[0] : "url;requestConfig".split(l.b);
        StringBuilder sb = new StringBuilder("UrlMediaArguments[");
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22411 m28044() {
        return this.f37752;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m28048() {
        return this.f37753;
    }

    public C11122(String str, C22411 c22411) {
        String strTrim = str.trim();
        C13638.requireNonNull(c22411);
        if (m28042(strTrim) == EnumC6182.VALID) {
            this.f37753 = strTrim;
            this.f37752 = c22411;
            return;
        }
        throw new IllegalArgumentException("Invalid media URL");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static EnumC6182 m28042(String str) {
        if (str == null) {
            return EnumC6182.INVALID;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return EnumC6182.INVALID;
        }
        try {
            URI uri = new URI(strTrim);
            String scheme = uri.getScheme();
            if (scheme != null && ((scheme.equalsIgnoreCase(a.s) || scheme.equalsIgnoreCase(b.a)) && uri.getHost() != null && !uri.getHost().isEmpty() && uri.getRawUserInfo() == null)) {
                String path = uri.getPath();
                return path != null && path.toLowerCase(Locale.ROOT).endsWith(".mpd") ? EnumC6182.MPD_UNSUPPORTED : EnumC6182.VALID;
            }
            return EnumC6182.INVALID;
        } catch (URISyntaxException unused) {
            return EnumC6182.INVALID;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m28047() {
        MessageDigest messageDigestM49421 = C22253.m49421();
        C22253.m49418(messageDigestM49421, this.f37753);
        return "url:".concat(C22253.m49424(messageDigestM49421.digest()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m28045(String str) {
        Uri uri = Uri.parse(this.f37753);
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null && !lastPathSegment.isEmpty()) {
            return lastPathSegment;
        }
        String host = uri.getHost();
        return (host == null || host.isEmpty()) ? str : host;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28046() {
        String path;
        Uri uri = Uri.parse(this.f37753);
        return (uri == null || (path = uri.getPath()) == null || !path.toLowerCase(Locale.ROOT).endsWith(".m3u8")) ? false : true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m28041(String str) {
        if (str != null) {
            C12670.m31505("VideoPlayerUrlArguments:".concat(str));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m28043(String str) {
        return str != null && str.toLowerCase(Locale.ROOT).endsWith(".m3u8");
    }
}
