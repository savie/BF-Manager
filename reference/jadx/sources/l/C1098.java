package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes2.dex */
public final class C1098 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m4102(InterfaceC3609 interfaceC3609) {
        C11018 c11018 = new C11018(256);
        c11018.writeInt(1);
        c11018.m27784(interfaceC3609.mo7644());
        c11018.m27784(interfaceC3609.mo7649());
        c11018.m27784(interfaceC3609.mo7648());
        c11018.m27784(interfaceC3609.mo7646());
        c11018.writeInt(interfaceC3609.getParent());
        ArrayList<InterfaceC9961> arrayList = new ArrayList(interfaceC3609.mo7647());
        Iterator it = interfaceC3609.values().iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC9961) it.next());
        }
        if (!interfaceC3609.mo7644() ? false : "style".equals(C21291.m47740(interfaceC3609.getType().getTypeName()))) {
            C23846.sort(arrayList, C7618.comparingInt(new C13800(0)));
        }
        c11018.writeInt(arrayList.size());
        for (InterfaceC9961 interfaceC9961 : arrayList) {
            c11018.writeInt(interfaceC9961.mo25193());
            c11018.writeInt(interfaceC9961.mo25192());
            if (interfaceC9961.mo25185() && interfaceC9961.mo25187() != null) {
                c11018.writeInt(0);
                c11018.m27784(true);
                InterfaceC12078 interfaceC12078Mo25187 = interfaceC9961.mo25187();
                c11018.m27782((CharSequence) interfaceC12078Mo25187.getValue());
                C15606[] c15606ArrMo11444 = interfaceC12078Mo25187.mo11444();
                c11018.writeInt(c15606ArrMo11444 == null ? 0 : c15606ArrMo11444.length);
                if (c15606ArrMo11444 != null) {
                    for (C15606 c15606 : c15606ArrMo11444) {
                        c11018.m27776(c15606.f50740);
                        c11018.writeInt(c15606.f50741);
                        c11018.writeInt(c15606.f50739);
                    }
                }
            } else {
                c11018.writeInt(interfaceC9961.getValue());
                c11018.writeByte(0);
            }
        }
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4099(byte[] bArr) {
        return C22253.m49424(C22253.m49425().digest(bArr)).substring(0, 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2509 m4100(InterfaceC12783 interfaceC12783, int i, byte[] bArr) throws C12731 {
        C5332 c5332;
        try {
            C17367 c17367 = new C17367(bArr);
            if (c17367.readInt() != 1) {
                throw new IOException("Unsupported resource entry payload version");
            }
            boolean zM40461 = c17367.m40461();
            boolean zM40462 = c17367.m40461();
            boolean zM40463 = c17367.m40461();
            boolean zM40464 = c17367.m40461();
            int i2 = c17367.readInt();
            int i3 = c17367.readInt();
            if (i3 >= 0) {
                int i4 = 100000;
                if (i3 <= 100000) {
                    ArrayList arrayList = new ArrayList(i3);
                    C2509 c2509 = new C2509(interfaceC12783, i, zM40461, zM40462, zM40463, zM40464, i2, arrayList);
                    int i5 = 0;
                    while (i5 < i3) {
                        int i6 = c17367.readInt();
                        int i7 = c17367.readInt();
                        int i8 = c17367.readInt();
                        if (c17367.m40461()) {
                            String strM40442 = c17367.m40442();
                            int i9 = c17367.readInt();
                            if (i9 < 0 || i9 > i4) {
                                throw new IOException("Invalid resource entry payload style count");
                            }
                            C15606[] c15606Arr = new C15606[i9];
                            for (int i10 = 0; i10 < i9; i10++) {
                                c15606Arr[i10] = new C15606(c17367.m40459(), c17367.readInt(), c17367.readInt());
                            }
                            c5332 = new C5332(strM40442, c15606Arr);
                        } else {
                            c5332 = null;
                        }
                        arrayList.add(new C22266(c2509, i6, i7, i8, c5332));
                        i5++;
                        i4 = 100000;
                    }
                    if (c17367.available() == 0) {
                        return c2509;
                    }
                    throw new IOException("Trailing resource entry payload bytes");
                }
            }
            throw new IOException("Invalid resource entry payload value count");
        } catch (Exception e) {
            throw C12731.m31630("RESOURCE_PATCH_CORRUPT", e.getMessage() == null ? "Resource patch is corrupt." : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4101(C22785 c22785, C17763 c17763) throws C12731 {
        boolean zM41330 = c17763.m41330();
        byte[] bArr = c17763.f56349;
        String str = c17763.f56348;
        int i = c17763.f56352;
        C7262 c7262 = null;
        C11683 c11683 = null;
        if (zM41330) {
            try {
                for (C7262 c7263 : c22785.mo17615()) {
                    if (c7263.mo19106() == (i >>> 24)) {
                        c7262 = c7263;
                        break;
                    }
                }
                if (c7262 == null) {
                    throw new IOException("Resource patch package is missing");
                }
                C0206 c0206M19392 = c7262.m19392((i >>> 16) & 255, c17763.f56345);
                int i2 = i & 65535;
                c0206M19392.m1526(i2, c17763.f56351, false);
                if ("default".equals(str)) {
                    str = "";
                }
                C21373 c21373M1523 = c0206M19392.m1523(C15916.m37840(str, c7262.mo19107()));
                if (c21373M1523.mo31756(i2)) {
                    throw new IOException("Added resource variant already exists");
                }
                c21373M1523.m47902(i2).m42940((InterfaceC3609) m4100(c21373M1523, i2, bArr));
                return;
            } catch (C12731 e) {
                throw e;
            } catch (Exception e2) {
                throw C12731.m31630("RESOURCE_PATCH_CORRUPT", e2.getMessage() == null ? "Resource patch is corrupt." : e2.getMessage());
            }
        }
        int i3 = (i >>> 24) & 255;
        int i4 = (i >>> 16) & 255;
        int i5 = i & 65535;
        loop0: for (C7262 c7264 : c22785.mo17615()) {
            if (c7264.mo19106() == i3) {
                for (C0206 c0206 : c7264.mo19112()) {
                    if (c0206.mo26942() == i4) {
                        for (C21373 c21373 : c0206.mo25271()) {
                            if (C21291.m47741(c21373).equals(str) && c21373.mo31756(i5)) {
                                c11683 = new C11683(c21373);
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        if (c11683 != null) {
            C21373 c21374 = c11683.f39293;
            C2509 c2509M4100 = m4100(c21374, i5, bArr);
            c21374.m47901(i5);
            c21374.m47902(i5).m42940((InterfaceC3609) c2509M4100);
            return;
        }
        throw C12731.m31630("RESOURCE_PATCH_CORRUPT", "Resource patch target is missing from base resources.arsc.");
    }
}
