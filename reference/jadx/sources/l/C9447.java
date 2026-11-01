package l;

import java.nio.file.attribute.UserPrincipalLookupService;

/* JADX INFO: renamed from: l.ۢ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9447 extends AbstractC5918 {
    public final /* synthetic */ UserPrincipalLookupService a;

    @Override // l.AbstractC5918
    public final /* synthetic */ C10546 a(String str) {
        return C10546.a(this.a.lookupPrincipalByGroupName(str));
    }

    @Override // l.AbstractC5918
    public final /* synthetic */ InterfaceC14386 b(String str) {
        return C0666.a(this.a.lookupPrincipalByName(str));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof C9447) {
            obj = ((C9447) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    public C9447(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }
}
