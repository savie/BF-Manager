package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes2.dex */
public final class C0292 implements InterfaceC8760 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1610;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f1611;

    public C0292(boolean z, String str) {
        this.f1610 = z;
        this.f1611 = str;
    }

    @Override // l.InterfaceC8760
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1820(AbstractC8075 abstractC8075) {
        int i;
        boolean z = this.f1610;
        String strMo1944 = this.f1611;
        if (z && strMo1944 == null) {
            strMo1944 = abstractC8075.mo1944();
        }
        InterfaceC17952 interfaceC17952 = abstractC8075.f30201;
        if (interfaceC17952 != null) {
            Iterator it = interfaceC17952.getChildren().iterator();
            i = 0;
            while (it.hasNext()) {
                AbstractC8075 abstractC8076 = (AbstractC8075) ((C8781) it.next());
                if (strMo1944 == null || abstractC8076.mo1944().equals(strMo1944)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.f1610 ? C16523.m38890("only-of-type <", this.f1611, ">") : "only-child";
    }
}
