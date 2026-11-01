package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۧܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11057 extends C12925 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TreeMap f37542;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f37543;

    public C11057(C12738 c12738, EnumC16783 enumC16783, int i) {
        TreeMap treeMap = new TreeMap();
        super(c12738, enumC16783);
        this.f37543 = i;
        this.f37542 = treeMap;
    }

    @Override // l.C12925
    /* JADX INFO: renamed from: ۨ */
    public final int mo7125() {
        int length = 1;
        for (int i = 0; i < this.f37543; i++) {
            ArrayList arrayList = (ArrayList) this.f37542.get(Integer.valueOf(i));
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    length += ((InterfaceC4705) it.next()).getLength();
                }
            }
            length += 2;
        }
        return length;
    }

    @Override // l.C12925, l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        super.mo2341(interfaceC19275);
        C23509 c23509 = (C23509) interfaceC19275;
        int i = this.f37543;
        c23509.m51765(i);
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = (ArrayList) this.f37542.get(Integer.valueOf(i2));
            if (arrayList != null) {
                c23509.m51770(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4705) it.next()).mo2341(c23509);
                }
            } else {
                c23509.m51770(0);
            }
        }
    }
}
