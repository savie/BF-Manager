package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩺ᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes.dex */
public final class C23174 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15413 f75208;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f75209;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15413 f75210;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f75211 = false;

    public C23174(C15413 c15413, C15413 c15414) {
        this.f75210 = c15413;
        this.f75208 = c15414;
        this.f75209 = c15414.f50249.iterator();
    }

    @Override // java.util.Iterator
    public final C8357 next() {
        if (!this.f75211) {
            Iterator it = this.f75209;
            if (it.hasNext()) {
                return (C8357) it.next();
            }
            this.f75211 = true;
        }
        C15413 c15413 = this.f75208;
        if (c15413.f50250.hasNext()) {
            InterfaceC16036 interfaceC16036 = (InterfaceC16036) c15413.f50250.next();
            C15413 c15414 = this.f75210;
            C10474 c10474 = c15414.f50248;
            C10474 c10475 = c15414.f50248;
            C8357 c8357 = new C8357(interfaceC16036, c10474.f35835, c10474.f35859, c10474.f35846, EnumC14026.f46096.m33945(c10475.f35859), c10475, c10475.f35833);
            c15413.f50249.add(c8357);
            return c8357;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z = this.f75211;
        C15413 c15413 = this.f75208;
        if (z) {
            return c15413.f50250.hasNext();
        }
        return this.f75209.hasNext() || c15413.f50250.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
