package l;

/* JADX INFO: renamed from: l.ۧۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10766 implements InterfaceC7506 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5826 f36716 = new C5826(null);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f36717;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo2276(InterfaceC12260 interfaceC12260, boolean z, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C12926 c12926, C10391 c10391);

    public AbstractC10766(C20145 c20145) {
        this.f36717 = c20145;
    }

    @Override // l.InterfaceC7506
    /* JADX INFO: renamed from: ۙ */
    public void mo20004(C4603 c4603, C12926 c12926, C21825 c21825, C21825 c21826, C10391 c10391) {
        Object obj;
        boolean zM29179 = c12926.f42957.m29179();
        AbstractC8774 abstractC8774 = ((C22990) c4603.f16299).f74721;
        if (abstractC8774 == null) {
            abstractC8774 = c4603.f16296;
        }
        AbstractC8774 abstractC8775 = abstractC8774;
        C21825 c21825M9445 = C3128.m9445(abstractC8775);
        C19524 c19524 = c12926.f42956;
        InterfaceC12260 interfaceC12260 = null;
        AbstractC16579 abstractC16579 = zM29179 ? (AbstractC16579) c21826.last() : null;
        if (abstractC16579 == null && c21825.m48596() != c21826.m48596()) {
            m27068(abstractC8775, EnumC15974.ARITY_MISMATCH, c19524, new Object[0]);
            throw null;
        }
        C21825 c21827 = c21825;
        C21825 c21828 = c21826;
        C21825 c21829 = c21825M9445;
        while (c21827.m48595() && (obj = c21828.f70876) != abstractC16579) {
            InterfaceC12260 interfaceC12261 = c21829 != null ? (InterfaceC12260) c21829.f70876 : interfaceC12260;
            C21825 c218210 = c21829;
            mo2276(interfaceC12261, false, (AbstractC16579) c21827.f70876, (AbstractC16579) obj, c12926, c10391);
            c21827 = c21827.f70877;
            c21828 = c21828.f70877;
            c21829 = c218210 != null ? c218210.f70877 : c218210;
            interfaceC12260 = null;
        }
        C21825 c218211 = c21829;
        if (c21828.f70876 != abstractC16579) {
            m27068(abstractC8775, EnumC15974.ARITY_MISMATCH, c19524, new Object[0]);
            throw null;
        }
        if (zM29179) {
            AbstractC16579 abstractC16579M52416 = this.f36717.f65444.m52416(abstractC16579);
            while (c21827.m48595()) {
                mo2276(c218211 != null ? (InterfaceC12260) c218211.f70876 : null, true, (AbstractC16579) c21827.f70876, abstractC16579M52416, c12926, c10391);
                c21827 = c21827.f70877;
                if (c218211 != null) {
                    c218211 = c218211.f70877;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27068(InterfaceC12260 interfaceC12260, EnumC15974 enumC15974, C19524 c19524, Object... objArr) {
        Object[] objArr2;
        C20145 c20145 = this.f36717;
        C13174 c13174 = c20145.f65419;
        C20414 c20414 = c20145.f65441;
        boolean z = c19524 != c13174.f43861;
        if (!z || enumC15974.f51747.equals(enumC15974.f51746)) {
            objArr2 = objArr;
        } else {
            Object[] objArr3 = new Object[objArr.length + 1];
            System.arraycopy(objArr, 0, objArr3, 1, objArr.length);
            objArr3[0] = c19524.f62771;
            objArr2 = objArr3;
        }
        String str = z ? enumC15974.f51747 : enumC15974.f51746;
        if (z) {
            C13174 c13175 = c20145.f65419;
            C11948 c11948M51912 = c20145.f65420.m51912(EnumC17198.FRAGMENT, c20414.m48186(), interfaceC12260, str, objArr2);
            c13175.getClass();
            throw C13174.m32568(c11948M51912);
        }
        C11948 c11948M51913 = c20145.f65420.m51912(EnumC17198.FRAGMENT, c20414.m48186(), interfaceC12260, str, objArr2);
        C5826 c5826 = this.f36716;
        c5826.f5181 = c11948M51913;
        throw c5826;
    }

    @Override // l.InterfaceC7506
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC7506 mo2275(C21825 c21825) {
        return this.f36717.f65417;
    }
}
