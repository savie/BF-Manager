package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܽ۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 86KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16519 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f53063;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f53064;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f53065;

    public C16519(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.f53064 = C0561.unmodifiableList(arrayList);
        this.f53063 = C0561.unmodifiableList(arrayList2);
        this.f53065 = z;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02f3  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16519 m38851(Collection collection, ArrayList arrayList) throws C20047 {
        String string;
        ArrayList arrayList2 = arrayList;
        TreeMap treeMap = new TreeMap();
        ArrayList<C7346> arrayList3 = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C15814 c15814 = (C15814) arrayList2.get(i2);
            if (c15814.f51174 == EnumC0290.ADD) {
                for (String str : c15814.f51180.keySet()) {
                    m38854(i2, str);
                    m38855(treeMap, str, i2);
                }
            } else {
                m38854(i2, c15814.f51176);
                m38855(treeMap, c15814.f51176, i2);
                if (c15814.f51176.endsWith("/")) {
                    arrayList3.add(new C7346(c15814.f51176, i2));
                }
                if (c15814.f51174 == EnumC0290.RENAME) {
                    m38854(i2, c15814.f51178);
                    if (c15814.f51176.endsWith("/") != c15814.f51178.endsWith("/")) {
                        throw m38853("ZIP_ENTRY_TYPE_MISMATCH", "Renaming must preserve the trailing slash entry type.", new String[]{c15814.f51176, c15814.f51178}, i2);
                    }
                    m38855(treeMap, c15814.f51178, i2);
                    if (c15814.f51178.endsWith("/")) {
                        arrayList3.add(new C7346(c15814.f51178, i2));
                    }
                } else {
                    continue;
                }
            }
        }
        for (C7346 c7346 : arrayList3) {
            String str2 = c7346.f24403;
            for (Map.Entry entry : treeMap.tailMap(str2).entrySet()) {
                if (!((String) entry.getKey()).startsWith(str2)) {
                    break;
                }
                int iIntValue = ((Integer) entry.getValue()).intValue();
                int i3 = c7346.f24402;
                if (iIntValue != i3) {
                    throw m38852(i3, new String[]{str2, (String) entry.getKey()}, ((Integer) entry.getValue()).intValue());
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C12107 c12107Clone = (C12107) it.next();
            linkedHashMap.put(c12107Clone.getName(), c12107Clone);
            if (c12107Clone.isDirectory()) {
                c12107Clone = c12107Clone.clone();
            }
            arrayList4.add(c12107Clone);
        }
        C1044 c1044 = new C1044(arrayList4);
        TreeMap treeMap2 = new TreeMap(linkedHashMap);
        HashMap map = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        while (i < arrayList.size()) {
            C15814 c15815 = (C15814) arrayList2.get(i);
            if (c15815.f51174 == EnumC0290.ADD) {
                for (Map.Entry entry2 : c15815.f51180.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (!str3.endsWith("/")) {
                        C12107 c12107 = (C12107) linkedHashMap.get(str3);
                        if (c12107 != null) {
                            if (!c15815.f51175) {
                                throw m38853("ZIP_ENTRY_ALREADY_EXISTS", "Adding this entry requires overwrite=true.", new String[]{str3}, i);
                            }
                            map.put(str3, new C20752(c12107, null));
                        }
                    } else if (linkedHashMap.containsKey(str3)) {
                    }
                    arrayList5.add(new C10169(i, str3, entry2.getValue()));
                }
            } else {
                String str4 = c15815.f51176;
                boolean zEndsWith = str4.endsWith("/");
                if (!linkedHashMap.containsKey(str4) && (!zEndsWith || (!linkedHashMap.containsKey(str4) && c1044.m25250(str4) == null))) {
                    throw m38853("ZIP_ENTRY_NOT_FOUND", "The source entry does not exist in the original ZIP.", new String[]{str4}, i);
                }
                if (c15815.f51174 != EnumC0290.DELETE) {
                    String str5 = c15815.f51176;
                    String str6 = c15815.f51178;
                    if (str5.equals(str6)) {
                        continue;
                    } else {
                        boolean zEndsWith2 = str5.endsWith("/");
                        if (zEndsWith2 && str6.startsWith(str5)) {
                            throw m38853("ZIP_OPERATION_CONFLICT", "A directory cannot be moved into its own subtree.", new String[]{str5, str6}, i);
                        }
                        if (zEndsWith2 && ((linkedHashMap.containsKey(str6) || c1044.m25250(str6) != null) && !c15815.f51179)) {
                            throw m38853("ZIP_ENTRY_ALREADY_EXISTS", "An existing target directory requires mergeDirectories=true.", new String[]{str5, str6}, i);
                        }
                        for (C12107 c12108 : m38850(str5, treeMap2)) {
                            if (zEndsWith2) {
                                StringBuilder sbM23356 = C9023.m23356(str6);
                                sbM23356.append(c12108.getName().substring(str5.length()));
                                string = sbM23356.toString();
                            } else {
                                string = str6;
                            }
                            if (((C12107) linkedHashMap.get(string)) == null) {
                                map.put(c12108.getName(), new C20752(c12108, string));
                            } else {
                                if (!c12108.isDirectory()) {
                                    throw m38853("ZIP_ENTRY_ALREADY_EXISTS", "The renamed entry collides with an original ZIP entry.", new String[]{c12108.getName(), string}, i);
                                }
                                if (string.startsWith(str5)) {
                                    map.put(c12108.getName(), new C20752(c12108, string));
                                } else {
                                    map.put(c12108.getName(), new C20752(c12108, null));
                                }
                            }
                        }
                    }
                } else {
                    if (zEndsWith && !c15815.f51177 && !c1044.m25252(str4).isEmpty()) {
                        throw m38853("ZIP_DIRECTORY_NOT_EMPTY", "Deleting a nonempty directory requires recursive=true.", new String[]{str4}, i);
                    }
                    for (C12107 c12109 : m38850(str4, treeMap2)) {
                        map.put(c12109.getName(), new C20752(c12109, null));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList6 = new ArrayList(linkedHashMap.size());
        boolean z = !arrayList5.isEmpty();
        for (C12107 c121010 : linkedHashMap.values()) {
            C20752 c20752 = (C20752) map.get(c121010.getName());
            if (c20752 == null) {
                arrayList6.add(new C20752(c121010, c121010.getName()));
            } else {
                String str7 = c20752.f67512;
                z |= !c121010.getName().equals(str7);
                if (str7 != null) {
                    arrayList6.add(c20752);
                }
            }
        }
        return new C16519(arrayList6, arrayList5, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38855(TreeMap treeMap, String str, int i) throws C20047 {
        Integer num = (Integer) treeMap.put(str, Integer.valueOf(i));
        if (num != null && num.intValue() != i) {
            throw m38852(num.intValue(), new String[]{str}, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38854(int i, String str) throws C20047 {
        if (str == null || str.isEmpty()) {
            if (str == null) {
                str = "";
            }
            throw m38853("ZIP_INVALID_ENTRY_PATH", "An update entry path must not be empty.", new String[]{str}, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m38850(String str, TreeMap treeMap) {
        if (!str.endsWith("/")) {
            return Collections.singletonList((C12107) treeMap.get(str));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.tailMap(str).entrySet()) {
            if (!((String) entry.getKey()).startsWith(str)) {
                break;
            }
            arrayList.add((C12107) entry.getValue());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20047 m38853(String str, String str2, String[] strArr, int i) {
        return new C20047(str, str2, Collections.singletonList(Integer.valueOf(i)), Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20047 m38852(int i, String[] strArr, int i2) {
        return new C20047("ZIP_OPERATION_CONFLICT", "Operations touch the same entry or directory range.", Arrays.asList(Integer.valueOf(Math.min(i, i2)), Integer.valueOf(Math.max(i, i2))), Arrays.asList(strArr));
    }
}
