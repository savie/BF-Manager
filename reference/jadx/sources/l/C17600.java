package l;

import java.nio.file.Path;
import java.nio.file.PathMatcher;

/* JADX INFO: renamed from: l.ܿ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17600 implements PathMatcher {
    public final /* synthetic */ InterfaceC6623 a;

    public /* synthetic */ C17600(InterfaceC6623 interfaceC6623) {
        this.a = interfaceC6623;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC6623 interfaceC6623 = this.a;
        if (obj instanceof C17600) {
            obj = ((C17600) obj).a;
        }
        return interfaceC6623.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(Path path) {
        return this.a.matches(C9695.l(path));
    }
}
