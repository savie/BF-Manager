package l;

import com.google.android.material.motion.MotionUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87BW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3811 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m11101(InterfaceC2557 interfaceC2557) {
        String str;
        HashMap map = new HashMap();
        map.put("name", interfaceC2557.getName());
        map.put("isFile", Boolean.valueOf(interfaceC2557.mo7985()));
        map.put("isLink", Boolean.valueOf(interfaceC2557.mo7986()));
        map.put("recyclable", Boolean.valueOf(C18629.m43077(interfaceC2557.mo7989())));
        if (interfaceC2557.mo7986()) {
            map.put("linkPath", interfaceC2557.mo7978());
        }
        if (interfaceC2557.mo7985()) {
            map.put("size", Long.valueOf(interfaceC2557.getSize()));
        } else {
            map.put("size", -1);
        }
        int i = C12985.f43309;
        map.put(MotionUtils.EASING_TYPE_PATH, interfaceC2557.isDirectory() ? interfaceC2557.mo7979() : interfaceC2557.getPath());
        map.put("mime", interfaceC2557.mo7967());
        map.put("time", C5319.m14744(interfaceC2557.getTime()));
        if (interfaceC2557.isDirectory()) {
            str = C0690.f2900.f2942;
        } else {
            str = interfaceC2557.mo7972().m48181().f2942;
        }
        map.put("typeIcon", str);
        C22157 c22157M32111 = C12985.m32111(interfaceC2557);
        if (c22157M32111 != null) {
            map.put("dynamicIconHint", c22157M32111);
        }
        return map;
    }
}
