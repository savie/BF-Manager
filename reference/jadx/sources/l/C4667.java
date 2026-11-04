package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۙۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4667 implements InterfaceC0171 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f16474;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15107 f16475;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f16476;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21821 f16477;

    @Override // l.InterfaceC0171
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1453(IOException iOException) {
        return true;
    }

    public C4667(C15107 c15107, LinkedHashMap linkedHashMap, AbstractC21821 abstractC21821, AtomicInteger atomicInteger) {
        this.f16475 = c15107;
        this.f16474 = linkedHashMap;
        this.f16477 = abstractC21821;
        this.f16476 = atomicInteger;
    }

    @Override // l.InterfaceC0171
    /* JADX INFO: renamed from: ۙ */
    public final void mo1452(InterfaceC2386 interfaceC2386, InputStream inputStream) {
        AbstractC21821 abstractC21821 = this.f16477;
        try {
            String str = (String) this.f16474.get(interfaceC2386);
            C17359.requireNonNull(str);
            abstractC21821.mo33471(str + interfaceC2386.getName(), false);
            if (inputStream != null && this.f16475.m36380(C15107.m36373(inputStream))) {
                abstractC21821.m49472(new C1200(interfaceC2386, str));
                this.f16476.incrementAndGet();
            }
        } finally {
            C20244.m46520(inputStream);
        }
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f16475.f49308;
    }
}
