package l;

/* JADX INFO: renamed from: l.۫ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5DO */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC13283 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f42436;

    public RunnableC13283(C5563 c5563, String str) {
        super(c5563);
        this.f42436 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM36601 = AbstractRunnableC15257.m36601(this.f42436);
        C5563 c5563 = this.f49894;
        AbstractC22044 abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strM36601);
        if (m36609(abstractC22044M36607)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC22044M36607.mo4281()) {
            str = "550 Can't DELE a directory\r\n";
        } else {
            str = !abstractC22044M36607.mo4296() ? "450 Error deleting file\r\n" : null;
        }
        if (str != null) {
            c5563.m16486(str);
            return;
        }
        c5563.m16486("250 File successfully deleted\r\n");
        int i = C20108.f64607;
        C20108.m46239(abstractC22044M36607.mo4294());
    }
}
