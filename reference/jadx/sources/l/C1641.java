package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.֫ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes3.dex */
public final class C1641 extends AbstractC1778 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC12081 f5673;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f5674;

    public C1641(ActivityC12081 activityC12081, TextView textView) {
        this.f5673 = activityC12081;
        this.f5674 = textView;
    }

    @Override // l.AbstractC1778
    public final void onChanged() {
        this.f5674.setVisibility(this.f5673.f38897.isEmpty() ? 0 : 8);
    }

    @Override // l.AbstractC1778
    public final void onItemRangeChanged(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        onChanged();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }
}
