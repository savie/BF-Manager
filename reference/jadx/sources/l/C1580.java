package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֫ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes2.dex */
public class C1580 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C7225 f6331;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2991 f6332;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C7225 f6333;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C7225 f6334;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6335 = 0;

    public C1580(C2991 c2991) {
        this.f6332 = c2991;
        this.f6331 = c2991.f11225;
    }

    public final boolean hasNext() {
        return this.f6331 != null;
    }

    public final boolean hasPrevious() {
        return this.f6334 != null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo5386() {
        this.f6331 = this.f6331.m19238();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7225 m5385() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C7225 c7225 = this.f6331;
        this.f6334 = c7225;
        this.f6333 = c7225;
        this.f6335++;
        mo5386();
        return this.f6333;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo5384() {
        this.f6334 = this.f6334.m19237();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7225 m5387() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C7225 c7225 = this.f6334;
        this.f6331 = c7225;
        this.f6333 = c7225;
        this.f6335--;
        mo5384();
        return this.f6333;
    }

    public final int nextIndex() {
        return this.f6335;
    }

    public final int previousIndex() {
        return this.f6335 - 1;
    }

    public final void remove() {
        C7225 c7225 = this.f6333;
        if (c7225 == null) {
            throw new IllegalStateException();
        }
        if (c7225 == this.f6334) {
            this.f6335--;
        }
        this.f6334 = c7225;
        this.f6331 = c7225;
        mo5384();
        mo5386();
        this.f6332.remove(this.f6333.f29881);
        this.f6333 = null;
    }

    public Object next() {
        return m5385();
    }

    public Object previous() {
        return m5387();
    }
}
