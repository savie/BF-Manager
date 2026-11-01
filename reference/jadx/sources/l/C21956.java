package l;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹֨۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 777R */
/* JADX INFO: loaded from: classes4.dex */
public final class C21956 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f71219;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C3287 f71220;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f71222;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20222 f71223;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f71224;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f71225;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f71226;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C12731 f71227;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C18469 f71228;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7886 f71229;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7221 f71231;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f71232;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f71234;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18438 f71235;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f71236;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f71237;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C22703 f71238;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f71239;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C12731 f71241;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0465 f71242;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f71244;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f71221 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f71240 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f71233 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f71230 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f71243 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C20222 m48784() {
        if (this.f71223 == null) {
            C7221 c7221 = this.f71231;
            AbstractC20745 abstractC20745 = this.f71232;
            c7221.getClass();
            this.f71223 = C20222.m45718(abstractC20745.m46690("cache"), this.f71222);
        }
        return this.f71223;
    }

    public C21956(C7221 c7221, String str, boolean z, AbstractC20745 abstractC20745, String str2, long j, long j2, ArrayList arrayList, ArrayList arrayList2, boolean z2, String str3, String str4, C0465 c0465, C3287 c3287, C18469 c18469, C7886 c7886) {
        this.f71231 = c7221;
        this.f71244 = str;
        this.f71236 = z;
        this.f71232 = abstractC20745;
        this.f71219 = str2;
        this.f71222 = arrayList;
        this.f71224 = arrayList2;
        this.f71225 = z2;
        this.f71239 = str3;
        this.f71237 = str4;
        this.f71242 = c0465;
        this.f71220 = c3287;
        this.f71228 = c18469;
        this.f71229 = c7886;
        this.f71235 = new C18438(abstractC20745.m46690("cache").m46690("smali"));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m48787() {
        this.f71231.getClass();
        return this.f71232.m46690("original.apk");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m48785(String str) {
        this.f71231.getClass();
        return this.f71232.m46690("entries").m46690(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17684 m48786(String str) {
        C17684 c17684;
        synchronized (this.f71243) {
            long jMo33964 = -1;
            try {
                try {
                    Reference reference = (Reference) this.f71243.get(str);
                    if (reference != null && (c17684 = (C17684) reference.get()) != null) {
                        return c17684;
                    }
                    AbstractC20745 abstractC20745M48785 = m48785(str);
                    jMo33964 = abstractC20745M48785.mo33964();
                    C17684 c17684M41161 = C17684.m41161(abstractC20745M48785.m46727());
                    this.f71243.put(str, new SoftReference(c17684M41161));
                    return c17684M41161;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused) {
                throw C2664.m8200(this.f71219, this.f71236);
            } catch (OutOfMemoryError e) {
                if (jMo33964 < 0) {
                    try {
                        jMo33964 = m48785(str).mo33964();
                    } catch (Exception | OutOfMemoryError unused2) {
                    }
                }
                try {
                    Runtime runtime = Runtime.getRuntime();
                    C0577.m2744("MT MCP dex load out of memory: workspaceId=" + this.f71244 + ", dexEntryName=" + str + ", fileLength=" + jMo33964 + ", heapUsed=" + (runtime.totalMemory() - runtime.freeMemory()) + ", heapMax=" + runtime.maxMemory() + ", error=" + e.getMessage());
                    throw e;
                } catch (OutOfMemoryError unused3) {
                    throw e;
                }
            }
        }
    }
}
