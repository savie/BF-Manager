package l;

import bin.mt.plus.R;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۬᩷۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14118 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44640 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final HashMap f44641 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f44642 = Pattern.compile("[0-9]+|\\.?[^.0-9]*");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34280(int i) {
        if (i >= 4) {
            i -= 4;
        }
        if (i < 0 || i > 3) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m34290(int i) {
        return i >= 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34281(int i, boolean z) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException();
        }
        return i + (z ? 4 : 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34288(C8614 c8614, List list) {
        int iM34281;
        Comparator c2932;
        int i;
        AbstractC7364 abstractC7364M23213 = c8614.m23213();
        AbstractC0148 abstractC0148M18806 = abstractC7364M23213 instanceof C6728 ? ((C6728) abstractC7364M23213).m18806() : null;
        String strM34283 = m34283(abstractC7364M23213);
        String strMo10164 = abstractC7364M23213.mo10164();
        String strM23204 = c8614.m23228("local") ? "local:" + c8614.m23204() : c8614.m23204();
        boolean zM23195 = c8614.m23195();
        Integer numM34289 = m34289(strM34283);
        int i2 = -1;
        int i3 = 0;
        if (numM34289 == null) {
            switch (strMo10164) {
                case "net":
                    if (abstractC0148M18806 != null) {
                        HashMap map = abstractC0148M18806.f1120;
                        if (map.containsKey(strM23204)) {
                            iM34281 = ((Integer) map.get(strM23204)).intValue();
                        } else if (!zM23195) {
                            iM34281 = m34281(C17423.f56655, C17423.f56651);
                        } else {
                            iM34281 = m34281(C17423.f56648, C17423.f56653);
                        }
                        break;
                    } else {
                        if (!zM23195) {
                            iM34281 = m34281(C17423.f56655, C17423.f56651);
                        } else {
                            iM34281 = m34281(C17423.f56648, C17423.f56653);
                        }
                        break;
                    }
                    break;
                case "local":
                    HashMap map2 = C17423.f56652;
                    if (map2.containsKey(strM23204)) {
                        iM34281 = ((Integer) map2.get(strM23204)).intValue();
                        break;
                    } else {
                        if (!zM23195) {
                            iM34281 = m34281(C17423.f56655, C17423.f56651);
                        } else {
                            iM34281 = m34281(C17423.f56648, C17423.f56653);
                        }
                        break;
                    }
                    break;
                case "trash":
                    iM34281 = C17423.f56649;
                    break;
                default:
                    if (!zM23195) {
                        iM34281 = m34281(C17423.f56648, C17423.f56653);
                        break;
                    } else {
                        iM34281 = m34281(C17423.f56655, C17423.f56651);
                        break;
                    }
                    break;
            }
        } else {
            iM34281 = numM34289.intValue();
        }
        int iM34280 = m34280(iM34281);
        boolean zM34290 = m34290(iM34281);
        HashMap map3 = new HashMap();
        Collator collator = Collator.getInstance();
        boolean zM38855 = C16356.m38855(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            map3.put(interfaceC2386.getName(), new C1441(collator, interfaceC2386.getName(), zM38855));
        }
        if (iM34280 != 0) {
            if (iM34280 == 1) {
                c2932 = new C10389(map3, zM34290, !c8614.m23228("trash") || c8614.m23166().length() > 1);
            } else if (iM34280 == 2) {
                c2932 = new C8898(map3, zM34290);
            } else {
                if (iM34280 != 3) {
                    throw new IllegalArgumentException(C13645.m33382(iM34280, "method="));
                }
                c2932 = new C7407(map3, zM34290);
            }
        } else if (c8614.m23228("zip")) {
            C15102 c15102 = (C15102) c8614.m23213();
            c2932 = (!c15102.m36369() || c15102.m20218().length() > 1) ? new C2932(map3, zM34290) : new C19340(map3, zM34290);
        } else {
            c2932 = new C2932(map3, zM34290);
        }
        try {
            Collections.sort(list, c2932);
        } catch (IllegalArgumentException e) {
            if (zM38855) {
                throw e;
            }
            map3.clear();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC2386 interfaceC2387 = (InterfaceC2386) it2.next();
                map3.put(interfaceC2387.getName(), new C1441(collator, interfaceC2387.getName(), true));
            }
            Collections.sort(list, c2932);
        }
        if (iM34280 == 1 && c8614.m23228("trash") && c8614.m23166().length() <= 1) {
            C1664 c1664 = new C1664(2);
            while (i3 < list.size()) {
                int iM5989 = c1664.m5989(((InterfaceC2386) list.get(i3)).getTime());
                if (iM5989 != i2) {
                    switch (iM5989) {
                        case 0:
                            i = R.string.MT_Protector;
                            break;
                        case 1:
                            i = R.string.MT_Protector;
                            break;
                        case 2:
                            i = R.string.MT_Protector;
                            break;
                        case 3:
                            i = R.string.MT_Protector;
                            break;
                        case 4:
                            i = R.string.MT_Protector;
                            break;
                        case 5:
                            i = R.string.MT_Protector;
                            break;
                        case 6:
                            i = R.string.MT_Protector;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    list.add(i3, new C25287(C21576.m49088(i), "", null, -1L, 0L, true));
                    i3++;
                    i2 = iM5989;
                }
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34287(ArrayList arrayList, int i, boolean z) {
        Comparator c2932;
        HashMap map = new HashMap();
        Collator collator = Collator.getInstance();
        boolean zM38855 = C16356.m38855(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            map.put(interfaceC2386.getName(), new C1441(collator, interfaceC2386.getName(), zM38855));
        }
        if (i == 0) {
            c2932 = new C2932(map, z);
        } else if (i == 1) {
            c2932 = new C10389(map, z, true);
        } else if (i == 2) {
            c2932 = new C8898(map, z);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C13645.m33382(i, "method="));
            }
            c2932 = new C7407(map, z);
        }
        try {
            Collections.sort(arrayList, c2932);
        } catch (IllegalArgumentException e) {
            if (zM38855) {
                throw e;
            }
            map.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterfaceC2386 interfaceC2387 = (InterfaceC2386) it2.next();
                map.put(interfaceC2387.getName(), new C1441(collator, interfaceC2387.getName(), true));
            }
            Collections.sort(arrayList, c2932);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34283(AbstractC7364 abstractC7364) {
        switch (abstractC7364.mo10164()) {
            case "payload":
                return m34282("payload", ((C21227) abstractC7364).m48382());
            case "archive":
                return m34282("archive", ((C20766) abstractC7364).m47478());
            case "tar":
                return m34282("tar", ((C3109) abstractC7364).m10175());
            case "zip":
                return m34282("zip", ((C15102) abstractC7364).m36371());
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34282(String str, String str2) {
        StringBuilder sbM10405 = C3188.m10405(str, "\nidentityLength=");
        sbM10405.append(str2.length());
        sbM10405.append("\n");
        sbM10405.append(str2);
        return sbM10405.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Integer m34289(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) f44641.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34285(int i, String str, boolean z) {
        f44641.put(str, Integer.valueOf(m34281(i, z)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34286(String str) {
        if (str != null) {
            f44641.remove(str);
        }
    }
}
