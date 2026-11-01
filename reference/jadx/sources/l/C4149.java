package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8S4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4149 implements InterfaceC18657 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f15172;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f15173;

    public C4149(int i) {
        this(i, AbstractC22433.of());
    }

    public C4149(int i, List list) {
        this.f15173 = i;
        this.f15172 = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19363 m11795(int i, C17951 c17951) {
        String str = c17951.f57410;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C2032(new C16850(str, c17951.m41776(), "video/mp2t"));
            }
            if (i == 21) {
                return new C2032(new C20378());
            }
            if (i == 27) {
                if (m11794(4)) {
                    return null;
                }
                return new C2032(new C7678(new C22185(m11793(c17951)), m11794(1), m11794(8)));
            }
            if (i == 36) {
                return new C2032(new C16145(new C22185(m11793(c17951))));
            }
            if (i == 45) {
                return new C2032(new C12617());
            }
            if (i == 89) {
                return new C2032(new C23201(c17951.f57412));
            }
            if (i == 172) {
                return new C2032(new C22495(str, c17951.m41776(), "video/mp2t"));
            }
            if (i != 257) {
                if (i != 138) {
                    if (i != 139) {
                        switch (i) {
                            case 15:
                                if (m11794(2)) {
                                    return null;
                                }
                                return new C2032(new C13323(str, c17951.m41776(), "video/mp2t", false));
                            case 16:
                                return new C2032(new C19673(new C10191(m11793(c17951))));
                            case 17:
                                if (m11794(2)) {
                                    return null;
                                }
                                return new C2032(new C0621(str, c17951.m41776()));
                            default:
                                switch (i) {
                                    case 128:
                                        break;
                                    case 129:
                                        return new C2032(new C2738(str, c17951.m41776(), "video/mp2t"));
                                    case 130:
                                        if (!m11794(64)) {
                                            return null;
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 134:
                                                if (m11794(16)) {
                                                    return null;
                                                }
                                                return new C5251(new C14734("application/x-scte35"));
                                            case 135:
                                                return new C2032(new C2738(str, c17951.m41776(), "video/mp2t"));
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
                        return new C2032(new C6972(str, c17951.m41776(), 5408));
                    }
                }
                return new C2032(new C6972(str, c17951.m41776(), 4096));
            }
            return new C5251(new C14734("application/vnd.dvb.ait"));
        }
        return new C2032(new C18261(new C10191(m11793(c17951)), "video/mp2t"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private List m11793(C17951 c17951) {
        String str;
        int i;
        List listSingletonList;
        boolean zM11794 = m11794(32);
        List list = this.f15172;
        if (zM11794) {
            return list;
        }
        C2460 c2460 = new C2460(c17951.f57413);
        while (c2460.m7503() > 0) {
            int iM7516 = c2460.m7516();
            int iM7500 = c2460.m7500() + c2460.m7516();
            if (iM7516 == 134) {
                ArrayList arrayList = new ArrayList();
                int iM7517 = c2460.m7516() & 31;
                for (int i2 = 0; i2 < iM7517; i2++) {
                    String strM7505 = c2460.m7505(3, StandardCharsets.UTF_8);
                    int iM7518 = c2460.m7516();
                    boolean z = (iM7518 & 128) != 0;
                    if (z) {
                        i = iM7518 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM7516 = (byte) c2460.m7516();
                    c2460.m7535(1);
                    if (z) {
                        boolean z2 = (bM7516 & 64) != 0;
                        int i3 = C2419.f9699;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C10471 c10471 = new C10471();
                    c10471.m26533(str);
                    c10471.m26509(strM7505);
                    c10471.m26499(i);
                    c10471.m26503(listSingletonList);
                    arrayList.add(c10471.m26497());
                }
                list = arrayList;
            }
            c2460.m7510(iM7500);
        }
        return list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m11794(int i) {
        return (i & this.f15173) != 0;
    }
}
