package l;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۢ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C9240 {
    public static final ConcurrentMapC13783 a = new ConcurrentMapC13783(16, 0.75f, 2);
    public static final C23826 b = new C23826();
    public static final C9240 c = new C9240();

    public String c(InterfaceC11002 interfaceC11002, long j, EnumC4069 enumC4069, Locale locale) {
        Object objA = a(interfaceC11002, locale);
        if (objA instanceof C14179) {
            return ((C14179) objA).a(j, enumC4069);
        }
        return null;
    }

    public String b(InterfaceC21233 interfaceC21233, InterfaceC11002 interfaceC11002, long j, EnumC4069 enumC4069, Locale locale) {
        if (interfaceC21233 == C7122.c || !(interfaceC11002 instanceof EnumC18762)) {
            return c(interfaceC11002, j, enumC4069, locale);
        }
        return null;
    }

    public Iterator e(InterfaceC11002 interfaceC11002, EnumC4069 enumC4069, Locale locale) {
        List list;
        Object objA = a(interfaceC11002, locale);
        if (!(objA instanceof C14179) || (list = (List) ((HashMap) ((C14179) objA).b).get(enumC4069)) == null) {
            return null;
        }
        return list.iterator();
    }

    public Iterator d(InterfaceC21233 interfaceC21233, InterfaceC11002 interfaceC11002, EnumC4069 enumC4069, Locale locale) {
        if (interfaceC21233 == C7122.c || !(interfaceC11002 instanceof EnumC18762)) {
            return e(interfaceC11002, enumC4069, locale);
        }
        return null;
    }

    public static Object a(InterfaceC11002 interfaceC11002, Locale locale) {
        Object c14179;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(interfaceC11002, locale);
        ConcurrentMapC13783 concurrentMapC13783 = a;
        V v = concurrentMapC13783.get(simpleImmutableEntry);
        if (v != 0) {
            return v;
        }
        HashMap map = new HashMap();
        if (interfaceC11002 == EnumC18762.ERA) {
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
                map.put(EnumC4069.FULL, map2);
                map.put(EnumC4069.SHORT, map2);
                map.put(EnumC4069.NARROW, map3);
            }
            c14179 = new C14179(map);
        } else if (interfaceC11002 == EnumC18762.MONTH_OF_YEAR) {
            int length = DateFormatSymbols.getInstance(locale).getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (long j2 = 1; j2 <= length; j2++) {
                String strI = AbstractC14884.i(j2, "LLLL", locale);
                linkedHashMap.put(Long.valueOf(j2), strI);
                linkedHashMap2.put(Long.valueOf(j2), strI.substring(0, Character.charCount(strI.codePointAt(0))));
                linkedHashMap3.put(Long.valueOf(j2), AbstractC14884.i(j2, "LLL", locale));
            }
            if (length > 0) {
                map.put(EnumC4069.FULL_STANDALONE, linkedHashMap);
                map.put(EnumC4069.NARROW_STANDALONE, linkedHashMap2);
                map.put(EnumC4069.SHORT_STANDALONE, linkedHashMap3);
                map.put(EnumC4069.FULL, linkedHashMap);
                map.put(EnumC4069.NARROW, linkedHashMap2);
                map.put(EnumC4069.SHORT, linkedHashMap3);
            }
            c14179 = new C14179(map);
        } else if (interfaceC11002 == EnumC18762.DAY_OF_WEEK) {
            int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
            for (long j3 = 1; j3 <= length2; j3++) {
                String strH = AbstractC14884.h(j3, "cccc", locale);
                linkedHashMap4.put(Long.valueOf(j3), strH);
                Long lValueOf2 = Long.valueOf(j3);
                if (!z) {
                    strSubstring = strH.substring(0, Character.charCount(strH.codePointAt(0)));
                } else {
                    strSubstring = new StringBuilder().appendCodePoint(strH.codePointBefore(strH.length())).toString();
                }
                linkedHashMap5.put(lValueOf2, strSubstring);
                linkedHashMap6.put(Long.valueOf(j3), AbstractC14884.h(j3, "ccc", locale));
            }
            if (length2 > 0) {
                map.put(EnumC4069.FULL_STANDALONE, linkedHashMap4);
                map.put(EnumC4069.NARROW_STANDALONE, linkedHashMap5);
                map.put(EnumC4069.SHORT_STANDALONE, linkedHashMap6);
                map.put(EnumC4069.FULL, linkedHashMap4);
                map.put(EnumC4069.NARROW, linkedHashMap5);
                map.put(EnumC4069.SHORT, linkedHashMap6);
            }
            c14179 = new C14179(map);
        } else if (interfaceC11002 == EnumC18762.AMPM_OF_DAY) {
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
                map.put(EnumC4069.FULL, map4);
                map.put(EnumC4069.SHORT, map4);
                map.put(EnumC4069.NARROW, map5);
            }
            c14179 = new C14179(map);
        } else {
            c14179 = "";
        }
        concurrentMapC13783.putIfAbsent(simpleImmutableEntry, c14179);
        return concurrentMapC13783.get(simpleImmutableEntry);
    }
}
