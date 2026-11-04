package l;

import java.io.BufferedInputStream;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۬᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 777R */
/* JADX INFO: loaded from: classes4.dex */
public final class C14069 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f44531;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f44532;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C10186 f44533;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C10186 f44534;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8630 f44535;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f44536;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C2751 f44537;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C20893 f44538;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f44540;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9462 f44541;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11395 f44542;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7667 f44543;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String f44545;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f44546;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7139 f44547;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f44548;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44549;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f44550;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7972 f44554;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f44555;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f44556;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f44553 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f44551 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f44552 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashMap f44539 = new HashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f44544 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C8630 m34230() {
        if (this.f44535 == null) {
            C20893 c20893 = this.f44538;
            AbstractC22044 abstractC22044 = this.f44536;
            c20893.getClass();
            this.f44535 = C8630.m23259(abstractC22044.m49876("cache"), this.f44532);
        }
        return this.f44535;
    }

    public C14069(C20893 c20893, String str, boolean z, AbstractC22044 abstractC22044, String str2, long j, long j2, ArrayList arrayList, ArrayList arrayList2, boolean z2, String str3, String str4, C7139 c7139, C11395 c11395, C9462 c9462, C2751 c2751) {
        this.f44538 = c20893;
        this.f44556 = str;
        this.f44531 = z;
        this.f44536 = abstractC22044;
        this.f44548 = str2;
        this.f44532 = arrayList;
        this.f44549 = arrayList2;
        this.f44540 = z2;
        this.f44550 = str3;
        this.f44545 = str4;
        this.f44547 = c7139;
        this.f44542 = c11395;
        this.f44541 = c9462;
        this.f44537 = c2751;
        this.f44543 = new C7667(abstractC22044.m49876("cache").m49876("smali"));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m34234() {
        this.f44538.getClass();
        return this.f44536.m49876("original.apk");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m34231(String str) {
        this.f44538.getClass();
        return this.f44536.m49876("entries").m49876(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24975 m34232(String str) {
        C24975 c24975;
        synchronized (this.f44544) {
            long jMo4285 = -1;
            try {
                try {
                    Reference reference = (Reference) this.f44544.get(str);
                    if (reference != null && (c24975 = (C24975) reference.get()) != null) {
                        return c24975;
                    }
                    AbstractC22044 abstractC22044M34231 = m34231(str);
                    jMo4285 = abstractC22044M34231.mo4285();
                    C24975 c24975M55779 = C24975.m55779(abstractC22044M34231.m49865());
                    this.f44544.put(str, new SoftReference(c24975M55779));
                    return c24975M55779;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused) {
                throw C18723.m43535(this.f44548, this.f44531);
            } catch (OutOfMemoryError e) {
                if (jMo4285 < 0) {
                    try {
                        jMo4285 = m34231(str).mo4285();
                    } catch (Exception | OutOfMemoryError unused2) {
                    }
                }
                try {
                    Runtime runtime = Runtime.getRuntime();
                    C20653.m47269("MT MCP dex load out of memory: workspaceId=" + this.f44556 + ", dexEntryName=" + str + ", fileLength=" + jMo4285 + ", heapUsed=" + (runtime.totalMemory() - runtime.freeMemory()) + ", heapMax=" + runtime.maxMemory() + ", error=" + e.getMessage());
                    throw e;
                } catch (OutOfMemoryError unused3) {
                    throw e;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m34233(String str) throws C10186 {
        C24975 c24975;
        synchronized (this.f44544) {
            Reference reference = (Reference) this.f44544.get(str);
            if (reference == null || (c24975 = (C24975) reference.get()) == null) {
                try {
                    BufferedInputStream bufferedInputStreamM49875 = m34231(str).m49875();
                    try {
                        C19647 c19647M45293 = C19647.m45293(C25128.m55997(bufferedInputStreamM49875));
                        bufferedInputStreamM49875.close();
                        return c19647M45293.f63286;
                    } catch (Throwable th) {
                        try {
                            bufferedInputStreamM49875.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                    throw C18723.m43535(this.f44548, this.f44531);
                }
            }
            return c24975.mo4326().f63286;
        }
    }
}
