package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܽ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6BDM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16665 extends AbstractC23721 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Comparator f53427 = new C20193();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f53428;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f53429;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC0436 f53430;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f53431;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized AbstractC12432 m39130(AbstractC12432 abstractC12432) {
        m52249();
        AbstractC12432 abstractC12433 = (AbstractC12432) this.f53431.get(abstractC12432);
        if (abstractC12433 != null) {
            return abstractC12433;
        }
        m39128(abstractC12432);
        this.f53431.put(abstractC12432, abstractC12432);
        return abstractC12432;
    }

    public C16665(String str, C4669 c4669, int i, EnumC0436 enumC0436) {
        super(str, c4669, i);
        this.f53428 = new ArrayList(100);
        this.f53431 = new HashMap(100);
        this.f53430 = enumC0436;
        this.f53429 = -1;
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۖ */
    public final Collection mo12263() {
        return this.f53428;
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۘ */
    public final int mo14219() {
        m52243();
        return this.f53429;
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ۙ */
    public final int mo14220(AbstractC21603 abstractC21603) {
        return ((AbstractC12432) abstractC21603).m30904();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39128(AbstractC12432 abstractC12432) {
        m52249();
        try {
            if (abstractC12432.m30900() > m52244()) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f53428.add(abstractC12432);
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39127(C2718 c2718, EnumC18075 enumC18075) {
        m52243();
        TreeMap treeMap = new TreeMap();
        for (AbstractC12432 abstractC12432 : this.f53428) {
            if (abstractC12432.mo4170() == enumC18075) {
                treeMap.put(abstractC12432.mo6991(), abstractC12432);
            }
        }
        if (treeMap.size() == 0) {
            return;
        }
        c2718.m8283(0, "\nmethod code index:\n\n");
        for (Map.Entry entry : treeMap.entrySet()) {
            c2718.m8283(0, ((AbstractC12432) entry.getValue()).m30901() + ' ' + ((String) entry.getKey()) + '\n');
        }
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ᩹ */
    public final void mo14222() {
        C4669 c4669M52251 = m52251();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f53428;
            int size = arrayList.size();
            if (i >= size) {
                return;
            }
            while (i < size) {
                ((AbstractC12432) arrayList.get(i)).mo4171(c4669M52251);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m39129() {
        m52243();
        int iOrdinal = this.f53430.ordinal();
        ArrayList arrayList = this.f53428;
        if (iOrdinal == 1) {
            Collections.sort(arrayList, f53427);
        } else if (iOrdinal == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int iMo9739 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC12432 abstractC12432 = (AbstractC12432) arrayList.get(i);
            try {
                int iM30902 = abstractC12432.m30902(this, iMo9739);
                if (iM30902 < iMo9739) {
                    throw new RuntimeException("bogus place() result for " + abstractC12432);
                }
                iMo9739 = abstractC12432.mo9739() + iM30902;
            } catch (RuntimeException e) {
                throw C7513.m20020("...while placing " + abstractC12432, e);
            }
        }
        this.f53429 = iMo9739;
    }

    @Override // l.AbstractC23721
    /* JADX INFO: renamed from: ܰ */
    public final void mo14221(C2718 c2718) {
        boolean zM8288 = c2718.m8288();
        C4669 c4669M52251 = m52251();
        int iMo9739 = 0;
        boolean z = true;
        for (AbstractC12432 abstractC12432 : this.f53428) {
            if (zM8288) {
                if (z) {
                    z = false;
                } else {
                    c2718.m8283(0, "\n");
                }
            }
            int iM30900 = abstractC12432.m30900() - 1;
            int i = (~iM30900) & (iMo9739 + iM30900);
            if (iMo9739 != i) {
                c2718.m8281(i - iMo9739);
                iMo9739 = i;
            }
            abstractC12432.mo9738(c4669M52251, c2718);
            iMo9739 += abstractC12432.mo9739();
        }
        if (iMo9739 != this.f53429) {
            throw new RuntimeException("output size mismatch");
        }
    }
}
