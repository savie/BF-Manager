package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ܶܽۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2RU */
/* JADX INFO: loaded from: classes5.dex */
public final class C16220 extends AbstractC18901 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC13851 f52707;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23680 f52708;

    public C16220(C23680 c23680, InterfaceC13851 interfaceC13851) {
        this.f52708 = c23680;
        this.f52707 = interfaceC13851;
    }

    @Override // l.InterfaceC19775
    public final String getType() {
        return (String) this.f52708.f76786.m54589().mo2798(this.f52707.getType());
    }

    @Override // l.InterfaceC13851
    public final Set getAnnotations() {
        return new C10253(this.f52707.getAnnotations(), this.f52708.f76786.m54590());
    }

    @Override // l.InterfaceC13851, l.InterfaceC15125
    public final String getName() {
        return this.f52707.getName();
    }

    @Override // l.AbstractC18901, l.InterfaceC13851, l.InterfaceC15125
    public final String getSignature() {
        return this.f52707.getSignature();
    }
}
