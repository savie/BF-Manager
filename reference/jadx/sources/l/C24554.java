package l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.᩺᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24554 implements WatchEvent.Modifier {
    public final /* synthetic */ InterfaceC19107 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC19107 interfaceC19107 = this.a;
        if (obj instanceof C24554) {
            obj = ((C24554) obj).a;
        }
        return interfaceC19107.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Modifier
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
