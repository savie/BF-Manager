package l;

import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.֡᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77Z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0646 implements InterfaceC12003, InterfaceC18485, InterfaceC13083 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2505;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2506;

    public /* synthetic */ C0646(Object obj, Object obj2) {
        this.f2505 = obj;
        this.f2506 = obj2;
    }

    @Override // l.InterfaceC13083
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1238 mo2836(int i) {
        return C8104.m21982((C8104) this.f2505, (C15146) this.f2506, i);
    }

    @Override // l.InterfaceC12003
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2838(C6038 c6038, boolean z, boolean z2) {
        C4059.m13060((C4059) this.f2505, (C16383) this.f2506, c6038, z, z2);
    }

    @Override // l.InterfaceC18485
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo2837(String str, C8877 c8877) {
        C20065 c20065 = (C20065) this.f2505;
        Main main = (Main) this.f2506;
        if (ApplicationC17729.f58262.getBoolean("bookmark_swipe_pos_aware", false)) {
            c20065.m46176(main.m121().m29751());
        }
        if (c8877 != null) {
            if (main.m126(c8877.m23755(), str, c8877.m23754())) {
                c20065.m46170();
            }
        } else {
            c20065.m46170();
            final AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
            final C8614 c8614M46155 = c20065.m46155();
            final boolean zMo4281 = abstractC22044M35193.mo4281();
            C21576.m49069(new Runnable() { // from class: l.ۚܿܳ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = zMo4281;
                    C8614 c8614 = c8614M46155;
                    AbstractC22044 abstractC22044 = abstractC22044M35193;
                    if (!z) {
                        c8614.m23230(abstractC22044.getName());
                    }
                    c8614.m23226(z ? abstractC22044.mo4294() : abstractC22044.getParent(), true);
                }
            }, 180L);
        }
    }
}
