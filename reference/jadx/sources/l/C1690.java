package l;

/* JADX INFO: renamed from: l.֫ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C1690 extends AbstractC16700 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        C18959 c18959;
        C18959 c189510;
        if (c2551.m8524()) {
            return;
        }
        C18959[] c18959ArrM8506 = c2551.m8506();
        for (int i = 0; i < c18959ArrM8506.length; i++) {
            C18959 c189511 = c18959ArrM8506[i];
            if (c189511 != null) {
                switch (C5419.f18910[c189511.getType().ordinal()]) {
                    case 1:
                        C1082 c1082 = (C1082) c189511;
                        if (c1082.m4065()) {
                            int iM6047 = m6047(c18959ArrM8506, i);
                            int iM4077 = c1082.m4077();
                            int length = c18959ArrM8506.length;
                            int i2 = iM4077;
                            while (true) {
                                if (i2 >= length) {
                                    c18959 = null;
                                } else {
                                    c18959 = c18959ArrM8506[i2];
                                    if (c18959 == null || c18959.getType() == EnumC24203.NOP) {
                                        i2++;
                                    }
                                }
                            }
                            if (c18959 != null && c18959.getType() == EnumC24203.SWITCH_DATA) {
                                C10030 c10030 = (C10030) c18959;
                                c10030.m25879(i);
                                c1082.m4067(c10030, iM6047);
                                c18959ArrM8506[c18959.getOffset()] = null;
                            } else {
                                throw new C8597("Payload for switch not found at ".concat(C8314.m22396(iM4077)));
                            }
                        }
                        int iM4079 = c1082.m4079();
                        if (iM4079 != -1) {
                            m6048(c2551, c18959ArrM8506, i, iM4079);
                        }
                        for (int i3 : c1082.m4074()) {
                            m6048(c2551, c18959ArrM8506, i, i3);
                        }
                        break;
                    case 2:
                        int iM6048 = m6047(c18959ArrM8506, i);
                        if (iM6048 != -1) {
                            m6048(c2551, c18959ArrM8506, i, iM6048);
                        }
                        m6048(c2551, c18959ArrM8506, i, ((C17489) c189511).mo39519());
                        break;
                    case 3:
                        m6048(c2551, c18959ArrM8506, i, ((C16743) c189511).mo39519());
                        break;
                    case 4:
                        m6048(c2551, c18959ArrM8506, i, ((C2312) c189511).m7815());
                        int iM6049 = m6047(c18959ArrM8506, i);
                        if (iM6049 != -1) {
                            m6048(c2551, c18959ArrM8506, i, iM6049);
                        }
                        break;
                    case 5:
                        if (c189511.m44027() == null) {
                            m6049(c18959ArrM8506, i, c189511, ((AbstractC15251) c189511).mo18926().m49698());
                        }
                        break;
                    case 6:
                        if (c189511.m44027() == null) {
                            m6049(c18959ArrM8506, i, c189511, AbstractC1566.f5417);
                        }
                        break;
                    case 7:
                        m6049(c18959ArrM8506, i, c189511, ((C24949) c189511).m55706());
                        break;
                    case 8:
                        C11522 c11522 = (C11522) c189511;
                        int iM29012 = c11522.m29012();
                        int length2 = c18959ArrM8506.length;
                        int i4 = iM29012;
                        while (true) {
                            if (i4 >= length2) {
                                c189510 = null;
                            } else {
                                c189510 = c18959ArrM8506[i4];
                                if (c189510 == null || c189510.getType() == EnumC24203.NOP) {
                                    i4++;
                                }
                            }
                        }
                        if (c189510 != null && c189510.getType() == EnumC24203.FILL_ARRAY_DATA) {
                            c11522.m29010((C1828) c189510);
                            c18959ArrM8506[c189510.getOffset()] = null;
                        } else {
                            throw new C8597("Payload for fill-array not found at ".concat(C8314.m22396(iM29012)));
                        }
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6049(C18959[] c18959Arr, int i, C18959 c18959, AbstractC1566 abstractC1566) {
        int iM6047 = m6047(c18959Arr, i);
        if (iM6047 == -1) {
            return;
        }
        C18959 c189510 = c18959Arr[iM6047];
        if (c189510.getType() != EnumC24203.MOVE_RESULT) {
            return;
        }
        c18959.m44031(c189510.m44027().m17533(abstractC1566));
        c18959.m39414((AbstractC16678) c189510);
        c18959.m16975((AbstractC5820) c189510);
        c18959Arr[c189510.getOffset()] = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6048(C2551 c2551, C18959[] c18959Arr, int i, int i2) {
        try {
            c18959Arr[i2].mo17863(C11457.f36035, new C13277(i, i2));
        } catch (Exception e) {
            String str = "Failed to set jump: " + C8314.m22396(i) + " -> " + C8314.m22396(i2);
            c2551.getClass();
            C23977.m53506(c2551, str, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6047(C18959[] c18959Arr, int i) {
        int length = c18959Arr.length;
        while (true) {
            i++;
            if (i >= length) {
                return -1;
            }
            C18959 c18959 = c18959Arr[i];
            if (c18959 != null && c18959.getType() != EnumC24203.NOP) {
                return i;
            }
        }
    }
}
