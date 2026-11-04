package l;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8145 implements WatchKey {
    public final /* synthetic */ InterfaceC10156 a;

    public /* synthetic */ C8145(InterfaceC10156 interfaceC10156) {
        this.a = interfaceC10156;
    }

    public static /* synthetic */ WatchKey a(InterfaceC10156 interfaceC10156) {
        if (interfaceC10156 == null) {
            return null;
        }
        return interfaceC10156 instanceof C18586 ? ((C18586) interfaceC10156).a : new C8145(interfaceC10156);
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ void cancel() {
        this.a.cancel();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10156 interfaceC10156 = this.a;
        if (obj instanceof C8145) {
            obj = ((C8145) obj).a;
        }
        return interfaceC10156.equals(obj);
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
        return AbstractC1758.w(this.a.pollEvents());
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean reset() {
        return this.a.reset();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ Watchable watchable() {
        InterfaceC21987 interfaceC21987Watchable = this.a.watchable();
        if (interfaceC21987Watchable == null) {
            return null;
        }
        if (interfaceC21987Watchable instanceof C8890) {
            return ((C8890) interfaceC21987Watchable).a;
        }
        return interfaceC21987Watchable instanceof InterfaceC24329 ? C24971.i((InterfaceC24329) interfaceC21987Watchable) : new C14110(interfaceC21987Watchable);
    }
}
