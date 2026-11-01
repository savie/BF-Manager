package l;

import java.nio.file.PathMatcher;

/* JADX INFO: renamed from: l.ܽ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16895 implements InterfaceC6623 {
    public final /* synthetic */ PathMatcher a;

    public /* synthetic */ C16895(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof C16895) {
            obj = ((C16895) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC6623
    public final /* synthetic */ boolean matches(InterfaceC3800 interfaceC3800) {
        return this.a.matches(C3343.l(interfaceC3800));
    }
}
