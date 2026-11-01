package l;

import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩸ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 623X */
/* JADX INFO: loaded from: classes4.dex */
public class C21294 implements AutoCloseable {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18472 f69289;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18472 f69290;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18472 f69291;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18472 f69292;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f69293;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f69294;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f69295;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C11748 f69296;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f69297;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f69298;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C20858 f69299;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7889 f69300;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC20508 f69301;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f69302;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f69303;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f69304 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f69305;

    static {
        new C6396(new byte[]{-1, -1, -1, -1, -1, -1, -1, -1}, new byte[]{-1, -1, -1, -1, -1, -1, -1, -1});
        f69289 = new C3654();
        f69291 = new C6477();
        f69292 = new C22706();
        f69290 = new C14945();
        new C22975();
    }

    public C21294(C11748 c11748, C7889 c7889) {
        this.f69296 = c11748;
        this.f69300 = c7889;
        C20858 c20858M20817 = c7889.m20817();
        this.f69299 = c20858M20817;
        C3985 c3985M20820 = c7889.m20820();
        this.f69301 = c3985M20820.m11484();
        C16418 c16418M20821 = c7889.m20821();
        this.f69293 = Math.min(c16418M20821.m38662(), c3985M20820.m11486());
        this.f69302 = c16418M20821.m38675();
        this.f69297 = Math.min(c16418M20821.m38672(), c3985M20820.m11483());
        this.f69295 = c16418M20821.m38664();
        this.f69298 = Math.min(c16418M20821.m38670(), c3985M20820.m11485());
        this.f69305 = c16418M20821.m38674();
        this.f69303 = c20858M20817.m46886();
        this.f69294 = c7889.m20822();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f69304.getAndSet(true)) {
            return;
        }
        this.f69300.m20818();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C13557 m47743(C11771 c11771) {
        if (!this.f69304.get()) {
            try {
                return this.f69299.m46889(c11771, false);
            } catch (C21317 e) {
                throw new C13865(e);
            }
        }
        throw new C13865(getClass().getSimpleName().concat(" has already been closed"));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11748 m47755() {
        return this.f69296;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C7889 m47744() {
        return this.f69300;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m47751() {
        return this.f69293;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m47745() {
        return this.f69302;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m47752() {
        return this.f69297;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m47754() {
        return this.f69295;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0481 m47746(C11748 c11748, Set set, Set set2, Set set3, EnumC7808 enumC7808, Set set4) {
        C20238 c20238 = new C20238(this.f69301, this.f69303, this.f69294, null, set, set2, set3, enumC7808, set4, c11748);
        return (C0481) m47742(m47743(c20238), "Create", c11748, mo24430(), this.f69305);
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC18472 mo24430() {
        return f69289;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo6887(C6396 c6396) throws Throwable {
        C16005 c16005 = new C16005(this.f69301, this.f69303, this.f69294, c6396);
        m47742(m47743(c16005), "Close", c6396, f69290, this.f69305);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47750(C6396 c6396, EnumC12810 enumC12810, EnumC13785 enumC13785, byte[] bArr) {
        C3636 c3636 = new C3636(this.f69301, this.f69303, this.f69294, enumC12810, c6396, enumC13785, bArr);
        m47742(m47743(c3636), "SetInfo", c6396, InterfaceC18472.f58870, this.f69305);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4342 m47748(C6396 c6396, EnumSet enumSet, EnumC13785 enumC13785) {
        C3303 c3303 = new C3303(this.f69301, this.f69303, this.f69294, c6396, enumC13785, enumSet, this.f69298);
        return (C4342) m47742(m47743(c3303), "Query directory", c6396, f69291, this.f69305);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13557 m47749(C6396 c6396, C3923 c3923) {
        return m47743(new C17748(this.f69301, c6396, this.f69303, this.f69294, c3923, this.f69297));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2225 m47747(C6396 c6396, long j, int i) {
        return (C2225) m47742(m47753(c6396, j, i), "Read", c6396, f69292, this.f69302);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13557 m47753(C6396 c6396, long j, int i) {
        return m47743(new C11399(this.f69301, c6396, this.f69303, this.f69294, j, Math.min(i, this.f69293)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11771 m47742(C13557 c13557, String str, Object obj, InterfaceC18472 interfaceC18472, long j) throws Throwable {
        C11771 c11771;
        try {
            if (j > 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                InterfaceC11440 interfaceC11440 = C21317.f69360;
                c11771 = (C11771) C2266.m6947(j, c13557);
            } else {
                InterfaceC11440 interfaceC11441 = C21317.f69360;
                try {
                    try {
                        c11771 = (C11771) c13557.get();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw interfaceC11441.mo12998(e);
                    }
                } catch (ExecutionException e2) {
                    throw interfaceC11441.mo12998(e2);
                }
            }
            if (interfaceC18472.mo10768(((C1186) c11771.mo25478()).m4349())) {
                return c11771;
            }
            throw new C10360((C1186) c11771.mo25478(), str + " failed for " + obj);
        } catch (C21317 e3) {
            throw new C13865(e3);
        }
    }

    public final int hashCode() {
        C11748 c11748 = this.f69296;
        return (c11748 == null ? 0 : c11748.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11748 c11748 = ((C21294) obj).f69296;
        C11748 c11749 = this.f69296;
        if (c11749 == null) {
            if (c11748 != null) {
                return false;
            }
        } else if (!c11749.equals(c11748)) {
            return false;
        }
        return true;
    }
}
