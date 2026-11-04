package l;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: l.ۘ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6ZG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3834 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20988 f13067;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f13068;

    @InterfaceC19352
    @JavascriptInterface
    public synchronized boolean update(String str, String str2) {
        String str3;
        str3 = this.f13068;
        return str3 != null && str3.equals(str) && this.f13067.m47973(str2);
    }

    public C3834(C20988 c20988) {
        this.f13067 = c20988;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12372(C3834 c3834, String str) {
        synchronized (c3834) {
            c3834.f13068 = str;
        }
    }
}
