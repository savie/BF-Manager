package l;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.۟᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8157 extends AbstractQueue {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18598 f26913;

    public C8157() {
        C18598 c18598 = new C18598();
        c18598.f60394 = c18598;
        c18598.f60395 = c18598;
        this.f26913 = c18598;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC2213 interfaceC2213 = (InterfaceC2213) obj;
        InterfaceC2213 interfaceC2213Mo7544 = interfaceC2213.mo7544();
        InterfaceC2213 interfaceC2213Mo7551 = interfaceC2213.mo7551();
        Logger logger = ConcurrentMapC5942.f20333;
        interfaceC2213Mo7544.mo7553(interfaceC2213Mo7551);
        interfaceC2213Mo7551.mo7546(interfaceC2213Mo7544);
        C18598 c18598 = this.f26913;
        InterfaceC2213 interfaceC2214 = c18598.f60395;
        interfaceC2214.mo7553(interfaceC2213);
        interfaceC2213.mo7546(interfaceC2214);
        interfaceC2213.mo7553(c18598);
        c18598.f60395 = interfaceC2213;
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C18598 c18598 = this.f26913;
        InterfaceC2213 interfaceC2213 = c18598.f60394;
        while (interfaceC2213 != c18598) {
            InterfaceC2213 interfaceC2213Mo7551 = interfaceC2213.mo7551();
            Logger logger = ConcurrentMapC5942.f20333;
            EnumC16031 enumC16031 = EnumC16031.INSTANCE;
            interfaceC2213.mo7553(enumC16031);
            interfaceC2213.mo7546(enumC16031);
            interfaceC2213 = interfaceC2213Mo7551;
        }
        c18598.f60394 = c18598;
        c18598.f60395 = c18598;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        C18598 c18598 = this.f26913;
        return c18598.f60394 == c18598;
    }

    @Override // java.util.Queue
    public final Object peek() {
        C18598 c18598 = this.f26913;
        InterfaceC2213 interfaceC2213 = c18598.f60394;
        if (interfaceC2213 == c18598) {
            return null;
        }
        return interfaceC2213;
    }

    @Override // java.util.Queue
    public final Object poll() {
        C18598 c18598 = this.f26913;
        InterfaceC2213 interfaceC2213 = c18598.f60394;
        if (interfaceC2213 == c18598) {
            return null;
        }
        remove(interfaceC2213);
        return interfaceC2213;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        C18598 c18598 = this.f26913;
        int i = 0;
        for (InterfaceC2213 interfaceC2213Mo7551 = c18598.f60394; interfaceC2213Mo7551 != c18598; interfaceC2213Mo7551 = interfaceC2213Mo7551.mo7551()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC2213 interfaceC2213 = (InterfaceC2213) obj;
        InterfaceC2213 interfaceC2213Mo7544 = interfaceC2213.mo7544();
        InterfaceC2213 interfaceC2213Mo7551 = interfaceC2213.mo7551();
        Logger logger = ConcurrentMapC5942.f20333;
        interfaceC2213Mo7544.mo7553(interfaceC2213Mo7551);
        interfaceC2213Mo7551.mo7546(interfaceC2213Mo7544);
        EnumC16031 enumC16031 = EnumC16031.INSTANCE;
        interfaceC2213.mo7553(enumC16031);
        interfaceC2213.mo7546(enumC16031);
        return interfaceC2213Mo7551 != enumC16031;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((InterfaceC2213) obj).mo7551() != EnumC16031.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C18598 c18598 = this.f26913;
        InterfaceC2213 interfaceC2213 = c18598.f60394;
        if (interfaceC2213 == c18598) {
            interfaceC2213 = null;
        }
        return new C0699(this, interfaceC2213);
    }
}
