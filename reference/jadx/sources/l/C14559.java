package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܰۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14559 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11707 f45870;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC8310 f45872;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f45869 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC7564 f45871 = m35112();

    public C14559(byte[] bArr, InterfaceC8310 interfaceC8310) {
        this.f45870 = new C11707(bArr);
        this.f45872 = interfaceC8310;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45871 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC7564 abstractC7564 = this.f45871;
        if (abstractC7564 == null) {
            throw new NoSuchElementException();
        }
        this.f45871 = m35112();
        return abstractC7564;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC7564 m35112() {
        C11707 c11707 = this.f45870;
        AbstractC7564 abstractC7564 = null;
        while (abstractC7564 == null) {
            try {
                int i = this.f45869;
                if (i == -1) {
                    break;
                }
                c11707.m56027(i);
                abstractC7564 = (AbstractC7564) this.f45872.mo6459(c11707);
                int iM20656 = (int) abstractC7564.m20656();
                if (iM20656 == 0) {
                    this.f45869 = -1;
                } else {
                    this.f45869 += iM20656;
                }
            } catch (C2013 e) {
                throw new C12082(e);
            }
        }
        return abstractC7564;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
