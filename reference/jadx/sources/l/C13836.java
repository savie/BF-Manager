package l;

/* JADX INFO: renamed from: l.۬ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBHG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13836 extends C12763 {
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m33787() {
        int size = size();
        int iMo1345 = 2;
        for (int i = 0; i < size; i++) {
            iMo1345 += ((InterfaceC1159) m31593(i)).mo1345();
        }
        return iMo1345;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC1159 m33788(String str) {
        int size = size();
        for (int i = 0; i < size; i++) {
            InterfaceC1159 interfaceC1159 = (InterfaceC1159) m31593(i);
            if (interfaceC1159.getName().equals(str)) {
                return interfaceC1159;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1159 m33786(AbstractC5875 abstractC5875) {
        InterfaceC1159 interfaceC1159;
        int size = size();
        int i = 0;
        while (i < size) {
            if (((InterfaceC1159) m31593(i)) == abstractC5875) {
                String name = abstractC5875.getName();
                do {
                    i++;
                    if (i >= size) {
                        return null;
                    }
                    interfaceC1159 = (InterfaceC1159) m31593(i);
                } while (!interfaceC1159.getName().equals(name));
                return interfaceC1159;
            }
            i++;
        }
        return null;
    }
}
