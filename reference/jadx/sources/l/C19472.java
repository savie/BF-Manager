package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩵۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R1V9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19472 extends AbstractC21803 implements InterfaceC23145 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TreeSet f62685;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f62686;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashSet f62687;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f62688;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8889 f62689;

    public C19472(C20178 c20178, C8889 c8889, InterfaceC3183 interfaceC3183) {
        super(2);
        this.f62687 = new HashSet();
        TreeSet<String> treeSet = new TreeSet();
        this.f62685 = treeSet;
        this.f62686 = new HashMap();
        this.f62688 = new HashMap();
        this.f62689 = c8889;
        c20178.m45607(new C8183(this, interfaceC3183));
        ArrayList<C18766> arrayList = new ArrayList(treeSet.size());
        for (String str : treeSet) {
            C18766 c18766 = new C18766();
            c18766.f60839 = -1;
            c18766.f60842 = -1;
            c18766.f60841 = str;
            c18766.f60843 = str;
            arrayList.add(c18766);
        }
        int i = 0;
        while (true) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C18766 c18767 = (C18766) arrayList.get(i2);
                String str2 = c18767.f60843;
                if (i < 0) {
                    throw new IllegalArgumentException();
                }
                int i3 = 0;
                int iIndexOf = 0;
                while (true) {
                    if (i3 >= i) {
                        int iIndexOf2 = str2.indexOf(47, iIndexOf + 1);
                        iIndexOf2 = iIndexOf2 == -1 ? str2.length() : iIndexOf2;
                        c18767.f60839 = iIndexOf;
                        c18767.f60842 = iIndexOf2;
                        c18767.f60840 = str2.substring(iIndexOf, iIndexOf2);
                        c18767.f60838 = str2.substring(0, iIndexOf);
                        break;
                    }
                    iIndexOf = str2.indexOf(47, iIndexOf) + 1;
                    if (iIndexOf == 0) {
                        c18767.f60842 = -1;
                        c18767.f60839 = -1;
                        c18767.f60840 = null;
                        c18767.f60838 = str2;
                        break;
                    }
                    i3++;
                }
            }
            i++;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C18766 c18768 : arrayList) {
                String str3 = c18768.f60840;
                if (str3 != null) {
                    String strM50267 = C22697.m50267(new StringBuilder(), c18768.f60838, str3);
                    List arrayList2 = (List) linkedHashMap.get(strM50267);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strM50267, arrayList2);
                    }
                    arrayList2.add(c18768);
                }
            }
            Collection<List> collectionValues = linkedHashMap.values();
            if (collectionValues.isEmpty()) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    C18766 c18769 = (C18766) arrayList.get(i4);
                    if (c8889.m23036(c18769.f60843)) {
                        c18769.f60839 = 0;
                        c18769.m43328(m44528("pkg/"), false);
                    }
                }
                for (C18766 c187610 : arrayList) {
                    this.f62688.put(c187610.f60841, c187610.f60843);
                }
                return;
            }
            for (List<C18766> list : collectionValues) {
                C18766 c187611 = (C18766) list.get(0);
                if (c8889.m23035(c187611.f60840)) {
                    String strM44528 = m44528(c187611.f60838);
                    for (C18766 c187612 : list) {
                        c187612.m43328(strM44528, true);
                        this.f62687.add(c187612.f60843);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC21803, l.InterfaceC23145
    /* JADX INFO: renamed from: ۙ */
    public final void mo4603(C12417 c12417) {
        String strM8699 = C2892.m8699(c12417);
        if (strM8699 == null) {
            throw new IllegalStateException();
        }
        int iLastIndexOf = strM8699.lastIndexOf(47);
        String strSubstring = iLastIndexOf == -1 ? "" : strM8699.substring(0, iLastIndexOf);
        String strConcat = (String) this.f62688.get(strSubstring);
        if (strConcat != null) {
            if (strSubstring.isEmpty()) {
                strConcat = strConcat.concat("/");
            }
            StringBuilder sbM23356 = C9023.m23356(strConcat);
            sbM23356.append(strM8699.substring(strSubstring.length()));
            c12417.mo2194((Object) sbM23356.toString());
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private String m44528(String str) {
        String string;
        HashSet hashSet;
        HashMap map = this.f62686;
        AbstractC10425 abstractC10425M26322 = (AbstractC10425) map.get(str);
        if (abstractC10425M26322 == null) {
            abstractC10425M26322 = AbstractC10425.m26322();
            map.put(str, abstractC10425M26322);
        }
        do {
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append(abstractC10425M26322.mo15749());
            string = sbM23356.toString();
            hashSet = this.f62687;
        } while (hashSet.contains(string));
        hashSet.add(string);
        return string;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m44530(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf);
    }
}
