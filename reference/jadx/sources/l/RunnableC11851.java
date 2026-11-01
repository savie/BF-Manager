package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۨܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11851 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2677 f39769;

    public RunnableC11851(C2677 c2677) {
        this.f39769 = c2677;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.f39769.f10348;
        textView.setText(textView.getText());
    }
}
