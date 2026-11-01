package l;

/* JADX INFO: renamed from: l.ᩳᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469D */
/* JADX INFO: loaded from: classes5.dex */
public class C18212 extends AbstractRunnableC16096 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f58173;

    public C18212(C0572 c0572, String str) {
        super(c0572);
        this.f58173 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM38120 = AbstractRunnableC16096.m38120(this.f58173);
        C0572 c0572 = this.f52046;
        AbstractC20745 abstractC20745M2706 = c0572.m2706();
        long jMo33964 = 0;
        if (strM38120.contains(AbstractC20745.f67496)) {
            str = "550 No directory traversal allowed in SIZE param\r\n";
        } else {
            AbstractC20745 abstractC20745M46690 = abstractC20745M2706.m46690(strM38120);
            if (m38128(abstractC20745M46690)) {
                str = "550 SIZE target violates chroot\r\n";
            } else if (!abstractC20745M46690.mo33975()) {
                str = "550 Cannot get the SIZE of nonexistent object\r\n";
            } else if (abstractC20745M46690.mo33971()) {
                jMo33964 = abstractC20745M46690.mo33964();
                str = null;
            } else {
                str = "550 Cannot get the size of a non-file\r\n";
            }
        }
        if (str != null) {
            c0572.m2708(str);
            return;
        }
        c0572.m2708("213 " + jMo33964 + "\r\n");
    }
}
