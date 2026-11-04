package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78I */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19600 implements InterfaceC9600 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63179;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63180;

    public /* synthetic */ C19600(Object obj, Object obj2) {
        this.f63179 = obj;
        this.f63180 = obj2;
    }

    @Override // l.InterfaceC9600
    /* JADX INFO: renamed from: ۙ */
    public void mo1839(final C14406 c14406) {
        final C8614 c8614 = (C8614) this.f63179;
        final C12915 c12915 = (C12915) this.f63180;
        c14406.m34838();
        c8614.m23213().m20201(c8614, c8614.m23235(), new InterfaceC9600() { // from class: l.᩷۟ܳ
            @Override // l.InterfaceC9600
            /* JADX INFO: renamed from: ۙ */
            public final void mo1839(C14406 c14407) {
                String name;
                String name2;
                c14407.m34838();
                C14406 c14408 = c14406;
                AbstractC22044 abstractC22044M34845 = c14408.m34845();
                AbstractC22044 abstractC22044M34846 = c14407.m34845();
                C12915 c12916 = c12915;
                boolean zM23195 = c12916.m31983().m23195();
                if (abstractC22044M34845.getName().equals(abstractC22044M34846.getName())) {
                    int i = R.string.MT_Protector;
                    name = C21576.m49059(zM23195 ? R.string.MT_Protector : R.string.MT_Protector, abstractC22044M34845.getName());
                    if (!zM23195) {
                        i = R.string.MT_Protector;
                    }
                    name2 = C21576.m49059(i, abstractC22044M34846.getName());
                } else {
                    name = abstractC22044M34845.getName();
                    name2 = abstractC22044M34846.getName();
                }
                C9170 c9170 = new C9170(c14408.m34845(), c14407.m34845(), name, name2, c12916.m31987(), c8614.m23213());
                if (!zM23195) {
                    c9170.m24304();
                }
                C1504.m5358(c9170, c12916.m31983());
            }
        });
    }
}
