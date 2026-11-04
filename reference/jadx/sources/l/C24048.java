package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W8 */
/* JADX INFO: loaded from: classes.dex */
public final class C24048 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3910 f77787;

    public C24048(ActivityC3910 activityC3910) {
        this.f77787 = activityC3910;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ((ViewOnClickListenerC15401) abstractC11800).m36881((C22861) this.f77787.f13366.get(i));
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC3910 activityC3910 = this.f77787;
        return new ViewOnClickListenerC15401(activityC3910, activityC3910.f13369, LayoutInflater.from(activityC3910).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f77787.f13366.size();
    }
}
