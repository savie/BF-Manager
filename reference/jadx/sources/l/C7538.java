package l;

import com.google.android.material.motion.MotionUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۟֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7538 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m20601(InterfaceC2386 interfaceC2386) {
        String str;
        HashMap map = new HashMap();
        map.put("name", interfaceC2386.getName());
        map.put("isFile", Boolean.valueOf(interfaceC2386.mo8090()));
        map.put("isLink", Boolean.valueOf(interfaceC2386.mo8107()));
        map.put("recyclable", Boolean.valueOf(C8284.m22372(interfaceC2386.mo8093())));
        if (interfaceC2386.mo8107()) {
            map.put("linkPath", interfaceC2386.mo8112());
        }
        if (interfaceC2386.mo8090()) {
            map.put("size", Long.valueOf(interfaceC2386.getSize()));
        } else {
            map.put("size", -1);
        }
        int i = C0080.f987;
        map.put(MotionUtils.EASING_TYPE_PATH, interfaceC2386.isDirectory() ? interfaceC2386.mo8105() : interfaceC2386.getPath());
        map.put("mime", interfaceC2386.mo8114());
        map.put("time", C22482.m50718(interfaceC2386.getTime()));
        if (interfaceC2386.isDirectory()) {
            str = C20613.f66109.f66116;
        } else {
            str = interfaceC2386.mo8091().m23976().f66116;
        }
        map.put("typeIcon", str);
        C20963 c20963M1143 = C0080.m1143(interfaceC2386);
        if (c20963M1143 != null) {
            map.put("dynamicIconHint", c20963M1143);
        }
        return map;
    }
}
