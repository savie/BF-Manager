package l;

import java.io.StringReader;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public final class C13756 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC19711 f45362;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4582 f45365;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f45364 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3130 f45363 = new C3130(0);

    public C13756(AbstractC19711 abstractC19711) {
        this.f45362 = abstractC19711;
        this.f45365 = abstractC19711.mo14492();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10497 m33517(String str, String str2) {
        StringReader stringReader = new StringReader(str);
        AbstractC19711 abstractC19711 = this.f45362;
        abstractC19711.mo14463(stringReader, str2, this);
        abstractC19711.m44840();
        abstractC19711.f63279.m7388();
        abstractC19711.f63279 = null;
        abstractC19711.f63280 = null;
        abstractC19711.f63271 = null;
        abstractC19711.f63269 = null;
        return abstractC19711.f63275;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m33515(String str, C0617 c0617, String str2) {
        return this.f45362.mo14460(str, c0617, str2, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33518(String str) {
        return this.f45362.mo14496(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m33522() {
        this.f45363.getClass();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3130 m33516() {
        return this.f45363;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m33521() {
        return this.f45364;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m33514() {
        this.f45364 = true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m33520() {
        this.f45365 = C4582.f16235;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4582 m33519() {
        return this.f45365;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C13756 m33513() {
        return new C13756(new C10539());
    }
}
