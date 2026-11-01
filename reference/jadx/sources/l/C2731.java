package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77BL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2731 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m8340(C15530 c15530) {
        String strM14444 = C5244.m14444(c15530, MotionUtils.EASING_TYPE_PATH);
        boolean z = false;
        if (strM14444 == null || strM14444.isEmpty()) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        String strM28608 = AbstractC11462.m28608(strM14444);
        ArrayList arrayListMo10263 = C21611.f70098.mo10263(strM28608, C5383.m14951());
        if (arrayListMo10263.isEmpty() && !C5553.m15313(strM28608, new String[0]).mo33975()) {
            return C12610.m31384(EnumC10591.NOT_FOUND, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        if (!C5383.m14954()) {
            C9030.removeIf(arrayListMo10263, new C11905());
        }
        C22863 c22863M36178 = C15102.m36178(strM28608);
        if (c22863M36178 == null) {
            String strM14445 = C5244.m14444(c15530, "sortMethod");
            String strM14446 = C5244.m14444(c15530, "sortReverse");
            if (strM14445 == null && strM14446 == null) {
                c22863M36178 = new C22863(0, false);
            } else {
                if (strM14445 == null) {
                    return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "sortMethod"));
                }
                if (strM14446 == null) {
                    return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "sortReverse"));
                }
                try {
                    int iM36179 = C15102.m36179(strM14445);
                    try {
                        if ("true".equals(strM14446)) {
                            z = true;
                        } else if (!"false".equals(strM14446)) {
                            throw C13316.m32827((RuntimeException) new IllegalArgumentException("invalid boolean"));
                        }
                        c22863M36178 = new C22863(iM36179, z);
                    } catch (RuntimeException unused) {
                        return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "sortReverse"));
                    }
                } catch (RuntimeException unused2) {
                    return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "sortMethod"));
                }
            }
        }
        C3386.m10046(arrayListMo10263, c22863M36178.f74365, c22863M36178.f74366);
        ArrayList arrayList = new ArrayList(arrayListMo10263.size());
        Iterator it = arrayListMo10263.iterator();
        while (it.hasNext()) {
            arrayList.add(C3811.m11101((InterfaceC2557) it.next()));
        }
        HashMap map = new HashMap();
        map.put(MotionUtils.EASING_TYPE_PATH, strM28608);
        map.put("files", arrayList);
        return C12610.m31383(map);
    }
}
