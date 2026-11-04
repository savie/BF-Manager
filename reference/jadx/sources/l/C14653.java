package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܰܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes4.dex */
public class C14653 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C11670 f47939;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18383 f47940;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11670 f47941;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11670 f47942;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f47943 = 0;

    public C14653(C18383 c18383) {
        this.f47940 = c18383;
        this.f47942 = c18383.f59888;
    }

    public final boolean hasNext() {
        return this.f47942 != null;
    }

    public final boolean hasPrevious() {
        return this.f47939 != null;
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo30886() {
        this.f47942 = this.f47942.m29344();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11670 m35284() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C11670 c11670 = this.f47942;
        this.f47939 = c11670;
        this.f47941 = c11670;
        this.f47943++;
        mo30886();
        return this.f47941;
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo30887() {
        this.f47939 = this.f47939.m29343();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11670 m35285() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C11670 c11670 = this.f47939;
        this.f47942 = c11670;
        this.f47941 = c11670;
        this.f47943--;
        mo30887();
        return this.f47941;
    }

    public final int nextIndex() {
        return this.f47943;
    }

    public final int previousIndex() {
        return this.f47943 - 1;
    }

    public final void remove() {
        C11670 c11670 = this.f47941;
        if (c11670 == null) {
            throw new IllegalStateException();
        }
        if (c11670 == this.f47939) {
            this.f47943--;
        }
        this.f47939 = c11670;
        this.f47942 = c11670;
        mo30887();
        mo30886();
        this.f47940.remove(this.f47941.f3592);
        this.f47941 = null;
    }

    public Object previous() {
        return m35285();
    }
}
