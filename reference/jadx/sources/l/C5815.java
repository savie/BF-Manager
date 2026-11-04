package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۚܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes3.dex */
public class C5815 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9630 f19991;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11780 f19992;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9630 f19993;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9630 f19994;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f19995 = 0;

    public C5815(C11780 c11780) {
        this.f19992 = c11780;
        this.f19994 = c11780.f38056;
    }

    public final boolean hasNext() {
        return this.f19994 != null;
    }

    public final boolean hasPrevious() {
        return this.f19991 != null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo16947() {
        this.f19994 = this.f19994.m25136();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9630 m16946() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C9630 c9630 = this.f19994;
        this.f19991 = c9630;
        this.f19993 = c9630;
        this.f19995++;
        mo16947();
        return this.f19993;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo16949() {
        this.f19991 = this.f19991.m25138();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9630 m16948() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C9630 c9630 = this.f19991;
        this.f19994 = c9630;
        this.f19993 = c9630;
        this.f19995--;
        mo16949();
        return this.f19993;
    }

    public final int nextIndex() {
        return this.f19995;
    }

    public final int previousIndex() {
        return this.f19995 - 1;
    }

    public final void remove() {
        C9630 c9630 = this.f19993;
        if (c9630 == null) {
            throw new IllegalStateException();
        }
        if (c9630 == this.f19991) {
            this.f19995--;
        }
        this.f19991 = c9630;
        this.f19994 = c9630;
        mo16949();
        mo16947();
        this.f19992.remove(this.f19993.f3592);
        this.f19993 = null;
    }

    public Object next() {
        return m16946();
    }

    public Object previous() {
        return m16948();
    }
}
