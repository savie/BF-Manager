package l;

/* JADX INFO: renamed from: l.ۙܿۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5059 implements InterfaceC18704 {
    @Override // l.InterfaceC18704
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5805 mo15305(InterfaceC7517 interfaceC7517, C0805 c0805, C11858 c11858) {
        if (interfaceC7517.mo20574() != null) {
            return m15304(interfaceC7517, c0805, interfaceC7517.mo20574(), interfaceC7517.mo20575());
        }
        String strMo20573 = interfaceC7517.mo20573();
        if (strMo20573 == null || strMo20573.isEmpty()) {
            strMo20573 = interfaceC7517.mo20576();
        }
        C8787 c8787 = (C8787) c11858.m29711(strMo20573);
        if (c8787 != null) {
            return m15304(interfaceC7517, c0805, c8787.m23583(), c8787.m23585());
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5805 m15304(InterfaceC7517 interfaceC7517, C0805 c0805, String str, String str2) {
        if (interfaceC7517.mo20572() != null && interfaceC7517.mo20572().m55016().equals("!")) {
            C5805 c5805 = new C5805(EnumC13262.WRAP, new C1330(str, str2), c0805.m3237());
            c5805.m16935();
            return c5805;
        }
        return new C5805(EnumC13262.WRAP, new C2821(str, str2), c0805.m3237());
    }
}
