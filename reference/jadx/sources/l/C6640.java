package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۛ᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6640 extends AbstractC1778 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0673 f22166;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f22167;

    public C6640(ActivityC0673 activityC0673, TextView textView) {
        this.f22166 = activityC0673;
        this.f22167 = textView;
    }

    @Override // l.AbstractC1778
    public final void onChanged() {
        this.f22167.setVisibility(this.f22166.f2555.isEmpty() ? 0 : 8);
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
