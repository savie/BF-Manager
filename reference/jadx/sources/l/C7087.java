package l;

import com.google.android.material.badge.BadgeDrawable;
import com.thegrizzlylabs.sardineandroid.model.Propstat;
import com.thegrizzlylabs.sardineandroid.model.Response;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ۜۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: SA89 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7087 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Logger f23355 = Logger.getLogger(C7087.class.getName());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final URI f23356;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8578 f23357;

    public C7087(Response response) {
        URI uri;
        String href = response.getHref();
        try {
            uri = new URI(href);
        } catch (URISyntaxException unused) {
            uri = new URI(null, null, C10902.decode(href.replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%2B"), StandardCharsets.UTF_8), null);
        }
        this.f23356 = uri;
        String status = response.getStatus();
        if (status != null && !status.isEmpty()) {
            try {
                C22588.m50912(response.getStatus());
            } catch (IOException unused2) {
                f23355.warning("Failed to parse status line: ".concat(status));
            }
        }
        this.f23357 = new C8578(this, response);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m19420(C7087 c7087, Response response) {
        String getcontentlength;
        List<Propstat> propstat = response.getPropstat();
        long j = -1;
        if (propstat.isEmpty()) {
            return -1L;
        }
        for (Propstat propstat2 : propstat) {
            if (propstat2.getProp() != null && (getcontentlength = propstat2.getProp().getGetcontentlength()) != null) {
                try {
                    j = Long.parseLong(getcontentlength);
                    break;
                } catch (NumberFormatException unused) {
                    f23355.warning("Failed to parse content length ".concat(getcontentlength));
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Date m19423() {
        return this.f23357.f28013;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Long m19421() {
        return this.f23357.f28012;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m19424() {
        return "httpd/unix-directory".equals(this.f23357.f28014);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m19422() {
        String path = this.f23356.getPath();
        try {
            if (path.endsWith("/")) {
                path = path.substring(0, path.length() - 1);
            }
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (StringIndexOutOfBoundsException unused) {
            f23355.warning("Failed to parse name from path " + path);
            return null;
        }
    }

    public final String toString() {
        return this.f23356.getPath();
    }
}
