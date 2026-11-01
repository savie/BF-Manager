package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v0 l.ᩴ۫᩵, still in use, count: 1, list:
  (r6v0 l.ᩴ۫᩵) from 0x0092: FILLED_NEW_ARRAY (r6v0 l.ᩴ۫᩵), (r0v1 l.ᩴ۫᩵), (r1v1 l.ᩴ۫᩵), (r2v1 l.ᩴ۫᩵), (r3v1 l.ᩴ۫᩵), (r4v1 l.ᩴ۫᩵), (r5v1 l.ᩴ۫᩵) A[WRAPPED] elemType: l.ᩴ۫᩵
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ᩴ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9TP */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC18763 {
    WHITELIST(0, "whitelist", false),
    GREYLIST(1, "greylist", false),
    BLACKLIST(2, "blacklist", false),
    GREYLIST_MAX_O(3, "greylist-max-o", false),
    GREYLIST_MAX_P(4, "greylist-max-p", false),
    GREYLIST_MAX_Q(5, "greylist-max-q", false),
    GREYLIST_MAX_R(6, "greylist-max-r", false),
    CORE_PLATFORM_API(8, "core-platform-api", true),
    TEST_API(16, "test-api", true);


    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f60823 = 7;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f60832;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f60833;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f60834;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final Map f60819 = new HashMap();

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC18763[] f60825 = {new EnumC18763(0, "whitelist", false), new EnumC18763(1, "greylist", false), new EnumC18763(2, "blacklist", false), new EnumC18763(3, "greylist-max-o", false), new EnumC18763(4, "greylist-max-p", false), new EnumC18763(5, "greylist-max-q", false), new EnumC18763(6, "greylist-max-r", false)};

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC18763[] f60827 = {new EnumC18763(8, "core-platform-api", true), new EnumC18763(16, "test-api", true)};

    public static EnumC18763 valueOf(String str) {
        return (EnumC18763) Enum.valueOf(EnumC18763.class, str);
    }

    public static EnumC18763[] values() {
        return (EnumC18763[]) f60829.clone();
    }

    static {
        for (EnumC18763 enumC18763 : values()) {
            f60819.put(enumC18763.toString(), enumC18763);
        }
    }

    public EnumC18763(int i, String str, boolean z) {
        super(str, i);
        this.f60832 = i;
        this.f60834 = str;
        this.f60833 = z;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f60834;
    }

    public int getValue() {
        return this.f60832;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m43327(int i) {
        if (this.f60833) {
            return (i & this.f60832) != 0;
        }
        return (i & 7) == this.f60832;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m43326() {
        return this.f60833;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Set m43321(int i) {
        EnumC18763 enumC18763 = f60825[i & 7];
        if ((i & (-8)) == 0) {
            return AbstractC23844.m52570(enumC18763);
        }
        int i2 = AbstractC23844.f77093;
        C6204 c6204 = new C6204();
        c6204.mo13308((Object) enumC18763);
        for (EnumC18763 enumC18764 : f60827) {
            if (enumC18764.m43327(i)) {
                c6204.mo13308((Object) enumC18764);
            }
        }
        return c6204.mo14317();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m43324(int i) {
        StringBuilder sb = new StringBuilder();
        for (EnumC18763 enumC18763 : m43321(i)) {
            if (sb.length() > 0) {
                sb.append('|');
            }
            sb.append(enumC18763.toString());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43322(Iterable iterable) {
        Iterator it = iterable.iterator();
        int i = 0;
        boolean z = false;
        while (it.hasNext()) {
            EnumC18763 enumC18763 = (EnumC18763) it.next();
            if (enumC18763.f60833) {
                i += enumC18763.f60832;
            } else {
                if (z) {
                    throw new IllegalArgumentException("Cannot combine multiple flags for hidden api restrictions");
                }
                i += enumC18763.f60832;
                z = true;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC18763 m43323(String str) {
        return (EnumC18763) f60819.get(str);
    }
}
