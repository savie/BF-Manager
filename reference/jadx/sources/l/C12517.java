package l;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* JADX INFO: renamed from: l.۫ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12517 implements InterfaceC0978 {
    public final /* synthetic */ OpenOption a;

    public /* synthetic */ C12517(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.file.StandardOpenOption, l.֨۟ᩴ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.nio.file.LinkOption, l.֨۟ᩴ] */
    public static /* synthetic */ InterfaceC0978 a(OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof C14634) {
            return ((C14634) openOption).a;
        }
        if (!(openOption instanceof EnumC22146)) {
            return openOption instanceof EnumC17912 ? AbstractC1726.n((EnumC17912) openOption) : new C12517(openOption);
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof C12517) {
            obj = ((C12517) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
