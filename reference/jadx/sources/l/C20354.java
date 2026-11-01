package l;

import com.alipay.sdk.m.u0.b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 041R */
/* JADX INFO: loaded from: classes5.dex */
public final class C20354 implements InterfaceC6927 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16826 f65923;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12343 f65924;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3836 f65925;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16826 f65926;

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7549(C5516 c5516) {
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7551(C13984 c13984) {
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7552(C22450 c22450) {
    }

    public C20354(C12343 c12343) {
        this.f65924 = c12343;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16826 m45923(C16826 c16826, C21825 c21825) {
        if (this.f65925 == null) {
            this.f65925 = C3836.m11131(this.f65924);
        }
        this.f65923 = c16826;
        this.f65926 = null;
        Iterator it = c21825.iterator();
        while (it.hasNext()) {
            C11867 c11867 = (C11867) it.next();
            c11867.getClass();
            mo7550(c11867);
        }
        C16826 c16827 = this.f65926;
        return c16827 == null ? c16826 : c16827;
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7547(C2693 c2693) {
        EnumC0597 enumC0597M2804;
        if (c2693.f75167.f53222 != this.f65925.f14220.f53222 || (enumC0597M2804 = EnumC0597.m2804((String) c2693.f10382)) == null) {
            return;
        }
        if (this.f65926 == null) {
            this.f65926 = new C16826(this.f65923);
        }
        this.f65926.f53861.add(enumC0597M2804);
        this.f65926.f53860.remove(enumC0597M2804);
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7550(C11867 c11867) {
        if (c11867.f75167.f53222 == this.f65925.f14265.f53222) {
            for (C21825 c21825 = c11867.f39809; c21825.m48595(); c21825 = c21825.f70877) {
                C2068 c2068 = (C2068) c21825.f70876;
                if (((C18258) c2068.f7664).f77453.toString().equals(b.d)) {
                    ((AbstractC23156) c2068.f7665).mo4166(this);
                }
            }
        }
    }

    @Override // l.InterfaceC6927
    /* JADX INFO: renamed from: ۙ */
    public final void mo7548(C4810 c4810) {
        for (AbstractC23156 abstractC23156 : c4810.f16902) {
            abstractC23156.mo4166(this);
        }
    }
}
