package l;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: l.ۘۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3913 implements FileAttribute {
    public final /* synthetic */ InterfaceC13885 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC13885 interfaceC13885 = this.a;
        if (obj instanceof C3913) {
            obj = ((C3913) obj).a;
        }
        return interfaceC13885.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
