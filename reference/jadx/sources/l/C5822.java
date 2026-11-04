package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۚᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8QA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5822 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8402 f20025;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8402 f20027;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C8402 f20028;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1634 f20030;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f20029 = AbstractC1928.of();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC17589 f20026 = AbstractC17589.of();

    public C5822(C1634 c1634) {
        this.f20030 = c1634;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8402 m16984() {
        return this.f20025;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8402 m16988() {
        return this.f20028;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8402 m16991() {
        return this.f20027;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8402 m16989() {
        if (this.f20029.isEmpty()) {
            return null;
        }
        return (C8402) C16625.m39339(this.f20029);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC24755 m16985(C8402 c8402) {
        return (AbstractC24755) this.f20026.get(c8402);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16987(InterfaceC19533 interfaceC19533) {
        this.f20025 = m16980(interfaceC19533, this.f20029, this.f20028, this.f20030);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m16990(InterfaceC19533 interfaceC19533) {
        this.f20025 = m16980(interfaceC19533, this.f20029, this.f20028, this.f20030);
        m16981(interfaceC19533.mo23565());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16986(List list, C8402 c8402, InterfaceC19533 interfaceC19533) {
        this.f20029 = AbstractC1928.copyOf((Collection) list);
        if (!list.isEmpty()) {
            this.f20028 = (C8402) list.get(0);
            c8402.getClass();
            this.f20027 = c8402;
        }
        if (this.f20025 == null) {
            this.f20025 = m16980(interfaceC19533, this.f20029, this.f20028, this.f20030);
        }
        m16981(interfaceC19533.mo23565());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16981(AbstractC24755 abstractC24755) {
        C25049 c25049M41247 = AbstractC17589.m41247();
        if (this.f20029.isEmpty()) {
            m16982(c25049M41247, this.f20028, abstractC24755);
            if (!C17359.equals(this.f20027, this.f20028)) {
                m16982(c25049M41247, this.f20027, abstractC24755);
            }
            if (!C17359.equals(this.f20025, this.f20028) && !C17359.equals(this.f20025, this.f20027)) {
                m16982(c25049M41247, this.f20025, abstractC24755);
            }
        } else {
            for (int i = 0; i < this.f20029.size(); i++) {
                m16982(c25049M41247, (C8402) this.f20029.get(i), abstractC24755);
            }
            if (!this.f20029.contains(this.f20025)) {
                m16982(c25049M41247, this.f20025, abstractC24755);
            }
        }
        this.f20026 = c25049M41247.mo14570();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16982(C25049 c25049, C8402 c8402, AbstractC24755 abstractC24755) {
        if (c8402 == null) {
            return;
        }
        if (abstractC24755.mo1588(c8402.f27520) != -1) {
            c25049.mo14569(c8402, abstractC24755);
            return;
        }
        AbstractC24755 abstractC24756 = (AbstractC24755) this.f20026.get(c8402);
        if (abstractC24756 != null) {
            c25049.mo14569(c8402, abstractC24756);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8402 m16980(InterfaceC19533 interfaceC19533, AbstractC1928 abstractC1928, C8402 c8402, C1634 c1634) {
        AbstractC24755 abstractC24755Mo23565 = interfaceC19533.mo23565();
        int iMo23562 = interfaceC19533.mo23562();
        Object objMo1589 = abstractC24755Mo23565.m55264() ? null : abstractC24755Mo23565.mo1589(iMo23562);
        int iM5786 = (interfaceC19533.mo23542() || abstractC24755Mo23565.m55264()) ? -1 : abstractC24755Mo23565.mo1591(iMo23562, c1634, false).m5786(C7116.m19474(interfaceC19533.getCurrentPosition()) - c1634.f5659);
        for (int i = 0; i < abstractC1928.size(); i++) {
            C8402 c8403 = (C8402) abstractC1928.get(i);
            if (m16983(c8403, objMo1589, interfaceC19533.mo23542(), interfaceC19533.mo23544(), interfaceC19533.mo23561(), iM5786)) {
                return c8403;
            }
        }
        if (abstractC1928.isEmpty() && c8402 != null) {
            if (m16983(c8402, objMo1589, interfaceC19533.mo23542(), interfaceC19533.mo23544(), interfaceC19533.mo23561(), iM5786)) {
                return c8402;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16983(C8402 c8402, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = c8402.f27520;
        int i4 = c8402.f27516;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && c8402.f27519 == i2) {
            return true;
        }
        return !z && i4 == -1 && c8402.f27517 == i3;
    }
}
