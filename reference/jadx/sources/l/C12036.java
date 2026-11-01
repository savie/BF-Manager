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

/* JADX INFO: renamed from: l.ۨ᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes3.dex */
public final class C12036 {
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m29938(Resources resources, C9456 c9456) {
        int i;
        int i2;
        String upperCase;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        AbstractC16706 abstractC16706ListIterator = c9456.m24212().listIterator(0);
        int i4 = 0;
        while (abstractC16706ListIterator.hasNext()) {
            C1693 c1693 = (C1693) abstractC16706ListIterator.next();
            if (c1693.m5618() == 2) {
                for (int i5 = 0; i5 < c1693.f6705; i5++) {
                    C7648 c7648M5614 = c1693.m5614(i5);
                    if (c1693.m5616(i5, false) && (c7648M5614.f25244 & 16384) == 0) {
                        arrayList.add(new C4979(c1693, i5, c7648M5614, i4));
                        i4++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        C23846.sort(arrayList, new C9546());
        C15763 c15763 = new C15763(resources);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(c15763.m37507(((C4979) it.next()).m13808()));
        }
        HashMap mapM29937 = m29937(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int i6 = 0;
        while (true) {
            i = 1;
            if (i6 >= arrayList.size()) {
                break;
            }
            String strM5594 = (String) arrayList2.get(i6);
            C7648 c7648M13808 = ((C4979) arrayList.get(i6)).m13808();
            String str = c7648M13808.f25277;
            String strSubstring = c7648M13808.f25265;
            if (!TextUtils.isEmpty(str)) {
                upperCase = c7648M13808.f25277;
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
            if (((Integer) C9735.getOrDefault(mapM29937, strM5594.trim().toLowerCase(Locale.ROOT), 0)).intValue() > 1 && !TextUtils.isEmpty(upperCase)) {
                strM5594 = C1679.m5594(strM5594, " · ", upperCase);
            }
            arrayList3.add(strM5594);
            i6++;
        }
        HashMap mapM29938 = m29937(arrayList3);
        HashMap map = new HashMap();
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        while (i3 < arrayList.size()) {
            C4979 c4979 = (C4979) arrayList.get(i3);
            String strM30911 = (String) arrayList3.get(i3);
            String lowerCase = strM30911.trim().toLowerCase(Locale.ROOT);
            if (((Integer) C9735.getOrDefault(mapM29938, lowerCase, 0)).intValue() > i) {
                int iIntValue = ((Integer) C9735.getOrDefault(map, lowerCase, 0)).intValue() + i;
                map.put(lowerCase, Integer.valueOf(iIntValue));
                StringBuilder sb = new StringBuilder();
                sb.append(strM30911);
                sb.append(" (");
                strM30911 = C12441.m30911(iIntValue, MotionUtils.EASING_TYPE_FORMAT_END, sb);
            }
            String str2 = strM30911;
            C1693 c1693M13809 = c4979.m13809();
            int iM13810 = c4979.m13810();
            C7648 c7648M13809 = c4979.m13808();
            C7648 c7648M138010 = c4979.m13808();
            int i7 = c7648M138010.f25246;
            int iMin = (i7 <= 0 || (i2 = c7648M138010.f25253) <= 0) ? -1 : Math.min(i7, i2);
            arrayList4.add(new C3194(c1693M13809, iM13810, c7648M13809, str2, iMin > 0 ? iMin + "P" : c15763.m37507(c7648M138010)));
            i3++;
            i = 1;
        }
        return C0561.unmodifiableList(arrayList4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14395 m29939(C14395 c14395, C3194 c3194) {
        return c14395.mo5308().mo34363(2, false).mo34362(2).mo34365(new C5927(c3194.m9612().m5615(), AbstractC22433.of((Object) Integer.valueOf(c3194.m9608())))).mo34361();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m29936(List list, C14395 c14395) {
        AbstractC0477 it = c14395.f47176.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                return 0;
            }
            C5927 c5927 = (C5927) it.next();
            C17216 c17216 = c5927.f20187;
            AbstractC22433 abstractC22433 = c5927.f20188;
            if (c17216.f54866 == 2 && abstractC22433.size() == 1) {
                int iIntValue = ((Integer) abstractC22433.get(0)).intValue();
                for (int i = 0; i < list.size(); i++) {
                    C3194 c3194 = (C3194) list.get(i);
                    if (c3194.m9608() == iIntValue && c3194.m9612().m5615().equals(c5927.f20187)) {
                        return i + 1;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m29937(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).trim().toLowerCase(Locale.ROOT);
            map.put(lowerCase, Integer.valueOf(((Integer) C9735.getOrDefault(map, lowerCase, 0)).intValue() + 1));
        }
        return map;
    }
}
