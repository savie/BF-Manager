package l;

/* JADX INFO: renamed from: l.᩻ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21KW */
/* JADX INFO: loaded from: classes.dex */
public final class C24785 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f80229 = 1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4060 f80230;

    public C24785(int i) {
        this.f80230 = new C4060(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m55312(int i, int i2, Object[] objArr) {
        int i3;
        int length = (objArr.length - i) - i2;
        int[] iArr = length == 0 ? C11358.f35770 : new int[length];
        for (int i4 = i; i4 < objArr.length - i2; i4++) {
            Object obj = objArr[i4];
            if (obj == null) {
                i3 = 0;
            } else {
                C4060 c4060 = this.f80230;
                int iMo7848 = c4060.mo7848(obj);
                if (iMo7848 == 0) {
                    int i5 = this.f80229;
                    this.f80229 = i5 + 1;
                    c4060.mo7845(i5, obj);
                    i3 = -i5;
                } else {
                    i3 = iMo7848;
                }
            }
            iArr[i4 - i] = Math.max(i3, -i3);
        }
        return iArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC15224 it = this.f80230.mo7847().iterator();
        while (it.hasNext()) {
            InterfaceC10771 interfaceC10771 = (InterfaceC10771) it.next();
            sb.append(interfaceC10771.mo27440());
            sb.append(": ");
            sb.append(interfaceC10771.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }
}
