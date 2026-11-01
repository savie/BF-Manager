package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes4.dex */
public class C19904 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C22726 f63803;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16376 f63804;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22726 f63805;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22726 f63806;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f63807 = 0;

    public C19904(C16376 c16376) {
        this.f63804 = c16376;
        this.f63803 = c16376.f52701;
    }

    public final boolean hasNext() {
        return this.f63803 != null;
    }

    public final boolean hasPrevious() {
        return this.f63806 != null;
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo25305() {
        this.f63803 = this.f63803.m50381();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22726 m45175() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C22726 c22726 = this.f63803;
        this.f63806 = c22726;
        this.f63805 = c22726;
        this.f63807++;
        mo25305();
        return this.f63805;
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo25304() {
        this.f63806 = this.f63806.m50387();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22726 m45176() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C22726 c22726 = this.f63806;
        this.f63803 = c22726;
        this.f63805 = c22726;
        this.f63807--;
        mo25304();
        return this.f63805;
    }

    public final int nextIndex() {
        return this.f63807;
    }

    public final int previousIndex() {
        return this.f63807 - 1;
    }

    public final void remove() {
        C22726 c22726 = this.f63805;
        if (c22726 == null) {
            throw new IllegalStateException();
        }
        if (c22726 == this.f63806) {
            this.f63807--;
        }
        this.f63806 = c22726;
        this.f63803 = c22726;
        mo25304();
        mo25305();
        this.f63804.mo7436(this.f63805.f18265);
        this.f63805 = null;
    }

    public Object next() {
        return m45175();
    }

    public Object previous() {
        return m45176();
    }
}
