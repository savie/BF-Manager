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

/* JADX INFO: renamed from: l.۟᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: SA89 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7701 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Logger f25483 = Logger.getLogger(C7701.class.getName());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final URI f25484;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10524 f25485;

    public C7701(Response response) {
        URI uri;
        String href = response.getHref();
        try {
            uri = new URI(href);
        } catch (URISyntaxException unused) {
            uri = new URI(null, null, C12352.decode(href.replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%2B"), StandardCharsets.UTF_8), null);
        }
        this.f25484 = uri;
        String status = response.getStatus();
        if (status != null && !status.isEmpty()) {
            try {
                C19948.m45245(response.getStatus());
            } catch (IOException unused2) {
                f25483.warning("Failed to parse status line: ".concat(status));
            }
        }
        this.f25485 = new C10524(this, response);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m20331(C7701 c7701, Response response) {
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
                    f25483.warning("Failed to parse content length ".concat(getcontentlength));
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Date m20335() {
        return this.f25485.f36025;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Long m20333() {
        return this.f25485.f36024;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m20332() {
        return "httpd/unix-directory".equals(this.f25485.f36026);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m20334() {
        String path = this.f25484.getPath();
        try {
            if (path.endsWith("/")) {
                path = path.substring(0, path.length() - 1);
            }
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (StringIndexOutOfBoundsException unused) {
            f25483.warning("Failed to parse name from path " + path);
            return null;
        }
    }

    public final String toString() {
        return this.f25484.getPath();
    }
}
