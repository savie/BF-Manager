package l;

import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۛۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C6001 {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (AbstractC23600.a) {
            return fileChannel;
        }
        int i = C11646.e;
        if (fileChannel instanceof C11646) {
            return (C11646) fileChannel;
        }
        return new C11646(fileChannel, false, false, null);
    }

    public static FileChannel open(InterfaceC3800 interfaceC3800, InterfaceC0978... interfaceC0978Arr) {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, interfaceC0978Arr);
        return AbstractC23600.b ? FileChannel.open(C3343.l(interfaceC3800), AbstractC1726.u(hashSet), AbstractC1726.N(new InterfaceC20030[0])) : AbstractC1726.T(interfaceC3800, hashSet);
    }
}
