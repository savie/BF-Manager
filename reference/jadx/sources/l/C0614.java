package l;

import android.os.SystemClock;
import android.text.TextUtils;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0614 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12610 f2667;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f2668 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f2666 = new AtomicLong(1);

    public C0614(C12610 c12610) {
        this.f2667 = c12610;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7671 m2819(C15530 c15530) {
        JSONObject jSONObjectM32824 = C13316.m32824(c15530);
        C7671 c7671 = new C7671();
        c7671.f25384 = C13316.m32826(jSONObjectM32824);
        c7671.f25383 = C13316.m32829(jSONObjectM32824, "basePath");
        return c7671;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m2820(C15530 c15530) {
        final AbstractC20371 c10494;
        final long jUptimeMillis = SystemClock.uptimeMillis();
        ConcurrentMapC13783 concurrentMapC13783 = this.f2668;
        C9030.removeIf(concurrentMapC13783.entrySet(), new Predicate() { // from class: l.᩵᩵ۜ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC20371) ((Map.Entry) obj).getValue()).m46030(jUptimeMillis);
            }
        });
        EnumC18351 enumC18351M37142 = c15530.m37142();
        boolean zEquals = EnumC18351.POST.equals(enumC18351M37142);
        C12610 c12610 = this.f2667;
        if (!zEquals) {
            if (EnumC18351.GET.equals(enumC18351M37142)) {
                String strM14444 = C5244.m14444(c15530, "taskId");
                if (TextUtils.isEmpty(strM14444)) {
                    EnumC10591 enumC10591 = EnumC10591.BAD_REQUEST;
                    Object[] objArr = {"taskId"};
                    c12610.getClass();
                    return C12610.m31384(enumC10591, C16737.m39264(R.string.MT_Protector, objArr));
                }
                AbstractC20371 abstractC20371 = (AbstractC20371) concurrentMapC13783.get(strM14444);
                if (abstractC20371 == null) {
                    EnumC10591 enumC10592 = EnumC10591.NOT_FOUND;
                    c12610.getClass();
                    return C12610.m31384(enumC10592, C16737.m39264(R.string.MT_Protector, new Object[0]));
                }
                LinkedHashMap linkedHashMapM46028 = abstractC20371.m46028();
                c12610.getClass();
                return C12610.m31383(linkedHashMapM46028);
            }
            if (!EnumC18351.DELETE.equals(enumC18351M37142)) {
                EnumC10591 enumC10593 = EnumC10591.METHOD_NOT_ALLOWED;
                c12610.getClass();
                return C12610.m31384(enumC10593, C16737.m39264(R.string.MT_Protector, new Object[0]));
            }
            String strM14445 = C5244.m14444(c15530, "taskId");
            if (TextUtils.isEmpty(strM14445)) {
                EnumC10591 enumC10594 = EnumC10591.BAD_REQUEST;
                Object[] objArr2 = {"taskId"};
                c12610.getClass();
                return C12610.m31384(enumC10594, C16737.m39264(R.string.MT_Protector, objArr2));
            }
            AbstractC20371 abstractC20372 = (AbstractC20371) concurrentMapC13783.remove(strM14445);
            if (abstractC20372 == null) {
                EnumC10591 enumC10595 = EnumC10591.NOT_FOUND;
                c12610.getClass();
                return C12610.m31384(enumC10595, C16737.m39264(R.string.MT_Protector, new Object[0]));
            }
            abstractC20372.m46032();
            Map map = Collections.EMPTY_MAP;
            c12610.getClass();
            return C12610.m31383(map);
        }
        try {
            C7671 c7671M2819 = m2819(c15530);
            ArrayList arrayList = c7671M2819.f25384;
            if (arrayList == null || arrayList.isEmpty()) {
                EnumC10591 enumC10596 = EnumC10591.BAD_REQUEST;
                Object[] objArr3 = {"paths"};
                c12610.getClass();
                return C12610.m31384(enumC10596, C16737.m39264(R.string.MT_Protector, objArr3));
            }
            if (c7671M2819.f25384.size() > 1 && TextUtils.isEmpty(c7671M2819.f25383)) {
                EnumC10591 enumC10597 = EnumC10591.BAD_REQUEST;
                Object[] objArr4 = {"basePath"};
                c12610.getClass();
                return C12610.m31384(enumC10597, C16737.m39264(R.string.MT_Protector, objArr4));
            }
            ArrayList arrayList2 = new ArrayList(c7671M2819.f25384.size());
            Iterator it = c7671M2819.f25384.iterator();
            while (it.hasNext()) {
                C6794 c6794 = (C6794) C21611.f70098.mo10264((String) it.next());
                if (c6794 == null) {
                    c6794 = null;
                }
                if (c6794 == null || !(c6794.mo7986() || c6794.mo7989().mo33975())) {
                    EnumC10591 enumC10598 = EnumC10591.NOT_FOUND;
                    c12610.getClass();
                    return C12610.m31384(enumC10598, C16737.m39264(R.string.MT_Protector, new Object[0]));
                }
                arrayList2.add(c6794);
            }
            if (arrayList2.size() == 1 && ((C6794) arrayList2.get(0)).mo7985()) {
                C6794 c6795 = (C6794) arrayList2.get(0);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("done", Boolean.TRUE);
                LinkedHashMap linkedHashMapM2816 = m2816(c6795);
                long size = c6795.getSize();
                long jMo7990 = c6795.mo7990();
                if (jMo7990 == -1 || jMo7990 == size) {
                    linkedHashMapM2816.put("sizeBytes", Long.valueOf(size));
                } else {
                    linkedHashMapM2816.put("logicalSizeBytes", Long.valueOf(size));
                    linkedHashMapM2816.put("actualSizeBytes", Long.valueOf(jMo7990));
                }
                m2818(linkedHashMapM2816, c6795);
                linkedHashMap.put("property", linkedHashMapM2816);
                c12610.getClass();
                return C12610.m31383(linkedHashMap);
            }
            String str = "fp-" + this.f2666.getAndIncrement();
            if (arrayList2.size() == 1) {
                C6794 c6796 = (C6794) arrayList2.get(0);
                LinkedHashMap linkedHashMapM2817 = m2816(c6796);
                linkedHashMapM2817.put("sizeBytes", 0L);
                m2818(linkedHashMapM2817, c6796);
                linkedHashMapM2817.put("fileCount", 0);
                linkedHashMapM2817.put("folderCount", 0);
                c10494 = new C9083(this, str, linkedHashMapM2817, c6796);
            } else {
                String str2 = c7671M2819.f25383;
                String strSubstring = "/";
                if (!TextUtils.isEmpty(str2) && !"/".equals(str2)) {
                    int length = str2.length();
                    while (length > 1 && str2.charAt(length - 1) == '/') {
                        length--;
                    }
                    strSubstring = str2.substring(0, length);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("mode", "multi");
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((C6794) it2.next()).getName());
                }
                linkedHashMap2.put("names", arrayList3);
                linkedHashMap2.put("parent", strSubstring);
                linkedHashMap2.put("sizeBytes", 0L);
                linkedHashMap2.put("fileCount", 0);
                linkedHashMap2.put("folderCount", 0);
                c10494 = new C10494(this, str, linkedHashMap2, arrayList2);
            }
            LinkedHashMap linkedHashMapM46029 = c10494.m46028();
            concurrentMapC13783.put(str, c10494);
            C4716.f16636.execute(new Runnable() { // from class: l.᩷᩵ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC20371.m46025(c10494);
                }
            });
            c12610.getClass();
            return C12610.m31383(linkedHashMapM46029);
        } catch (IOException | C1320 | C21173 unused) {
            EnumC10591 enumC10599 = EnumC10591.BAD_REQUEST;
            c12610.getClass();
            return C12610.m31384(enumC10599, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m2816(C6794 c6794) {
        String strM39288;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mode", c6794.isDirectory() ? "single-folder" : "single-file");
        linkedHashMap.put("name", c6794.getName());
        linkedHashMap.put("parent", c6794.getParent());
        if (c6794.mo7986()) {
            strM39288 = C16737.m39288(R.string.MT_Protector);
        } else {
            strM39288 = C16737.m39288(c6794.isDirectory() ? R.string.MT_Protector : R.string.MT_Protector);
        }
        linkedHashMap.put("typeLabel", strM39288);
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2818(LinkedHashMap linkedHashMap, C6794 c6794) {
        C11731 c11731Mo7971;
        String path;
        linkedHashMap.put("timeLabel", C5319.m14744(c6794.getTime()));
        AbstractC20745 abstractC20745Mo7989 = c6794.mo7989();
        if (!c6794.isDirectory() || !c6794.m18395()) {
            if (C6794.m18392(c6794.mo7971())) {
                if (!abstractC20745Mo7989.mo46709()) {
                    try {
                        if (abstractC20745Mo7989 instanceof C14705) {
                            path = ((C14705) abstractC20745Mo7989).m35232();
                        } else {
                            path = c6794.getPath();
                        }
                        c6794.m18394(new C11731(C0055.m951(path)));
                        c11731Mo7971 = c6794.mo7971();
                        linkedHashMap.put("permissionsLabel", c11731Mo7971.m29324().toString());
                        if (!TextUtils.isEmpty(c11731Mo7971.m29326())) {
                            linkedHashMap.put("ownerLabel", c11731Mo7971.m29326());
                        }
                        if (!TextUtils.isEmpty(c11731Mo7971.m29320())) {
                            linkedHashMap.put("groupLabel", c11731Mo7971.m29320());
                        }
                    } catch (IOException | RuntimeException unused) {
                    }
                }
            } else {
                c11731Mo7971 = c6794.mo7971();
                linkedHashMap.put("permissionsLabel", c11731Mo7971.m29324().toString());
                if (!TextUtils.isEmpty(c11731Mo7971.m29326())) {
                    linkedHashMap.put("ownerLabel", c11731Mo7971.m29326());
                }
                if (!TextUtils.isEmpty(c11731Mo7971.m29320())) {
                    linkedHashMap.put("groupLabel", c11731Mo7971.m29320());
                }
            }
        }
        if (c6794.mo7986()) {
            linkedHashMap.put("linkPath", c6794.mo7978());
        }
    }
}
