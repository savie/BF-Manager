package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6CW */
/* JADX INFO: loaded from: classes5.dex */
public final class C14462 extends AbstractC16700 {
    static {
        C16980.m40037(C14462.class);
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524()) {
            return;
        }
        C18959[] c18959ArrM8506 = c2551.m8506();
        List<InterfaceC5140> listM56080 = c2551.m8523().m56080();
        if (listM56080.isEmpty()) {
            return;
        }
        for (InterfaceC5140 interfaceC5140 : listM56080) {
            InterfaceC19112 interfaceC19112Mo15530 = interfaceC5140.mo15530();
            int[] iArrMo22005 = interfaceC19112Mo15530.mo22005();
            String[] strArrMo22003 = interfaceC19112Mo15530.mo22003();
            int length = iArrMo22005.length;
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                int i2 = iArrMo22005[i];
                C1345 c1345M4954 = C1345.m4954(c2551.mo8527(), strArrMo22003[i]);
                arrayList.add(new C4768(c1345M4954, m34930(c2551, c18959ArrM8506, i2, c1345M4954)));
            }
            int iMo22004 = interfaceC19112Mo15530.mo22004();
            C18959 c18959 = null;
            if (iMo22004 >= 0) {
                arrayList.add(new C4768(null, m34930(c2551, c18959ArrM8506, iMo22004, null)));
            }
            C21922 c21922M49615 = C21922.m49615(arrayList);
            if (!((ArrayList) c21922M49615.m49617()).isEmpty()) {
                int iMo15531 = interfaceC5140.mo15531();
                int iMo15529 = interfaceC5140.mo15529();
                boolean z = false;
                while (iMo15531 <= iMo15529) {
                    C18959 c189510 = c18959ArrM8506[iMo15531];
                    if (c189510 != null) {
                        C21922 c21922 = (C21922) c189510.mo17862((InterfaceC2157) C11457.f36015);
                        if (c21922 != null) {
                            List listM49616 = c21922.m49616();
                            List listM49617 = c21922M49615.m49616();
                            int size = listM49616.size();
                            int size2 = listM49617.size();
                            if (size == 0 && size2 == 0) {
                                listM49616 = Collections.EMPTY_LIST;
                            } else if (size == 0) {
                                listM49616 = listM49617;
                            } else if (size2 != 0) {
                                ArrayList arrayList2 = new ArrayList(size + size2);
                                arrayList2.addAll(listM49616);
                                arrayList2.addAll(listM49617);
                                listM49616 = arrayList2;
                            }
                            c189510.mo17864(C21922.m49615(listM49616));
                        } else {
                            c189510.mo17864(c21922M49615);
                        }
                        if (!z) {
                            c189510.mo17866(EnumC1763.TRY_ENTER);
                            z = true;
                        }
                        c18959 = c189510;
                    }
                    iMo15531 = C1690.m6047(c18959ArrM8506, iMo15531);
                    if (iMo15531 == -1) {
                        break;
                    }
                }
                if (z) {
                    c18959.mo17866(EnumC1763.TRY_LEAVE);
                } else {
                    int iMo15532 = interfaceC5140.mo15531();
                    C18959 c189511 = new C18959(EnumC24203.NOP, 0);
                    c189511.m44024(iMo15532);
                    c189511.mo17866(EnumC1763.SYNTHETIC);
                    c18959ArrM8506[iMo15532] = c189511;
                    c189511.mo17866(EnumC1763.TRY_ENTER);
                    c189511.mo17866(EnumC1763.TRY_LEAVE);
                    c189511.mo17864(c21922M49615);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19684 m34930(C2551 c2551, C18959[] c18959Arr, int i, C1345 c1345) {
        if (c1345 == null && C8314.m22398(c2551.m8536()).m37753()) {
            c1345 = C1345.m4955(c2551.mo8527(), AbstractC1566.m5538("java.lang.Throwable"));
        }
        C18959 c18959 = c18959Arr[i];
        if (c18959 != null) {
            C10733 c10733 = (C10733) c18959.mo17862((InterfaceC2157) C11457.f36036);
            if (c10733 != null) {
                C19684 c19684M27337 = c10733.m27337();
                c19684M27337.m45359(c2551, c1345);
                return c19684M27337;
            }
        } else {
            c18959 = new C18959(EnumC24203.NOP, 0);
            c18959.m44024(i);
            c18959.mo17866(EnumC1763.SYNTHETIC);
            c18959Arr[i] = c18959;
        }
        C19684 c19684M45356 = C19684.m45356(c2551, i, c1345);
        c2551.m8505(c19684M45356);
        c18959.mo17864(new C10733(c19684M45356));
        return c19684M45356;
    }
}
