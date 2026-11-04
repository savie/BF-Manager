package l;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.۠ۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC8395 implements Callable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f27505;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3374 f27506;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22737 f27507;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15610 f27508;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8850 f27509;

    public /* synthetic */ CallableC8395(AtomicBoolean atomicBoolean, InterfaceC15610 interfaceC15610, C3374 c3374, C8850 c8850, C22737 c22737) {
        this.f27505 = atomicBoolean;
        this.f27508 = interfaceC15610;
        this.f27506 = c3374;
        this.f27509 = c8850;
        this.f27507 = c22737;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        C8850 c8850 = this.f27509;
        C22737 c22737 = this.f27507;
        AtomicBoolean atomicBoolean = this.f27505;
        if (atomicBoolean.get() || this.f27508.mo924()) {
            return null;
        }
        this.f27506.m11079(1);
        try {
            c8850.m23712((InterfaceC10122) c22737);
            return null;
        } catch (Throwable th) {
            atomicBoolean.set(true);
            throw new IOException(c22737.getType() + ":\n" + th.getMessage(), th);
        }
    }
}
