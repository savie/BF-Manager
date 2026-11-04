package l;

/* JADX INFO: renamed from: l.֫᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2226 extends C12426 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C19159 f7303;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10954 f7304;

    public C2226(C10954 c10954, C19159 c19159) {
        super(c10954.m27783());
        this.f7304 = c10954;
        this.f7303 = c19159;
    }

    @Override // l.C12426
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7075 mo7580() {
        return this.f7304.m27785();
    }

    @Override // l.C12426
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo7579(String str) {
        return this.f7304.m27781(str);
    }

    @Override // l.C12426
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo7578(int i, String str) {
        Integer numM38942 = C16395.m38942(str);
        if (numM38942 != null) {
            return numM38942.intValue();
        }
        if (!this.f7303.f61991 || str.startsWith("android:")) {
            return this.f7304.m27780(i, str);
        }
        return -1;
    }
}
