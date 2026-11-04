package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۡۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 48T4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9343 extends AbstractC1141 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f30358;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f30359;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21287 f30360;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C21287 f30361;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f30362;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f30363;

    public C9343(InterfaceC22024 interfaceC22024) {
        super(interfaceC22024);
        this.f30360 = new C21287(C14399.f45378);
        this.f30361 = new C21287(4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24628(C21287 c21287) throws C10089 {
        int iM48493 = c21287.m48493();
        int i = (iM48493 >> 4) & 15;
        int i2 = iM48493 & 15;
        if (i2 != 7) {
            throw new C10089(C13645.m33382(i2, "Video format not supported: "));
        }
        this.f30362 = i;
        return i != 5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24627(long j, C21287 c21287) {
        int iM48493 = c21287.m48493();
        long jM48492 = (((long) c21287.m48492()) * 1000) + j;
        InterfaceC22024 interfaceC22024 = this.f4231;
        if (iM48493 == 0 && !this.f30358) {
            C21287 c21288 = new C21287(new byte[c21287.m48486()]);
            c21287.m48490(0, c21287.m48486(), c21288.m48497());
            C12153 c12153M30362 = C12153.m30362(c21288);
            this.f30359 = c12153M30362.f39068;
            C20124 c20124 = new C20124();
            c20124.m46327("video/x-flv");
            c20124.m46315("video/avc");
            c20124.m46300(c12153M30362.f39067);
            c20124.m46291(c12153M30362.f39071);
            c20124.m46333(c12153M30362.f39069);
            c20124.m46325(c12153M30362.f39075);
            c20124.m46301((List) c12153M30362.f39066);
            interfaceC22024.mo14384(c20124.m46295());
            this.f30358 = true;
            return false;
        }
        if (iM48493 == 1 && this.f30358) {
            int i = this.f30362 == 1 ? 1 : 0;
            if (this.f30363 || i != 0) {
                C21287 c21289 = this.f30361;
                byte[] bArrM48497 = c21289.m48497();
                bArrM48497[0] = 0;
                bArrM48497[1] = 0;
                bArrM48497[2] = 0;
                int i2 = 4 - this.f30359;
                int i3 = 0;
                while (c21287.m48486() > 0) {
                    c21287.m48490(i2, this.f30359, c21289.m48497());
                    c21289.m48510(0);
                    int iM48512 = c21289.m48512();
                    C21287 c212810 = this.f30360;
                    c212810.m48510(0);
                    interfaceC22024.mo14381(4, c212810);
                    interfaceC22024.mo14381(iM48512, c21287);
                    i3 = i3 + 4 + iM48512;
                }
                this.f4231.mo14383(jM48492, i, i3, 0, null);
                this.f30363 = true;
                return true;
            }
        }
        return false;
    }
}
