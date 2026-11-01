package l;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* JADX INFO: renamed from: l.ᩴ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C19012 implements FileOwnerAttributeView {
    public final /* synthetic */ InterfaceC8429 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8429 interfaceC8429 = this.a;
        if (obj instanceof C19012) {
            obj = ((C19012) obj).a;
        }
        return interfaceC8429.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return C10858.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.a.b(C0666.a(userPrincipal));
    }
}
