package l;

/* JADX INFO: renamed from: l.۠ۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R68J */
/* JADX INFO: loaded from: classes3.dex */
public final class C7990 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12274 f26225 = new C12274();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8746 f26226 = new C8746();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14527 m21053(AbstractC12554 abstractC12554) {
        return m21048(abstractC12554, 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14527 m21050(AbstractC12554 abstractC12554) {
        return m21048(abstractC12554, 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14527 m21048(AbstractC12554 abstractC12554, int i) {
        C17867 c17867;
        C14527 c14527;
        C12274 c12274 = this.f26225;
        int iM30508 = c12274.m30508(abstractC12554);
        if (iM30508 >= 0 && (c17867 = (C17867) c12274.m30513(iM30508)) != null) {
            int i2 = c17867.f56570;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c17867.f56570 = i3;
                if (i == 4) {
                    c14527 = c17867.f56571;
                } else if (i == 8) {
                    c14527 = c17867.f56572;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    c12274.m30509(iM30508);
                    c17867.f56570 = 0;
                    c17867.f56571 = null;
                    c17867.f56572 = null;
                    C17867.f56569.mo5813(c17867);
                }
                return c14527;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21052(AbstractC12554 abstractC12554) {
        C17867 c17867 = (C17867) this.f26225.getOrDefault(abstractC12554, null);
        if (c17867 == null) {
            return;
        }
        c17867.f56570 &= -2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m21049(AbstractC12554 abstractC12554) {
        C8746 c8746 = this.f26226;
        int iM22707 = c8746.m22707();
        while (true) {
            iM22707--;
            if (iM22707 < 0) {
                break;
            } else if (abstractC12554 == c8746.m22701(iM22707)) {
                c8746.m22708(iM22707);
                break;
            }
        }
        C17867 c17867 = (C17867) this.f26225.remove(abstractC12554);
        if (c17867 != null) {
            c17867.f56570 = 0;
            c17867.f56571 = null;
            c17867.f56572 = null;
            C17867.f56569.mo5813(c17867);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21051(AbstractC12554 abstractC12554, C14527 c14527) {
        C12274 c12274 = this.f26225;
        C17867 c17867M41454 = (C17867) c12274.getOrDefault(abstractC12554, null);
        if (c17867M41454 == null) {
            c17867M41454 = C17867.m41454();
            c12274.put(abstractC12554, c17867M41454);
        }
        c17867M41454.f56572 = c14527;
        c17867M41454.f56570 |= 8;
    }
}
