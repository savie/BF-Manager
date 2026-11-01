package l;

import java.nio.file.CopyOption;

/* JADX INFO: renamed from: l.۫᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12662 implements CopyOption {
    public final /* synthetic */ InterfaceC1767 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1767 interfaceC1767 = this.a;
        if (obj instanceof C12662) {
            obj = ((C12662) obj).a;
        }
        return interfaceC1767.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
