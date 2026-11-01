package l;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: l.ۚۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K6ZG */
/* JADX INFO: loaded from: classes2.dex */
public final class C5153 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0919 f17898;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f17899;

    @InterfaceC16341
    @JavascriptInterface
    public synchronized boolean update(String str, String str2) {
        String str3;
        str3 = this.f17899;
        return str3 != null && str3.equals(str) && this.f17898.m3650(str2);
    }

    public C5153(C0919 c0919) {
        this.f17898 = c0919;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14301(C5153 c5153, String str) {
        synchronized (c5153) {
            c5153.f17899 = str;
        }
    }
}
