package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23727 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC14555 f76781;

    public C23727(ActivityC14555 activityC14555) {
        this.f76781 = activityC14555;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ((ViewOnClickListenerC18081) abstractC12554).m42076((C21609) this.f76781.f47658.get(i));
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC14555 activityC14555 = this.f76781;
        return new ViewOnClickListenerC18081(activityC14555, activityC14555.f47656, LayoutInflater.from(activityC14555).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f76781.f47658.size();
    }
}
