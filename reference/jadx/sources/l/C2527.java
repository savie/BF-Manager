package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۖ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2527 extends AbstractC1778 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22993 f8072;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f8073;

    public C2527(ActivityC22993 activityC22993, TextView textView) {
        this.f8072 = activityC22993;
        this.f8073 = textView;
    }

    @Override // l.AbstractC1778
    public final void onChanged() {
        this.f8073.setVisibility(this.f8072.f74644.isEmpty() ? 0 : 8);
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
