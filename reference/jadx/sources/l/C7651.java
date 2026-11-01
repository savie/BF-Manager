package l;

import java.util.Set;

/* JADX INFO: renamed from: l.۟ᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: T3ZT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7651 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f25284;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Set f25285;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f25286;

    public C7651(boolean z, boolean z2, Set set, C10474 c10474) {
        this.f25286 = z;
        this.f25284 = z2;
        this.f25285 = set;
        EnumC14026.f46096.m33945(c10474.f35859);
    }

    public final String toString() {
        return String.format("[errorRaised=%b, rootElements=%s, processingOver=%b]", Boolean.valueOf(this.f25284), this.f25285, Boolean.valueOf(this.f25286));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m20204() {
        return this.f25285;
    }
}
