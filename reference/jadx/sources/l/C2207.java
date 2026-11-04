package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.֫᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes3.dex */
public final class C2207 extends AbstractC1778 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17122 f7248;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25227 f7249;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f7250;

    public C2207(C17122 c17122, C25227 c25227, TextView textView) {
        this.f7248 = c17122;
        this.f7249 = c25227;
        this.f7250 = textView;
    }

    @Override // l.AbstractC1778
    public final void onChanged() {
        int size = this.f7248.f55864.size();
        TextView textView = this.f7250;
        C25227 c25227 = this.f7249;
        if (size == 0) {
            c25227.setVisibility(8);
            textView.setVisibility(0);
        } else {
            c25227.setVisibility(0);
            textView.setVisibility(8);
        }
    }
}
