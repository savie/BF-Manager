package l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6592 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f22211 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7298 f22212;

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ViewOnClickListenerC22821 viewOnClickListenerC22821 = (ViewOnClickListenerC22821) abstractC12554;
        C2358 c2358 = (C2358) this.f22211.get(i);
        viewOnClickListenerC22821.f74240 = c2358;
        viewOnClickListenerC22821.f74238.setImageDrawable(c2358.f8323);
        c2358.f8324 = true;
        viewOnClickListenerC22821.f74243.setText(c2358.f8321);
        viewOnClickListenerC22821.f74239.setText(c2358.f8325);
        viewOnClickListenerC22821.f74241.setText(c2358.f8320);
    }

    public C6592(ActivityC7298 activityC7298) {
        this.f22212 = activityC7298;
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC22821(this.f22212, viewGroup);
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f22211.size();
    }
}
