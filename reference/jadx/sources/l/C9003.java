package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡܽۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4RU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9003 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC23114 f30794;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC23114[] f30795;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f30796;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC23114 f30797;

    public final int size() {
        return this.f30796;
    }

    public final AbstractC23114 getFirst() {
        return this.f30797;
    }

    public final AbstractC23114 getLast() {
        return this.f30794;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23314(AbstractC20521 abstractC20521) {
        for (AbstractC23114 abstractC23114 = this.f30797; abstractC23114 != null; abstractC23114 = abstractC23114.f75076) {
            abstractC23114.mo2544(abstractC20521);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C19586(this);
    }

    public final AbstractC23114[] toArray() {
        AbstractC23114 abstractC23114 = this.f30797;
        AbstractC23114[] abstractC23114Arr = new AbstractC23114[this.f30796];
        int i = 0;
        while (abstractC23114 != null) {
            abstractC23114Arr[i] = abstractC23114;
            abstractC23114.f75074 = i;
            abstractC23114 = abstractC23114.f75076;
            i++;
        }
        return abstractC23114Arr;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23317(AbstractC23114 abstractC23114, AbstractC23114 abstractC23115) {
        AbstractC23114 abstractC23116 = abstractC23114.f75076;
        abstractC23115.f75076 = abstractC23116;
        if (abstractC23116 != null) {
            abstractC23116.f75075 = abstractC23115;
        } else {
            this.f30794 = abstractC23115;
        }
        AbstractC23114 abstractC23117 = abstractC23114.f75075;
        abstractC23115.f75075 = abstractC23117;
        if (abstractC23117 != null) {
            abstractC23117.f75076 = abstractC23115;
        } else {
            this.f30797 = abstractC23115;
        }
        AbstractC23114[] abstractC23114Arr = this.f30795;
        if (abstractC23114Arr != null) {
            int i = abstractC23114.f75074;
            abstractC23114Arr[i] = abstractC23115;
            abstractC23115.f75074 = i;
        } else {
            abstractC23115.f75074 = 0;
        }
        abstractC23114.f75074 = -1;
        abstractC23114.f75075 = null;
        abstractC23114.f75076 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23315(AbstractC23114 abstractC23114) {
        this.f30796++;
        AbstractC23114 abstractC23115 = this.f30794;
        if (abstractC23115 == null) {
            this.f30797 = abstractC23114;
            this.f30794 = abstractC23114;
        } else {
            abstractC23115.f75076 = abstractC23114;
            abstractC23114.f75075 = abstractC23115;
        }
        this.f30794 = abstractC23114;
        this.f30795 = null;
        abstractC23114.f75074 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23316(AbstractC23114 abstractC23114, AbstractC23114 abstractC23115) {
        this.f30796++;
        AbstractC23114 abstractC23116 = abstractC23114.f75076;
        if (abstractC23116 == null) {
            this.f30794 = abstractC23115;
        } else {
            abstractC23116.f75075 = abstractC23115;
        }
        abstractC23114.f75076 = abstractC23115;
        abstractC23115.f75076 = abstractC23116;
        abstractC23115.f75075 = abstractC23114;
        this.f30795 = null;
        abstractC23115.f75074 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23320(AbstractC23114 abstractC23114, AbstractC23114 abstractC23115) {
        this.f30796++;
        AbstractC23114 abstractC23116 = abstractC23114.f75075;
        if (abstractC23116 == null) {
            this.f30797 = abstractC23115;
        } else {
            abstractC23116.f75076 = abstractC23115;
        }
        abstractC23114.f75075 = abstractC23115;
        abstractC23115.f75076 = abstractC23114;
        abstractC23115.f75075 = abstractC23116;
        this.f30795 = null;
        abstractC23115.f75074 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23319(AbstractC23114 abstractC23114) {
        this.f30796--;
        AbstractC23114 abstractC23115 = abstractC23114.f75076;
        AbstractC23114 abstractC23116 = abstractC23114.f75075;
        if (abstractC23115 == null) {
            if (abstractC23116 == null) {
                this.f30797 = null;
                this.f30794 = null;
            } else {
                abstractC23116.f75076 = null;
                this.f30794 = abstractC23116;
            }
        } else if (abstractC23116 == null) {
            this.f30797 = abstractC23115;
            abstractC23115.f75075 = null;
        } else {
            abstractC23116.f75076 = abstractC23115;
            abstractC23115.f75075 = abstractC23116;
        }
        this.f30795 = null;
        abstractC23114.f75074 = -1;
        abstractC23114.f75075 = null;
        abstractC23114.f75076 = null;
    }

    public final void clear() {
        this.f30796 = 0;
        this.f30797 = null;
        this.f30794 = null;
        this.f30795 = null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23318() {
        for (AbstractC23114 abstractC23114 = this.f30797; abstractC23114 != null; abstractC23114 = abstractC23114.f75076) {
            if (abstractC23114 instanceof C20291) {
                ((C20291) abstractC23114).m45783();
            }
        }
    }
}
