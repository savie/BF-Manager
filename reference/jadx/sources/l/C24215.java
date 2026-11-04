package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9OM */
/* JADX INFO: loaded from: classes.dex */
public class C24215 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static volatile C24215 f78464;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C24215 f78465 = new C24215(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f78466;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24215 m54206() {
        C24215 c24215;
        C24215 c24216 = f78464;
        if (c24216 != null) {
            return c24216;
        }
        synchronized (C24215.class) {
            c24215 = f78464;
            if (c24215 == null) {
                Class cls = C12280.f39479;
                C24215 c24217 = null;
                if (cls != null) {
                    try {
                        c24217 = (C24215) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                c24215 = c24217 != null ? c24217 : f78465;
                f78464 = c24215;
            }
        }
        return c24215;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4801 m54207(int i, InterfaceC18775 interfaceC18775) {
        return (C4801) this.f78466.get(new C6315(i, interfaceC18775));
    }

    public C24215() {
        this.f78466 = new HashMap();
    }

    public C24215(C24215 c24215) {
        if (c24215 == f78465) {
            this.f78466 = Collections.EMPTY_MAP;
        } else {
            this.f78466 = C4681.unmodifiableMap(c24215.f78466);
        }
    }

    public C24215(int i) {
        this.f78466 = Collections.EMPTY_MAP;
    }
}
