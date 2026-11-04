package l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.ۗ᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3670 implements WatchEvent.Kind {
    public final /* synthetic */ InterfaceC7920 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC7920 interfaceC7920 = this.a;
        if (obj instanceof C3670) {
            obj = ((C3670) obj).a;
        }
        return interfaceC7920.equals(obj);
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
