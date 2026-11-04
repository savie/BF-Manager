package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PG */
/* JADX INFO: loaded from: classes.dex */
public final class C21933 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49630(AbstractC19124 abstractC19124, Map map, AbstractC14846 abstractC14846) {
        boolean zM17896 = abstractC19124.getDescriptorForType().m54744().m17896();
        for (Map.Entry entry : map.entrySet()) {
            C7323 c7323 = (C7323) entry.getKey();
            Object value = entry.getValue();
            if (zM17896 && c7323.m20083() && c7323.getType() == EnumC8814.f28803 && !c7323.mo8649()) {
                abstractC14846.mo14020(c7323.getNumber(), (InterfaceC21013) value);
            } else {
                C8551.m22879(c7323, value, abstractC14846);
            }
        }
        C7719 unknownFields = abstractC19124.getUnknownFields();
        if (zM17896) {
            unknownFields.m21005(abstractC14846);
        } else {
            unknownFields.writeTo(abstractC14846);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49625(AbstractC19124 abstractC19124, Map map) {
        int serializedSize;
        boolean zM17896 = abstractC19124.getDescriptorForType().m54744().m17896();
        int iM22890 = 0;
        for (Map.Entry entry : map.entrySet()) {
            C7323 c7323 = (C7323) entry.getKey();
            Object value = entry.getValue();
            if (zM17896 && c7323.m20083() && c7323.getType() == EnumC8814.f28803 && !c7323.mo8649()) {
                int number = c7323.getNumber();
                iM22890 += AbstractC14846.m35774(3, (InterfaceC21013) value) + AbstractC14846.m35764(2, number) + (AbstractC14846.m35765(1) * 2);
            } else {
                iM22890 += C8551.m22890(c7323, value);
            }
        }
        C7719 unknownFields = abstractC19124.getUnknownFields();
        if (zM17896) {
            serializedSize = unknownFields.m21008();
        } else {
            serializedSize = unknownFields.getSerializedSize();
        }
        return serializedSize + iM22890;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49627(List list) {
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
    public static String m49626(String str, C7323 c7323, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (c7323.m20083()) {
            sb.append('(');
            sb.append(c7323.mo5002());
            sb.append(')');
        } else {
            sb.append(c7323.getName());
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
    public static void m49629(InterfaceC9078 interfaceC9078, String str, ArrayList arrayList) {
        for (C7323 c7323 : interfaceC9078.getDescriptorForType().getFields()) {
            if (c7323.m20090() && !interfaceC9078.hasField(c7323)) {
                StringBuilder sbM27333 = C10732.m27333(str);
                sbM27333.append(c7323.getName());
                arrayList.add(sbM27333.toString());
            }
        }
        for (Map.Entry entry : interfaceC9078.getAllFields().entrySet()) {
            C7323 c7324 = (C7323) entry.getKey();
            Object value = entry.getValue();
            if (c7324.m20086() == EnumC2848.MESSAGE) {
                if (c7324.mo8649()) {
                    Iterator it = ((List) value).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        m49629((InterfaceC9078) it.next(), m49626(str, c7324, i), arrayList);
                        i++;
                    }
                } else if (interfaceC9078.hasField(c7324)) {
                    m49629((InterfaceC9078) value, m49626(str, c7324, -1), arrayList);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m49628(InterfaceC9078 interfaceC9078) {
        ArrayList arrayList = new ArrayList();
        m49629(interfaceC9078, "", arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49631(AbstractC3660 abstractC3660, C14430 c14430, C24215 c24215, C24478 c24478, InterfaceC4779 interfaceC4779, int i) {
        InterfaceC21013 interfaceC21013;
        boolean z;
        Object objM21966;
        C3331 c3331Mo14751;
        int iMo11889 = 0;
        C7323 c7323M54735 = null;
        AbstractC17084 abstractC17084Mo11890 = null;
        if (!c24478.m54744().m17896() || i != 11) {
            int i2 = i & 7;
            int i3 = i >>> 3;
            if (c24478.m54742(i3)) {
                if (!(c24215 instanceof C20485) || (c3331Mo14751 = interfaceC4779.mo14751((C20485) c24215, c24478, i3)) == null) {
                    interfaceC21013 = null;
                } else {
                    c7323M54735 = c3331Mo14751.f10901;
                    interfaceC21013 = c3331Mo14751.f10900;
                    if (interfaceC21013 == null && c7323M54735.m20086() == EnumC2848.MESSAGE) {
                        throw new IllegalStateException("Message-typed extension lacked default instance: " + c7323M54735.mo5002());
                    }
                }
            } else if (interfaceC4779.mo14753() == EnumC13553.MESSAGE) {
                c7323M54735 = c24478.m54735(i3);
                interfaceC21013 = null;
            } else {
                interfaceC21013 = null;
            }
            if (c7323M54735 == null) {
                z = false;
                iMo11889 = 1;
            } else {
                EnumC3440 enumC3440Mo8652 = c7323M54735.mo8652();
                int i4 = C8551.f27923;
                if (i2 == enumC3440Mo8652.m11209()) {
                    z = false;
                } else if (c7323M54735.m20084()) {
                    c7323M54735.mo8652();
                    if (i2 == 2) {
                        z = true;
                    } else {
                        z = false;
                        iMo11889 = 1;
                    }
                } else {
                    z = false;
                    iMo11889 = 1;
                }
            }
            if (iMo11889 != 0) {
                if (c14430 != null) {
                    return c14430.m34860(i, abstractC3660);
                }
                return abstractC3660.mo11900(i);
            }
            if (z) {
                int iMo11885 = abstractC3660.mo11885(abstractC3660.mo11891());
                if (c7323M54735.mo8652() == EnumC3440.f11211) {
                    while (abstractC3660.mo11897() > 0) {
                        int iMo11882 = abstractC3660.mo11882();
                        if (c7323M54735.m20085()) {
                            C1357 c1357M21963 = c7323M54735.m20092().m21963(iMo11882);
                            if (c1357M21963 != null) {
                                interfaceC4779.addRepeatedField(c7323M54735, c1357M21963);
                            } else if (c14430 != null) {
                                c14430.m34855(i3, iMo11882);
                            }
                        } else {
                            interfaceC4779.addRepeatedField(c7323M54735, c7323M54735.m20092().m21966(iMo11882));
                        }
                    }
                } else {
                    while (abstractC3660.mo11897() > 0) {
                        interfaceC4779.addRepeatedField(c7323M54735, C14626.m35265(abstractC3660, c7323M54735.mo8652(), interfaceC4779.mo14752(c7323M54735)));
                    }
                }
                abstractC3660.mo11898(iMo11885);
                return true;
            }
            int i5 = C2367.f7623[c7323M54735.getType().ordinal()];
            if (i5 == 1) {
                interfaceC4779.mo14756(abstractC3660, c24215, c7323M54735, interfaceC21013);
                return true;
            }
            if (i5 == 2) {
                interfaceC4779.mo14755(abstractC3660, c24215, c7323M54735, interfaceC21013);
                return true;
            }
            if (i5 == 3) {
                int iMo11883 = abstractC3660.mo11882();
                if (c7323M54735.m20085()) {
                    C1357 c1357M21964 = c7323M54735.m20092().m21963(iMo11883);
                    if (c1357M21964 != null) {
                        objM21966 = c1357M21964;
                    } else if (c14430 != null) {
                        c14430.m34855(i3, iMo11883);
                    }
                } else {
                    objM21966 = c7323M54735.m20092().m21966(iMo11883);
                }
            } else {
                objM21966 = C14626.m35265(abstractC3660, c7323M54735.mo8652(), interfaceC4779.mo14752(c7323M54735));
            }
            if (c7323M54735.mo8649()) {
                interfaceC4779.addRepeatedField(c7323M54735, objM21966);
                return true;
            }
            interfaceC4779.setField(c7323M54735, objM21966);
            return true;
        }
        C3331 c3331Mo14752 = null;
        while (true) {
            int iMo11876 = abstractC3660.mo11876();
            if (iMo11876 == 0) {
                break;
            }
            if (iMo11876 == 16) {
                iMo11889 = abstractC3660.mo11889();
                if (iMo11889 != 0 && (c24215 instanceof C20485)) {
                    c3331Mo14752 = interfaceC4779.mo14751((C20485) c24215, c24478, iMo11889);
                }
            } else if (iMo11876 == 26) {
                if (iMo11889 != 0 && c3331Mo14752 != null) {
                    C24215 c24216 = C24215.f78465;
                }
                abstractC17084Mo11890 = abstractC3660.mo11890();
            } else if (!abstractC3660.mo11900(iMo11876)) {
                break;
            }
        }
        abstractC3660.mo11879(12);
        if (abstractC17084Mo11890 != null && iMo11889 != 0) {
            if (c3331Mo14752 != null) {
                C7323 c7323 = c3331Mo14752.f10901;
                InterfaceC21013 interfaceC21014 = c3331Mo14752.f10900;
                if (!interfaceC4779.hasField(c7323)) {
                    C24215 c24217 = C24215.f78465;
                    interfaceC4779.setField(c7323, new C18971(interfaceC21014, c24215, abstractC17084Mo11890));
                    return true;
                }
                interfaceC4779.setField(c7323, interfaceC4779.mo14754(abstractC17084Mo11890, c24215, c7323, interfaceC21014));
                return true;
            }
            if (c14430 != null) {
                int i6 = C18160.f59362;
                C21144 c21144M48247 = C21144.m48247();
                c21144M48247.m48252(abstractC17084Mo11890);
                c14430.m34857(iMo11889, c21144M48247.m48248());
                return true;
            }
        }
        return true;
    }
}
