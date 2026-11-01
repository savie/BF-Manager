package l;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: l.۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12377 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C12377 f41365 = new C12377();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OnBackInvokedCallback m30792(InterfaceC15456 interfaceC15456, InterfaceC15456 interfaceC15457, InterfaceC4871 interfaceC4871, InterfaceC4871 interfaceC4872) {
        C13465.m32966(interfaceC15456, "onBackStarted");
        C13465.m32966(interfaceC15457, "onBackProgressed");
        C13465.m32966(interfaceC4871, "onBackInvoked");
        C13465.m32966(interfaceC4872, "onBackCancelled");
        return new C16610(interfaceC15456, interfaceC15457, interfaceC4871, interfaceC4872);
    }
}
