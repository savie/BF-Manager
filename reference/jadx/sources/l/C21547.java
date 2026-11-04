package l;

import android.text.Editable;
import android.widget.Button;

/* JADX INFO: renamed from: l.᩶᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes.dex */
public final class C21547 extends AbstractC21318 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f68825;

    public C21547(Button button) {
        this.f68825 = button;
    }

    @Override // l.AbstractC21318, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f68825.setEnabled(editable.length() == 6);
    }
}
