package l;

/* JADX INFO: renamed from: l.ۙۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W5CU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4465 extends AbstractC3384 implements InterfaceC3005 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C5171 f15876;

    public AbstractC4465(EnumC10297 enumC10297, C5171 c5171) {
        super(enumC10297);
        this.f15876 = c5171;
    }

    @Override // l.InterfaceC3005
    /* JADX INFO: renamed from: ᩸ */
    public final int mo8965() {
        int i = this.f15876.m14324().f49052 - m10035().f49052;
        if (mo5436() == 1) {
            if (i < -128 || i > 127) {
                throw new C20749(null, "Invalid instruction offset: %d. Offset must be in [-128, 127]", Integer.valueOf(i));
            }
        } else if (mo5436() == 2 && (i < -32768 || i > 32767)) {
            throw new C20749(null, "Invalid instruction offset: %d. Offset must be in [-32768, 32767]", Integer.valueOf(i));
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5171 m12443() {
        return this.f15876;
    }
}
