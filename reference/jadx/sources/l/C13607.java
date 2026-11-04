package l;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/* JADX INFO: renamed from: l.۬ۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13607 implements InterfaceC4659 {
    public final /* synthetic */ UserDefinedFileAttributeView a;

    public final /* synthetic */ boolean equals(Object obj) {
        UserDefinedFileAttributeView userDefinedFileAttributeView = this.a;
        if (obj instanceof C13607) {
            obj = ((C13607) obj).a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC1676
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
