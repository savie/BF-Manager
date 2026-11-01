package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۟᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7683 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20315(AbstractC23019 abstractC23019, Map map, AbstractC22044 abstractC22044) {
        boolean zM29472 = abstractC23019.getDescriptorForType().m8525().m29472();
        for (Map.Entry entry : map.entrySet()) {
            C19741 c19741 = (C19741) entry.getKey();
            Object value = entry.getValue();
            if (zM29472 && c19741.m44908() && c19741.getType() == EnumC8452.f29310 && !c19741.mo23408()) {
                abstractC22044.mo14250(c19741.getNumber(), (InterfaceC1332) value);
            } else {
                C8347.m21820(c19741, value, abstractC22044);
            }
        }
        C6708 unknownFields = abstractC23019.getUnknownFields();
        if (zM29472) {
            unknownFields.m18144(abstractC22044);
        } else {
            unknownFields.writeTo(abstractC22044);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20310(AbstractC23019 abstractC23019, Map map) {
        int serializedSize;
        boolean zM29472 = abstractC23019.getDescriptorForType().m8525().m29472();
        int iM21831 = 0;
        for (Map.Entry entry : map.entrySet()) {
            C19741 c19741 = (C19741) entry.getKey();
            Object value = entry.getValue();
            if (zM29472 && c19741.m44908() && c19741.getType() == EnumC8452.f29310 && !c19741.mo23408()) {
                int number = c19741.getNumber();
                iM21831 += AbstractC22044.m48963(3, (InterfaceC1332) value) + AbstractC22044.m48960(2, number) + (AbstractC22044.m48973(1) * 2);
            } else {
                iM21831 += C8347.m21831(c19741, value);
            }
        }
        C6708 unknownFields = abstractC23019.getUnknownFields();
        if (zM29472) {
            serializedSize = unknownFields.m18146();
        } else {
            serializedSize = unknownFields.getSerializedSize();
        }
        return serializedSize + iM21831;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20312(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m20311(String str, C19741 c19741, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (c19741.m44908()) {
            sb.append('(');
            sb.append(c19741.mo8523());
            sb.append(')');
        } else {
            sb.append(c19741.getName());
        }
        if (i != -1) {
            sb.append('[');
            sb.append(i);
            sb.append(']');
        }
        sb.append('.');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20314(InterfaceC18266 interfaceC18266, String str, ArrayList arrayList) {
        for (C19741 c19741 : interfaceC18266.getDescriptorForType().getFields()) {
            if (c19741.m44914() && !interfaceC18266.hasField(c19741)) {
                StringBuilder sbM23356 = C9023.m23356(str);
                sbM23356.append(c19741.getName());
                arrayList.add(sbM23356.toString());
            }
        }
        for (Map.Entry entry : interfaceC18266.getAllFields().entrySet()) {
            C19741 c19742 = (C19741) entry.getKey();
            Object value = entry.getValue();
            if (c19742.m44913() == EnumC19035.MESSAGE) {
                if (c19742.mo23408()) {
                    Iterator it = ((List) value).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        m20314((InterfaceC18266) it.next(), m20311(str, c19742, i), arrayList);
                        i++;
                    }
                } else if (interfaceC18266.hasField(c19742)) {
                    m20314((InterfaceC18266) value, m20311(str, c19742, -1), arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m20313(InterfaceC18266 interfaceC18266) {
        ArrayList arrayList = new ArrayList();
        m20314(interfaceC18266, "", arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20316(AbstractC3262 abstractC3262, C22231 c22231, C2701 c2701, C2806 c2806, InterfaceC10506 interfaceC10506, int i) {
        InterfaceC1332 interfaceC1332;
        boolean z;
        Object objM18885;
        C3511 c3511Mo22025;
        int iMo6041 = 0;
        C19741 c19741M8521 = null;
        AbstractC23725 abstractC23725Mo6050 = null;
        if (!c2806.m8525().m29472() || i != 11) {
            int i2 = i & 7;
            int i3 = i >>> 3;
            if (c2806.m8529(i3)) {
                if (!(c2701 instanceof C4818) || (c3511Mo22025 = interfaceC10506.mo22025((C4818) c2701, c2806, i3)) == null) {
                    interfaceC1332 = null;
                } else {
                    c19741M8521 = c3511Mo22025.f12865;
                    interfaceC1332 = c3511Mo22025.f12864;
                    if (interfaceC1332 == null && c19741M8521.m44913() == EnumC19035.MESSAGE) {
                        throw new IllegalStateException("Message-typed extension lacked default instance: " + c19741M8521.mo8523());
                    }
                }
            } else if (interfaceC10506.mo22027() == EnumC9095.MESSAGE) {
                c19741M8521 = c2806.m8521(i3);
                interfaceC1332 = null;
            } else {
                interfaceC1332 = null;
            }
            if (c19741M8521 == null) {
                z = false;
                iMo6041 = 1;
            } else {
                EnumC3180 enumC3180Mo23407 = c19741M8521.mo23407();
                int i4 = C8347.f28924;
                if (i2 == enumC3180Mo23407.m9598()) {
                    z = false;
                } else if (c19741M8521.m44903()) {
                    c19741M8521.mo23407();
                    if (i2 == 2) {
                        z = true;
                    } else {
                        z = false;
                        iMo6041 = 1;
                    }
                } else {
                    z = false;
                    iMo6041 = 1;
                }
            }
            if (iMo6041 != 0) {
                if (c22231 != null) {
                    return c22231.m49361(i, abstractC3262);
                }
                return abstractC3262.mo6022(i);
            }
            if (z) {
                int iMo6035 = abstractC3262.mo6035(abstractC3262.mo6044());
                if (c19741M8521.mo23407() == EnumC3180.f11954) {
                    while (abstractC3262.mo6038() > 0) {
                        int iMo6037 = abstractC3262.mo6037();
                        if (c19741M8521.m44905()) {
                            C21857 c21857M18883 = c19741M8521.m44901().m18883(iMo6037);
                            if (c21857M18883 != null) {
                                interfaceC10506.addRepeatedField(c19741M8521, c21857M18883);
                            } else if (c22231 != null) {
                                c22231.m49356(i3, iMo6037);
                            }
                        } else {
                            interfaceC10506.addRepeatedField(c19741M8521, c19741M8521.m44901().m18885(iMo6037));
                        }
                    }
                } else {
                    while (abstractC3262.mo6038() > 0) {
                        interfaceC10506.addRepeatedField(c19741M8521, C22148.m49137(abstractC3262, c19741M8521.mo23407(), interfaceC10506.mo22026(c19741M8521)));
                    }
                }
                abstractC3262.mo6039(iMo6035);
                return true;
            }
            int i5 = C18972.f61422[c19741M8521.getType().ordinal()];
            if (i5 == 1) {
                interfaceC10506.mo22029(abstractC3262, c2701, c19741M8521, interfaceC1332);
                return true;
            }
            if (i5 == 2) {
                interfaceC10506.mo22028(abstractC3262, c2701, c19741M8521, interfaceC1332);
                return true;
            }
            if (i5 == 3) {
                int iMo6038 = abstractC3262.mo6037();
                if (c19741M8521.m44905()) {
                    C21857 c21857M18884 = c19741M8521.m44901().m18883(iMo6038);
                    if (c21857M18884 != null) {
                        objM18885 = c21857M18884;
                    } else if (c22231 != null) {
                        c22231.m49356(i3, iMo6038);
                    }
                } else {
                    objM18885 = c19741M8521.m44901().m18885(iMo6038);
                }
            } else {
                objM18885 = C22148.m49137(abstractC3262, c19741M8521.mo23407(), interfaceC10506.mo22026(c19741M8521));
            }
            if (c19741M8521.mo23408()) {
                interfaceC10506.addRepeatedField(c19741M8521, objM18885);
                return true;
            }
            interfaceC10506.setField(c19741M8521, objM18885);
            return true;
        }
        C3511 c3511Mo22026 = null;
        while (true) {
            int iMo6048 = abstractC3262.mo6048();
            if (iMo6048 == 0) {
                break;
            }
            if (iMo6048 == 16) {
                iMo6041 = abstractC3262.mo6041();
                if (iMo6041 != 0 && (c2701 instanceof C4818)) {
                    c3511Mo22026 = interfaceC10506.mo22025((C4818) c2701, c2806, iMo6041);
                }
            } else if (iMo6048 == 26) {
                if (iMo6041 != 0 && c3511Mo22026 != null) {
                    C2701 c2702 = C2701.f10402;
                }
                abstractC23725Mo6050 = abstractC3262.mo6050();
            } else if (!abstractC3262.mo6022(iMo6048)) {
                break;
            }
        }
        abstractC3262.mo6025(12);
        if (abstractC23725Mo6050 != null && iMo6041 != 0) {
            if (c3511Mo22026 != null) {
                C19741 c19741 = c3511Mo22026.f12865;
                InterfaceC1332 interfaceC1333 = c3511Mo22026.f12864;
                if (!interfaceC10506.hasField(c19741)) {
                    C2701 c2703 = C2701.f10402;
                    interfaceC10506.setField(c19741, new C22875(interfaceC1333, c2701, abstractC23725Mo6050));
                    return true;
                }
                interfaceC10506.setField(c19741, interfaceC10506.mo22024(abstractC23725Mo6050, c2701, c19741, interfaceC1333));
                return true;
            }
            if (c22231 != null) {
                int i6 = C13059.f43521;
                C1063 c1063M4014 = C1063.m4014();
                c1063M4014.m4020(abstractC23725Mo6050);
                c22231.m49357(iMo6041, c1063M4014.m4015());
                return true;
            }
        }
        return true;
    }
}
