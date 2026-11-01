package l;

import com.google.android.material.motion.MotionUtils;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۚܺ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B3ZP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5451 extends AbstractC15165 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Set f18799;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C2628 f18800;

    public C5451(C14770 c14770) {
        super(null, new C22926(c14770, EnumSet.of(EnumC20438.SUMMARY, EnumC20438.DETAILS, EnumC20438.SUBDIAGNOSTICS)));
    }

    @Override // l.AbstractC15165
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String mo15113(C11948 c11948, Locale locale) {
        try {
            this.f18800 = new C2628(c11948);
            StringBuilder sb = new StringBuilder();
            if (c11948.m29755() != -1) {
                sb.append(AbstractC15165.m36366(c11948, false));
                sb.append(':');
                sb.append(AbstractC15165.m36365(c11948, EnumC12677.LINE));
                sb.append(':');
                sb.append(AbstractC15165.m36365(c11948, EnumC12677.COLUMN));
                sb.append(':');
            } else if (c11948.m29762() != null && c11948.m29762().mo6760() == EnumC11347.CLASS) {
                sb.append(AbstractC15165.m36366(c11948, false));
                sb.append(":-:-:");
            } else {
                sb.append('-');
            }
            sb.append(' ');
            sb.append(mo15112(c11948, null));
            if (m36372(c11948)) {
                sb.append("\n");
                sb.append(m36371(c11948, 0));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        } finally {
            this.f18800 = null;
        }
    }

    @Override // l.InterfaceC17615
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String mo15112(C11948 c11948, Locale locale) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo15110((Locale) null, c11948.mo29765(), m36370(c11948, locale).toArray()));
        if ((c11948 instanceof C1675) && EnumSet.copyOf(getConfiguration().f74520).contains(EnumC20438.SUBDIAGNOSTICS) && m36369(c11948, null).m48595()) {
            sb.append(",{");
            Iterator it = m36369(c11948, null).iterator();
            String str = "";
            while (it.hasNext()) {
                ASN1BMPString$$ExternalSyntheticOutline0.m(sb, str, MotionUtils.EASING_TYPE_FORMAT_START, (String) it.next(), MotionUtils.EASING_TYPE_FORMAT_END);
                str = ",";
            }
            sb.append('}');
        }
        return sb.toString();
    }

    @Override // l.AbstractC15165
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo15111(C11948 c11948, Object obj, Locale locale) {
        String strMo15111;
        if (obj instanceof InterfaceC11266) {
            strMo15111 = obj.toString();
        } else if (obj instanceof AbstractC5930) {
            C6171.m17171(this.f18800);
            strMo15111 = "@" + this.f18800.m8107((AbstractC5930) obj);
        } else if (obj instanceof AbstractC6344) {
            strMo15111 = ((AbstractC6344) obj).mo17451();
        } else if (obj instanceof EnumC18651) {
            strMo15111 = "compiler.misc.tree.tag." + ((EnumC18651) obj).name().toLowerCase(Locale.US);
        } else {
            strMo15111 = ((obj instanceof EnumC11909) && obj == EnumC11909.f39952 && f18799.contains(c11948.mo29765())) ? "DEFAULT" : super.mo15111(c11948, obj, (Locale) null);
        }
        return obj instanceof C11948 ? C16523.m38890(MotionUtils.EASING_TYPE_FORMAT_START, strMo15111, MotionUtils.EASING_TYPE_FORMAT_END) : strMo15111;
    }

    static {
        Object[] objArr = {"compiler.note.preview.filename", "compiler.note.preview.plural"};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        f18799 = C0561.unmodifiableSet(hashSet);
    }

    @Override // l.AbstractC15165
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo15110(Locale locale, String str, Object... objArr) {
        StringBuilder sbM23356 = C9023.m23356(str);
        int length = objArr.length;
        String str2 = ": ";
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            sbM23356.append(str2);
            sbM23356.append(obj);
            i++;
            str2 = ", ";
        }
        return sbM23356.toString();
    }
}
