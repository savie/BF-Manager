package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1E5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7997 implements InterfaceC23507 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19184 f26544;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10745 f26545;

    public C7997(ViewOnClickListenerC19184 viewOnClickListenerC19184, C10745 c10745) {
        this.f26544 = viewOnClickListenerC19184;
        this.f26545 = c10745;
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19226() {
        return this.f26545.m27399();
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۤ */
    public final ActivityC0848 mo19227() {
        return this.f26544.f62047;
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19230(int i) {
        this.f26545.m27403(i);
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۙ */
    public final void mo19224(int i) {
        this.f26545.m27393(C21576.m49059(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ۙ */
    public final void mo19225(C1878 c1878) {
        ViewOnClickListenerC19184 viewOnClickListenerC19184 = this.f26544;
        viewOnClickListenerC19184.f62052.m51301(c1878, viewOnClickListenerC19184.f62040);
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19229() {
        this.f26545.m27405();
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo19228() {
        return new C24253(this.f26544.f62047).m54266();
    }

    @Override // l.InterfaceC23507
    /* JADX INFO: renamed from: ᩸ */
    public final void mo19231() {
        C22673.m51159(R.string.MT_Protector);
    }
}
