package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۟ۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ZE */
/* JADX INFO: loaded from: classes3.dex */
public final class C7715 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f25422;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C25179 f25423;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f25424;

    public C7715(AbstractC22044 abstractC22044) {
        this.f25422 = abstractC22044;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m20994() {
        return this.f25424;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C25179 m20996() {
        return this.f25423;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20995(AbstractC22044 abstractC22044, Runnable runnable, AutoCloseable... autoCloseableArr) throws IOException {
        for (AutoCloseable autoCloseable : autoCloseableArr) {
            C20244.m46520(autoCloseable);
        }
        this.f25424.m49848(abstractC22044, C17423.f56646, true, runnable);
    }
}
