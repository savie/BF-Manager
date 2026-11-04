package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۫ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C30H */
/* JADX INFO: loaded from: classes4.dex */
public final class C13174 extends AbstractC10190 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C16157 f42102 = C16157.m38331("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f42103;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f42104;

    public C13174(ArrayList arrayList, ArrayList arrayList2) {
        this.f42103 = C19822.m45597((List) arrayList);
        this.f42104 = C19822.m45597((List) arrayList2);
    }

    @Override // l.AbstractC10190
    /* JADX INFO: renamed from: ᩷ */
    public final C16157 mo26312() {
        return f42102;
    }

    @Override // l.AbstractC10190
    /* JADX INFO: renamed from: ۙ */
    public final long mo26310() {
        return m32691((InterfaceC11573) null, true);
    }

    @Override // l.AbstractC10190
    /* JADX INFO: renamed from: ۙ */
    public final void mo26311(InterfaceC11573 interfaceC11573) {
        m32691(interfaceC11573, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m32691(InterfaceC11573 interfaceC11573, boolean z) {
        C1879 c1879Mo29106;
        if (z) {
            c1879Mo29106 = new C1879();
        } else {
            c1879Mo29106 = interfaceC11573.mo29106();
        }
        List list = this.f42103;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c1879Mo29106.m6455writeByte(38);
            }
            String str = (String) list.get(i);
            c1879Mo29106.getClass();
            c1879Mo29106.m6437(0, str.length(), str);
            c1879Mo29106.m6455writeByte(61);
            String str2 = (String) this.f42104.get(i);
            c1879Mo29106.m6437(0, str2.length(), str2);
        }
        if (!z) {
            return 0L;
        }
        long size2 = c1879Mo29106.size();
        c1879Mo29106.m6436();
        return size2;
    }
}
