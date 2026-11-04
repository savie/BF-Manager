package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7C4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5348 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f18783;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C11999 f18784;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f18785;

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        ((ViewOnTouchListenerC1619) abstractC11800).m5717((C10567) this.f18785.get(i), this.f18784);
    }

    public C5348(AbstractActivityC17204 abstractActivityC17204, ArrayList arrayList) {
        this.f18783 = abstractActivityC17204;
        this.f18785 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16001(C11999 c11999) {
        this.f18784 = c11999;
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractActivityC17204 abstractActivityC17204 = this.f18783;
        return new ViewOnTouchListenerC1619(abstractActivityC17204, LayoutInflater.from(abstractActivityC17204).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f18785.size();
    }
}
