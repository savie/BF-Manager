package l;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩷ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes.dex */
public final class C22163 implements InterfaceC10974 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f71379;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f71380;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC25075 f71381;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2026 f71382;

    @Override // l.InterfaceC10974
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo9822() {
        return true;
    }

    public C22163(C2026 c2026, InterfaceC24329 interfaceC24329) throws IOException {
        this.f71382 = c2026;
        this.f71379 = interfaceC24329;
        if (c2026.f79779 != null && interfaceC24329.toString().endsWith(".jar")) {
            Map mapSingletonMap = Collections.singletonMap("multi-release", c2026.f79779);
            C10009 c10009M3172 = c2026.f6749.m3172();
            if (c10009M3172 == null) {
                C11972.m30024("should have been caught before!");
                throw null;
            }
            try {
                this.f71381 = c10009M3172.newFileSystem(interfaceC24329, mapSingletonMap);
            } catch (ZipException e) {
                throw new IOException("ZipException opening \"" + interfaceC24329.getFileName() + "\": " + e.getMessage(), e);
            }
        } else {
            this.f71381 = c2026.f6749.m3172().newFileSystem(interfaceC24329, (Map) null);
        }
        this.f71380 = new HashMap();
        for (InterfaceC24329 interfaceC243210 : this.f71381.getRootDirectories()) {
            C3445.walkFileTree(interfaceC243210, C2026.f6741, Integer.MAX_VALUE, new C14199(this, interfaceC243210));
        }
    }

    @Override // l.InterfaceC10974
    /* JADX INFO: renamed from: ۙ */
    public final void mo9821(InterfaceC24329 interfaceC24329, C5777 c5777, Set set, boolean z, C18499 c18499) {
        InterfaceC24329 interfaceC243210 = (InterfaceC24329) this.f71380.get(c5777);
        if (interfaceC243210 == null) {
            return;
        }
        C3445.walkFileTree(interfaceC243210, C2026.f6740, z ? Integer.MAX_VALUE : 1, new C5009(this, set, c18499));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50125(C22163 c22163, InterfaceC24329 interfaceC24329) {
        if (interfaceC24329 == null) {
            return true;
        }
        String string = interfaceC24329.toString();
        if (string.endsWith("/")) {
            string = C1402.m5124(1, 0, string);
        }
        return EnumC21704.m49266(string);
    }

    @Override // l.InterfaceC10974
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15976 mo9820(InterfaceC24329 interfaceC24329, C2048 c2048) {
        InterfaceC24329 interfaceC243210 = (InterfaceC24329) this.f71380.get(c2048.m7059());
        if (interfaceC243210 == null) {
            return null;
        }
        String str = c2048.f37972;
        InterfaceC24329 interfaceC24329Resolve = interfaceC243210.resolve(str.substring(str.lastIndexOf(47) + 1));
        if (!C3445.exists(interfaceC24329Resolve, new EnumC20599[0])) {
            return null;
        }
        int i = AbstractC13234.f42297;
        return new C19947(this.f71382, interfaceC24329Resolve, interfaceC24329, 0);
    }

    @Override // l.InterfaceC10974
    public final void close() {
        this.f71381.close();
    }

    @Override // l.InterfaceC10974
    /* JADX INFO: renamed from: ۙ */
    public final Iterable mo9819() {
        return this.f71380.keySet();
    }
}
