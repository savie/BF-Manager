package l;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۫ۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes4.dex */
public final class C12198 implements InterfaceC16431 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f40801;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14315 f40802;

    @Override // l.InterfaceC16431
    public final void close() {
    }

    @Override // l.InterfaceC16431
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo1516() {
        return false;
    }

    public C12198(C14315 c14315, InterfaceC3800 interfaceC3800) {
        this.f40802 = c14315;
        this.f40801 = interfaceC3800;
    }

    @Override // l.InterfaceC16431
    /* JADX INFO: renamed from: ۙ */
    public final void mo1515(InterfaceC3800 interfaceC3800, C11284 c11284, Set set, boolean z, C19003 c19003) throws IOException {
        InterfaceC3800 interfaceC3801 = this.f40801;
        try {
            InterfaceC3800 interfaceC3800M35483 = c11284.m35483(interfaceC3800);
            if (C5212.exists(interfaceC3800M35483, new EnumC22146[0])) {
                C14315 c14315 = this.f40802;
                if (C14315.m34540(c14315, interfaceC3800M35483, c11284)) {
                    InterfaceC5046 list = C5212.list(interfaceC3800M35483);
                    try {
                        EnumC23487 enumC23487 = c14315.f46897;
                        List<InterfaceC3800> list2 = (enumC23487 == null ? list : list.sorted(enumC23487)).toList();
                        if (list != null) {
                            list.close();
                        }
                        for (InterfaceC3800 interfaceC3802 : list2) {
                            String string = interfaceC3802.getFileName().toString();
                            if (string.endsWith("/")) {
                                string = C20630.m46498(1, 0, string);
                            }
                            if (C5212.isDirectory(interfaceC3802, new EnumC22146[0])) {
                                if (z && EnumC12508.m31065(string)) {
                                    mo1515(interfaceC3800, new C11284(C22697.m50267(new StringBuilder(), c11284.f48427, string)), set, z, c19003);
                                }
                            } else if (set.contains(AbstractC3729.m10910(string))) {
                                try {
                                    C23984 c23984 = new C23984(c11284, string);
                                    InterfaceC3800 interfaceC3800M35484 = c23984.m35483(interfaceC3801);
                                    int i = AbstractC6344.f21400;
                                    c19003.m43723(new C16928(c14315, interfaceC3800M35484, interfaceC3800, c23984, 0));
                                } catch (InvalidPathException e) {
                                    throw new IOException("error accessing directory " + interfaceC3801 + e);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        if (list == null) {
                            throw th;
                        }
                        try {
                            list.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            }
        } catch (IOException | InvalidPathException unused) {
        }
    }

    @Override // l.InterfaceC16431
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2173 mo1514(InterfaceC3800 interfaceC3800, C23984 c23984) {
        try {
            InterfaceC3800 interfaceC3800M35483 = c23984.m35483(interfaceC3800);
            if (!C5212.exists(interfaceC3800M35483, new EnumC22146[0])) {
                return null;
            }
            C14315 c14315 = this.f40802;
            InterfaceC3800 interfaceC3800Mo36011 = c14315.f46896.mo36011(interfaceC3800M35483);
            int i = AbstractC6344.f21400;
            return new C17633(c14315, interfaceC3800Mo36011, interfaceC3800M35483, 0);
        } catch (InvalidPathException unused) {
            return null;
        }
    }

    @Override // l.InterfaceC16431
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo1513() {
        return C21825.m48588();
    }
}
