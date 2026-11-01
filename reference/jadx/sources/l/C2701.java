package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R9OM */
/* JADX INFO: loaded from: classes2.dex */
public class C2701 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static volatile C2701 f10401;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C2701 f10402 = new C2701(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f10403;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2701 m8236() {
        C2701 c2701;
        C2701 c2702 = f10401;
        if (c2702 != null) {
            return c2702;
        }
        synchronized (C2701.class) {
            c2701 = f10401;
            if (c2701 == null) {
                Class cls = C13992.f45995;
                C2701 c2703 = null;
                if (cls != null) {
                    try {
                        c2703 = (C2701) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                c2701 = c2703 != null ? c2703 : f10402;
                f10401 = c2701;
            }
        }
        return c2701;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10485 m8237(int i, InterfaceC23206 interfaceC23206) {
        return (C10485) this.f10403.get(new C11875(i, interfaceC23206));
    }

    public C2701() {
        this.f10403 = new HashMap();
    }

    public C2701(C2701 c2701) {
        if (c2701 == f10402) {
            this.f10403 = Collections.EMPTY_MAP;
        } else {
            this.f10403 = C0561.unmodifiableMap(c2701.f10403);
        }
    }

    public C2701(int i) {
        this.f10403 = Collections.EMPTY_MAP;
    }
}
