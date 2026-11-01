package l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes.dex */
public final class C23053 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f74904 = new ArrayList(5);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static List m51002() {
        m50991();
        return (List) C9030.stream(f74904).filter(new C16973(0)).collect(C1890.toUnmodifiableList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50998(TextView textView, C15721 c15721) {
        if (c15721 == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(C16737.m39264(R.string.MT_Protector, c15721.m37444()));
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51000(DialogInterfaceC19356 dialogInterfaceC19356, View view, boolean z) {
        boolean z2 = !z;
        dialogInterfaceC19356.m44372(z2);
        m50997(dialogInterfaceC19356.m44373(), z2);
        m50997(dialogInterfaceC19356.m44374(), z2);
        m50997(dialogInterfaceC19356.m44361(), z2);
        m50997(view.findViewById(R.id.spinner1), z2);
        m50997(view.findViewById(R.id.spinner2), z2);
        m50997(view.findViewById(R.id.switch1), z2);
        m50997(view.findViewById(R.id.switch2), z2);
        m50997(view.findViewById(R.id.switch3), z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50997(View view, boolean z) {
        if (view != null) {
            view.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1179 m50992(AbstractActivityC12483 abstractActivityC12483, View view, C11392 c11392) {
        C12562 c12562 = (C12562) view.findViewById(R.id.switch2);
        if (c12562 != null) {
            c12562.setVisibility(8);
        }
        return new C14857(m51003(abstractActivityC12483, view, c11392));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13175 m50994(AbstractActivityC12483 abstractActivityC12483, View view, String str) {
        C12562 c12562 = (C12562) view.findViewById(R.id.switch2);
        C11392 c11392M6837 = C2218.m6837(str);
        if (str == null || str.isEmpty()) {
            c12562.setVisibility(8);
        } else {
            c12562.setText(C16737.m39264(R.string.MT_Protector, str));
        }
        if (c11392M6837 != null && m50996(c11392M6837.m28501()) == null) {
            c11392M6837 = null;
        }
        if (c11392M6837 == null) {
            c12562.setChecked(false);
            c11392M6837 = new C11392(ApplicationC0716.f2992.getString("auto_signature_key", ""), m50993(), ApplicationC0716.f2992.getString("v1_signature_filename", null), ApplicationC0716.f2992.getBoolean("kv1sd", false));
        } else {
            c12562.setChecked(true);
        }
        return new C2155(m51003(abstractActivityC12483, view, c11392M6837), c12562.getVisibility() == 0, c12562, str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1179 m51003(final AbstractActivityC12483 abstractActivityC12483, View view, C11392 c11392) {
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) view.findViewById(R.id.spinner2);
        final C12562 c12562 = (C12562) view.findViewById(R.id.switch1);
        C12562 c12563 = (C12562) view.findViewById(R.id.switch3);
        C6824 c6824 = new C6824(spinner);
        m50991();
        int iM33769 = C13932.m33769(36.0f);
        Context context = view.getContext();
        ArrayList arrayList = f74904;
        spinner.setAdapter((SpinnerAdapter) new C9918(context, arrayList, iM33769));
        spinner.setOnItemSelectedListener(new C3566(c6824));
        String strM28501 = c11392.m28501();
        int i = 0;
        if (!strM28501.isEmpty()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((AbstractC17131) arrayList.get(i2)).mo1456().equals(strM28501)) {
                    i = i2;
                    break;
                }
            }
        }
        spinner.setSelection(i);
        spinner.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13881(abstractActivityC12483, new C4707(strM28501, spinner, c6824)));
        spinner2.setAdapter((SpinnerAdapter) new C11764(iM33769, view.getContext(), (List) C20318.stream(EnumC7501.values()).map(new C12740(0)).collect(C1890.toList())));
        spinner2.setOnItemSelectedListener(new C2590(c12562, c12563));
        int iOrdinal = c11392.m28499().ordinal();
        spinner2.setSelection(iOrdinal);
        AdapterView.OnItemSelectedListener onItemSelectedListener = spinner2.getOnItemSelectedListener();
        C13638.requireNonNull(onItemSelectedListener);
        onItemSelectedListener.onItemSelected(null, null, iOrdinal, 0L);
        c12562.setTag(c11392.m28502());
        c12562.setChecked(!TextUtils.isEmpty(c11392.m28502()));
        c12562.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ᩻ۨ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                C12562 c12564 = c12562;
                C5413 c5413 = new C5413(abstractActivityC12484, c12564);
                c5413.m40376(R.string.MT_Protector);
                c5413.m40363(R.string.MT_Protector);
                c5413.m40346((CharSequence) c12564.getTag());
                c5413.m40355();
                c5413.m40336(6);
                c5413.m40368(true);
            }
        });
        if (c12563 != null) {
            c12563.setChecked(c11392.m28500());
        }
        return new C6389(spinner, spinner2, c12562, c12563, c6824);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC7501 m50993() {
        int i = 0;
        int i2 = ApplicationC0716.f2992.getInt("auto_signature_scheme", 0);
        if (i2 < 0 || i2 >= EnumC7501.values().length) {
            ApplicationC0716.f2992.edit().mo4065(0, "auto_signature_scheme").apply();
        } else {
            i = i2;
        }
        return EnumC7501.values()[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14558 m50995(C11392 c11392) {
        AbstractC17131 abstractC17131M50996 = m50996(c11392.m28501());
        if (abstractC17131M50996 == null) {
            abstractC17131M50996 = (AbstractC17131) f74904.get(0);
        }
        return new C14558(abstractC17131M50996, c11392.m28499(), c11392.m28502(), c11392.m28500());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50999(InterfaceC4001 interfaceC4001, AbstractC17131 abstractC17131, AbstractActivityC12483 abstractActivityC12483) {
        if (abstractC17131 instanceof C19954) {
            new C11329(interfaceC4001, abstractC17131, abstractActivityC12483).m10243();
            return;
        }
        C24029 c24029 = new C24029(interfaceC4001, abstractC17131, abstractActivityC12483);
        c24029.m35200(abstractC17131.m40014());
        c24029.m35192();
        c24029.m35195(abstractC17131.mo1456());
        c24029.m35201();
        c24029.m35198();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC17131 m50996(String str) {
        m50991();
        if (str == null || str.isEmpty()) {
            return null;
        }
        for (AbstractC17131 abstractC17131 : f74904) {
            if (abstractC17131.mo1456().equals(str)) {
                return abstractC17131;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m50991() {
        ArrayList arrayList = f74904;
        arrayList.clear();
        arrayList.add(C20659.m46512());
        AbstractC20745 abstractC20745M51001 = m51001();
        if (abstractC20745M51001.mo33975()) {
            int i = 1;
            for (AbstractC20745 abstractC20745 : (List) C9030.stream(abstractC20745M51001.mo33983(true)).filter(new C15396(i)).sorted(new C12119(i)).collect(C1890.toList())) {
                String lowerCase = abstractC20745.getName().toLowerCase();
                if (lowerCase.endsWith(".pk8")) {
                    AbstractC20745 abstractC20745M46690 = abstractC20745M51001.m46690(abstractC20745.m46718() + ".x509.pem");
                    if (abstractC20745M46690.mo33975()) {
                        arrayList.add(new C5842(abstractC20745M46690, abstractC20745));
                    }
                } else if (lowerCase.endsWith("aes")) {
                    arrayList.add(new C0197(abstractC20745));
                } else if (lowerCase.endsWith("enc")) {
                    arrayList.add(new C19954(abstractC20745));
                } else {
                    arrayList.add(new C16426(abstractC20745));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m51001() {
        return C11904.m29695().m46690("keys");
    }
}
