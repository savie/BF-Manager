package l;

import android.text.Editable;
import android.widget.Button;

/* JADX INFO: renamed from: l.ܰ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes4.dex */
public final class C14124 extends AbstractC12561 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f46358;

    public C14124(Button button) {
        this.f46358 = button;
    }

    @Override // l.AbstractC12561, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f46358.setEnabled(editable.length() == 6);
    }
}
