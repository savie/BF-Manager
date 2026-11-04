package l;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۨ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBAU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12696 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12171 f40665;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f40666;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9757 f40667;

    public C12696(C9757 c9757, int[] iArr, C12171 c12171) {
        if (iArr == null) {
            throw new NullPointerException("order == null");
        }
        if (c12171 == null) {
            throw new NullPointerException("addresses == null");
        }
        this.f40667 = c9757;
        this.f40666 = iArr;
        this.f40665 = c12171;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m31491() {
        C14978 c14978M25432 = this.f40667.m25432();
        int size = c14978M25432.size();
        for (int i = 0; i < size; i++) {
            if (c14978M25432.m31620get(i).m50594().mo7781().size() != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet m31492() {
        HashSet hashSet = new HashSet(20);
        C14978 c14978M25432 = this.f40667.m25432();
        int size = c14978M25432.size();
        for (int i = 0; i < size; i++) {
            InterfaceC11050 interfaceC11050Mo7781 = c14978M25432.m31620get(i).m50594().mo7781();
            int size2 = interfaceC11050Mo7781.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashSet.add(interfaceC11050Mo7781.getType(i2));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14408 m31490() {
        int[] iArr;
        C24106 c24106;
        C12696 c12696 = this;
        int[] iArr2 = c12696.f40666;
        int length = iArr2.length;
        C14978 c14978M25432 = c12696.f40667.m25432();
        ArrayList arrayList = new ArrayList(length);
        C24106 c24107 = C24106.f77933;
        C22438 c22438 = null;
        C22438 c22439 = null;
        int i = 0;
        while (true) {
            C12171 c12171 = c12696.f40665;
            if (i < length) {
                C22438 c22438M36044 = c14978M25432.m36044(iArr2[i]);
                if (c22438M36044.m50595()) {
                    C24698 c24698M50590 = c22438M36044.m50590();
                    int size = c24698M50590.size();
                    int iM50593 = c22438M36044.m50593();
                    InterfaceC11050 interfaceC11050Mo7781 = c22438M36044.m50594().mo7781();
                    int size2 = interfaceC11050Mo7781.size();
                    if (size2 == 0) {
                        c24106 = C24106.f77933;
                        iArr = iArr2;
                    } else if ((iM50593 != -1 || size == size2) && (iM50593 == -1 || (size == size2 + 1 && iM50593 == c24698M50590.get(size2)))) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            if (interfaceC11050Mo7781.getType(i2).equals(C5085.f17733)) {
                                size2 = i2 + 1;
                                break;
                            }
                        }
                        C24106 c24108 = new C24106(size2);
                        int i3 = 0;
                        while (i3 < size2) {
                            c24108.m53655(i3, new C1028(interfaceC11050Mo7781.getType(i3)), c12171.m30436(c24698M50590.get(i3)).m43804());
                            i3++;
                            iArr2 = iArr2;
                        }
                        iArr = iArr2;
                        c24108.mo15005();
                        c24106 = c24108;
                    } else {
                        throw new RuntimeException("shouldn't happen: weird successors list");
                    }
                    if (c24107.size() != 0) {
                        if (c24107.equals(c24106)) {
                            if (c22438 == null) {
                                throw new NullPointerException("start == null");
                            }
                            if (c12171.m30437(c22438M36044).m43804() - c12171.m30439(c22438).m43804() <= 65535) {
                                c22439 = c22438M36044;
                            }
                        }
                        if (c24107.size() != 0) {
                            arrayList.add(new C3968(c12171.m30439(c22438).m43804(), c12171.m30437(c22439).m43804(), c24107));
                        }
                        c22438 = c22438M36044;
                        c22439 = c22438;
                        c24107 = c24106;
                    } else {
                        c22438 = c22438M36044;
                        c22439 = c22438;
                        c24107 = c24106;
                    }
                } else {
                    iArr = iArr2;
                }
                i++;
                c12696 = this;
                iArr2 = iArr;
            } else {
                if (c24107.size() != 0) {
                    arrayList.add(new C3968(c12171.m30439(c22438).m43804(), c12171.m30437(c22439).m43804(), c24107));
                }
                int size3 = arrayList.size();
                if (size3 != 0) {
                    C14408 c14408 = new C14408(size3);
                    for (int i4 = 0; i4 < size3; i4++) {
                        c14408.m31597(i4, (C3968) arrayList.get(i4));
                    }
                    c14408.mo15005();
                    return c14408;
                }
                return C14408.f45407;
            }
        }
    }
}
