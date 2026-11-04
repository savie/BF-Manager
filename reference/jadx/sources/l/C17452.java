package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54PW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17452 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7757[] f56762 = {null, null, null, null, null, null, new C7757(0), new C7757(0), new C7757(0), new C7757(0), new C7757(0), new C7757(0), new C7757(0), new C7757(0), new C7757(0), new C7757(0), null, null};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f56763 = new int[18];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f56764 = new int[18];

    public C17452() {
        for (int i = 0; i < 18; i++) {
            this.f56763[i] = -1;
            this.f56764[i] = -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10739 m40951(EnumC15214 enumC15214, int i) {
        AbstractC10739 abstractC10739 = (AbstractC10739) this.f56762[enumC15214.f49670].m21127(i);
        if (abstractC10739 != null) {
            return abstractC10739;
        }
        throw new C14468(String.format("Could not find the %s item at offset %#x", enumC15214.f49668, Integer.valueOf(i)), null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC10739 m40955(EnumC15214 enumC15214, int i) {
        AbstractC10739 abstractC10739 = (AbstractC10739) this.f56762[enumC15214.f49670].m21127(i);
        if (abstractC10739 != null || i == 0) {
            return abstractC10739;
        }
        throw new C14468(String.format("Could not find the %s item at offset %#x", enumC15214.f49668, Integer.valueOf(i)), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40952(EnumC15214 enumC15214, int i, int i2) {
        int i3 = enumC15214.f49670;
        int[] iArr = this.f56763;
        int i4 = iArr[i3];
        if (i4 == -1) {
            iArr[i3] = i;
        } else if (i4 != i) {
            throw new RuntimeException("The section size in the header and map for item type " + enumC15214 + " do not match");
        }
        int[] iArr2 = this.f56764;
        int i5 = iArr2[i3];
        if (i5 == -1) {
            iArr2[i3] = i2;
        } else {
            if (i5 == i2) {
                return;
            }
            throw new RuntimeException("The section offset in the header and map for item type " + enumC15214 + " do not match");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40953(EnumC15214 enumC15214, ArrayList arrayList) {
        C7757 c7757 = this.f56762[enumC15214.f49670];
        c7757.m21125(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC10739 abstractC10739 = (AbstractC10739) it.next();
            c7757.m21126(abstractC10739.f34103, abstractC10739);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m40954(EnumC15214 enumC15214) {
        return this.f56763[enumC15214.f49670];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40950(EnumC15214 enumC15214) {
        return this.f56764[enumC15214.f49670];
    }
}
