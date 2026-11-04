package l;

/* JADX INFO: renamed from: l.ۘۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9PS */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3990 {
    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo3888();

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo3889(Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo3890(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3891(int i, int i2, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3892(int i, long j, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3893(int i, Object obj, Object obj2);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3894(Object obj, int i, AbstractC17084 abstractC17084);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3895(Object obj, InterfaceC18356 interfaceC18356);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo3896(InterfaceC12236 interfaceC12236);

    /* JADX INFO: renamed from: ۤ */
    public abstract int mo3897(Object obj);

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo3898(Object obj, Object obj2);

    /* JADX INFO: renamed from: ܳ */
    public abstract Object mo3899(Object obj);

    /* JADX INFO: renamed from: ᩴ */
    public abstract void mo3900(Object obj);

    /* JADX INFO: renamed from: ᩷ */
    public abstract Object mo3901(Object obj);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo3902(int i, long j, Object obj);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo3903(Object obj, Object obj2);

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo3904(Object obj, InterfaceC18356 interfaceC18356);

    /* JADX INFO: renamed from: ᩸ */
    public abstract int mo3905(Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12908(Object obj, InterfaceC12236 interfaceC12236) throws C20463 {
        int tag = interfaceC12236.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            mo3902(i, interfaceC12236.mo30544(), obj);
            return true;
        }
        if (i2 == 1) {
            mo3892(i, interfaceC12236.mo30532(), obj);
            return true;
        }
        if (i2 == 2) {
            mo3894(obj, i, interfaceC12236.mo30537());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                mo3891(i, interfaceC12236.mo30568(), obj);
                return true;
            }
            throw C20463.m46968();
        }
        Object objMo3888 = mo3888();
        int i3 = 4 | (i << 3);
        while (interfaceC12236.mo30549() != Integer.MAX_VALUE && m12908(objMo3888, interfaceC12236)) {
        }
        if (i3 != interfaceC12236.getTag()) {
            throw C20463.m46969();
        }
        mo3893(i, obj, mo3899(objMo3888));
        return true;
    }
}
