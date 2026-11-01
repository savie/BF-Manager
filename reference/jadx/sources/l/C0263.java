package l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes2.dex */
public final class C0263 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4184 f1543;

    public C0263(C4184 c4184) {
        this.f1543 = c4184;
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ((ViewOnClickListenerC13358) abstractC12554).mo1473((AbstractC17902) ((ArrayList) this.f1543.f15235).get(i));
    }

    @Override // l.AbstractC0414
    public final void onViewRecycled(AbstractC12554 abstractC12554) {
        ((ViewOnClickListenerC13358) abstractC12554).mo1473((AbstractC17902) null);
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC13358(this.f1543.f15236, viewGroup);
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return ((ArrayList) this.f1543.f15235).size();
    }
}
