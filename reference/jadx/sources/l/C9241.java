package l;

/* JADX INFO: renamed from: l.ۢ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 65W0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9241 extends AbstractC11833 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte f31400;

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final int mo4462(int i) {
        return i + 2;
    }

    public C9241(C13825 c13825) {
        this.f31400 = (byte) C12076.m30049(c13825.m33646(1));
    }

    public C9241(byte b) {
        this.f31400 = b;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ۙ */
    public final void mo4463(C4651 c4651) {
        c4651.m12841(EnumC18182.VALUE_BYTE.f58128);
        c4651.m12841(this.f31400);
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ܰ */
    public final int mo4464(AbstractC11833 abstractC11833) {
        byte b = ((C9241) abstractC11833).f31400;
        byte b2 = this.f31400;
        if (b2 < b) {
            return -1;
        }
        return b2 > b ? 1 : 0;
    }

    @Override // l.AbstractC11833
    /* JADX INFO: renamed from: ᩸ */
    public final EnumC18182 mo4465() {
        return EnumC18182.VALUE_BYTE;
    }

    public final int hashCode() {
        return this.f31400;
    }
}
