package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ۠ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4RU */
/* JADX INFO: loaded from: classes3.dex */
public final class C10736 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f34092;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC9070[] f34093;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC9070 f34094;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC9070 f34095;

    public final int size() {
        return this.f34092;
    }

    public final AbstractC9070 getFirst() {
        return this.f34095;
    }

    public final AbstractC9070 getLast() {
        return this.f34094;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27343(AbstractC15037 abstractC15037) {
        for (AbstractC9070 abstractC9070 = this.f34095; abstractC9070 != null; abstractC9070 = abstractC9070.f29484) {
            abstractC9070.mo6249(abstractC15037);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C21925(this);
    }

    public final AbstractC9070[] toArray() {
        AbstractC9070 abstractC9070 = this.f34095;
        AbstractC9070[] abstractC9070Arr = new AbstractC9070[this.f34092];
        int i = 0;
        while (abstractC9070 != null) {
            abstractC9070Arr[i] = abstractC9070;
            abstractC9070.f29483 = i;
            abstractC9070 = abstractC9070.f29484;
            i++;
        }
        return abstractC9070Arr;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m27344(AbstractC9070 abstractC9070, AbstractC9070 abstractC9071) {
        AbstractC9070 abstractC9072 = abstractC9070.f29484;
        abstractC9071.f29484 = abstractC9072;
        if (abstractC9072 != null) {
            abstractC9072.f29486 = abstractC9071;
        } else {
            this.f34094 = abstractC9071;
        }
        AbstractC9070 abstractC9073 = abstractC9070.f29486;
        abstractC9071.f29486 = abstractC9073;
        if (abstractC9073 != null) {
            abstractC9073.f29484 = abstractC9071;
        } else {
            this.f34095 = abstractC9071;
        }
        AbstractC9070[] abstractC9070Arr = this.f34093;
        if (abstractC9070Arr != null) {
            int i = abstractC9070.f29483;
            abstractC9070Arr[i] = abstractC9071;
            abstractC9071.f29483 = i;
        } else {
            abstractC9071.f29483 = 0;
        }
        abstractC9070.f29483 = -1;
        abstractC9070.f29486 = null;
        abstractC9070.f29484 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27341(AbstractC9070 abstractC9070) {
        this.f34092++;
        AbstractC9070 abstractC9071 = this.f34094;
        if (abstractC9071 == null) {
            this.f34095 = abstractC9070;
        } else {
            abstractC9071.f29484 = abstractC9070;
            abstractC9070.f29486 = abstractC9071;
        }
        this.f34094 = abstractC9070;
        this.f34093 = null;
        abstractC9070.f29483 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27342(AbstractC9070 abstractC9070, AbstractC9070 abstractC9071) {
        this.f34092++;
        AbstractC9070 abstractC9072 = abstractC9070.f29484;
        if (abstractC9072 == null) {
            this.f34094 = abstractC9071;
        } else {
            abstractC9072.f29486 = abstractC9071;
        }
        abstractC9070.f29484 = abstractC9071;
        abstractC9071.f29484 = abstractC9072;
        abstractC9071.f29486 = abstractC9070;
        this.f34093 = null;
        abstractC9071.f29483 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27347(AbstractC9070 abstractC9070, AbstractC9070 abstractC9071) {
        this.f34092++;
        AbstractC9070 abstractC9072 = abstractC9070.f29486;
        if (abstractC9072 == null) {
            this.f34095 = abstractC9071;
        } else {
            abstractC9072.f29484 = abstractC9071;
        }
        abstractC9070.f29486 = abstractC9071;
        abstractC9071.f29484 = abstractC9070;
        abstractC9071.f29486 = abstractC9072;
        this.f34093 = null;
        abstractC9071.f29483 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27346(AbstractC9070 abstractC9070) {
        this.f34092--;
        AbstractC9070 abstractC9071 = abstractC9070.f29484;
        AbstractC9070 abstractC9072 = abstractC9070.f29486;
        if (abstractC9071 == null) {
            if (abstractC9072 == null) {
                this.f34095 = null;
                this.f34094 = null;
            } else {
                abstractC9072.f29484 = null;
                this.f34094 = abstractC9072;
            }
        } else if (abstractC9072 == null) {
            this.f34095 = abstractC9071;
            abstractC9071.f29486 = null;
        } else {
            abstractC9072.f29484 = abstractC9071;
            abstractC9071.f29486 = abstractC9072;
        }
        this.f34093 = null;
        abstractC9070.f29483 = -1;
        abstractC9070.f29486 = null;
        abstractC9070.f29484 = null;
    }

    public final void clear() {
        this.f34092 = 0;
        this.f34095 = null;
        this.f34094 = null;
        this.f34093 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27345() {
        for (AbstractC9070 abstractC9070 = this.f34095; abstractC9070 != null; abstractC9070 = abstractC9070.f29484) {
            if (abstractC9070 instanceof C5517) {
                ((C5517) abstractC9070).m16431();
            }
        }
    }
}
