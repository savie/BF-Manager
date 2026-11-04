package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13151 implements InterfaceC23507 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5694 f42074;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10745 f42075;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f42076;

    public C13151(ViewOnClickListenerC5694 viewOnClickListenerC5694, C10745 c10745, ActivityC0848 activityC0848) {
        this.f42074 = viewOnClickListenerC5694;
        this.f42075 = c10745;
        this.f42076 = activityC0848;
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19226() {
        return this.f42075.m27399();
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۤ */
    public final ActivityC0848 mo19227() {
        return this.f42076;
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19230(int i) {
        this.f42075.m27403(i);
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۙ */
    public final void mo19224(int i) {
        this.f42075.m27393(C21576.m49059(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۙ */
    public final void mo19225(C1878 c1878) {
        this.f42074.f19665.f6592.m51328(c1878, false);
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19229() {
        this.f42075.m27405();
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo19228() {
        return new C24253(this.f42076).m54266();
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩸ */
    public final void mo19231() {
        C22673.m51159(R.string.MT_Protector);
    }
}
