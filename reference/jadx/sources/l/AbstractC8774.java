package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۡۡ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8774 implements InterfaceC17428, Cloneable, InterfaceC12260 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f30189;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f30190;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f30188 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f30187 = new AtomicInteger();

    @Override // l.InterfaceC12260
    /* JADX INFO: renamed from: ۗ */
    public final AbstractC8774 mo9276() {
        return this;
    }

    @Override // l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo1800(InterfaceC6139 interfaceC6139, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo1802(AbstractC19357 abstractC19357);

    /* JADX INFO: renamed from: ۨۙ */
    public abstract EnumC18651 mo1803();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22847(EnumC18651 enumC18651) {
        return enumC18651 == mo1803();
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C15830(stringWriter, false).m37631(this, 0);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC12260
    /* JADX INFO: renamed from: ܳ */
    public final int mo9279() {
        return C3128.m9453(this);
    }

    @Override // l.InterfaceC12260
    /* JADX INFO: renamed from: ۤ */
    public final int mo9278() {
        return this.f30189;
    }

    @Override // l.InterfaceC12260
    /* JADX INFO: renamed from: ۙ */
    public final int mo9277(InterfaceC4518 interfaceC4518) {
        return C3128.m9435(this, interfaceC4518);
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22844() {
        return (f30187.incrementAndGet() & 63) == 0 && new Throwable().getStackTrace().length > 500;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22846(RunnableC20822 runnableC20822) {
        try {
            f30188.submit(runnableC20822).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m22845(final C20063 c20063) {
        try {
            return f30188.submit(new Callable() { // from class: l.ܰ۠۟
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c20063.get();
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
