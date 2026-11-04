package l;

import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3109 extends AbstractC7364 implements InterfaceC0454 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final HashMap f10069 = new HashMap();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10070 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f10071;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C22829 f10072;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f10073;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17411 f10074;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11312 f10075;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16665 f10076;

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String mo10164() {
        return "tar";
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo10178() {
        return true;
    }

    static {
        C1398.m5108("tar");
        C19540.m45072("tar", "local", new C24739());
    }

    public C3109(int i, String str, String str2) throws C3090 {
        super(i, "/");
        this.f10072 = new C22829("tar", null);
        this.f10076 = new C16665(this);
        this.f10074 = new C17411(this);
        this.f10073 = new C23247(this);
        C11312 c11312 = new C11312(str, str2);
        this.f10075 = c11312;
        String str3 = (String) f10069.get(str);
        if (str3 != null && !str3.isEmpty()) {
            c11312.m28597(str3);
        }
        this.f10071 = c11312.m28593().getName();
        m20217(str2);
        try {
            mo20214(false);
        } catch (IOException e) {
            C3090 c3090 = new C3090(C21576.m49088(R.string.MT_Protector));
            c3090.initCause((Throwable) e);
            throw c3090;
        }
    }

    public C3109(C20348 c20348) {
        super(c20348);
        this.f10072 = new C22829("tar", null);
        this.f10076 = new C16665(this);
        this.f10074 = new C17411(this);
        this.f10073 = new C23247(this);
        C11312 c11312M28585 = C11312.m28585(c20348);
        this.f10075 = c11312M28585;
        this.f10071 = c11312M28585.m28593().getName();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10161(C6178 c6178) {
        super.mo10161(c6178);
        this.f10075.mo20835(c6178);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String mo10159() {
        return this.f10071 + super.mo10159();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC7629 mo10174() {
        return this.f10075;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܿ */
    public final C11312 mo10174() {
        return this.f10075;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List mo10160() {
        C11312 c11312 = this.f10075;
        if (c11312.m28594() == null) {
            mo20214(false);
        }
        ArrayList arrayListMo20830 = c11312.mo20830(m20218(), true);
        arrayListMo20830.add(0, C13352.f42573);
        return arrayListMo20830;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC9843 mo10173() {
        return new C0322(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0895 mo10169() {
        return C9270.m24461();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21535 mo10171() {
        return new C21535(this.f10071, this.f10075.m28592(), C20613.f66099);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean mo10170() {
        return this.f10075.m28591();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean mo10167() {
        return this.f10075.m28589();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10163(C8614 c8614, C8614 c8615) {
        c8615.m23230(this.f10071);
        c8615.m23226(this.f10075.m28593().m49881(), true);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo10177(String str) {
        C7450 entry = this.f10075.getEntry(str.substring(1));
        return (entry == null || entry.m20450()) ? false : true;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo10168(C8614 c8614) {
        m20199(c8614);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 mo10176(InterfaceC2386 interfaceC2386) {
        AbstractC22044 abstractC22044M49876 = C14584.m35193(this.f24222.mo4294(), C1112.m4125(m20218())).m49876(interfaceC2386.getName());
        abstractC22044M49876.mo4283();
        return abstractC22044M49876;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10162(C8614 c8614, List list, Runnable runnable) {
        new C17279(this, c8614, list, runnable).m8197();
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final String m10172() {
        return this.f10075.m28588();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void mo10165() {
        C11312 c11312 = this.f10075;
        if (c11312.m28592().equals(c11312.m28588()) || !c11312.m28588().endsWith("._tar")) {
            return;
        }
        c11312.m28595().mo4296();
        C6331.m18055();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final String m10175() {
        return this.f10075.m28592();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List mo10166() {
        return Arrays.asList(AbstractC7364.f24216, this.f10076, this.f10074, AbstractC7364.f24209, AbstractC7364.f24214, new C23729(), AbstractC7364.f24215, this.f10073, m20205(), AbstractC7364.m20186(), AbstractC7364.m20183(R.string.MT_Protector, true));
    }

    @Override // l.InterfaceC0454
    /* JADX INFO: renamed from: ۙ */
    public final void mo2272(C22829 c22829) {
        this.f10072 = c22829;
    }

    @Override // l.InterfaceC0454
    /* JADX INFO: renamed from: ۙ */
    public final C22829 mo2270() {
        return this.f10072;
    }

    @Override // l.InterfaceC0454
    /* JADX INFO: renamed from: ۙ */
    public final void mo2271(C8614 c8614, View view, C22829 c22829, InterfaceC19845 interfaceC19845) {
        new C13132(c8614, this).m32647(c22829.f73990, new RunnableC9263(2, interfaceC19845));
    }
}
