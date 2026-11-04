package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܽܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X6CD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17700 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f58172;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58173;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f58174;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f58175;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f58176;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f58177;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f58178;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f58179;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f58180;

    public C17700(C12479 c12479) {
        c12479.m30983(4);
        new String(c12479.m30983(3), StandardCharsets.US_ASCII);
        c12479.m31012(1);
        c12479.m30990();
        c12479.m30983(20);
        c12479.m30990();
        c12479.m30990();
        int iM30990 = c12479.m30990();
        if (iM30990 != 305419896) {
            throw new C13817(C4791.m14766(new StringBuilder("Unexpected endian tag: 0x"), iM30990));
        }
        c12479.m30990();
        c12479.m30990();
        int iM30991 = c12479.m30990();
        c12479.m30990();
        this.f58174 = c12479.m30990();
        c12479.m30990();
        this.f58172 = c12479.m30990();
        c12479.m30990();
        this.f58176 = c12479.m30990();
        c12479.m30990();
        this.f58180 = c12479.m30990();
        c12479.m30990();
        this.f58177 = c12479.m30990();
        this.f58175 = c12479.m30990();
        this.f58179 = c12479.m30990();
        c12479.m30990();
        c12479.m30990();
        c12479.m30988(iM30991);
        int iM30992 = c12479.m30990();
        for (int i = 0; i < iM30992; i++) {
            int iM31000 = c12479.m31000();
            c12479.m31012(6);
            int iM30993 = c12479.m30990();
            if (iM31000 == 7) {
                this.f58173 = iM30993;
            } else if (iM31000 == 8) {
                this.f58178 = iM30993;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m41455() {
        return this.f58175;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m41459() {
        return this.f58179;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m41454() {
        return this.f58174;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41452() {
        return this.f58172;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m41460() {
        return this.f58180;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m41456() {
        return this.f58176;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m41457() {
        return this.f58177;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41453() {
        return this.f58173;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m41458() {
        return this.f58178;
    }
}
