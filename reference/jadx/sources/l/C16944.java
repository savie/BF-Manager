package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺܺۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2S3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16944 extends AbstractC22081 implements InterfaceC10122 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC10122 f55353;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17690 f55354;

    public C16944(C17690 c17690, InterfaceC10122 interfaceC10122) {
        this.f55354 = c17690;
        this.f55353 = interfaceC10122;
    }

    @Override // l.InterfaceC19775
    public final String getType() {
        return (String) this.f55354.f58151.m54589().mo2798(this.f55353.getType());
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ᩷ */
    public final int mo20404() {
        return this.f55353.mo20404();
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ֫ۤ */
    public final String mo20397() {
        return (String) C19906.m45835(this.f55354.f58151.m54589(), this.f55353.mo20397());
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ܳۙ */
    public final List mo20402() {
        return new C1305(this.f55354.f58151.m54589(), this.f55353.mo20402());
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ۚ */
    public final String mo20400() {
        return this.f55353.mo20400();
    }

    @Override // l.InterfaceC10122
    public final Set getAnnotations() {
        return new C10253(this.f55353.getAnnotations(), this.f55354.f58151.m54590());
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ۖۙ */
    public final Iterable mo20398() {
        return new C2796(this.f55353.mo20398(), this.f55354.f58151.m54577());
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ۜ᩷ */
    public final Iterable mo20401() {
        return new C2796(this.f55353.mo20401(), this.f55354.f58151.m54577());
    }

    @Override // l.InterfaceC10122
    public final Iterable getFields() {
        return new C11723(this);
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ᩷ۤ */
    public final Iterable mo20405() {
        return new C2796(this.f55353.mo20405(), this.f55354.f58151.m54585());
    }

    @Override // l.InterfaceC10122
    /* JADX INFO: renamed from: ܳۤ */
    public final Iterable mo20403() {
        return new C2796(this.f55353.mo20403(), this.f55354.f58151.m54585());
    }

    @Override // l.InterfaceC10122
    public final Iterable getMethods() {
        return new C25150(this);
    }
}
