package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13810 extends AbstractC11462 implements InterfaceC0544 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final HashMap f45580 = new HashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f45581;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C8289 f45582;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f45583;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f45584;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f45585;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12770 f45586;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11835 f45587;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0774 f45588;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f45589;

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۫ */
    public final String mo13039() {
        return "zip";
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰۙ */
    public final boolean mo13042() {
        return true;
    }

    static {
        C9615.m24522("zip");
        C22669.m50201("zip", "local", new C20284(0));
        C22669.m50201("zip", "zip", new C0527());
        C22669.m50201("local", "zip", new C16756());
    }

    public C13810(int i, String str) throws IOException {
        super(i, "/");
        this.f45587 = new C11835("zip", null);
        this.f45588 = new C0774(this);
        this.f45581 = new C1938(this);
        this.f45586 = new C12770(this);
        this.f45585 = new C4636(this);
        C8289 c8289 = new C8289(str);
        this.f45582 = c8289;
        String str2 = (String) f45580.get(str);
        if (str2 != null && !str2.isEmpty()) {
            c8289.m21718(Charset.forName(str2));
        }
        this.f45589 = c8289.m21723().getName();
        m28616(str);
        try {
            mo23741(false);
        } catch (IOException e) {
            if (!(e instanceof FileNotFoundException)) {
                C8142 c8142 = new C8142(C16737.m39288(R.string.MT_Protector));
                c8142.initCause((Throwable) e);
                throw c8142;
            }
            throw e;
        }
    }

    public C13810(C17367 c17367) {
        super(c17367);
        this.f45587 = new C11835("zip", null);
        this.f45588 = new C0774(this);
        this.f45581 = new C1938(this);
        this.f45586 = new C12770(this);
        this.f45585 = new C4636(this);
        C8289 c8289M21708 = C8289.m21708(c17367);
        this.f45582 = c8289M21708;
        this.f45589 = c8289M21708.m21723().getName();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13032(C11018 c11018) {
        super.mo13032(c11018);
        this.f45582.mo15075(c11018);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܽ */
    public final String mo13043() {
        return this.f45589 + super.mo13043();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֡ */
    public final C8289 mo13029() {
        return this.f45582;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֡ */
    public final AbstractC9677 mo13029() {
        return this.f45582;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۧ */
    public final List mo13037() {
        C8289 c8289 = this.f45582;
        if (c8289.m21712() == null) {
            mo23741(false);
        }
        ArrayList arrayListMo10263 = c8289.mo10263(m28629(), true);
        arrayListMo10263.add(0, C15404.f50208);
        return arrayListMo10263;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC4674 mo23637() {
        return new C0756(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC4674 mo23636() {
        return new C23915(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC4674 mo13044() {
        return new C12752(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo28626(C21422 c21422, ArrayList arrayList) {
        if (c21422.m47977()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (C9512.m24345(c21422)) {
            arrayList2.add(new C9512());
            arrayList2.add(new C17272());
        }
        C22501 c22501 = this.f38585;
        if (c22501 != null) {
            if (c22501.m50018("arsc")) {
                arrayList2.add(new C15446());
            } else if (this.f38585.m50018("dex")) {
                arrayList2.add(new C8390());
            } else if (this.f38585.m50018("folder")) {
                arrayList2.add(new C11212());
            } else if (this.f38585.m50018("zip") || this.f38585.m50017()) {
                arrayList2.add(new C15136());
            } else if (this.f38585.m50018("apk")) {
                arrayList2.add(new C8390());
                arrayList2.add(new C15136(R.string.MT_Protector, R.drawable.MT_Protector));
                arrayList2.add(new C15446());
                arrayList2.add(new C6978());
            } else {
                arrayList2.add(new C11608());
            }
            if (!this.f38585.m50018("folder")) {
                C22501 c22502 = this.f38585;
                if (c22502.f73455 == c22502.f73452) {
                    arrayList2.add(new C3449());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int iM28609 = AbstractC11462.m28609();
        if (arrayList2.size() % 2 != 0 && !C21485.m48102().mo1960(c21422)) {
            arrayList.set(iM28609, (AbstractC4674) arrayList2.remove(0));
        }
        arrayList.addAll(arrayList2);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC13848 mo23624() {
        return C16985.m39772();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩹ */
    public final C6086 mo13045() {
        C8289 c8289 = this.f45582;
        return new C6086(this.f45589, c8289.m21715(), c8289.m21719() ? C0690.f2908 : C0690.f2894);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo13031() {
        return this.f45582.m21720();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo13036() {
        return this.f45582.m21711();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13034(C11545 c11545, C11545 c11546) {
        c11546.m28763(this.f45589);
        c11546.m28812(this.f45582.m21723().m46737(), true);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13041(String str) {
        C12107 entry = this.f45582.getEntry(str.substring(1));
        return (entry == null || entry.isDirectory()) ? false : true;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۨ */
    public final void mo13038(C11545 c11545) {
        if (this.f45583) {
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
        m33611(c11545, arrayList, arrayList.size() == 1 ? C16737.m39264(R.string.MT_Protector, ((C23540) arrayList.get(0)).m51883()) : C16737.m39288(R.string.MT_Protector) + "\n" + C6851.m18456(arrayList, "\n"), this.f45582.m21721());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33611(final C11545 c11545, final ArrayList arrayList, String str, final String str2) {
        this.f45583 = true;
        C8067 c8067BuildDialog = c11545.m28824().buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(str);
        c8067BuildDialog.m21265(false);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۫ܽ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C13810.m33615(this.f41891, c11545, arrayList, str2);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3077(2, this, arrayList));
        if (this.f45582.m21719()) {
            c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
            this.f45584 = dialogInterfaceC19356M21269;
            C11005.m27756(c11545, dialogInterfaceC19356M21269, str2);
            return;
        }
        this.f45584 = c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33615(C13810 c13810, C11545 c11545, ArrayList arrayList, String str) {
        c13810.f45584 = null;
        if (c11545.m28817() != c13810) {
            return;
        }
        new C6172(c13810, c11545, c13810, arrayList, c13810.f45582.m21719(), str, c11545, arrayList, str).m38046();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33612(C13810 c13810, ArrayList arrayList) {
        c13810.f45584 = null;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C23540) it.next()).m51889();
        }
        c13810.f45583 = false;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC20745 mo13040(InterfaceC2557 interfaceC2557) {
        AbstractC20745 abstractC20745M46690 = this.f38587.m46690(C16845.m39503(m28629()) + "/" + interfaceC2557.getName());
        abstractC20745M46690.mo33978();
        return abstractC20745M46690;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13033(C11545 c11545, List list, Runnable runnable) {
        new C14640(this, c11545, list, runnable).m10243();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۢ */
    public final void mo23632() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f45584;
        if (dialogInterfaceC19356 == null || !dialogInterfaceC19356.m44375()) {
            return;
        }
        this.f45584.dismiss();
        this.f45584 = null;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֫ */
    public final void mo13030() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f45584;
        if (dialogInterfaceC19356 == null || !dialogInterfaceC19356.m44375()) {
            return;
        }
        this.f45584.dismiss();
        this.f45584 = null;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final String m33624() {
        return this.f45582.m21715();
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m33620() {
        return this.f45582.m21725();
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33621() {
        return this.f45582.m21724();
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33623() {
        return this.f45582.m21719();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final String m33622() {
        return this.f45582.m21722();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩻ */
    public final List mo13046() {
        return Arrays.asList(AbstractC11462.f38579, this.f45588, this.f45581, this.f45586, AbstractC11462.f38575, AbstractC11462.f38578, new C7374(), AbstractC11462.f38580, this.f45585, m28633(), AbstractC11462.m28613(), AbstractC11462.m28610(R.string.MT_Protector, true));
    }

    @Override // l.InterfaceC0544
    /* JADX INFO: renamed from: ۙ */
    public final void mo2553(C11835 c11835) {
        this.f45587 = c11835;
    }

    @Override // l.InterfaceC0544
    /* JADX INFO: renamed from: ۙ */
    public final C11835 mo2551() {
        return this.f45587;
    }

    @Override // l.InterfaceC0544
    /* JADX INFO: renamed from: ۙ */
    public final void mo2552(final C11545 c11545, View view, final C11835 c11835, final InterfaceC2661 interfaceC2661) {
        C16195 c16195 = new C16195(view.getContext(), view, 0);
        C12418 c12418M38298 = c16195.m38298();
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        C17356.m40381(c12418M38298, R.string.MT_Protector);
        c16195.m38292();
        c16195.m38296(new InterfaceC21133() { // from class: l.ܿܽ֨
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C13810.m33613(this.f55562, interfaceC2661, c11545, c11835, menuItem);
                return true;
            }
        });
        C0671.m3000(c16195).m6964();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33613(C13810 c13810, InterfaceC2661 interfaceC2661, C11545 c11545, C11835 c11835, MenuItem menuItem) {
        interfaceC2661.mo8191();
        if (menuItem.getItemId() == R.string.MT_Protector) {
            new C22418(c11545, c13810).m49733(c11835.f39735, new RunnableC14912(2, interfaceC2661));
            return;
        }
        new C9701(c13810, c11545, C5553.m15313(c13810.f45582.m21715(), new String[0]), (List) C9030.stream(c11835.f39735).map(new C4141(3)).collect(C1890.toList()), new RunnableC14912(2, interfaceC2661), c11545).m36963();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33614(C13810 c13810, C11545 c11545) {
        new C9701(c13810, c11545, C5553.m15313(c13810.f45582.m21715(), new String[0]), null, null, c11545).m36963();
    }
}
