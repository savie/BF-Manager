package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ᩴ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes4.dex */
public final class C18439 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20556 f58779;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C18439(C20556 c20556) {
        this.f58779 = c20556;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C20556 c20556 = this.f58779;
        c20556.m46361();
        if (c20556.m46385()) {
            c20556.f66567.m26207();
            c20556.f66576.removeMessages(0);
            c20556.f66576.sendEmptyMessageDelayed(0, 100L);
        }
    }
}
