package l;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: l.ܳۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15099 implements UserPrincipal {
    public final /* synthetic */ InterfaceC5405 a;

    public /* synthetic */ C15099(InterfaceC5405 interfaceC5405) {
        this.a = interfaceC5405;
    }

    public static /* synthetic */ UserPrincipal a(InterfaceC5405 interfaceC5405) {
        if (interfaceC5405 == null) {
            return null;
        }
        if (interfaceC5405 instanceof C5162) {
            return ((C5162) interfaceC5405).a;
        }
        return interfaceC5405 instanceof C9132 ? ((C9132) interfaceC5405).a : new C15099(interfaceC5405);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC5405 interfaceC5405 = this.a;
        if (obj instanceof C15099) {
            obj = ((C15099) obj).a;
        }
        return interfaceC5405.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }
}
