package l;

import android.text.Editable;
import android.widget.Button;

/* JADX INFO: renamed from: l.֡᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes3.dex */
public final class C0664 extends AbstractC21318 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f2533;

    public C0664(Button button) {
        this.f2533 = button;
    }

    @Override // l.AbstractC21318, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2533.setEnabled(editable.length() > 0);
    }
}
