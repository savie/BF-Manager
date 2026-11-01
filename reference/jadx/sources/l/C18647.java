package l;

import android.webkit.JavascriptInterface;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩴۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes4.dex */
public final class C18647 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f60459;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f60460 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8770 f60461;

    @InterfaceC16341
    @JavascriptInterface
    public synchronized void save(String str, String str2) {
        if (!this.f60459 && this.f60460.equals(str) && str2 != null && str2.length() <= 100000) {
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) != '0' && str2.charAt(i) != '1') {
                    return;
                }
            }
            this.f60461.f30174 = str2;
        }
    }

    public C18647(C8770 c8770) {
        this.f60461 = c8770;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m43131(C18647 c18647) {
        synchronized (c18647) {
            c18647.f60459 = true;
        }
    }
}
