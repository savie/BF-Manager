package l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.ۘܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4048 implements WatchEvent.Modifier {
    public final /* synthetic */ InterfaceC8035 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8035 interfaceC8035 = this.a;
        if (obj instanceof C4048) {
            obj = ((C4048) obj).a;
        }
        return interfaceC8035.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Modifier
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
