package l;

/* JADX INFO: renamed from: l.ۚۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: E9PS */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5297 {
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract int mo14673(Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo14674();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo14675(Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo14676(Object obj, Object obj2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo14677(int i, int i2, Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo14678(int i, long j, Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo14679(int i, Object obj, Object obj2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo14680(Object obj, int i, AbstractC23725 abstractC23725);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo14681(Object obj, InterfaceC12976 interfaceC12976);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo14683(InterfaceC13724 interfaceC13724);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public abstract void mo14684(Object obj);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract int mo14685(Object obj);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract void mo14686(Object obj, Object obj2);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract Object mo14687(Object obj);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void mo14688(int i, long j, Object obj);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void mo14689(Object obj, Object obj2);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void mo14690(Object obj, InterfaceC12976 interfaceC12976);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public abstract Object mo14691(Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14682(Object obj, InterfaceC13724 interfaceC13724) throws C4529 {
        int tag = interfaceC13724.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            mo14688(i, interfaceC13724.mo12298(), obj);
            return true;
        }
        if (i2 == 1) {
            mo14678(i, interfaceC13724.mo12286(), obj);
            return true;
        }
        if (i2 == 2) {
            mo14680(obj, i, interfaceC13724.mo12302());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                mo14677(i, interfaceC13724.mo12321(), obj);
                return true;
            }
            throw C4529.m12645();
        }
        Object objMo14674 = mo14674();
        int i3 = 4 | (i << 3);
        while (interfaceC13724.mo12311() != Integer.MAX_VALUE && m14682(objMo14674, interfaceC13724)) {
        }
        if (i3 != interfaceC13724.getTag()) {
            throw C4529.m12648();
        }
        mo14679(i, obj, mo14691(objMo14674));
        return true;
    }
}
