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

/* JADX INFO: renamed from: l.ۜᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7314 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f24090;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f24091;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f24092;

    public C7314(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.f24091 = C4681.unmodifiableList(arrayList);
        this.f24090 = C4681.unmodifiableList(arrayList2);
        this.f24092 = z;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02f3  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7314 m20055(Collection collection, ArrayList arrayList) throws C2839 {
        String string;
        ArrayList arrayList2 = arrayList;
        TreeMap treeMap = new TreeMap();
        ArrayList<C10296> arrayList3 = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C9550 c9550 = (C9550) arrayList2.get(i2);
            if (c9550.f30914 == EnumC8805.ADD) {
                for (String str : c9550.f30915.keySet()) {
                    m20056(i2, str);
                    m20057(treeMap, str, i2);
                }
            } else {
                m20056(i2, c9550.f30912);
                m20057(treeMap, c9550.f30912, i2);
                if (c9550.f30912.endsWith("/")) {
                    arrayList3.add(new C10296(c9550.f30912, i2));
                }
                if (c9550.f30914 == EnumC8805.RENAME) {
                    m20056(i2, c9550.f30913);
                    if (c9550.f30912.endsWith("/") != c9550.f30913.endsWith("/")) {
                        throw m20054("ZIP_ENTRY_TYPE_MISMATCH", "Renaming must preserve the trailing slash entry type.", new String[]{c9550.f30912, c9550.f30913}, i2);
                    }
                    m20057(treeMap, c9550.f30913, i2);
                    if (c9550.f30913.endsWith("/")) {
                        arrayList3.add(new C10296(c9550.f30913, i2));
                    }
                } else {
                    continue;
                }
            }
        }
        for (C10296 c10296 : arrayList3) {
            String str2 = c10296.f32874;
            for (Map.Entry entry : treeMap.tailMap(str2).entrySet()) {
                if (!((String) entry.getKey()).startsWith(str2)) {
                    break;
                }
                int iIntValue = ((Integer) entry.getValue()).intValue();
                int i3 = c10296.f32873;
                if (iIntValue != i3) {
                    throw m20053(i3, new String[]{str2, (String) entry.getKey()}, ((Integer) entry.getValue()).intValue());
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C8002 c8002Clone = (C8002) it.next();
            linkedHashMap.put(c8002Clone.getName(), c8002Clone);
            if (c8002Clone.isDirectory()) {
                c8002Clone = c8002Clone.clone();
            }
            arrayList4.add(c8002Clone);
        }
        C13244 c13244 = new C13244(arrayList4);
        TreeMap treeMap2 = new TreeMap(linkedHashMap);
        HashMap map = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        while (i < arrayList.size()) {
            C9550 c9551 = (C9550) arrayList2.get(i);
            if (c9551.f30914 == EnumC8805.ADD) {
                for (Map.Entry entry2 : c9551.f30915.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (!str3.endsWith("/")) {
                        C8002 c8002 = (C8002) linkedHashMap.get(str3);
                        if (c8002 != null) {
                            if (!c9551.f30918) {
                                throw m20054("ZIP_ENTRY_ALREADY_EXISTS", "Adding this entry requires overwrite=true.", new String[]{str3}, i);
                            }
                            map.put(str3, new C1348(c8002, null));
                        }
                    } else if (linkedHashMap.containsKey(str3)) {
                    }
                    arrayList5.add(new C19247(i, str3, entry2.getValue()));
                }
            } else {
                String str4 = c9551.f30912;
                boolean zEndsWith = str4.endsWith("/");
                if (!linkedHashMap.containsKey(str4) && (!zEndsWith || (!linkedHashMap.containsKey(str4) && c13244.m18364(str4) == null))) {
                    throw m20054("ZIP_ENTRY_NOT_FOUND", "The source entry does not exist in the original ZIP.", new String[]{str4}, i);
                }
                if (c9551.f30914 != EnumC8805.DELETE) {
                    String str5 = c9551.f30912;
                    String str6 = c9551.f30913;
                    if (str5.equals(str6)) {
                        continue;
                    } else {
                        boolean zEndsWith2 = str5.endsWith("/");
                        if (zEndsWith2 && str6.startsWith(str5)) {
                            throw m20054("ZIP_OPERATION_CONFLICT", "A directory cannot be moved into its own subtree.", new String[]{str5, str6}, i);
                        }
                        if (zEndsWith2 && ((linkedHashMap.containsKey(str6) || c13244.m18364(str6) != null) && !c9551.f30917)) {
                            throw m20054("ZIP_ENTRY_ALREADY_EXISTS", "An existing target directory requires mergeDirectories=true.", new String[]{str5, str6}, i);
                        }
                        for (C8002 c8003 : m20052(str5, treeMap2)) {
                            if (zEndsWith2) {
                                StringBuilder sbM27333 = C10732.m27333(str6);
                                sbM27333.append(c8003.getName().substring(str5.length()));
                                string = sbM27333.toString();
                            } else {
                                string = str6;
                            }
                            if (((C8002) linkedHashMap.get(string)) == null) {
                                map.put(c8003.getName(), new C1348(c8003, string));
                            } else {
                                if (!c8003.isDirectory()) {
                                    throw m20054("ZIP_ENTRY_ALREADY_EXISTS", "The renamed entry collides with an original ZIP entry.", new String[]{c8003.getName(), string}, i);
                                }
                                if (string.startsWith(str5)) {
                                    map.put(c8003.getName(), new C1348(c8003, string));
                                } else {
                                    map.put(c8003.getName(), new C1348(c8003, null));
                                }
                            }
                        }
                    }
                } else {
                    if (zEndsWith && !c9551.f30916 && !c13244.m18371(str4).isEmpty()) {
                        throw m20054("ZIP_DIRECTORY_NOT_EMPTY", "Deleting a nonempty directory requires recursive=true.", new String[]{str4}, i);
                    }
                    for (C8002 c8004 : m20052(str4, treeMap2)) {
                        map.put(c8004.getName(), new C1348(c8004, null));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList6 = new ArrayList(linkedHashMap.size());
        boolean z = !arrayList5.isEmpty();
        for (C8002 c8005 : linkedHashMap.values()) {
            C1348 c1348 = (C1348) map.get(c8005.getName());
            if (c1348 == null) {
                arrayList6.add(new C1348(c8005, c8005.getName()));
            } else {
                String str7 = c1348.f4815;
                z |= !c8005.getName().equals(str7);
                if (str7 != null) {
                    arrayList6.add(c1348);
                }
            }
        }
        return new C7314(arrayList6, arrayList5, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20057(TreeMap treeMap, String str, int i) throws C2839 {
        Integer num = (Integer) treeMap.put(str, Integer.valueOf(i));
        if (num != null && num.intValue() != i) {
            throw m20053(num.intValue(), new String[]{str}, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20056(int i, String str) throws C2839 {
        if (str == null || str.isEmpty()) {
            if (str == null) {
                str = "";
            }
            throw m20054("ZIP_INVALID_ENTRY_PATH", "An update entry path must not be empty.", new String[]{str}, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m20052(String str, TreeMap treeMap) {
        if (!str.endsWith("/")) {
            return Collections.singletonList((C8002) treeMap.get(str));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.tailMap(str).entrySet()) {
            if (!((String) entry.getKey()).startsWith(str)) {
                break;
            }
            arrayList.add((C8002) entry.getValue());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2839 m20054(String str, String str2, String[] strArr, int i) {
        return new C2839(str, str2, Collections.singletonList(Integer.valueOf(i)), Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2839 m20053(int i, String[] strArr, int i2) {
        return new C2839("ZIP_OPERATION_CONFLICT", "Operations touch the same entry or directory range.", Arrays.asList(Integer.valueOf(Math.min(i, i2)), Integer.valueOf(Math.max(i, i2))), Arrays.asList(strArr));
    }
}
