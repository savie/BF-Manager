package l;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܳۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49EX */
/* JADX INFO: loaded from: classes4.dex */
public final class C15327 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC7564 f50071;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13090 f50072;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f50073;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8310 f50074 = C21273.m48448();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f50075;

    public C15327(C13090 c13090) {
        AbstractC7564 abstractC7564;
        this.f50072 = c13090;
        m36775(true);
        while (true) {
            Iterator it = this.f50075;
            if (it == null) {
                abstractC7564 = null;
                break;
            } else {
                if (it.hasNext()) {
                    abstractC7564 = (AbstractC7564) this.f50075.next();
                    break;
                }
                m36775(false);
            }
        }
        this.f50071 = abstractC7564;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f50071 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC7564 abstractC7564;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        AbstractC7564 abstractC7565 = this.f50071;
        while (true) {
            Iterator it = this.f50075;
            if (it == null) {
                abstractC7564 = null;
                break;
            }
            if (it.hasNext()) {
                abstractC7564 = (AbstractC7564) this.f50075.next();
                break;
            }
            m36775(false);
        }
        this.f50071 = abstractC7564;
        return abstractC7565;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36775(boolean z) {
        EnumSet enumSetNoneOf;
        byte[] bArr;
        C13090 c13090 = this.f50072;
        C23533 c23533 = c13090.f19479;
        if (z) {
            enumSetNoneOf = EnumSet.of(EnumC3526.SMB2_RESTART_SCANS);
        } else {
            enumSetNoneOf = EnumSet.noneOf(EnumC3526.class);
        }
        InterfaceC8310 interfaceC8310 = this.f50074;
        C12475 c12475M4261 = c23533.m4261(c13090.f19480, enumSetNoneOf, interfaceC8310.mo6458());
        long jM43472 = ((C18684) c12475M4261.mo3632()).m43472();
        byte[] bArrM30972 = c12475M4261.m30972();
        if (jM43472 == EnumC20243.STATUS_NO_MORE_FILES.getValue() || jM43472 == EnumC20243.STATUS_NO_SUCH_FILE.getValue() || ((bArr = this.f50073) != null && Arrays.equals(bArr, bArrM30972))) {
            this.f50075 = null;
            this.f50073 = null;
        } else {
            this.f50073 = bArrM30972;
            this.f50075 = C21273.m48446(bArrM30972, interfaceC8310);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
