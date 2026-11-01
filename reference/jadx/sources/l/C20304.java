package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20304 extends AbstractC0414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12543 f65776;

    @Override // l.AbstractC0414
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public C20304(C12543 c12543) {
        this.f65776 = c12543;
    }

    @Override // l.AbstractC0414
    public final AbstractC12554 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12543 c12543 = this.f65776;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(c12543.f41986);
        if (i == 0) {
            return new C16071(layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
        }
        return new C16776(c12543, layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC0414
    public final void onBindViewHolder(AbstractC12554 abstractC12554, int i) {
        C12543 c12543 = this.f65776;
        if (i == 0) {
            C12543.m31182(c12543, abstractC12554.itemView);
            return;
        }
        C18593 c18593 = (C18593) c12543.f41985.f26263.get(i - 1);
        C16776 c16776 = (C16776) abstractC12554;
        c16776.f53702.setText(c18593.f59151);
        c16776.f53700.setText(c18593.f59153);
    }

    @Override // l.AbstractC0414
    public final int getItemCount() {
        return this.f65776.f41985.f26263.size() + 1;
    }
}
