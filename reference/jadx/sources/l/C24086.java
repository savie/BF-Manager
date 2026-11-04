package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩺ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes.dex */
public final class C24086 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4584 f77880;

    public C24086(ActivityC4584 activityC4584) {
        this.f77880 = activityC4584;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ((AbstractC13642) abstractC11800).mo3834((AbstractC18118) this.f77880.f16299.get(i));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f77880.f16299.size();
    }

    @Override // l.AbstractC12964
    public final int getItemViewType(int i) {
        return ((AbstractC18118) this.f77880.f16299.get(i)).mo1671();
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC4584 activityC4584 = this.f77880;
        if (i == 0) {
            return new ViewOnClickListenerC6931(activityC4584, viewGroup);
        }
        if (i == 1) {
            return new C21102(activityC4584, viewGroup);
        }
        if (i == 2) {
            return new ViewOnTouchListenerC0965(activityC4584, viewGroup);
        }
        throw new RuntimeException();
    }
}
