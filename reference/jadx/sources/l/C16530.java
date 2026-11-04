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

/* JADX INFO: renamed from: l.ܺۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16530 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f53509 = new ArrayList(5);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m39165() {
        m39167();
        return (List) C1170.stream(f53509).filter(new C18218(0)).collect(C2025.toUnmodifiableList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39161(TextView textView, C20774 c20774) {
        if (c20774 == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(C21576.m49059(R.string.MT_Protector, c20774.m47524()));
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39162(DialogInterfaceC8327 dialogInterfaceC8327, View view, boolean z) {
        boolean z2 = !z;
        dialogInterfaceC8327.m22431(z2);
        m39160(dialogInterfaceC8327.m22436(), z2);
        m39160(dialogInterfaceC8327.m22433(), z2);
        m39160(dialogInterfaceC8327.m22440(), z2);
        m39160(view.findViewById(R.id.spinner1), z2);
        m39160(view.findViewById(R.id.spinner2), z2);
        m39160(view.findViewById(R.id.switch1), z2);
        m39160(view.findViewById(R.id.switch2), z2);
        m39160(view.findViewById(R.id.switch3), z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39160(View view, boolean z) {
        if (view != null) {
            view.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5344 m39156(AbstractActivityC17204 abstractActivityC17204, View view, C10737 c10737) {
        C1255 c1255 = (C1255) view.findViewById(R.id.switch2);
        if (c1255 != null) {
            c1255.setVisibility(8);
        }
        return new C8522(m39166(abstractActivityC17204, view, c10737));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1615 m39155(AbstractActivityC17204 abstractActivityC17204, View view, String str) {
        C1255 c1255 = (C1255) view.findViewById(R.id.switch2);
        C10737 c10737M51149 = C22672.m51149(str);
        if (str == null || str.isEmpty()) {
            c1255.setVisibility(8);
        } else {
            c1255.setText(C21576.m49059(R.string.MT_Protector, str));
        }
        if (c10737M51149 != null && m39159(c10737M51149.m27351()) == null) {
            c10737M51149 = null;
        }
        if (c10737M51149 == null) {
            c1255.setChecked(false);
            c10737M51149 = new C10737(ApplicationC17729.f58258.getString("auto_signature_key", ""), m39157(), ApplicationC17729.f58258.getString("v1_signature_filename", null), ApplicationC17729.f58258.getBoolean("kv1sd", false));
        } else {
            c1255.setChecked(true);
        }
        return new C7031(m39166(abstractActivityC17204, view, c10737M51149), c1255.getVisibility() == 0, c1255, str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC5344 m39166(final AbstractActivityC17204 abstractActivityC17204, View view, C10737 c10737) {
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) view.findViewById(R.id.spinner2);
        final C1255 c1255 = (C1255) view.findViewById(R.id.switch1);
        C1255 c1256 = (C1255) view.findViewById(R.id.switch3);
        C24736 c24736 = new C24736(spinner);
        m39167();
        int iM19160 = C6907.m19160(36.0f);
        Context context = view.getContext();
        ArrayList arrayList = f53509;
        spinner.setAdapter((SpinnerAdapter) new C13742(context, arrayList, iM19160));
        spinner.setOnItemSelectedListener(new C4598(c24736));
        String strM27351 = c10737.m27351();
        int i = 0;
        if (!strM27351.isEmpty()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((AbstractC14806) arrayList.get(i2)).mo11753().equals(strM27351)) {
                    i = i2;
                    break;
                }
            }
        }
        spinner.setSelection(i);
        spinner.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC10563(abstractActivityC17204, new C21752(strM27351, spinner, c24736)));
        spinner2.setAdapter((SpinnerAdapter) new C22498(iM19160, view.getContext(), (List) C13847.stream(EnumC6670.values()).map(new C18964(0)).collect(C2025.toList())));
        spinner2.setOnItemSelectedListener(new C19514(c1255, c1256));
        int iOrdinal = c10737.m27349().ordinal();
        spinner2.setSelection(iOrdinal);
        AdapterView.OnItemSelectedListener onItemSelectedListener = spinner2.getOnItemSelectedListener();
        C17359.requireNonNull(onItemSelectedListener);
        onItemSelectedListener.onItemSelected(null, null, iOrdinal, 0L);
        c1255.setTag(c10737.m27350());
        c1255.setChecked(!TextUtils.isEmpty(c10737.m27350()));
        c1255.setOnClickListener(new View.OnClickListener() { // from class: l.ۢۡۤ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                C1255 c1257 = c1255;
                C15038 c15038 = new C15038(abstractActivityC17205, c1257);
                c15038.m22945(R.string.MT_Protector);
                c15038.m22929(R.string.MT_Protector);
                c15038.m22924((CharSequence) c1257.getTag());
                c15038.m22959();
                c15038.m22957(6);
                c15038.m22955(true);
            }
        });
        if (c1256 != null) {
            c1256.setChecked(c10737.m27348());
        }
        return new C1065(spinner, spinner2, c1255, c1256, c24736);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC6670 m39157() {
        int i = 0;
        int i2 = ApplicationC17729.f58258.getInt("auto_signature_scheme", 0);
        if (i2 < 0 || i2 >= EnumC6670.values().length) {
            ApplicationC17729.f58258.edit().mo3486(0, "auto_signature_scheme").apply();
        } else {
            i = i2;
        }
        return EnumC6670.values()[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9651 m39158(C10737 c10737) {
        AbstractC14806 abstractC14806M39159 = m39159(c10737.m27351());
        if (abstractC14806M39159 == null) {
            abstractC14806M39159 = (AbstractC14806) f53509.get(0);
        }
        return new C9651(abstractC14806M39159, c10737.m27349(), c10737.m27350(), c10737.m27348());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39163(InterfaceC11309 interfaceC11309, AbstractC14806 abstractC14806, AbstractActivityC17204 abstractActivityC17204) {
        if (abstractC14806 instanceof C12569) {
            new C9267(interfaceC11309, abstractC14806, abstractActivityC17204).m8197();
            return;
        }
        C2556 c2556 = new C2556(interfaceC11309, abstractC14806, abstractActivityC17204);
        c2556.m51186(abstractC14806.m35655());
        c2556.m51183();
        c2556.m51181(abstractC14806.mo11753());
        c2556.m51184();
        c2556.m51182();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC14806 m39159(String str) {
        m39167();
        if (str == null || str.isEmpty()) {
            return null;
        }
        for (AbstractC14806 abstractC14806 : f53509) {
            if (abstractC14806.mo11753().equals(str)) {
                return abstractC14806;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m39167() {
        ArrayList arrayList = f53509;
        arrayList.clear();
        arrayList.add(C3620.m11750());
        AbstractC22044 abstractC22044M39164 = m39164();
        if (abstractC22044M39164.mo2934()) {
            int i = 0;
            for (AbstractC22044 abstractC22044 : (List) C1170.stream(abstractC22044M39164.mo4299(true)).filter(new C0319(i)).sorted(new C7777(i)).collect(C2025.toList())) {
                String lowerCase = abstractC22044.getName().toLowerCase();
                if (lowerCase.endsWith(".pk8")) {
                    AbstractC22044 abstractC22044M49876 = abstractC22044M39164.m49876(abstractC22044.m49874() + ".x509.pem");
                    if (abstractC22044M49876.mo2934()) {
                        arrayList.add(new C21520(abstractC22044M49876, abstractC22044));
                    }
                } else if (lowerCase.endsWith("aes")) {
                    arrayList.add(new C6604(abstractC22044));
                } else if (lowerCase.endsWith("enc")) {
                    arrayList.add(new C12569(abstractC22044));
                } else {
                    arrayList.add(new C24504(abstractC22044));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m39164() {
        return C6382.m18134().m49876("keys");
    }
}
