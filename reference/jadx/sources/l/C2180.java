package l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ۖ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2180 extends AbstractQueue {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13471 f7920;

    public C2180() {
        C13471 c13471 = new C13471();
        c13471.f44538 = c13471;
        c13471.f44539 = c13471;
        this.f7920 = c13471;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC0769 interfaceC0769 = (InterfaceC0769) obj;
        InterfaceC0769 interfaceC0769Mo2935 = interfaceC0769.mo2935();
        InterfaceC0769 interfaceC0769Mo2939 = interfaceC0769.mo2939();
        Logger logger = ConcurrentMapC21937.f71142;
        interfaceC0769Mo2935.mo2938(interfaceC0769Mo2939);
        interfaceC0769Mo2939.mo2934(interfaceC0769Mo2935);
        C13471 c13471 = this.f7920;
        InterfaceC0769 interfaceC07610 = c13471.f44539;
        interfaceC07610.mo2938(interfaceC0769);
        interfaceC0769.mo2934(interfaceC07610);
        interfaceC0769.mo2938(c13471);
        c13471.f44539 = interfaceC0769;
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C13471 c13471 = this.f7920;
        InterfaceC0769 interfaceC0769 = c13471.f44538;
        while (interfaceC0769 != c13471) {
            InterfaceC0769 interfaceC0769Mo2939 = interfaceC0769.mo2939();
            Logger logger = ConcurrentMapC21937.f71142;
            EnumC15462 enumC15462 = EnumC15462.INSTANCE;
            interfaceC0769.mo2938(enumC15462);
            interfaceC0769.mo2934(enumC15462);
            interfaceC0769 = interfaceC0769Mo2939;
        }
        c13471.f44538 = c13471;
        c13471.f44539 = c13471;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        C13471 c13471 = this.f7920;
        return c13471.f44538 == c13471;
    }

    @Override // java.util.Queue
    public final Object peek() {
        C13471 c13471 = this.f7920;
        InterfaceC0769 interfaceC0769 = c13471.f44538;
        if (interfaceC0769 == c13471) {
            return null;
        }
        return interfaceC0769;
    }

    @Override // java.util.Queue
    public final Object poll() {
        C13471 c13471 = this.f7920;
        InterfaceC0769 interfaceC0769 = c13471.f44538;
        if (interfaceC0769 == c13471) {
            return null;
        }
        remove(interfaceC0769);
        return interfaceC0769;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C13471 c13471 = this.f7920;
        int i = 0;
        for (InterfaceC0769 interfaceC0769Mo2939 = c13471.f44538; interfaceC0769Mo2939 != c13471; interfaceC0769Mo2939 = interfaceC0769Mo2939.mo2939()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC0769 interfaceC0769 = (InterfaceC0769) obj;
        InterfaceC0769 interfaceC0769Mo2935 = interfaceC0769.mo2935();
        InterfaceC0769 interfaceC0769Mo2939 = interfaceC0769.mo2939();
        Logger logger = ConcurrentMapC21937.f71142;
        interfaceC0769Mo2935.mo2938(interfaceC0769Mo2939);
        interfaceC0769Mo2939.mo2934(interfaceC0769Mo2935);
        EnumC15462 enumC15462 = EnumC15462.INSTANCE;
        interfaceC0769.mo2938(enumC15462);
        interfaceC0769.mo2934(enumC15462);
        return interfaceC0769Mo2939 != enumC15462;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((InterfaceC0769) obj).mo2939() != EnumC15462.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C13471 c13471 = this.f7920;
        InterfaceC0769 interfaceC0769 = c13471.f44538;
        if (interfaceC0769 == c13471) {
            interfaceC0769 = null;
        }
        return new C11354(this, interfaceC0769);
    }
}
