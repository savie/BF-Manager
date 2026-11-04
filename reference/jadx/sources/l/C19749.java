package l;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.ᩴۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19749 implements PrivilegedAction {
    public final /* synthetic */ int a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Object obj;
        switch (this.a) {
            case 0:
                Object obj2 = AbstractC22733.a;
                ArrayList arrayList = new ArrayList();
                for (AbstractC22733 abstractC22733 : ServiceLoader.load(AbstractC22733.class, ClassLoader.getSystemClassLoader())) {
                    String scheme = abstractC22733.getScheme();
                    if (!scheme.equalsIgnoreCase("file")) {
                        int size = arrayList.size();
                        int i = 0;
                        do {
                            if (i >= size) {
                                arrayList.add(abstractC22733);
                            }
                            obj = arrayList.get(i);
                            i++;
                            break;
                        } while (!((AbstractC22733) obj).getScheme().equalsIgnoreCase(scheme));
                    }
                }
                return arrayList;
            case 1:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
            case 2:
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
            default:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    }
}
