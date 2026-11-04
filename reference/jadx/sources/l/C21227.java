package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21227 extends AbstractC7364 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f67740 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12276 f67741;

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۟ */
    public final String mo10164() {
        return "payload";
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۠ */
    public final void mo10165() {
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo10177(String str) {
        return false;
    }

    static {
        C1398.m5108("payload");
        C19540.m45072("payload", "local", new C6311());
    }

    public C21227(String str, int i, long j, long j2) throws C3090 {
        super(i, "/");
        this.f67741 = new C12276(C14584.m35193(str, new String[0]), j, j2);
        m20217(str);
        try {
            mo20214(false);
        } catch (IOException e) {
            C3090 c3090 = new C3090(C21576.m49088(R.string.MT_Protector));
            c3090.initCause((Throwable) e);
            throw c3090;
        }
    }

    public C21227(int i, String str, String str2, int i2, C8547 c8547) {
        super(i, "/");
        C12276 c12276M30655 = C12276.m30655(i2, str, str2);
        this.f67741 = c12276M30655;
        c12276M30655.m30664(c8547);
    }

    public C21227(C20348 c20348) {
        super(c20348);
        this.f67741 = C12276.m30656(c20348);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10161(C6178 c6178) {
        super.mo10161(c6178);
        this.f67741.mo20835(c6178);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֡ */
    public final String mo10159() {
        return "payload.bin" + super.mo10159();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC7629 mo10174() {
        return this.f67741;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final Runnable mo20195(boolean z) {
        C8547 c8547M30663 = this.f67741.m30663(z);
        if (c8547M30663 == null) {
            return null;
        }
        return new RunnableC24211(c8547M30663);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֨ */
    public final List mo10160() {
        ArrayList arrayListMo20830 = this.f67741.mo20830(m20218(), true);
        arrayListMo20830.add(0, C13352.f42573);
        return arrayListMo20830;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9843 mo20196(C12915 c12915) {
        if (this.f67741.m30662() && c12915.m31974().m23228("local")) {
            return new C10301(true);
        }
        return C19540.m45071(c12915);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC9843 mo10173() {
        return new C1353(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۗ */
    public final AbstractC9843 mo20192() {
        return C18507.m43097();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC9843 mo20208() {
        return C4337.m13839();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo20200(C8614 c8614, InterfaceC2386 interfaceC2386) {
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܳ */
    public final C21535 mo10171() {
        return new C21535("payload.bin", this.f67741.m30660(), C20613.f66099);
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final String m48382() {
        return this.f67741.m30661();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo10170() {
        return this.f67741.m30657();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo10167() {
        return this.f67741.m30665();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ۙ */
    public final boolean mo10178() {
        return !this.f67741.m30662();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10163(C8614 c8614, C8614 c8615) {
        AbstractC22044 abstractC22044M30659 = this.f67741.m30659();
        if (abstractC22044M30659 != null) {
            c8615.m23230(abstractC22044M30659.getName());
            c8615.m23226(abstractC22044M30659.m49881(), true);
        }
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۤ */
    public final void mo10168(C8614 c8614) {
        m20199(c8614);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10162(C8614 c8614, List list, Runnable runnable) {
        new C14513(this, c8614, list, runnable).m8197();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC22044 mo10176(InterfaceC2386 interfaceC2386) {
        AbstractC22044 abstractC22044M49876 = this.f24222.m49876(C1112.m4125(m20218()) + "/" + interfaceC2386.getName());
        abstractC22044M49876.mo4283();
        return abstractC22044M49876;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۡ */
    public final List mo10166() {
        return Arrays.asList(AbstractC7364.f24216, AbstractC7364.f24209, AbstractC7364.f24214, AbstractC7364.f24215, AbstractC7364.m20186(), AbstractC7364.m20183(R.string.MT_Protector, true));
    }
}
