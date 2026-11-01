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

/* JADX INFO: renamed from: l.ۗܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3386 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12507 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final HashMap f12508 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f12509 = Pattern.compile("[0-9]+|\\.?[^.0-9]*");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m10039(int i) {
        if (i >= 4) {
            i -= 4;
        }
        if (i < 0 || i > 3) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m10049(int i) {
        return i >= 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m10040(int i, boolean z) {
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
    public static void m10047(C11545 c11545, List list) {
        int iM10040;
        Comparator c14677;
        int i;
        AbstractC11462 abstractC11462M28817 = c11545.m28817();
        AbstractC12068 abstractC12068M23630 = abstractC11462M28817 instanceof C9183 ? ((C9183) abstractC11462M28817).m23630() : null;
        String strM10042 = m10042(abstractC11462M28817);
        String strMo13039 = abstractC11462M28817.mo13039();
        String strM28799 = c11545.m28814("local") ? "local:" + c11545.m28799() : c11545.m28799();
        boolean zM28762 = c11545.m28762();
        Integer numM10048 = m10048(strM10042);
        int i2 = -1;
        int i3 = 0;
        if (numM10048 == null) {
            switch (strMo13039) {
                case "net":
                    if (abstractC12068M23630 != null) {
                        HashMap map = abstractC12068M23630.f40389;
                        if (map.containsKey(strM28799)) {
                            iM10040 = ((Integer) map.get(strM28799)).intValue();
                        } else if (!zM28762) {
                            iM10040 = m10040(C0674.f2824, C0674.f2834);
                        } else {
                            iM10040 = m10040(C0674.f2830, C0674.f2827);
                        }
                        break;
                    } else {
                        if (!zM28762) {
                            iM10040 = m10040(C0674.f2824, C0674.f2834);
                        } else {
                            iM10040 = m10040(C0674.f2830, C0674.f2827);
                        }
                        break;
                    }
                    break;
                case "local":
                    HashMap map2 = C0674.f2833;
                    if (map2.containsKey(strM28799)) {
                        iM10040 = ((Integer) map2.get(strM28799)).intValue();
                        break;
                    } else {
                        if (!zM28762) {
                            iM10040 = m10040(C0674.f2824, C0674.f2834);
                        } else {
                            iM10040 = m10040(C0674.f2830, C0674.f2827);
                        }
                        break;
                    }
                    break;
                case "trash":
                    iM10040 = C0674.f2828;
                    break;
                default:
                    if (!zM28762) {
                        iM10040 = m10040(C0674.f2830, C0674.f2827);
                        break;
                    } else {
                        iM10040 = m10040(C0674.f2824, C0674.f2834);
                        break;
                    }
                    break;
            }
        } else {
            iM10040 = numM10048.intValue();
        }
        int iM10039 = m10039(iM10040);
        boolean zM10049 = m10049(iM10040);
        HashMap map3 = new HashMap();
        Collator collator = Collator.getInstance();
        boolean zM42321 = C18204.m42321(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            map3.put(interfaceC2557.getName(), new C11149(collator, interfaceC2557.getName(), zM42321));
        }
        if (iM10039 != 0) {
            if (iM10039 == 1) {
                c14677 = new C6209(map3, zM10049, !c11545.m28814("trash") || c11545.m28798().length() > 1);
            } else if (iM10039 == 2) {
                c14677 = new C1975(map3, zM10049);
            } else {
                if (iM10039 != 3) {
                    throw new IllegalArgumentException(C8479.m22141(iM10039, "method="));
                }
                c14677 = new C9738(map3, zM10049);
            }
        } else if (c11545.m28814("zip")) {
            C13810 c13810 = (C13810) c11545.m28817();
            c14677 = (!c13810.m33623() || c13810.m28629().length() > 1) ? new C14677(map3, zM10049) : new C17498(map3, zM10049);
        } else {
            c14677 = new C14677(map3, zM10049);
        }
        try {
            Collections.sort(list, c14677);
        } catch (IllegalArgumentException e) {
            if (zM42321) {
                throw e;
            }
            map3.clear();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC2557 interfaceC2558 = (InterfaceC2557) it2.next();
                map3.put(interfaceC2558.getName(), new C11149(collator, interfaceC2558.getName(), true));
            }
            Collections.sort(list, c14677);
        }
        if (iM10039 == 1 && c11545.m28814("trash") && c11545.m28798().length() <= 1) {
            C21841 c21841 = new C21841();
            while (i3 < list.size()) {
                int iM48610 = c21841.m48610(((InterfaceC2557) list.get(i3)).getTime());
                if (iM48610 != i2) {
                    switch (iM48610) {
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
                    list.add(i3, new C8348(C16737.m39288(i), "", null, -1L, 0L, true));
                    i3++;
                    i2 = iM48610;
                }
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10046(ArrayList arrayList, int i, boolean z) {
        Comparator c14677;
        HashMap map = new HashMap();
        Collator collator = Collator.getInstance();
        boolean zM42321 = C18204.m42321(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            map.put(interfaceC2557.getName(), new C11149(collator, interfaceC2557.getName(), zM42321));
        }
        if (i == 0) {
            c14677 = new C14677(map, z);
        } else if (i == 1) {
            c14677 = new C6209(map, z, true);
        } else if (i == 2) {
            c14677 = new C1975(map, z);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(C8479.m22141(i, "method="));
            }
            c14677 = new C9738(map, z);
        }
        try {
            Collections.sort(arrayList, c14677);
        } catch (IllegalArgumentException e) {
            if (zM42321) {
                throw e;
            }
            map.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterfaceC2557 interfaceC2558 = (InterfaceC2557) it2.next();
                map.put(interfaceC2558.getName(), new C11149(collator, interfaceC2558.getName(), true));
            }
            Collections.sort(arrayList, c14677);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10042(AbstractC11462 abstractC11462) {
        switch (abstractC11462.mo13039()) {
            case "payload":
                return m10041("payload", ((C20098) abstractC11462).m45464());
            case "archive":
                return m10041("archive", ((C9221) abstractC11462).m23740());
            case "tar":
                return m10041("tar", ((C23085) abstractC11462).m51085());
            case "zip":
                return m10041("zip", ((C13810) abstractC11462).m33624());
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10041(String str, String str2) {
        StringBuilder sbM8976 = C3012.m8976(str, "\nidentityLength=");
        sbM8976.append(str2.length());
        sbM8976.append("\n");
        sbM8976.append(str2);
        return sbM8976.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Integer m10048(String str) {
        if (str == null) {
            return null;
        }
        return (Integer) f12508.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10044(int i, String str, boolean z) {
        f12508.put(str, Integer.valueOf(m10040(i, z)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10045(String str) {
        if (str != null) {
            f12508.remove(str);
        }
    }
}
