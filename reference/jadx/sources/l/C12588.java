package l;

import android.view.View;
import android.widget.Spinner;
import java.util.List;

/* JADX INFO: renamed from: l.۫ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes3.dex */
public class C12588 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static C14000 f42062 = new C14000("text_translator_src", "text_translator_tar");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static C14000 f42063 = new C14000("text_translator_dic_src", "text_translator_dic_tar");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Spinner f42064;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f42065;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C0733 f42066;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Spinner f42069;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C18938 f42070;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC7649 f42072;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C0733 f42073;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f42067 = ((C0074) C21157.m47603()).getOrDefault("auto", "auto");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f42068 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f42071 = false;

    /* JADX INFO: renamed from: ۙ */
    public void mo21877(int i) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo21878(InterfaceC17526 interfaceC17526) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14000 m31310(boolean z) {
        return z ? f42063 : f42062;
    }

    public C12588(Spinner spinner, C18938 c18938, final Spinner spinner2, C0733 c0733, final Spinner spinner3, C0733 c0734, View view) {
        this.f42070 = c18938;
        this.f42064 = spinner2;
        this.f42073 = c0733;
        this.f42069 = spinner3;
        this.f42066 = c0734;
        String string = ApplicationC0716.f2992.getString("text_translator_engine", null);
        if (string != null) {
            int count = c18938.getCount();
            for (int i = 0; i < count; i++) {
                InterfaceC7649 interfaceC7649 = (InterfaceC7649) c18938.getItem(i);
                C13638.requireNonNull(interfaceC7649);
                if (string.equals(interfaceC7649.getId())) {
                    spinner.setSelection(i);
                    break;
                }
            }
        }
        f42062.m33843();
        f42063.m33843();
        C16116 c16116 = new C16116(this, c18938, c0733, c0734);
        spinner.setOnItemSelectedListener(c16116);
        c18938.registerDataSetObserver(new C20349(spinner, c18938, c16116));
        spinner2.setOnItemSelectedListener(new C0592(this, c0733, view));
        spinner3.setOnItemSelectedListener(new C16821(this, c0734, view));
        view.setOnClickListener(new View.OnClickListener() { // from class: l.᩷ᩴۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C12588.m31316(this.f68575, spinner2, spinner3);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31316(C12588 c12588, Spinner spinner, Spinner spinner2) {
        InterfaceC7649 interfaceC7649 = c12588.f42072;
        List listMo13404 = interfaceC7649.mo13404();
        List listMo13410 = interfaceC7649.mo13410();
        if (listMo13404.isEmpty() || listMo13410.isEmpty() || !c12588.m31319()) {
            return;
        }
        C14000 c14000 = interfaceC7649 instanceof C9745 ? f42063 : f42062;
        String strM33841 = c14000.m33841();
        C10472 c10472M31309 = m31309(c14000.m33844(), listMo13404);
        if (c10472M31309 == null) {
            return;
        }
        int i = c10472M31309.f35823;
        if (!interfaceC7649.mo13411()) {
            C10472 c10472M313010 = m31309(strM33841, listMo13410);
            if (c10472M313010 == null) {
                return;
            }
            c12588.f42065 = System.currentTimeMillis();
            spinner.setSelection(i);
            spinner2.setSelection(c10472M313010.f35823);
            c12588.mo21878(interfaceC7649.mo13406(c10472M31309, c10472M313010));
            return;
        }
        if (interfaceC7649.mo13405(i, strM33841) == -1) {
            return;
        }
        spinner.setSelection(i);
        c14000.m33845(strM33841);
        c12588.m31311(i, c14000);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4406 m31327() {
        return this.f42070;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10472 m31309(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            C9061 c9061 = (C9061) list.get(i);
            if (c9061.f30912.equals(str)) {
                return new C10472(i, c9061);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m31319() {
        if ((this.f42072 instanceof C9745) || !this.f42068 || !this.f42071) {
            return false;
        }
        C14000 c14000 = f42062;
        return !C13638.equals(c14000.m33841(), c14000.m33844());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31315(C12588 c12588, View view) {
        boolean zM31319 = c12588.m31319();
        if (view.isEnabled() != zM31319) {
            view.setEnabled(zM31319);
            view.setAlpha(zM31319 ? 0.6f : 0.4f);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m31324() {
        int i = 0;
        while (true) {
            C18938 c18938 = this.f42070;
            if (i < c18938.getCount()) {
                InterfaceC7649 interfaceC7649 = (InterfaceC7649) c18938.getItem(i);
                if (interfaceC7649 != null) {
                    interfaceC7649.mo13407();
                }
                i++;
            } else {
                m31323();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31325() {
        List listM12968 = C4678.m12968();
        int i = 0;
        boolean z = false;
        while (true) {
            C18938 c18938 = this.f42070;
            if (i >= c18938.getCount()) {
                break;
            }
            InterfaceC7649 interfaceC7649 = (InterfaceC7649) c18938.getItem(i);
            if ((interfaceC7649 instanceof C9745) && ((C9745) interfaceC7649).m24726(listM12968)) {
                z = true;
            }
            i++;
        }
        if (z && (this.f42072 instanceof C9745)) {
            m31323();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m31323() {
        boolean zIsEmpty = this.f42072.mo13404().isEmpty();
        C0733 c0733 = this.f42073;
        if (zIsEmpty) {
            m31313(c0733, "-- ERROR --");
            m31313(this.f42066, "-- ERROR --");
            return;
        }
        c0733.m12332();
        c0733.m12329();
        List listMo13404 = this.f42072.mo13404();
        C14000 c14000 = this.f42072 instanceof C9745 ? f42063 : f42062;
        int size = listMo13404.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C9061 c9061 = (C9061) listMo13404.get(i2);
            c0733.m12330(c9061.f30912);
            if (c9061.f30912.equals(c14000.m33841())) {
                i = i2;
            }
        }
        c0733.notifyDataSetChanged();
        this.f42064.setSelection(i);
        c14000.m33842((String) c0733.getItem(i));
        m31311(i, c14000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31311(int i, C14000 c14000) {
        this.f42065 = System.currentTimeMillis();
        this.f42072.mo13408(i);
        boolean zIsEmpty = this.f42072.mo13410().isEmpty();
        C0733 c0733 = this.f42066;
        if (zIsEmpty) {
            m31313(c0733, "-- ERROR --");
            return;
        }
        c0733.m12332();
        c0733.m12329();
        List listMo13410 = this.f42072.mo13410();
        int size = listMo13410.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C9061 c9061 = (C9061) listMo13410.get(i3);
            c0733.m12330(c9061.f30912);
            if (c9061.f30912.equals(c14000.m33844())) {
                i2 = i3;
            }
        }
        c0733.notifyDataSetChanged();
        this.f42069.setSelection(i2);
        c14000.m33845((String) c0733.getItem(i2));
        C9061 c9062 = (C9061) this.f42072.mo13404().get(i);
        C9061 c9063 = (C9061) this.f42072.mo13410().get(i2);
        if (c9062.f30911.equals(c9063.f30911)) {
            return;
        }
        mo21878(this.f42072.mo13406(new C10472(i, c9062), new C10472(i2, c9063)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31313(C0733 c0733, String str) {
        c0733.m12332();
        c0733.m12329();
        c0733.m12330(str);
        c0733.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17526 m31326() {
        InterfaceC7649 interfaceC7649 = this.f42072;
        if (interfaceC7649 == null || interfaceC7649.mo13404().isEmpty() || interfaceC7649.mo13410().isEmpty()) {
            return null;
        }
        int selectedItemPosition = this.f42064.getSelectedItemPosition();
        int selectedItemPosition2 = this.f42069.getSelectedItemPosition();
        if (selectedItemPosition < 0 || selectedItemPosition >= interfaceC7649.mo13404().size() || selectedItemPosition2 < 0 || selectedItemPosition2 >= interfaceC7649.mo13410().size()) {
            return null;
        }
        C9061 c9061 = (C9061) interfaceC7649.mo13404().get(selectedItemPosition);
        C9061 c9062 = (C9061) interfaceC7649.mo13410().get(selectedItemPosition2);
        if (c9061.f30911.equals(c9062.f30911)) {
            return null;
        }
        return interfaceC7649.mo13406(new C10472(selectedItemPosition, c9061), new C10472(selectedItemPosition2, c9062));
    }
}
