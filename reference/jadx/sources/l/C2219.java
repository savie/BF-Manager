package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.֫᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes3.dex */
public final class C2219 extends C14618 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f7277;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TreeMap f7278;

    public C2219(C15291 c15291, EnumC13127 enumC13127, int i) {
        TreeMap treeMap = new TreeMap();
        super(c15291, enumC13127);
        this.f7277 = i;
        this.f7278 = treeMap;
    }

    @Override // l.C14618
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1603() {
        int length = 1;
        for (int i = 0; i < this.f7277; i++) {
            ArrayList arrayList = (ArrayList) this.f7278.get(Integer.valueOf(i));
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    length += ((InterfaceC3359) it.next()).getLength();
                }
            }
            length += 2;
        }
        return length;
    }

    @Override // l.C14618, l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        super.mo1599(interfaceC9397);
        C11388 c11388 = (C11388) interfaceC9397;
        int i = this.f7277;
        c11388.m28735(i);
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = (ArrayList) this.f7278.get(Integer.valueOf(i2));
            if (arrayList != null) {
                c11388.m28740(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3359) it.next()).mo1599(c11388);
                }
            } else {
                c11388.m28740(0);
            }
        }
    }
}
