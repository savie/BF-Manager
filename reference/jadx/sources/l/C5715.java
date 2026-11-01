package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: V1UX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5715 extends AbstractC10425 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final char[] f19466;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f19467;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f19468;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17004 f19469;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f19470;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C5715 f19471;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f19472;

    static {
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c = (char) (c + 1)) {
            sb.append(c);
        }
        f19466 = sb.toString().toCharArray();
    }

    public C5715() {
        this.f19467 = new StringBuilder();
        this.f19469 = new C17004(null);
        this.f19468 = new HashMap();
        this.f19471 = null;
        this.f19472 = false;
    }

    public C5715(C5715 c5715) {
        this.f19467 = new StringBuilder();
        this.f19469 = new C17004(null);
        this.f19468 = new HashMap();
        this.f19472 = false;
        this.f19471 = c5715;
    }

    @Override // l.AbstractC10425
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo15750() {
        this.f19472 = true;
    }

    @Override // l.AbstractC10425
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo15751() {
        this.f19471 = null;
        this.f19470 = 0;
    }

    @Override // l.AbstractC10425
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo15749() {
        StringBuilder sbM15747 = m15747();
        if (this.f19472) {
            sbM15747.insert(0, '_');
        }
        m15748();
        C17004 c17004 = this.f19469;
        c17004.m39783(sbM15747);
        HashMap map = this.f19468;
        String str = (String) map.get(c17004);
        if (str != null) {
            return str;
        }
        String string = sbM15747.toString();
        map.put(new C17004(string), string);
        return string;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private StringBuilder m15747() {
        StringBuilder sbM15747;
        int i = this.f19470;
        C5715 c5715 = this.f19471;
        if (c5715 == null) {
            sbM15747 = this.f19467;
            C13638.requireNonNull(sbM15747);
            sbM15747.setLength(0);
        } else {
            sbM15747 = c5715.m15747();
        }
        sbM15747.append(f19466[i]);
        return sbM15747;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m15748() {
        int i = this.f19470 + 1;
        this.f19470 = i;
        if (i == f19466.length) {
            this.f19470 = 0;
            C5715 c5715 = this.f19471;
            if (c5715 == null) {
                this.f19471 = new C5715(null);
            } else {
                c5715.m15748();
            }
        }
    }
}
