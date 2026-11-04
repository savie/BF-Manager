package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ViewOnClickListenerC20498 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65644;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65645;

    public /* synthetic */ ViewOnClickListenerC20498(int i, Object obj) {
        this.f65644 = i;
        this.f65645 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f65644) {
            case 0:
                ((RunnableC3344) this.f65645).run();
                break;
            default:
                C25350 c25350 = (C25350) this.f65645;
                C18452 c18452 = new C18452(c25350.requireContext(), view, 0);
                C9898 c9898M42995 = c18452.m42995();
                String strM44060 = C18969.m44060(30, C11293.m28558(c25350.m56683()) + ".xml");
                String strM44061 = C18969.m44060(30, c25350.m56683().concat(".xml"));
                c9898M42995.add(R.string.MT_Protector, 0, 0, strM44060);
                c9898M42995.add(R.string.MT_Protector, 1, 0, strM44061);
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c18452.m42994(new C5256(3, c25350));
                c18452.mo21878();
                break;
        }
    }
}
