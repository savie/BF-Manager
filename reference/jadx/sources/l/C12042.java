package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C12042 implements InterfaceC18723 {
    @Override // l.InterfaceC18723
    /* JADX INFO: renamed from: ۙ */
    public final EnumC13785 mo2111() {
        return EnumC13785.FileStreamInformation;
    }

    @Override // l.InterfaceC18723
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC19429 mo2112(C10922 c10922) throws C17271 {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        long jM27394 = 0;
        do {
            j += jM27394;
            c10922.m27376((int) j);
            jM27394 = c10922.m27394();
            long jM27395 = c10922.m27394();
            c10922.m27401();
            c10922.m27401();
            c10922.m27379(((int) jM27395) / 2, C7393.f24570);
            arrayList.add(new C12076());
        } while (jM27394 != 0);
        return new C17874();
    }
}
