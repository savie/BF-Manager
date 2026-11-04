package l;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TA */
/* JADX INFO: loaded from: classes5.dex */
public final class C17943 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f58782;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f58783;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f58784;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f58785;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f58786;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f58787;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f58788;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f58789;

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

    public C17943(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f58785 = i;
        this.f58787 = str;
        this.f58784 = str2;
        this.f58783 = i2;
        this.f58789 = i3;
        this.f58788 = i4;
        this.f58782 = i5;
        this.f58786 = bArr;
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final void mo12246(C18632 c18632) {
        c18632.m43370(this.f58785, this.f58786);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f58787 + ", description=" + this.f58784;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17943.class == obj.getClass()) {
            C17943 c17943 = (C17943) obj;
            if (this.f58785 == c17943.f58785 && this.f58787.equals(c17943.f58787) && this.f58784.equals(c17943.f58784) && this.f58783 == c17943.f58783 && this.f58789 == c17943.f58789 && this.f58788 == c17943.f58788 && this.f58782 == c17943.f58782 && Arrays.equals(this.f58786, c17943.f58786)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f58786) + ((((((((C12351.m30817(C12351.m30817((this.f58785 + 527) * 31, 31, this.f58787), 31, this.f58784) + this.f58783) * 31) + this.f58789) * 31) + this.f58788) * 31) + this.f58782) * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17943 m41885(C21287 c21287) {
        int iM48500 = c21287.m48500();
        String strM25264 = C9681.m25264(c21287.m48488(c21287.m48500(), StandardCharsets.US_ASCII));
        String strM48488 = c21287.m48488(c21287.m48500(), StandardCharsets.UTF_8);
        int iM48501 = c21287.m48500();
        int iM48502 = c21287.m48500();
        int iM48503 = c21287.m48500();
        int iM48504 = c21287.m48500();
        int iM48505 = c21287.m48500();
        byte[] bArr = new byte[iM48505];
        c21287.m48490(0, iM48505, bArr);
        return new C17943(iM48500, strM25264, strM48488, iM48501, iM48502, iM48503, iM48504, bArr);
    }
}
