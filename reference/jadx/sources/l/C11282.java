package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۧ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes4.dex */
public final class C11282 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6426 f38109;

    public C11282(ActivityC6426 activityC6426) {
        this.f38109 = activityC6426;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ((AbstractC3603) abstractC12554).mo6660((AbstractC9871) this.f38109.f21767.get(i));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f38109.f21767.size();
    }

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        return ((AbstractC9871) this.f38109.f21767.get(i)).mo10351();
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC6426 activityC6426 = this.f38109;
        if (i == 0) {
            return new ViewOnClickListenerC12777(activityC6426, viewGroup);
        }
        if (i == 1) {
            return new C2108(activityC6426, viewGroup);
        }
        if (i == 2) {
            return new ViewOnTouchListenerC2192(activityC6426, viewGroup);
        }
        throw new RuntimeException();
    }
}
