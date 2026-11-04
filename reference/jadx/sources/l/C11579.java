package l;

import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۧۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4TV */
/* JADX INFO: loaded from: classes3.dex */
public final class C11579 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Integer f36376;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f36377;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TreeMap f36378 = new TreeMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18415 f36379;

    public C11579(String str) {
        C17359.requireNonNull(str, "regex");
        C18415 c18415M42925 = C18415.m42925(str);
        this.f36379 = c18415M42925;
        this.f36377 = c18415M42925.matcher((CharSequence) "").groupCount();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29112(int i) {
        if (1 > this.f36377) {
            throw new IllegalArgumentException("Capture group out of range: 1");
        }
        if (i != 1447446) {
            this.f36378.put(1, Integer.valueOf(i));
            return;
        }
        throw new IllegalArgumentException("Color is reserved for style inheritance");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29111(int i) {
        if (i != 1447446) {
            this.f36376 = Integer.valueOf(i);
            return;
        }
        throw new IllegalArgumentException("Color is reserved for style inheritance");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16800 m29110() {
        return new C16800(this);
    }
}
