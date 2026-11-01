package l;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6996 implements PrivilegedAction {
    public final /* synthetic */ int a = 0;
    public Object b;

    public /* synthetic */ C6996() {
    }

    public C6996(List list) {
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
                        C18201 c18201 = (C18201) C18201.class.cast(Class.forName(property2, true, C18201.class.getClassLoader()).newInstance());
                        C18201.b(c18201);
                        ((ArrayList) ((List) this.b)).add(c18201);
                        return null;
                    } catch (Exception e) {
                        throw new Error(e);
                    }
                }
                C18201.b(new C18201());
                return null;
        }
    }
}
