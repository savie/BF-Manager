package l;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.֫۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC1831 implements Callable {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8485 f7020;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f7021;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7807 f7022;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8516 f7023;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC22438 f7024;

    public /* synthetic */ CallableC1831(AtomicBoolean atomicBoolean, InterfaceC22438 interfaceC22438, C8516 c8516, C8485 c8485, C7807 c7807) {
        this.f7021 = atomicBoolean;
        this.f7024 = interfaceC22438;
        this.f7023 = c8516;
        this.f7020 = c8485;
        this.f7022 = c7807;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        C8485 c8485 = this.f7020;
        C7807 c7807 = this.f7022;
        AtomicBoolean atomicBoolean = this.f7021;
        if (atomicBoolean.get() || this.f7024.mo2357()) {
            return null;
        }
        this.f7023.m22242(1);
        try {
            c8485.m22160((InterfaceC22762) c7807);
            return null;
        } catch (Throwable th) {
            atomicBoolean.set(true);
            throw new IOException(c7807.getType() + ":\n" + th.getMessage(), th);
        }
    }
}
