package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰ֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13487 extends AbstractC18908 implements InterfaceC18528 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC18528 f44574;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11370 f44575;

    public C13487(C11370 c11370, InterfaceC18528 interfaceC18528) {
        this.f44575 = c11370;
        this.f44574 = interfaceC18528;
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ᩹ */
    public final String mo9700() {
        return ((InterfaceC8858) this.f44575.f38351.m29873().mo1014(this.f44574)).mo9700();
    }

    @Override // l.InterfaceC8858
    public final String getName() {
        return ((InterfaceC8858) this.f44575.f38351.m29873().mo1014(this.f44574)).getName();
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ᩳ */
    public final List mo9699() {
        return ((InterfaceC8858) this.f44575.f38351.m29873().mo1014(this.f44574)).mo9699();
    }

    @Override // l.InterfaceC18528
    public final List getParameters() {
        return new C14898(this.f44575.f38351.m29869(), this.f44574.getParameters());
    }

    @Override // l.InterfaceC8858
    /* JADX INFO: renamed from: ۖ */
    public final String mo9698() {
        return ((InterfaceC8858) this.f44575.f38351.m29873().mo1014(this.f44574)).mo9698();
    }

    @Override // l.InterfaceC18528
    /* JADX INFO: renamed from: ۨ */
    public final int mo25750() {
        return this.f44574.mo25750();
    }

    @Override // l.InterfaceC18528
    public final Set getAnnotations() {
        return new C22659(this.f44574.getAnnotations(), this.f44575.f38351.m29868());
    }

    @Override // l.InterfaceC18528
    /* JADX INFO: renamed from: ۠ */
    public final Set mo25749() {
        return this.f44574.mo25749();
    }

    @Override // l.InterfaceC18528
    /* JADX INFO: renamed from: ۘܰ */
    public final InterfaceC7945 mo25747() {
        return (InterfaceC7945) C15604.m37269(this.f44575.f38351.m29875(), this.f44574.mo25747());
    }
}
