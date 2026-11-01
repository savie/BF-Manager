package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22565 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7042 f73543;

    public C22565(ActivityC7042 activityC7042) {
        this.f73543 = activityC7042;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ViewOnClickListenerC4219 viewOnClickListenerC4219 = (ViewOnClickListenerC4219) abstractC12554;
        viewOnClickListenerC4219.f15301.setVisibility(0);
        viewOnClickListenerC4219.f15302.setText(((C3326) ((ArrayList) this.f73543.f23660).get(i)).m9858());
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC7042 activityC7042 = this.f73543;
        return new ViewOnClickListenerC4219(activityC7042, LayoutInflater.from(activityC7042).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return ((ArrayList) this.f73543.f23660).size();
    }
}
