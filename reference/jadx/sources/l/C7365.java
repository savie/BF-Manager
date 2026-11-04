package l;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۜ᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9DZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7365 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Set f24231;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f24232 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f24233;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public UUID f24234;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f24235;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC15700 f24236;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24237;

    public C7365(String str, int i) {
        this.f24233 = str;
        this.f24237 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20221(UUID uuid, EnumC15700 enumC15700, int i, Set set) {
        if (this.f24232) {
            throw new IllegalStateException(C14442.m34865("Server object '", this.f24233, "' already initialized"));
        }
        this.f24232 = true;
        this.f24234 = uuid;
        this.f24236 = enumC15700;
        this.f24235 = i;
        this.f24231 = set;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m20224() {
        return this.f24233;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m20225() {
        return this.f24237;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20222(C7365 c7365) {
        return c7365.f24234.equals(this.f24234) && c7365.f24236.equals(this.f24236) && (c7365.f24235 == this.f24235) && c7365.f24231.equals(this.f24231);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final UUID m20226() {
        return this.f24234;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m20223() {
        return this.f24235;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m20220() {
        return this.f24231;
    }
}
