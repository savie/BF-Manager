package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩺۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes.dex */
public class C23017 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9261 f74802;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21605 f74803;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C9261 f74804;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9261 f74805;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74806 = 0;

    public C23017(C21605 c21605) {
        this.f74803 = c21605;
        this.f74802 = c21605.f70079;
    }

    public final boolean hasNext() {
        return this.f74802 != null;
    }

    public final boolean hasPrevious() {
        return this.f74805 != null;
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo4175() {
        this.f74802 = this.f74802.m23785();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9261 m50909() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C9261 c9261 = this.f74802;
        this.f74805 = c9261;
        this.f74804 = c9261;
        this.f74806++;
        mo4175();
        return this.f74804;
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo4174() {
        this.f74805 = this.f74805.m23791();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9261 m50910() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C9261 c9261 = this.f74805;
        this.f74802 = c9261;
        this.f74804 = c9261;
        this.f74806--;
        mo4174();
        return this.f74804;
    }

    public final int nextIndex() {
        return this.f74806;
    }

    public final int previousIndex() {
        return this.f74806 - 1;
    }

    public final void remove() {
        C9261 c9261 = this.f74804;
        if (c9261 == null) {
            throw new IllegalStateException();
        }
        if (c9261 == this.f74805) {
            this.f74806--;
        }
        this.f74805 = c9261;
        this.f74802 = c9261;
        mo4174();
        mo4175();
        this.f74803.remove(this.f74804.f29881);
        this.f74804 = null;
    }

    public Object previous() {
        return m50910();
    }
}
