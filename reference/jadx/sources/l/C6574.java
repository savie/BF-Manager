package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37EB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6574 extends C13173 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15187 f22129;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f22130;

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C6574(C15187 c15187, List list) {
        this.f22129 = c15187;
        this.f22130 = list;
    }

    @Override // l.InterfaceC4705
    public final int getLength() {
        return (this.f22130.size() * 2) + 4;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(this.f22129.f43854);
        List list = this.f22130;
        c23509.m51770(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c23509.m51770(((C15187) it.next()).f43854);
        }
    }

    public final String toString() {
        String str;
        List list = this.f22130;
        C15187 c15187 = this.f22129;
        if (c15187 == null || c15187.f43854 == -1) {
            str = " n/a";
        } else {
            str = " #" + c15187.f43854;
        }
        return C0242.m1617("{MethodHandle:", str, " Arguments:", (list == null || list.isEmpty()) ? "{}" : C22697.m50267(new StringBuilder("{ "), (String) C9030.stream(list).map(new C3751()).collect(C1890.joining(", ")), " }"), l.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6574)) {
            return false;
        }
        C6574 c6574 = (C6574) obj;
        if (C13638.equals(this.f22129, c6574.f22129)) {
            return C13638.equals(this.f22130, c6574.f22130) & (this.f43854 == c6574.f43854);
        }
        return false;
    }

    @Override // l.C13173
    public final int hashCode() {
        C15187 c15187 = this.f22129;
        int iHashCode = (c15187 != null ? c15187.hashCode() : 0) * 961;
        List list = this.f22130;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17814(Object obj) {
        List list = this.f22130;
        if (this == obj) {
            return true;
        }
        if (C6009.m16315(obj)) {
            C6574 c6574 = (C6574) obj;
            List list2 = c6574.f22130;
            if (C13638.equals(this.f22129, c6574.f22129)) {
                if (list == list2) {
                    return true;
                }
                if (list != null && list.size() == list2.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        if (((C15187) list.get(i)).m36400(list2.get(i))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
