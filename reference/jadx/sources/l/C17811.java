package l;

import java.util.List;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ܽ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D8M7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17811 implements InterfaceC6867 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f58435;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f58436;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f58441;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f58443;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f58445;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f58446;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f58447;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f58449;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f58450;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f58448 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21287 f58440 = new C21287(new byte[15], 2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14573 f58433 = new C14573();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21287 f58439 = new C21287();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C16319 f58442 = new C16319();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f58451 = SecP160R1Field.PInv;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f58434 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f58453 = -1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f58444 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f58437 = true;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public double f58438 = -9.223372036854776E18d;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public double f58452 = -9.223372036854776E18d;

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1353(boolean z) {
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1349() {
        this.f58448 = 0;
        this.f58441 = 0;
        this.f58440.m48496(2);
        this.f58446 = 0;
        this.f58443 = 0;
        this.f58451 = SecP160R1Field.PInv;
        this.f58434 = -1;
        this.f58435 = 0;
        this.f58453 = -1L;
        this.f58436 = false;
        this.f58449 = false;
        this.f58437 = true;
        this.f58444 = true;
        this.f58438 = -9.223372036854776E18d;
        this.f58452 = -9.223372036854776E18d;
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1351(InterfaceC12789 interfaceC12789, C10857 c10857) {
        c10857.m27594();
        this.f58447 = c10857.m27596();
        this.f58445 = interfaceC12789.mo16658(c10857.m27595(), 1);
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1350(int i, long j) {
        this.f58450 = i;
        if (!this.f58444 && (this.f58443 != 0 || !this.f58437)) {
            this.f58449 = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f58449) {
                this.f58452 = j;
            } else {
                this.f58438 = j;
            }
        }
    }

    @Override // l.InterfaceC6867
    /* JADX INFO: renamed from: ۙ */
    public final void mo1352(C21287 c21287) throws C2970 {
        int i;
        C20782.m47566(this.f58445);
        while (c21287.m48486() > 0) {
            int i2 = this.f58448;
            int iM35163 = 0;
            if (i2 == 0) {
                int i3 = this.f58450;
                if ((i3 & 2) != 0) {
                    if ((i3 & 4) == 0) {
                        while (c21287.m48486() > 0) {
                            int i4 = this.f58441 << 8;
                            this.f58441 = i4;
                            int iM48493 = i4 | c21287.m48493();
                            this.f58441 = iM48493;
                            if ((iM48493 & 16777215) == 12583333) {
                                c21287.m48510(c21287.m48516() - 3);
                                this.f58441 = 0;
                            }
                        }
                    }
                    this.f58448 = 1;
                    break;
                }
                c21287.m48510(c21287.m48509());
            } else {
                C21287 c21288 = this.f58439;
                C16319 c16319 = this.f58442;
                if (i2 == 1) {
                    C21287 c21289 = this.f58440;
                    m41656(c21287, c21289, false);
                    if (c21289.m48486() != 0) {
                        this.f58437 = false;
                    } else {
                        int iM48509 = c21289.m48509();
                        byte[] bArrM48497 = c21289.m48497();
                        C14573 c14573 = this.f58433;
                        c14573.m35158(iM48509, bArrM48497);
                        boolean zM11794 = C3641.m11794(c14573, c16319);
                        if (zM11794) {
                            this.f58446 = 0;
                            this.f58443 = c16319.f52973 + iM48509 + this.f58443;
                        }
                        if (zM11794) {
                            c21289.m48510(0);
                            this.f58445.mo14381(c21289.m48509(), c21289);
                            c21289.m48496(2);
                            c21288.m48496(c16319.f52973);
                            this.f58437 = true;
                            this.f58448 = 2;
                        } else if (c21289.m48509() < 15) {
                            c21289.m48517(c21289.m48509() + 1);
                            this.f58437 = false;
                        }
                    }
                } else if (i2 == 2) {
                    int i5 = c16319.f52972;
                    if (i5 == 1 || i5 == 17) {
                        m41656(c21287, c21288, true);
                    }
                    int iMin = Math.min(c21287.m48486(), c16319.f52973 - this.f58446);
                    this.f58445.mo14381(iMin, c21287);
                    int i6 = this.f58446 + iMin;
                    this.f58446 = i6;
                    if (i6 == c16319.f52973) {
                        int i7 = c16319.f52972;
                        if (i7 == 1) {
                            byte[] bArrM48498 = c21288.m48497();
                            C23779 c23779M11793 = C3641.m11793(new C14573(bArrM48498, bArrM48498.length));
                            this.f58451 = c23779M11793.f77034;
                            this.f58434 = c23779M11793.f77036;
                            long j = this.f58453;
                            long j2 = c16319.f52971;
                            if (j != j2) {
                                this.f58453 = j2;
                                int i8 = c23779M11793.f77035;
                                String strConcat = i8 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i8))) : "mhm1";
                                byte[] bArr = c23779M11793.f77033;
                                AbstractC1928 abstractC1928Of = (bArr == null || bArr.length <= 0) ? null : AbstractC1928.of((Object) C7116.f23453, (Object) bArr);
                                C20124 c20124 = new C20124();
                                c20124.m46309(this.f58447);
                                c20124.m46327("video/mp2t");
                                c20124.m46315("audio/mhm1");
                                c20124.m46332(this.f58451);
                                c20124.m46300(strConcat);
                                c20124.m46301((List) abstractC1928Of);
                                this.f58445.mo14384(c20124.m46295());
                            }
                            this.f58436 = true;
                        } else if (i7 == 17) {
                            byte[] bArrM48499 = c21288.m48497();
                            C14573 c14574 = new C14573(bArrM48499, bArrM48499.length);
                            if (c14574.m35162()) {
                                c14574.m35161(2);
                                iM35163 = c14574.m35163(13);
                            }
                            this.f58435 = iM35163;
                        } else if (i7 == 2) {
                            if (this.f58436) {
                                this.f58444 = false;
                                i = 1;
                            } else {
                                i = 0;
                            }
                            double d = (((double) (this.f58434 - this.f58435)) * 1000000.0d) / ((double) this.f58451);
                            long jRound = Math.round(this.f58438);
                            if (this.f58449) {
                                this.f58449 = false;
                                this.f58438 = this.f58452;
                            } else {
                                this.f58438 += d;
                            }
                            this.f58445.mo14383(jRound, i, this.f58443, 0, null);
                            this.f58436 = false;
                            this.f58435 = 0;
                            this.f58443 = 0;
                        }
                        this.f58448 = 1;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41656(C21287 c21287, C21287 c21288, boolean z) {
        int iM48516 = c21287.m48516();
        int iMin = Math.min(c21287.m48486(), c21288.m48486());
        c21287.m48490(c21288.m48516(), iMin, c21288.m48497());
        c21288.m48503(iMin);
        if (z) {
            c21287.m48510(iM48516);
        }
    }
}
