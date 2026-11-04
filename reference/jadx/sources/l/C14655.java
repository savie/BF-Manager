package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14655 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21369 f47944;

    public C14655(ActivityC21369 activityC21369) {
        this.f47944 = activityC21369;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ((ViewOnClickListenerC15401) abstractC11800).m36881((C22861) this.f47944.f68059.get(i));
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC21369 activityC21369 = this.f47944;
        return new ViewOnClickListenerC15401(activityC21369, activityC21369.f68060, LayoutInflater.from(activityC21369).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f47944.f68059.size();
    }
}
