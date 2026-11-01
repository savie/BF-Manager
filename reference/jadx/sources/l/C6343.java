package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6343 implements InterfaceC14152 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f21396;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC3520 f21397;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f21398;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f21399;

    @Override // l.InterfaceC14152
    /* JADX INFO: renamed from: ۨ */
    public final String mo5847() {
        return "Dex2Smali";
    }

    public C6343(ViewOnClickListenerC3520 viewOnClickListenerC3520, AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, AbstractActivityC12483 abstractActivityC12483) {
        this.f21397 = viewOnClickListenerC3520;
        this.f21398 = abstractC20745;
        this.f21396 = abstractC20746;
        this.f21399 = abstractActivityC12483;
    }

    @Override // l.InterfaceC14152
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC20745 mo5844() {
        return this.f21398;
    }

    @Override // l.InterfaceC14152
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC20745 mo5845() {
        return this.f21396;
    }

    @Override // l.InterfaceC14152
    /* JADX INFO: renamed from: ܰ */
    public final AbstractActivityC12483 mo5848() {
        return this.f21399;
    }

    @Override // l.InterfaceC14152
    /* JADX INFO: renamed from: ۙ */
    public final void mo5846(AbstractC20745 abstractC20745) {
        String strMo33986 = abstractC20745.mo33986();
        ViewOnClickListenerC3520 viewOnClickListenerC3520 = this.f21397;
        new C23983(viewOnClickListenerC3520, (AbstractActivityC12483) viewOnClickListenerC3520.requireActivity(), strMo33986, new ArrayList(), true).m10243();
    }
}
