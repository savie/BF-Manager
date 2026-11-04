package l;

import java.nio.file.Watchable;

/* JADX INFO: renamed from: l.۠᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8890 implements InterfaceC21987 {
    public final /* synthetic */ Watchable a;

    public /* synthetic */ C8890(Watchable watchable) {
        this.a = watchable;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Watchable watchable = this.a;
        if (obj instanceof C8890) {
            obj = ((C8890) obj).a;
        }
        return watchable.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC21987
    public final /* synthetic */ InterfaceC10156 register(InterfaceC1208 interfaceC1208, InterfaceC7920[] interfaceC7920Arr) {
        return C18586.a(this.a.register(C9635.b(interfaceC1208), AbstractC1758.L(interfaceC7920Arr)));
    }

    @Override // l.InterfaceC21987
    public final /* synthetic */ InterfaceC10156 register(InterfaceC1208 interfaceC1208, InterfaceC7920[] interfaceC7920Arr, InterfaceC19107[] interfaceC19107Arr) {
        return C18586.a(this.a.register(C9635.b(interfaceC1208), AbstractC1758.L(interfaceC7920Arr), AbstractC1758.M(interfaceC19107Arr)));
    }
}
