package l;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8691 */
/* JADX INFO: loaded from: classes.dex */
public final class C24498 implements Iterable, Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC12563 f79476;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC12563 f79477;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f79478 = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f79475 = 0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((AbstractC12563) obj).f40351 - ((AbstractC12563) obj2).f40351;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24498 m54758(C5194 c5194) {
        C24498 c24498 = new C24498();
        Iterator it = iterator();
        while (true) {
            C6598 c6598 = (C6598) it;
            if (!c6598.hasNext()) {
                return c24498;
            }
            c24498.m54764(((AbstractC12563) c6598.next()).mo2797(c5194));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54760(AbstractC12563 abstractC12563) {
        return abstractC12563.f40350 == this;
    }

    public final AbstractC12563 getFirst() {
        return this.f79476;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m54763() {
        return this.f79475;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m54757(AbstractC12563 abstractC12563) {
        if (abstractC12563.f40351 <= 0) {
            int i = this.f79478;
            abstractC12563.f40351 = i;
            this.f79478 = i + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54759(AbstractC12563 abstractC12563, AbstractC12563 abstractC12564) {
        if (abstractC12563.f40350 == this) {
            m54757(abstractC12564);
            abstractC12564.f40350 = this;
            this.f79475++;
            abstractC12564.f40349 = abstractC12563.f40349;
            abstractC12564.f40346 = abstractC12563;
            AbstractC12563 abstractC12565 = abstractC12563.f40349;
            if (abstractC12565 == null) {
                this.f79477 = abstractC12564;
            } else {
                abstractC12565.f40346 = abstractC12564;
            }
            abstractC12563.f40349 = abstractC12564;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54765(AbstractC12563 abstractC12563, AbstractC12563 abstractC12564) {
        if (abstractC12563.f40350 == this) {
            m54757(abstractC12564);
            abstractC12564.f40350 = this;
            this.f79475++;
            abstractC12564.f40346 = abstractC12563.f40346;
            abstractC12564.f40349 = abstractC12563;
            AbstractC12563 abstractC12565 = abstractC12563.f40346;
            if (abstractC12565 == null) {
                this.f79476 = abstractC12564;
            } else {
                abstractC12565.f40349 = abstractC12564;
            }
            abstractC12563.f40346 = abstractC12564;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54764(AbstractC12563 abstractC12563) {
        m54757(abstractC12563);
        abstractC12563.f40350 = this;
        this.f79475++;
        if (this.f79476 == null) {
            this.f79477 = abstractC12563;
            this.f79476 = abstractC12563;
            abstractC12563.f40349 = null;
            abstractC12563.f40346 = null;
            return;
        }
        abstractC12563.f40349 = null;
        AbstractC12563 abstractC12564 = this.f79477;
        abstractC12563.f40346 = abstractC12564;
        abstractC12564.f40349 = abstractC12563;
        this.f79477 = abstractC12563;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C6598(this, this.f79476);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m54761(AbstractC12563 abstractC12563) {
        if (abstractC12563.f40350 == this) {
            this.f79475--;
            abstractC12563.f40350 = null;
            AbstractC12563 abstractC12564 = abstractC12563.f40346;
            if (abstractC12564 == null) {
                this.f79476 = abstractC12563.f40349;
            } else {
                abstractC12564.f40349 = abstractC12563.f40349;
            }
            AbstractC12563 abstractC12565 = abstractC12563.f40349;
            if (abstractC12565 == null) {
                this.f79477 = abstractC12564;
            } else {
                abstractC12565.f40346 = abstractC12564;
            }
            abstractC12563.f40346 = null;
            abstractC12563.f40349 = null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m54762(AbstractC12563 abstractC12563, AbstractC12563 abstractC12564) {
        if (abstractC12563.f40350 == this) {
            m54757(abstractC12564);
            abstractC12564.f40350 = this;
            abstractC12564.f40349 = abstractC12563.f40349;
            abstractC12564.f40346 = abstractC12563.f40346;
            AbstractC12563 abstractC12565 = abstractC12563.f40349;
            if (abstractC12565 != null) {
                abstractC12565.f40346 = abstractC12564;
            } else {
                this.f79477 = abstractC12564;
            }
            AbstractC12563 abstractC12566 = abstractC12563.f40346;
            if (abstractC12566 != null) {
                abstractC12566.f40349 = abstractC12564;
            } else {
                this.f79476 = abstractC12564;
            }
            abstractC12563.f40349 = null;
            abstractC12563.f40346 = null;
            abstractC12563.f40350 = null;
        }
    }

    public final String toString() {
        if (this.f79475 == 0) {
            return "[Empty]";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterator();
        while (true) {
            C6598 c6598 = (C6598) it;
            if (c6598.hasNext()) {
                AbstractC12563 abstractC12563 = (AbstractC12563) c6598.next();
                if (abstractC12563.f40344 == EnumC20768.LABEL) {
                    sb.append("\n");
                }
                sb.append(abstractC12563);
                sb.append("\n");
            } else {
                return sb.toString();
            }
        }
    }
}
