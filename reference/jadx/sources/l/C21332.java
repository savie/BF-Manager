package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37EB */
/* JADX INFO: loaded from: classes5.dex */
public final class C21332 extends C21259 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7660 f67971;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f67972;

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C21332(C7660 c7660, List list) {
        this.f67971 = c7660;
        this.f67972 = list;
    }

    @Override // l.InterfaceC3359
    public final int getLength() {
        return (this.f67972.size() * 2) + 4;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(this.f67971.f67820);
        List list = this.f67972;
        c11388.m28740(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c11388.m28740(((C7660) it.next()).f67820);
        }
    }

    public final String toString() {
        String str;
        List list = this.f67972;
        C7660 c7660 = this.f67971;
        if (c7660 == null || c7660.f67820 == -1) {
            str = " n/a";
        } else {
            str = " #" + c7660.f67820;
        }
        return C3188.m10404("{MethodHandle:", str, " Arguments:", (list == null || list.isEmpty()) ? "{}" : C8947.m23910(new StringBuilder("{ "), (String) C1170.stream(list).map(new C21390(1)).collect(C2025.joining(", ")), " }"), l.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21332)) {
            return false;
        }
        C21332 c21332 = (C21332) obj;
        if (C17359.equals(this.f67971, c21332.f67971)) {
            return C17359.equals(this.f67972, c21332.f67972) & (this.f67820 == c21332.f67820);
        }
        return false;
    }

    @Override // l.C21259
    public final int hashCode() {
        C7660 c7660 = this.f67971;
        int iHashCode = (c7660 != null ? c7660.hashCode() : 0) * 961;
        List list = this.f67972;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48559(Object obj) {
        List list = this.f67972;
        if (this == obj) {
            return true;
        }
        if (C1402.m5130(obj)) {
            C21332 c21332 = (C21332) obj;
            List list2 = c21332.f67972;
            if (C17359.equals(this.f67971, c21332.f67971)) {
                if (list == list2) {
                    return true;
                }
                if (list != null && list.size() == list2.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        if (((C7660) list.get(i)).m20872(list2.get(i))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
