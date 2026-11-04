package l;

import android.content.res.Configuration;

/* JADX INFO: renamed from: l.֨۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1172 implements InterfaceC0818 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4303;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f4304;

    public /* synthetic */ C1172(int i, Object obj) {
        this.f4303 = i;
        this.f4304 = obj;
    }

    @Override // l.InterfaceC0818
    public final void accept(Object obj) {
        switch (this.f4303) {
            case 0:
                AbstractC3191.m10415((AbstractC3191) this.f4304, (Configuration) obj);
                break;
            default:
                ((C14998) obj).m36106().setText(((C9097) this.f4304).m24245());
                break;
        }
    }
}
