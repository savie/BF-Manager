package l;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ܺܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9ARP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16969 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C16399 f55480;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11002 f55481;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6485 f55482;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4767();

    static {
        C16399 c16399 = new C16399(new C5783());
        f55480 = c16399;
        c16399.f53211 = Integer.MAX_VALUE;
    }

    public AbstractC16969(C11002 c11002, C6485 c6485) {
        this.f55481 = c11002;
        this.f55482 = c6485;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC12450 mo4372(AbstractC12450 abstractC12450) {
        AbstractC12450 abstractC12450M30919;
        C6485 c6485 = this.f55482;
        if (c6485 == null) {
            return abstractC12450;
        }
        synchronized (c6485) {
            abstractC12450M30919 = AbstractC12450.m30919(abstractC12450, this.f55482, new IdentityHashMap());
        }
        return abstractC12450M30919;
    }
}
