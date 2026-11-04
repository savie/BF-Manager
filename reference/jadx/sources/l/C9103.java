package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8S4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9103 implements InterfaceC22046 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f29573;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f29574;

    public C9103(int i) {
        this(i, AbstractC1928.of());
    }

    public C9103(int i, List list) {
        this.f29574 = i;
        this.f29573 = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22792 m24254(int i, C4892 c4892) {
        String str = c4892.f17100;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C6625(new C17065(str, c4892.m15017(), "video/mp2t"));
            }
            if (i == 21) {
                return new C6625(new C11844());
            }
            if (i == 27) {
                if (m24253(4)) {
                    return null;
                }
                return new C6625(new C13336(new C19303(m24252(c4892)), m24253(1), m24253(8)));
            }
            if (i == 36) {
                return new C6625(new C2150(new C19303(m24252(c4892))));
            }
            if (i == 45) {
                return new C6625(new C17811());
            }
            if (i == 89) {
                return new C6625(new C8358(c4892.f17098));
            }
            if (i == 172) {
                return new C6625(new C18800(str, c4892.m15017(), "video/mp2t"));
            }
            if (i != 257) {
                if (i != 138) {
                    if (i != 139) {
                        switch (i) {
                            case 15:
                                if (m24253(2)) {
                                    return null;
                                }
                                return new C6625(new C0901(str, c4892.m15017(), "video/mp2t", false));
                            case 16:
                                return new C6625(new C23033(new C15332(m24252(c4892))));
                            case 17:
                                if (m24253(2)) {
                                    return null;
                                }
                                return new C6625(new C25271(str, c4892.m15017()));
                            default:
                                switch (i) {
                                    case 128:
                                        break;
                                    case 129:
                                        return new C6625(new C0155(str, c4892.m15017(), "video/mp2t"));
                                    case 130:
                                        if (!m24253(64)) {
                                            return null;
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 134:
                                                if (m24253(16)) {
                                                    return null;
                                                }
                                                return new C8116(new C12590("application/x-scte35"));
                                            case 135:
                                                return new C6625(new C0155(str, c4892.m15017(), "video/mp2t"));
                                            case 136:
                                                break;
                                            default:
                                                return null;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        return new C6625(new C2392(str, c4892.m15017(), 5408));
                    }
                }
                return new C6625(new C2392(str, c4892.m15017(), 4096));
            }
            return new C8116(new C12590("application/vnd.dvb.ait"));
        }
        return new C6625(new C5133(new C15332(m24252(c4892)), "video/mp2t"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private List m24252(C4892 c4892) {
        String str;
        int i;
        List listSingletonList;
        boolean zM24253 = m24253(32);
        List list = this.f29573;
        if (zM24253) {
            return list;
        }
        C21287 c21287 = new C21287(c4892.f17099);
        while (c21287.m48486() > 0) {
            int iM48493 = c21287.m48493();
            int iM48516 = c21287.m48516() + c21287.m48493();
            if (iM48493 == 134) {
                ArrayList arrayList = new ArrayList();
                int iM48494 = c21287.m48493() & 31;
                for (int i2 = 0; i2 < iM48494; i2++) {
                    String strM48488 = c21287.m48488(3, StandardCharsets.UTF_8);
                    int iM48495 = c21287.m48493();
                    boolean z = (iM48495 & 128) != 0;
                    if (z) {
                        i = iM48495 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM48493 = (byte) c21287.m48493();
                    c21287.m48503(1);
                    if (z) {
                        boolean z2 = (bM48493 & 64) != 0;
                        int i3 = C21528.f68786;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C20124 c20124 = new C20124();
                    c20124.m46315(str);
                    c20124.m46321(strM48488);
                    c20124.m46297(i);
                    c20124.m46301(listSingletonList);
                    arrayList.add(c20124.m46295());
                }
                list = arrayList;
            }
            c21287.m48510(iM48516);
        }
        return list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m24253(int i) {
        return (i & this.f29574) != 0;
    }
}
