package l;

/* JADX INFO: renamed from: l.᩵᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 16MO */
/* JADX INFO: loaded from: classes5.dex */
public final class C19677 implements InterfaceC13058 {
    @Override // l.InterfaceC13058
    /* JADX INFO: renamed from: ۙ */
    public final C0625 mo32260(InterfaceC1062 interfaceC1062, C6707 c6707, C16524 c16524) {
        if (interfaceC1062.mo4011() != null) {
            return m44807(interfaceC1062, c6707, interfaceC1062.mo4011(), interfaceC1062.mo4013());
        }
        String strMo4012 = interfaceC1062.mo4012();
        if (strMo4012 == null || strMo4012.isEmpty()) {
            strMo4012 = interfaceC1062.mo4009();
        }
        C17955 c17955 = (C17955) c16524.m38895(strMo4012);
        if (c17955 != null) {
            return m44807(interfaceC1062, c6707, c17955.m41781(), c17955.m41783());
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0625 m44807(InterfaceC1062 interfaceC1062, C6707 c6707, String str, String str2) {
        if (interfaceC1062.mo4010() != null && interfaceC1062.mo4010().m40214().equals("!")) {
            C0625 c0625 = new C0625(EnumC20382.WRAP, new C22895(str, str2), c6707.m18139());
            c0625.m2892();
            return c0625;
        }
        return new C0625(EnumC20382.WRAP, new C21483(str, str2), c6707.m18139());
    }
}
