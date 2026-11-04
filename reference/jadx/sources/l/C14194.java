package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.۬᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14194 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f44871;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14106 f44872;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15976 f44873;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f44874;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f44875;

    public C14194(Iterable iterable, C14106 c14106, Set set) {
        this.f44871 = iterable;
        this.f44872 = c14106;
        this.f44874 = set;
        this.f44875 = iterable.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f44873 == null) {
            while (true) {
                Iterator it = this.f44875;
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC15976 interfaceC15976 = (InterfaceC15976) it.next();
                if (interfaceC15976.mo10885() != EnumC17468.CLASS && interfaceC15976.mo10885() != EnumC17468.SOURCE) {
                    this.f44872.f38071 |= 4503599627370496L;
                }
                if (this.f44874.contains(interfaceC15976.mo10885())) {
                    this.f44873 = interfaceC15976;
                    break;
                }
            }
        }
        return this.f44873 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        InterfaceC15976 interfaceC15976 = this.f44873;
        this.f44873 = null;
        return interfaceC15976;
    }
}
