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

/* JADX INFO: renamed from: l.ᩴۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19515 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12802 f62966;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f62967 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f62965 = new AtomicLong(1);

    public C19515(C12802 c12802) {
        this.f62966 = c12802;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C4599 m45035(C3767 c3767) {
        JSONObject jSONObjectM48362 = C21203.m48362(c3767);
        C4599 c4599 = new C4599();
        c4599.f16325 = C21203.m48364(jSONObjectM48362);
        c4599.f16324 = C21203.m48367(jSONObjectM48362, "basePath");
        return c4599;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m45036(C3767 c3767) {
        final AbstractC22499 c13743;
        final long jUptimeMillis = SystemClock.uptimeMillis();
        ConcurrentMapC17249 concurrentMapC17249 = this.f62967;
        C1170.removeIf(concurrentMapC17249.entrySet(), new Predicate() { // from class: l.۠ۡۧ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC22499) ((Map.Entry) obj).getValue()).m50731(jUptimeMillis);
            }
        });
        EnumC12716 enumC12716M12226 = c3767.m12226();
        boolean zEquals = EnumC12716.POST.equals(enumC12716M12226);
        C12802 c12802 = this.f62966;
        if (!zEquals) {
            if (EnumC12716.GET.equals(enumC12716M12226)) {
                String strM53547 = C23991.m53547(c3767, "taskId");
                if (TextUtils.isEmpty(strM53547)) {
                    EnumC21667 enumC21667 = EnumC21667.BAD_REQUEST;
                    Object[] objArr = {"taskId"};
                    c12802.getClass();
                    return C12802.m31751(enumC21667, C21576.m49059(R.string.MT_Protector, objArr));
                }
                AbstractC22499 abstractC22499 = (AbstractC22499) concurrentMapC17249.get(strM53547);
                if (abstractC22499 == null) {
                    EnumC21667 enumC21668 = EnumC21667.NOT_FOUND;
                    c12802.getClass();
                    return C12802.m31751(enumC21668, C21576.m49059(R.string.MT_Protector, new Object[0]));
                }
                LinkedHashMap linkedHashMapM50729 = abstractC22499.m50729();
                c12802.getClass();
                return C12802.m31750(linkedHashMapM50729);
            }
            if (!EnumC12716.DELETE.equals(enumC12716M12226)) {
                EnumC21667 enumC21669 = EnumC21667.METHOD_NOT_ALLOWED;
                c12802.getClass();
                return C12802.m31751(enumC21669, C21576.m49059(R.string.MT_Protector, new Object[0]));
            }
            String strM53548 = C23991.m53547(c3767, "taskId");
            if (TextUtils.isEmpty(strM53548)) {
                EnumC21667 enumC216610 = EnumC21667.BAD_REQUEST;
                Object[] objArr2 = {"taskId"};
                c12802.getClass();
                return C12802.m31751(enumC216610, C21576.m49059(R.string.MT_Protector, objArr2));
            }
            AbstractC22499 abstractC224910 = (AbstractC22499) concurrentMapC17249.remove(strM53548);
            if (abstractC224910 == null) {
                EnumC21667 enumC216611 = EnumC21667.NOT_FOUND;
                c12802.getClass();
                return C12802.m31751(enumC216611, C21576.m49059(R.string.MT_Protector, new Object[0]));
            }
            abstractC224910.m50733();
            Map map = Collections.EMPTY_MAP;
            c12802.getClass();
            return C12802.m31750(map);
        }
        try {
            C4599 c4599M45035 = m45035(c3767);
            ArrayList arrayList = c4599M45035.f16325;
            if (arrayList == null || arrayList.isEmpty()) {
                EnumC21667 enumC216612 = EnumC21667.BAD_REQUEST;
                Object[] objArr3 = {"paths"};
                c12802.getClass();
                return C12802.m31751(enumC216612, C21576.m49059(R.string.MT_Protector, objArr3));
            }
            if (c4599M45035.f16325.size() > 1 && TextUtils.isEmpty(c4599M45035.f16324)) {
                EnumC21667 enumC216613 = EnumC21667.BAD_REQUEST;
                Object[] objArr4 = {"basePath"};
                c12802.getClass();
                return C12802.m31751(enumC216613, C21576.m49059(R.string.MT_Protector, objArr4));
            }
            ArrayList arrayList2 = new ArrayList(c4599M45035.f16325.size());
            Iterator it = c4599M45035.f16325.iterator();
            while (it.hasNext()) {
                C6004 c6004 = (C6004) C11969.f38536.mo20831((String) it.next());
                if (c6004 == null) {
                    c6004 = null;
                }
                if (c6004 == null || !(c6004.mo8107() || c6004.mo8093().mo2934())) {
                    EnumC21667 enumC216614 = EnumC21667.NOT_FOUND;
                    c12802.getClass();
                    return C12802.m31751(enumC216614, C21576.m49059(R.string.MT_Protector, new Object[0]));
                }
                arrayList2.add(c6004);
            }
            if (arrayList2.size() == 1 && ((C6004) arrayList2.get(0)).mo8090()) {
                C6004 c6005 = (C6004) arrayList2.get(0);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("done", Boolean.TRUE);
                LinkedHashMap linkedHashMapM45032 = m45032(c6005);
                long size = c6005.getSize();
                long jMo8104 = c6005.mo8104();
                if (jMo8104 == -1 || jMo8104 == size) {
                    linkedHashMapM45032.put("sizeBytes", Long.valueOf(size));
                } else {
                    linkedHashMapM45032.put("logicalSizeBytes", Long.valueOf(size));
                    linkedHashMapM45032.put("actualSizeBytes", Long.valueOf(jMo8104));
                }
                m45034(linkedHashMapM45032, c6005);
                linkedHashMap.put("property", linkedHashMapM45032);
                c12802.getClass();
                return C12802.m31750(linkedHashMap);
            }
            String str = "fp-" + this.f62965.getAndIncrement();
            if (arrayList2.size() == 1) {
                C6004 c6006 = (C6004) arrayList2.get(0);
                LinkedHashMap linkedHashMapM45033 = m45032(c6006);
                linkedHashMapM45033.put("sizeBytes", 0L);
                m45034(linkedHashMapM45033, c6006);
                linkedHashMapM45033.put("fileCount", 0);
                linkedHashMapM45033.put("folderCount", 0);
                c13743 = new C7032(this, str, linkedHashMapM45033, c6006);
            } else {
                String str2 = c4599M45035.f16324;
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
                    arrayList3.add(((C6004) it2.next()).getName());
                }
                linkedHashMap2.put("names", arrayList3);
                linkedHashMap2.put("parent", strSubstring);
                linkedHashMap2.put("sizeBytes", 0L);
                linkedHashMap2.put("fileCount", 0);
                linkedHashMap2.put("folderCount", 0);
                c13743 = new C13743(this, str, linkedHashMap2, arrayList2);
            }
            LinkedHashMap linkedHashMapM507210 = c13743.m50729();
            concurrentMapC17249.put(str, c13743);
            C5261.f18540.execute(new Runnable() { // from class: l.᩷ۖۧ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC22499.m50726(c13743);
                }
            });
            c12802.getClass();
            return C12802.m31750(linkedHashMapM507210);
        } catch (IOException | C0784 | C14489 unused) {
            EnumC21667 enumC216615 = EnumC21667.BAD_REQUEST;
            c12802.getClass();
            return C12802.m31751(enumC216615, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m45032(C6004 c6004) {
        String strM49088;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mode", c6004.isDirectory() ? "single-folder" : "single-file");
        linkedHashMap.put("name", c6004.getName());
        linkedHashMap.put("parent", c6004.getParent());
        if (c6004.mo8107()) {
            strM49088 = C21576.m49088(R.string.MT_Protector);
        } else {
            strM49088 = C21576.m49088(c6004.isDirectory() ? R.string.MT_Protector : R.string.MT_Protector);
        }
        linkedHashMap.put("typeLabel", strM49088);
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45034(LinkedHashMap linkedHashMap, C6004 c6004) {
        C9097 c9097Mo5155;
        String path;
        linkedHashMap.put("timeLabel", C22482.m50718(c6004.getTime()));
        AbstractC22044 abstractC22044Mo8093 = c6004.mo8093();
        if (!c6004.isDirectory() || !c6004.m17451()) {
            if (C6004.m17446(c6004.mo5155())) {
                if (!abstractC22044Mo8093.mo49854()) {
                    try {
                        if (abstractC22044Mo8093 instanceof C17063) {
                            path = ((C17063) abstractC22044Mo8093).m40200();
                        } else {
                            path = c6004.getPath();
                        }
                        c6004.m17447(new C9097(C14453.m34906(path)));
                        c9097Mo5155 = c6004.mo5155();
                        linkedHashMap.put("permissionsLabel", c9097Mo5155.m24245().toString());
                        if (!TextUtils.isEmpty(c9097Mo5155.m24241())) {
                            linkedHashMap.put("ownerLabel", c9097Mo5155.m24241());
                        }
                        if (!TextUtils.isEmpty(c9097Mo5155.m24237())) {
                            linkedHashMap.put("groupLabel", c9097Mo5155.m24237());
                        }
                    } catch (IOException | RuntimeException unused) {
                    }
                }
            } else {
                c9097Mo5155 = c6004.mo5155();
                linkedHashMap.put("permissionsLabel", c9097Mo5155.m24245().toString());
                if (!TextUtils.isEmpty(c9097Mo5155.m24241())) {
                    linkedHashMap.put("ownerLabel", c9097Mo5155.m24241());
                }
                if (!TextUtils.isEmpty(c9097Mo5155.m24237())) {
                    linkedHashMap.put("groupLabel", c9097Mo5155.m24237());
                }
            }
        }
        if (c6004.mo8107()) {
            linkedHashMap.put("linkPath", c6004.mo8112());
        }
    }
}
