package l;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8NM */
/* JADX INFO: loaded from: classes5.dex */
public final class C17548 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f57024;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C3509 f57025;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16056 f57026;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f57027;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3378[] f57028;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f57029;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f57030;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f57031;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f57032;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f57033;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21287 f57034;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f57035;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16802 f57036;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3378 f57037;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f57038;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f57039;

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
    }

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

    public C17548(int i, C3509 c3509) {
        this.f57025 = c3509;
        this.f57039 = (i & 1) == 0;
        this.f57034 = new C21287(12);
        this.f57036 = new C16802();
        this.f57031 = new C6790();
        this.f57028 = new C3378[0];
        this.f57029 = -1L;
        this.f57024 = -1L;
        this.f57030 = -1;
        this.f57035 = -9223372036854775807L;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        this.f57038 = 0;
        if (this.f57039) {
            interfaceC12789 = new C8729(interfaceC12789, this.f57025);
        }
        this.f57031 = interfaceC12789;
        this.f57033 = -1L;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        C21287 c21287 = this.f57034;
        interfaceC19502.mo10069(0, 12, c21287.m48497());
        c21287.m48510(0);
        if (c21287.m48483() == 1179011410) {
            c21287.m48503(4);
            if (c21287.m48483() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        this.f57033 = -1L;
        this.f57037 = null;
        for (C3378 c3378 : this.f57028) {
            c3378.m11089(j);
        }
        if (j == 0) {
            if (this.f57028.length == 0) {
                this.f57038 = 0;
                return;
            } else {
                this.f57038 = 3;
                return;
            }
        }
        this.f57038 = 6;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0313  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        boolean z;
        C3378 c3378;
        int i;
        long j;
        C3378 c3379;
        if (this.f57033 != -1) {
            long position = interfaceC19502.getPosition();
            long j2 = this.f57033;
            if (j2 < position || j2 > 262144 + position) {
                c18756.f60914 = j2;
                z = true;
            } else {
                interfaceC19502.mo10073((int) (j2 - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.f57033 = -1L;
        if (z) {
            return 1;
        }
        int i2 = this.f57038;
        C3378 c33710 = null;
        C16802 c16802 = this.f57036;
        C21287 c21287 = this.f57034;
        switch (i2) {
            case 0:
                if (mo2294(interfaceC19502)) {
                    interfaceC19502.mo10073(12);
                    this.f57038 = 1;
                    return 0;
                }
                throw C2970.m9688("AVI Header List not found", (Throwable) null);
            case 1:
                interfaceC19502.readFully(c21287.m48497(), 0, 12);
                c21287.m48510(0);
                c16802.getClass();
                c16802.f54215 = c21287.m48483();
                c16802.f54216 = c21287.m48483();
                c16802.f54217 = 0;
                if (c16802.f54215 != 1414744396) {
                    throw C2970.m9688("LIST expected, found: " + c16802.f54215, (Throwable) null);
                }
                int iM48483 = c21287.m48483();
                c16802.f54217 = iM48483;
                if (iM48483 != 1819436136) {
                    throw C2970.m9688("hdrl expected, found: " + c16802.f54217, (Throwable) null);
                }
                this.f57030 = c16802.f54216;
                this.f57038 = 2;
                return 0;
            case 2:
                int i3 = this.f57030 - 4;
                C21287 c21288 = new C21287(i3);
                interfaceC19502.readFully(c21288.m48497(), 0, i3);
                C20532 c20532M47084 = C20532.m47084(1819436136, c21288);
                if (c20532M47084.getType() != 1819436136) {
                    throw C2970.m9688("Unexpected header list type " + c20532M47084.getType(), (Throwable) null);
                }
                C16056 c16056 = (C16056) c20532M47084.m47085(C16056.class);
                if (c16056 == null) {
                    throw C2970.m9688("AviHeader not found", (Throwable) null);
                }
                this.f57026 = c16056;
                this.f57035 = ((long) c16056.f52058) * ((long) c16056.f52059);
                ArrayList arrayList = new ArrayList();
                AbstractC14956 abstractC14956ListIterator = c20532M47084.f65750.listIterator(0);
                int i4 = 0;
                while (abstractC14956ListIterator.hasNext()) {
                    InterfaceC11581 interfaceC11581 = (InterfaceC11581) abstractC14956ListIterator.next();
                    if (interfaceC11581.getType() == 1819440243) {
                        C20532 c20532 = (C20532) interfaceC11581;
                        int i5 = i4 + 1;
                        C23516 c23516 = (C23516) c20532.m47085(C23516.class);
                        C12327 c12327 = (C12327) c20532.m47085(C12327.class);
                        if (c23516 == null) {
                            C1896.m6517("Missing Stream Header");
                        } else if (c12327 != null) {
                            long j3 = c23516.f75997;
                            long j4 = ((long) c23516.f76002) * 1000000;
                            long j5 = c23516.f76001;
                            String str = C7116.f23455;
                            long jM19477 = C7116.m19477(j3, j4, j5, RoundingMode.DOWN);
                            C15648 c15648 = c12327.f39605;
                            C20124 c20124M37397 = c15648.m37397();
                            c20124M37397.m46317(i4);
                            int i6 = c23516.f75999;
                            if (i6 != 0) {
                                c20124M37397.m46318(i6);
                            }
                            C6362 c6362 = (C6362) c20532.m47085(C6362.class);
                            if (c6362 != null) {
                                c20124M37397.m46330(c6362.f21491);
                            }
                            int iM25260 = C9681.m25260(c15648.f50848);
                            if (iM25260 == 1 || iM25260 == 2) {
                                InterfaceC22024 interfaceC22024Mo16658 = this.f57031.mo16658(i4, iM25260);
                                interfaceC22024Mo16658.mo14384(c20124M37397.m46295());
                                interfaceC22024Mo16658.mo14382(jM19477);
                                this.f57035 = Math.max(this.f57035, jM19477);
                                c3378 = new C3378(i4, c23516, interfaceC22024Mo16658);
                            }
                            if (c3378 != null) {
                                arrayList.add(c3378);
                            }
                            i4 = i5;
                        } else {
                            C1896.m6517("Missing Stream Format");
                        }
                        c3378 = null;
                        if (c3378 != null) {
                            arrayList.add(c3378);
                        }
                        i4 = i5;
                    }
                }
                this.f57028 = (C3378[]) arrayList.toArray(new C3378[0]);
                this.f57031.mo16661();
                this.f57038 = 3;
                return 0;
            case 3:
                if (this.f57029 != -1) {
                    long position2 = interfaceC19502.getPosition();
                    i = 16;
                    long j6 = this.f57029;
                    if (position2 != j6) {
                        this.f57033 = j6;
                        return 0;
                    }
                } else {
                    i = 16;
                }
                interfaceC19502.mo10069(0, 12, c21287.m48497());
                interfaceC19502.mo10076();
                c21287.m48510(0);
                c16802.getClass();
                c16802.f54215 = c21287.m48483();
                c16802.f54216 = c21287.m48483();
                c16802.f54217 = 0;
                int iM48484 = c21287.m48483();
                int i7 = c16802.f54215;
                if (i7 == 1179011410) {
                    interfaceC19502.mo10073(12);
                    return 0;
                }
                if (i7 != 1414744396 || iM48484 != 1769369453) {
                    this.f57033 = interfaceC19502.getPosition() + ((long) c16802.f54216) + 8;
                    return 0;
                }
                long position3 = interfaceC19502.getPosition();
                this.f57029 = position3;
                this.f57024 = position3 + ((long) c16802.f54216) + 8;
                if (!this.f57032) {
                    C16056 c16057 = this.f57026;
                    c16057.getClass();
                    if ((c16057.f52057 & i) == i) {
                        this.f57038 = 4;
                        this.f57033 = this.f57024;
                        return 0;
                    }
                    this.f57031.mo16659(new C0857(this.f57035));
                    this.f57032 = true;
                }
                this.f57033 = interfaceC19502.getPosition() + 12;
                this.f57038 = 6;
                return 0;
            case 4:
                interfaceC19502.readFully(c21287.m48497(), 0, 8);
                c21287.m48510(0);
                int iM48485 = c21287.m48483();
                int iM48486 = c21287.m48483();
                if (iM48485 == 829973609) {
                    this.f57038 = 5;
                    this.f57027 = iM48486;
                    return 0;
                }
                this.f57033 = interfaceC19502.getPosition() + ((long) iM48486);
                return 0;
            case 5:
                C21287 c21289 = new C21287(this.f57027);
                interfaceC19502.readFully(c21289.m48497(), 0, this.f57027);
                if (c21289.m48486() < 16) {
                    j = 0;
                } else {
                    int iM48516 = c21289.m48516();
                    c21289.m48503(8);
                    long jM48483 = c21289.m48483();
                    long j7 = this.f57029;
                    j = jM48483 > j7 ? 0L : j7 + 8;
                    c21289.m48510(iM48516);
                }
                while (c21289.m48486() >= 16) {
                    int iM48487 = c21289.m48483();
                    int iM48488 = c21289.m48483();
                    long jM48484 = ((long) c21289.m48483()) + j;
                    c21289.m48503(4);
                    C3378[] c3378Arr = this.f57028;
                    int length = c3378Arr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            c3379 = c3378Arr[i8];
                            if (!c3379.m11086(iM48487)) {
                                i8++;
                            }
                        } else {
                            c3379 = null;
                        }
                    }
                    if (c3379 != null) {
                        c3379.m11085(jM48484, (iM48488 & 16) == 16);
                    }
                }
                for (C3378 c33711 : this.f57028) {
                    c33711.m11084();
                }
                this.f57032 = true;
                if (this.f57028.length == 0) {
                    this.f57031.mo16659(new C0857(this.f57035));
                } else {
                    this.f57031.mo16659(new C25008(this, this.f57035));
                }
                this.f57038 = 6;
                this.f57033 = this.f57029;
                return 0;
            case 6:
                if (interfaceC19502.getPosition() >= this.f57024) {
                    return -1;
                }
                C3378 c33712 = this.f57037;
                if (c33712 != null) {
                    if (c33712.m11087(interfaceC19502)) {
                        this.f57037 = null;
                    }
                    return 0;
                }
                if ((interfaceC19502.getPosition() & 1) == 1) {
                    interfaceC19502.mo10073(1);
                }
                interfaceC19502.mo10069(0, 12, c21287.m48497());
                c21287.m48510(0);
                int iM48489 = c21287.m48483();
                if (iM48489 == 1414744396) {
                    c21287.m48510(8);
                    interfaceC19502.mo10073(c21287.m48483() == 1769369453 ? 12 : 8);
                    interfaceC19502.mo10076();
                    return 0;
                }
                int iM484810 = c21287.m48483();
                if (iM48489 == 1263424842) {
                    this.f57033 = interfaceC19502.getPosition() + ((long) iM484810) + 8;
                    return 0;
                }
                interfaceC19502.mo10073(8);
                interfaceC19502.mo10076();
                for (C3378 c33713 : this.f57028) {
                    if (c33713.m11086(iM48489)) {
                        c33710 = c33713;
                        if (c33710 == null) {
                            this.f57033 = interfaceC19502.getPosition() + ((long) iM484810);
                            return 0;
                        }
                        c33710.m11088(iM484810);
                        this.f57037 = c33710;
                        return 0;
                    }
                }
                if (c33710 == null) {
                    this.f57033 = interfaceC19502.getPosition() + ((long) iM484810);
                    return 0;
                }
                c33710.m11088(iM484810);
                this.f57037 = c33710;
                return 0;
            default:
                throw new AssertionError();
        }
    }
}
