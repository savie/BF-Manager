package l;

import java.nio.file.Path;
import java.nio.file.PathMatcher;

/* JADX INFO: renamed from: l.᩸᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23062 implements PathMatcher {
    public final /* synthetic */ InterfaceC4191 a;

    public /* synthetic */ C23062(InterfaceC4191 interfaceC4191) {
        this.a = interfaceC4191;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC4191 interfaceC4191 = this.a;
        if (obj instanceof C23062) {
            obj = ((C23062) obj).a;
        }
        return interfaceC4191.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(Path path) {
        return this.a.matches(C11544.i(path));
    }
}
