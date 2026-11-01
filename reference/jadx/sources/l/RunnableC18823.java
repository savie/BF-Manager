package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ᩴܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18823 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TextView f61000;

    public RunnableC18823(TextView textView) {
        this.f61000 = textView;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43428() {
        TextView textView = this.f61000;
        textView.removeCallbacks(this);
        textView.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.f61000;
        textView.setText(textView.getText());
    }
}
