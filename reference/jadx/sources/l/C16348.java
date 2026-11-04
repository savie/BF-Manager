package l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.ܶ᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16348 implements InterfaceC7920 {
    public final /* synthetic */ WatchEvent.Kind a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Kind kind = this.a;
        if (obj instanceof C16348) {
            obj = ((C16348) obj).a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC7920
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // l.InterfaceC7920
    public final /* synthetic */ Class type() {
        return this.a.type();
    }
}
