package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ܳ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2RU */
/* JADX INFO: loaded from: classes5.dex */
public final class C14814 extends AbstractC4090 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC19234 f48428;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2112 f48429;

    public C14814(C2112 c2112, InterfaceC19234 interfaceC19234) {
        this.f48429 = c2112;
        this.f48428 = interfaceC19234;
    }

    @Override // l.InterfaceC15914
    public final String getType() {
        return (String) this.f48429.f7765.m29872().mo1014(this.f48428.getType());
    }

    @Override // l.InterfaceC19234
    public final Set getAnnotations() {
        return new C22659(this.f48428.getAnnotations(), this.f48429.f7765.m29868());
    }

    @Override // l.InterfaceC19234, l.InterfaceC19940
    public final String getName() {
        return this.f48428.getName();
    }

    @Override // l.AbstractC4090, l.InterfaceC19234, l.InterfaceC19940
    public final String getSignature() {
        return this.f48428.getSignature();
    }
}
