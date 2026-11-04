package l;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: l.ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10050 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C10050 f32231 = new C10050();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OnBackInvokedCallback m25985(InterfaceC3071 interfaceC3071, InterfaceC3071 interfaceC3072, InterfaceC19479 interfaceC19479, InterfaceC19479 interfaceC194710) {
        C15243.m36590(interfaceC3071, "onBackStarted");
        C15243.m36590(interfaceC3072, "onBackProgressed");
        C15243.m36590(interfaceC19479, "onBackInvoked");
        C15243.m36590(interfaceC194710, "onBackCancelled");
        return new C19001(interfaceC3071, interfaceC3072, interfaceC19479, interfaceC194710);
    }
}
