package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes5.dex */
public final class C21208 implements InterfaceC14494 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f67691;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f67692;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f67693;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f67694;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f67695;

    public C21208(String str, int i, int i2, boolean z, boolean z2) {
        this.f67691 = i;
        this.f67694 = i2;
        this.f67692 = z;
        this.f67695 = z2;
        this.f67693 = str;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[RETURN] */
    @Override // l.InterfaceC14494
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4022(AbstractC14472 abstractC14472) {
        int i;
        int i2;
        boolean z = this.f67695;
        String strMo1286 = this.f67693;
        if (z && strMo1286 == null) {
            strMo1286 = abstractC14472.mo1286();
        }
        InterfaceC24170 interfaceC24170 = abstractC14472.f59447;
        if (interfaceC24170 != null) {
            Iterator it = interfaceC24170.getChildren().iterator();
            i = 0;
            i2 = 0;
            while (it.hasNext()) {
                AbstractC14472 abstractC14473 = (AbstractC14472) ((C18202) it.next());
                if (abstractC14473 == abstractC14472) {
                    i = i2;
                }
                if (strMo1286 == null || abstractC14473.mo1286().equals(strMo1286)) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 1;
        }
        int i3 = this.f67692 ? i + 1 : i2 - i;
        int i4 = this.f67691;
        int i5 = this.f67694;
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
        String str = this.f67692 ? "" : "last-";
        boolean z = this.f67695;
        int i = this.f67694;
        int i2 = this.f67691;
        return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.f67693) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
