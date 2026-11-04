package l;

import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.᩵ᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes5.dex */
public final class C20766 extends AbstractC7364 implements InterfaceC0454 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C22829 f66518;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C0629 f66519;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f66520;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17411 f66521;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17036 f66522;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16665 f66523;

    @Override // l.InterfaceC0454
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2271(C8614 c8614, View view, C22829 c22829, InterfaceC19845 interfaceC19845) {
        C18353.m42811(this, c8614, c22829, interfaceC19845);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m47476(IInArchive iInArchive) {
        this.f66522.m40145(iInArchive);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۟ */
    public final String mo10164() {
        return "archive";
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final synchronized IInArchive m47477() {
        return this.f66522.m40144();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ۙ */
    public final boolean mo10178() {
        return true;
    }

    static {
        C1398.m5108("archive");
        C19540.m45072("archive", "local", new C17782(0));
    }

    public C20766(int i, IInArchive iInArchive, String str, ArrayList arrayList) throws C3090 {
        super(i, "/");
        this.f66518 = new C22829("archive", null);
        this.f66523 = new C16665(this);
        this.f66521 = new C17411(this);
        C17036 c17036 = new C17036(str, arrayList);
        this.f66522 = c17036;
        this.f66520 = c17036.m40141().getName();
        m20217(str);
        try {
            c17036.m40136(iInArchive);
            if (c17036.mo20841()) {
                this.f66519 = new C0629(c17036);
            }
        } catch (IOException e) {
            C3090 c3090 = new C3090(C21576.m49088(R.string.MT_Protector));
            c3090.initCause((Throwable) e);
            throw c3090;
        }
    }

    public C20766(C20348 c20348) {
        super(c20348);
        this.f66518 = new C22829("archive", null);
        this.f66523 = new C16665(this);
        this.f66521 = new C17411(this);
        C17036 c17036M40131 = C17036.m40131(c20348);
        this.f66522 = c17036M40131;
        this.f66520 = c17036M40131.m40141().getName();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10161(C6178 c6178) {
        super.mo10161(c6178);
        this.f66522.mo20835(c6178);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47475(AbstractC22044 abstractC22044) {
        this.f66522.m40135(abstractC22044);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֡ */
    public final String mo10159() {
        return this.f66520 + super.mo10159();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC0895 mo10169() {
        if (this.f66522.mo20841()) {
            return this.f66519;
        }
        return C19362.m44776();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC7629 mo10174() {
        return this.f66522;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final void mo20214(boolean z) {
        C17036 c17036 = this.f66522;
        c17036.mo20837(z);
        if (c17036.mo20841()) {
            C0629 c0629 = this.f66519;
            if (c0629 != null) {
                c0629.m2787();
            }
            this.f66519 = new C0629(c17036);
        }
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֨ */
    public final List mo10160() {
        C17036 c17036 = this.f66522;
        if (c17036.m40142() == null) {
            mo20214(false);
        }
        ArrayList arrayListMo20830 = c17036.mo20830(m20218(), true);
        arrayListMo20830.add(0, C13352.f42573);
        return arrayListMo20830;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC9843 mo10173() {
        return new C12561(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܳ */
    public final C21535 mo10171() {
        return new C21535(this.f66520, this.f66522.m40138(), C20613.f66099);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo10170() {
        return this.f66522.m40133();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo10167() {
        return this.f66522.m40143();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10163(C8614 c8614, C8614 c8615) {
        c8615.m23230(this.f66520);
        c8615.m23226(this.f66522.m40141().m49881(), true);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo10177(String str) {
        C1997 entry = this.f66522.getEntry(str.substring(1));
        return (entry == null || entry.m6837()) ? false : true;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۤ */
    public final void mo10168(C8614 c8614) {
        m20199(c8614);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۠ */
    public final void mo10165() {
        C0629 c0629 = this.f66519;
        if (c0629 != null) {
            c0629.m2787();
        }
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final String m47478() {
        return this.f66522.m40138();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۡ */
    public final List mo10166() {
        return Arrays.asList(AbstractC7364.f24216, this.f66523, this.f66521, AbstractC7364.f24209, AbstractC7364.f24214, new C23729(), AbstractC7364.f24215, m20205(), AbstractC7364.m20186(), AbstractC7364.m20183(R.string.MT_Protector, true));
    }

    @Override // l.InterfaceC0454
    /* JADX INFO: renamed from: ۙ */
    public final void mo2272(C22829 c22829) {
        this.f66518 = c22829;
    }

    @Override // l.InterfaceC0454
    /* JADX INFO: renamed from: ۙ */
    public final C22829 mo2270() {
        return this.f66518;
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
        new C3612(this, c8614, list, runnable).m8197();
    }
}
