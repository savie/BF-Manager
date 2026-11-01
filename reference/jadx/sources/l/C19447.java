package l;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩵ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9DZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19447 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f62615;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f62616;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Set f62617;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f62618;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f62619 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC20508 f62620;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public UUID f62621;

    public C19447(String str, int i) {
        this.f62615 = str;
        this.f62616 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44497(UUID uuid, EnumC20508 enumC20508, int i, Set set) {
        if (this.f62619) {
            throw new IllegalStateException(C16523.m38890("Server object '", this.f62615, "' already initialized"));
        }
        this.f62619 = true;
        this.f62621 = uuid;
        this.f62620 = enumC20508;
        this.f62618 = i;
        this.f62617 = set;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m44499() {
        return this.f62615;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m44501() {
        return this.f62616;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final UUID m44495() {
        return this.f62621;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44498(C19447 c19447) {
        return c19447.f62621.equals(this.f62621) && c19447.f62620.equals(this.f62620) && (c19447.f62618 == this.f62618) && c19447.f62617.equals(this.f62617);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m44500() {
        return this.f62618;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set m44496() {
        return this.f62617;
    }
}
