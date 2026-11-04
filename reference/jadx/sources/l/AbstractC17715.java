package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܽܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4ARJ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17715 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final List f58205 = C4681.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14907 f58207;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f58211;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11002 f58206 = null;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f58209 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f58210 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f58208 = new ArrayList(4);

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo2479();

    public final int hashCode() {
        return this.f58209;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC17715) && this.f58209 == ((AbstractC17715) obj).f58209;
    }

    public final String toString() {
        return String.valueOf(this.f58209);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41477() {
        return this.f58208.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41479(AbstractC5959 abstractC5959) {
        ArrayList<AbstractC5959> arrayList = this.f58208;
        int size = arrayList.size();
        if (arrayList.isEmpty()) {
            this.f58210 = abstractC5959.mo2570();
        } else if (this.f58210 != abstractC5959.mo2570()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.f58209));
            this.f58210 = false;
        }
        for (AbstractC5959 abstractC59510 : arrayList) {
            if (abstractC59510.f20405.f58209 == abstractC5959.f20405.f58209) {
                if (abstractC59510.mo17341() != null && abstractC5959.mo17341() != null && abstractC59510.mo17341().equals(abstractC5959.mo17341())) {
                    return;
                }
                if (abstractC59510.mo2570() && abstractC5959.mo2570()) {
                    return;
                }
            }
        }
        arrayList.add(size, abstractC5959);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5959 m41478(int i) {
        return (AbstractC5959) this.f58208.get(i);
    }
}
