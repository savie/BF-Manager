package l;

import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩴ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C19853 {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (AbstractC12944.a) {
            return fileChannel;
        }
        int i = C15927.e;
        if (fileChannel instanceof C15927) {
            return (C15927) fileChannel;
        }
        return new C15927(fileChannel, false, false, null);
    }

    public static FileChannel open(InterfaceC24329 interfaceC24329, InterfaceC12394... interfaceC12394Arr) {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, interfaceC12394Arr);
        return AbstractC12944.b ? FileChannel.open(C24971.i(interfaceC24329), AbstractC1758.u(hashSet), AbstractC1758.N(new InterfaceC13885[0])) : AbstractC1758.T(interfaceC24329, hashSet);
    }
}
