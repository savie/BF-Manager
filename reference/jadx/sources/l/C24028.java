package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.᩺ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes.dex */
public final class C24028 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RunnableC8501 f77744;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C24028(RunnableC8501 runnableC8501) {
        this.f77744 = runnableC8501;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f77744.run();
    }
}
