package l;

import java.util.Collections;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.᩻᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C8LE */
/* JADX INFO: loaded from: classes.dex */
public final class C25271 implements InterfaceC6867 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f81610;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f81611;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f81612;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f81613;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f81614;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f81615;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f81616;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f81617;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f81618;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f81619;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f81620;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f81621;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C14573 f81622;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f81623;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f81624;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C15648 f81625;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f81626;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f81627;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f81628;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21287 f81629;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f81630;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f81631;

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1353(boolean z) {
    }

    public C25271(String str, int i) {
        this.f81614 = str;
        this.f81624 = i;
        C21287 c21287 = new C21287(1024);
        this.f81629 = c21287;
        byte[] bArrM48497 = c21287.m48497();
        this.f81622 = new C14573(bArrM48497, bArrM48497.length);
        this.f81620 = -9223372036854775807L;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1349() {
        this.f81630 = 0;
        this.f81620 = -9223372036854775807L;
        this.f81612 = false;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1351(InterfaceC12789 interfaceC12789, C10857 c10857) {
        c10857.m27594();
        this.f81623 = interfaceC12789.mo16658(c10857.m27595(), 1);
        this.f81621 = c10857.m27596();
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1350(int i, long j) {
        this.f81620 = j;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1352(C21287 c21287) throws C2970 {
        int iM35163;
        boolean zM35162;
        C20782.m47566(this.f81623);
        while (c21287.m48486() > 0) {
            int i = this.f81630;
            if (i != 0) {
                if (i != 1) {
                    C21287 c21288 = this.f81629;
                    C14573 c14573 = this.f81622;
                    if (i == 2) {
                        int iM48493 = ((this.f81615 & (-225)) << 8) | c21287.m48493();
                        this.f81618 = iM48493;
                        if (iM48493 > c21288.m48497().length) {
                            c21288.m48496(this.f81618);
                            byte[] bArrM48497 = c21288.m48497();
                            c14573.getClass();
                            c14573.m35158(bArrM48497.length, bArrM48497);
                        }
                        this.f81627 = 0;
                        this.f81630 = 3;
                    } else if (i == 3) {
                        int iMin = Math.min(c21287.m48486(), this.f81618 - this.f81627);
                        c21287.m48490(this.f81627, iMin, c14573.f45926);
                        int i2 = this.f81627 + iMin;
                        this.f81627 = i2;
                        if (i2 == this.f81618) {
                            c14573.m35167(0);
                            if (!c14573.m35162()) {
                                this.f81612 = true;
                                int iM35164 = c14573.m35163(1);
                                int iM35165 = iM35164 == 1 ? c14573.m35163(1) : 0;
                                this.f81613 = iM35165;
                                if (iM35165 == 0) {
                                    if (iM35164 == 1) {
                                        c14573.m35163((c14573.m35163(2) + 1) * 8);
                                    }
                                    if (!c14573.m35162()) {
                                        throw C2970.m9688((String) null, (Throwable) null);
                                    }
                                    this.f81610 = c14573.m35163(6);
                                    int iM35166 = c14573.m35163(4);
                                    int iM35167 = c14573.m35163(3);
                                    if (iM35166 != 0 || iM35167 != 0) {
                                        throw C2970.m9688((String) null, (Throwable) null);
                                    }
                                    if (iM35164 == 0) {
                                        int iM35168 = c14573.m35166();
                                        int iM35152 = c14573.m35152();
                                        C24834 c24834M39348 = C16628.m39348(c14573, true);
                                        this.f81628 = c24834M39348.f80327;
                                        this.f81626 = c24834M39348.f80326;
                                        this.f81616 = c24834M39348.f80325;
                                        int iM35153 = iM35152 - c14573.m35152();
                                        c14573.m35167(iM35168);
                                        byte[] bArr = new byte[(iM35153 + 7) / 8];
                                        c14573.m35154(iM35153, bArr);
                                        C20124 c20124 = new C20124();
                                        c20124.m46309(this.f81621);
                                        c20124.m46327("video/mp2t");
                                        c20124.m46315("audio/mp4a-latm");
                                        c20124.m46300(this.f81628);
                                        c20124.m46329(this.f81616);
                                        c20124.m46332(this.f81626);
                                        c20124.m46301(Collections.singletonList(bArr));
                                        c20124.m46321(this.f81614);
                                        c20124.m46311(this.f81624);
                                        C15648 c15648M46295 = c20124.m46295();
                                        if (!c15648M46295.equals(this.f81625)) {
                                            this.f81625 = c15648M46295;
                                            this.f81611 = 1024000000 / ((long) c15648M46295.f50829);
                                            this.f81623.mo14384(c15648M46295);
                                        }
                                    } else {
                                        int iM35169 = c14573.m35163((c14573.m35163(2) + 1) * 8);
                                        int iM35154 = c14573.m35152();
                                        C24834 c24834M39349 = C16628.m39348(c14573, true);
                                        this.f81628 = c24834M39349.f80327;
                                        this.f81626 = c24834M39349.f80326;
                                        this.f81616 = c24834M39349.f80325;
                                        c14573.m35161(iM35169 - (iM35154 - c14573.m35152()));
                                    }
                                    int iM351610 = c14573.m35163(3);
                                    this.f81619 = iM351610;
                                    if (iM351610 == 0) {
                                        c14573.m35161(8);
                                    } else if (iM351610 == 1) {
                                        c14573.m35161(9);
                                    } else if (iM351610 == 3 || iM351610 == 4 || iM351610 == 5) {
                                        c14573.m35161(6);
                                    } else if (iM351610 == 6 || iM351610 == 7) {
                                        c14573.m35161(1);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                    boolean zM35163 = c14573.m35162();
                                    this.f81631 = zM35163;
                                    this.f81617 = 0L;
                                    if (zM35163) {
                                        if (iM35164 == 1) {
                                            this.f81617 = c14573.m35163((c14573.m35163(2) + 1) * 8);
                                        } else {
                                            do {
                                                zM35162 = c14573.m35162();
                                                this.f81617 = (this.f81617 << 8) + ((long) c14573.m35163(8));
                                            } while (zM35162);
                                        }
                                    }
                                    if (c14573.m35162()) {
                                        c14573.m35161(8);
                                    }
                                } else {
                                    throw C2970.m9688((String) null, (Throwable) null);
                                }
                            } else {
                                if (this.f81612) {
                                }
                                this.f81630 = 0;
                            }
                            if (this.f81613 == 0) {
                                if (this.f81610 != 0) {
                                    throw C2970.m9688((String) null, (Throwable) null);
                                }
                                if (this.f81619 != 0) {
                                    throw C2970.m9688((String) null, (Throwable) null);
                                }
                                int i3 = 0;
                                do {
                                    iM35163 = c14573.m35163(8);
                                    i3 += iM35163;
                                } while (iM35163 == 255);
                                int iM351611 = c14573.m35166();
                                if ((iM351611 & 7) == 0) {
                                    c21288.m48510(iM351611 >> 3);
                                } else {
                                    c14573.m35154(i3 * 8, c21288.m48497());
                                    c21288.m48510(0);
                                }
                                this.f81623.mo14381(i3, c21288);
                                C20782.m47568(this.f81620 != -9223372036854775807L);
                                this.f81623.mo14383(this.f81620, 1, i3, 0, null);
                                this.f81620 += this.f81611;
                                if (this.f81631) {
                                    c14573.m35161((int) this.f81617);
                                }
                                this.f81630 = 0;
                            } else {
                                throw C2970.m9688((String) null, (Throwable) null);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int iM48494 = c21287.m48493();
                    if ((iM48494 & BERTags.FLAGS) == 224) {
                        this.f81615 = iM48494;
                        this.f81630 = 2;
                    } else if (iM48494 != 86) {
                        this.f81630 = 0;
                    }
                }
            } else if (c21287.m48493() == 86) {
                this.f81630 = 1;
            }
        }
    }
}
