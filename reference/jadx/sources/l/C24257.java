package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes.dex */
public final class C24257 implements InterfaceC8310 {
    @Override // l.InterfaceC8310
    /* JADX INFO: renamed from: ۙ */
    public final EnumC6073 mo6458() {
        return EnumC6073.FileStreamInformation;
    }

    @Override // l.InterfaceC8310
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13530 mo6459(C25134 c25134) throws C2013 {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        long jM56012 = 0;
        do {
            j += jM56012;
            c25134.m56027((int) j);
            jM56012 = c25134.m56012();
            long jM56013 = c25134.m56012();
            c25134.m56018();
            c25134.m56018();
            c25134.m56003(((int) jM56013) / 2, C22150.f71350);
            arrayList.add(new C7569());
        } while (jM56012 != 0);
        return new C6790();
    }
}
