package l;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* JADX INFO: renamed from: l.ۚۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5579 implements OpenOption {
    public final /* synthetic */ InterfaceC12394 a;

    public /* synthetic */ C5579(InterfaceC12394 interfaceC12394) {
        this.a = interfaceC12394;
    }

    public static /* synthetic */ OpenOption a(InterfaceC12394 interfaceC12394) {
        if (interfaceC12394 == null) {
            return null;
        }
        if (interfaceC12394 instanceof C10798) {
            return ((C10798) interfaceC12394).a;
        }
        if (!(interfaceC12394 instanceof EnumC20599)) {
            return interfaceC12394 instanceof EnumC0462 ? AbstractC1758.n((EnumC0462) interfaceC12394) : new C5579(interfaceC12394);
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC12394 interfaceC12394 = this.a;
        if (obj instanceof C5579) {
            obj = ((C5579) obj).a;
        }
        return interfaceC12394.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
