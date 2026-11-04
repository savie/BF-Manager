package l;

import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15471 extends AbstractC13234 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f50382;

    public C15471(AbstractC24643 abstractC24643, InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210) {
        super(abstractC24643, interfaceC24329);
        this.f50382 = interfaceC243210;
    }

    public C15471(AbstractC24643 abstractC24643, InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, int i) {
        super(abstractC24643, interfaceC24329);
        this.f50382 = interfaceC243210;
    }

    @Override // l.InterfaceC11501
    public final String getName() {
        return this.f50382.toString();
    }

    @Override // l.AbstractC13234
    /* JADX INFO: renamed from: ܳ */
    public final String mo32790() {
        return this.f50382.getFileName().toString();
    }

    @Override // l.AbstractC13234
    /* JADX INFO: renamed from: ۙ */
    public final String mo32788(Collection collection) {
        InterfaceC24329 absolutePath = this.f42299.toAbsolutePath();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC24329 absolutePath2 = ((InterfaceC24329) it.next()).toAbsolutePath();
            if (absolutePath.startsWith(absolutePath2)) {
                try {
                    InterfaceC24329 interfaceC24329Relativize = absolutePath2.relativize(absolutePath);
                    if (interfaceC24329Relativize != null) {
                        return AbstractC13234.m32785(interfaceC24329Relativize);
                    }
                    continue;
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Override // l.AbstractC13234, l.InterfaceC15976
    /* JADX INFO: renamed from: ۙ */
    public final EnumC17468 mo10885() {
        Set set = AbstractC24643.f79773;
        return AbstractC24643.m54974(this.f50382.getFileName().toString());
    }

    @Override // l.AbstractC13234, l.InterfaceC15976
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10886(String str, EnumC17468 enumC17468) {
        return AbstractC13234.m32786(this.f50382, str, enumC17468);
    }

    @Override // l.AbstractC13234, l.InterfaceC11501
    public final URI toUri() {
        return this.f50382.toUri().normalize();
    }

    @Override // l.AbstractC13234
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC13234 mo32789(String str) {
        return new C15471(this.f42298, this.f42299.resolveSibling(str), this.f50382.resolveSibling(str));
    }
}
