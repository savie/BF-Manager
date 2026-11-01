package l;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.ۛܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6166 implements PrivilegedAction {
    public final /* synthetic */ int a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Object obj;
        switch (this.a) {
            case 0:
                Object obj2 = AbstractC17455.a;
                ArrayList arrayList = new ArrayList();
                for (AbstractC17455 abstractC17455 : ServiceLoader.load(AbstractC17455.class, ClassLoader.getSystemClassLoader())) {
                    String scheme = abstractC17455.getScheme();
                    if (!scheme.equalsIgnoreCase("file")) {
                        int size = arrayList.size();
                        int i = 0;
                        do {
                            if (i >= size) {
                                arrayList.add(abstractC17455);
                            }
                            obj = arrayList.get(i);
                            i++;
                            break;
                        } while (!((AbstractC17455) obj).getScheme().equalsIgnoreCase(scheme));
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
