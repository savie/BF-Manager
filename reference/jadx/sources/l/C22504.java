package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8985 */
/* JADX INFO: loaded from: classes.dex */
public final class C22504 extends AbstractC11462 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11026 f73466;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AbstractC11026 f73467;

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֫ */
    public final void mo13030() {
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo13031() {
        return true;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13034(C11545 c11545, C11545 c11546) {
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo13036() {
        return true;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۨ */
    public final void mo13038(C11545 c11545) {
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۫ */
    public final String mo13039() {
        return "trash";
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13041(String str) {
        return false;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰۙ */
    public final boolean mo13042() {
        return false;
    }

    static {
        C9615.m24522("trash");
        C22669.m50201("trash", "local", new C1917());
        f73467 = new C9680(R.string.MT_Protector, R.drawable.MT_Protector);
        f73466 = new C5570(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    public C22504(C17367 c17367) {
        super(c17367);
    }

    public C22504(int i) {
        super(i, "/");
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۚ */
    public final void mo28628(String str) {
        super.mo28628(str);
        String strM28629 = m28629();
        if (strM28629.length() <= 1 || strM28629.indexOf(47, 1) != strM28629.length() - 1) {
            return;
        }
        super.mo28628("/");
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܽ */
    public final String mo13043() {
        String strM39288 = C16737.m39288(R.string.MT_Protector);
        C23791 c23791M35096 = C14619.m35096(m28629());
        if (c23791M35096 == null) {
            return strM39288.concat("/");
        }
        StringBuilder sbM23356 = C9023.m23356(strM39288);
        sbM23356.append(c23791M35096.m52326());
        return AbstractC11462.m28614(sbM23356.toString());
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֡ */
    public final AbstractC9677 mo13029() {
        return C14619.f47827;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۧ */
    public final List mo13037() {
        String strM28629 = m28629();
        ArrayList arrayListMo10263 = C14619.f47827.mo10263(strM28629, true);
        if (strM28629.length() > 1) {
            arrayListMo10263.add(0, C15404.f50208);
        }
        return arrayListMo10263;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC4674 mo23634(C21422 c21422) {
        C8268 c8268 = new C8268(R.string.MT_Protector, R.drawable.MT_Protector);
        c8268.m12944();
        return c8268;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC4674 mo23636() {
        return new C18145(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC4674 mo13044() {
        return new DialogInterfaceOnDismissListenerC16735();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC4674 mo23637() {
        return new C8974(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۠ */
    public final AbstractC4674 mo28630() {
        return C10903.m27335();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC4674 mo28641() {
        return C12314.m30573();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo28624(C11545 c11545, InterfaceC2557 interfaceC2557) {
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC13848 mo23624() {
        return C17440.f55541;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final String mo28635(C11545 c11545) {
        C16137 c16137M17155;
        if (m28629().length() > 1) {
            return null;
        }
        boolean zM28802 = c11545.m28802();
        long size = 0;
        for (InterfaceC2557 interfaceC2557 : c11545.m28829()) {
            if (!zM28802 || interfaceC2557.isChecked()) {
                if ((interfaceC2557 instanceof C6151) && (c16137M17155 = ((C6151) interfaceC2557).m17155()) != null) {
                    size += c16137M17155.size();
                }
            }
        }
        return C16737.m39288(R.string.MT_Protector) + ": " + C1791.m5863(size);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩹ */
    public final C6086 mo13045() {
        C23791 c23791M35096 = C14619.m35096(m28629());
        return new C6086(C16737.m39288(R.string.MT_Protector), c23791M35096 == null ? "/" : c23791M35096.m52326(), C0690.f2933);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo28636() {
        return m28629().length() > 1;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩻ */
    public final List mo13046() {
        return Arrays.asList(AbstractC11462.f38579, AbstractC11462.f38575, AbstractC11462.f38578, f73467, f73466, AbstractC11462.m28610(R.string.MT_Protector, true));
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC20745 mo13040(InterfaceC2557 interfaceC2557) {
        return interfaceC2557.mo7989();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13033(C11545 c11545, List list, Runnable runnable) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10840 c10840 = (C10840) it.next();
            InterfaceC2557 interfaceC2557M27175 = c10840.m27175();
            if (interfaceC2557M27175 instanceof C6151) {
                c10840.m27173(((C6151) interfaceC2557M27175).mo7989());
            }
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            c11545.m28824().m31002(th, (DialogInterface.OnDismissListener) null);
        }
    }
}
