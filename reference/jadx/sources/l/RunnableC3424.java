package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۗ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C8ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3424 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20578 f11101;

    public RunnableC3424(C20578 c20578) {
        this.f11101 = c20578;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.f11101.f65905;
        textView.setText(textView.getText());
    }
}
