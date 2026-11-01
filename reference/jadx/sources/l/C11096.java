package l;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.ۧܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11096 extends C8524 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputMethodManager f37680;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC3333 f37681;

    public C11096(ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333) {
        this.f37681 = viewOnLayoutChangeListenerC3333;
        this.f37680 = (InputMethodManager) viewOnLayoutChangeListenerC3333.getSystemService("input_method");
    }

    @Override // l.InterfaceC9935
    /* JADX INFO: renamed from: ۙ */
    public final void mo2926() {
        InputMethodManager inputMethodManager = this.f37680;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f37681.f12359, 0);
        }
    }

    @Override // l.InterfaceC9935
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2927(int i, C4995 c4995) {
        if (i != 66) {
            return false;
        }
        ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333 = this.f37681;
        if (viewOnLayoutChangeListenerC3333.f12352.m35361()) {
            return false;
        }
        if (!viewOnLayoutChangeListenerC3333.f12352.m35358(viewOnLayoutChangeListenerC3333.f12359)) {
            return true;
        }
        viewOnLayoutChangeListenerC3333.finish();
        return true;
    }

    @Override // l.InterfaceC9935
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2930(int i, C4995 c4995) {
        if (i != 109) {
            return false;
        }
        ViewOnLayoutChangeListenerC3333 viewOnLayoutChangeListenerC3333 = this.f37681;
        if (viewOnLayoutChangeListenerC3333.f12352.m35361()) {
            return false;
        }
        if (!viewOnLayoutChangeListenerC3333.f12352.m35358(viewOnLayoutChangeListenerC3333.f12359)) {
            return true;
        }
        viewOnLayoutChangeListenerC3333.finish();
        return true;
    }

    @Override // l.InterfaceC9935
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo2928() {
        return this.f37681.f12357.m36982();
    }

    @Override // l.InterfaceC9935
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2929() {
        return this.f37681.f12357.m36981();
    }
}
