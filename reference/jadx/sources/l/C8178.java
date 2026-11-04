package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۟᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1UX */
/* JADX INFO: loaded from: classes4.dex */
public final class C8178 extends AbstractC20769 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final char[] f26967;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f26968;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f26969;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f26970;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0720 f26971;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C8178 f26972;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final StringBuilder f26973;

    static {
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c = (char) (c + 1)) {
            sb.append(c);
        }
        f26967 = sb.toString().toCharArray();
    }

    public C8178() {
        this.f26973 = new StringBuilder();
        this.f26971 = new C0720(null);
        this.f26968 = new HashMap();
        this.f26972 = null;
        this.f26970 = false;
    }

    public C8178(C8178 c8178) {
        this.f26973 = new StringBuilder();
        this.f26971 = new C0720(null);
        this.f26968 = new HashMap();
        this.f26970 = false;
        this.f26972 = c8178;
    }

    @Override // l.AbstractC20769
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo22087() {
        this.f26970 = true;
    }

    @Override // l.AbstractC20769
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo22088() {
        this.f26972 = null;
        this.f26969 = 0;
    }

    @Override // l.AbstractC20769
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo22086() {
        StringBuilder sbM22085 = m22085();
        if (this.f26970) {
            sbM22085.insert(0, '_');
        }
        m22084();
        C0720 c0720 = this.f26971;
        c0720.m3041(sbM22085);
        HashMap map = this.f26968;
        String str = (String) map.get(c0720);
        if (str != null) {
            return str;
        }
        String string = sbM22085.toString();
        map.put(new C0720(string), string);
        return string;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private StringBuilder m22085() {
        StringBuilder sbM22085;
        int i = this.f26969;
        C8178 c8178 = this.f26972;
        if (c8178 == null) {
            sbM22085 = this.f26973;
            C17359.requireNonNull(sbM22085);
            sbM22085.setLength(0);
        } else {
            sbM22085 = c8178.m22085();
        }
        sbM22085.append(f26967[i]);
        return sbM22085;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m22084() {
        int i = this.f26969 + 1;
        this.f26969 = i;
        if (i == f26967.length) {
            this.f26969 = 0;
            C8178 c8178 = this.f26972;
            if (c8178 == null) {
                this.f26972 = new C8178(null);
            } else {
                c8178.m22084();
            }
        }
    }
}
