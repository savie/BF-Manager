package l;

import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes4.dex */
public final class C20348 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f65901;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11176 f65902;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public List f65903;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0591 f65904;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f65905;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC22433 f65906;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f65907;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C2002 f65908;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17525 f65909;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Uri f65910;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C5221 f65911;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Object f65912;

    public C20348() {
        this.f65904 = new C0591();
        this.f65909 = new C17525();
        this.f65903 = Collections.EMPTY_LIST;
        this.f65906 = AbstractC22433.of();
        this.f65902 = new C11176();
        this.f65908 = C2002.f7473;
        this.f65907 = -9223372036854775807L;
    }

    public C20348(C13689 c13689) {
        C17525 c17525;
        this();
        this.f65904 = new C0591(c13689.f45155);
        this.f65905 = c13689.f45154;
        this.f65911 = c13689.f45156;
        this.f65902 = new C11176(c13689.f45158);
        this.f65908 = c13689.f45159;
        C14704 c14704 = c13689.f45157;
        if (c14704 != null) {
            this.f65901 = c14704.f48033;
            this.f65910 = c14704.f48029;
            this.f65903 = c14704.f48030;
            this.f65906 = c14704.f48032;
            this.f65912 = c14704.f48035;
            C6236 c6236 = c14704.f48031;
            if (c6236 == null) {
                c17525 = new C17525();
            } else {
                c17525 = new C17525(c6236);
            }
            this.f65909 = c17525;
            this.f65907 = c14704.f48034;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45922(String str) {
        this.f65910 = str == null ? null : Uri.parse(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45918(String str) {
        str.getClass();
        this.f65905 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45916(Uri uri) {
        this.f65910 = uri;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45921() {
        this.f65901 = "application/x-mpegURL";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45919(List list) {
        this.f65906 = AbstractC22433.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45917(Object obj) {
        this.f65912 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13689 m45915() {
        C14704 c14704;
        C6236 c6236;
        C2023.m6510(this.f65909.f55717 == null || this.f65909.f55719 != null);
        Uri uri = this.f65910;
        if (uri != null) {
            String str = this.f65901;
            if (this.f65909.f55719 != null) {
                C17525 c17525 = this.f65909;
                c17525.getClass();
                c6236 = new C6236(c17525);
            } else {
                c6236 = null;
            }
            c14704 = new C14704(uri, str, c6236, this.f65903, this.f65906, this.f65912, this.f65907);
        } else {
            c14704 = null;
        }
        String str2 = this.f65905;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        C0591 c0591 = this.f65904;
        c0591.getClass();
        C12587 c12587 = new C12587(c0591);
        C11176 c11176 = this.f65902;
        c11176.getClass();
        C23876 c23876 = new C23876(c11176);
        C5221 c5221 = this.f65911;
        if (c5221 == null) {
            c5221 = C5221.f18078;
        }
        return new C13689(str3, c12587, c14704, c23876, c5221, this.f65908);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45920(C23876 c23876) {
        this.f65902 = new C11176(c23876);
    }
}
