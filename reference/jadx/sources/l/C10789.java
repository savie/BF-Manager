package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2S3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10789 extends AbstractC9031 implements InterfaceC22762 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC22762 f36752;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23489 f36753;

    public C10789(C23489 c23489, InterfaceC22762 interfaceC22762) {
        this.f36753 = c23489;
        this.f36752 = interfaceC22762;
    }

    @Override // l.InterfaceC15914
    public final String getType() {
        return (String) this.f36753.f76050.m29872().mo1014(this.f36752.getType());
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۨ */
    public final int mo20491() {
        return this.f36752.mo20491();
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۬ۨ */
    public final String mo20494() {
        return (String) C15604.m37269(this.f36753.f76050.m29872(), this.f36752.mo20494());
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ᩹ۙ */
    public final List mo20500() {
        return new C14898(this.f36753.f76050.m29872(), this.f36752.mo20500());
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۬ */
    public final String mo20493() {
        return this.f36752.mo20493();
    }

    @Override // l.InterfaceC22762
    public final Set getAnnotations() {
        return new C22659(this.f36752.getAnnotations(), this.f36753.f76050.m29868());
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ܳۙ */
    public final Iterable mo20496() {
        return new C17719(this.f36752.mo20496(), this.f36753.f76050.m29861());
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۢܰ */
    public final Iterable mo20489() {
        return new C17719(this.f36752.mo20489(), this.f36753.f76050.m29861());
    }

    @Override // l.InterfaceC22762
    public final Iterable getFields() {
        return new C17138(this);
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ܰۨ */
    public final Iterable mo20495() {
        return new C17719(this.f36752.mo20495(), this.f36753.f76050.m29870());
    }

    @Override // l.InterfaceC22762
    /* JADX INFO: renamed from: ۚۨ */
    public final Iterable mo20486() {
        return new C17719(this.f36752.mo20486(), this.f36753.f76050.m29870());
    }

    @Override // l.InterfaceC22762
    public final Iterable getMethods() {
        return new C5849(this);
    }
}
