package l;

import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.ۖۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X8NN */
/* JADX INFO: loaded from: classes3.dex */
public final class C2392 implements InterfaceC6867 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f7687;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f7689;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f7690;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f7692;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21287 f7693;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f7694;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f7695;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f7696;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f7698;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15648 f7701;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f7703;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7697 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f7702 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f7688 = new AtomicInteger();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f7691 = -1;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f7699 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f7700 = "video/mp2t";

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1353(boolean z) {
    }

    public C2392(String str, int i, int i2) {
        this.f7693 = new C21287(new byte[i2]);
        this.f7690 = str;
        this.f7692 = i;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1349() {
        this.f7697 = 0;
        this.f7689 = 0;
        this.f7695 = 0;
        this.f7702 = -9223372036854775807L;
        this.f7688.set(0);
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1351(InterfaceC12789 interfaceC12789, C10857 c10857) {
        c10857.m27594();
        this.f7698 = c10857.m27596();
        this.f7687 = interfaceC12789.mo16658(c10857.m27595(), 1);
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1350(int i, long j) {
        this.f7702 = j;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cf  */
    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1352(C21287 c21287) throws C2970 {
        int i;
        char c;
        byte b;
        int i2;
        char c2;
        char c3;
        boolean z;
        int i3;
        int i4;
        byte b2;
        int i5;
        byte b3;
        int i6;
        byte b4;
        C20782.m47566(this.f7687);
        while (c21287.m48486() > 0) {
            int i7 = this.f7697;
            C21287 c21288 = this.f7693;
            switch (i7) {
                case 0:
                    while (c21287.m48486() > 0) {
                        int i8 = this.f7695 << 8;
                        this.f7695 = i8;
                        int iM48493 = i8 | c21287.m48493();
                        this.f7695 = iM48493;
                        if (iM48493 == 2147385345 || iM48493 == -25230976 || iM48493 == 536864768 || iM48493 == -14745368) {
                            i = 1;
                        } else if (iM48493 == 1683496997 || iM48493 == 622876772) {
                            i = 2;
                        } else if (iM48493 == 1078008818 || iM48493 == -233094848) {
                            i = 3;
                        } else {
                            i = (iM48493 == 1908687592 || iM48493 == -398277519) ? 4 : 0;
                        }
                        this.f7694 = i;
                        if (i != 0) {
                            byte[] bArrM48497 = c21288.m48497();
                            int i9 = this.f7695;
                            bArrM48497[0] = (byte) ((i9 >> 24) & 255);
                            bArrM48497[1] = (byte) ((i9 >> 16) & 255);
                            bArrM48497[2] = (byte) ((i9 >> 8) & 255);
                            bArrM48497[3] = (byte) (i9 & 255);
                            this.f7689 = 4;
                            this.f7695 = 0;
                            int i10 = this.f7694;
                            if (i10 != 3 && i10 != 4) {
                                if (i10 == 1) {
                                    this.f7697 = 1;
                                } else {
                                    this.f7697 = 2;
                                }
                            }
                            this.f7697 = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (m8135(c21287, c21288.m48497(), 18)) {
                        byte[] bArrM48498 = c21288.m48497();
                        if (this.f7701 == null) {
                            c = 7;
                            C15648 c15648M26999 = C10551.m26999(this.f7692, this.f7698, this.f7690, this.f7700, bArrM48498);
                            this.f7701 = c15648M26999;
                            this.f7687.mo14384(c15648M26999);
                        } else {
                            c = 7;
                        }
                        byte b5 = bArrM48498[0];
                        if (b5 != -2) {
                            if (b5 == -1) {
                                i6 = ((3 & bArrM48498[c]) << 12) | ((bArrM48498[6] & 255) << 4);
                                b4 = bArrM48498[9];
                            } else if (b5 == 31) {
                                i6 = ((bArrM48498[c] & 255) << 4) | ((bArrM48498[6] & 3) << 12);
                                b4 = bArrM48498[8];
                            } else {
                                c2 = 5;
                                i2 = ((bArrM48498[5] & 3) << 12) | ((bArrM48498[6] & 255) << 4);
                                b = bArrM48498[c];
                            }
                            c3 = 5;
                            i3 = (i6 | ((b4 & 60) >> 2)) + 1;
                            z = true;
                            if (z) {
                                i3 = (i3 * 16) / 14;
                            }
                            this.f7696 = i3;
                            if (b5 != -2) {
                                if (b5 != -1) {
                                    i4 = (bArrM48498[4] & 7) << 4;
                                    b3 = bArrM48498[c];
                                } else if (b5 != 31) {
                                    i4 = (bArrM48498[c3] & 7) << 4;
                                    b3 = bArrM48498[6];
                                } else {
                                    i4 = (bArrM48498[4] & 1) << 6;
                                    b2 = bArrM48498[c3];
                                }
                                i5 = b3 & 60;
                                this.f7703 = C18444.m42970(C7116.m19473(this.f7701.f50829, (((i5 >> 2) | i4) + 1) * 32));
                                c21288.m48510(0);
                                this.f7687.mo14381(18, c21288);
                                this.f7697 = 6;
                            } else {
                                i4 = (bArrM48498[c3] & 1) << 6;
                                b2 = bArrM48498[4];
                            }
                            i5 = b2 & Poly1305KeyGenerator.R_MASK_LOW_2;
                            this.f7703 = C18444.m42970(C7116.m19473(this.f7701.f50829, (((i5 >> 2) | i4) + 1) * 32));
                            c21288.m48510(0);
                            this.f7687.mo14381(18, c21288);
                            this.f7697 = 6;
                        } else {
                            int i11 = ((3 & bArrM48498[4]) << 12) | ((bArrM48498[c] & 255) << 4);
                            b = bArrM48498[6];
                            i2 = i11;
                            c2 = 5;
                        }
                        i3 = (i2 | ((b & 240) >> 4)) + 1;
                        c3 = c2;
                        z = false;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.f7696 = i3;
                        if (b5 != -2) {
                            if (b5 != -1) {
                                i4 = (bArrM48498[4] & 7) << 4;
                                b3 = bArrM48498[c];
                            } else if (b5 != 31) {
                                i4 = (bArrM48498[c3] & 7) << 4;
                                b3 = bArrM48498[6];
                            } else {
                                i4 = (bArrM48498[4] & 1) << 6;
                                b2 = bArrM48498[c3];
                            }
                            i5 = b3 & 60;
                            this.f7703 = C18444.m42970(C7116.m19473(this.f7701.f50829, (((i5 >> 2) | i4) + 1) * 32));
                            c21288.m48510(0);
                            this.f7687.mo14381(18, c21288);
                            this.f7697 = 6;
                        } else {
                            i4 = (bArrM48498[c3] & 1) << 6;
                            b2 = bArrM48498[4];
                        }
                        i5 = b2 & Poly1305KeyGenerator.R_MASK_LOW_2;
                        this.f7703 = C18444.m42970(C7116.m19473(this.f7701.f50829, (((i5 >> 2) | i4) + 1) * 32));
                        c21288.m48510(0);
                        this.f7687.mo14381(18, c21288);
                        this.f7697 = 6;
                        break;
                    }
                    break;
                case 2:
                    if (m8135(c21287, c21288.m48497(), 7)) {
                        this.f7691 = C10551.m27001(c21288.m48497());
                        this.f7697 = 3;
                    }
                    break;
                case 3:
                    if (m8135(c21287, c21288.m48497(), this.f7691)) {
                        C21740 c21740M27002 = C10551.m27002(c21288.m48497());
                        m8134(c21740M27002);
                        this.f7696 = c21740M27002.f69346;
                        long j = c21740M27002.f69348;
                        if (j == -9223372036854775807L) {
                            j = 0;
                        }
                        this.f7703 = j;
                        c21288.m48510(0);
                        this.f7687.mo14381(this.f7691, c21288);
                        this.f7697 = 6;
                    }
                    break;
                case 4:
                    if (m8135(c21287, c21288.m48497(), 6)) {
                        int iM27003 = C10551.m27003(c21288.m48497());
                        this.f7699 = iM27003;
                        int i12 = this.f7689;
                        if (i12 > iM27003) {
                            int i13 = i12 - iM27003;
                            this.f7689 = i12 - i13;
                            c21287.m48510(c21287.m48516() - i13);
                        }
                        this.f7697 = 5;
                    }
                    break;
                case 5:
                    if (m8135(c21287, c21288.m48497(), this.f7699)) {
                        C21740 c21740M27000 = C10551.m27000(c21288.m48497(), this.f7688);
                        if (this.f7694 == 3) {
                            m8134(c21740M27000);
                        }
                        this.f7696 = c21740M27000.f69346;
                        long j2 = c21740M27000.f69348;
                        if (j2 == -9223372036854775807L) {
                            j2 = 0;
                        }
                        this.f7703 = j2;
                        c21288.m48510(0);
                        this.f7687.mo14381(this.f7699, c21288);
                        this.f7697 = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(c21287.m48486(), this.f7696 - this.f7689);
                    this.f7687.mo14381(iMin, c21287);
                    int i14 = this.f7689 + iMin;
                    this.f7689 = i14;
                    if (i14 == this.f7696) {
                        C20782.m47568(this.f7702 != -9223372036854775807L);
                        this.f7687.mo14383(this.f7702, this.f7694 == 4 ? 0 : 1, this.f7696, 0, null);
                        this.f7702 += this.f7703;
                        this.f7697 = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8135(C21287 c21287, byte[] bArr, int i) {
        int iMin = Math.min(c21287.m48486(), i - this.f7689);
        c21287.m48490(this.f7689, iMin, bArr);
        int i2 = this.f7689 + iMin;
        this.f7689 = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8134(C21740 c21740) {
        int i = c21740.f69347;
        String str = c21740.f69349;
        int i2 = c21740.f69345;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        C15648 c15648 = this.f7701;
        if (c15648 != null && i2 == c15648.f50843 && i == c15648.f50829 && str.equals(c15648.f50848)) {
            return;
        }
        C15648 c15649 = this.f7701;
        C20124 c20124 = c15649 == null ? new C20124() : c15649.m37397();
        c20124.m46309(this.f7698);
        c20124.m46327(this.f7700);
        c20124.m46315(str);
        c20124.m46329(i2);
        c20124.m46332(i);
        c20124.m46321(this.f7690);
        c20124.m46311(this.f7692);
        C15648 c15648M46295 = c20124.m46295();
        this.f7701 = c15648M46295;
        this.f7687.mo14384(c15648M46295);
    }
}
