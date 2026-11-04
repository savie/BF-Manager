package l;

import com.alipay.sdk.m.y.l;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K608 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19825 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Set f63737;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C19825 f63740;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC11071 f63743;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Set f63733 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Set f63742 = null;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Set f63735 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Set f63734 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Set f63739 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Set f63741 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC5940 f63736 = EnumC5940.UNKNOWN;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f63738 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45616(C19825 c19825) {
        C19825 c19825M45613 = c19825.m45613();
        if (this == c19825M45613) {
            return;
        }
        c19825M45613.f63740 = this;
        m45612(this, c19825M45613, EnumC10874.f34417);
        m45612(this, c19825M45613, EnumC10874.f34415);
        m45612(this, c19825M45613, EnumC10874.f34420);
        m45612(this, c19825M45613, EnumC10874.f34421);
        m45612(this, c19825M45613, EnumC10874.f34416);
        m45612(this, c19825M45613, EnumC10874.f34419);
        String str = this.f63738;
        if (str == null) {
            this.f63738 = c19825M45613.f63738;
        } else {
            String str2 = c19825M45613.f63738;
            if (str2 != null) {
                this.f63738 = C22809.m51434(str, str2);
            }
        }
        c19825M45613.f63738 = null;
        Set set = c19825M45613.f63737;
        if (set != null) {
            Set set2 = this.f63737;
            if (set2 == null) {
                this.f63737 = set;
            } else {
                set2.addAll(set);
            }
            c19825M45613.f63737 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45612(C19825 c19825, C19825 c19826, EnumC10874 enumC10874) {
        Set setMo9085 = enumC10874.mo9085(c19826);
        if (setMo9085 != null) {
            Set setMo9086 = enumC10874.mo9085(c19825);
            if (setMo9086 == null) {
                enumC10874.mo9086(c19825, setMo9085);
            } else {
                setMo9086.addAll(setMo9085);
                setMo9085 = setMo9086;
            }
            setMo9085.remove(c19825);
            setMo9085.remove(c19826);
            enumC10874.mo9086(c19826, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C19825 m45613() {
        C19825 c19825 = this;
        while (true) {
            C19825 c19826 = c19825.f63740;
            if (c19826 == null) {
                break;
            }
            c19825 = c19826;
        }
        if (c19825 != this) {
            this.f63740 = c19825;
        }
        return c19825;
    }

    public C19825(AbstractC11071 abstractC11071) {
        this.f63743 = abstractC11071;
    }

    public final String toString() {
        C19825 c19825M45613 = m45613();
        Set set = c19825M45613.f63737;
        String string = set == null ? "[]" : set.toString();
        return c19825M45613.f63736 + "::" + this.f63743 + ": " + c19825M45613.f63738 + " > {" + string.substring(1, string.length() - 1) + l.d;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m45618() {
        C19825 c19825M45613 = m45613();
        EnumC5940 enumC5940 = c19825M45613.f63736;
        if (enumC5940 == EnumC5940.OBJECT) {
            return c19825M45613.f63738.length() == 1 ? "Ljava/lang/Object;" : c19825M45613.f63738;
        }
        if (enumC5940.f20312 && enumC5940 != EnumC5940.INT) {
            String str = c19825M45613.f63738;
            if (str != null) {
                return str;
            }
            throw new RuntimeException();
        }
        if (enumC5940 == EnumC5940.JD) {
            return "J";
        }
        if (c19825M45613.f63737 != null) {
            String[] strArr = C15349.f50104;
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                if (c19825M45613.f63737.contains(str2)) {
                    return str2;
                }
            }
        }
        switch (C9447.f30640[enumC5940.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "I";
            case 4:
            case 5:
            case 6:
                return "Z";
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45617(EnumC5940 enumC5940) {
        EnumC5940 enumC5941 = this.f63736;
        EnumC5940 enumC5940M17257 = EnumC5940.m17257(enumC5941, enumC5940);
        if (enumC5940M17257 == enumC5941) {
            return false;
        }
        this.f63736 = enumC5940M17257;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m45615() {
        return m45613().f63738;
    }
}
