package l;

/* JADX INFO: renamed from: l.᩺ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes.dex */
public final class C22742 extends AbstractC11453 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14981 f74076;

    public C22742(C14981 c14981) {
        this.f74076 = c14981;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50407() {
        AbstractC21330 abstractC21330 = this.f74076.f48889;
        int i = 256;
        int iM24486 = abstractC21330.f69430.m24486(abstractC21330.f69424) | 256;
        boolean zM44136 = abstractC21330.f17786.m44136();
        short[] sArr = this.f38554;
        if (zM44136) {
            do {
                abstractC21330.f69417.m46492(sArr, iM24486 >>> 8, (iM24486 >>> 7) & 1);
                iM24486 <<= 1;
            } while (iM24486 < 65536);
        } else {
            int iM24487 = abstractC21330.f69430.m24486(abstractC21330.f17788[0] + 1 + abstractC21330.f69424);
            do {
                iM24487 <<= 1;
                abstractC21330.f69417.m46492(sArr, (iM24487 & i) + i + (iM24486 >>> 8), (iM24486 >>> 7) & 1);
                iM24486 <<= 1;
                i &= ~(iM24487 ^ iM24486);
            } while (iM24486 < 65536);
        }
        abstractC21330.f17786.m44131();
    }
}
