package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۟᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1I5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7674 extends AbstractC11202 {
    @Override // l.AbstractC11202, l.AbstractC14730
    /* JADX INFO: renamed from: ۖ */
    public final /* bridge */ /* synthetic */ int mo2831() {
        return 0;
    }

    @Override // l.AbstractC11202, l.AbstractC14730
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ AbstractC14730 mo20268(String str, String str2) {
        throw null;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ܰ */
    public final void mo2861(Appendable appendable, int i, C19669 c19669) {
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ܶ */
    public final String mo2863() {
        return "#doctype";
    }

    @Override // l.AbstractC11202, l.AbstractC14730
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC14730 mo2867() {
        return this;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private boolean m20267(String str) {
        return !C4145.m11786(super.mo28144(str));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m20269(String str) {
        if (str != null) {
            super.mo20268("pubSysKey", str);
        }
    }

    public C7674(String str, String str2, String str3) {
        C5557.m15341((Object) str);
        C5557.m15341((Object) str2);
        C5557.m15341((Object) str3);
        super.mo20268("name", str);
        super.mo20268("publicId", str2);
        super.mo20268("systemId", str3);
        if (m20267("publicId")) {
            super.mo20268("pubSysKey", "PUBLIC");
        } else if (m20267("systemId")) {
            super.mo20268("pubSysKey", "SYSTEM");
        }
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۙ */
    public final void mo2842(Appendable appendable, int i, C19669 c19669) throws IOException {
        if (this.f48151 > 0 && c19669.m44800()) {
            appendable.append('\n');
        }
        if (c19669.m44793() != EnumC8380.html || m20267("publicId") || m20267("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (m20267("name")) {
            appendable.append(" ").append(super.mo28144("name"));
        }
        if (m20267("pubSysKey")) {
            appendable.append(" ").append(super.mo28144("pubSysKey"));
        }
        if (m20267("publicId")) {
            appendable.append(" \"").append(super.mo28144("publicId")).append('\"');
        }
        if (m20267("systemId")) {
            appendable.append(" \"").append(super.mo28144("systemId")).append('\"');
        }
        appendable.append('>');
    }
}
