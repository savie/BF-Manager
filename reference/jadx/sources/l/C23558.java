package l;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;

/* JADX INFO: renamed from: l.᩻۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C23558 implements InterfaceC8429 {
    public final /* synthetic */ AclFileAttributeView a;

    @Override // l.InterfaceC8429
    public final /* synthetic */ void b(InterfaceC14386 interfaceC14386) throws IOException {
        this.a.setOwner(C10858.a(interfaceC14386));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.a;
        if (obj instanceof C23558) {
            obj = ((C23558) obj).a;
        }
        return aclFileAttributeView.equals(obj);
    }

    @Override // l.InterfaceC8429
    public final /* synthetic */ InterfaceC14386 getOwner() {
        return C0666.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC1684
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
