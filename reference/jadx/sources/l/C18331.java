package l;

import android.os.Handler;
import android.text.Editable;

/* JADX INFO: renamed from: l.ᩳ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18331 extends AbstractC12561 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC21859 f58467;

    public C18331(RunnableC21859 runnableC21859) {
        this.f58467 = runnableC21859;
    }

    @Override // l.AbstractC12561, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Handler handlerM39278 = C16737.m39278();
        RunnableC21859 runnableC21859 = this.f58467;
        handlerM39278.removeCallbacks(runnableC21859);
        handlerM39278.postDelayed(runnableC21859, 300L);
    }
}
