package l;

/* JADX INFO: renamed from: l.֨᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A570 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1400 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14077 f4975;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24698 f4976;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10348 f4977;

    public C1400(AbstractC14077 abstractC14077, C10348 c10348, C24698 c24698) {
        if (abstractC14077 == null) {
            throw new NullPointerException("locals == null");
        }
        if (c10348 == null) {
            throw new NullPointerException("stack == null");
        }
        c24698.m46488();
        this.f4975 = abstractC14077;
        this.f4977 = c10348;
        this.f4976 = c24698;
    }

    public C1400(int i, int i2) {
        this(new C22042(i), new C10348(i2), C24698.f79910);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1400 m5110() {
        return new C1400(this.f4975.mo15004(), this.f4977.m26618(), this.f4976);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m5119() {
        this.f4975.mo15005();
        this.f4977.mo15005();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5115(C5085 c5085) {
        this.f4975.mo15006(c5085);
        this.f4977.m26620(c5085);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1400 m5113(C1400 c1400) {
        C24698 c24698;
        AbstractC14077 abstractC14077 = c1400.f4975;
        AbstractC14077 abstractC14078 = this.f4975;
        AbstractC14077 abstractC14077Mo14999 = abstractC14078.mo14999(abstractC14077);
        C10348 c10348 = c1400.f4977;
        C10348 c10349 = this.f4977;
        c10349.getClass();
        try {
            C10348 c10348M7172 = C2083.m7172(c10349, c10348);
            C24698 c24699 = c1400.f4976;
            C24698 c246910 = this.f4976;
            if (c246910.equals(c24699)) {
                c24698 = c246910;
            } else {
                c24698 = new C24698();
                int size = c246910.size();
                int size2 = c24699.size();
                for (int i = 0; i < size && i < size2 && c246910.get(i) == c24699.get(i); i++) {
                    c24698.add(i);
                }
                c24698.mo15005();
            }
            if (abstractC14077Mo14999 instanceof C4888) {
                abstractC14077Mo14999 = (C4888) abstractC14077Mo14999;
                if (c24698.size() == 0) {
                    abstractC14077Mo14999 = abstractC14077Mo14999.mo15003();
                }
            }
            return (abstractC14077Mo14999 == abstractC14078 && c10348M7172 == c10349 && c246910 == c24698) ? this : new C1400(abstractC14077Mo14999, c10348M7172, c24698);
        } catch (C16074 e) {
            e.m12508("underlay stack:");
            c10349.m26616(e);
            e.m12508("overlay stack:");
            c10348.m26616(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1400 m5114(C1400 c1400, int i, int i2) {
        AbstractC14077 abstractC14077 = c1400.f4975;
        AbstractC14077 abstractC14078 = this.f4975;
        C4888 c4888Mo14997 = abstractC14078.mo14997(abstractC14077, i2);
        C10348 c10348 = c1400.f4977;
        C10348 c10349 = this.f4977;
        c10349.getClass();
        try {
            C10348 c10348M7172 = C2083.m7172(c10349, c10348);
            C24698 c24698M55045 = c1400.f4976.m55045();
            c24698M55045.add(i);
            c24698M55045.mo15005();
            C24698 c24698 = this.f4976;
            if (c4888Mo14997 == abstractC14078 && c10348M7172 == c10349 && c24698.equals(c24698M55045)) {
                return this;
            }
            if (!c24698.equals(c24698M55045)) {
                if (c24698.size() > c24698M55045.size()) {
                    c24698 = c24698M55045;
                    c24698M55045 = c24698;
                }
                int size = c24698M55045.size();
                int size2 = c24698.size();
                for (int i3 = size2 - 1; i3 >= 0; i3--) {
                    if (c24698.get(i3) != c24698M55045.get((size - size2) + i3)) {
                        throw new RuntimeException("Incompatible merged subroutines");
                    }
                }
                c24698 = c24698M55045;
            }
            return new C1400(c4888Mo14997, c10348M7172, c24698);
        } catch (C16074 e) {
            e.m12508("underlay stack:");
            c10349.m26616(e);
            e.m12508("overlay stack:");
            c10348.m26616(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC14077 m5121() {
        return this.f4975;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1400 m5112(C1028 c1028) {
        C10348 c10348M26618 = this.f4977.m26618();
        c10348M26618.m26619();
        c10348M26618.m26617(c1028);
        return new C1400(this.f4975, c10348M26618, this.f4976);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10348 m5118() {
        return this.f4977;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C24698 m5122() {
        return this.f4976;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5116(C13705 c13705) {
        int size = c13705.size();
        int iM15371 = 0;
        for (int i = 0; i < size; i++) {
            C5085 c5085M31609get = c13705.m31609get(i);
            this.f4975.mo15000(iM15371, c5085M31609get);
            iM15371 += c5085M31609get.m15371();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1400 m5120(int i, int i2) {
        AbstractC14077 abstractC14077 = this.f4975;
        AbstractC14077 abstractC14077M14998 = abstractC14077 instanceof C4888 ? ((C4888) abstractC14077).m14998(i2) : null;
        try {
            C24698 c24698M55045 = this.f4976.m55045();
            if (c24698M55045.m55044() != i) {
                throw new RuntimeException("returning from invalid subroutine");
            }
            c24698M55045.mo15005();
            if (abstractC14077M14998 == null) {
                return null;
            }
            return new C1400(abstractC14077M14998, this.f4977, c24698M55045);
        } catch (IndexOutOfBoundsException unused) {
            throw new RuntimeException("returning from invalid subroutine");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("can't return from non-subroutine");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1400 m5111(int i, int i2) {
        this.f4976.m55045().add(i);
        return new C1400(this.f4975.mo15003(), this.f4977, C24698.m55041(i)).m5114(this, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5117(C16074 c16074) {
        this.f4975.mo15001(c16074);
        this.f4977.m26616(c16074);
    }
}
