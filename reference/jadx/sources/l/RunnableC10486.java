package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: F90M */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10486 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f33379;

    public RunnableC10486(TextView textView) {
        this.f33379 = textView;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26951() {
        TextView textView = this.f33379;
        textView.removeCallbacks(this);
        textView.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.f33379;
        textView.setText(textView.getText());
    }
}
