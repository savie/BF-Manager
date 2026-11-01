package l;

/* JADX INFO: renamed from: l.ۙ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: KALN */
/* JADX INFO: loaded from: classes3.dex */
public final class C4909 implements InterfaceC20950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2792[] f17207;

    public C4909(C2792... c2792Arr) {
        C13465.m32966(c2792Arr, "initializers");
        this.f17207 = c2792Arr;
    }

    @Override // l.InterfaceC20950
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8956 mo4842(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // l.InterfaceC20950
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC8956 mo4843(Class cls, C11966 c11966) {
        AbstractC8956 abstractC8956 = null;
        for (C2792 c2792 : this.f17207) {
            if (C13465.m32965(c2792.m8482(), cls)) {
                Object objInvoke = c2792.m8483().invoke(c11966);
                abstractC8956 = objInvoke instanceof AbstractC8956 ? (AbstractC8956) objInvoke : null;
            }
        }
        if (abstractC8956 != null) {
            return abstractC8956;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
