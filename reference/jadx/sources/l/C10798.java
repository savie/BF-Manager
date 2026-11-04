package l;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* JADX INFO: renamed from: l.ۤۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10798 implements InterfaceC12394 {
    public final /* synthetic */ OpenOption a;

    public /* synthetic */ C10798(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.file.StandardOpenOption, l.ۨ۬᩹] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.nio.file.LinkOption, l.ۨ۬᩹] */
    public static /* synthetic */ InterfaceC12394 a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof C5579) {
            return ((C5579) openOption).a;
        }
        if (!(openOption instanceof EnumC20599)) {
            return openOption instanceof EnumC0462 ? AbstractC1758.n((EnumC0462) openOption) : new C10798(openOption);
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof C10798) {
            obj = ((C10798) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
