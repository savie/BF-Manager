package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۟ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8036 implements InterfaceC19637, Cloneable, InterfaceC5075 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f26656 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f26657 = new AtomicInteger();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f26658;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f26659;

    @Override // l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo2282(InterfaceC15161 interfaceC15161, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo2284(AbstractC0578 abstractC0578);

    /* JADX INFO: renamed from: ۤۙ */
    public abstract EnumC21461 mo2285();

    @Override // l.InterfaceC5075
    /* JADX INFO: renamed from: ۬ */
    public final AbstractC8036 mo7192() {
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21911(EnumC21461 enumC21461) {
        return enumC21461 == mo2285();
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C9526(stringWriter, false).m24928(this, 0);
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

    @Override // l.InterfaceC5075
    /* JADX INFO: renamed from: ۖ */
    public final int mo7189() {
        return C11239.m28342(this);
    }

    @Override // l.InterfaceC5075
    /* JADX INFO: renamed from: ۛ */
    public final int mo7191() {
        return this.f26658;
    }

    @Override // l.InterfaceC5075
    /* JADX INFO: renamed from: ۙ */
    public final int mo7190(InterfaceC1960 interfaceC1960) {
        return C11239.m28320(this, interfaceC1960);
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21910() {
        return (f26657.incrementAndGet() & 63) == 0 && new Throwable().getStackTrace().length > 500;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21909(RunnableC2190 runnableC2190) {
        try {
            f26656.submit(runnableC2190).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m21908(final C2815 c2815) {
        try {
            return f26656.submit(new Callable() { // from class: l.ۧܰۘ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c2815.get();
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
