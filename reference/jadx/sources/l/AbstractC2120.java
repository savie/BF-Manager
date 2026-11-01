package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.֫᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4ARJ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2120 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final List f7772 = C0561.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f7773;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C0875 f7776;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16233 f7774 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f7775 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f7777 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f7778 = new ArrayList(4);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo2265();

    public final int hashCode() {
        return this.f7775;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC2120) && this.f7775 == ((AbstractC2120) obj).f7775;
    }

    public final String toString() {
        return String.valueOf(this.f7775);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6670() {
        return this.f7778.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6672(AbstractC17373 abstractC17373) {
        ArrayList<AbstractC17373> arrayList = this.f7778;
        int size = arrayList.size();
        if (arrayList.isEmpty()) {
            this.f7777 = abstractC17373.mo12939();
        } else if (this.f7777 != abstractC17373.mo12939()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.f7775));
            this.f7777 = false;
        }
        for (AbstractC17373 abstractC17374 : arrayList) {
            if (abstractC17374.f55272.f7775 == abstractC17373.f55272.f7775) {
                if (abstractC17374.mo26136() != null && abstractC17373.mo26136() != null && abstractC17374.mo26136().equals(abstractC17373.mo26136())) {
                    return;
                }
                if (abstractC17374.mo12939() && abstractC17373.mo12939()) {
                    return;
                }
            }
        }
        arrayList.add(size, abstractC17373);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17373 m6671(int i) {
        return (AbstractC17373) this.f7778.get(i);
    }
}
