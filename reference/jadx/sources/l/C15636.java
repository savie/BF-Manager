package l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ܳ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15636 extends AbstractQueue {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23096 f50776;

    public C15636() {
        C23096 c23096 = new C23096();
        c23096.f74892 = c23096;
        c23096.f74893 = c23096;
        this.f50776 = c23096;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC2213 interfaceC2213 = (InterfaceC2213) obj;
        InterfaceC2213 interfaceC2213Mo7543 = interfaceC2213.mo7543();
        InterfaceC2213 interfaceC2213Mo7554 = interfaceC2213.mo7554();
        Logger logger = ConcurrentMapC5942.f20333;
        interfaceC2213Mo7543.mo7549(interfaceC2213Mo7554);
        interfaceC2213Mo7554.mo7555(interfaceC2213Mo7543);
        C23096 c23096 = this.f50776;
        InterfaceC2213 interfaceC2214 = c23096.f74893;
        interfaceC2214.mo7549(interfaceC2213);
        interfaceC2213.mo7555(interfaceC2214);
        interfaceC2213.mo7549(c23096);
        c23096.f74893 = interfaceC2213;
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C23096 c23096 = this.f50776;
        InterfaceC2213 interfaceC2213 = c23096.f74892;
        while (interfaceC2213 != c23096) {
            InterfaceC2213 interfaceC2213Mo7554 = interfaceC2213.mo7554();
            Logger logger = ConcurrentMapC5942.f20333;
            EnumC16031 enumC16031 = EnumC16031.INSTANCE;
            interfaceC2213.mo7549(enumC16031);
            interfaceC2213.mo7555(enumC16031);
            interfaceC2213 = interfaceC2213Mo7554;
        }
        c23096.f74892 = c23096;
        c23096.f74893 = c23096;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        C23096 c23096 = this.f50776;
        return c23096.f74892 == c23096;
    }

    @Override // java.util.Queue
    public final Object peek() {
        C23096 c23096 = this.f50776;
        InterfaceC2213 interfaceC2213 = c23096.f74892;
        if (interfaceC2213 == c23096) {
            return null;
        }
        return interfaceC2213;
    }

    @Override // java.util.Queue
    public final Object poll() {
        C23096 c23096 = this.f50776;
        InterfaceC2213 interfaceC2213 = c23096.f74892;
        if (interfaceC2213 == c23096) {
            return null;
        }
        remove(interfaceC2213);
        return interfaceC2213;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C23096 c23096 = this.f50776;
        int i = 0;
        for (InterfaceC2213 interfaceC2213Mo7554 = c23096.f74892; interfaceC2213Mo7554 != c23096; interfaceC2213Mo7554 = interfaceC2213Mo7554.mo7554()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC2213 interfaceC2213 = (InterfaceC2213) obj;
        InterfaceC2213 interfaceC2213Mo7543 = interfaceC2213.mo7543();
        InterfaceC2213 interfaceC2213Mo7554 = interfaceC2213.mo7554();
        Logger logger = ConcurrentMapC5942.f20333;
        interfaceC2213Mo7543.mo7549(interfaceC2213Mo7554);
        interfaceC2213Mo7554.mo7555(interfaceC2213Mo7543);
        EnumC16031 enumC16031 = EnumC16031.INSTANCE;
        interfaceC2213.mo7549(enumC16031);
        interfaceC2213.mo7555(enumC16031);
        return interfaceC2213Mo7554 != enumC16031;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((InterfaceC2213) obj).mo7554() != EnumC16031.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C23096 c23096 = this.f50776;
        InterfaceC2213 interfaceC2213 = c23096.f74892;
        if (interfaceC2213 == c23096) {
            interfaceC2213 = null;
        }
        return new C20112(this, interfaceC2213);
    }
}
