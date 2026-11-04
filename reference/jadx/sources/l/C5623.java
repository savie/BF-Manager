package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5623 extends AbstractC14900 {
    public ArrayList d;

    @Override // l.AbstractC9591, l.InterfaceC15143
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // l.AbstractC9591, l.InterfaceC15143
    public final void end() {
        C12884.sort(this.d, this.b);
        long size = this.d.size();
        InterfaceC15143 interfaceC15143 = this.a;
        interfaceC15143.c(size);
        if (!this.c) {
            ArrayList arrayList = this.d;
            C17359.requireNonNull(interfaceC15143);
            C1170.a(arrayList, new C3249(14, interfaceC15143));
        } else {
            ArrayList arrayList2 = this.d;
            int size2 = arrayList2.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList2.get(i);
                i++;
                if (interfaceC15143.f()) {
                    break;
                } else {
                    interfaceC15143.n(obj);
                }
            }
        }
        interfaceC15143.end();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.d.add(obj);
    }
}
