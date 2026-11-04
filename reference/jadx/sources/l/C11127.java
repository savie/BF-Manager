package l;

import java.nio.file.CopyOption;

/* JADX INFO: renamed from: l.ۤ᩷ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11127 implements CopyOption {
    public final /* synthetic */ InterfaceC1954 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1954 interfaceC1954 = this.a;
        if (obj instanceof C11127) {
            obj = ((C11127) obj).a;
        }
        return interfaceC1954.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
