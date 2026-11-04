package l;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: renamed from: l.ܿۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18083 implements FileAttributeView {
    public final /* synthetic */ InterfaceC4659 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC4659 interfaceC4659 = this.a;
        if (obj instanceof C18083) {
            obj = ((C18083) obj).a;
        }
        return interfaceC4659.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
