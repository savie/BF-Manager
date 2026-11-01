package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes3.dex */
public final class C10171 implements InterfaceC8760 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f34748;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f34749;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f34750;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f34751;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f34752;

    public C10171(String str, int i, int i2, boolean z, boolean z2) {
        this.f34749 = i;
        this.f34752 = i2;
        this.f34751 = z;
        this.f34748 = z2;
        this.f34750 = str;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[RETURN] */
    @Override // l.InterfaceC8760
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1820(AbstractC8075 abstractC8075) {
        int i;
        int i2;
        boolean z = this.f34748;
        String strMo1944 = this.f34750;
        if (z && strMo1944 == null) {
            strMo1944 = abstractC8075.mo1944();
        }
        InterfaceC17952 interfaceC17952 = abstractC8075.f30201;
        if (interfaceC17952 != null) {
            Iterator it = interfaceC17952.getChildren().iterator();
            i = 0;
            i2 = 0;
            while (it.hasNext()) {
                AbstractC8075 abstractC8076 = (AbstractC8075) ((C8781) it.next());
                if (abstractC8076 == abstractC8075) {
                    i = i2;
                }
                if (strMo1944 == null || abstractC8076.mo1944().equals(strMo1944)) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 1;
        }
        int i3 = this.f34751 ? i + 1 : i2 - i;
        int i4 = this.f34749;
        int i5 = this.f34752;
        if (i4 == 0) {
            if (i3 == i5) {
                return true;
            }
            return false;
        }
        int i6 = i3 - i5;
        if (i6 % i4 == 0 && (Integer.signum(i6) == 0 || Integer.signum(i6) == Integer.signum(i4))) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str = this.f34751 ? "" : "last-";
        boolean z = this.f34748;
        int i = this.f34752;
        int i2 = this.f34749;
        return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.f34750) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
