package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۚ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes2.dex */
public final class C5682 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23582 f19639;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C5682(C23582 c23582) {
        this.f19639 = c23582;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C23582 c23582 = this.f19639;
        c23582.m52795();
        if (c23582.m52817()) {
            c23582.f76573.m29835();
            c23582.f76561.removeMessages(0);
            c23582.f76561.sendEmptyMessageDelayed(0, 100L);
        }
    }
}
