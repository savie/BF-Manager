package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܽۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N98Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C16433 extends AbstractC23142 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC18029 f52852;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12200 f52853;

    public C16433(C12200 c12200, InterfaceC18029 interfaceC18029) {
        this.f52853 = c12200;
        this.f52852 = interfaceC18029;
    }

    @Override // l.InterfaceC18029
    public final String getName() {
        return this.f52852.getName();
    }

    @Override // l.InterfaceC18029
    public final int getIndex() {
        return this.f52852.getIndex();
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC8152 mo19719() {
        return C15604.m37272(this.f52852.mo19719(), this.f52853.f40803);
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ܶ */
    public final String mo19722() {
        return this.f52852.mo19722();
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC19441 mo19721() {
        return new C9959(this.f52853.f40803.m29872(), this.f52852.mo19721());
    }

    @Override // l.InterfaceC18029
    /* JADX INFO: renamed from: ۜ */
    public final List mo19720() {
        return C3051.m9144(this.f52852.mo19720(), new C0204(this));
    }
}
