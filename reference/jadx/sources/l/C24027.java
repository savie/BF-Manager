package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7EP */
/* JADX INFO: loaded from: classes.dex */
public final class C24027 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f77846;

    public C24027(int i) {
        this.f77846 = new ArrayList(i);
    }

    public C24027() {
        this(12);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f77846.iterator();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52871(InterfaceC4705 interfaceC4705) {
        this.f77846.add(interfaceC4705);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11521 m52870(C5308 c5308) {
        return C9030.stream(this.f77846).filter(c5308).findFirst();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m52873() {
        Iterator it = this.f77846.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((InterfaceC4705) it.next()).getLength();
        }
        return length + 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52872(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(this.f77846.size());
        m52874(c23509);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52874(InterfaceC19275 interfaceC19275) {
        Iterator it = this.f77846.iterator();
        while (it.hasNext()) {
            ((InterfaceC4705) it.next()).mo2341(interfaceC19275);
        }
    }
}
