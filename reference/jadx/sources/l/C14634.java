package l;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* JADX INFO: renamed from: l.ܳܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14634 implements OpenOption {
    public final /* synthetic */ InterfaceC0978 a;

    public /* synthetic */ C14634(InterfaceC0978 interfaceC0978) {
        this.a = interfaceC0978;
    }

    public static /* synthetic */ OpenOption a(InterfaceC0978 interfaceC0978) {
        if (interfaceC0978 == null) {
            return null;
        }
        if (interfaceC0978 instanceof C12517) {
            return ((C12517) interfaceC0978).a;
        }
        if (!(interfaceC0978 instanceof EnumC22146)) {
            return interfaceC0978 instanceof EnumC17912 ? AbstractC1726.n((EnumC17912) interfaceC0978) : new C14634(interfaceC0978);
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0978 interfaceC0978 = this.a;
        if (obj instanceof C14634) {
            obj = ((C14634) obj).a;
        }
        return interfaceC0978.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
