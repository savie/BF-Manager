package l;

import android.text.Editable;
import android.widget.Button;

/* JADX INFO: renamed from: l.ۖ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2833 extends AbstractC12561 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f10724;

    public C2833(Button button) {
        this.f10724 = button;
    }

    @Override // l.AbstractC12561, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f10724.setEnabled(editable.length() > 0);
    }
}
