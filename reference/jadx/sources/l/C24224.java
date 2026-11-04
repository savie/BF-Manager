package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.᩺ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes.dex */
public final class C24224 extends AbstractC21318 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC16018 f78473;

    public C24224(RunnableC16018 runnableC16018) {
        this.f78473 = runnableC16018;
    }

    @Override // l.AbstractC21318, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f78473.run();
    }
}
