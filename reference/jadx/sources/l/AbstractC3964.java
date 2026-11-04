package l;

import java.util.Calendar;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۘۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4MZ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3964 extends AbstractC23356 implements InterfaceC22610 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Matcher f13547;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public MatchResult f13548;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Pattern f13549;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21118 f13550;

    /* JADX INFO: renamed from: ۙ */
    public abstract C11421 mo1714();

    public AbstractC3964() {
        m12700(32, "(\\S+)\\s+(\\S+)\\s+(?:(<DIR>)|([0-9]+))\\s+(\\S.*)");
        this.f13550 = new C21118();
    }

    public AbstractC3964(String str) {
        m12700(0, str);
        this.f13550 = new C21118();
    }

    @Override // l.InterfaceC22610
    /* JADX INFO: renamed from: ۙ */
    public final void mo6095(C11421 c11421) {
        C21118 c21118 = this.f13550;
        if (c21118 != null) {
            C11421 c11421Mo1714 = mo1714();
            if (c11421 != null) {
                if (c11421.m28767() == null) {
                    c11421.m28768(c11421Mo1714.m28767());
                }
                if (c11421.m28770() == null) {
                    c11421.m28771(c11421Mo1714.m28770());
                }
                c21118.mo6095(c11421);
                return;
            }
            c21118.mo6095(c11421Mo1714);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12700(int i, String str) {
        try {
            this.f13549 = Pattern.compile(str, i);
        } catch (PatternSyntaxException unused) {
            throw new IllegalArgumentException("Unparseable regex supplied: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Calendar m12702(String str) {
        return this.f13550.m48214(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m12701(int i) {
        MatchResult matchResult = this.f13548;
        if (matchResult == null) {
            return null;
        }
        return matchResult.group(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m12703(String str) {
        this.f13548 = null;
        Matcher matcher = this.f13549.matcher(str);
        this.f13547 = matcher;
        if (matcher.matches()) {
            this.f13548 = this.f13547.toMatchResult();
        }
        return this.f13548 != null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m12704(String str) {
        m12700(0, str);
    }
}
