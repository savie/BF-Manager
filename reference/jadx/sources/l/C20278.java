package l;

import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;

/* JADX INFO: renamed from: l.᩶ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20278 implements Watchable {
    public final /* synthetic */ InterfaceC16750 a;

    public /* synthetic */ C20278(InterfaceC16750 interfaceC16750) {
        this.a = interfaceC16750;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC16750 interfaceC16750 = this.a;
        if (obj instanceof C20278) {
            obj = ((C20278) obj).a;
        }
        return interfaceC16750.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return C18866.a(this.a.register(C19572.b(watchService), AbstractC1726.G(kindArr)));
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return C18866.a(this.a.register(C19572.b(watchService), AbstractC1726.G(kindArr), AbstractC1726.H(modifierArr)));
    }
}
