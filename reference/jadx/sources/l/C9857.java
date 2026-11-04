package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۢۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T3ZT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9857 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f31727;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Set f31728;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f31729;

    public C9857(boolean z, boolean z2, Set set, C18808 c18808) {
        this.f31729 = z;
        this.f31727 = z2;
        this.f31728 = set;
        EnumC3666.f12544.m11915(c18808.f61112);
    }

    public final String toString() {
        return String.format("[errorRaised=%b, rootElements=%s, processingOver=%b]", Boolean.valueOf(this.f31727), this.f31728, Boolean.valueOf(this.f31729));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m25643() {
        return this.f31728;
    }
}
