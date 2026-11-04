package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18311 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f59709 = C16980.m40037(C18311.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f59710;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23533 f59711;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C25398 f59712;

    public C18311(C23533 c23533, C25398 c25398, String str) {
        this.f59711 = c23533;
        this.f59712 = c25398;
        this.f59710 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18420 m42696(long j, int i, byte[] bArr) {
        C0653 c0653 = new C0653(j, i, bArr);
        ArrayList arrayList = new ArrayList();
        while (c0653.m2856()) {
            f59709.mo13701("Sending async write request to {} from offset {}", this.f59710, Long.valueOf(c0653.m21991()));
            arrayList.add(new C18420(this.f59711.m4260(this.f59712, c0653), new C14581(c0653.m21992())));
        }
        return new C18420(new C21404(arrayList), new C21295());
    }
}
