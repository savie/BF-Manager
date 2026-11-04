package l;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.ܶ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes5.dex */
public final class C16367 extends C7089 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputMethodManager f53146;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC6673 f53147;

    public C16367(ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673) {
        this.f53147 = viewOnLayoutChangeListenerC6673;
        this.f53146 = (InputMethodManager) viewOnLayoutChangeListenerC6673.getSystemService("input_method");
    }

    @Override // l.InterfaceC13800
    /* JADX INFO: renamed from: ۙ */
    public final void mo33707() {
        InputMethodManager inputMethodManager = this.f53146;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f53147.f22255, 0);
        }
    }

    @Override // l.InterfaceC13800
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo33708(int i, C24244 c24244) {
        if (i != 66) {
            return false;
        }
        ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673 = this.f53147;
        if (viewOnLayoutChangeListenerC6673.f22254.m39637()) {
            return false;
        }
        if (!viewOnLayoutChangeListenerC6673.f22254.m39636(viewOnLayoutChangeListenerC6673.f22255)) {
            return true;
        }
        viewOnLayoutChangeListenerC6673.finish();
        return true;
    }

    @Override // l.InterfaceC13800
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo33711(int i, C24244 c24244) {
        if (i != 109) {
            return false;
        }
        ViewOnLayoutChangeListenerC6673 viewOnLayoutChangeListenerC6673 = this.f53147;
        if (viewOnLayoutChangeListenerC6673.f22254.m39637()) {
            return false;
        }
        if (!viewOnLayoutChangeListenerC6673.f22254.m39636(viewOnLayoutChangeListenerC6673.f22255)) {
            return true;
        }
        viewOnLayoutChangeListenerC6673.finish();
        return true;
    }

    @Override // l.InterfaceC13800
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo33709() {
        return this.f53147.f22252.m9622();
    }

    @Override // l.InterfaceC13800
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo33710() {
        return this.f53147.f22252.m9621();
    }
}
