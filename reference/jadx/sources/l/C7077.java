package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48T4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7077 extends AbstractC4254 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f23742;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f23743;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2460 f23744;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f23745;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f23746;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2460 f23747;

    public C7077(InterfaceC8011 interfaceC8011) {
        super(interfaceC8011);
        this.f23747 = new C2460(C11551.f38845);
        this.f23744 = new C2460(4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18952(C2460 c2460) throws C13428 {
        int iM7516 = c2460.m7516();
        int i = (iM7516 >> 4) & 15;
        int i2 = iM7516 & 15;
        if (i2 != 7) {
            throw new C13428(C8479.m22141(i2, "Video format not supported: "));
        }
        this.f23746 = i;
        return i != 5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18951(long j, C2460 c2460) {
        int iM7516 = c2460.m7516();
        long jM7520 = (((long) c2460.m7520()) * 1000) + j;
        InterfaceC8011 interfaceC8011 = this.f15367;
        if (iM7516 == 0 && !this.f23745) {
            C2460 c2461 = new C2460(new byte[c2460.m7503()]);
            c2460.m7507(0, c2460.m7503(), c2461.m7518());
            C3257 c3257M9737 = C3257.m9737(c2461);
            this.f23742 = c3257M9737.f12105;
            C10471 c10471 = new C10471();
            c10471.m26521("video/x-flv");
            c10471.m26533("video/avc");
            c10471.m26502(c3257M9737.f12106);
            c10471.m26525(c3257M9737.f12109);
            c10471.m26534(c3257M9737.f12100);
            c10471.m26519(c3257M9737.f12111);
            c10471.m26503((List) c3257M9737.f12107);
            interfaceC8011.mo8116(c10471.m26497());
            this.f23745 = true;
            return false;
        }
        if (iM7516 == 1 && this.f23745) {
            int i = this.f23746 == 1 ? 1 : 0;
            if (this.f23743 || i != 0) {
                C2460 c2462 = this.f23744;
                byte[] bArrM7518 = c2462.m7518();
                bArrM7518[0] = 0;
                bArrM7518[1] = 0;
                bArrM7518[2] = 0;
                int i2 = 4 - this.f23742;
                int i3 = 0;
                while (c2460.m7503() > 0) {
                    c2460.m7507(i2, this.f23742, c2462.m7518());
                    c2462.m7510(0);
                    int iM7531 = c2462.m7531();
                    C2460 c2463 = this.f23747;
                    c2463.m7510(0);
                    interfaceC8011.mo8112(4, c2463);
                    interfaceC8011.mo8112(iM7531, c2460);
                    i3 = i3 + 4 + iM7531;
                }
                this.f15367.mo8114(jM7520, i, i3, 0, null);
                this.f23743 = true;
                return true;
            }
        }
        return false;
    }
}
