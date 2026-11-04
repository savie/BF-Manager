package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28U3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12074 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C12074 f38882 = new C12074(AbstractC1928.of());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f38883;

    static {
        C7116.m19499(0);
    }

    public C12074(List list) {
        this.f38883 = AbstractC1928.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 m30246() {
        return this.f38883;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m30249() {
        return this.f38883.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30247(int i) {
        int i2 = 0;
        while (true) {
            AbstractC1928 abstractC1928 = this.f38883;
            if (i2 >= abstractC1928.size()) {
                return false;
            }
            if (((C20279) abstractC1928.get(i2)).m46543() == i) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m30248() {
        int i = 0;
        while (true) {
            AbstractC1928 abstractC1928 = this.f38883;
            if (i >= abstractC1928.size()) {
                return false;
            }
            if (((C20279) abstractC1928.get(i)).m46543() == 2 && ((C20279) abstractC1928.get(i)).m46545()) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m30250(int i) {
        int i2 = 0;
        while (true) {
            AbstractC1928 abstractC1928 = this.f38883;
            if (i2 >= abstractC1928.size()) {
                return false;
            }
            C20279 c20279 = (C20279) abstractC1928.get(i2);
            if (c20279.m46542() && c20279.m46543() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12074.class != obj.getClass()) {
            return false;
        }
        return this.f38883.equals(((C12074) obj).f38883);
    }

    public final int hashCode() {
        return this.f38883.hashCode();
    }
}
