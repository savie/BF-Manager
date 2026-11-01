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

/* JADX INFO: renamed from: l.ᩴ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9S8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19001 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final List f61499;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f61500;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f61501 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C9186 f61502;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f61503;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Iterable f61504;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final List f61505;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static synchronized void m43721() {
        String string;
        synchronized (C19001.class) {
            string = m43705(f61500).toString();
        }
        C16737.f53607.edit().putString("utsd", string).putString("utsd_h", m43705(f61503).toString()).apply();
    }

    static {
        ArrayList arrayList = new ArrayList();
        f61500 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f61503 = arrayList2;
        f61499 = C0561.unmodifiableList(arrayList);
        f61505 = C0561.unmodifiableList(arrayList2);
        f61504 = C22808.m50465(arrayList, arrayList2);
        f61502 = new C9186();
        String string = C16737.f53607.getString("utsd", null);
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C18295(Uri.parse(jSONObject.getString(am.av)), jSONObject.getString("b"), jSONObject.getString(am.aF)));
                }
            } catch (JSONParseException unused) {
            }
        }
        String string2 = C16737.f53607.getString("utsd_h", null);
        if (string2 != null) {
            try {
                JSONArray jSONArray2 = new JSONArray(string2);
                ArrayList arrayList3 = f61503;
                C13638.requireNonNull(arrayList3);
                int size2 = jSONArray2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    arrayList3.add(new C18295(Uri.parse(jSONObject2.getString(am.av)), jSONObject2.getString("b"), jSONObject2.getString(am.aF)));
                }
            } catch (JSONParseException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m43705(List list) {
        JSONArray jSONArray = new JSONArray();
        synchronized (C19001.class) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C18295 c18295 = (C18295) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(am.av, c18295.f58380.toString());
                jSONObject.put("b", c18295.f58374);
                jSONObject.put(am.aF, c18295.f58377);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43712(Main main, C10403 c10403) {
        f61502.m44959(main, c10403);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static List m43714() {
        return f61499;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static List m43704() {
        return f61505;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Iterable m43715() {
        return f61504;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C18295 m43718(String str) {
        for (C18295 c18295 : f61504) {
            if (c18295.f58380.getAuthority().endsWith(".MTDataFilesProvider") && m43717(c18295.f58380).equals(str)) {
                return c18295;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m43717(Uri uri) {
        return C20630.m46498(20, 0, uri.getAuthority());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18295 m43706(String str) {
        synchronized (C19001.class) {
            for (C18295 c18295 : f61504) {
                if (c18295.f58374.equals(str)) {
                    return c18295;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C18295 m43716(String str) {
        synchronized (C19001.class) {
            for (C18295 c18295 : f61500) {
                if (c18295.f58374.equals(str)) {
                    return c18295;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43711(Uri uri) {
        String description;
        if (C0216.m1587(uri)) {
            C16737.m39259().takePersistableUriPermission(uri, 3);
            CRC32 crc32 = new CRC32();
            crc32.update(uri.toString().getBytes(StandardCharsets.UTF_8));
            int i = 0;
            StringBuilder sb = new StringBuilder(String.format("%08X", Long.valueOf(crc32.getValue())));
            sb.insert(4, '-');
            String string = sb.toString();
            if (m43716(string) != null) {
                return;
            }
            if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                String strM43717 = m43717(uri);
                try {
                    PackageManager packageManagerM39292 = C16737.m39292();
                    description = packageManagerM39292.getPackageInfo(strM43717, 0).applicationInfo.loadLabel(packageManagerM39292).toString();
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
                description = AbstractC21614.m48324(C16737.m39277(), uri).mo42077();
            }
            if (description == null) {
                description = C22529.m50045(uri);
            }
            if (Build.VERSION.SDK_INT >= 24 && description.length() == 9 && description.charAt(4) == '-') {
                Object systemService = C16737.m39277().getSystemService("storage");
                if (systemService instanceof StorageManager) {
                    try {
                        Iterator<StorageVolume> it = ((StorageManager) systemService).getStorageVolumes().iterator();
                        while (it.hasNext()) {
                            StorageVolume storageVolumeM8973 = C3012.m8973(it.next());
                            if (description.equals(storageVolumeM8973.getUuid())) {
                                description = storageVolumeM8973.getDescription(C16737.m39277());
                                break;
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            synchronized (C19001.class) {
                f61500.add(new C18295(uri, string, description));
                C9030.removeIf(f61503, new C15474(string, i));
            }
            m43721();
            f61502.mo23641(f61499);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m43719() {
        m43721();
        f61502.mo23641(f61499);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43710(int i, int i2) {
        synchronized (C19001.class) {
            C23520.m51798(i, i2, f61500);
        }
        C4716.m13051(new RunnableC21823(), C19001.class, 500L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43709(int i) {
        synchronized (C19001.class) {
            ((C18295) f61500.remove(i)).m42506();
        }
        C4716.m13051(new RunnableC21823(), C19001.class, 500L);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m43720(int i) {
        synchronized (C19001.class) {
            f61503.add((C18295) f61500.remove(i));
        }
        C4716.m13051(new RunnableC21823(), C19001.class, 500L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43713(Set set) {
        synchronized (C19001.class) {
            Iterator it = f61504.iterator();
            while (it.hasNext()) {
                C18295 c18295 = (C18295) it.next();
                if (set.contains(c18295.f58374)) {
                    c18295.m42506();
                    it.remove();
                }
            }
        }
        m43721();
        f61502.mo23641(f61499);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23235 m43707(File file) {
        String[] strArr;
        String strSubstring;
        String strSubstring2;
        String path = file.getPath();
        if (C6851.m18466("/storage/", path)) {
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
        synchronized (C19001.class) {
            for (C18295 c18295 : f61504) {
                if (c18295.f58374.equals(str)) {
                    Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(c18295.f58380, c18295.m42504(str2, true));
                    if (uriBuildDocumentUriUsingTree.getAuthority().endsWith(".MTDataFilesProvider")) {
                        return new C17589(file, uriBuildDocumentUriUsingTree, c18295);
                    }
                    return new C23235(file, uriBuildDocumentUriUsingTree, c18295);
                }
            }
            return null;
        }
    }
}
