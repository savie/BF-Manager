package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.᩺ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes.dex */
public final class C22942 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18002 f74572;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C22942(C18002 c18002) {
        this.f74572 = c18002;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C18002 c18002 = this.f74572;
        if (c18002.m41930()) {
            c18002.f57583.m26207();
            c18002.f57574.m26207();
            c18002.f57572.removeMessages(0);
            c18002.f57572.sendEmptyMessageDelayed(0, 100L);
        }
    }
}
