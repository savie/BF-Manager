package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.֡ܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8WX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0486 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f2130 = C6382.f21562.m49876("tc");

    static {
        C21576.m49068(new RunnableC10885(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2344() {
        AbstractC22044 abstractC22044 = f2130;
        abstractC22044.m49876(am.aC).mo4296();
        abstractC22044.m49876("o").mo4296();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m2347(boolean z) throws C3090 {
        AbstractC22044 abstractC22044M49876 = f2130.m49876("o");
        byte[] bArrM33668 = null;
        if (!z && abstractC22044M49876.mo2934()) {
            try {
                C20348 c20348M49835 = abstractC22044M49876.m49835();
                if (Math.abs(System.currentTimeMillis() - c20348M49835.readLong()) < 3600000) {
                    bArrM33668 = c20348M49835.m46748();
                }
            } catch (Exception unused) {
            }
        }
        if (bArrM33668 == null) {
            ReentrantLock reentrantLock = C11650.f37690;
            C13778 c13778M8688 = C2592.m8672(4209).m8688();
            if (c13778M8688.m33676()) {
                bArrM33668 = c13778M8688.m33668();
                try {
                    C6178 c6178 = new C6178();
                    c6178.m17803(System.currentTimeMillis());
                    c6178.m17806(bArrM33668);
                    abstractC22044M49876.m49844(c6178);
                } catch (Exception unused2) {
                }
            } else {
                throw new C3090(C1364.m5010(c13778M8688, R.string.MT_Protector));
            }
        }
        C20348 c20348M46740 = C20348.m46740(bArrM33668);
        ArrayList arrayList = new ArrayList();
        int i = c20348M46740.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C22861(c20348M46740));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m2343(boolean z) throws C3090 {
        AbstractC22044 abstractC22044M49876 = f2130.m49876(am.aC);
        byte[] bArrM33668 = null;
        if (!z && abstractC22044M49876.mo2934()) {
            try {
                C20348 c20348M49835 = abstractC22044M49876.m49835();
                if (Math.abs(System.currentTimeMillis() - c20348M49835.readLong()) < 3600000) {
                    bArrM33668 = c20348M49835.m46748();
                }
            } catch (Exception unused) {
            }
        }
        if (bArrM33668 == null) {
            ReentrantLock reentrantLock = C11650.f37690;
            C2592 c2592M8672 = C2592.m8672(4199);
            C13778 c13778M8688 = C18978.m44079() ? c2592M8672.m8688() : c2592M8672.m8682();
            if (c13778M8688.m33676()) {
                bArrM33668 = c13778M8688.m33668();
                try {
                    C6178 c6178 = new C6178();
                    c6178.m17803(System.currentTimeMillis());
                    c6178.m17806(bArrM33668);
                    abstractC22044M49876.m49844(c6178);
                } catch (Exception unused2) {
                }
            } else {
                throw new C3090(C1364.m5010(c13778M8688, R.string.MT_Protector));
            }
        }
        C20348 c20348M46740 = C20348.m46740(bArrM33668);
        int i = c20348M46740.readInt();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C13164(c20348M46740));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m2346(int i, String str) {
        AbstractC22044 abstractC22044M49876 = f2130.m49876("d" + i);
        if (!abstractC22044M49876.mo2934()) {
            return null;
        }
        try {
            C20348 c20348M49835 = abstractC22044M49876.m49835();
            if (c20348M49835.m46758().equals(str)) {
                return c20348M49835.m46748();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m2345(int i) throws C3090 {
        AbstractC22044 abstractC22044M49876 = f2130.m49876("d" + i);
        ReentrantLock reentrantLock = C11650.f37690;
        C2592 c2592M8672 = C2592.m8672(4200);
        c2592M8672.m8686(i);
        C13778 c13778M8688 = C18978.m44079() ? c2592M8672.m8688() : c2592M8672.m8682();
        if (c13778M8688.m33676()) {
            String[] strArr = {c13778M8688.m33677(), c13778M8688.m33677()};
            byte[] bArrM37705 = C15768.m37705(strArr[0]);
            try {
                abstractC22044M49876.mo49834();
                C6178 c6178 = new C6178();
                c6178.m17800(strArr[1]);
                c6178.m17806(bArrM37705);
                abstractC22044M49876.m49844(c6178);
            } catch (Exception unused) {
            }
            return bArrM37705;
        }
        throw new C3090(C1364.m5010(c13778M8688, R.string.MT_Protector));
    }
}
