package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20965 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC12499 f68306;

    public C20965(ActivityC12499 activityC12499) {
        this.f68306 = activityC12499;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ViewOnClickListenerC16732 viewOnClickListenerC16732 = (ViewOnClickListenerC16732) abstractC12554;
        viewOnClickListenerC16732.f53586.setVisibility(0);
        viewOnClickListenerC16732.f53587.setText(((C6148) this.f68306.f41797.get(i)).m17153());
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC12499 activityC12499 = this.f68306;
        return new ViewOnClickListenerC16732(activityC12499, LayoutInflater.from(activityC12499).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f68306.f41797.size();
    }
}
