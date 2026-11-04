package l;

import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes2.dex */
public final class C2225 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f7291;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11919 f7292;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C12665 f7293;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f7294;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f7295;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f7296;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C0733 f7297;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Uri f7298;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f7299;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C17886 f7300;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23854 f7301;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Object f7302;

    public C2225() {
        this.f7292 = new C11919();
        this.f7300 = new C17886();
        this.f7291 = Collections.EMPTY_LIST;
        this.f7295 = AbstractC1928.of();
        this.f7301 = new C23854();
        this.f7293 = C12665.f40586;
        this.f7294 = -9223372036854775807L;
    }

    public C2225(C14902 c14902) {
        C17886 c17886;
        this();
        this.f7292 = new C11919(c14902.f48680);
        this.f7299 = c14902.f48685;
        this.f7297 = c14902.f48683;
        this.f7301 = new C23854(c14902.f48684);
        this.f7293 = c14902.f48682;
        C20870 c20870 = c14902.f48681;
        if (c20870 != null) {
            this.f7296 = c20870.f66801;
            this.f7298 = c20870.f66802;
            this.f7291 = c20870.f66806;
            this.f7295 = c20870.f66804;
            this.f7302 = c20870.f66803;
            C16394 c16394 = c20870.f66800;
            if (c16394 == null) {
                c17886 = new C17886();
            } else {
                c17886 = new C17886(c16394);
            }
            this.f7300 = c17886;
            this.f7294 = c20870.f66805;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7577(String str) {
        this.f7298 = str == null ? null : Uri.parse(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7573(String str) {
        str.getClass();
        this.f7299 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7571(Uri uri) {
        this.f7298 = uri;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7576() {
        this.f7296 = "application/x-mpegURL";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7574(List list) {
        this.f7295 = AbstractC1928.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7572(Object obj) {
        this.f7302 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14902 m7570() {
        C20870 c20870;
        C16394 c16394;
        C20782.m47568(this.f7300.f58618 == null || this.f7300.f58614 != null);
        Uri uri = this.f7298;
        if (uri != null) {
            String str = this.f7296;
            if (this.f7300.f58614 != null) {
                C17886 c17886 = this.f7300;
                c17886.getClass();
                c16394 = new C16394(c17886);
            } else {
                c16394 = null;
            }
            c20870 = new C20870(uri, str, c16394, this.f7291, this.f7295, this.f7302, this.f7294);
        } else {
            c20870 = null;
        }
        String str2 = this.f7299;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        C11919 c11919 = this.f7292;
        c11919.getClass();
        C17140 c17140 = new C17140(c11919);
        C23854 c23854 = this.f7301;
        c23854.getClass();
        C3716 c3716 = new C3716(c23854);
        C0733 c0733 = this.f7297;
        if (c0733 == null) {
            c0733 = C0733.f2667;
        }
        return new C14902(str3, c17140, c20870, c3716, c0733, this.f7293);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7575(C3716 c3716) {
        this.f7301 = new C23854(c3716);
    }
}
