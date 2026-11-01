package l;

/* JADX INFO: renamed from: l.ۢۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBHG */
/* JADX INFO: loaded from: classes4.dex */
public final class C9300 extends C5541 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m23872() {
        int size = size();
        int iMo2281 = 2;
        for (int i = 0; i < size; i++) {
            iMo2281 += ((InterfaceC5771) m15249(i)).mo2281();
        }
        return iMo2281;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5771 m23873(String str) {
        int size = size();
        for (int i = 0; i < size; i++) {
            InterfaceC5771 interfaceC5771 = (InterfaceC5771) m15249(i);
            if (interfaceC5771.getName().equals(str)) {
                return interfaceC5771;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5771 m23871(AbstractC1100 abstractC1100) {
        InterfaceC5771 interfaceC5771;
        int size = size();
        int i = 0;
        while (i < size) {
            if (((InterfaceC5771) m15249(i)) == abstractC1100) {
                String name = abstractC1100.getName();
                do {
                    i++;
                    if (i >= size) {
                        return null;
                    }
                    interfaceC5771 = (InterfaceC5771) m15249(i);
                } while (!interfaceC5771.getName().equals(name));
                return interfaceC5771;
            }
            i++;
        }
        return null;
    }
}
