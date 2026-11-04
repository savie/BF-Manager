package l;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧ᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8KW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11941 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f38450;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38451;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Uri f38452;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f38453;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f38454;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f38455;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f38456;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f38457;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Map f38458;

    public C11941() {
        this.f38453 = 1;
        this.f38458 = Collections.EMPTY_MAP;
        this.f38455 = -1L;
    }

    public C11941(C25368 c25368) {
        this.f38452 = c25368.f81907;
        this.f38450 = c25368.f81905;
        this.f38453 = c25368.f81908;
        this.f38457 = c25368.f81912;
        this.f38458 = c25368.f81913;
        this.f38454 = c25368.f81909;
        this.f38455 = c25368.f81910;
        this.f38456 = c25368.f81911;
        this.f38451 = c25368.f81906;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29918(String str) {
        this.f38452 = Uri.parse(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29911(Uri uri) {
        this.f38452 = uri;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29915(long j) {
        this.f38450 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29916(int i) {
        this.f38453 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29914(byte[] bArr) {
        this.f38457 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29913(Map map) {
        this.f38458 = map;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29917(long j) {
        this.f38454 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29910(long j) {
        this.f38455 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29912(String str) {
        this.f38456 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29909(int i) {
        this.f38451 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25368 m29908() {
        if (this.f38452 == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new C25368(this.f38452, this.f38450, this.f38453, this.f38457, this.f38458, this.f38454, this.f38455, this.f38456, this.f38451, 0);
    }
}
