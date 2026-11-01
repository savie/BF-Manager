package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2S6 */
/* JADX INFO: loaded from: classes5.dex */
public class C19047 extends AbstractC15381 implements InterfaceC17822 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC17822 f61606;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8464 f61607;

    public C19047(C8464 c8464, InterfaceC17822 interfaceC17822) {
        this.f61607 = c8464;
        this.f61606 = interfaceC17822;
    }

    @Override // l.InterfaceC18735
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1183() {
        return ((InterfaceC18735) this.f61607.f29363.m29867().mo1014(this.f61606)).mo1183();
    }

    @Override // l.InterfaceC18735
    public final String getName() {
        return ((InterfaceC18735) this.f61607.f29363.m29867().mo1014(this.f61606)).getName();
    }

    @Override // l.InterfaceC18735
    public final String getType() {
        return ((InterfaceC18735) this.f61607.f29363.m29867().mo1014(this.f61606)).getType();
    }

    @Override // l.InterfaceC17822
    /* JADX INFO: renamed from: ۨ */
    public final int mo28400() {
        return this.f61606.mo28400();
    }

    @Override // l.InterfaceC17822
    /* JADX INFO: renamed from: ۡۙ */
    public InterfaceC10975 mo28399() {
        return (InterfaceC10975) C15604.m37269(this.f61607.f29363.m29874(), this.f61606.mo28399());
    }

    @Override // l.InterfaceC17822
    public final Set getAnnotations() {
        return new C22659(this.f61606.getAnnotations(), this.f61607.f29363.m29868());
    }

    @Override // l.InterfaceC17822
    /* JADX INFO: renamed from: ۠ */
    public final Set mo28398() {
        return this.f61606.mo28398();
    }
}
