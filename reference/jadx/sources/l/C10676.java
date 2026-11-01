package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10676 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23376 f36426;

    public C10676(ActivityC23376 activityC23376) {
        this.f36426 = activityC23376;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ((ViewOnClickListenerC18081) abstractC12554).m42076((C21609) this.f36426.f75726.get(i));
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC23376 activityC23376 = this.f36426;
        return new ViewOnClickListenerC18081(activityC23376, activityC23376.f75725, LayoutInflater.from(activityC23376).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f36426.f75726.size();
    }
}
