package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֡᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8TI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0726 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C7648 f3007;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C7648 f3008;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f3009;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f3010;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f3011;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f3012;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3013;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f3014;

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo3146(C2398 c2398) {
    }

    static {
        C10471 c10471 = new C10471();
        c10471.m26533("application/id3");
        f3007 = c10471.m26497();
        C10471 c10472 = new C10471();
        c10472.m26533("application/x-scte35");
        f3008 = c10472.m26497();
    }

    public C0726(String str, String str2, long j, long j2, byte[] bArr) {
        this.f3011 = str;
        this.f3014 = str2;
        this.f3010 = j;
        this.f3012 = j2;
        this.f3009 = bArr;
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7648 mo3145() {
        String str = this.f3011;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f3008;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f3007;
            default:
                return null;
        }
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] mo3147() {
        if (mo3145() != null) {
            return this.f3009;
        }
        return null;
    }

    public final int hashCode() {
        if (this.f3013 == 0) {
            String str = this.f3011;
            int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f3014;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f3010;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f3012;
            this.f3013 = Arrays.hashCode(this.f3009) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f3013;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0726.class == obj.getClass()) {
            C0726 c0726 = (C0726) obj;
            if (this.f3010 == c0726.f3010 && this.f3012 == c0726.f3012 && C13638.equals(this.f3011, c0726.f3011) && C13638.equals(this.f3014, c0726.f3014) && Arrays.equals(this.f3009, c0726.f3009)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f3011 + ", id=" + this.f3012 + ", durationMs=" + this.f3010 + ", value=" + this.f3014;
    }
}
