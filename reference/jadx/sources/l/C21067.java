package l;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: renamed from: l.᩶ۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21067 implements InterfaceC4659 {
    public final /* synthetic */ FileAttributeView a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttributeView fileAttributeView = this.a;
        if (obj instanceof C21067) {
            obj = ((C21067) obj).a;
        }
        return fileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC1676
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
