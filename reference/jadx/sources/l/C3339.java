package l;

import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3339 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2758 f12364;

    public C3339(C2758 c2758) {
        this.f12364 = c2758;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ((ViewOnClickListenerC11932) abstractC12554).m29728(i);
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC11932(this.f12364, C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f12364.size();
    }
}
