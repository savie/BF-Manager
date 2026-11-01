package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8LA */
/* JADX INFO: loaded from: classes.dex */
public final class C24011 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f77804;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f77805;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f77806;

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C7648 mo3145() {
        return null;
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ byte[] mo3147() {
        return null;
    }

    public C24011(String str, byte[] bArr, String str2) {
        this.f77804 = bArr;
        this.f77806 = str;
        this.f77805 = str2;
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final void mo3146(C2398 c2398) {
        String str = this.f77806;
        if (str != null) {
            c2398.m7306(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24011.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f77804, ((C24011) obj).f77804);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f77804);
    }

    public final String toString() {
        return C12441.m30911(this.f77804.length, "\"", C12278.m30515("ICY: title=\"", this.f77806, "\", url=\"", this.f77805, "\", rawMetadata.length=\""));
    }
}
