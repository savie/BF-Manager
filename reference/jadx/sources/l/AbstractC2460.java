package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۖۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2460 extends AbstractC6935 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f7898;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f7899;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f7900;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f7901;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public StringBuilder f7902;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f7903;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f7904;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C6190 f7905;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f7906;

    public AbstractC2460(EnumC8426 enumC8426) {
        super(enumC8426);
        this.f7902 = new StringBuilder();
        this.f7900 = false;
        this.f7906 = false;
        this.f7898 = false;
    }

    @Override // l.AbstractC6935
    /* JADX INFO: renamed from: ۙ */
    public AbstractC2460 mo1678() {
        this.f7901 = null;
        this.f7904 = null;
        this.f7903 = null;
        AbstractC6935.m19218(this.f7902);
        this.f7899 = null;
        this.f7900 = false;
        this.f7906 = false;
        this.f7898 = false;
        this.f7905 = null;
        return this;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m8316() {
        String string;
        if (this.f7905 == null) {
            this.f7905 = new C6190();
        }
        String str = this.f7903;
        StringBuilder sb = this.f7902;
        if (str != null) {
            String strTrim = str.trim();
            this.f7903 = strTrim;
            if (strTrim.length() > 0) {
                if (this.f7906) {
                    string = sb.length() > 0 ? sb.toString() : this.f7899;
                } else {
                    string = this.f7900 ? "" : null;
                }
                this.f7905.put(this.f7903, string);
            }
        }
        this.f7903 = null;
        this.f7900 = false;
        this.f7906 = false;
        AbstractC6935.m19218(sb);
        this.f7899 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8313() {
        if (this.f7903 != null) {
            m8316();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m8310() {
        String str = this.f7901;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must be false");
        }
        return this.f7901;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8311(String str) {
        String str2 = this.f7901;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f7901 = str;
        this.f7904 = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8308(String str) {
        String str2 = this.f7903;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f7903 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8307(char c) {
        m8308(String.valueOf(c));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m8312() {
        this.f7900 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8309(int[] iArr) {
        this.f7906 = true;
        String str = this.f7899;
        StringBuilder sb = this.f7902;
        if (str != null) {
            sb.append(str);
            this.f7899 = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8314(char c) {
        this.f7906 = true;
        String str = this.f7899;
        StringBuilder sb = this.f7902;
        if (str != null) {
            sb.append(str);
            this.f7899 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8315(String str) {
        this.f7906 = true;
        String str2 = this.f7899;
        StringBuilder sb = this.f7902;
        if (str2 != null) {
            sb.append(str2);
            this.f7899 = null;
        }
        if (sb.length() == 0) {
            this.f7899 = str;
        } else {
            sb.append(str);
        }
    }
}
