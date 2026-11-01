package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩸᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1UM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21803 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70616;

    public /* synthetic */ AbstractC21803(int i) {
        this.f70616 = i;
    }

    /* JADX INFO: renamed from: ۖ */
    public abstract void mo13835();

    /* JADX INFO: renamed from: ۙ */
    public abstract double mo31292(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract double mo31293(int i, double d);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo31294();

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo30971(int i, int i2, byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo14892(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo13840(int i, byte[] bArr);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo13841(String str);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo14893(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۚ */
    public abstract void mo13842();

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo13844();

    /* JADX INFO: renamed from: ܰ */
    public int mo31295() {
        return 0;
    }

    public String toString() {
        switch (this.f70616) {
            case 5:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m48569(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        mo13840(bytes.length, bytes);
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo15147(C12417 c12417) {
        throw new UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo4603(C12417 c12417) {
        mo15147(c12417);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo4483(AbstractC6066 abstractC6066) {
        throw new UnsupportedOperationException("Method must be overridden in [" + getClass().getName() + "] if ever called");
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo5127(C12417 c12417, C11006 c11006) {
        mo4483((AbstractC6066) c11006);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo5128(C12417 c12417, C17355 c17355) {
        mo4483((AbstractC6066) c17355);
    }
}
