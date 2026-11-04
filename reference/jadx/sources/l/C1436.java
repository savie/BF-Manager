package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C1436 extends AbstractC12964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8893 f5037;

    @Override // l.AbstractC12964
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public C1436(C8893 c8893) {
        this.f5037 = c8893;
    }

    @Override // l.AbstractC12964
    public final AbstractC11800 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8893 c8893 = this.f5037;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(c8893.f29056);
        if (i == 0) {
            return new C10384(layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
        }
        return new C2927(c8893, layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC12964
    public final void onBindViewHolder(AbstractC11800 abstractC11800, int i) {
        C8893 c8893 = this.f5037;
        if (i == 0) {
            C8893.m23786(c8893, abstractC11800.itemView);
            return;
        }
        C24778 c24778 = (C24778) c8893.f29055.f53645.get(i - 1);
        C2927 c2927 = (C2927) abstractC11800;
        c2927.f9588.setText(c24778.f80213);
        c2927.f9586.setText(c24778.f80214);
    }

    @Override // l.AbstractC12964
    public final int getItemCount() {
        return this.f5037.f29055.f53645.size() + 1;
    }
}
