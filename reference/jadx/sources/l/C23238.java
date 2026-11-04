package l;

import android.webkit.JavascriptInterface;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩹ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes.dex */
public final class C23238 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f75266;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9261 f75267;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f75268;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23984 f75269;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f75270;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f75271;

    public C23238() {
        throw null;
    }

    @InterfaceC19352
    @JavascriptInterface
    public synchronized void documentReady(String str) {
        C9261 c9261;
        if (!this.f75266 && str != null && (c9261 = this.f75267) != null) {
            c9261.accept(str);
        }
    }

    @InterfaceC19352
    @JavascriptInterface
    public synchronized void save(String str, String str2) {
        if (!this.f75266 && this.f75270 != null && this.f75268.equals(str) && str2 != null && str2.length() <= 100000) {
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) != '0' && str2.charAt(i) != '1') {
                    return;
                }
            }
            this.f75269.f77605.put(this.f75270, str2);
            this.f75271 = true;
        }
    }

    public C23238(C23984 c23984, C9261 c9261) {
        this.f75268 = UUID.randomUUID().toString();
        this.f75269 = c23984;
        this.f75267 = c9261;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m52216(C23238 c23238, String str) {
        String str2;
        synchronized (c23238) {
            if (!C17359.equals(c23238.f75270, str)) {
                c23238.f75270 = str;
                c23238.f75268 = UUID.randomUUID().toString();
                c23238.f75271 = false;
            }
            str2 = c23238.f75268;
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52217(C23238 c23238) {
        synchronized (c23238) {
            c23238.f75266 = true;
            c23238.f75267 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m52218(C23238 c23238, String str) {
        boolean z;
        synchronized (c23238) {
            z = !c23238.f75266 && c23238.f75271 && str.equals(c23238.f75270);
        }
        return z;
    }
}
