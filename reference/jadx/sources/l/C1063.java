package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.֨ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1063 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13059 f4911 = new C13059(0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C1063 m4014() {
        return new C1063();
    }

    public final C1063 clone() {
        C13059 c13059 = new C13059(0);
        if (this.f4911.f43524 == null) {
            c13059.f43524 = null;
        } else {
            c13059.f43524 = new ArrayList(this.f4911.f43524);
        }
        if (this.f4911.f43523 == null) {
            c13059.f43523 = null;
        } else {
            c13059.f43523 = new ArrayList(this.f4911.f43523);
        }
        if (this.f4911.f43526 == null) {
            c13059.f43526 = null;
        } else {
            c13059.f43526 = new ArrayList(this.f4911.f43526);
        }
        if (this.f4911.f43522 == null) {
            c13059.f43522 = null;
        } else {
            c13059.f43522 = new ArrayList(this.f4911.f43522);
        }
        if (this.f4911.f43525 == null) {
            c13059.f43525 = null;
        } else {
            c13059.f43525 = new ArrayList(this.f4911.f43525);
        }
        C1063 c1063 = new C1063();
        c1063.f4911 = c13059;
        return c1063;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13059 m4015() {
        C13059 c13059 = new C13059(0);
        if (this.f4911.f43524 == null) {
            c13059.f43524 = Collections.EMPTY_LIST;
        } else {
            c13059.f43524 = C0561.unmodifiableList(new ArrayList(this.f4911.f43524));
        }
        if (this.f4911.f43523 == null) {
            c13059.f43523 = Collections.EMPTY_LIST;
        } else {
            c13059.f43523 = C0561.unmodifiableList(new ArrayList(this.f4911.f43523));
        }
        if (this.f4911.f43526 == null) {
            c13059.f43526 = Collections.EMPTY_LIST;
        } else {
            c13059.f43526 = C0561.unmodifiableList(new ArrayList(this.f4911.f43526));
        }
        if (this.f4911.f43522 == null) {
            c13059.f43522 = Collections.EMPTY_LIST;
        } else {
            c13059.f43522 = C0561.unmodifiableList(new ArrayList(this.f4911.f43522));
        }
        if (this.f4911.f43525 == null) {
            c13059.f43525 = Collections.EMPTY_LIST;
            return c13059;
        }
        c13059.f43525 = C0561.unmodifiableList(new ArrayList(this.f4911.f43525));
        return c13059;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4019(C13059 c13059) {
        if (!c13059.f43524.isEmpty()) {
            if (this.f4911.f43524 == null) {
                this.f4911.f43524 = new ArrayList();
            }
            this.f4911.f43524.addAll(c13059.f43524);
        }
        if (!c13059.f43523.isEmpty()) {
            if (this.f4911.f43523 == null) {
                this.f4911.f43523 = new ArrayList();
            }
            this.f4911.f43523.addAll(c13059.f43523);
        }
        if (!c13059.f43526.isEmpty()) {
            if (this.f4911.f43526 == null) {
                this.f4911.f43526 = new ArrayList();
            }
            this.f4911.f43526.addAll(c13059.f43526);
        }
        if (!c13059.f43522.isEmpty()) {
            if (this.f4911.f43522 == null) {
                this.f4911.f43522 = new ArrayList();
            }
            this.f4911.f43522.addAll(c13059.f43522);
        }
        if (c13059.f43525.isEmpty()) {
            return;
        }
        if (this.f4911.f43525 == null) {
            this.f4911.f43525 = new ArrayList();
        }
        this.f4911.f43525.addAll(c13059.f43525);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m4021(long j) {
        if (this.f4911.f43524 == null) {
            this.f4911.f43524 = new ArrayList();
        }
        this.f4911.f43524.add(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4016(int i) {
        if (this.f4911.f43523 == null) {
            this.f4911.f43523 = new ArrayList();
        }
        this.f4911.f43523.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4017(long j) {
        if (this.f4911.f43526 == null) {
            this.f4911.f43526 = new ArrayList();
        }
        this.f4911.f43526.add(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4020(AbstractC23725 abstractC23725) {
        if (this.f4911.f43522 == null) {
            this.f4911.f43522 = new ArrayList();
        }
        this.f4911.f43522.add(abstractC23725);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4018(C6708 c6708) {
        if (this.f4911.f43525 == null) {
            this.f4911.f43525 = new ArrayList();
        }
        this.f4911.f43525.add(c6708);
    }
}
