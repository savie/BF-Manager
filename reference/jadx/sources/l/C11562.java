package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۤ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7EP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11562 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f36349;

    public C11562(int i) {
        this.f36349 = new ArrayList(i);
    }

    public C11562() {
        this(12);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f36349.iterator();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29081(InterfaceC3359 interfaceC3359) {
        this.f36349.add(interfaceC3359);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15867 m29080(C6169 c6169) {
        return C1170.stream(this.f36349).filter(c6169).findFirst();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m29083() {
        Iterator it = this.f36349.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((InterfaceC3359) it.next()).getLength();
        }
        return length + 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29082(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(this.f36349.size());
        m29084(c11388);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29084(InterfaceC9397 interfaceC9397) {
        Iterator it = this.f36349.iterator();
        while (it.hasNext()) {
            ((InterfaceC3359) it.next()).mo1599(interfaceC9397);
        }
    }
}
