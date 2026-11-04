package l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y90G */
/* JADX INFO: loaded from: classes4.dex */
public final class C13350 extends AbstractC9008 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern[][] f42566 = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*+\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Pattern f42569;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19229 f42567 = new C19229();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f42570 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C0474 f42568 = new C0474();

    public C13350(Pattern pattern) {
        this.f42569 = pattern;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC23705 mo7447() {
        return this.f42567;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final C7932 mo7444(InterfaceC4753 interfaceC4753) {
        if (this.f42570) {
            return null;
        }
        if (interfaceC4753.mo14653() && this.f42569 == null) {
            return null;
        }
        return C7932.m21504(interfaceC4753.getIndex());
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final void mo7445(C14228 c14228) {
        this.f42568.m2307(c14228.m34537());
        Pattern pattern = this.f42569;
        if (pattern == null || !pattern.matcher(c14228.m34537()).find()) {
            return;
        }
        this.f42570 = true;
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۚ */
    public final void mo7446() {
        this.f42567.m44560(this.f42568.m2306());
        this.f42568 = null;
    }
}
