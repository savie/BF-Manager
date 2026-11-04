package l;

import android.webkit.CookieManager;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֫ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6JJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1707 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C24363 f5852;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC6595 f5853;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f5854;

    static {
        C6463 c6463 = new C6463();
        c6463.m18277();
        c6463.m18275();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c6463.m18267(20L, timeUnit);
        c6463.m18278(30L, timeUnit);
        f5852 = c6463.m18265();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6070() {
        this.f5854 = true;
        InterfaceC6595 interfaceC6595 = this.f5853;
        if (interfaceC6595 != null) {
            interfaceC6595.cancel();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m6068(String str) {
        return str.equals("appassets.androidplatform.net") || str.endsWith(".appassets.androidplatform.net") || C19780.m45540(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9444 m6069(String str, String str2, String str3) {
        C16903 c16903M39867;
        C16903 c16903M39861;
        String string;
        try {
            c16903M39867 = C16903.m39861(str);
        } catch (IllegalArgumentException unused) {
            c16903M39867 = null;
        }
        for (int i = 0; i <= 10; i++) {
            if (this.f5854) {
                throw new IOException("Download canceled");
            }
            if (c16903M39867 == null || m6068(c16903M39867.m39872())) {
                throw new IOException("Invalid download URL");
            }
            C0496 c0496 = new C0496();
            c0496.m2395(c16903M39867);
            if (str2 != null && !str2.isEmpty()) {
                c0496.m2398("User-Agent", str2);
            }
            String cookie = CookieManager.getInstance().getCookie(c16903M39867.toString());
            if (cookie != null && !cookie.isEmpty()) {
                c0496.m2398("Cookie", cookie);
            }
            if (str3 == null) {
                c16903M39861 = null;
            } else {
                try {
                    c16903M39861 = C16903.m39861(str3);
                } catch (IllegalArgumentException unused2) {
                    c16903M39861 = null;
                }
            }
            if (c16903M39861 == null || m6068(c16903M39861.m39872()) || (c16903M39861.m39871() && !c16903M39867.m39871())) {
                string = null;
            } else {
                C25109 c25109M39868 = c16903M39861.m39868();
                c25109M39868.m55967();
                c25109M39868.m55970();
                c25109M39868.m55966();
                if (!c16903M39861.m39872().equals(c16903M39867.m39872()) || c16903M39861.m39880() != c16903M39867.m39880() || !c16903M39861.m39873().equals(c16903M39867.m39873())) {
                    c25109M39868.m55969();
                    c25109M39868.m55968();
                }
                string = c25109M39868.m55964().toString();
            }
            if (string != null) {
                c0496.m2398("Referer", string);
            }
            InterfaceC6595 interfaceC6595M54450 = f5852.m54450(c0496.m2389());
            this.f5853 = interfaceC6595M54450;
            if (this.f5854) {
                interfaceC6595M54450.cancel();
            }
            C9444 c9444Execute = interfaceC6595M54450.execute();
            Iterator it = c9444Execute.m24821().iterator();
            while (it.hasNext()) {
                CookieManager.getInstance().setCookie(c16903M39867.toString(), (String) it.next());
            }
            int iM24820 = c9444Execute.m24820();
            if (iM24820 != 301 && iM24820 != 302 && iM24820 != 303 && iM24820 != 307 && iM24820 != 308) {
                if (c9444Execute.m24819() && c9444Execute.m24818() != null) {
                    return c9444Execute;
                }
                c9444Execute.close();
                throw new IOException(C13645.m33382(iM24820, "Download HTTP status "));
            }
            String strM24817 = c9444Execute.m24817("Location");
            c16903M39867 = strM24817 == null ? null : c16903M39867.m39867(strM24817);
            c9444Execute.close();
        }
        throw new IOException("Too many download redirects");
    }
}
