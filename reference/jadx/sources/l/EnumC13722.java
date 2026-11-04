package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v0 l.۬۠ۨ, still in use, count: 1, list:
  (r6v0 l.۬۠ۨ) from 0x0092: FILLED_NEW_ARRAY (r6v0 l.۬۠ۨ), (r0v1 l.۬۠ۨ), (r1v1 l.۬۠ۨ), (r2v1 l.۬۠ۨ), (r3v1 l.۬۠ۨ), (r4v1 l.۬۠ۨ), (r5v1 l.۬۠ۨ) A[WRAPPED] elemType: l.۬۠ۨ
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.۬۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9TP */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC13722 {
    WHITELIST(0, "whitelist", false),
    GREYLIST(1, "greylist", false),
    BLACKLIST(2, "blacklist", false),
    GREYLIST_MAX_O(3, "greylist-max-o", false),
    GREYLIST_MAX_P(4, "greylist-max-p", false),
    GREYLIST_MAX_Q(5, "greylist-max-q", false),
    GREYLIST_MAX_R(6, "greylist-max-r", false),
    CORE_PLATFORM_API(8, "core-platform-api", true),
    TEST_API(16, "test-api", true);


    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int f43556 = 7;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f43566;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f43567;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f43568;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final Map f43565 = new HashMap();

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13722[] f43561 = {new EnumC13722(0, "whitelist", false), new EnumC13722(1, "greylist", false), new EnumC13722(2, "blacklist", false), new EnumC13722(3, "greylist-max-o", false), new EnumC13722(4, "greylist-max-p", false), new EnumC13722(5, "greylist-max-q", false), new EnumC13722(6, "greylist-max-r", false)};

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13722[] f43564 = {new EnumC13722(8, "core-platform-api", true), new EnumC13722(16, "test-api", true)};

    public static EnumC13722 valueOf(String str) {
        return (EnumC13722) Enum.valueOf(EnumC13722.class, str);
    }

    public static EnumC13722[] values() {
        return (EnumC13722[]) f43552.clone();
    }

    static {
        for (EnumC13722 enumC13722 : values()) {
            f43565.put(enumC13722.toString(), enumC13722);
        }
    }

    public EnumC13722(int i, String str, boolean z) {
        super(str, i);
        this.f43567 = i;
        this.f43568 = str;
        this.f43566 = z;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43568;
    }

    public int getValue() {
        return this.f43567;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m33531(int i) {
        if (this.f43566) {
            return (i & this.f43567) != 0;
        }
        return (i & 7) == this.f43567;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m33530() {
        return this.f43566;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Set m33528(int i) {
        EnumC13722 enumC13722 = f43561[i & 7];
        if ((i & (-8)) == 0) {
            return AbstractC8639.m23279(enumC13722);
        }
        int i2 = AbstractC8639.f28224;
        C9384 c9384 = new C9384();
        c9384.mo24710((Object) enumC13722);
        for (EnumC13722 enumC13723 : f43564) {
            if (enumC13723.m33531(i)) {
                c9384.mo24710((Object) enumC13723);
            }
        }
        return c9384.mo24709();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m33527(int i) {
        StringBuilder sb = new StringBuilder();
        for (EnumC13722 enumC13722 : m33528(i)) {
            if (sb.length() > 0) {
                sb.append('|');
            }
            sb.append(enumC13722.toString());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33525(Iterable iterable) {
        Iterator it = iterable.iterator();
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            EnumC13722 enumC13722 = (EnumC13722) it.next();
            if (enumC13722.f43566) {
                i += enumC13722.f43567;
            } else {
                if (z) {
                    throw new IllegalArgumentException("Cannot combine multiple flags for hidden api restrictions");
                }
                i += enumC13722.f43567;
                z = true;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC13722 m33526(String str) {
        return (EnumC13722) f43565.get(str);
    }
}
