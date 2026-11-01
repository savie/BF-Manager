package l;

/* JADX INFO: renamed from: l.ۢۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBIO */
/* JADX INFO: loaded from: classes3.dex */
public final class C9482 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f32078;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f32079;

    public final String toString() {
        return C7997.m21055("<", this.f32078, ">: ", this.f32079);
    }

    public C9482(C2424 c2424, String str) {
        c2424.getClass();
        this.f32078 = c2424.m7398();
        this.f32079 = str;
    }

    public C9482(C2424 c2424, String str, Object... objArr) {
        c2424.getClass();
        this.f32078 = c2424.m7398();
        this.f32079 = String.format(str, objArr);
    }
}
