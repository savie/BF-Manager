package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A91T */
/* JADX INFO: loaded from: classes5.dex */
public final class C16893 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17639 f55248;

    public C16893(ActivityC17639 activityC17639) {
        this.f55248 = activityC17639;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ((ViewOnClickListenerC15401) abstractC11800).m36881((C22861) this.f55248.f57996.get(i));
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC17639 activityC17639 = this.f55248;
        return new ViewOnClickListenerC15401(activityC17639, activityC17639.f57999, LayoutInflater.from(activityC17639).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f55248.f57996.size();
    }
}
