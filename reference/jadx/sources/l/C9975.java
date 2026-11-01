package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C9975 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f34084;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f34085;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f34086;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Uri f34087;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f34088;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f34089;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f34090;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f34091;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f34092;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Uri f34093;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f34094;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f34095;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f34096;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f34097;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f34098;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f34099;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f34100;

    public C9975(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3) {
        C2023.m6507((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f34086 = str;
        this.f34093 = uri;
        this.f34087 = uri2;
        this.f34096 = j;
        this.f34084 = j2;
        this.f34099 = j3;
        this.f34089 = j4;
        this.f34088 = arrayList;
        this.f34092 = z;
        this.f34098 = j5;
        this.f34100 = j6;
        this.f34095 = AbstractC22433.copyOf((Collection) arrayList2);
        this.f34094 = AbstractC22433.copyOf((Collection) arrayList3);
        this.f34091 = AbstractC22433.m49798(new C14168(1), arrayList4);
        this.f34085 = z2;
        this.f34090 = str2;
        this.f34097 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9975)) {
            return false;
        }
        C9975 c9975 = (C9975) obj;
        return this.f34096 == c9975.f34096 && this.f34084 == c9975.f34084 && this.f34099 == c9975.f34099 && this.f34089 == c9975.f34089 && this.f34092 == c9975.f34092 && this.f34098 == c9975.f34098 && this.f34100 == c9975.f34100 && this.f34085 == c9975.f34085 && C13638.equals(this.f34086, c9975.f34086) && C13638.equals(this.f34093, c9975.f34093) && C13638.equals(this.f34087, c9975.f34087) && C13638.equals(this.f34088, c9975.f34088) && C13638.equals(this.f34095, c9975.f34095) && C13638.equals(this.f34094, c9975.f34094) && C13638.equals(this.f34091, c9975.f34091) && C13638.equals(this.f34090, c9975.f34090) && C13638.equals(this.f34097, c9975.f34097);
    }

    public final int hashCode() {
        return C13638.hash(this.f34086, this.f34093, this.f34087, Long.valueOf(this.f34096), Long.valueOf(this.f34084), Long.valueOf(this.f34099), Long.valueOf(this.f34089), this.f34088, Boolean.valueOf(this.f34092), Long.valueOf(this.f34098), Long.valueOf(this.f34100), this.f34095, this.f34094, this.f34091, Boolean.valueOf(this.f34085), this.f34090, this.f34097);
    }
}
