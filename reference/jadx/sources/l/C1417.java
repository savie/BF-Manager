package l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1417 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f5004 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19974 f5005;

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ViewOnClickListenerC9619 viewOnClickListenerC9619 = (ViewOnClickListenerC9619) abstractC11800;
        C21554 c21554 = (C21554) this.f5004.get(i);
        viewOnClickListenerC9619.f31111 = c21554;
        viewOnClickListenerC9619.f31112.setImageDrawable(c21554.f68837);
        c21554.f68840 = true;
        viewOnClickListenerC9619.f31114.setText(c21554.f68836);
        viewOnClickListenerC9619.f31110.setText(c21554.f68838);
        viewOnClickListenerC9619.f31109.setText(c21554.f68841);
    }

    public C1417(ActivityC19974 activityC19974) {
        this.f5005 = activityC19974;
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC9619(this.f5005, viewGroup);
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f5004.size();
    }
}
