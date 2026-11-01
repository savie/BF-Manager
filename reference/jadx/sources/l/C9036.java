package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۡᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9036 extends AbstractC12410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0567 f30844;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f30845;

    public C9036(ActivityC0567 activityC0567, TextView textView) {
        this.f30844 = activityC0567;
        this.f30845 = textView;
    }

    @Override // l.AbstractC12410
    public final void onChanged() {
        this.f30845.setVisibility(this.f30844.f2350.isEmpty() ? 0 : 8);
    }

    @Override // l.AbstractC12410
    public final void onItemRangeChanged(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        onChanged();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }
}
