package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܺ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes5.dex */
public final class C16516 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3838 f53484;

    public C16516(ActivityC3838 activityC3838) {
        this.f53484 = activityC3838;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ((AbstractC23976) abstractC11800).mo17588((AbstractC23230) this.f53484.f13073.get(i));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f53484.f13073.size();
    }

    @Override // l.AbstractC12964
    public final int getItemViewType(int i) {
        return ((AbstractC23230) this.f53484.f13073.get(i)).mo10066();
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC3838 activityC3838 = this.f53484;
        if (i == 1) {
            return new C15770(activityC3838, viewGroup);
        }
        if (i == 2) {
            return new ViewOnTouchListenerC6076(activityC3838, viewGroup);
        }
        throw new RuntimeException();
    }
}
