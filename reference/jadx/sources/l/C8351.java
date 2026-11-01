package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: KAG4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8351 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f28933;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f28934;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f28935;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f28936;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f28937;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f28938;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f28939;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f28940;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f28941;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f28942;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8351 m21852(int i, AbstractC12068 abstractC12068) {
        if (abstractC12068 instanceof C22462) {
            return new C8351(i, (C22462) abstractC12068);
        }
        throw new RuntimeException();
    }

    public C8351(int i, C22462 c22462) {
        this.f28938 = i;
        this.f28941 = c22462.f73329;
        this.f28940 = c22462.f73323;
        this.f28935 = c22462.f73326;
        boolean z = c22462.f73321;
        this.f28942 = z;
        if (z) {
            this.f28933 = c22462.f73325;
            this.f28937 = c22462.f73330;
        } else {
            this.f28933 = c22462.f73328;
            this.f28937 = "";
        }
        this.f28936 = c22462.f73324;
        int i2 = c22462.f73322;
        this.f28934 = i2;
        if (i2 != -1) {
            this.f28939 = c22462.f73327;
        } else {
            this.f28939 = "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21735 m21853(int i, String str) {
        C21735 c21735M15757 = C5717.m15757(i);
        if (c21735M15757 == null) {
            c21735M15757 = C5717.m15773(str);
        }
        if (c21735M15757 != null) {
            return c21735M15757;
        }
        if (str.startsWith("sshj://")) {
            str = str.substring(7);
        }
        throw new C8142(C16737.m39264(R.string.MT_Protector, str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8351.class == obj.getClass()) {
            C8351 c8351 = (C8351) obj;
            if (this.f28938 == c8351.f28938 && this.f28940 == c8351.f28940 && this.f28942 == c8351.f28942 && this.f28941.equals(c8351.f28941) && this.f28935.equals(c8351.f28935) && this.f28933.equals(c8351.f28933) && this.f28937.equals(c8351.f28937) && this.f28936.equals(c8351.f28936) && this.f28934 == c8351.f28934 && this.f28939.equals(c8351.f28939)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f28938), this.f28941, Integer.valueOf(this.f28940), this.f28935, this.f28933, this.f28937, Boolean.valueOf(this.f28942), this.f28936, Integer.valueOf(this.f28934), this.f28939);
    }
}
