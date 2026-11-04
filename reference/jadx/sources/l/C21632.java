package l;

/* JADX INFO: renamed from: l.᩶᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes.dex */
public final class C21632 extends AbstractC23870 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18648 f69075;

    public C21632(C18648 c18648) {
        this.f69075 = c18648;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49170() {
        AbstractC0749 abstractC0749 = this.f69075.f60641;
        int i = 256;
        int iM56717 = abstractC0749.f2729.m56717(abstractC0749.f2727) | 256;
        boolean zM5328 = abstractC0749.f66848.m5328();
        short[] sArr = this.f77275;
        if (zM5328) {
            do {
                abstractC0749.f2736.m20489(sArr, iM56717 >>> 8, (iM56717 >>> 7) & 1);
                iM56717 <<= 1;
            } while (iM56717 < 65536);
        } else {
            int iM56718 = abstractC0749.f2729.m56717(abstractC0749.f66852[0] + 1 + abstractC0749.f2727);
            do {
                iM56718 <<= 1;
                abstractC0749.f2736.m20489(sArr, (iM56718 & i) + i + (iM56717 >>> 8), (iM56717 >>> 7) & 1);
                iM56717 <<= 1;
                i &= ~(iM56718 ^ iM56717);
            } while (iM56717 < 65536);
        }
        abstractC0749.f66848.m5329();
    }
}
