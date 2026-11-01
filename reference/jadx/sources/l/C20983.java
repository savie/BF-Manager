package l;

import java.nio.file.Watchable;

/* JADX INFO: renamed from: l.᩷ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20983 implements InterfaceC16750 {
    public final /* synthetic */ Watchable a;

    public /* synthetic */ C20983(Watchable watchable) {
        this.a = watchable;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Watchable watchable = this.a;
        if (obj instanceof C20983) {
            obj = ((C20983) obj).a;
        }
        return watchable.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC16750
    public final /* synthetic */ InterfaceC19324 register(InterfaceC8741 interfaceC8741, InterfaceC18618[] interfaceC18618Arr) {
        return C21688.a(this.a.register(C10400.b(interfaceC8741), AbstractC1726.L(interfaceC18618Arr)));
    }

    @Override // l.InterfaceC16750
    public final /* synthetic */ InterfaceC19324 register(InterfaceC8741 interfaceC8741, InterfaceC18618[] interfaceC18618Arr, InterfaceC8035[] interfaceC8035Arr) {
        return C21688.a(this.a.register(C10400.b(interfaceC8741), AbstractC1726.L(interfaceC18618Arr), AbstractC1726.M(interfaceC8035Arr)));
    }
}
