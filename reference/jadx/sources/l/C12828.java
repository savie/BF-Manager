package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12828 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f42702 = C13488.m32997(C12828.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f42703;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9570 f42704;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6396 f42705;

    public C12828(C9570 c9570, C6396 c6396, String str) {
        this.f42704 = c9570;
        this.f42705 = c6396;
        this.f42703 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12851 m31829(long j, int i, byte[] bArr) {
        C3923 c3923 = new C3923(j, i, bArr);
        ArrayList arrayList = new ArrayList();
        while (c3923.m11385()) {
            f42702.mo12121("Sending async write request to {} from offset {}", this.f42703, Long.valueOf(c3923.m18241()));
            arrayList.add(new C12851(this.f42704.m47749(this.f42705, c3923), new C22000(c3923.m18244())));
        }
        return new C12851(new C0855(arrayList), new C0832());
    }
}
