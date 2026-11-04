package l;

/* JADX INFO: renamed from: l.ܿܿۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6IG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18476 {
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m43056(C2551 c2551, InterfaceC23283 interfaceC23283) {
        int iIntValue;
        int iM38286;
        int i = 0;
        if (interfaceC23283.mo45713()) {
            C6434 c6434Mo45711 = interfaceC23283.mo45711();
            int iM16973 = c2551.m16973() + 1;
            C14746 c14746 = new C14746();
            c14746.f48160 = 0;
            Integer num = (Integer) c6434Mo45711.m18211(iM16973, c14746);
            if (num == null) {
                iIntValue = -1;
            } else {
                iIntValue = num.intValue();
            }
        } else {
            iIntValue = -1;
        }
        if (iIntValue == -1) {
            return "";
        }
        int iM16974 = c2551.m16973();
        InterfaceC11653 interfaceC11653M18213 = interfaceC23283.mo45711().m18213(iM16974);
        if (!(interfaceC11653M18213 instanceof C16128) || (iM38286 = ((C16128) interfaceC11653M18213).m38286()) < 0 || iM38286 > iM16974) {
            int iLastIndexOf = interfaceC23283.mo45712().lastIndexOf(10, iM16974);
            if (iLastIndexOf != -1) {
                i = iLastIndexOf + 1;
            }
        } else {
            i = iM16974 - iM38286;
            String strMo45712 = interfaceC23283.mo45712();
            while (i < iM16974 && (strMo45712.charAt(i) == '\n' || strMo45712.charAt(i) == '\r')) {
                i++;
            }
        }
        return iIntValue < i ? "" : interfaceC23283.mo45712().substring(i, iIntValue);
    }
}
