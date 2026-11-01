package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۚ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes2.dex */
public final class C5691 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5982 f19411;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC18723 f19413;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f19412 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC3905 f19410 = m15687();

    public C5691(byte[] bArr, InterfaceC18723 interfaceC18723) {
        this.f19411 = new C5982(bArr);
        this.f19413 = interfaceC18723;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19410 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC3905 abstractC3905 = this.f19410;
        if (abstractC3905 == null) {
            throw new NoSuchElementException();
        }
        this.f19410 = m15687();
        return abstractC3905;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC3905 m15687() {
        C5982 c5982 = this.f19411;
        AbstractC3905 abstractC3905 = null;
        while (abstractC3905 == null) {
            try {
                int i = this.f19412;
                if (i == -1) {
                    break;
                }
                c5982.m27376(i);
                abstractC3905 = (AbstractC3905) this.f19413.mo2112(c5982);
                int iM11357 = (int) abstractC3905.m11357();
                if (iM11357 == 0) {
                    this.f19412 = -1;
                } else {
                    this.f19412 += iM11357;
                }
            } catch (C17271 e) {
                throw new C13865(e);
            }
        }
        return abstractC3905;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
