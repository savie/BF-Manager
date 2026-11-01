package l;

import java.util.ArrayList;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ܿ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BDT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17370 implements InterfaceC19653, Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22040 f55269;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20255 f55270;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f55270.compareTo(((C17370) obj).f55270);
    }

    public C17370(C20255 c20255, C9424 c9424, C4669 c4669) {
        this.f55270 = c20255;
        int size = c9424.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C8553(new C19136(c9424.get(i), c4669)));
        }
        this.f55269 = new C22040(EnumC18075.TYPE_ANNOTATION_SET_REF_LIST, arrayList);
    }

    public final int hashCode() {
        return this.f55270.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17370)) {
            return false;
        }
        return this.f55270.equals(((C17370) obj).f55270);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40463(C4669 c4669) {
        C15960 c15960M12884 = c4669.m12884();
        C16665 c16665M12878 = c4669.m12878();
        c15960M12884.m37947(this.f55270);
        c16665M12878.m39128((AbstractC12432) this.f55269);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40464(C4669 c4669, C2718 c2718) {
        C15960 c15960M12884 = c4669.m12884();
        C20255 c20255 = this.f55270;
        int iM37944 = c15960M12884.m37944((AbstractC11788) c20255);
        int iM30904 = this.f55269.m30904();
        if (c2718.m8288()) {
            c2718.m8283(0, ASN1Dump.TAB + c20255.mo2376());
            c2718.m8283(4, "      method_idx:      ".concat(C22475.m49978(iM37944)));
            c2718.m8283(4, "      annotations_off: ".concat(C22475.m49978(iM30904)));
        }
        c2718.m8289(iM37944);
        c2718.m8289(iM30904);
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f55270.mo2376());
        sb.append(": ");
        boolean z = true;
        for (C8553 c8553 : (ArrayList) this.f55269.m48957()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c8553.mo6991());
        }
        return sb.toString();
    }
}
