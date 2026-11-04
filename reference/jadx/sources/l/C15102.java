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

/* JADX INFO: renamed from: l.ܳۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15102 extends AbstractC7364 implements InterfaceC0454 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final HashMap f49285 = new HashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17411 f49286;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f49287;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f49288;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f49289;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C24320 f49290;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f49291;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f49292;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C22829 f49293;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16665 f49294;

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۟ */
    public final String mo10164() {
        return "zip";
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ۙ */
    public final boolean mo10178() {
        return true;
    }

    static {
        C1398.m5108("zip");
        C19540.m45072("zip", "local", new C19098());
        C19540.m45072("zip", "zip", new C10147());
        C19540.m45072("local", "zip", new C1199());
    }

    public C15102(int i, String str) throws IOException {
        super(i, "/");
        this.f49293 = new C22829("zip", null);
        this.f49294 = new C16665(this);
        this.f49292 = new C21816(this);
        this.f49286 = new C17411(this);
        this.f49291 = new C19578(this);
        C24320 c24320 = new C24320(str);
        this.f49290 = c24320;
        String str2 = (String) f49285.get(str);
        if (str2 != null && !str2.isEmpty()) {
            c24320.m54373(Charset.forName(str2));
        }
        this.f49289 = c24320.m54371().getName();
        m20217(str);
        try {
            mo20214(false);
        } catch (IOException e) {
            if (!(e instanceof FileNotFoundException)) {
                C3090 c3090 = new C3090(C21576.m49088(R.string.MT_Protector));
                c3090.initCause((Throwable) e);
                throw c3090;
            }
            throw e;
        }
    }

    public C15102(C20348 c20348) {
        super(c20348);
        this.f49293 = new C22829("zip", null);
        this.f49294 = new C16665(this);
        this.f49292 = new C21816(this);
        this.f49286 = new C17411(this);
        this.f49291 = new C19578(this);
        C24320 c24320M54358 = C24320.m54358(c20348);
        this.f49290 = c24320M54358;
        this.f49289 = c24320M54358.m54371().getName();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10161(C6178 c6178) {
        super.mo10161(c6178);
        this.f49290.mo20835(c6178);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֡ */
    public final String mo10159() {
        return this.f49289 + super.mo10159();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC7629 mo10174() {
        return this.f49290;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܿ */
    public final C24320 mo10174() {
        return this.f49290;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֨ */
    public final List mo10160() {
        C24320 c24320 = this.f49290;
        if (c24320.m54370() == null) {
            mo20214(false);
        }
        ArrayList arrayListMo20830 = c24320.mo20830(m20218(), true);
        arrayListMo20830.add(0, C13352.f42573);
        return arrayListMo20830;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC9843 mo18809() {
        return new C17410(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC9843 mo18805() {
        return new C21886(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC9843 mo10173() {
        return new C15918(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo20202(C12915 c12915, ArrayList arrayList) {
        if (c12915.m31988()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (C13637.m33377(c12915)) {
            arrayList2.add(new C13637());
            arrayList2.add(new C18859());
        }
        C6774 c6774 = this.f24219;
        if (c6774 != null) {
            if (c6774.m18897("arsc")) {
                arrayList2.add(new C15195());
            } else if (this.f24219.m18897("dex")) {
                arrayList2.add(new C1772());
            } else if (this.f24219.m18897("folder")) {
                arrayList2.add(new C14449());
            } else if (this.f24219.m18897("zip") || this.f24219.m18896()) {
                arrayList2.add(new C5829());
            } else if (this.f24219.m18897("apk")) {
                arrayList2.add(new C5829(R.string.MT_Protector, R.drawable.MT_Protector));
                arrayList2.add(new C10720());
                arrayList2.add(new C15195());
                arrayList2.add(new C1772());
            } else {
                arrayList2.add(new C8483());
            }
            if (!this.f24219.m18897("folder")) {
                arrayList2.add(new C9974());
            }
            if (!this.f24219.m18897("folder")) {
                C6774 c6775 = this.f24219;
                if (c6775.f22590 == c6775.f22594) {
                    if (c6775.m18897("dex")) {
                        arrayList2.add(0, new C18925());
                    } else {
                        arrayList2.add(new C18925());
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int iM20190 = AbstractC7364.m20190();
        if (arrayList2.size() % 2 != 0 && !C2100.m7268().mo2481(c12915)) {
            arrayList.set(iM20190, (AbstractC9843) arrayList2.remove(0));
        }
        AbstractC7364.m20189(arrayList2);
        arrayList.addAll(arrayList2);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC0895 mo10169() {
        return C9205.m24360();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܳ */
    public final C21535 mo10171() {
        C24320 c24320 = this.f49290;
        return new C21535(this.f49289, c24320.m54361(), c24320.m54366() ? C20613.f66058 : C20613.f66099);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo10170() {
        return this.f49290.m54360();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo10167() {
        return this.f49290.m54369();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10163(C8614 c8614, C8614 c8615) {
        c8615.m23230(this.f49289);
        c8615.m23226(this.f49290.m54371().m49881(), true);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo10177(String str) {
        C8002 entry = this.f49290.getEntry(str.substring(1));
        return (entry == null || entry.isDirectory()) ? false : true;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۤ */
    public final void mo10168(C8614 c8614) {
        if (this.f49287) {
            return;
        }
        List<C21120> listM20206 = m20206();
        if (listM20206.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C21120 c21120 : listM20206) {
            if (c21120.m48219()) {
                arrayList.add(c21120);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c8614.m23233().m127();
        m36359(c8614, arrayList, arrayList.size() == 1 ? C21576.m49059(R.string.MT_Protector, ((C21120) arrayList.get(0)).m48221()) : C21576.m49088(R.string.MT_Protector) + "\n" + C24276.m54283(arrayList, "\n"), this.f49290.m54367());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m36359(final C8614 c8614, final ArrayList arrayList, String str, final String str2) {
        this.f49287 = true;
        C2361 c2361BuildDialog = c8614.m23233().buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(str);
        c2361BuildDialog.m8012(false);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡ۬۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C15102.m36362(this.f30512, c8614, arrayList, str2);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2690(this, arrayList, 0));
        if (this.f49290.m54366()) {
            c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
            this.f49288 = dialogInterfaceC8327M8016;
            C0938.m3745(c8614, dialogInterfaceC8327M8016, str2);
            return;
        }
        this.f49288 = c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36362(C15102 c15102, C8614 c8614, ArrayList arrayList, String str) {
        c15102.f49288 = null;
        if (c8614.m23213() != c15102) {
            return;
        }
        new C8656(c15102, c8614, c15102, arrayList, c15102.f49290.m54366(), str, c8614, arrayList, str).m21452();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36360(C15102 c15102, ArrayList arrayList) {
        c15102.f49288 = null;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C21120) it.next()).m48218();
        }
        c15102.f49287 = false;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC22044 mo10176(InterfaceC2386 interfaceC2386) {
        AbstractC22044 abstractC22044M49876 = this.f24222.m49876(C1112.m4125(m20218()) + "/" + interfaceC2386.getName());
        abstractC22044M49876.mo4283();
        return abstractC22044M49876;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10162(C8614 c8614, List list, Runnable runnable) {
        new C4662(this, c8614, list, runnable).m8197();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۜ */
    public final void mo18800() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f49288;
        if (dialogInterfaceC8327 == null || !dialogInterfaceC8327.m22434()) {
            return;
        }
        this.f49288.dismiss();
        this.f49288 = null;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۠ */
    public final void mo10165() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f49288;
        if (dialogInterfaceC8327 == null || !dialogInterfaceC8327.m22434()) {
            return;
        }
        this.f49288.dismiss();
        this.f49288 = null;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final String m36371() {
        return this.f49290.m54361();
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m36370() {
        return this.f49290.m54362();
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36368() {
        return this.f49290.m54372();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36369() {
        return this.f49290.m54366();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final String m36372() {
        return this.f49290.m54375();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۡ */
    public final List mo10166() {
        return Arrays.asList(AbstractC7364.f24216, this.f49294, this.f49292, this.f49286, AbstractC7364.f24209, AbstractC7364.f24214, new C23729(), AbstractC7364.f24215, this.f49291, m20205(), AbstractC7364.m20186(), AbstractC7364.m20183(R.string.MT_Protector, true));
    }

    @Override // l.InterfaceC0454
    /* JADX INFO: renamed from: ۙ */
    public final void mo2272(C22829 c22829) {
        this.f49293 = c22829;
    }

    @Override // l.InterfaceC0454
    /* JADX INFO: renamed from: ۙ */
    public final C22829 mo2270() {
        return this.f49293;
    }

    @Override // l.InterfaceC0454
    /* JADX INFO: renamed from: ۙ */
    public final void mo2271(C8614 c8614, View view, C22829 c22829, InterfaceC19845 interfaceC19845) {
        C18452 c18452 = new C18452(view.getContext(), view, 0);
        C9898 c9898M42995 = c18452.m42995();
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        C0950.m3783(c9898M42995, R.string.MT_Protector);
        c18452.m42997();
        c18452.m42994(new C22237(this, interfaceC19845, c8614, c22829));
        C19198.m44467(c18452).m36149();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36364(C15102 c15102, InterfaceC19845 interfaceC19845, C8614 c8614, C22829 c22829, MenuItem menuItem) {
        interfaceC19845.mo45705();
        if (menuItem.getItemId() == R.string.MT_Protector) {
            new C13132(c8614, c15102).m32647(c22829.f73990, new RunnableC9263(2, interfaceC19845));
            return;
        }
        new C10627(c15102, c8614, C14584.m35193(c15102.f49290.m54361(), new String[0]), (List) C1170.stream(c22829.f73990).map(new C9746(1)).collect(C2025.toList()), new RunnableC9263(2, interfaceC19845), c8614).m46871();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36361(C15102 c15102, C8614 c8614) {
        new C10627(c15102, c8614, C14584.m35193(c15102.f49290.m54361(), new String[0]), null, null, c8614).m46871();
    }
}
