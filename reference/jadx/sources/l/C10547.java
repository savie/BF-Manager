package l;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: l.ۤ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5R0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10547 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f33525;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f33526;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f33527;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f33528;

    public C10547(String str, String str2, String str3, String str4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        this.f33525 = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2);
        this.f33527 = simpleDateFormat2;
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(str3);
        this.f33528 = simpleDateFormat3;
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(str4);
        this.f33526 = simpleDateFormat4;
        simpleDateFormat.setLenient(false);
        simpleDateFormat2.setLenient(false);
        simpleDateFormat3.setLenient(false);
        simpleDateFormat4.setLenient(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m26995(long j, boolean z, boolean z2) {
        SimpleDateFormat simpleDateFormat;
        if (z) {
            if (z2) {
                simpleDateFormat = this.f33525;
            } else {
                simpleDateFormat = this.f33528;
            }
        } else if (z2) {
            simpleDateFormat = this.f33527;
        } else {
            simpleDateFormat = this.f33526;
        }
        return simpleDateFormat.format(Long.valueOf(j));
    }
}
