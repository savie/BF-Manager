package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.᩸ܽ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes5.dex */
public final class C21705 extends AbstractC12561 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1243 f70396;

    public C21705(RunnableC1243 runnableC1243) {
        this.f70396 = runnableC1243;
    }

    @Override // l.AbstractC12561, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f70396.run();
    }
}
