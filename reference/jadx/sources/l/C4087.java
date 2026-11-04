package l;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4087 implements PrivilegedAction {
    public final /* synthetic */ int a = 0;
    public Object b;

    public /* synthetic */ C4087() {
    }

    public C4087(List list) {
        this.b = list;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                String property = System.getProperty((String) this.b);
                if (property == null) {
                    return null;
                }
                return property;
            default:
                String property2 = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
                if (property2 != null) {
                    try {
                        C0424 c0424 = (C0424) C0424.class.cast(Class.forName(property2, true, C0424.class.getClassLoader()).newInstance());
                        C0424.b(c0424);
                        ((ArrayList) ((List) this.b)).add(c0424);
                        return null;
                    } catch (Exception e) {
                        throw new Error(e);
                    }
                }
                C0424.b(new C0424());
                return null;
        }
    }
}
