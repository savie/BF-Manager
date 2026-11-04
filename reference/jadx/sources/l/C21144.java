package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩶ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes5.dex */
public final class C21144 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18160 f67530 = new C18160(0);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21144 m48247() {
        return new C21144();
    }

    public final C21144 clone() {
        C18160 c18160 = new C18160(0);
        if (this.f67530.f59365 == null) {
            c18160.f59365 = null;
        } else {
            c18160.f59365 = new ArrayList(this.f67530.f59365);
        }
        if (this.f67530.f59363 == null) {
            c18160.f59363 = null;
        } else {
            c18160.f59363 = new ArrayList(this.f67530.f59363);
        }
        if (this.f67530.f59366 == null) {
            c18160.f59366 = null;
        } else {
            c18160.f59366 = new ArrayList(this.f67530.f59366);
        }
        if (this.f67530.f59367 == null) {
            c18160.f59367 = null;
        } else {
            c18160.f59367 = new ArrayList(this.f67530.f59367);
        }
        if (this.f67530.f59364 == null) {
            c18160.f59364 = null;
        } else {
            c18160.f59364 = new ArrayList(this.f67530.f59364);
        }
        C21144 c21144 = new C21144();
        c21144.f67530 = c18160;
        return c21144;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18160 m48248() {
        C18160 c18160 = new C18160(0);
        if (this.f67530.f59365 == null) {
            c18160.f59365 = Collections.EMPTY_LIST;
        } else {
            c18160.f59365 = C4681.unmodifiableList(new ArrayList(this.f67530.f59365));
        }
        if (this.f67530.f59363 == null) {
            c18160.f59363 = Collections.EMPTY_LIST;
        } else {
            c18160.f59363 = C4681.unmodifiableList(new ArrayList(this.f67530.f59363));
        }
        if (this.f67530.f59366 == null) {
            c18160.f59366 = Collections.EMPTY_LIST;
        } else {
            c18160.f59366 = C4681.unmodifiableList(new ArrayList(this.f67530.f59366));
        }
        if (this.f67530.f59367 == null) {
            c18160.f59367 = Collections.EMPTY_LIST;
        } else {
            c18160.f59367 = C4681.unmodifiableList(new ArrayList(this.f67530.f59367));
        }
        if (this.f67530.f59364 == null) {
            c18160.f59364 = Collections.EMPTY_LIST;
            return c18160;
        }
        c18160.f59364 = C4681.unmodifiableList(new ArrayList(this.f67530.f59364));
        return c18160;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48253(C18160 c18160) {
        if (!c18160.f59365.isEmpty()) {
            if (this.f67530.f59365 == null) {
                this.f67530.f59365 = new ArrayList();
            }
            this.f67530.f59365.addAll(c18160.f59365);
        }
        if (!c18160.f59363.isEmpty()) {
            if (this.f67530.f59363 == null) {
                this.f67530.f59363 = new ArrayList();
            }
            this.f67530.f59363.addAll(c18160.f59363);
        }
        if (!c18160.f59366.isEmpty()) {
            if (this.f67530.f59366 == null) {
                this.f67530.f59366 = new ArrayList();
            }
            this.f67530.f59366.addAll(c18160.f59366);
        }
        if (!c18160.f59367.isEmpty()) {
            if (this.f67530.f59367 == null) {
                this.f67530.f59367 = new ArrayList();
            }
            this.f67530.f59367.addAll(c18160.f59367);
        }
        if (c18160.f59364.isEmpty()) {
            return;
        }
        if (this.f67530.f59364 == null) {
            this.f67530.f59364 = new ArrayList();
        }
        this.f67530.f59364.addAll(c18160.f59364);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m48254(long j) {
        if (this.f67530.f59365 == null) {
            this.f67530.f59365 = new ArrayList();
        }
        this.f67530.f59365.add(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48249(int i) {
        if (this.f67530.f59363 == null) {
            this.f67530.f59363 = new ArrayList();
        }
        this.f67530.f59363.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48250(long j) {
        if (this.f67530.f59366 == null) {
            this.f67530.f59366 = new ArrayList();
        }
        this.f67530.f59366.add(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48252(AbstractC17084 abstractC17084) {
        if (this.f67530.f59367 == null) {
            this.f67530.f59367 = new ArrayList();
        }
        this.f67530.f59367.add(abstractC17084);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48251(C7719 c7719) {
        if (this.f67530.f59364 == null) {
            this.f67530.f59364 = new ArrayList();
        }
        this.f67530.f59364.add(c7719);
    }
}
