package l;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes.dex */
public final class C22909 implements InterfaceC10974 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f74447;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2026 f74448;

    @Override // l.InterfaceC10974
    public final void close() {
    }

    @Override // l.InterfaceC10974
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo9822() {
        return false;
    }

    public C22909(C2026 c2026, InterfaceC24329 interfaceC24329) {
        this.f74448 = c2026;
        this.f74447 = interfaceC24329;
    }

    @Override // l.InterfaceC10974
    /* JADX INFO: renamed from: ۙ */
    public final void mo9821(InterfaceC24329 interfaceC24329, C5777 c5777, Set set, boolean z, C18499 c18499) throws IOException {
        InterfaceC24329 interfaceC243210 = this.f74447;
        try {
            InterfaceC24329 interfaceC24329M29493 = c5777.m29493(interfaceC24329);
            if (C3445.exists(interfaceC24329M29493, new EnumC20599[0])) {
                C2026 c2026 = this.f74448;
                if (C2026.m6969(c2026, interfaceC24329M29493, c5777)) {
                    InterfaceC20670 list = C3445.list(interfaceC24329M29493);
                    try {
                        EnumC5755 enumC5755 = c2026.f6747;
                        List<InterfaceC24329> list2 = (enumC5755 == null ? list : list.sorted(enumC5755)).toList();
                        if (list != null) {
                            list.close();
                        }
                        for (InterfaceC24329 interfaceC243211 : list2) {
                            String string = interfaceC243211.getFileName().toString();
                            if (string.endsWith("/")) {
                                string = C1402.m5124(1, 0, string);
                            }
                            if (C3445.isDirectory(interfaceC243211, new EnumC20599[0])) {
                                if (z && EnumC21704.m49266(string)) {
                                    mo9821(interfaceC24329, new C5777(C8947.m23910(new StringBuilder(), c5777.f37972, string)), set, z, c18499);
                                }
                            } else if (set.contains(AbstractC24643.m54974(string))) {
                                try {
                                    C2048 c2048 = new C2048(c5777, string);
                                    InterfaceC24329 interfaceC24329M29494 = c2048.m29493(interfaceC243210);
                                    int i = AbstractC13234.f42297;
                                    c18499.m43089(new C22931(c2026, interfaceC24329M29494, interfaceC24329, c2048, 0));
                                } catch (InvalidPathException e) {
                                    throw new IOException("error accessing directory " + interfaceC243210 + e);
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

    @Override // l.InterfaceC10974
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15976 mo9820(InterfaceC24329 interfaceC24329, C2048 c2048) {
        try {
            InterfaceC24329 interfaceC24329M29493 = c2048.m29493(interfaceC24329);
            if (!C3445.exists(interfaceC24329M29493, new EnumC20599[0])) {
                return null;
            }
            C2026 c2026 = this.f74448;
            InterfaceC24329 interfaceC24329Mo3175 = c2026.f6749.mo3175(interfaceC24329M29493);
            int i = AbstractC13234.f42297;
            return new C15471(c2026, interfaceC24329Mo3175, interfaceC24329M29493, 0);
        } catch (InvalidPathException unused) {
            return null;
        }
    }

    @Override // l.InterfaceC10974
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo9819() {
        return C14769.m35543();
    }
}
