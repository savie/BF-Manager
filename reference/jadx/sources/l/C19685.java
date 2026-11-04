package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19685 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f63390;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f63391;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Uri f63392;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f63393;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f63394;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f63395;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f63396;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f63397;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f63398;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f63399;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f63400;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f63401;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f63402;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Uri f63403;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f63404;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f63405;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f63406;

    public C19685(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3) {
        C20782.m47565((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f63390 = str;
        this.f63403 = uri;
        this.f63392 = uri2;
        this.f63405 = j;
        this.f63396 = j2;
        this.f63397 = j3;
        this.f63395 = j4;
        this.f63401 = arrayList;
        this.f63393 = z;
        this.f63400 = j5;
        this.f63406 = j6;
        this.f63398 = AbstractC1928.copyOf((Collection) arrayList2);
        this.f63399 = AbstractC1928.copyOf((Collection) arrayList3);
        this.f63394 = AbstractC1928.m6613(new C23904(1), arrayList4);
        this.f63404 = z2;
        this.f63391 = str2;
        this.f63402 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19685)) {
            return false;
        }
        C19685 c19685 = (C19685) obj;
        return this.f63405 == c19685.f63405 && this.f63396 == c19685.f63396 && this.f63397 == c19685.f63397 && this.f63395 == c19685.f63395 && this.f63393 == c19685.f63393 && this.f63400 == c19685.f63400 && this.f63406 == c19685.f63406 && this.f63404 == c19685.f63404 && C17359.equals(this.f63390, c19685.f63390) && C17359.equals(this.f63403, c19685.f63403) && C17359.equals(this.f63392, c19685.f63392) && C17359.equals(this.f63401, c19685.f63401) && C17359.equals(this.f63398, c19685.f63398) && C17359.equals(this.f63399, c19685.f63399) && C17359.equals(this.f63394, c19685.f63394) && C17359.equals(this.f63391, c19685.f63391) && C17359.equals(this.f63402, c19685.f63402);
    }

    public final int hashCode() {
        return C17359.hash(this.f63390, this.f63403, this.f63392, Long.valueOf(this.f63405), Long.valueOf(this.f63396), Long.valueOf(this.f63397), Long.valueOf(this.f63395), this.f63401, Boolean.valueOf(this.f63393), Long.valueOf(this.f63400), Long.valueOf(this.f63406), this.f63398, this.f63399, this.f63394, Boolean.valueOf(this.f63404), this.f63391, this.f63402);
    }
}
