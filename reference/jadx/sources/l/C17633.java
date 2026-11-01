package l;

import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿ᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17633 extends AbstractC6344 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f56043;

    public C17633(AbstractC3729 abstractC3729, InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801) {
        super(abstractC3729, interfaceC3800);
        this.f56043 = interfaceC3801;
    }

    public C17633(AbstractC3729 abstractC3729, InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, int i) {
        super(abstractC3729, interfaceC3800);
        this.f56043 = interfaceC3801;
    }

    @Override // l.InterfaceC3458
    public final String getName() {
        return this.f56043.toString();
    }

    @Override // l.AbstractC6344
    /* JADX INFO: renamed from: ᩹ */
    public final String mo17451() {
        return this.f56043.getFileName().toString();
    }

    @Override // l.AbstractC6344
    /* JADX INFO: renamed from: ۙ */
    public final String mo17449(Collection collection) {
        InterfaceC3800 absolutePath = this.f21404.toAbsolutePath();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC3800 absolutePath2 = ((InterfaceC3800) it.next()).toAbsolutePath();
            if (absolutePath.startsWith(absolutePath2)) {
                try {
                    InterfaceC3800 interfaceC3800Relativize = absolutePath2.relativize(absolutePath);
                    if (interfaceC3800Relativize != null) {
                        return AbstractC6344.m17447(interfaceC3800Relativize);
                    }
                    continue;
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Override // l.AbstractC6344, l.InterfaceC2173
    /* JADX INFO: renamed from: ۙ */
    public final EnumC11347 mo6760() {
        Set set = AbstractC3729.f13542;
        return AbstractC3729.m10910(this.f56043.getFileName().toString());
    }

    @Override // l.AbstractC6344, l.InterfaceC2173
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6761(String str, EnumC11347 enumC11347) {
        return AbstractC6344.m17448(this.f56043, str, enumC11347);
    }

    @Override // l.AbstractC6344, l.InterfaceC3458
    public final URI toUri() {
        return this.f56043.toUri().normalize();
    }

    @Override // l.AbstractC6344
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6344 mo17450(String str) {
        return new C17633(this.f21403, this.f21404.resolveSibling(str), this.f56043.resolveSibling(str));
    }
}
