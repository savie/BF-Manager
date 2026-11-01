package l;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: l.ۧ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10858 implements UserPrincipal {
    public final /* synthetic */ InterfaceC14386 a;

    public /* synthetic */ C10858(InterfaceC14386 interfaceC14386) {
        this.a = interfaceC14386;
    }

    public static /* synthetic */ UserPrincipal a(InterfaceC14386 interfaceC14386) {
        if (interfaceC14386 == null) {
            return null;
        }
        if (interfaceC14386 instanceof C0666) {
            return ((C0666) interfaceC14386).a;
        }
        return interfaceC14386 instanceof C10546 ? ((C10546) interfaceC14386).a : new C10858(interfaceC14386);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC14386 interfaceC14386 = this.a;
        if (obj instanceof C10858) {
            obj = ((C10858) obj).a;
        }
        return interfaceC14386.equals(obj);
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
