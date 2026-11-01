package l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.ۚܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5460 implements WatchEvent.Kind {
    public final /* synthetic */ InterfaceC18618 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC18618 interfaceC18618 = this.a;
        if (obj instanceof C5460) {
            obj = ((C5460) obj).a;
        }
        return interfaceC18618.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
