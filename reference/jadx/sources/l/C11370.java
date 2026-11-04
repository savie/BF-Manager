package l;

import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: renamed from: l.ۧۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11370 extends AbstractC19575 {
    public final /* synthetic */ UserPrincipalLookupService a;

    @Override // l.AbstractC19575
    public final /* synthetic */ C9132 a(String str) {
        return C9132.a(this.a.lookupPrincipalByGroupName(str));
    }

    @Override // l.AbstractC19575
    public final /* synthetic */ InterfaceC5405 b(String str) {
        return C5162.a(this.a.lookupPrincipalByName(str));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof C11370) {
            obj = ((C11370) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    public C11370(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }
}
