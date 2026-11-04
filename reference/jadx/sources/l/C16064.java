package l;

import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C16064 extends EnumC7687 {
    public /* synthetic */ C16064(EnumC18128 enumC18128, EnumC21112 enumC21112) {
        this("RELEASE", 38, "--release", "opt.arg.release", "opt.release", enumC18128, enumC21112);
    }

    public C16064(String str, int i, String str2, String str3, String str4, EnumC18128 enumC18128, EnumC21112 enumC21112) {
        super(str, i, str2, str3, str4, enumC18128, enumC21112, 0);
    }

    @Override // l.EnumC7687
    /* JADX INFO: renamed from: ۙ */
    public void mo20952(C7312 c7312) {
        Set<String> set = (Set) C12465.stream(C4937.spliterator(ServiceLoader.load(InterfaceC12841.class, C21527.class.getClassLoader())), false).flatMap(new C16810()).collect(C2025.toCollection(new C17556()));
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (String str2 : set) {
            sb.append(str);
            sb.append(str2);
            str = ", ";
        }
        super.m20953(c7312, c7312.m20032(EnumC2837.JAVAC, this.f25367, sb.toString()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC20670 m38221(InterfaceC12841 interfaceC12841) {
        return C12465.stream(C4937.spliterator(interfaceC12841.m31887()), false);
    }
}
