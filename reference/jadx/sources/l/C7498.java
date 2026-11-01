package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A91T */
/* JADX INFO: loaded from: classes3.dex */
public final class C7498 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20904 f24966;

    public C7498(ActivityC20904 activityC20904) {
        this.f24966 = activityC20904;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ((ViewOnClickListenerC18081) abstractC12554).m42076((C21609) this.f24966.f67933.get(i));
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC20904 activityC20904 = this.f24966;
        return new ViewOnClickListenerC18081(activityC20904, activityC20904.f67932, LayoutInflater.from(activityC20904).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f24966.f67933.size();
    }
}
