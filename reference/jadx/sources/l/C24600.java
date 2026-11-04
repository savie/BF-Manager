package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.᩺᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes.dex */
public final class C24600 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f79687;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f79688;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Uri f79689;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f79690;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f79691;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f79692;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f79693;

    public C24600(Uri uri) {
        this.f79689 = uri;
    }

    public C24600(C4462 c4462) {
        this.f79689 = c4462.f15963;
        this.f79693 = c4462.f15967;
        this.f79688 = c4462.f15962;
        this.f79690 = c4462.f15964;
        this.f79691 = c4462.f15965;
        this.f79692 = c4462.f15966;
        this.f79687 = c4462.f15961;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m54921(String str) {
        this.f79693 = C9681.m25264(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54922() {
        this.f79690 = 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54923(String str) {
        this.f79692 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54920(String str) {
        this.f79687 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4462 m54919() {
        return new C4462(this);
    }
}
