package l;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.ᩴۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19768 extends C7089 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputMethodManager f63618;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11563 f63619;

    public C19768(ActivityC11563 activityC11563) {
        this.f63619 = activityC11563;
        this.f63618 = (InputMethodManager) activityC11563.getSystemService("input_method");
    }

    @Override // l.InterfaceC13800
    /* JADX INFO: renamed from: ۙ */
    public final void mo33707() {
        InputMethodManager inputMethodManager = this.f63618;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f63619.f36353, 0);
        }
    }

    @Override // l.InterfaceC13800
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo33708(int i, C24244 c24244) {
        if (i != 66 || c24244.m54260()) {
            return false;
        }
        this.f63619.finish();
        return true;
    }

    @Override // l.InterfaceC13800
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo33711(int i, C24244 c24244) {
        if (i != 109 || c24244.m54260()) {
            return false;
        }
        this.f63619.finish();
        return true;
    }

    @Override // l.InterfaceC13800
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo33709() {
        return this.f63619.f36352.m9622();
    }

    @Override // l.InterfaceC13800
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo33710() {
        return this.f63619.f36352.m9621();
    }
}
