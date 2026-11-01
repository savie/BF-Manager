package l;

import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.StandardCopyOption;

/* JADX INFO: renamed from: l.۟۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7329 implements InterfaceC1767 {
    public final /* synthetic */ CopyOption a;

    public /* synthetic */ C7329(CopyOption copyOption) {
        this.a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.file.StandardCopyOption, l.֫ۤᩴ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.nio.file.StandardCopyOption, l.֫ۤᩴ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.nio.file.StandardCopyOption, l.֫ۤᩴ] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.nio.file.LinkOption, l.֫ۤᩴ] */
    public static /* synthetic */ InterfaceC1767 a(CopyOption copyOption) {
        if (copyOption == 0) {
            return null;
        }
        if (copyOption instanceof C12662) {
            return ((C12662) copyOption).a;
        }
        if (copyOption instanceof EnumC22146) {
            return LinkOption.NOFOLLOW_LINKS;
        }
        if (!(copyOption instanceof EnumC21440)) {
            return new C7329(copyOption);
        }
        EnumC21440 enumC21440 = (EnumC21440) copyOption;
        if (enumC21440 == EnumC21440.REPLACE_EXISTING) {
            return StandardCopyOption.REPLACE_EXISTING;
        }
        return enumC21440 == EnumC21440.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        CopyOption copyOption = this.a;
        if (obj instanceof C7329) {
            obj = ((C7329) obj).a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
