package l;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: l.ۖۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A5R0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2496 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f9901;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f9902;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f9903;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f9904;

    public C2496(String str, String str2, String str3, String str4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        this.f9902 = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2);
        this.f9904 = simpleDateFormat2;
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(str3);
        this.f9901 = simpleDateFormat3;
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(str4);
        this.f9903 = simpleDateFormat4;
        simpleDateFormat.setLenient(false);
        simpleDateFormat2.setLenient(false);
        simpleDateFormat3.setLenient(false);
        simpleDateFormat4.setLenient(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7628(long j, boolean z, boolean z2) {
        SimpleDateFormat simpleDateFormat;
        if (z) {
            if (z2) {
                simpleDateFormat = this.f9902;
            } else {
                simpleDateFormat = this.f9901;
            }
        } else if (z2) {
            simpleDateFormat = this.f9904;
        } else {
            simpleDateFormat = this.f9903;
        }
        return simpleDateFormat.format(Long.valueOf(j));
    }
}
