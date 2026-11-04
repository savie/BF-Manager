package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛܽۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22S9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6526 extends AbstractC6968 implements InterfaceC8631 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC8631 f21939;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24426 f21940;

    public C6526(C24426 c24426, InterfaceC8631 interfaceC8631) {
        this.f21940 = c24426;
        this.f21939 = interfaceC8631;
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ܳ */
    public final String mo6804() {
        return ((InterfaceC4859) this.f21940.f79292.m54587().mo2798(this.f21939)).mo6804();
    }

    @Override // l.InterfaceC4859
    public final String getName() {
        return ((InterfaceC4859) this.f21940.f79292.m54587().mo2798(this.f21939)).getName();
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ܶ */
    public final List mo6805() {
        return ((InterfaceC4859) this.f21940.f79292.m54587().mo2798(this.f21939)).mo6805();
    }

    @Override // l.InterfaceC8631
    public final List getParameters() {
        return new C1305(this.f21940.f79292.m54586(), this.f21939.getParameters());
    }

    @Override // l.InterfaceC4859
    /* JADX INFO: renamed from: ۤ */
    public final String mo6802() {
        return ((InterfaceC4859) this.f21940.f79292.m54587().mo2798(this.f21939)).mo6802();
    }

    @Override // l.InterfaceC8631
    /* JADX INFO: renamed from: ᩷ */
    public final int mo13184() {
        return this.f21939.mo13184();
    }

    @Override // l.InterfaceC8631
    public final Set getAnnotations() {
        return new C10253(this.f21939.getAnnotations(), this.f21940.f79292.m54590());
    }

    @Override // l.InterfaceC8631
    /* JADX INFO: renamed from: ۗ */
    public final Set mo13176() {
        return this.f21939.mo13176();
    }

    @Override // l.InterfaceC8631
    /* JADX INFO: renamed from: ֫᩷ */
    public final InterfaceC7140 mo13175() {
        return (InterfaceC7140) C19906.m45835(this.f21940.f79292.m54593(), this.f21939.mo13175());
    }
}
