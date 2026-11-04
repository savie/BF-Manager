package l;

/* JADX INFO: renamed from: l.ܶۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LC51 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15989 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m38121(int i, Object obj) {
        int iMo2104;
        if (obj instanceof InterfaceC18711) {
            if (obj instanceof InterfaceC22703) {
                iMo2104 = ((InterfaceC22703) obj).mo2104();
            } else if (obj instanceof InterfaceC19479) {
                iMo2104 = 0;
            } else if (obj instanceof InterfaceC3071) {
                iMo2104 = 1;
            } else if (obj instanceof InterfaceC23955) {
                iMo2104 = 2;
            } else if (obj instanceof InterfaceC3817) {
                iMo2104 = 3;
            } else if (obj instanceof InterfaceC14257) {
                iMo2104 = 4;
            } else if (obj instanceof InterfaceC20971) {
                iMo2104 = 5;
            } else if (obj instanceof InterfaceC17987) {
                iMo2104 = 6;
            } else if (obj instanceof InterfaceC0088) {
                iMo2104 = 7;
            } else if (obj instanceof InterfaceC7546) {
                iMo2104 = 8;
            } else if (obj instanceof InterfaceC18733) {
                iMo2104 = 9;
            } else if (obj instanceof InterfaceC15003) {
                iMo2104 = 10;
            } else if (obj instanceof InterfaceC12766) {
                iMo2104 = 11;
            } else if (obj instanceof InterfaceC5309) {
                iMo2104 = 12;
            } else if (obj instanceof InterfaceC1580) {
                iMo2104 = 13;
            } else if (obj instanceof InterfaceC11274) {
                iMo2104 = 14;
            } else if (obj instanceof InterfaceC24701) {
                iMo2104 = 15;
            } else if (obj instanceof InterfaceC16495) {
                iMo2104 = 16;
            } else if (obj instanceof InterfaceC17241) {
                iMo2104 = 17;
            } else if (obj instanceof InterfaceC15749) {
                iMo2104 = 18;
            } else if (obj instanceof InterfaceC23209) {
                iMo2104 = 19;
            } else if (obj instanceof InterfaceC20225) {
                iMo2104 = 20;
            } else if (obj instanceof InterfaceC12020) {
                iMo2104 = 21;
            } else {
                iMo2104 = obj instanceof InterfaceC6055 ? 22 : -1;
            }
            if (iMo2104 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38120(int i, Object obj) {
        if (obj == null || m38121(i, obj)) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(C20196.m46451(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", "kotlin.jvm.functions.Function" + i));
        C15243.m36588((RuntimeException) classCastException, C15989.class.getName());
        throw classCastException;
    }
}
