package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13195 implements InterfaceC23507 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5738 f42142;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10745 f42143;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f42144;

    public C13195(ViewOnClickListenerC5738 viewOnClickListenerC5738, C10745 c10745, ActivityC0848 activityC0848) {
        this.f42142 = viewOnClickListenerC5738;
        this.f42143 = c10745;
        this.f42144 = activityC0848;
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19226() {
        return this.f42143.m27399();
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۤ */
    public final ActivityC0848 mo19227() {
        return this.f42144;
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19230(int i) {
        this.f42143.m27403(i);
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۙ */
    public final void mo19224(int i) {
        this.f42143.m27393(C21576.m49059(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۙ */
    public final void mo19225(C1878 c1878) {
        this.f42142.f19755.f6686.m51301(c1878, false);
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19229() {
        this.f42143.m27405();
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo19228() {
        return new C24253(this.f42144).m54266();
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩸ */
    public final void mo19231() {
        C22673.m51159(R.string.MT_Protector);
    }
}
