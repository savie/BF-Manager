package l;

import java.io.BufferedOutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܶ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EH */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16442 implements Supplier {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f53325;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f53326;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BufferedOutputStream f53327;

    public /* synthetic */ C16442(boolean z, BufferedOutputStream bufferedOutputStream, AtomicInteger atomicInteger) {
        this.f53325 = z;
        this.f53327 = bufferedOutputStream;
        this.f53326 = atomicInteger;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return new C14950(this.f53325, this.f53327, this.f53326);
    }
}
