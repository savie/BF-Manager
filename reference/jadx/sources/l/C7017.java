package l;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: l.ۜ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7017 implements FileAttribute {
    public final /* synthetic */ InterfaceC20030 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC20030 interfaceC20030 = this.a;
        if (obj instanceof C7017) {
            obj = ((C7017) obj).a;
        }
        return interfaceC20030.equals(obj);
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
