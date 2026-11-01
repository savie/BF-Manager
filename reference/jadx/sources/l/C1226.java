package l;

import java.nio.file.WatchEvent;

/* JADX INFO: renamed from: l.֨ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1226 implements InterfaceC8035 {
    public final /* synthetic */ WatchEvent.Modifier a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.a;
        if (obj instanceof C1226) {
            obj = ((C1226) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC8035
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
