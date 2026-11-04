package l;

import java.io.StringReader;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public final class C11988 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C20193 f38625;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC7315 f38626;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f38624 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3039 f38623 = new C3039(0);

    public C11988(AbstractC7315 abstractC7315) {
        this.f38626 = abstractC7315;
        this.f38625 = abstractC7315.mo13791();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5056 m30120(String str, String str2) {
        StringReader stringReader = new StringReader(str);
        AbstractC7315 abstractC7315 = this.f38626;
        abstractC7315.mo13748(stringReader, str2, this);
        abstractC7315.m20065();
        abstractC7315.f24099.m54684();
        abstractC7315.f24099 = null;
        abstractC7315.f24104 = null;
        abstractC7315.f24093 = null;
        abstractC7315.f24098 = null;
        return abstractC7315.f24096;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m30118(String str, C15496 c15496, String str2) {
        return this.f38626.mo13745(str, c15496, str2, this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30121(String str) {
        return this.f38626.mo13795(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m30125() {
        this.f38623.getClass();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3039 m30119() {
        return this.f38623;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m30122() {
        return this.f38624;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m30126() {
        this.f38624 = true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m30124() {
        this.f38625 = C20193.f64826;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20193 m30123() {
        return this.f38625;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C11988 m30117() {
        return new C11988(new C4815());
    }
}
