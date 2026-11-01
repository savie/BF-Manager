package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J7C4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2640 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f10291;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C4647 f10292;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f10293;

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        ((ViewOnTouchListenerC5463) abstractC12554).m15128((C9843) this.f10293.get(i), this.f10292);
    }

    public C2640(AbstractActivityC12483 abstractActivityC12483, ArrayList arrayList) {
        this.f10291 = abstractActivityC12483;
        this.f10293 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8147(C4647 c4647) {
        this.f10292 = c4647;
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractActivityC12483 abstractActivityC12483 = this.f10291;
        return new ViewOnTouchListenerC5463(abstractActivityC12483, LayoutInflater.from(abstractActivityC12483).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f10293.size();
    }
}
