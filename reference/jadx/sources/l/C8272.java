package l;

import android.app.Application;
import android.os.Build;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 618F */
/* JADX INFO: loaded from: classes3.dex */
public final class C8272 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList f28756;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f28757;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9186 f28758 = new C9186();

    /* JADX WARN: Code duplicated, block: B:100:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0181 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c2 A[Catch: Exception -> 0x0101, all -> 0x0254, TryCatch #3 {Exception -> 0x0101, blocks: (B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6), top: B:90:0x0081, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0104 A[DONT_INVERT, PHI: r2
      0x0104: PHI (r2v4 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v3 boolean) binds: [B:21:0x007f, B:36:0x0101, B:35:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x013c A[Catch: Exception -> 0x0186, all -> 0x0254, TryCatch #2 {Exception -> 0x0186, blocks: (B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e), top: B:88:0x0106, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x015e A[Catch: Exception -> 0x0186, all -> 0x0254, TryCatch #2 {Exception -> 0x0186, blocks: (B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e), top: B:88:0x0106, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0189 A[DONT_INVERT, PHI: r2
      0x0189: PHI (r2v6 boolean) = (r2v4 boolean), (r2v4 boolean), (r2v5 boolean) binds: [B:37:0x0104, B:49:0x0186, B:48:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x018b A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:8:0x002e, B:10:0x0034, B:12:0x0042, B:14:0x004e, B:16:0x005a, B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6, B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:51:0x018b, B:52:0x0190, B:54:0x0196, B:56:0x01a8, B:58:0x01ae, B:60:0x01ba, B:61:0x01be, B:63:0x01c2, B:65:0x01ca, B:67:0x01d5, B:69:0x01f2, B:70:0x01f6, B:71:0x022d, B:73:0x0231, B:75:0x023b, B:78:0x0250, B:77:0x0243, B:49:0x0186, B:36:0x0101, B:19:0x007b), top: B:84:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0196 A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:8:0x002e, B:10:0x0034, B:12:0x0042, B:14:0x004e, B:16:0x005a, B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6, B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:51:0x018b, B:52:0x0190, B:54:0x0196, B:56:0x01a8, B:58:0x01ae, B:60:0x01ba, B:61:0x01be, B:63:0x01c2, B:65:0x01ca, B:67:0x01d5, B:69:0x01f2, B:70:0x01f6, B:71:0x022d, B:73:0x0231, B:75:0x023b, B:78:0x0250, B:77:0x0243, B:49:0x0186, B:36:0x0101, B:19:0x007b), top: B:84:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ae A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:8:0x002e, B:10:0x0034, B:12:0x0042, B:14:0x004e, B:16:0x005a, B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6, B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:51:0x018b, B:52:0x0190, B:54:0x0196, B:56:0x01a8, B:58:0x01ae, B:60:0x01ba, B:61:0x01be, B:63:0x01c2, B:65:0x01ca, B:67:0x01d5, B:69:0x01f2, B:70:0x01f6, B:71:0x022d, B:73:0x0231, B:75:0x023b, B:78:0x0250, B:77:0x0243, B:49:0x0186, B:36:0x0101, B:19:0x007b), top: B:84:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2 A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:8:0x002e, B:10:0x0034, B:12:0x0042, B:14:0x004e, B:16:0x005a, B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6, B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:51:0x018b, B:52:0x0190, B:54:0x0196, B:56:0x01a8, B:58:0x01ae, B:60:0x01ba, B:61:0x01be, B:63:0x01c2, B:65:0x01ca, B:67:0x01d5, B:69:0x01f2, B:70:0x01f6, B:71:0x022d, B:73:0x0231, B:75:0x023b, B:78:0x0250, B:77:0x0243, B:49:0x0186, B:36:0x0101, B:19:0x007b), top: B:84:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0231 A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:8:0x002e, B:10:0x0034, B:12:0x0042, B:14:0x004e, B:16:0x005a, B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6, B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:51:0x018b, B:52:0x0190, B:54:0x0196, B:56:0x01a8, B:58:0x01ae, B:60:0x01ba, B:61:0x01be, B:63:0x01c2, B:65:0x01ca, B:67:0x01d5, B:69:0x01f2, B:70:0x01f6, B:71:0x022d, B:73:0x0231, B:75:0x023b, B:78:0x0250, B:77:0x0243, B:49:0x0186, B:36:0x0101, B:19:0x007b), top: B:84:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0243 A[Catch: all -> 0x0254, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:8:0x002e, B:10:0x0034, B:12:0x0042, B:14:0x004e, B:16:0x005a, B:22:0x0081, B:23:0x00bc, B:25:0x00c2, B:27:0x00d2, B:31:0x00e2, B:33:0x00f6, B:38:0x0106, B:40:0x013c, B:42:0x015e, B:44:0x0166, B:46:0x016e, B:51:0x018b, B:52:0x0190, B:54:0x0196, B:56:0x01a8, B:58:0x01ae, B:60:0x01ba, B:61:0x01be, B:63:0x01c2, B:65:0x01ca, B:67:0x01d5, B:69:0x01f2, B:70:0x01f6, B:71:0x022d, B:73:0x0231, B:75:0x023b, B:78:0x0250, B:77:0x0243, B:49:0x0186, B:36:0x0101, B:19:0x007b), top: B:84:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01be A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ca A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized List m21693(String str) {
        boolean z;
        Method method;
        int iIntValue;
        Method method2;
        Method method3;
        Method method4;
        Object objInvoke;
        int length;
        int i;
        boolean zBooleanValue;
        ArrayList arrayList;
        Iterator it;
        boolean z2;
        C18149 c18149;
        String str2;
        String strM39288;
        ArrayList arrayList2 = new ArrayList();
        Application applicationM39277 = C16737.m39277();
        StorageManager storageManager = (StorageManager) applicationM39277.getSystemService("storage");
        C13638.requireNonNull(storageManager);
        C18149 c181410 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                List<StorageVolume> storageVolumes = storageManager.getStorageVolumes();
                Method method5 = StorageVolume.class.getMethod("getPath", null);
                Iterator<StorageVolume> it2 = storageVolumes.iterator();
                while (it2.hasNext()) {
                    StorageVolume storageVolumeM8973 = C3012.m8973(it2.next());
                    if (storageVolumeM8973.isRemovable() && ("mounted".equals(storageVolumeM8973.getState()) || "mounted_ro".equals(storageVolumeM8973.getState()))) {
                        String str3 = (String) method5.invoke(storageVolumeM8973, null);
                        C13638.requireNonNull(str3);
                        arrayList2.add(new C18149(new File(str3), storageVolumeM8973.getUuid(), storageVolumeM8973.getDescription(applicationM39277)));
                    }
                }
                z = true;
            } catch (Exception unused) {
                arrayList2.clear();
                z = false;
            }
            if (!z) {
                try {
                    Method method6 = storageManager.getClass().getMethod("getVolumes", null);
                    Class<?> cls = Class.forName("android.os.storage.VolumeInfo");
                    method = cls.getMethod("getType", null);
                    Method method7 = cls.getMethod("getPath", null);
                    Method method8 = cls.getMethod("getDescription", null);
                    Method method9 = cls.getMethod("getState", null);
                    Method method10 = cls.getMethod("getFsUuid", null);
                    List list = (List) method6.invoke(storageManager, null);
                    C13638.requireNonNull(list);
                    for (Object obj : list) {
                        if (((Integer) method.invoke(obj, null)).intValue() != 0 && ((iIntValue = ((Integer) method9.invoke(obj, null)).intValue()) == 2 || iIntValue == 3)) {
                            File file = (File) method7.invoke(obj, null);
                            String str4 = (String) method8.invoke(obj, null);
                            String str5 = (String) method10.invoke(obj, null);
                            if (file != null) {
                                arrayList2.add(new C18149(file, str5, str4));
                            } else {
                                continue;
                            }
                        }
                    }
                    z = true;
                } catch (Exception unused2) {
                    arrayList2.clear();
                }
                if (!z) {
                    try {
                        Method method11 = storageManager.getClass().getMethod("getVolumeList", null);
                        Class<?> cls2 = Class.forName("android.os.storage.StorageVolume");
                        method2 = cls2.getMethod("getPath", null);
                        method3 = cls2.getMethod("isRemovable", null);
                        method4 = cls2.getMethod("getState", null);
                        Method method12 = cls2.getMethod("getUuid", null);
                        objInvoke = method11.invoke(storageManager, null);
                        C13638.requireNonNull(objInvoke);
                        length = Array.getLength(objInvoke);
                        for (i = 0; i < length; i++) {
                            Object obj2 = Array.get(objInvoke, i);
                            String str6 = (String) method2.invoke(obj2, null);
                            C13638.requireNonNull(str6);
                            Object objInvoke2 = method3.invoke(obj2, null);
                            C13638.requireNonNull(objInvoke2);
                            zBooleanValue = ((Boolean) objInvoke2).booleanValue();
                            String str7 = (String) method4.invoke(obj2, null);
                            if (!zBooleanValue && ("mounted".equals(str7) || "mounted_ro".equals(str7))) {
                                arrayList2.add(new C18149(new File(str6), (String) method12.invoke(obj2, null)));
                            }
                        }
                        z = true;
                    } catch (Exception unused3) {
                        arrayList2.clear();
                    }
                    if (z) {
                        it = arrayList2.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                            c18149 = (C18149) it.next();
                            if (C5553.m15304(c18149.f58039.getPath())) {
                                it.remove();
                            } else if (str == null && str.equalsIgnoreCase(c18149.f58039.getAbsolutePath())) {
                                it.remove();
                            } else {
                                str2 = c18149.f58040;
                                if (str2 != null || str2.length() > 12) {
                                    strM39288 = C16737.m39288(R.string.MT_Protector);
                                    if (z2) {
                                        c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                                    } else if (c181410 == null) {
                                        c18149.f58040 = strM39288;
                                        c181410 = c18149;
                                    } else {
                                        c181410.f58040 = strM39288 + ' ' + c181410.f58039.getName();
                                        c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = f28756;
                    if (arrayList != null || arrayList.size() != arrayList2.size() || !f28756.containsAll(arrayList2)) {
                        C9186 c9186 = f28758;
                        f28756 = arrayList2;
                        c9186.mo23641(arrayList2);
                        f28757++;
                    }
                } else {
                    if (z) {
                        it = arrayList2.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                            c18149 = (C18149) it.next();
                            if (C5553.m15304(c18149.f58039.getPath())) {
                                it.remove();
                            } else {
                                if (str == null) {
                                }
                                str2 = c18149.f58040;
                                if (str2 != null) {
                                }
                                strM39288 = C16737.m39288(R.string.MT_Protector);
                                if (z2) {
                                    c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                                } else if (c181410 == null) {
                                    c18149.f58040 = strM39288;
                                    c181410 = c18149;
                                } else {
                                    c181410.f58040 = strM39288 + ' ' + c181410.f58039.getName();
                                    c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                                    z2 = true;
                                }
                            }
                        }
                    }
                    arrayList = f28756;
                    if (arrayList != null) {
                        C9186 c9187 = f28758;
                        f28756 = arrayList2;
                        c9187.mo23641(arrayList2);
                        f28757++;
                    } else {
                        C9186 c9188 = f28758;
                        f28756 = arrayList2;
                        c9188.mo23641(arrayList2);
                        f28757++;
                    }
                }
            } else if (!z) {
                Method method13 = storageManager.getClass().getMethod("getVolumeList", null);
                Class<?> cls3 = Class.forName("android.os.storage.StorageVolume");
                method2 = cls3.getMethod("getPath", null);
                method3 = cls3.getMethod("isRemovable", null);
                method4 = cls3.getMethod("getState", null);
                Method method14 = cls3.getMethod("getUuid", null);
                objInvoke = method13.invoke(storageManager, null);
                C13638.requireNonNull(objInvoke);
                length = Array.getLength(objInvoke);
                while (i < length) {
                    Object obj3 = Array.get(objInvoke, i);
                    String str8 = (String) method2.invoke(obj3, null);
                    C13638.requireNonNull(str8);
                    Object objInvoke3 = method3.invoke(obj3, null);
                    C13638.requireNonNull(objInvoke3);
                    zBooleanValue = ((Boolean) objInvoke3).booleanValue();
                    String str9 = (String) method4.invoke(obj3, null);
                    if (!zBooleanValue) {
                    }
                }
                z = true;
                if (z) {
                    it = arrayList2.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                        c18149 = (C18149) it.next();
                        if (C5553.m15304(c18149.f58039.getPath())) {
                            it.remove();
                        } else {
                            if (str == null) {
                            }
                            str2 = c18149.f58040;
                            if (str2 != null) {
                            }
                            strM39288 = C16737.m39288(R.string.MT_Protector);
                            if (z2) {
                                c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                            } else if (c181410 == null) {
                                c18149.f58040 = strM39288;
                                c181410 = c18149;
                            } else {
                                c181410.f58040 = strM39288 + ' ' + c181410.f58039.getName();
                                c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                                z2 = true;
                            }
                        }
                    }
                }
                arrayList = f28756;
                if (arrayList != null) {
                    C9186 c9189 = f28758;
                    f28756 = arrayList2;
                    c9189.mo23641(arrayList2);
                    f28757++;
                } else {
                    C9186 c91810 = f28758;
                    f28756 = arrayList2;
                    c91810.mo23641(arrayList2);
                    f28757++;
                }
            } else {
                if (z) {
                    it = arrayList2.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                        c18149 = (C18149) it.next();
                        if (C5553.m15304(c18149.f58039.getPath())) {
                            it.remove();
                        } else {
                            if (str == null) {
                            }
                            str2 = c18149.f58040;
                            if (str2 != null) {
                            }
                            strM39288 = C16737.m39288(R.string.MT_Protector);
                            if (z2) {
                                c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                            } else if (c181410 == null) {
                                c18149.f58040 = strM39288;
                                c181410 = c18149;
                            } else {
                                c181410.f58040 = strM39288 + ' ' + c181410.f58039.getName();
                                c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                                z2 = true;
                            }
                        }
                    }
                }
                arrayList = f28756;
                if (arrayList != null) {
                    C9186 c91811 = f28758;
                    f28756 = arrayList2;
                    c91811.mo23641(arrayList2);
                    f28757++;
                } else {
                    C9186 c91812 = f28758;
                    f28756 = arrayList2;
                    c91812.mo23641(arrayList2);
                    f28757++;
                }
            }
        } else {
            z = false;
            if (!z) {
                Method method15 = storageManager.getClass().getMethod("getVolumes", null);
                Class<?> cls4 = Class.forName("android.os.storage.VolumeInfo");
                method = cls4.getMethod("getType", null);
                Method method16 = cls4.getMethod("getPath", null);
                Method method17 = cls4.getMethod("getDescription", null);
                Method method18 = cls4.getMethod("getState", null);
                Method method19 = cls4.getMethod("getFsUuid", null);
                List list2 = (List) method15.invoke(storageManager, null);
                C13638.requireNonNull(list2);
                while (r4.hasNext()) {
                    if (((Integer) method.invoke(obj, null)).intValue() != 0) {
                    }
                }
                z = true;
                if (!z) {
                    Method method110 = storageManager.getClass().getMethod("getVolumeList", null);
                    Class<?> cls5 = Class.forName("android.os.storage.StorageVolume");
                    method2 = cls5.getMethod("getPath", null);
                    method3 = cls5.getMethod("isRemovable", null);
                    method4 = cls5.getMethod("getState", null);
                    Method method111 = cls5.getMethod("getUuid", null);
                    objInvoke = method110.invoke(storageManager, null);
                    C13638.requireNonNull(objInvoke);
                    length = Array.getLength(objInvoke);
                    while (i < length) {
                        Object obj4 = Array.get(objInvoke, i);
                        String str10 = (String) method2.invoke(obj4, null);
                        C13638.requireNonNull(str10);
                        Object objInvoke4 = method3.invoke(obj4, null);
                        C13638.requireNonNull(objInvoke4);
                        zBooleanValue = ((Boolean) objInvoke4).booleanValue();
                        String str11 = (String) method4.invoke(obj4, null);
                        if (!zBooleanValue) {
                        }
                    }
                    z = true;
                    if (z) {
                        it = arrayList2.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                            c18149 = (C18149) it.next();
                            if (C5553.m15304(c18149.f58039.getPath())) {
                                it.remove();
                            } else {
                                if (str == null) {
                                }
                                str2 = c18149.f58040;
                                if (str2 != null) {
                                }
                                strM39288 = C16737.m39288(R.string.MT_Protector);
                                if (z2) {
                                    c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                                } else if (c181410 == null) {
                                    c18149.f58040 = strM39288;
                                    c181410 = c18149;
                                } else {
                                    c181410.f58040 = strM39288 + ' ' + c181410.f58039.getName();
                                    c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                                    z2 = true;
                                }
                            }
                        }
                    }
                    arrayList = f28756;
                    if (arrayList != null) {
                        C9186 c91813 = f28758;
                        f28756 = arrayList2;
                        c91813.mo23641(arrayList2);
                        f28757++;
                    } else {
                        C9186 c91814 = f28758;
                        f28756 = arrayList2;
                        c91814.mo23641(arrayList2);
                        f28757++;
                    }
                } else {
                    if (z) {
                        it = arrayList2.iterator();
                        z2 = false;
                        while (it.hasNext()) {
                            c18149 = (C18149) it.next();
                            if (C5553.m15304(c18149.f58039.getPath())) {
                                it.remove();
                            } else {
                                if (str == null) {
                                }
                                str2 = c18149.f58040;
                                if (str2 != null) {
                                }
                                strM39288 = C16737.m39288(R.string.MT_Protector);
                                if (z2) {
                                    c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                                } else if (c181410 == null) {
                                    c18149.f58040 = strM39288;
                                    c181410 = c18149;
                                } else {
                                    c181410.f58040 = strM39288 + ' ' + c181410.f58039.getName();
                                    c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                                    z2 = true;
                                }
                            }
                        }
                    }
                    arrayList = f28756;
                    if (arrayList != null) {
                        C9186 c91815 = f28758;
                        f28756 = arrayList2;
                        c91815.mo23641(arrayList2);
                        f28757++;
                    } else {
                        C9186 c91816 = f28758;
                        f28756 = arrayList2;
                        c91816.mo23641(arrayList2);
                        f28757++;
                    }
                }
            } else if (!z) {
                Method method112 = storageManager.getClass().getMethod("getVolumeList", null);
                Class<?> cls6 = Class.forName("android.os.storage.StorageVolume");
                method2 = cls6.getMethod("getPath", null);
                method3 = cls6.getMethod("isRemovable", null);
                method4 = cls6.getMethod("getState", null);
                Method method113 = cls6.getMethod("getUuid", null);
                objInvoke = method112.invoke(storageManager, null);
                C13638.requireNonNull(objInvoke);
                length = Array.getLength(objInvoke);
                while (i < length) {
                    Object obj5 = Array.get(objInvoke, i);
                    String str12 = (String) method2.invoke(obj5, null);
                    C13638.requireNonNull(str12);
                    Object objInvoke5 = method3.invoke(obj5, null);
                    C13638.requireNonNull(objInvoke5);
                    zBooleanValue = ((Boolean) objInvoke5).booleanValue();
                    String str13 = (String) method4.invoke(obj5, null);
                    if (!zBooleanValue) {
                    }
                }
                z = true;
                if (z) {
                    it = arrayList2.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                        c18149 = (C18149) it.next();
                        if (C5553.m15304(c18149.f58039.getPath())) {
                            it.remove();
                        } else {
                            if (str == null) {
                            }
                            str2 = c18149.f58040;
                            if (str2 != null) {
                            }
                            strM39288 = C16737.m39288(R.string.MT_Protector);
                            if (z2) {
                                c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                            } else if (c181410 == null) {
                                c18149.f58040 = strM39288;
                                c181410 = c18149;
                            } else {
                                c181410.f58040 = strM39288 + ' ' + c181410.f58039.getName();
                                c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                                z2 = true;
                            }
                        }
                    }
                }
                arrayList = f28756;
                if (arrayList != null) {
                    C9186 c91817 = f28758;
                    f28756 = arrayList2;
                    c91817.mo23641(arrayList2);
                    f28757++;
                } else {
                    C9186 c91818 = f28758;
                    f28756 = arrayList2;
                    c91818.mo23641(arrayList2);
                    f28757++;
                }
            } else {
                if (z) {
                    it = arrayList2.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                        c18149 = (C18149) it.next();
                        if (C5553.m15304(c18149.f58039.getPath())) {
                            it.remove();
                        } else {
                            if (str == null) {
                            }
                            str2 = c18149.f58040;
                            if (str2 != null) {
                            }
                            strM39288 = C16737.m39288(R.string.MT_Protector);
                            if (z2) {
                                c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                            } else if (c181410 == null) {
                                c18149.f58040 = strM39288;
                                c181410 = c18149;
                            } else {
                                c181410.f58040 = strM39288 + ' ' + c181410.f58039.getName();
                                c18149.f58040 = strM39288 + ' ' + c18149.f58039.getName();
                                z2 = true;
                            }
                        }
                    }
                }
                arrayList = f28756;
                if (arrayList != null) {
                    C9186 c91819 = f28758;
                    f28756 = arrayList2;
                    c91819.mo23641(arrayList2);
                    f28757++;
                } else {
                    C9186 c918110 = f28758;
                    f28756 = arrayList2;
                    c918110.mo23641(arrayList2);
                    f28757++;
                }
            }
        }
        throw th;
        return f28756;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21691(Main main, C8992 c8992) {
        f28758.m44959(main, c8992);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21689() {
        return f28757;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static List m21692() {
        ArrayList arrayList = f28756;
        return arrayList != null ? arrayList : m21693(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18149 m21690(String str) {
        if (str.startsWith("/data") || str.startsWith("/system") || str.startsWith("/proc")) {
            return null;
        }
        ArrayList<C18149> arrayList = (ArrayList) m21692();
        if (arrayList.isEmpty()) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        for (C18149 c18149 : arrayList) {
            if (lowerCase.startsWith(c18149.f58038)) {
                return c18149;
            }
        }
        return null;
    }
}
