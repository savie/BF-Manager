package l;

import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.StandardCopyOption;

/* JADX INFO: renamed from: l.ۖ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2699 implements InterfaceC1954 {
    public final /* synthetic */ CopyOption a;

    public /* synthetic */ C2699(CopyOption copyOption) {
        this.a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.file.StandardCopyOption, l.֫۬᩹] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.nio.file.StandardCopyOption, l.֫۬᩹] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.nio.file.StandardCopyOption, l.֫۬᩹] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.nio.file.LinkOption, l.֫۬᩹] */
    public static /* synthetic */ InterfaceC1954 a(CopyOption copyOption) {
        if (copyOption == 0) {
            return null;
        }
        if (copyOption instanceof C11127) {
            return ((C11127) copyOption).a;
        }
        if (copyOption instanceof EnumC20599) {
            return LinkOption.NOFOLLOW_LINKS;
        }
        if (!(copyOption instanceof EnumC18361)) {
            return new C2699(copyOption);
        }
        EnumC18361 enumC18361 = (EnumC18361) copyOption;
        if (enumC18361 == EnumC18361.REPLACE_EXISTING) {
            return StandardCopyOption.REPLACE_EXISTING;
        }
        return enumC18361 == EnumC18361.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        CopyOption copyOption = this.a;
        if (obj instanceof C2699) {
            obj = ((C2699) obj).a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
