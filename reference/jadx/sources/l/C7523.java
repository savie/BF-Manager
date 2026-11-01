package l;

import java.io.BufferedOutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۟ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7523 implements Supplier {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f25014;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f25015;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BufferedOutputStream f25016;

    public /* synthetic */ C7523(boolean z, BufferedOutputStream bufferedOutputStream, AtomicInteger atomicInteger) {
        this.f25015 = z;
        this.f25016 = bufferedOutputStream;
        this.f25014 = atomicInteger;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return new C17401(this.f25015, this.f25016, this.f25014);
    }
}
