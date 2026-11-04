package l;

import android.net.Uri;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.y.l;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩷᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 775Q */
/* JADX INFO: loaded from: classes.dex */
public final class C22337 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17510 f72313;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f72314;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22337)) {
            return false;
        }
        C22337 c22337 = (C22337) obj;
        return C17359.equals(this.f72314, c22337.f72314) && C17359.equals(this.f72313, c22337.f72313);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f72313) + (C17359.hashCode(this.f72314) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f72314, this.f72313};
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17510 m50409() {
        return this.f72313;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m50410() {
        return this.f72314;
    }

    public C22337(String str, C17510 c17510) {
        String strTrim = str.trim();
        C17359.requireNonNull(c17510);
        if (m50404(strTrim) == EnumC5183.VALID) {
            this.f72314 = strTrim;
            this.f72313 = c17510;
            return;
        }
        throw new IllegalArgumentException("Invalid media URL");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static EnumC5183 m50404(String str) {
        if (str == null) {
            return EnumC5183.INVALID;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return EnumC5183.INVALID;
        }
        try {
            URI uri = new URI(strTrim);
            String scheme = uri.getScheme();
            if (scheme != null && ((scheme.equalsIgnoreCase(a.s) || scheme.equalsIgnoreCase(b.a)) && uri.getHost() != null && !uri.getHost().isEmpty() && uri.getRawUserInfo() == null)) {
                String path = uri.getPath();
                return path != null && path.toLowerCase(Locale.ROOT).endsWith(".mpd") ? EnumC5183.MPD_UNSUPPORTED : EnumC5183.VALID;
            }
            return EnumC5183.INVALID;
        } catch (URISyntaxException unused) {
            return EnumC5183.INVALID;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m50411() {
        MessageDigest messageDigestM36179 = C15022.m36179();
        C15022.m36176(messageDigestM36179, this.f72314);
        return "url:".concat(C15022.m36182(messageDigestM36179.digest()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m50407(String str) {
        Uri uri = Uri.parse(this.f72314);
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null && !lastPathSegment.isEmpty()) {
            return lastPathSegment;
        }
        String host = uri.getHost();
        return (host == null || host.isEmpty()) ? str : host;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50408() {
        String path;
        Uri uri = Uri.parse(this.f72314);
        return (uri == null || (path = uri.getPath()) == null || !path.toLowerCase(Locale.ROOT).endsWith(".m3u8")) ? false : true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m50406(String str) {
        if (str != null) {
            C23391.m52571("VideoPlayerUrlArguments:".concat(str));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m50405(String str) {
        return str != null && str.toLowerCase(Locale.ROOT).endsWith(".m3u8");
    }
}
