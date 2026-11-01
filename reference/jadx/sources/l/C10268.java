package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10268 extends AbstractC9322 {
    public ArrayList d;

    @Override // l.AbstractC1094, l.InterfaceC19171
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // l.AbstractC1094, l.InterfaceC19171
    public final void end() {
        C23846.sort(this.d, this.b);
        long size = this.d.size();
        InterfaceC19171 interfaceC19171 = this.a;
        interfaceC19171.c(size);
        if (!this.c) {
            ArrayList arrayList = this.d;
            C13638.requireNonNull(interfaceC19171);
            C9030.a(arrayList, new C5295(13, interfaceC19171));
        } else {
            ArrayList arrayList2 = this.d;
            int size2 = arrayList2.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList2.get(i);
                i++;
                if (interfaceC19171.f()) {
                    break;
                } else {
                    interfaceC19171.n(obj);
                }
            }
        }
        interfaceC19171.end();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.d.add(obj);
    }
}
