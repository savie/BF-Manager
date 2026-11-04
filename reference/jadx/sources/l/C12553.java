package l;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C12553 {
    public static final ConcurrentMapC17249 a = new ConcurrentMapC17249(16, 0.75f, 2);
    public static final C23610 b = new C23610();
    public static final C12553 c = new C12553();

    public String c(InterfaceC16831 interfaceC16831, long j, EnumC10315 enumC10315, Locale locale) {
        Object objA = a(interfaceC16831, locale);
        if (objA instanceof C3604) {
            return ((C3604) objA).a(j, enumC10315);
        }
        return null;
    }

    public String b(InterfaceC8912 interfaceC8912, InterfaceC16831 interfaceC16831, long j, EnumC10315 enumC10315, Locale locale) {
        if (interfaceC8912 == C20012.c || !(interfaceC16831 instanceof EnumC8692)) {
            return c(interfaceC16831, j, enumC10315, locale);
        }
        return null;
    }

    public Iterator e(InterfaceC16831 interfaceC16831, EnumC10315 enumC10315, Locale locale) {
        List list;
        Object objA = a(interfaceC16831, locale);
        if (!(objA instanceof C3604) || (list = (List) ((HashMap) ((C3604) objA).b).get(enumC10315)) == null) {
            return null;
        }
        return list.iterator();
    }

    public Iterator d(InterfaceC8912 interfaceC8912, InterfaceC16831 interfaceC16831, EnumC10315 enumC10315, Locale locale) {
        if (interfaceC8912 == C20012.c || !(interfaceC16831 instanceof EnumC8692)) {
            return e(interfaceC16831, enumC10315, locale);
        }
        return null;
    }

    public static Object a(InterfaceC16831 interfaceC16831, Locale locale) {
        Object c3604;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(interfaceC16831, locale);
        ConcurrentMapC17249 concurrentMapC17249 = a;
        V v = concurrentMapC17249.get(simpleImmutableEntry);
        if (v != 0) {
            return v;
        }
        HashMap map = new HashMap();
        if (interfaceC16831 == EnumC8692.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i = 0; i < eras.length; i++) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    map2.put(Long.valueOf(j), eras[i]);
                    Long lValueOf = Long.valueOf(j);
                    String str = eras[i];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(EnumC10315.FULL, map2);
                map.put(EnumC10315.SHORT, map2);
                map.put(EnumC10315.NARROW, map3);
            }
            c3604 = new C3604(map);
        } else if (interfaceC16831 == EnumC8692.MONTH_OF_YEAR) {
            int length = DateFormatSymbols.getInstance(locale).getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (long j2 = 1; j2 <= length; j2++) {
                String strI = AbstractC2946.i(j2, "LLLL", locale);
                linkedHashMap.put(Long.valueOf(j2), strI);
                linkedHashMap2.put(Long.valueOf(j2), strI.substring(0, Character.charCount(strI.codePointAt(0))));
                linkedHashMap3.put(Long.valueOf(j2), AbstractC2946.i(j2, "LLL", locale));
            }
            if (length > 0) {
                map.put(EnumC10315.FULL_STANDALONE, linkedHashMap);
                map.put(EnumC10315.NARROW_STANDALONE, linkedHashMap2);
                map.put(EnumC10315.SHORT_STANDALONE, linkedHashMap3);
                map.put(EnumC10315.FULL, linkedHashMap);
                map.put(EnumC10315.NARROW, linkedHashMap2);
                map.put(EnumC10315.SHORT, linkedHashMap3);
            }
            c3604 = new C3604(map);
        } else if (interfaceC16831 == EnumC8692.DAY_OF_WEEK) {
            int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
            for (long j3 = 1; j3 <= length2; j3++) {
                String strH = AbstractC2946.h(j3, "cccc", locale);
                linkedHashMap4.put(Long.valueOf(j3), strH);
                Long lValueOf2 = Long.valueOf(j3);
                if (!z) {
                    strSubstring = strH.substring(0, Character.charCount(strH.codePointAt(0)));
                } else {
                    strSubstring = new StringBuilder().appendCodePoint(strH.codePointBefore(strH.length())).toString();
                }
                linkedHashMap5.put(lValueOf2, strSubstring);
                linkedHashMap6.put(Long.valueOf(j3), AbstractC2946.h(j3, "ccc", locale));
            }
            if (length2 > 0) {
                map.put(EnumC10315.FULL_STANDALONE, linkedHashMap4);
                map.put(EnumC10315.NARROW_STANDALONE, linkedHashMap5);
                map.put(EnumC10315.SHORT_STANDALONE, linkedHashMap6);
                map.put(EnumC10315.FULL, linkedHashMap4);
                map.put(EnumC10315.NARROW, linkedHashMap5);
                map.put(EnumC10315.SHORT, linkedHashMap6);
            }
            c3604 = new C3604(map);
        } else if (interfaceC16831 == EnumC8692.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
            for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                if (!amPmStrings[i2].isEmpty()) {
                    long j4 = i2;
                    map4.put(Long.valueOf(j4), amPmStrings[i2]);
                    Long lValueOf3 = Long.valueOf(j4);
                    String str2 = amPmStrings[i2];
                    map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                }
            }
            if (!map4.isEmpty()) {
                map.put(EnumC10315.FULL, map4);
                map.put(EnumC10315.SHORT, map4);
                map.put(EnumC10315.NARROW, map5);
            }
            c3604 = new C3604(map);
        } else {
            c3604 = "";
        }
        concurrentMapC17249.putIfAbsent(simpleImmutableEntry, c3604);
        return concurrentMapC17249.get(simpleImmutableEntry);
    }
}
