package l;

import java.nio.file.Path;
import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21688 implements InterfaceC19324 {
    public final /* synthetic */ WatchKey a;

    public /* synthetic */ C21688(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ InterfaceC19324 a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return watchKey instanceof C18866 ? ((C18866) watchKey).a : new C21688(watchKey);
    }

    @Override // l.InterfaceC19324
    public final /* synthetic */ void cancel() {
        this.a.cancel();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof C21688) {
            obj = ((C21688) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC19324
    public final /* synthetic */ boolean isValid() {
        return this.a.isValid();
    }

    @Override // l.InterfaceC19324
    public final /* synthetic */ List pollEvents() {
        return AbstractC1726.w(this.a.pollEvents());
    }

    @Override // l.InterfaceC19324
    public final /* synthetic */ boolean reset() {
        return this.a.reset();
    }

    @Override // l.InterfaceC19324
    public final /* synthetic */ InterfaceC16750 watchable() {
        Watchable watchable = this.a.watchable();
        if (watchable == null) {
            return null;
        }
        if (watchable instanceof C20278) {
            return ((C20278) watchable).a;
        }
        return watchable instanceof Path ? C9695.l((Path) watchable) : new C20983(watchable);
    }
}
