package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩷֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20538 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23361 f66521;

    public C20538(ActivityC23361 activityC23361) {
        this.f66521 = activityC23361;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ((AbstractC10661) abstractC12554).mo15777((AbstractC0076) this.f66521.f75683.get(i));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f66521.f75683.size();
    }

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        return ((AbstractC0076) this.f66521.f75683.get(i)).mo1010();
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC23361 activityC23361 = this.f66521;
        if (i == 1) {
            return new C19833(activityC23361, viewGroup);
        }
        if (i == 2) {
            return new ViewOnTouchListenerC5721(activityC23361, viewGroup);
        }
        throw new RuntimeException();
    }
}
