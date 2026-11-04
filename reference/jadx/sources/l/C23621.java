package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩹ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1V9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23621 extends AbstractC21976 implements InterfaceC5656 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f76660;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final TreeSet f76661;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C3483 f76662;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f76663 = new HashSet();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f76664;

    public C23621(C24367 c24367, C3483 c3483, InterfaceC4787 interfaceC4787) {
        TreeSet<String> treeSet = new TreeSet();
        this.f76661 = treeSet;
        this.f76664 = new HashMap();
        this.f76660 = new HashMap();
        this.f76662 = c3483;
        c24367.m54474(new C16161(this, interfaceC4787));
        ArrayList<C17653> arrayList = new ArrayList(treeSet.size());
        for (String str : treeSet) {
            C17653 c17653 = new C17653();
            c17653.f58028 = -1;
            c17653.f58032 = -1;
            c17653.f58029 = str;
            c17653.f58030 = str;
            arrayList.add(c17653);
        }
        int i = 0;
        while (true) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C17653 c17654 = (C17653) arrayList.get(i2);
                String str2 = c17654.f58030;
                if (i < 0) {
                    throw new IllegalArgumentException();
                }
                int i3 = 0;
                int iIndexOf = 0;
                while (true) {
                    if (i3 >= i) {
                        int iIndexOf2 = str2.indexOf(47, iIndexOf + 1);
                        iIndexOf2 = iIndexOf2 == -1 ? str2.length() : iIndexOf2;
                        c17654.f58028 = iIndexOf;
                        c17654.f58032 = iIndexOf2;
                        c17654.f58031 = str2.substring(iIndexOf, iIndexOf2);
                        c17654.f58033 = str2.substring(0, iIndexOf);
                        break;
                    }
                    iIndexOf = str2.indexOf(47, iIndexOf) + 1;
                    if (iIndexOf == 0) {
                        c17654.f58032 = -1;
                        c17654.f58028 = -1;
                        c17654.f58031 = null;
                        c17654.f58033 = str2;
                        break;
                    }
                    i3++;
                }
            }
            i++;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C17653 c17655 : arrayList) {
                String str3 = c17655.f58031;
                if (str3 != null) {
                    String strM23910 = C8947.m23910(new StringBuilder(), c17655.f58033, str3);
                    List arrayList2 = (List) linkedHashMap.get(strM23910);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strM23910, arrayList2);
                    }
                    arrayList2.add(c17655);
                }
            }
            Collection<List> collectionValues = linkedHashMap.values();
            if (collectionValues.isEmpty()) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    C17653 c17656 = (C17653) arrayList.get(i4);
                    if (c3483.m11444(c17656.f58030)) {
                        c17656.f58028 = 0;
                        c17656.m41311(m52865("pkg/"), false);
                    }
                }
                for (C17653 c17657 : arrayList) {
                    this.f76660.put(c17657.f58029, c17657.f58030);
                }
                return;
            }
            for (List<C17653> list : collectionValues) {
                C17653 c17658 = (C17653) list.get(0);
                if (c3483.m11445(c17658.f58031)) {
                    String strM52865 = m52865(c17658.f58033);
                    for (C17653 c17659 : list) {
                        c17659.m41311(strM52865, true);
                        this.f76663.add(c17659.f58030);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC21976, l.InterfaceC5656
    /* JADX INFO: renamed from: ۙ */
    public final void mo9647(C21383 c21383) {
        String strM23832 = C8923.m23832(c21383);
        if (strM23832 == null) {
            throw new IllegalStateException();
        }
        int iLastIndexOf = strM23832.lastIndexOf(47);
        String strSubstring = iLastIndexOf == -1 ? "" : strM23832.substring(0, iLastIndexOf);
        String strConcat = (String) this.f76660.get(strSubstring);
        if (strConcat != null) {
            if (strSubstring.isEmpty()) {
                strConcat = strConcat.concat("/");
            }
            StringBuilder sbM27333 = C10732.m27333(strConcat);
            sbM27333.append(strM23832.substring(strSubstring.length()));
            c21383.mo13503((Object) sbM27333.toString());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private String m52865(String str) {
        String string;
        HashSet hashSet;
        HashMap map = this.f76664;
        AbstractC20769 abstractC20769M47518 = (AbstractC20769) map.get(str);
        if (abstractC20769M47518 == null) {
            abstractC20769M47518 = AbstractC20769.m47518();
            map.put(str, abstractC20769M47518);
        }
        do {
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append(abstractC20769M47518.mo22086());
            string = sbM27333.toString();
            hashSet = this.f76663;
        } while (hashSet.contains(string));
        hashSet.add(string);
        return string;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m52867(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf);
    }
}
