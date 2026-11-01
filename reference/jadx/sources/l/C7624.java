package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7624 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0567 f25179;

    public C7624(ActivityC0567 activityC0567) {
        this.f25179 = activityC0567;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ViewOnClickListenerC20324 viewOnClickListenerC20324 = (ViewOnClickListenerC20324) abstractC12554;
        viewOnClickListenerC20324.f65833.setVisibility(0);
        viewOnClickListenerC20324.f65832.setText(((C21735) this.f25179.f2350.get(i)).f40386);
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC0567 activityC0567 = this.f25179;
        return new ViewOnClickListenerC20324(activityC0567, LayoutInflater.from(activityC0567).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f25179.f2350.size();
    }
}
