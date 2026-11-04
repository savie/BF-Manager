package l;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.۫ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes4.dex */
public final class C12883 {
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m31922(Resources resources, C12074 c12074) {
        int i;
        int i2;
        String upperCase;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        AbstractC14956 abstractC14956ListIterator = c12074.m30246().listIterator(0);
        int i4 = 0;
        while (abstractC14956ListIterator.hasNext()) {
            C20279 c20279 = (C20279) abstractC14956ListIterator.next();
            if (c20279.m46543() == 2) {
                for (int i5 = 0; i5 < c20279.f65101; i5++) {
                    C15648 c15648M46539 = c20279.m46539(i5);
                    if (c20279.m46541(i5, false) && (c15648M46539.f50834 & 16384) == 0) {
                        arrayList.add(new C19596(c20279, i5, c15648M46539, i4));
                        i4++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        C12884.sort(arrayList, new C10645());
        C22810 c22810 = new C22810(resources);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(c22810.m51440(((C19596) it.next()).m45197()));
        }
        HashMap mapM31921 = m31921(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int i6 = 0;
        while (true) {
            i = 1;
            if (i6 >= arrayList.size()) {
                break;
            }
            String strM46451 = (String) arrayList2.get(i6);
            C15648 c15648M45197 = ((C19596) arrayList.get(i6)).m45197();
            String str = c15648M45197.f50836;
            String strSubstring = c15648M45197.f50848;
            if (!TextUtils.isEmpty(str)) {
                upperCase = c15648M45197.f50836;
            } else if (TextUtils.isEmpty(strSubstring)) {
                upperCase = null;
            } else {
                int iLastIndexOf = strSubstring.lastIndexOf(47);
                if (iLastIndexOf >= 0) {
                    strSubstring = strSubstring.substring(iLastIndexOf + 1);
                }
                if (TextUtils.isEmpty(strSubstring)) {
                    upperCase = null;
                } else {
                    upperCase = strSubstring.toUpperCase(Locale.ROOT);
                }
            }
            if (((Integer) C11392.getOrDefault(mapM31921, strM46451.trim().toLowerCase(Locale.ROOT), 0)).intValue() > 1 && !TextUtils.isEmpty(upperCase)) {
                strM46451 = C20196.m46451(strM46451, " · ", upperCase);
            }
            arrayList3.add(strM46451);
            i6++;
        }
        HashMap mapM31922 = m31921(arrayList3);
        HashMap map = new HashMap();
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        while (i3 < arrayList.size()) {
            C19596 c19596 = (C19596) arrayList.get(i3);
            String strM31437 = (String) arrayList3.get(i3);
            String lowerCase = strM31437.trim().toLowerCase(Locale.ROOT);
            if (((Integer) C11392.getOrDefault(mapM31922, lowerCase, 0)).intValue() > i) {
                int iIntValue = ((Integer) C11392.getOrDefault(map, lowerCase, 0)).intValue() + i;
                map.put(lowerCase, Integer.valueOf(iIntValue));
                StringBuilder sb = new StringBuilder();
                sb.append(strM31437);
                sb.append(" (");
                strM31437 = C12669.m31437(iIntValue, MotionUtils.EASING_TYPE_FORMAT_END, sb);
            }
            String str2 = strM31437;
            C20279 c20279M45200 = c19596.m45200();
            int iM45199 = c19596.m45199();
            C15648 c15648M45198 = c19596.m45197();
            C15648 c15648M45199 = c19596.m45197();
            int i7 = c15648M45199.f50814;
            int iMin = (i7 <= 0 || (i2 = c15648M45199.f50852) <= 0) ? -1 : Math.min(i7, i2);
            arrayList4.add(new C22580(c20279M45200, iM45199, c15648M45198, str2, iMin > 0 ? iMin + "P" : c22810.m51440(c15648M45199)));
            i3++;
            i = 1;
        }
        return C4681.unmodifiableList(arrayList4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3125 m31923(C3125 c3125, C22580 c22580) {
        return c3125.mo10195().mo12044(2, false).mo12043(2).mo12046(new C17295(c22580.m50909().m46540(), AbstractC1928.of((Object) Integer.valueOf(c22580.m50908())))).mo12042();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31920(List list, C3125 c3125) {
        AbstractC4516 it = c3125.f10119.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                return 0;
            }
            C17295 c17295 = (C17295) it.next();
            C16549 c16549 = c17295.f56324;
            AbstractC1928 abstractC1928 = c17295.f56325;
            if (c16549.f53565 == 2 && abstractC1928.size() == 1) {
                int iIntValue = ((Integer) abstractC1928.get(0)).intValue();
                for (int i = 0; i < list.size(); i++) {
                    C22580 c22580 = (C22580) list.get(i);
                    if (c22580.m50908() == iIntValue && c22580.m50909().m46540().equals(c17295.f56324)) {
                        return i + 1;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m31921(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).trim().toLowerCase(Locale.ROOT);
            map.put(lowerCase, Integer.valueOf(((Integer) C11392.getOrDefault(map, lowerCase, 0)).intValue() + 1));
        }
        return map;
    }
}
