package l;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.֡᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0635 extends C8524 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputMethodManager f2744;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11220 f2745;

    public C0635(ActivityC11220 activityC11220) {
        this.f2745 = activityC11220;
        this.f2744 = (InputMethodManager) activityC11220.getSystemService("input_method");
    }

    @Override // l.InterfaceC9935
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2926() {
        InputMethodManager inputMethodManager = this.f2744;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f2745.f37970, 0);
        }
    }

    @Override // l.InterfaceC9935
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2927(int i, C4995 c4995) {
        if (i != 66 || c4995.m13847()) {
            return false;
        }
        this.f2745.finish();
        return true;
    }

    @Override // l.InterfaceC9935
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo2930(int i, C4995 c4995) {
        if (i != 109 || c4995.m13847()) {
            return false;
        }
        this.f2745.finish();
        return true;
    }

    @Override // l.InterfaceC9935
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo2928() {
        return this.f2745.f37974.m36982();
    }

    @Override // l.InterfaceC9935
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo2929() {
        return this.f2745.f37974.m36981();
    }
}
