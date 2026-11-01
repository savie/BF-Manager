package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C30H */
/* JADX INFO: loaded from: classes4.dex */
public final class C12323 extends AbstractC21307 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C9501 f41175 = C9501.m24336("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f41176;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f41177;

    public C12323(ArrayList arrayList, ArrayList arrayList2) {
        this.f41176 = C0140.m1227((List) arrayList);
        this.f41177 = C0140.m1227((List) arrayList2);
    }

    @Override // l.AbstractC21307
    /* JADX INFO: renamed from: ۨ */
    public final C9501 mo4377() {
        return f41175;
    }

    @Override // l.AbstractC21307
    /* JADX INFO: renamed from: ۙ */
    public final long mo4375() {
        return m30591((InterfaceC10983) null, true);
    }

    @Override // l.AbstractC21307
    /* JADX INFO: renamed from: ۙ */
    public final void mo4376(InterfaceC10983 interfaceC10983) {
        m30591(interfaceC10983, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m30591(InterfaceC10983 interfaceC10983, boolean z) {
        C6043 c6043Mo16399;
        if (z) {
            c6043Mo16399 = new C6043();
        } else {
            c6043Mo16399 = interfaceC10983.mo16399();
        }
        List list = this.f41176;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c6043Mo16399.m16434writeByte(38);
            }
            String str = (String) list.get(i);
            c6043Mo16399.getClass();
            c6043Mo16399.m16408(0, str.length(), str);
            c6043Mo16399.m16434writeByte(61);
            String str2 = (String) this.f41177.get(i);
            c6043Mo16399.m16408(0, str2.length(), str2);
        }
        if (!z) {
            return 0L;
        }
        long size2 = c6043Mo16399.size();
        c6043Mo16399.m16407();
        return size2;
    }
}
