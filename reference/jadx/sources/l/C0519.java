package l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.֡ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0519 extends AbstractQueue {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16043 f2210;

    public C0519() {
        C16043 c16043 = new C16043();
        c16043.f51929 = c16043;
        c16043.f51930 = c16043;
        this.f2210 = c16043;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC0769 interfaceC0769 = (InterfaceC0769) obj;
        InterfaceC0769 interfaceC0769Mo3300 = interfaceC0769.mo3300();
        InterfaceC0769 interfaceC0769Mo3299 = interfaceC0769.mo3299();
        Logger logger = ConcurrentMapC21937.f71142;
        interfaceC0769Mo3300.mo3305(interfaceC0769Mo3299);
        interfaceC0769Mo3299.mo3302(interfaceC0769Mo3300);
        C16043 c16043 = this.f2210;
        InterfaceC0769 interfaceC07610 = c16043.f51930;
        interfaceC07610.mo3305(interfaceC0769);
        interfaceC0769.mo3302(interfaceC07610);
        interfaceC0769.mo3305(c16043);
        c16043.f51930 = interfaceC0769;
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C16043 c16043 = this.f2210;
        InterfaceC0769 interfaceC0769 = c16043.f51929;
        while (interfaceC0769 != c16043) {
            InterfaceC0769 interfaceC0769Mo3299 = interfaceC0769.mo3299();
            Logger logger = ConcurrentMapC21937.f71142;
            EnumC15462 enumC15462 = EnumC15462.INSTANCE;
            interfaceC0769.mo3305(enumC15462);
            interfaceC0769.mo3302(enumC15462);
            interfaceC0769 = interfaceC0769Mo3299;
        }
        c16043.f51929 = c16043;
        c16043.f51930 = c16043;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        C16043 c16043 = this.f2210;
        return c16043.f51929 == c16043;
    }

    @Override // java.util.Queue
    public final Object peek() {
        C16043 c16043 = this.f2210;
        InterfaceC0769 interfaceC0769 = c16043.f51929;
        if (interfaceC0769 == c16043) {
            return null;
        }
        return interfaceC0769;
    }

    @Override // java.util.Queue
    public final Object poll() {
        C16043 c16043 = this.f2210;
        InterfaceC0769 interfaceC0769 = c16043.f51929;
        if (interfaceC0769 == c16043) {
            return null;
        }
        remove(interfaceC0769);
        return interfaceC0769;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C16043 c16043 = this.f2210;
        int i = 0;
        for (InterfaceC0769 interfaceC0769Mo3299 = c16043.f51929; interfaceC0769Mo3299 != c16043; interfaceC0769Mo3299 = interfaceC0769Mo3299.mo3299()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC0769 interfaceC0769 = (InterfaceC0769) obj;
        InterfaceC0769 interfaceC0769Mo3300 = interfaceC0769.mo3300();
        InterfaceC0769 interfaceC0769Mo3299 = interfaceC0769.mo3299();
        Logger logger = ConcurrentMapC21937.f71142;
        interfaceC0769Mo3300.mo3305(interfaceC0769Mo3299);
        interfaceC0769Mo3299.mo3302(interfaceC0769Mo3300);
        EnumC15462 enumC15462 = EnumC15462.INSTANCE;
        interfaceC0769.mo3305(enumC15462);
        interfaceC0769.mo3302(enumC15462);
        return interfaceC0769Mo3299 != enumC15462;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((InterfaceC0769) obj).mo3299() != EnumC15462.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C16043 c16043 = this.f2210;
        InterfaceC0769 interfaceC0769 = c16043.f51929;
        if (interfaceC0769 == c16043) {
            interfaceC0769 = null;
        }
        return new C20276(this, interfaceC0769);
    }
}
