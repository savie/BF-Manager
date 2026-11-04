package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BFE */
/* JADX INFO: loaded from: classes4.dex */
public final class C9933 extends C12763 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f31870;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9933 m25766(ArrayList arrayList, int i) {
        int size = arrayList.size();
        C9933 c9933 = new C9933(size, i);
        for (int i2 = 0; i2 < size; i2++) {
            c9933.m31596(i2, (AbstractC18884) arrayList.get(i2));
        }
        c9933.mo15005();
        return c9933;
    }

    public C9933(int i, int i2) {
        super(i);
        this.f31870 = i2;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m25769() {
        int size = size();
        if (size == 0) {
            return 0;
        }
        AbstractC18884 abstractC18884 = (AbstractC18884) m31593(size - 1);
        return abstractC18884.mo8331() + abstractC18884.m43804();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25768(C15000 c15000) {
        int iM36122 = c15000.m36122();
        int size = size();
        if (c15000.m36116()) {
            for (int i = 0; i < size; i++) {
                AbstractC18884 abstractC18884 = (AbstractC18884) m31593(i);
                int iMo8331 = abstractC18884.mo8331() * 2;
                String strM53491 = null;
                if (iMo8331 != 0) {
                    int iM36128 = c15000.m36128();
                    String strMo8330 = abstractC18884.mo8330();
                    if (strMo8330 != null) {
                        String str = EnumC7687.f25319 + abstractC18884.m43807() + ": ";
                        int length = str.length();
                        strM53491 = C23952.m53491(str, length, iM36128 == 0 ? strMo8330.length() : iM36128 - length, strMo8330);
                    }
                }
                if (strM53491 != null) {
                    c15000.m36111(iMo8331, strM53491);
                } else if (iMo8331 != 0) {
                    c15000.m36111(iMo8331, "");
                }
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC18884 abstractC18885 = (AbstractC18884) m31593(i2);
            try {
                abstractC18885.mo8329(c15000);
            } catch (RuntimeException e) {
                throw C3880.m12507("...while writing " + abstractC18885, e);
            }
        }
        int iM36123 = (c15000.m36122() - iM36122) / 2;
        if (iM36123 == m25769()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + m25769() + " but actually wrote " + iM36123);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m25767() {
        return this.f31870;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m25770() {
        int iM33501;
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC18884 abstractC18884 = (AbstractC18884) m31593(i2);
            if (abstractC18884 instanceof C18138) {
                AbstractC13487 abstractC13487M42255 = ((C18138) abstractC18884).m42255();
                if (abstractC13487M42255 instanceof AbstractC22657) {
                    iM33501 = ((AbstractC22657) abstractC13487M42255).m51052(abstractC18884.m43802().m3863() == 113).m19309().m33501();
                } else {
                    iM33501 = abstractC13487M42255 instanceof C5503 ? ((C5503) abstractC13487M42255).m16332().m19309().m33501() : 0;
                }
            } else {
                if (!(abstractC18884 instanceof C15679)) {
                    continue;
                } else {
                    if (abstractC18884.m43802().m3863() != 250) {
                        throw new RuntimeException("Expecting invoke-polymorphic");
                    }
                    iM33501 = ((C7740) ((C15679) abstractC18884).m37451(1)).m21068().m19309().m33501() + 1;
                }
            }
            if (iM33501 > i) {
                i = iM33501;
            }
        }
        return i;
    }
}
