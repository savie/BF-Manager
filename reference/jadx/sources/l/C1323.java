package l;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܿۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: NIXE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4758;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f4757 = C16980.m40037(C1323.class);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C19858 f4756 = new C19858("");

    public C1323(ArrayList arrayList) {
        new EnumMap(EnumC15823.class);
        this.f4758 = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b3 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:9:0x0015, B:11:0x001d, B:12:0x0028, B:14:0x0030, B:15:0x003a, B:17:0x0042, B:19:0x0049, B:21:0x0053, B:23:0x005c, B:25:0x0064, B:26:0x0067, B:28:0x006f, B:29:0x007a, B:31:0x0080, B:32:0x008a, B:34:0x0091, B:36:0x00a0, B:37:0x00a8, B:39:0x00aa, B:22:0x005a, B:47:0x00b3, B:48:0x00cf, B:50:0x00d1), top: B:53:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1 A[Catch: all -> 0x00ac, TryCatch #2 {all -> 0x00ac, blocks: (B:9:0x0015, B:11:0x001d, B:12:0x0028, B:14:0x0030, B:15:0x003a, B:17:0x0042, B:19:0x0049, B:21:0x0053, B:23:0x005c, B:25:0x0064, B:26:0x0067, B:28:0x006f, B:29:0x007a, B:31:0x0080, B:32:0x008a, B:34:0x0091, B:36:0x00a0, B:37:0x00a8, B:39:0x00aa, B:22:0x005a, B:47:0x00b3, B:48:0x00cf, B:50:0x00d1), top: B:53:0x0015 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00b3, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC23283 m4863(C24927 c24927, boolean z) {
        if (z || c24927.getState() != EnumC7026.PROCESS_COMPLETE) {
            C4123.m13227();
            synchronized (c24927.m55571()) {
                try {
                    try {
                        EnumC1763 enumC1763 = EnumC1763.CLASS_DEEP_RELOAD;
                        if (c24927.mo17865(enumC1763)) {
                            c24927.m39418(enumC1763);
                            c24927.m55547();
                            c24927.mo17866(EnumC1763.CLASS_UNLOADED);
                        }
                        EnumC1763 enumC1764 = EnumC1763.CLASS_UNLOADED;
                        if (c24927.mo17865(enumC1764)) {
                            c24927.mo8527().m5690(c24927);
                            c24927.m39418(enumC1764);
                        }
                        if (c24927.getState() == EnumC7026.GENERATED_AND_UNLOADED) {
                            c24927.m55542(EnumC7026.NOT_LOADED);
                        }
                        if (z) {
                            EnumC10008 enumC10008 = EnumC10008.NONE;
                            EnumC1763 enumC1765 = EnumC1763.RELOAD_AT_CODEGEN_STAGE;
                            if (c24927.mo17865(enumC1765)) {
                                c24927.m39418(enumC1765);
                                c24927.m55549();
                            }
                        } else {
                            EnumC10008 enumC10009 = EnumC10008.NONE;
                        }
                        if (c24927.getState() == EnumC7026.NOT_LOADED) {
                            c24927.m55572();
                        }
                        if (c24927.getState() == EnumC7026.LOADED) {
                            c24927.m55542(EnumC7026.PROCESS_STARTED);
                            Iterator it = this.f4758.iterator();
                            while (it.hasNext()) {
                                C7005.m19327((InterfaceC13673) it.next(), c24927);
                            }
                            c24927.m55542(EnumC7026.PROCESS_COMPLETE);
                        }
                        if (!z) {
                            return null;
                        }
                        C4123.m13227();
                        InterfaceC23283 interfaceC23283M17484 = C6019.m17484(c24927);
                        if (!c24927.mo17865(EnumC1763.DONT_UNLOAD_CLASS)) {
                            c24927.m55549();
                            c24927.m55542(EnumC7026.GENERATED_AND_UNLOADED);
                        }
                        return interfaceC23283M17484;
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    if (!z) {
                        throw e;
                    }
                    C23977.m53506(c24927, "Class process error: " + e.getClass().getSimpleName(), e);
                    return null;
                } catch (StackOverflowError e2) {
                    e = e2;
                    if (!z) {
                        throw e;
                    }
                    C23977.m53506(c24927, "Class process error: " + e.getClass().getSimpleName(), e);
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC23283 m4868(C24927 c24927) {
        C24927 c24927M55556 = c24927.m55556();
        if (c24927M55556 != c24927) {
            return m4868(c24927M55556);
        }
        try {
            if (c24927.mo17865(EnumC1763.DONT_GENERATE)) {
                m4863(c24927, false);
                return f4756;
            }
            Iterator it = c24927.m55567().iterator();
            while (it.hasNext()) {
                m4863((C24927) it.next(), false);
            }
            if (!c24927.m55560().isEmpty()) {
                m4863(c24927, false);
                Iterator it2 = c24927.m55560().iterator();
                while (it2.hasNext()) {
                    m4863((C24927) it2.next(), false);
                }
            }
            InterfaceC23283 interfaceC23283M4863 = m4863(c24927, true);
            if (interfaceC23283M4863 != null) {
                return interfaceC23283M4863;
            }
            throw new C8597("Codegen failed");
        } catch (Exception | StackOverflowError e) {
            throw new C8597("Failed to generate code for class: " + c24927.m55568(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4867(C24927 c24927) {
        C24927 c24927M55556 = c24927.m55556();
        if (c24927M55556 != c24927) {
            m4867(c24927M55556);
            return;
        }
        try {
            m4863(c24927, false);
        } catch (Exception | StackOverflowError e) {
            throw new C8597("Failed to process class: " + c24927.m55568(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4865(C1610 c1610) {
        for (InterfaceC13673 interfaceC13673 : this.f4758) {
            try {
                interfaceC13673.mo8439(c1610);
            } catch (Exception e) {
                f4757.mo13718("Visitor init failed: {}", interfaceC13673.getClass().getSimpleName(), e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4866(C2551 c2551) {
        InterfaceC13673 interfaceC13673 = null;
        InterfaceC13673 interfaceC13674 = null;
        for (InterfaceC13673 interfaceC13675 : this.f4758) {
            if (interfaceC13675.getName().equals("MarkFinallyVisitor")) {
                interfaceC13673 = interfaceC13674;
                break;
            }
            interfaceC13674 = interfaceC13675;
        }
        if (interfaceC13673 == null) {
            return;
        }
        synchronized (c2551.m8516().m55571()) {
            try {
                try {
                    c2551.m8544();
                    c2551.m8531();
                    for (InterfaceC13673 interfaceC13676 : this.f4758) {
                        C7005.m19326(interfaceC13676, c2551);
                        if (interfaceC13676 == interfaceC13673) {
                            return;
                        }
                    }
                } catch (Exception e) {
                    throw new C8597("Failed to process method to visitor: " + interfaceC13673, e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m4864() {
        return this.f4758;
    }
}
