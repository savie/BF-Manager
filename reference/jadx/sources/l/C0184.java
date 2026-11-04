package l;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* JADX INFO: renamed from: l.֡ۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0184 implements InterfaceC18829 {
    public final /* synthetic */ FileOwnerAttributeView a;

    @Override // l.InterfaceC18829
    public final /* synthetic */ void b(InterfaceC5405 interfaceC5405) throws IOException {
        this.a.setOwner(C15099.a(interfaceC5405));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof C0184) {
            obj = ((C0184) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
    }

    @Override // l.InterfaceC18829
    public final /* synthetic */ InterfaceC5405 getOwner() {
        return C5162.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC1676
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
