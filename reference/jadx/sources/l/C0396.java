package l;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49EX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0396 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC18723 f1879 = C22625.m50148();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16625 f1880;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f1881;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC3905 f1882;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Iterator f1883;

    public C0396(C16625 c16625) {
        AbstractC3905 abstractC3905;
        this.f1880 = c16625;
        m2131(true);
        while (true) {
            Iterator it = this.f1883;
            if (it == null) {
                abstractC3905 = null;
                break;
            } else {
                if (it.hasNext()) {
                    abstractC3905 = (AbstractC3905) this.f1883.next();
                    break;
                }
                m2131(false);
            }
        }
        this.f1882 = abstractC3905;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1882 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC3905 abstractC3905;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        AbstractC3905 abstractC3906 = this.f1882;
        while (true) {
            Iterator it = this.f1883;
            if (it == null) {
                abstractC3905 = null;
                break;
            }
            if (it.hasNext()) {
                abstractC3905 = (AbstractC3905) this.f1883.next();
                break;
            }
            m2131(false);
        }
        this.f1882 = abstractC3905;
        return abstractC3906;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2131(boolean z) {
        EnumSet enumSetNoneOf;
        byte[] bArr;
        C16625 c16625 = this.f1880;
        C9570 c9570 = c16625.f41413;
        if (z) {
            enumSetNoneOf = EnumSet.of(EnumC9655.SMB2_RESTART_SCANS);
        } else {
            enumSetNoneOf = EnumSet.noneOf(EnumC9655.class);
        }
        InterfaceC18723 interfaceC18723 = this.f1879;
        C4342 c4342M47748 = c9570.m47748(c16625.f41412, enumSetNoneOf, interfaceC18723.mo2111());
        long jM4349 = ((C1186) c4342M47748.mo25478()).m4349();
        byte[] bArrM12178 = c4342M47748.m12178();
        if (jM4349 == EnumC3055.STATUS_NO_MORE_FILES.getValue() || jM4349 == EnumC3055.STATUS_NO_SUCH_FILE.getValue() || ((bArr = this.f1881) != null && Arrays.equals(bArr, bArrM12178))) {
            this.f1883 = null;
            this.f1881 = null;
        } else {
            this.f1881 = bArrM12178;
            this.f1883 = C22625.m50146(bArrM12178, interfaceC18723);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
