package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8TI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11976 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C15648 f38564;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C15648 f38565;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f38566;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f38567;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f38568;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f38569;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f38570;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f38571;

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12246(C18632 c18632) {
    }

    static {
        C20124 c20124 = new C20124();
        c20124.m46315("application/id3");
        f38565 = c20124.m46295();
        C20124 c20125 = new C20124();
        c20125.m46315("application/x-scte35");
        f38564 = c20125.m46295();
    }

    public C11976(String str, String str2, long j, long j2, byte[] bArr) {
        this.f38569 = str;
        this.f38568 = str2;
        this.f38566 = j;
        this.f38567 = j2;
        this.f38571 = bArr;
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final C15648 mo12245() {
        String str = this.f38569;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f38564;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f38565;
            default:
                return null;
        }
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo12247() {
        if (mo12245() != null) {
            return this.f38571;
        }
        return null;
    }

    public final int hashCode() {
        if (this.f38570 == 0) {
            String str = this.f38569;
            int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f38568;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f38566;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f38567;
            this.f38570 = Arrays.hashCode(this.f38571) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f38570;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11976.class == obj.getClass()) {
            C11976 c11976 = (C11976) obj;
            if (this.f38566 == c11976.f38566 && this.f38567 == c11976.f38567 && C17359.equals(this.f38569, c11976.f38569) && C17359.equals(this.f38568, c11976.f38568) && Arrays.equals(this.f38571, c11976.f38571)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f38569 + ", id=" + this.f38567 + ", durationMs=" + this.f38566 + ", value=" + this.f38568;
    }
}
