package l;

/* JADX INFO: renamed from: l.ۚۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AKK */
/* JADX INFO: loaded from: classes3.dex */
public final class C5549 implements InterfaceC8292 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class f19283;

    public C5549(Class cls) {
        C15243.m36590(cls, "jClass");
        this.f19283 = cls;
    }

    public final int hashCode() {
        return this.f19283.hashCode();
    }

    @Override // l.InterfaceC8292
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Class mo16466() {
        return this.f19283;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5549) {
            return C15243.m36589(this.f19283, ((C5549) obj).f19283);
        }
        return false;
    }

    public final String toString() {
        return this.f19283.toString() + " (Kotlin reflection is not available)";
    }
}
