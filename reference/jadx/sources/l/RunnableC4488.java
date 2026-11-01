package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۙۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4488 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15968;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15969;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15970;

    public /* synthetic */ RunnableC4488(int i, int i2, Object obj) {
        this.f15969 = i2;
        this.f15970 = obj;
        this.f15968 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15969) {
            case 0:
                TextView textView = (TextView) this.f15970;
                if (textView.getVisibility() != 0) {
                    textView.setVisibility(0);
                }
                textView.setText(this.f15968 + "%");
                break;
            default:
                C19271.m44210((C19271) this.f15970, this.f15968);
                break;
        }
    }
}
