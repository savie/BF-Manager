package l;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.֡ۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes2.dex */
public final class C0202 implements InterfaceC16431 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14315 f1358;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f1359;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f1360;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC3178 f1361;

    @Override // l.InterfaceC16431
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo1516() {
        return true;
    }

    public C0202(C14315 c14315, InterfaceC3800 interfaceC3800) throws IOException {
        this.f1358 = c14315;
        this.f1359 = interfaceC3800;
        if (c14315.f13544 != null && interfaceC3800.toString().endsWith(".jar")) {
            Map mapSingletonMap = Collections.singletonMap("multi-release", c14315.f13544);
            C9936 c9936M47900 = c14315.f46896.m47900();
            if (c9936M47900 == null) {
                C6171.m17174("should have been caught before!");
                throw null;
            }
            try {
                this.f1361 = c9936M47900.newFileSystem(interfaceC3800, mapSingletonMap);
            } catch (ZipException e) {
                throw new IOException("ZipException opening \"" + interfaceC3800.getFileName() + "\": " + e.getMessage(), e);
            }
        } else {
            this.f1361 = c14315.f46896.m47900().newFileSystem(interfaceC3800, (Map) null);
        }
        this.f1360 = new HashMap();
        for (InterfaceC3800 interfaceC3801 : this.f1361.getRootDirectories()) {
            C5212.walkFileTree(interfaceC3801, C14315.f46888, Integer.MAX_VALUE, new C15726(this, interfaceC3801));
        }
    }

    @Override // l.InterfaceC16431
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1515(InterfaceC3800 interfaceC3800, C11284 c11284, Set set, boolean z, C19003 c19003) {
        InterfaceC3800 interfaceC3801 = (InterfaceC3800) this.f1360.get(c11284);
        if (interfaceC3801 == null) {
            return;
        }
        C5212.walkFileTree(interfaceC3801, C14315.f46889, z ? Integer.MAX_VALUE : 1, new C19959(this, set, c19003));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1511(C0202 c0202, InterfaceC3800 interfaceC3800) {
        if (interfaceC3800 == null) {
            return true;
        }
        String string = interfaceC3800.toString();
        if (string.endsWith("/")) {
            string = C20630.m46498(1, 0, string);
        }
        return EnumC12508.m31065(string);
    }

    @Override // l.InterfaceC16431
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2173 mo1514(InterfaceC3800 interfaceC3800, C23984 c23984) {
        InterfaceC3800 interfaceC3801 = (InterfaceC3800) this.f1360.get(c23984.m52821());
        if (interfaceC3801 == null) {
            return null;
        }
        String str = c23984.f48427;
        InterfaceC3800 interfaceC3800Resolve = interfaceC3801.resolve(str.substring(str.lastIndexOf(47) + 1));
        if (!C5212.exists(interfaceC3800Resolve, new EnumC22146[0])) {
            return null;
        }
        int i = AbstractC6344.f21400;
        return new C12695(this.f1358, interfaceC3800Resolve, interfaceC3800, 0);
    }

    @Override // l.InterfaceC16431
    public final void close() {
        this.f1361.close();
    }

    @Override // l.InterfaceC16431
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterable mo1513() {
        return this.f1360.keySet();
    }
}
