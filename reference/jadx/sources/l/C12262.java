package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۨۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12262 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4059 f39434;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C12262(C4059 c4059) {
        this.f39434 = c4059;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C4059 c4059 = this.f39434;
        if (c4059.m13084()) {
            c4059.f13842.m29835();
            c4059.f13833.m29835();
            c4059.f13847.removeMessages(0);
            c4059.f13847.sendEmptyMessageDelayed(0, 100L);
        }
    }
}
