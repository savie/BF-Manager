package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54PW */
/* JADX INFO: loaded from: classes2.dex */
public final class C6187 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1123[] f21058 = {null, null, null, null, null, null, new C1123(0), new C1123(0), new C1123(0), new C1123(0), new C1123(0), new C1123(0), new C1123(0), new C1123(0), new C1123(0), new C1123(0), null, null};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f21059 = new int[18];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f21060 = new int[18];

    public C6187() {
        for (int i = 0; i < 18; i++) {
            this.f21059[i] = -1;
            this.f21060[i] = -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9011 m17183(EnumC21004 enumC21004, int i) {
        AbstractC9011 abstractC9011 = (AbstractC9011) this.f21058[enumC21004.f68395].m4151(i);
        if (abstractC9011 != null) {
            return abstractC9011;
        }
        throw new C11708(String.format("Could not find the %s item at offset %#x", enumC21004.f68397, Integer.valueOf(i)), null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC9011 m17187(EnumC21004 enumC21004, int i) {
        AbstractC9011 abstractC9011 = (AbstractC9011) this.f21058[enumC21004.f68395].m4151(i);
        if (abstractC9011 != null || i == 0) {
            return abstractC9011;
        }
        throw new C11708(String.format("Could not find the %s item at offset %#x", enumC21004.f68397, Integer.valueOf(i)), null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17184(EnumC21004 enumC21004, int i, int i2) {
        int i3 = enumC21004.f68395;
        int[] iArr = this.f21059;
        int i4 = iArr[i3];
        if (i4 == -1) {
            iArr[i3] = i;
        } else if (i4 != i) {
            throw new RuntimeException("The section size in the header and map for item type " + enumC21004 + " do not match");
        }
        int[] iArr2 = this.f21060;
        int i5 = iArr2[i3];
        if (i5 == -1) {
            iArr2[i3] = i2;
        } else {
            if (i5 == i2) {
                return;
            }
            throw new RuntimeException("The section offset in the header and map for item type " + enumC21004 + " do not match");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17185(EnumC21004 enumC21004, ArrayList arrayList) {
        C1123 c1123 = this.f21058[enumC21004.f68395];
        c1123.m4149(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC9011 abstractC9011 = (AbstractC9011) it.next();
            c1123.m4150(abstractC9011.f30807, abstractC9011);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m17186(EnumC21004 enumC21004) {
        return this.f21059[enumC21004.f68395];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17182(EnumC21004 enumC21004) {
        return this.f21060[enumC21004.f68395];
    }
}
