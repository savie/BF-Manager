package l;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8KW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16490 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f52984;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Map f52985;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f52986;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52987;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f52988;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f52989;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Uri f52990;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f52991;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f52992;

    public C16490() {
        this.f52989 = 1;
        this.f52985 = Collections.EMPTY_MAP;
        this.f52992 = -1L;
    }

    public C16490(C12257 c12257) {
        this.f52990 = c12257.f41015;
        this.f52986 = c12257.f41011;
        this.f52989 = c12257.f41014;
        this.f52991 = c12257.f41016;
        this.f52985 = c12257.f41010;
        this.f52984 = c12257.f41009;
        this.f52992 = c12257.f41017;
        this.f52988 = c12257.f41013;
        this.f52987 = c12257.f41012;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38763(String str) {
        this.f52990 = Uri.parse(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38756(Uri uri) {
        this.f52990 = uri;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38760(long j) {
        this.f52986 = j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38761(int i) {
        this.f52989 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38759(byte[] bArr) {
        this.f52991 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38758(Map map) {
        this.f52985 = map;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38762(long j) {
        this.f52984 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38755(long j) {
        this.f52992 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38757(String str) {
        this.f52988 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38754(int i) {
        this.f52987 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12257 m38753() {
        if (this.f52990 == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new C12257(this.f52990, this.f52986, this.f52989, this.f52991, this.f52985, this.f52984, this.f52992, this.f52988, this.f52987, 0);
    }
}
