package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8UK */
/* JADX INFO: loaded from: classes3.dex */
public final class C7107 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f23424;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f23425;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f23427;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f23428;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22419 f23430;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C24437 f23431;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC19502 f23432;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14213 f23433;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21287 f23426 = new C21287(2);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f23429 = -1;

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) throws EOFException, InterruptedIOException {
        C9169 c9169 = (C9169) interfaceC19502;
        if (m19450(c9169) == 65496) {
            int iM19450 = m19450(c9169);
            this.f23427 = iM19450;
            if (iM19450 == 65504) {
                C21287 c21287 = this.f23426;
                c21287.m48496(2);
                c9169.mo10078(false, 0, 2, c21287.m48497());
                c9169.mo10077(c21287.m48494() - 2, false);
                this.f23427 = m19450(c9169);
            }
            if (this.f23427 == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f23425 = interfaceC12789;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0172  */
    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        String strM48484;
        C14213 c14213;
        C5265 c5265M46431;
        long j;
        int i = this.f23428;
        C21287 c21287 = this.f23426;
        if (i == 0) {
            c21287.m48496(2);
            interfaceC19502.readFully(c21287.m48497(), 0, 2);
            int iM48494 = c21287.m48494();
            this.f23427 = iM48494;
            if (iM48494 == 65498) {
                if (this.f23429 != -1) {
                    this.f23428 = 4;
                    return 0;
                }
                m19451();
                return 0;
            }
            if ((iM48494 >= 65488 && iM48494 <= 65497) || iM48494 == 65281) {
                return 0;
            }
            this.f23428 = 1;
            return 0;
        }
        if (i == 1) {
            c21287.m48496(2);
            interfaceC19502.readFully(c21287.m48497(), 0, 2);
            this.f23424 = c21287.m48494() - 2;
            this.f23428 = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f23430 == null || interfaceC19502 != this.f23432) {
                    this.f23432 = interfaceC19502;
                    this.f23430 = new C22419(interfaceC19502, this.f23429);
                }
                C24437 c24437 = this.f23431;
                c24437.getClass();
                int iMo2289 = c24437.mo2289(this.f23430, c18756);
                if (iMo2289 == 1) {
                    c18756.f60914 += this.f23429;
                }
                return iMo2289;
            }
            long position = interfaceC19502.getPosition();
            long j2 = this.f23429;
            if (position != j2) {
                c18756.f60914 = j2;
                return 1;
            }
            if (!interfaceC19502.mo10078(true, 0, 1, c21287.m48497())) {
                m19451();
                return 0;
            }
            interfaceC19502.mo10076();
            if (this.f23431 == null) {
                this.f23431 = new C24437(InterfaceC1272.f4579, 8);
            }
            C22419 c22419 = new C22419(interfaceC19502, this.f23429);
            this.f23430 = c22419;
            if (!this.f23431.mo2294(c22419)) {
                m19451();
                return 0;
            }
            C24437 c24438 = this.f23431;
            long j3 = this.f23429;
            InterfaceC12789 interfaceC12789 = this.f23425;
            interfaceC12789.getClass();
            c24438.mo2293(new C23165(j3, interfaceC12789));
            C14213 c14214 = this.f23433;
            c14214.getClass();
            InterfaceC12789 interfaceC127810 = this.f23425;
            interfaceC127810.getClass();
            InterfaceC22024 interfaceC22024Mo16658 = interfaceC127810.mo16658(1024, 4);
            C20124 c20124 = new C20124();
            c20124.m46327("image/jpeg");
            c20124.m46303(new C19378(c14214));
            interfaceC22024Mo16658.mo14384(c20124.m46295());
            this.f23428 = 5;
            return 0;
        }
        if (this.f23427 == 65505) {
            C21287 c21288 = new C21287(this.f23424);
            interfaceC19502.readFully(c21288.m48497(), 0, this.f23424);
            if (this.f23433 == null && "http://ns.adobe.com/xap/1.0/".equals(c21288.m48484()) && (strM48484 = c21288.m48484()) != null) {
                long length = interfaceC19502.getLength();
                if (length == -1 || (c5265M46431 = C20181.m46431(strM48484)) == null) {
                    c14213 = null;
                } else {
                    List list = c5265M46431.f18561;
                    if (list.size() < 2) {
                        c14213 = null;
                    } else {
                        int size = list.size() - 1;
                        boolean zEquals = false;
                        long j4 = -1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        while (size >= 0) {
                            C13818 c13818 = (C13818) list.get(size);
                            zEquals |= "video/mp4".equals(c13818.f43804);
                            if (size == 0) {
                                length -= c13818.f43803;
                                j = 0;
                            } else {
                                j = length - c13818.f43802;
                            }
                            if (zEquals && j != length) {
                                j7 = length - j;
                                zEquals = false;
                                j6 = j;
                            }
                            if (size == 0) {
                                j5 = length;
                                j4 = j;
                            }
                            size--;
                            length = j;
                        }
                        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
                            c14213 = null;
                        } else {
                            c14213 = new C14213(j4, j5, c5265M46431.f18562, j6, j7);
                        }
                    }
                }
                this.f23433 = c14213;
                if (c14213 != null) {
                    this.f23429 = c14213.f44925;
                }
            }
        } else {
            interfaceC19502.mo10073(this.f23424);
        }
        this.f23428 = 0;
        return 0;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        if (j == 0) {
            this.f23428 = 0;
            this.f23431 = null;
        } else if (this.f23428 == 5) {
            C24437 c24437 = this.f23431;
            c24437.getClass();
            c24437.mo2292(j, j2);
        }
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
        C24437 c24437 = this.f23431;
        if (c24437 != null) {
            c24437.getClass();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m19450(C9169 c9169) {
        C21287 c21287 = this.f23426;
        c21287.m48496(2);
        c9169.mo10078(false, 0, 2, c21287.m48497());
        return c21287.m48494();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m19451() {
        InterfaceC12789 interfaceC12789 = this.f23425;
        interfaceC12789.getClass();
        interfaceC12789.mo16661();
        this.f23425.mo16659(new C0857(-9223372036854775807L));
        this.f23428 = 6;
    }
}
