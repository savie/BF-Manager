package l;

import com.google.android.material.motion.MotionUtils;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B3ZP */
/* JADX INFO: loaded from: classes.dex */
public final class C23458 extends AbstractC3782 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Set f75910;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15998 f75911;

    public C23458(C13015 c13015) {
        super(null, new C23920(c13015, EnumSet.of(EnumC5246.SUMMARY, EnumC5246.DETAILS, EnumC5246.SUBDIAGNOSTICS)));
    }

    @Override // l.AbstractC3782
    /* JADX INFO: renamed from: ᩴ */
    public final String mo12289(C17007 c17007, Locale locale) {
        try {
            this.f75911 = new C15998(c17007);
            StringBuilder sb = new StringBuilder();
            if (c17007.m40087() != -1) {
                sb.append(AbstractC3782.m12278(c17007, false));
                sb.append(':');
                sb.append(AbstractC3782.m12277(c17007, EnumC23146.LINE));
                sb.append(':');
                sb.append(AbstractC3782.m12277(c17007, EnumC23146.COLUMN));
                sb.append(':');
            } else if (c17007.m40086() != null && c17007.m40086().mo10885() == EnumC17468.CLASS) {
                sb.append(AbstractC3782.m12278(c17007, false));
                sb.append(":-:-:");
            } else {
                sb.append('-');
            }
            sb.append(' ');
            sb.append(mo43485(c17007, null));
            if (m12285(c17007)) {
                sb.append("\n");
                sb.append(m12283(c17007, 0));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        } finally {
            this.f75911 = null;
        }
    }

    @Override // l.InterfaceC20162
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String mo43485(C17007 c17007, Locale locale) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo12282((Locale) null, c17007.mo32405(), m12291(c17007, locale).toArray()));
        if ((c17007 instanceof C13278) && EnumSet.copyOf(getConfiguration().f77433).contains(EnumC5246.SUBDIAGNOSTICS) && m12287(c17007, null).m35550()) {
            sb.append(",{");
            Iterator it = m12287(c17007, null).iterator();
            String str = "";
            while (it.hasNext()) {
                C4794.m14774(sb, str, MotionUtils.EASING_TYPE_FORMAT_START, (String) it.next(), MotionUtils.EASING_TYPE_FORMAT_END);
                str = ",";
            }
            sb.append('}');
        }
        return sb.toString();
    }

    @Override // l.AbstractC3782
    /* JADX INFO: renamed from: ۙ */
    public final String mo12284(C17007 c17007, Object obj, Locale locale) {
        String strMo12284;
        if (obj instanceof InterfaceC13449) {
            strMo12284 = obj.toString();
        } else if (obj instanceof AbstractC22295) {
            C11972.m30021(this.f75911);
            strMo12284 = "@" + this.f75911.m38127((AbstractC22295) obj);
        } else if (obj instanceof AbstractC13234) {
            strMo12284 = ((AbstractC13234) obj).mo32790();
        } else if (obj instanceof EnumC21461) {
            strMo12284 = "compiler.misc.tree.tag." + ((EnumC21461) obj).name().toLowerCase(Locale.US);
        } else {
            strMo12284 = ((obj instanceof EnumC20820) && obj == EnumC20820.f66679 && f75910.contains(c17007.mo32405())) ? "DEFAULT" : super.mo12284(c17007, obj, (Locale) null);
        }
        return obj instanceof C17007 ? C14442.m34865(MotionUtils.EASING_TYPE_FORMAT_START, strMo12284, MotionUtils.EASING_TYPE_FORMAT_END) : strMo12284;
    }

    static {
        Object[] objArr = {"compiler.note.preview.filename", "compiler.note.preview.plural"};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        f75910 = C4681.unmodifiableSet(hashSet);
    }

    @Override // l.AbstractC3782
    /* JADX INFO: renamed from: ۙ */
    public final String mo12282(Locale locale, String str, Object... objArr) {
        StringBuilder sbM27333 = C10732.m27333(str);
        int length = objArr.length;
        String str2 = ": ";
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            sbM27333.append(str2);
            sbM27333.append(obj);
            i++;
            str2 = ", ";
        }
        return sbM27333.toString();
    }
}
