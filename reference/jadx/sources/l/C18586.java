package l;

import java.nio.file.Path;
import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18586 implements InterfaceC10156 {
    public final /* synthetic */ WatchKey a;

    public /* synthetic */ C18586(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ InterfaceC10156 a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return watchKey instanceof C8145 ? ((C8145) watchKey).a : new C18586(watchKey);
    }

    @Override // l.InterfaceC10156
    public final /* synthetic */ void cancel() {
        this.a.cancel();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof C18586) {
            obj = ((C18586) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC10156
    public final /* synthetic */ boolean isValid() {
        return this.a.isValid();
    }

    @Override // l.InterfaceC10156
    public final /* synthetic */ List pollEvents() {
        return AbstractC1758.w(this.a.pollEvents());
    }

    @Override // l.InterfaceC10156
    public final /* synthetic */ boolean reset() {
        return this.a.reset();
    }

    @Override // l.InterfaceC10156
    public final /* synthetic */ InterfaceC21987 watchable() {
        Watchable watchable = this.a.watchable();
        if (watchable == null) {
            return null;
        }
        if (watchable instanceof C14110) {
            return ((C14110) watchable).a;
        }
        return watchable instanceof Path ? C11544.i((Path) watchable) : new C8890(watchable);
    }
}
