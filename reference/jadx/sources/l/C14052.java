package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.۬ᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14052 extends AbstractC7364 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f44502;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9577 f44503;

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۟ */
    public final String mo10164() {
        return "compress";
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۠ */
    public final void mo10165() {
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo10177(String str) {
        return true;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ۙ */
    public final boolean mo10178() {
        return true;
    }

    static {
        C1398.m5108("compress");
        C19540.m45072("compress", "local", new C2866());
    }

    public C14052(int i, String str) throws C3090 {
        super(i, "/");
        C9577 c9577 = new C9577(str);
        this.f44503 = c9577;
        this.f44502 = c9577.m25012().getName();
        m20217(str);
        try {
            mo20214(false);
        } catch (IOException e) {
            C3090 c3090 = new C3090(C21576.m49088(R.string.MT_Protector));
            c3090.initCause((Throwable) e);
            throw c3090;
        }
    }

    public C14052(C20348 c20348) {
        super(c20348);
        C9577 c9577 = new C9577(c20348.m46758());
        this.f44503 = c9577;
        this.f44502 = c9577.m25012().getName();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10161(C6178 c6178) {
        super.mo10161(c6178);
        this.f44503.mo20835(c6178);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֡ */
    public final String mo10159() {
        return this.f44502 + super.mo10159();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC7629 mo10174() {
        return this.f44503;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֨ */
    public final List mo10160() {
        C9577 c9577 = this.f44503;
        if (c9577.m25013() == null) {
            mo20214(false);
        }
        ArrayList arrayListMo20830 = c9577.mo20830(m20218(), true);
        arrayListMo20830.add(0, C13352.f42573);
        return arrayListMo20830;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC9843 mo10173() {
        return new C8087(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܳ */
    public final C21535 mo10171() {
        return new C21535(this.f44502, this.f44503.m25014(), C20613.f66099);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo10170() {
        return this.f44503.m25011();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo10167() {
        return this.f44503.m25015();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10163(C8614 c8614, C8614 c8615) {
        c8615.m23230(this.f44502);
        c8615.m23226(this.f44503.m25012().m49881(), true);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۤ */
    public final void mo10168(C8614 c8614) {
        m20199(c8614);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC22044 mo10176(InterfaceC2386 interfaceC2386) {
        AbstractC22044 abstractC22044M49876 = C14584.m35193(this.f24222.mo4294(), C1112.m4125(m20218())).m49876(interfaceC2386.getName());
        abstractC22044M49876.mo4283();
        return abstractC22044M49876;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10162(C8614 c8614, List list, Runnable runnable) {
        new C7341(this, c8614, list, runnable).m8197();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final String m34220() {
        return this.f44503.m25014();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۡ */
    public final List mo10166() {
        return Arrays.asList(AbstractC7364.f24216, AbstractC7364.f24209, AbstractC7364.f24214, new C23729(), AbstractC7364.f24215, AbstractC7364.m20186(), AbstractC7364.m20183(R.string.MT_Protector, true));
    }
}
