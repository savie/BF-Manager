package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13713 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22993 f43538;

    public C13713(ActivityC22993 activityC22993) {
        this.f43538 = activityC22993;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ViewOnClickListenerC11058 viewOnClickListenerC11058 = (ViewOnClickListenerC11058) abstractC11800;
        viewOnClickListenerC11058.f34887.setVisibility(0);
        viewOnClickListenerC11058.f34886.setText(((C9984) this.f43538.f74644.get(i)).m25828());
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC22993 activityC22993 = this.f43538;
        return new ViewOnClickListenerC11058(activityC22993, LayoutInflater.from(activityC22993).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f43538.f74644.size();
    }
}
