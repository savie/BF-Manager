package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3787 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m12320() {
        return C6382.m18134().m49876("protector/tasks/" + C18978.m44077().toLowerCase());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m12318(C6025 c6025) {
        return C6382.m18134().m49876("protector/export/" + C18978.m44077().toLowerCase() + "_" + c6025.f20607 + ".apk");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m12322(C6025 c6025) {
        c6025.f20607.getClass();
        return m12320().m49876(c6025.f20607);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m12319(AbstractC22044 abstractC22044, C6025 c6025) {
        if (c6025.f20607.equals(abstractC22044.getName()) && c6025.f20608.equalsIgnoreCase(C18978.m44077())) {
            return c6025.f20609.equals(C1599.m5611(abstractC22044.m49876("packageLocal"), "MD5"));
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m12317() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC22044 abstractC22044 : m12320().mo4299(true)) {
            if (abstractC22044.mo4281()) {
                AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("info");
                AbstractC22044 abstractC22044M49877 = abstractC22044.m49876("packageLocal");
                AbstractC22044 abstractC22044M49878 = abstractC22044.m49876("packageUpload");
                if (abstractC22044M49876.mo2934() && abstractC22044M49877.mo2934() && abstractC22044M49878.mo2934()) {
                    try {
                        C6025 c6025M17499 = C6025.m17499(abstractC22044M49876.m49865());
                        if (!m12319(abstractC22044, c6025M17499)) {
                            throw new Exception();
                        }
                        if (ServiceC18703.m43501(c6025M17499.f20607)) {
                            c6025M17499.f20612 = -1;
                        } else if (ServiceC18703.f60802.contains(c6025M17499.f20607)) {
                            c6025M17499.f20612 = -2;
                        } else {
                            c6025M17499.f20612 = -3;
                        }
                        arrayList.add(c6025M17499);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m12321() {
        List<C6025> listM46450 = C20195.m46450();
        for (C6025 c6025 : listM46450) {
            AbstractC22044 abstractC22044M12322 = m12322(c6025);
            AbstractC22044 abstractC22044M49876 = abstractC22044M12322.m49876("info");
            AbstractC22044 abstractC22044M49877 = abstractC22044M12322.m49876("packageLocal");
            AbstractC22044 abstractC22044M49878 = abstractC22044M12322.m49876("packageUpload");
            if (!abstractC22044M49876.mo2934() || !abstractC22044M49877.mo2934()) {
                c6025.f20612 = -4;
            } else {
                if (abstractC22044M49878.mo2934()) {
                    abstractC22044M49878.mo4296();
                }
                try {
                    C6025 c6025M17499 = C6025.m17499(abstractC22044M49876.m49865());
                    if (c6025M17499.f20607.equals(c6025.f20607) && m12319(abstractC22044M12322, c6025M17499)) {
                        c6025.f20614 = c6025M17499.f20614;
                        c6025.f20609 = c6025M17499.f20609;
                        c6025.f20616 = c6025M17499.f20616;
                    } else {
                        c6025.f20612 = -4;
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(listM46450);
        return listM46450;
    }
}
