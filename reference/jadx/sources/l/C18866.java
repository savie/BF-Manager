package l;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18866 implements WatchKey {
    public final /* synthetic */ InterfaceC19324 a;

    public /* synthetic */ C18866(InterfaceC19324 interfaceC19324) {
        this.a = interfaceC19324;
    }

    public static /* synthetic */ WatchKey a(InterfaceC19324 interfaceC19324) {
        if (interfaceC19324 == null) {
            return null;
        }
        return interfaceC19324 instanceof C21688 ? ((C21688) interfaceC19324).a : new C18866(interfaceC19324);
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ void cancel() {
        this.a.cancel();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC19324 interfaceC19324 = this.a;
        if (obj instanceof C18866) {
            obj = ((C18866) obj).a;
        }
        return interfaceC19324.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean isValid() {
        return this.a.isValid();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ List pollEvents() {
        return AbstractC1726.w(this.a.pollEvents());
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean reset() {
        return this.a.reset();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ Watchable watchable() {
        InterfaceC16750 interfaceC16750Watchable = this.a.watchable();
        if (interfaceC16750Watchable == null) {
            return null;
        }
        if (interfaceC16750Watchable instanceof C20983) {
            return ((C20983) interfaceC16750Watchable).a;
        }
        return interfaceC16750Watchable instanceof InterfaceC3800 ? C3343.l((InterfaceC3800) interfaceC16750Watchable) : new C20278(interfaceC16750Watchable);
    }
}
