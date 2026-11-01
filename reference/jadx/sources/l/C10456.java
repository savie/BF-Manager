package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10456 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f35689;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7675 f35690;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC2173 f35691;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f35692;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f35693;

    public C10456(Iterable iterable, C7675 c7675, Set set) {
        this.f35692 = iterable;
        this.f35690 = c7675;
        this.f35689 = set;
        this.f35693 = iterable.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f35691 == null) {
            while (true) {
                Iterator it = this.f35693;
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC2173 interfaceC2173 = (InterfaceC2173) it.next();
                if (interfaceC2173.mo6760() != EnumC11347.CLASS && interfaceC2173.mo6760() != EnumC11347.SOURCE) {
                    this.f35690.f77447 |= 4503599627370496L;
                }
                if (this.f35689.contains(interfaceC2173.mo6760())) {
                    this.f35691 = interfaceC2173;
                    break;
                }
            }
        }
        return this.f35691 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        InterfaceC2173 interfaceC2173 = this.f35691;
        this.f35691 = null;
        return interfaceC2173;
    }
}
