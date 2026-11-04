package l;

import java.nio.file.PathMatcher;

/* JADX INFO: renamed from: l.᩷᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22316 implements InterfaceC4191 {
    public final /* synthetic */ PathMatcher a;

    public /* synthetic */ C22316(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof C22316) {
            obj = ((C22316) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC4191
    public final /* synthetic */ boolean matches(InterfaceC24329 interfaceC24329) {
        return this.a.matches(C24971.i(interfaceC24329));
    }
}
