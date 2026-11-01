package l;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: renamed from: l.᩸᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21834 implements FileAttributeView {
    public final /* synthetic */ InterfaceC0273 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0273 interfaceC0273 = this.a;
        if (obj instanceof C21834) {
            obj = ((C21834) obj).a;
        }
        return interfaceC0273.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
