package l;

import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;

/* JADX INFO: renamed from: l.۬᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14110 implements Watchable {
    public final /* synthetic */ InterfaceC21987 a;

    public /* synthetic */ C14110(InterfaceC21987 interfaceC21987) {
        this.a = interfaceC21987;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC21987 interfaceC21987 = this.a;
        if (obj instanceof C14110) {
            obj = ((C14110) obj).a;
        }
        return interfaceC21987.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return C8145.a(this.a.register(C10381.b(watchService), AbstractC1758.G(kindArr)));
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return C8145.a(this.a.register(C10381.b(watchService), AbstractC1758.G(kindArr), AbstractC1758.H(modifierArr)));
    }
}
