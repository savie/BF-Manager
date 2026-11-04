package l;

/* JADX INFO: renamed from: l.ᩳᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8EG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19274 extends C13352 {

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public EnumC25110 f62326;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public long f62327;

    public C19274(String str, long j, long j2, long j3, EnumC25110 enumC25110) {
        super(str, "", null, j, j3, true);
        this.f62326 = enumC25110;
        this.f62327 = j2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m44621() {
        return this.f62327;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC25110 m44620() {
        return this.f62326;
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ۟ۙ */
    public final CharSequence mo8099() {
        if (getSize() != -1) {
            return null;
        }
        return "↘️ " + C8311.m22390(this.f62327);
    }
}
