package l;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TA */
/* JADX INFO: loaded from: classes4.dex */
public final class C12722 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f42424;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f42425;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f42426;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f42427;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f42428;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f42429;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f42430;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f42431;

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

    public C12722(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f42424 = i;
        this.f42427 = str;
        this.f42428 = str2;
        this.f42429 = i2;
        this.f42425 = i3;
        this.f42430 = i4;
        this.f42426 = i5;
        this.f42431 = bArr;
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final void mo3146(C2398 c2398) {
        c2398.m7309(this.f42424, this.f42431);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f42427 + ", description=" + this.f42428;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12722.class == obj.getClass()) {
            C12722 c12722 = (C12722) obj;
            if (this.f42424 == c12722.f42424 && this.f42427.equals(c12722.f42427) && this.f42428.equals(c12722.f42428) && this.f42429 == c12722.f42429 && this.f42425 == c12722.f42425 && this.f42430 == c12722.f42430 && this.f42426 == c12722.f42426 && Arrays.equals(this.f42431, c12722.f42431)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42431) + ((((((((C13958.m33812(C13958.m33812((this.f42424 + 527) * 31, 31, this.f42427), 31, this.f42428) + this.f42429) * 31) + this.f42425) * 31) + this.f42430) * 31) + this.f42426) * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12722 m31570(C2460 c2460) {
        int iM7499 = c2460.m7499();
        String strM17989 = C6632.m17989(c2460.m7505(c2460.m7499(), StandardCharsets.US_ASCII));
        String strM7505 = c2460.m7505(c2460.m7499(), StandardCharsets.UTF_8);
        int iM74910 = c2460.m7499();
        int iM74911 = c2460.m7499();
        int iM74912 = c2460.m7499();
        int iM74913 = c2460.m7499();
        int iM74914 = c2460.m7499();
        byte[] bArr = new byte[iM74914];
        c2460.m7507(0, iM74914, bArr);
        return new C12722(iM7499, strM17989, strM7505, iM74910, iM74911, iM74912, iM74913, bArr);
    }
}
