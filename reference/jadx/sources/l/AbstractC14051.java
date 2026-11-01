package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: l.ܰ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14051 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C5003 f46185;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f46186 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConcurrentMapC21937 f46187;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5003 f46188;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18283 f46189;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC0769 f46190;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f46191;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AtomicReferenceArray f46192;

    public AbstractC14051(ConcurrentMapC21937 concurrentMapC21937) {
        this.f46187 = concurrentMapC21937;
        this.f46191 = concurrentMapC21937.f71147.length - 1;
        m33998();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33998() {
        this.f46188 = null;
        if (m34000() || m33997()) {
            return;
        }
        while (true) {
            int i = this.f46191;
            if (i < 0) {
                return;
            }
            C18283[] c18283Arr = this.f46187.f71147;
            this.f46191 = i - 1;
            C18283 c18283 = c18283Arr[i];
            this.f46189 = c18283;
            if (c18283.f58345 != 0) {
                AtomicReferenceArray atomicReferenceArray = this.f46189.f58341;
                this.f46192 = atomicReferenceArray;
                this.f46186 = atomicReferenceArray.length() - 1;
                if (m33997()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m34000() {
        InterfaceC0769 interfaceC0769 = this.f46190;
        if (interfaceC0769 == null) {
            return false;
        }
        while (true) {
            this.f46190 = interfaceC0769.getNext();
            InterfaceC0769 interfaceC07610 = this.f46190;
            if (interfaceC07610 == null) {
                return false;
            }
            if (m33999(interfaceC07610)) {
                return true;
            }
            interfaceC0769 = this.f46190;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m33997() {
        while (true) {
            int i = this.f46186;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f46192;
            this.f46186 = i - 1;
            InterfaceC0769 interfaceC0769 = (InterfaceC0769) atomicReferenceArray.get(i);
            this.f46190 = interfaceC0769;
            if (interfaceC0769 != null && (m33999(interfaceC0769) || m34000())) {
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33999(InterfaceC0769 interfaceC0769) {
        Object obj;
        C18283 c18283;
        ConcurrentMapC21937 concurrentMapC21937 = this.f46187;
        try {
            long jMo8123 = concurrentMapC21937.f71151.mo8123();
            Object key = interfaceC0769.getKey();
            Object obj2 = null;
            if (interfaceC0769.getKey() != null && (obj = interfaceC0769.mo3304().get()) != null && !concurrentMapC21937.m48757(interfaceC0769, jMo8123)) {
                obj2 = obj;
            }
            if (obj2 == null) {
                return false;
            }
            this.f46188 = new C5003(concurrentMapC21937, key, obj2);
            return true;
        } finally {
            this.f46189.m42472();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46188 != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5003 m34001() {
        C5003 c5003 = this.f46188;
        if (c5003 == null) {
            throw new NoSuchElementException();
        }
        this.f46185 = c5003;
        m33998();
        return this.f46185;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C18304.m42523(this.f46185 != null);
        this.f46187.remove(this.f46185.f17415);
        this.f46185 = null;
    }

    @Override // java.util.Iterator
    public Object next() {
        return m34001();
    }
}
