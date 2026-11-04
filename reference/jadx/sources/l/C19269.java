package l;

import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26HN */
/* JADX INFO: loaded from: classes5.dex */
public final class C19269 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9572 f62312;

    public C19269(ActivityC9572 activityC9572) {
        this.f62312 = activityC9572;
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ((C1370) abstractC11800).m5052((C14113) this.f62312.f30978.get(i));
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C1370(this.f62312, C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f62312.f30978.size();
    }

    @Override // l.AbstractC12964
    public final long getItemId(int i) {
        return ((C14113) this.f62312.f30978.get(i)).f44634;
    }
}
