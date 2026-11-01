package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۡۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8698 extends AbstractC7286 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public StringBuilder f29919;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f29920;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f29921;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f29922;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f29923;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f29924;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f29925;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22103 f29926;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f29927;

    public AbstractC8698(EnumC10109 enumC10109) {
        super(enumC10109);
        this.f29919 = new StringBuilder();
        this.f29924 = false;
        this.f29920 = false;
        this.f29921 = false;
    }

    @Override // l.AbstractC7286
    /* JADX INFO: renamed from: ۙ */
    public AbstractC8698 mo19432() {
        this.f29923 = null;
        this.f29922 = null;
        this.f29927 = null;
        AbstractC7286.m19431(this.f29919);
        this.f29925 = null;
        this.f29924 = false;
        this.f29920 = false;
        this.f29921 = false;
        this.f29926 = null;
        return this;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m22517() {
        String string;
        if (this.f29926 == null) {
            this.f29926 = new C22103();
        }
        String str = this.f29927;
        StringBuilder sb = this.f29919;
        if (str != null) {
            String strTrim = str.trim();
            this.f29927 = strTrim;
            if (strTrim.length() > 0) {
                if (this.f29920) {
                    string = sb.length() > 0 ? sb.toString() : this.f29925;
                } else {
                    string = this.f29924 ? "" : null;
                }
                this.f29926.put(this.f29927, string);
            }
        }
        this.f29927 = null;
        this.f29924 = false;
        this.f29920 = false;
        AbstractC7286.m19431(sb);
        this.f29925 = null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22524() {
        if (this.f29927 != null) {
            m22517();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m22522() {
        String str = this.f29923;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must be false");
        }
        return this.f29923;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m22523(String str) {
        String str2 = this.f29923;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f29923 = str;
        this.f29922 = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22519(String str) {
        String str2 = this.f29927;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f29927 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22518(char c) {
        m22519(String.valueOf(c));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22521() {
        this.f29924 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22520(int[] iArr) {
        this.f29920 = true;
        String str = this.f29925;
        StringBuilder sb = this.f29919;
        if (str != null) {
            sb.append(str);
            this.f29925 = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22525(char c) {
        this.f29920 = true;
        String str = this.f29925;
        StringBuilder sb = this.f29919;
        if (str != null) {
            sb.append(str);
            this.f29925 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22526(String str) {
        this.f29920 = true;
        String str2 = this.f29925;
        StringBuilder sb = this.f29919;
        if (str2 != null) {
            sb.append(str2);
            this.f29925 = null;
        }
        if (sb.length() == 0) {
            this.f29925 = str;
        } else {
            sb.append(str);
        }
    }
}
