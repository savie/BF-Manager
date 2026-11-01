package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۡ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes.dex */
public final class C9183 extends AbstractC11462 implements InterfaceC0544 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f31249 = 0;

    /* JADX INFO: renamed from: ܶۗ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f31250;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12770 f31251;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f31252;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f31253;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11835 f31254;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2539 f31255;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC12233 f31256;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f31257;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f31258;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f31259;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0774 f31260;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f31261;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static native Object m23616(C7817 c7817, Object obj);

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo13031() {
        return false;
    }

    @Override // l.InterfaceC0544
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2552(C11545 c11545, View view, C11835 c11835, InterfaceC2661 interfaceC2661) {
        C20301.m45814(this, c11545, c11835, interfaceC2661);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo13036() {
        return true;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۫ */
    public final String mo13039() {
        return b.k;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13041(String str) {
        return false;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰۙ */
    public final boolean mo13042() {
        return true;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo23635() {
        return R.string.MT_Protector;
    }

    static {
        ApplicationC6132.m17119(IShizukuService.Stub.TRANSACTION_attachUserService);
        f31250 = new short[]{986, -30845, -30776, -30771, -30760, -30771};
        C9615.m24522(b.k);
        C22669.m50201("local", b.k, new C9411());
        C22669.m50201("zip", b.k, new C3059());
        C22669.m50201("tar", b.k, new C4948());
        C22669.m50201("archive", b.k, new C14122());
        C22669.m50201("compress", b.k, new C12005());
        C22669.m50201("payload", b.k, new C2831());
        C22669.m50201(b.k, "local", new C5654());
        C22669.m50201(b.k, b.k, new C20284(1));
        C22669.m50201(b.k, "zip", new C17171());
    }

    public C9183(int i, AbstractC12068 abstractC12068) {
        super(i, "/");
        this.f31254 = new C11835(b.k, null);
        this.f31260 = new C0774(this);
        this.f31251 = new C12770(this);
        this.f31257 = new C7065(this);
        this.f31258 = new C23294(this);
        this.f31261 = new C15533(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f31259 = abstractC12068.f40385;
        AbstractC12233 abstractC12233Mo4701 = abstractC12068.mo4701(m28617());
        this.f31256 = abstractC12233Mo4701;
        abstractC12233Mo4701.f40873 = false;
        this.f31255 = new C2539(abstractC12233Mo4701);
        mo28628(abstractC12233Mo4701.mo10278());
    }

    public C9183(C17367 c17367) {
        super(c17367);
        this.f31254 = new C11835(b.k, null);
        this.f31260 = new C0774(this);
        this.f31251 = new C12770(this);
        this.f31257 = new C7065(this);
        this.f31258 = new C23294(this);
        this.f31261 = new C15533(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f31259 = c17367.readInt();
        AbstractC12233 abstractC12233M30337 = AbstractC12233.m30337(c17367);
        this.f31256 = abstractC12233M30337;
        abstractC12233M30337.f40873 = false;
        this.f31255 = new C2539(abstractC12233M30337);
    }

    public C9183(int i, String str, int i2, AbstractC12233 abstractC12233) {
        super(i, str);
        this.f31254 = new C11835(b.k, null);
        this.f31260 = new C0774(this);
        this.f31251 = new C12770(this);
        this.f31257 = new C7065(this);
        this.f31258 = new C23294(this);
        this.f31261 = new C15533(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f31259 = i2;
        this.f31256 = abstractC12233;
        abstractC12233.f40873 = false;
        this.f31255 = new C2539(abstractC12233);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13032(C11018 c11018) {
        super.mo13032(c11018);
        c11018.writeInt(this.f31259);
        this.f31256.mo15075(c11018);
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final int m23639() {
        return this.f31259;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23626(String str, boolean z) {
        AbstractC12068 abstractC12068M15770 = C5717.m15770(this.f31259);
        if (abstractC12068M15770 != null) {
            C23186.m51183(str, new C5546(abstractC12068M15770, z));
        }
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12068 m23630() {
        return C5717.m15770(this.f31259);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܽ */
    public final String mo13043() {
        return this.f31256.f40874.mo4704() + super.mo13043();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9183 m23617(C9183 c9183, C11545 c11545, int i) {
        C9183 c9184 = new C9183(i, c9183.m28629(), c9183.f31259, (AbstractC12233) C14616.m35094(c9183.f31256.m24619(), false));
        c11545.m28783(c9184);
        return c9184;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֡ */
    public final AbstractC9677 mo13029() {
        return this.f31256;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֡ */
    public final AbstractC12233 mo13029() {
        return this.f31256;
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final void m23625() {
        this.f31256.getClass();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֫ */
    public final void mo13030() {
        this.f31256.mo10275();
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f31253;
        if (dialogInterfaceC19356 == null || !dialogInterfaceC19356.m44375()) {
            return;
        }
        this.f31253.dismiss();
        this.f31253 = null;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23629() {
        this.f31256.getClass();
        return true;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo23633(String str) {
        return str == null || str.equals(this.f31256.mo10276());
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۧ */
    public final List mo13037() {
        String strM28629 = m28629();
        boolean z = strM28629.length() > 1;
        ArrayList arrayListMo10263 = this.f31256.mo10263(strM28629, ApplicationC0716.f2988.getBoolean("show_hidden_file", true));
        if (z) {
            arrayListMo10263.add(0, C15404.f50208);
        }
        return arrayListMo10263;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC4674 mo23634(C21422 c21422) {
        C11545 c11545M47970 = c21422.m47970();
        C1607 c1607 = new C1607(android.R.string.cut, R.drawable.MT_Protector);
        if (c11545M47970.m28814("local")) {
            C14309 c14309 = new C14309(R.string.MT_Protector, R.drawable.MT_Protector);
            c14309.m12944();
            c14309.mo1961(c1607);
            return c14309;
        }
        if (c11545M47970.m28814(b.k)) {
            C4927 c4927 = new C4927(b.k);
            c4927.mo1961(c1607);
            return c4927;
        }
        C16547 c16547 = new C16547();
        c16547.mo1961(c1607);
        return c16547;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC4674 mo23638() {
        return new C7207();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC4674 mo23636() {
        return new C19247(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC4674 mo23637() {
        return new C10573();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC4674 mo13044() {
        return new DialogInterfaceOnDismissListenerC1399();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC4674 mo23631() {
        return new C22775(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23627(InterfaceC2557 interfaceC2557) {
        mo23626(interfaceC2557.getPath(), interfaceC2557.isDirectory());
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC13848 mo23624() {
        return this.f31255;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩹ */
    public final C6086 mo13045() {
        String strM28629 = m28629();
        AbstractC12233 abstractC12233 = this.f31256;
        String name = abstractC12233.f40874.getName();
        if (!abstractC12233.f40874.f40396) {
            strM28629 = abstractC12233.f40874.mo4705() + strM28629;
        }
        return new C6086(name, strM28629, abstractC12233.f40874.getIcon());
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23628(C11545 c11545, String str, boolean z) {
        if (str.contains("/")) {
            C15829.m37611(R.string.MT_Protector);
        } else {
            new C22588(this, c11545, C6730.m18162(m28629(), str), z, str).m10243();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13034(C11545 c11545, C11545 c11546) {
        c11545.m28775(b.k);
        AbstractC12068 abstractC12068M15770 = C5717.m15770(this.f31259);
        if (abstractC12068M15770 == null) {
            C15829.m37618(R.string.MT_Protector);
            return;
        }
        if (!C8765.m22787(c11546.m28817(), abstractC12068M15770)) {
            C6936 c6936M28807 = c11545.m28807();
            try {
                c6936M28807.m18647();
                C14638 c14638M18621 = c6936M28807.m18621();
                boolean z = false;
                for (int i = 0; i < c14638M18621.size(); i++) {
                    if (C8765.m22787((AbstractC11462) c14638M18621.get(i), abstractC12068M15770)) {
                        c6936M28807.m18631(c11546, i, false);
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    c11546.m28781(new C23979(this, c11546), new RunnableC18517(0, c11545));
                    return;
                }
            } finally {
                c6936M28807.m18643();
            }
        }
        c11545.m28823();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۨ */
    public final void mo13038(C11545 c11545) {
        if (this.f31252) {
            return;
        }
        List<C23540> listM28631 = m28631();
        if (listM28631.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C23540 c23540 : listM28631) {
            if (c23540.m51886()) {
                arrayList.add(c23540);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c11545.m28824().m134();
        m23620(c11545, arrayList, arrayList.size() == 1 ? C16737.m39264(R.string.MT_Protector, ((C23540) arrayList.get(0)).m51883()) : C16737.m39288(R.string.MT_Protector) + "\n" + C6851.m18456(arrayList, "\n"), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23620(final C11545 c11545, final ArrayList arrayList, String str, boolean z) {
        this.f31252 = true;
        View viewM30995 = c11545.m28824().m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(str);
        final RadioButton radioButton = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        RadioButton radioButton2 = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM30995.findViewById(R.id.radioButton3);
        final RadioButton radioButton4 = (RadioButton) viewM30995.findViewById(R.id.radioButton4);
        if (z) {
            radioButton4.setVisibility(0);
        }
        radioButton.setChecked(true);
        ViewOnClickListenerC15057 viewOnClickListenerC15057 = new ViewOnClickListenerC15057(radioButton, radioButton2, radioButton3, radioButton4, 1);
        radioButton.setOnClickListener(viewOnClickListenerC15057);
        radioButton2.setOnClickListener(viewOnClickListenerC15057);
        radioButton3.setOnClickListener(viewOnClickListenerC15057);
        radioButton4.setOnClickListener(viewOnClickListenerC15057);
        C8067 c8067BuildDialog = c11545.m28824().buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21265(false);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫ۜ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C9183.m23618(this.f6587, c11545, radioButton, arrayList, radioButton3, radioButton4);
            }
        });
        this.f31253 = c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23618(C9183 c9183, C11545 c11545, RadioButton radioButton, ArrayList arrayList, RadioButton radioButton2, RadioButton radioButton3) {
        AbstractC20745 abstractC20745M51884 = null;
        c9183.f31253 = null;
        if (c11545.m28817() != c9183) {
            return;
        }
        if (radioButton.isChecked()) {
            new C4242(c9183, c11545, (C4245) c11545.m28824().getLifecycle(), arrayList, c9183.f31256).m10243();
            return;
        }
        if (radioButton2.isChecked()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C23540) it.next()).m51889();
            }
        } else if (radioButton3.isChecked()) {
            Iterator it2 = arrayList.iterator();
            long jM51887 = 0;
            while (it2.hasNext()) {
                C23540 c23540 = (C23540) it2.next();
                c23540.m51889();
                if (abstractC20745M51884 == null || c23540.m51887() > jM51887) {
                    abstractC20745M51884 = c23540.m51884();
                    jM51887 = c23540.m51887();
                }
            }
            if (abstractC20745M51884 != null) {
                C11545 c11545M28833 = c11545.m28833();
                c11545M28833.m28832();
                c11545M28833.m28763(abstractC20745M51884.getName());
                c11545M28833.m28812(abstractC20745M51884.m46737(), true);
            }
        }
        c9183.f31252 = false;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo23632() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f31253;
        if (dialogInterfaceC19356 == null || !dialogInterfaceC19356.m44375()) {
            return;
        }
        this.f31253.dismiss();
        this.f31253 = null;
    }

    @Override // l.InterfaceC0544
    /* JADX INFO: renamed from: ۙ */
    public final void mo2553(C11835 c11835) {
        this.f31254 = c11835;
    }

    @Override // l.InterfaceC0544
    /* JADX INFO: renamed from: ۙ */
    public final C11835 mo2551() {
        return this.f31254;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩻ */
    public final List mo13046() {
        return Arrays.asList(AbstractC11462.f38579, this.f31260, this.f31251, AbstractC11462.f38575, AbstractC11462.f38578, AbstractC11462.f38580, this.f31261, this.f31257, this.f31258, m28633(), AbstractC11462.m28613(), AbstractC11462.m28610(R.string.MT_Protector, false));
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23622() {
        return ApplicationC0716.f2988.getBoolean("show_hidden_file", true);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC20745 mo13040(InterfaceC2557 interfaceC2557) {
        AbstractC20745 abstractC20745M46690 = this.f38587.m46690(C16845.m39503(m28629())).m46690(interfaceC2557.getName());
        abstractC20745M46690.mo33978();
        return abstractC20745M46690;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13033(C11545 c11545, List list, Runnable runnable) {
        new C8477(this, c11545, (C4245) c11545.m28824().getLifecycle(), list, runnable).m10243();
    }
}
