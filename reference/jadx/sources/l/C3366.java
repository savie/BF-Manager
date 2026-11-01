package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۗܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3366 implements InterfaceC1914 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f12478;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5359 f12479;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f12480;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4653 f12481;

    @Override // l.InterfaceC1914
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6227(IOException iOException) {
        return true;
    }

    public C3366(C5359 c5359, LinkedHashMap linkedHashMap, AbstractC4653 abstractC4653, AtomicInteger atomicInteger) {
        this.f12479 = c5359;
        this.f12480 = linkedHashMap;
        this.f12481 = abstractC4653;
        this.f12478 = atomicInteger;
    }

    @Override // l.InterfaceC1914
    /* JADX INFO: renamed from: ۙ */
    public final void mo6226(InterfaceC2557 interfaceC2557, InputStream inputStream) {
        AbstractC4653 abstractC4653 = this.f12481;
        try {
            String str = (String) this.f12480.get(interfaceC2557);
            C13638.requireNonNull(str);
            abstractC4653.mo12845(str + interfaceC2557.getName(), false);
            if (inputStream != null && this.f12479.m14861(C5359.m14854(inputStream))) {
                abstractC4653.m12846(new C6189(interfaceC2557, str));
                this.f12478.incrementAndGet();
            }
        } finally {
            C19431.m44468(inputStream);
        }
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f12479.f18518;
    }
}
