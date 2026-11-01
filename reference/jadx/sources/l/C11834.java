package l;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8691 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11834 implements Iterable, Comparator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC4777 f39728;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC4777 f39729;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f39731 = 1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f39730 = 0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((AbstractC4777) obj).f16797 - ((AbstractC4777) obj2).f16797;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11834 m29519(C10527 c10527) {
        C11834 c11834 = new C11834();
        Iterator it = iterator();
        while (true) {
            C13951 c13951 = (C13951) it;
            if (!c13951.hasNext()) {
                return c11834;
            }
            c11834.m29525(((AbstractC4777) c13951.next()).mo985(c10527));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29521(AbstractC4777 abstractC4777) {
        return abstractC4777.f16802 == this;
    }

    public final AbstractC4777 getFirst() {
        return this.f39729;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m29524() {
        return this.f39730;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m29518(AbstractC4777 abstractC4777) {
        if (abstractC4777.f16797 <= 0) {
            int i = this.f39731;
            abstractC4777.f16797 = i;
            this.f39731 = i + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29520(AbstractC4777 abstractC4777, AbstractC4777 abstractC4778) {
        if (abstractC4777.f16802 == this) {
            m29518(abstractC4778);
            abstractC4778.f16802 = this;
            this.f39730++;
            abstractC4778.f16793 = abstractC4777.f16793;
            abstractC4778.f16800 = abstractC4777;
            AbstractC4777 abstractC4779 = abstractC4777.f16793;
            if (abstractC4779 == null) {
                this.f39728 = abstractC4778;
            } else {
                abstractC4779.f16800 = abstractC4778;
            }
            abstractC4777.f16793 = abstractC4778;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29526(AbstractC4777 abstractC4777, AbstractC4777 abstractC4778) {
        if (abstractC4777.f16802 == this) {
            m29518(abstractC4778);
            abstractC4778.f16802 = this;
            this.f39730++;
            abstractC4778.f16800 = abstractC4777.f16800;
            abstractC4778.f16793 = abstractC4777;
            AbstractC4777 abstractC4779 = abstractC4777.f16800;
            if (abstractC4779 == null) {
                this.f39729 = abstractC4778;
            } else {
                abstractC4779.f16793 = abstractC4778;
            }
            abstractC4777.f16800 = abstractC4778;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29525(AbstractC4777 abstractC4777) {
        m29518(abstractC4777);
        abstractC4777.f16802 = this;
        this.f39730++;
        if (this.f39729 == null) {
            this.f39728 = abstractC4777;
            this.f39729 = abstractC4777;
            abstractC4777.f16793 = null;
            abstractC4777.f16800 = null;
            return;
        }
        abstractC4777.f16793 = null;
        AbstractC4777 abstractC4778 = this.f39728;
        abstractC4777.f16800 = abstractC4778;
        abstractC4778.f16793 = abstractC4777;
        this.f39728 = abstractC4777;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C13951(this, this.f39729);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m29522(AbstractC4777 abstractC4777) {
        if (abstractC4777.f16802 == this) {
            this.f39730--;
            abstractC4777.f16802 = null;
            AbstractC4777 abstractC4778 = abstractC4777.f16800;
            if (abstractC4778 == null) {
                this.f39729 = abstractC4777.f16793;
            } else {
                abstractC4778.f16793 = abstractC4777.f16793;
            }
            AbstractC4777 abstractC4779 = abstractC4777.f16793;
            if (abstractC4779 == null) {
                this.f39728 = abstractC4778;
            } else {
                abstractC4779.f16800 = abstractC4778;
            }
            abstractC4777.f16800 = null;
            abstractC4777.f16793 = null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m29523(AbstractC4777 abstractC4777, AbstractC4777 abstractC4778) {
        if (abstractC4777.f16802 == this) {
            m29518(abstractC4778);
            abstractC4778.f16802 = this;
            abstractC4778.f16793 = abstractC4777.f16793;
            abstractC4778.f16800 = abstractC4777.f16800;
            AbstractC4777 abstractC4779 = abstractC4777.f16793;
            if (abstractC4779 != null) {
                abstractC4779.f16800 = abstractC4778;
            } else {
                this.f39728 = abstractC4778;
            }
            AbstractC4777 abstractC47710 = abstractC4777.f16800;
            if (abstractC47710 != null) {
                abstractC47710.f16793 = abstractC4778;
            } else {
                this.f39729 = abstractC4778;
            }
            abstractC4777.f16793 = null;
            abstractC4777.f16800 = null;
            abstractC4777.f16802 = null;
        }
    }

    public final String toString() {
        if (this.f39730 == 0) {
            return "[Empty]";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterator();
        while (true) {
            C13951 c13951 = (C13951) it;
            if (c13951.hasNext()) {
                AbstractC4777 abstractC4777 = (AbstractC4777) c13951.next();
                if (abstractC4777.f16795 == EnumC2890.LABEL) {
                    sb.append("\n");
                }
                sb.append(abstractC4777);
                sb.append("\n");
            } else {
                return sb.toString();
            }
        }
    }
}
