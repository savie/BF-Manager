package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77BL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6287 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m17970(C3767 c3767) {
        String strM53547 = C23991.m53547(c3767, MotionUtils.EASING_TYPE_PATH);
        boolean z = false;
        if (strM53547 == null || strM53547.isEmpty()) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        String strM20187 = AbstractC7364.m20187(strM53547);
        ArrayList arrayListMo20830 = C11969.f38536.mo20830(strM20187, C20174.m46411());
        if (arrayListMo20830.isEmpty() && !C14584.m35193(strM20187, new String[0]).mo2934()) {
            return C12802.m31751(EnumC21667.NOT_FOUND, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        if (!C20174.m46415()) {
            C1170.removeIf(arrayListMo20830, new C17547(2));
        }
        C9774 c9774M3316 = C0826.m3316(strM20187);
        if (c9774M3316 == null) {
            String strM53548 = C23991.m53547(c3767, "sortMethod");
            String strM53549 = C23991.m53547(c3767, "sortReverse");
            if (strM53548 == null && strM53549 == null) {
                c9774M3316 = new C9774(0, false);
            } else {
                if (strM53548 == null) {
                    return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "sortMethod"));
                }
                if (strM53549 == null) {
                    return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "sortReverse"));
                }
                try {
                    int iM3317 = C0826.m3317(strM53548);
                    try {
                        if ("true".equals(strM53549)) {
                            z = true;
                        } else if (!"false".equals(strM53549)) {
                            throw C21203.m48365((RuntimeException) new IllegalArgumentException("invalid boolean"));
                        }
                        c9774M3316 = new C9774(iM3317, z);
                    } catch (RuntimeException unused) {
                        return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "sortReverse"));
                    }
                } catch (RuntimeException unused2) {
                    return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "sortMethod"));
                }
            }
        }
        C14118.m34287(arrayListMo20830, c9774M3316.f31510, c9774M3316.f31511);
        ArrayList arrayList = new ArrayList(arrayListMo20830.size());
        Iterator it = arrayListMo20830.iterator();
        while (it.hasNext()) {
            arrayList.add(C7538.m20601((InterfaceC2386) it.next()));
        }
        HashMap map = new HashMap();
        map.put(MotionUtils.EASING_TYPE_PATH, strM20187);
        map.put("files", arrayList);
        return C12802.m31750(map);
    }
}
