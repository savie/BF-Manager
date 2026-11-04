package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.۬۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13877 implements InterfaceC0171 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15107 f44013;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f44014;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21821 f44015;

    @Override // l.InterfaceC0171
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1453(IOException iOException) {
        return true;
    }

    public C13877(C15107 c15107, LinkedHashMap linkedHashMap, AbstractC21821 abstractC21821) {
        this.f44013 = c15107;
        this.f44014 = linkedHashMap;
        this.f44015 = abstractC21821;
    }

    @Override // l.InterfaceC0171
    /* JADX INFO: renamed from: ۙ */
    public final void mo1452(InterfaceC2386 interfaceC2386, InputStream inputStream) {
        AbstractC21821 abstractC21821 = this.f44015;
        try {
            C1200 c1200 = (C1200) this.f44014.get(interfaceC2386);
            C17359.requireNonNull(c1200);
            abstractC21821.mo33471(c1200.m4419(), false);
            if (inputStream != null && this.f44013.m36380(C15107.m36373(inputStream))) {
                abstractC21821.m49472(c1200);
            }
        } finally {
            C20244.m46520(inputStream);
        }
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f44013.f49308;
    }
}
