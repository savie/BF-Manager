package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final class C4495 implements InterfaceC15080 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f15998;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f15999;

    public C4495(AbstractC20745 abstractC20745, Main main) {
        this.f15999 = abstractC20745;
        this.f15998 = main;
    }

    @Override // l.InterfaceC15080
    /* JADX INFO: renamed from: ۙ */
    public final void mo9566(C23630 c23630, InterfaceC23898 interfaceC23898, C6695 c6695) {
        c23630.m52100(interfaceC23898, this.f15999, true);
    }

    @Override // l.InterfaceC15080
    /* JADX INFO: renamed from: ۙ */
    public final void mo9565(View view, C23630 c23630, InterfaceC23898 interfaceC23898, C6695 c6695) {
        C16195 c16195 = new C16195(this.f15998, view, 0);
        C12418 c12418M38298 = c16195.m38298();
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(new C18748(interfaceC23898, c23630));
        c16195.m38297();
    }
}
