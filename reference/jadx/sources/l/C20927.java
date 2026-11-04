package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L8LA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20927 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f66959;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f66960;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f66961;

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C15648 mo12245() {
        return null;
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ byte[] mo12247() {
        return null;
    }

    public C20927(String str, byte[] bArr, String str2) {
        this.f66959 = bArr;
        this.f66961 = str;
        this.f66960 = str2;
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final void mo12246(C18632 c18632) {
        String str = this.f66961;
        if (str != null) {
            c18632.m43367(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20927.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f66959, ((C20927) obj).f66959);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f66959);
    }

    public final String toString() {
        return C12669.m31437(this.f66959.length, "\"", C3188.m10406("ICY: title=\"", this.f66961, "\", url=\"", this.f66960, "\", rawMetadata.length=\""));
    }
}
