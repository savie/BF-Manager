package l;

import android.os.Handler;
import android.text.Editable;

/* JADX INFO: renamed from: l.֫ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2110 extends AbstractC21318 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC5839 f6983;

    public C2110(RunnableC5839 runnableC5839) {
        this.f6983 = runnableC5839;
    }

    @Override // l.AbstractC21318, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Handler handlerM49077 = C21576.m49077();
        RunnableC5839 runnableC5839 = this.f6983;
        handlerM49077.removeCallbacks(runnableC5839);
        handlerM49077.postDelayed(runnableC5839, 300L);
    }
}
