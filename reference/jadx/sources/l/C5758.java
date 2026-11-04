package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۚܺۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: N98Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C5758 extends AbstractC1002 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC2338 f19802;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2029 f19803;

    public C5758(C2029 c2029, InterfaceC2338 interfaceC2338) {
        this.f19803 = c2029;
        this.f19802 = interfaceC2338;
    }

    @Override // l.InterfaceC2338
    public final String getName() {
        return this.f19802.getName();
    }

    @Override // l.InterfaceC2338
    public final int getIndex() {
        return this.f19802.getIndex();
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6813 mo7875() {
        return C19906.m45838(this.f19802.mo7875(), this.f19803.f6758);
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ܺ */
    public final String mo7877() {
        return this.f19802.mo7877();
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC13524 mo7878() {
        return new C22144(this.f19803.f6758.m54589(), this.f19802.mo7878());
    }

    @Override // l.InterfaceC2338
    /* JADX INFO: renamed from: ۧ */
    public final List mo7876() {
        return C4583.m14373(this.f19802.mo7876(), new C13215(this));
    }
}
