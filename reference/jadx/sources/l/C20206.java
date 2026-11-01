package l;

import bin.mt.plus.R;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩶ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20206 implements InterfaceC21921, InterfaceC18848, InterfaceC3485, InterfaceC2123 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65568;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f65569;

    public /* synthetic */ C20206(int i, Object obj) {
        this.f65568 = i;
        this.f65569 = obj;
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        switch (this.f65568) {
            case 0:
                ((InterfaceC13856) this.f65569).mo33692(i);
                break;
            default:
                ((C6057) this.f65569).mo21455(i);
                break;
        }
    }

    @Override // l.InterfaceC2123
    /* JADX INFO: renamed from: ۙ */
    public int mo1698(String str, boolean z) {
        return ((HashSet) this.f65569).contains(str) ? 1 : 2;
    }

    @Override // l.InterfaceC3485
    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo4815(C4751 c4751) {
        C13251 c13251 = (C13251) this.f65569;
        return c13251.m13133().getString(R.string.MT_Protector, Integer.valueOf(c13251.m42292().getInt(c13251.m13157(), 10)));
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ */
    public void mo4355(AbstractC20745 abstractC20745) {
        C12035.m29934((C11545) this.f65569, abstractC20745);
    }
}
