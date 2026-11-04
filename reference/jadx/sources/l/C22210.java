package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1I5 */
/* JADX INFO: loaded from: classes.dex */
public final class C22210 extends AbstractC25194 {
    @Override // l.AbstractC25194, l.AbstractC17734
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ AbstractC17734 mo41528(String str, String str2) {
        throw null;
    }

    @Override // l.AbstractC25194, l.AbstractC17734
    /* JADX INFO: renamed from: ۤ */
    public final /* bridge */ /* synthetic */ int mo9543() {
        return 0;
    }

    @Override // l.AbstractC25194, l.AbstractC17734
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC17734 mo9544() {
        return this;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ܺ */
    public final String mo5151() {
        return "#doctype";
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5152(Appendable appendable, int i, C7381 c7381) {
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private boolean m50235(String str) {
        return !C0669.m2902(super.mo41538(str));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m50236(String str) {
        if (str != null) {
            super.mo41528("pubSysKey", str);
        }
    }

    public C22210(String str, String str2, String str3) {
        C14838.m35754((Object) str);
        C14838.m35754((Object) str2);
        C14838.m35754((Object) str3);
        super.mo41528("name", str);
        super.mo41528("publicId", str2);
        super.mo41528("systemId", str3);
        if (m50235("publicId")) {
            super.mo41528("pubSysKey", "PUBLIC");
        } else if (m50235("systemId")) {
            super.mo41528("pubSysKey", "SYSTEM");
        }
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۙ */
    public final void mo5150(Appendable appendable, int i, C7381 c7381) throws IOException {
        if (this.f58268 > 0 && c7381.m20280()) {
            appendable.append('\n');
        }
        if (c7381.m20275() != EnumC8872.html || m50235("publicId") || m50235("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (m50235("name")) {
            appendable.append(" ").append(super.mo41538("name"));
        }
        if (m50235("pubSysKey")) {
            appendable.append(" ").append(super.mo41538("pubSysKey"));
        }
        if (m50235("publicId")) {
            appendable.append(" \"").append(super.mo41538("publicId")).append('\"');
        }
        if (m50235("systemId")) {
            appendable.append(" \"").append(super.mo41538("systemId")).append('\"');
        }
        appendable.append('>');
    }
}
