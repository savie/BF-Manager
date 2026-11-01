package l;

/* JADX INFO: renamed from: l.ܰ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4WL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14096 extends AbstractC14614 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23786 f46263 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23786[] f46264;

    public C14096(InterfaceC23786[] interfaceC23786Arr) {
        this.f46264 = interfaceC23786Arr;
    }

    @Override // l.InterfaceC23786
    /* JADX INFO: renamed from: ۙ */
    public final C11086 mo4881(String str) {
        InterfaceC23786 interfaceC23786 = this.f46263;
        if (interfaceC23786 != null) {
            return interfaceC23786.mo4881(str);
        }
        for (InterfaceC23786 interfaceC23787 : this.f46264) {
            C11086 c11086Mo4881 = interfaceC23787.mo4881(str);
            if (c11086Mo4881 != null) {
                this.f46263 = interfaceC23787;
                return c11086Mo4881;
            }
        }
        return null;
    }
}
