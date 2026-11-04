package l;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: renamed from: l.ܺۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16591 extends UserPrincipalLookupService {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ AbstractC19575 a;

    public /* synthetic */ C16591(AbstractC19575 abstractC19575) {
        this.a = abstractC19575;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC19575 abstractC19575 = this.a;
        if (obj instanceof C16591) {
            obj = ((C16591) obj).a;
        }
        return abstractC19575.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ GroupPrincipal lookupPrincipalByGroupName(String str) {
        C9132 c9132A = this.a.a(str);
        if (c9132A == null) {
            return null;
        }
        return c9132A.a;
    }

    @Override // java.nio.file.attribute.UserPrincipalLookupService
    public final /* synthetic */ UserPrincipal lookupPrincipalByName(String str) {
        return C15099.a(this.a.b(str));
    }
}
