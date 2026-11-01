package l;

import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: renamed from: l.ۚܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C5430 extends EnumC19730 {
    public /* synthetic */ C5430(EnumC19024 enumC19024, EnumC18318 enumC18318) {
        this("RELEASE", 38, "--release", "opt.arg.release", "opt.release", enumC19024, enumC18318);
    }

    public C5430(String str, int i, String str2, String str3, String str4, EnumC19024 enumC19024, EnumC18318 enumC18318) {
        super(str, i, str2, str3, str4, enumC19024, enumC18318, 0);
    }

    @Override // l.EnumC19730
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo15008(C20414 c20414) {
        Set<String> set = (Set) C21980.stream(C0356.spliterator(ServiceLoader.load(InterfaceC1984.class, C15539.class.getClassLoader())), false).flatMap(new C2607()).collect(C1890.toCollection(new C14292()));
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (String str2 : set) {
            sb.append(str);
            sb.append(str2);
            str = ", ";
        }
        super.m44883(c20414, c20414.m46171(EnumC21119.JAVAC, this.f63409, sb.toString()));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC5046 m15007(InterfaceC1984 interfaceC1984) {
        return C21980.stream(C0356.spliterator(interfaceC1984.m6396()), false);
    }
}
