package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۬ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes4.dex */
public class C13951 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C14697 f44249;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22377 f44250;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14697 f44251;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14697 f44252;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f44253 = 0;

    public C13951(C22377 c22377) {
        this.f44250 = c22377;
        this.f44252 = c22377.f72453;
    }

    public final boolean hasNext() {
        return this.f44252 != null;
    }

    public final boolean hasPrevious() {
        return this.f44249 != null;
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo24860() {
        this.f44252 = this.f44252.m35366();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14697 m34022() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C14697 c14697 = this.f44252;
        this.f44249 = c14697;
        this.f44251 = c14697;
        this.f44253++;
        mo24860();
        return this.f44251;
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo24861() {
        this.f44249 = this.f44249.m35365();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14697 m34023() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C14697 c14697 = this.f44249;
        this.f44252 = c14697;
        this.f44251 = c14697;
        this.f44253--;
        mo24861();
        return this.f44251;
    }

    public final int nextIndex() {
        return this.f44253;
    }

    public final int previousIndex() {
        return this.f44253 - 1;
    }

    public final void remove() {
        C14697 c14697 = this.f44251;
        if (c14697 == null) {
            throw new IllegalStateException();
        }
        if (c14697 == this.f44249) {
            this.f44253--;
        }
        this.f44249 = c14697;
        this.f44252 = c14697;
        mo24861();
        mo24860();
        this.f44250.mo11585(this.f44251.f66377);
        this.f44251 = null;
    }

    public Object next() {
        return m34022();
    }

    public Object previous() {
        return m34023();
    }
}
