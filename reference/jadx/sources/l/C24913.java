package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 8985 */
/* JADX INFO: loaded from: classes.dex */
public final class C24913 extends AbstractC7364 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC18551 f80626;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AbstractC18551 f80627;

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10163(C8614 c8614, C8614 c8615) {
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۟ */
    public final String mo10164() {
        return "trash";
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۠ */
    public final void mo10165() {
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo10167() {
        return true;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۤ */
    public final void mo10168(C8614 c8614) {
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo10170() {
        return true;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo10177(String str) {
        return false;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ۙ */
    public final boolean mo10178() {
        return false;
    }

    static {
        C1398.m5108("trash");
        C19540.m45072("trash", "local", new C10740());
        f80627 = new C22675(R.string.MT_Protector, R.drawable.MT_Protector);
        f80626 = new C11486(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    public C24913(C20348 c20348) {
        super(c20348);
    }

    public C24913(int i) {
        super(i, "/");
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩴ */
    public final void mo20211(String str) {
        super.mo20211(str);
        String strM20218 = m20218();
        if (strM20218.length() <= 1 || strM20218.indexOf(47, 1) != strM20218.length() - 1) {
            return;
        }
        super.mo20211("/");
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֡ */
    public final String mo10159() {
        String strM49088 = C21576.m49088(R.string.MT_Protector);
        C4775 c4775M49624 = C21929.m49624(m20218());
        if (c4775M49624 == null) {
            return strM49088.concat("/");
        }
        StringBuilder sbM27333 = C10732.m27333(strM49088);
        sbM27333.append(c4775M49624.m14738());
        return AbstractC7364.m20188(sbM27333.toString());
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC7629 mo10174() {
        return C21929.f70802;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֨ */
    public final List mo10160() {
        String strM20218 = m20218();
        ArrayList arrayListMo20830 = C21929.f70802.mo20830(strM20218, true);
        if (strM20218.length() > 1) {
            arrayListMo20830.add(0, C13352.f42573);
        }
        return arrayListMo20830;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC9843 mo18808(C12915 c12915) {
        C3855 c3855 = new C3855(R.string.MT_Protector, R.drawable.MT_Protector);
        c3855.m25621();
        return c3855;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC9843 mo18805() {
        return new C6093(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC9843 mo10173() {
        return new DialogInterfaceOnDismissListenerC9074();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC9843 mo18809() {
        return new C21009(R.string.MT_Protector, R.drawable.MT_Protector);
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
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC0895 mo10169() {
        return C8329.f27318;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final String mo20213(C8614 c8614) {
        C22616 c22616M19056;
        if (m20218().length() > 1) {
            return null;
        }
        boolean zM23162 = c8614.m23162();
        long size = 0;
        for (InterfaceC2386 interfaceC2386 : c8614.m23215()) {
            if (!zM23162 || interfaceC2386.isChecked()) {
                if ((interfaceC2386 instanceof C6838) && (c22616M19056 = ((C6838) interfaceC2386).m19056()) != null) {
                    size += c22616M19056.size();
                }
            }
        }
        return C21576.m49088(R.string.MT_Protector) + ": " + C8311.m22390(size);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܳ */
    public final C21535 mo10171() {
        C4775 c4775M49624 = C21929.m49624(m20218());
        return new C21535(C21576.m49088(R.string.MT_Protector), c4775M49624 == null ? "/" : c4775M49624.m14738(), C20613.f66088);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo20215() {
        return m20218().length() > 1;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۡ */
    public final List mo10166() {
        return Arrays.asList(AbstractC7364.f24216, AbstractC7364.f24209, AbstractC7364.f24214, f80627, f80626, AbstractC7364.m20183(R.string.MT_Protector, true));
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC22044 mo10176(InterfaceC2386 interfaceC2386) {
        return interfaceC2386.mo8093();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10162(C8614 c8614, List list, Runnable runnable) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14406 c14406 = (C14406) it.next();
            InterfaceC2386 interfaceC2386M34841 = c14406.m34841();
            if (interfaceC2386M34841 instanceof C6838) {
                c14406.m34839(((C6838) interfaceC2386M34841).mo8093());
            }
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            c8614.m23233().m40401(th, (DialogInterface.OnDismissListener) null);
        }
    }
}
