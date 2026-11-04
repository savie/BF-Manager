package l;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩹ۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4CH */
/* JADX INFO: loaded from: classes.dex */
public final class C23508 extends C22411 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C22411 f75986;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m52695() {
        this.f75986 = C22411.f72586;
    }

    @Override // l.C22411
    /* JADX INFO: renamed from: ᩷ */
    public final C22411 mo15814(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return this.f75986.mo15814(j);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C22411 m52696() {
        return this.f75986;
    }

    @Override // l.C22411
    /* JADX INFO: renamed from: ܳ */
    public final long mo50551() {
        return this.f75986.mo50551();
    }

    @Override // l.C22411
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo50553() {
        return this.f75986.mo50553();
    }

    @Override // l.C22411
    /* JADX INFO: renamed from: ۤ */
    public final long mo50550() {
        return this.f75986.mo50550();
    }

    @Override // l.C22411
    /* JADX INFO: renamed from: ۙ */
    public final C22411 mo15812(long j) {
        return this.f75986.mo15812(j);
    }

    @Override // l.C22411
    /* JADX INFO: renamed from: ᩷ */
    public final C22411 mo50552() {
        return this.f75986.mo50552();
    }

    @Override // l.C22411
    /* JADX INFO: renamed from: ۙ */
    public final C22411 mo50548() {
        return this.f75986.mo50548();
    }

    public C23508(C22411 c22411) {
        if (c22411 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f75986 = c22411;
    }

    @Override // l.C22411
    /* JADX INFO: renamed from: ᩴ */
    public final void mo15813() throws InterruptedIOException {
        this.f75986.mo15813();
    }
}
