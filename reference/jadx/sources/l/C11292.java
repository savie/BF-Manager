package l;

/* JADX INFO: renamed from: l.ۧ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21KW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11292 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38129 = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6644 f38130;

    public C11292(int i) {
        this.f38130 = new C6644(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m28303(int i, int i2, Object[] objArr) {
        int i3;
        int length = (objArr.length - i) - i2;
        int[] iArr = length == 0 ? C6352.f21412 : new int[length];
        for (int i4 = i; i4 < objArr.length - i2; i4++) {
            Object obj = objArr[i4];
            if (obj == null) {
                i3 = 0;
            } else {
                C6644 c6644 = this.f38130;
                int iMo18022 = c6644.mo18022(obj);
                if (iMo18022 == 0) {
                    int i5 = this.f38129;
                    this.f38129 = i5 + 1;
                    c6644.mo18019(i5, obj);
                    i3 = -i5;
                } else {
                    i3 = iMo18022;
                }
            }
            iArr[i4 - i] = Math.max(i3, -i3);
        }
        return iArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC6269 it = this.f38130.mo17317().iterator();
        while (it.hasNext()) {
            InterfaceC12599 interfaceC12599 = (InterfaceC12599) it.next();
            sb.append(interfaceC12599.mo7336());
            sb.append(": ");
            sb.append(interfaceC12599.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }
}
