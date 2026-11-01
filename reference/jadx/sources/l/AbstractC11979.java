package l;

import java.util.Calendar;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۨ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F4MZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11979 extends AbstractC14614 implements InterfaceC10380 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C5628 f40122;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Matcher f40123;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public MatchResult f40124;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Pattern f40125;

    /* JADX INFO: renamed from: ۙ */
    public abstract C12497 mo4882();

    public AbstractC11979() {
        m29786(32, "(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)");
        this.f40122 = new C5628();
    }

    public AbstractC11979(String str) {
        m29786(0, str);
        this.f40122 = new C5628();
    }

    @Override // l.InterfaceC10380
    /* JADX INFO: renamed from: ۙ */
    public final void mo15525(C12497 c12497) {
        C5628 c5628 = this.f40122;
        if (c5628 != null) {
            C12497 c12497Mo4882 = mo4882();
            if (c12497 != null) {
                if (c12497.m31039() == null) {
                    c12497.m31040(c12497Mo4882.m31039());
                }
                if (c12497.m31042() == null) {
                    c12497.m31043(c12497Mo4882.m31042());
                }
                c5628.mo15525(c12497);
                return;
            }
            c5628.mo15525(c12497Mo4882);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29786(int i, String str) {
        try {
            this.f40125 = Pattern.compile(str, i);
        } catch (PatternSyntaxException unused) {
            throw new IllegalArgumentException("Unparseable regex supplied: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Calendar m29789(String str) {
        return this.f40122.m15524(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m29788(int i) {
        MatchResult matchResult = this.f40124;
        if (matchResult == null) {
            return null;
        }
        return matchResult.group(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m29790(String str) {
        this.f40124 = null;
        Matcher matcher = this.f40125.matcher(str);
        this.f40123 = matcher;
        if (matcher.matches()) {
            this.f40124 = this.f40123.toMatchResult();
        }
        return this.f40124 != null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m29787(String str) {
        m29786(0, str);
    }
}
