package l;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: renamed from: l.ۙ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4900 extends UserPrincipalLookupService {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ AbstractC5918 a;

    public /* synthetic */ C4900(AbstractC5918 abstractC5918) {
        this.a = abstractC5918;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC5918 abstractC5918 = this.a;
        if (obj instanceof C4900) {
            obj = ((C4900) obj).a;
        }
        return abstractC5918.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ GroupPrincipal lookupPrincipalByGroupName(String str) {
        C10546 c10546A = this.a.a(str);
        if (c10546A == null) {
            return null;
        }
        return c10546A.a;
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ UserPrincipal lookupPrincipalByName(String str) {
        return C10858.a(this.a.b(str));
    }
}
