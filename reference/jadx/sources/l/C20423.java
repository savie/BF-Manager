package l;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/* JADX INFO: renamed from: l.᩶᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20423 implements InterfaceC0273 {
    public final /* synthetic */ UserDefinedFileAttributeView a;

    public final /* synthetic */ boolean equals(Object obj) {
        UserDefinedFileAttributeView userDefinedFileAttributeView = this.a;
        if (obj instanceof C20423) {
            obj = ((C20423) obj).a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC1684
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
