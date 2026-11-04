package l;

import android.view.View;
import android.widget.Spinner;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes4.dex */
public class C13334 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static C6120 f42521 = new C6120("text_translator_src", "text_translator_tar");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C6120 f42522 = new C6120("text_translator_dic_src", "text_translator_dic_tar");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3054 f42523;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2390 f42526;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Spinner f42527;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Spinner f42528;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3054 f42529;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC22285 f42531;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f42532;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f42524 = ((C17159) C5448.m16285()).getOrDefault("auto", "auto");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f42530 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f42525 = false;

    /* JADX INFO: renamed from: ۙ */
    public void mo22489(int i) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo22490(InterfaceC5877 interfaceC5877) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6120 m32904(boolean z) {
        return z ? f42522 : f42521;
    }

    public C13334(Spinner spinner, C2390 c2390, Spinner spinner2, C3054 c3054, Spinner spinner3, C3054 c3055, View view) {
        this.f42526 = c2390;
        this.f42528 = spinner2;
        this.f42529 = c3054;
        this.f42527 = spinner3;
        this.f42523 = c3055;
        String string = ApplicationC17729.f58258.getString("text_translator_engine", null);
        if (string != null) {
            int count = c2390.getCount();
            for (int i = 0; i < count; i++) {
                InterfaceC22285 interfaceC22285 = (InterfaceC22285) c2390.getItem(i);
                C17359.requireNonNull(interfaceC22285);
                if (string.equals(interfaceC22285.getId())) {
                    spinner.setSelection(i);
                    break;
                }
            }
        }
        f42521.m17669();
        f42522.m17669();
        C11096 c11096 = new C11096(this, c2390, c3054, c3055);
        spinner.setOnItemSelectedListener(c11096);
        c2390.registerDataSetObserver(new C23031(spinner, c2390, c11096));
        spinner2.setOnItemSelectedListener(new C20047(this, c3054, view));
        spinner3.setOnItemSelectedListener(new C15571(this, c3055, view));
        view.setOnClickListener(new ViewOnClickListenerC22006(this, spinner2, spinner3, 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32910(C13334 c13334, Spinner spinner, Spinner spinner2) {
        InterfaceC22285 interfaceC22285 = c13334.f42531;
        List listMo10253 = interfaceC22285.mo10253();
        List listMo10251 = interfaceC22285.mo10251();
        if (listMo10253.isEmpty() || listMo10251.isEmpty() || !c13334.m32915()) {
            return;
        }
        C6120 c6120 = interfaceC22285 instanceof C3136 ? f42522 : f42521;
        String strM17667 = c6120.m17667();
        C5131 c5131M32903 = m32903(c6120.m17670(), listMo10253);
        if (c5131M32903 == null) {
            return;
        }
        int i = c5131M32903.f17868;
        if (!interfaceC22285.mo10252()) {
            C5131 c5131M32904 = m32903(strM17667, listMo10251);
            if (c5131M32904 == null) {
                return;
            }
            c13334.f42532 = System.currentTimeMillis();
            spinner.setSelection(i);
            spinner2.setSelection(c5131M32904.f17868);
            c13334.mo22490(interfaceC22285.mo10247(c5131M32903, c5131M32904));
            return;
        }
        if (interfaceC22285.mo10246(i, strM17667) == -1) {
            return;
        }
        spinner.setSelection(i);
        c6120.m17671(strM17667);
        c13334.m32905(i, c6120);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19131 m32921() {
        return this.f42526;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5131 m32903(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C13576 c13576 = (C13576) list.get(i);
            if (c13576.f43124.equals(str)) {
                return new C5131(i, c13576);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m32915() {
        if ((this.f42531 instanceof C3136) || !this.f42530 || !this.f42525) {
            return false;
        }
        C6120 c6120 = f42521;
        return !C17359.equals(c6120.m17667(), c6120.m17670());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32909(C13334 c13334, View view) {
        boolean zM32915 = c13334.m32915();
        if (view.isEnabled() != zM32915) {
            view.setEnabled(zM32915);
            view.setAlpha(zM32915 ? 0.6f : 0.4f);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m32922() {
        int i = 0;
        while (true) {
            C2390 c2390 = this.f42526;
            if (i < c2390.getCount()) {
                InterfaceC22285 interfaceC22285 = (InterfaceC22285) c2390.getItem(i);
                if (interfaceC22285 != null) {
                    interfaceC22285.mo10248();
                }
                i++;
            } else {
                m32914();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32919() {
        List listM19190 = C6912.m19190();
        int i = 0;
        boolean z = false;
        while (true) {
            C2390 c2390 = this.f42526;
            if (i >= c2390.getCount()) {
                break;
            }
            InterfaceC22285 interfaceC22285 = (InterfaceC22285) c2390.getItem(i);
            if ((interfaceC22285 instanceof C3136) && ((C3136) interfaceC22285).m10250(listM19190)) {
                z = true;
            }
            i++;
        }
        if (z && (this.f42531 instanceof C3136)) {
            m32914();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m32914() {
        boolean zIsEmpty = this.f42531.mo10253().isEmpty();
        C3054 c3054 = this.f42529;
        if (zIsEmpty) {
            m32907(c3054, "-- ERROR --");
            m32907(this.f42523, "-- ERROR --");
            return;
        }
        c3054.m44267();
        c3054.m44264();
        List listMo10253 = this.f42531.mo10253();
        C6120 c6120 = this.f42531 instanceof C3136 ? f42522 : f42521;
        int size = listMo10253.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C13576 c13576 = (C13576) listMo10253.get(i2);
            c3054.m44265(c13576.f43124);
            if (c13576.f43124.equals(c6120.m17667())) {
                i = i2;
            }
        }
        c3054.notifyDataSetChanged();
        this.f42528.setSelection(i);
        c6120.m17668((String) c3054.getItem(i));
        m32905(i, c6120);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m32905(int i, C6120 c6120) {
        this.f42532 = System.currentTimeMillis();
        this.f42531.mo10249(i);
        boolean zIsEmpty = this.f42531.mo10251().isEmpty();
        C3054 c3054 = this.f42523;
        if (zIsEmpty) {
            m32907(c3054, "-- ERROR --");
            return;
        }
        c3054.m44267();
        c3054.m44264();
        List listMo10251 = this.f42531.mo10251();
        int size = listMo10251.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C13576 c13576 = (C13576) listMo10251.get(i3);
            c3054.m44265(c13576.f43124);
            if (c13576.f43124.equals(c6120.m17670())) {
                i2 = i3;
            }
        }
        c3054.notifyDataSetChanged();
        this.f42527.setSelection(i2);
        c6120.m17671((String) c3054.getItem(i2));
        C13576 c13577 = (C13576) this.f42531.mo10253().get(i);
        C13576 c13578 = (C13576) this.f42531.mo10251().get(i2);
        if (c13577.f43123.equals(c13578.f43123)) {
            return;
        }
        mo22490(this.f42531.mo10247(new C5131(i, c13577), new C5131(i2, c13578)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32907(C3054 c3054, String str) {
        c3054.m44267();
        c3054.m44264();
        c3054.m44265(str);
        c3054.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5877 m32920() {
        InterfaceC22285 interfaceC22285 = this.f42531;
        if (interfaceC22285 == null || interfaceC22285.mo10253().isEmpty() || interfaceC22285.mo10251().isEmpty()) {
            return null;
        }
        int selectedItemPosition = this.f42528.getSelectedItemPosition();
        int selectedItemPosition2 = this.f42527.getSelectedItemPosition();
        if (selectedItemPosition < 0 || selectedItemPosition >= interfaceC22285.mo10253().size() || selectedItemPosition2 < 0 || selectedItemPosition2 >= interfaceC22285.mo10251().size()) {
            return null;
        }
        C13576 c13576 = (C13576) interfaceC22285.mo10253().get(selectedItemPosition);
        C13576 c13577 = (C13576) interfaceC22285.mo10251().get(selectedItemPosition2);
        if (c13576.f43123.equals(c13577.f43123)) {
            return null;
        }
        return interfaceC22285.mo10247(new C5131(selectedItemPosition, c13576), new C5131(selectedItemPosition2, c13577));
    }
}
