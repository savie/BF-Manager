package l;

import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07BN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2400 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m7326(C15530 c15530) {
        boolean zMo33987;
        int i = 0;
        if (!EnumC18351.POST.equals(c15530.m37142())) {
            return C12610.m31384(EnumC10591.METHOD_NOT_ALLOWED, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        try {
            C11574 c11574M7325 = m7325(c15530);
            if (c11574M7325.f38924 == null || c11574M7325.f38924.isEmpty()) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "targetPath"));
            }
            if (c11574M7325.f38925 == null || c11574M7325.f38925.isEmpty()) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "name"));
            }
            if (c11574M7325.f38923 == null) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "isDirectory"));
            }
            if (c11574M7325.f38925.contains("\\") || "/".equals(c11574M7325.f38925)) {
                return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39288(R.string.MT_Protector));
            }
            String strM28608 = AbstractC11462.m28608(c11574M7325.f38924);
            try {
                C2462.m7541(strM28608, EnumC11636.MODIFY_DIRECTORY_LINKED);
                AbstractC20745 abstractC20745M15313 = c11574M7325.f38925.startsWith("/") ? C5553.m15313(c11574M7325.f38925, new String[0]) : C5553.m15313(strM28608, c11574M7325.f38925);
                if (abstractC20745M15313.mo33975()) {
                    return C12610.m31384(EnumC10591.CONFLICT, C16737.m39288(abstractC20745M15313.mo33974() ? R.string.MT_Protector : R.string.MT_Protector));
                }
                if (c11574M7325.f38923.booleanValue()) {
                    zMo33987 = abstractC20745M15313.mo33987();
                } else {
                    AbstractC20745 abstractC20745M46689 = abstractC20745M15313.m46689();
                    zMo33987 = (abstractC20745M46689 == null || abstractC20745M46689.mo33975() || abstractC20745M46689.mo33987()) && abstractC20745M15313.mo33978();
                }
                if (!zMo33987) {
                    RunnableC15163 runnableC15163 = new RunnableC15163(0);
                    if (C13890.m33728()) {
                        C21094.m47530();
                    } else {
                        C16737.m39273(runnableC15163);
                    }
                    return C12610.m31384(EnumC10591.INTERNAL_ERROR, C16737.m39264(c11574M7325.f38923.booleanValue() ? R.string.MT_Protector : R.string.MT_Protector, c11574M7325.f38925));
                }
                RunnableC11199 runnableC11199 = new RunnableC11199(i, abstractC20745M15313);
                if (C13890.m33728()) {
                    runnableC11199.run();
                } else {
                    C16737.m39273(runnableC11199);
                }
                HashMap map = new HashMap();
                map.put("item", C3811.m11101(new C6794(abstractC20745M15313)));
                map.put("parentPath", abstractC20745M15313.getParent());
                return C12610.m31383(map);
            } catch (C4987 e) {
                return C12610.m31384(EnumC10591.CONFLICT, e.getMessage());
            }
        } catch (IOException | RuntimeException | C21173 unused) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C11574 m7325(C15530 c15530) {
        JSONObject jSONObjectM32824 = C13316.m32824(c15530);
        C11574 c11574 = new C11574();
        c11574.f38924 = C13316.m32829(jSONObjectM32824, "targetPath");
        c11574.f38925 = C13316.m32829(jSONObjectM32824, "name");
        c11574.f38923 = (jSONObjectM32824.get("isDirectory") == null || jSONObjectM32824.get("isDirectory").isNull()) ? null : Boolean.valueOf(C13316.m32828(jSONObjectM32824, "isDirectory"));
        return c11574;
    }
}
