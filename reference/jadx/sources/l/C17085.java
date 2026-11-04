package l;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.DocumentsContract;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import bin.mt.plus.Main;
import com.umeng.analytics.pro.am;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܺ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9S8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17085 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f55774 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f55775;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final List f55776;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final List f55777;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C17930 f55778;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Iterable f55779;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ArrayList f55780;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static synchronized void m40235() {
        String string;
        synchronized (C17085.class) {
            string = m40224(f55780).toString();
        }
        C21576.f68931.edit().putString("utsd", string).putString("utsd_h", m40224(f55775).toString()).apply();
    }

    static {
        ArrayList arrayList = new ArrayList();
        f55780 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f55775 = arrayList2;
        f55776 = C4681.unmodifiableList(arrayList);
        f55777 = C4681.unmodifiableList(arrayList2);
        f55779 = C16625.m39329(arrayList, arrayList2);
        f55778 = new C17930();
        String string = C21576.f68931.getString("utsd", null);
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C25291(Uri.parse(jSONObject.getString(am.av)), jSONObject.getString("b"), jSONObject.getString(am.aF)));
                }
            } catch (JSONParseException unused) {
            }
        }
        String string2 = C21576.f68931.getString("utsd_h", null);
        if (string2 != null) {
            try {
                JSONArray jSONArray2 = new JSONArray(string2);
                ArrayList arrayList3 = f55775;
                C17359.requireNonNull(arrayList3);
                int size2 = jSONArray2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    arrayList3.add(new C25291(Uri.parse(jSONObject2.getString(am.av)), jSONObject2.getString("b"), jSONObject2.getString(am.aF)));
                }
            } catch (JSONParseException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m40224(List list) {
        JSONArray jSONArray = new JSONArray();
        synchronized (C17085.class) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C25291 c25291 = (C25291) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(am.av, c25291.f81685.toString());
                jSONObject.put("b", c25291.f81684);
                jSONObject.put(am.aF, c25291.f81686);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40231(Main main, C14296 c14296) {
        f55778.m40350(main, c14296);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static List m40236() {
        return f55776;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static List m40241() {
        return f55777;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Iterable m40233() {
        return f55779;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C25291 m40238(String str) {
        for (C25291 c25291 : f55779) {
            if (c25291.f81685.getAuthority().endsWith(".MTDataFilesProvider") && m40237(c25291.f81685).equals(str)) {
                return c25291;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m40237(Uri uri) {
        return C1402.m5124(20, 0, uri.getAuthority());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25291 m40226(String str) {
        synchronized (C17085.class) {
            for (C25291 c25291 : f55779) {
                if (c25291.f81684.equals(str)) {
                    return c25291;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C25291 m40234(String str) {
        synchronized (C17085.class) {
            for (C25291 c25291 : f55780) {
                if (c25291.f81684.equals(str)) {
                    return c25291;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40230(Uri uri) {
        String description;
        if (C1080.m4062(uri)) {
            C21576.m49091().takePersistableUriPermission(uri, 3);
            CRC32 crc32 = new CRC32();
            crc32.update(uri.toString().getBytes(StandardCharsets.UTF_8));
            int i = 0;
            StringBuilder sb = new StringBuilder(String.format("%08X", Long.valueOf(crc32.getValue())));
            sb.insert(4, '-');
            String string = sb.toString();
            if (m40234(string) != null) {
                return;
            }
            if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                String strM40237 = m40237(uri);
                try {
                    PackageManager packageManagerM49081 = C21576.m49081();
                    description = packageManagerM49081.getPackageInfo(strM40237, 0).applicationInfo.loadLabel(packageManagerM49081).toString();
                } catch (Exception unused) {
                    description = null;
                }
            } else {
                description = null;
            }
            if (description == null) {
                String string2 = uri.toString();
                if (string2.startsWith("content://com.termux") && string2.endsWith("home")) {
                    description = "Termux Home";
                }
            }
            if (description == null) {
                description = AbstractC17096.m40259(C21576.m49084(), uri).mo40260();
            }
            if (description == null) {
                description = C23053.m51954(uri);
            }
            if (Build.VERSION.SDK_INT >= 24 && description.length() == 9 && description.charAt(4) == '-') {
                Object systemService = C21576.m49084().getSystemService("storage");
                if (systemService instanceof StorageManager) {
                    try {
                        Iterator<StorageVolume> it = ((StorageManager) systemService).getStorageVolumes().iterator();
                        while (it.hasNext()) {
                            StorageVolume storageVolumeM27332 = C10732.m27332((Object) it.next());
                            if (description.equals(storageVolumeM27332.getUuid())) {
                                description = storageVolumeM27332.getDescription(C21576.m49084());
                                break;
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            synchronized (C17085.class) {
                f55780.add(new C25291(uri, string, description));
                C1170.removeIf(f55775, new C11864(i, string));
            }
            m40235();
            f55778.mo40348(f55776);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m40239() {
        m40235();
        f55778.mo40348(f55776);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40229(int i, int i2) {
        synchronized (C17085.class) {
            C9911.m25734(i, i2, f55780);
        }
        C5261.m15836(new RunnableC13814(1), C17085.class, 500L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40228(int i) {
        synchronized (C17085.class) {
            ((C25291) f55780.remove(i)).m56472();
        }
        C5261.m15836(new RunnableC13814(1), C17085.class, 500L);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m40240(int i) {
        synchronized (C17085.class) {
            f55775.add((C25291) f55780.remove(i));
        }
        C5261.m15836(new RunnableC13814(1), C17085.class, 500L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40232(Set set) {
        synchronized (C17085.class) {
            Iterator it = f55779.iterator();
            while (it.hasNext()) {
                C25291 c25291 = (C25291) it.next();
                if (set.contains(c25291.f81684)) {
                    c25291.m56472();
                    it.remove();
                }
            }
        }
        m40235();
        f55778.mo40348(f55776);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2170 m40225(File file) {
        String[] strArr;
        String strSubstring;
        String strSubstring2;
        String path = file.getPath();
        int i = C24276.f78588;
        if (AbstractC21292.f67895.m48533("/storage/", path)) {
            int iIndexOf = path.indexOf(47, 9);
            if (iIndexOf == 18) {
                strSubstring2 = path.substring(9, 18);
                strSubstring = path.substring(19);
            } else if (iIndexOf == -1) {
                strSubstring2 = path.substring(9);
                strSubstring = "";
            } else {
                strSubstring = null;
                strSubstring2 = null;
            }
            if (strSubstring2 != null && strSubstring2.length() == 9 && strSubstring2.charAt(4) == '-') {
                strArr = new String[]{strSubstring2, strSubstring};
            } else {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr == null) {
            return null;
        }
        String str = strArr[0];
        String str2 = strArr[1];
        synchronized (C17085.class) {
            for (C25291 c25291 : f55779) {
                if (c25291.f81684.equals(str)) {
                    Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(c25291.f81685, c25291.m56470(str2, true));
                    if (uriBuildDocumentUriUsingTree.getAuthority().endsWith(".MTDataFilesProvider")) {
                        return new C0678(file, uriBuildDocumentUriUsingTree, c25291);
                    }
                    return new C2170(file, uriBuildDocumentUriUsingTree, c25291);
                }
            }
            return null;
        }
    }
}
