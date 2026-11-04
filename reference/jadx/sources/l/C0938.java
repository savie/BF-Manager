package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes2.dex */
public final class C0938 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3749(InterfaceC18837 interfaceC18837, AbstractActivityC17204 abstractActivityC17204, String str) {
        if (!ApplicationC17729.f58258.getBoolean("enable_auto_signature", false)) {
            interfaceC18837.mo1269(null, ApplicationC17729.f58258.getBoolean("kasb", true));
            return;
        }
        C3921 c3921 = new C3921(interfaceC18837, abstractActivityC17204, str);
        C10737 c10737M51149 = C22672.m51149(str);
        if (c10737M51149 != null && C16530.m39159(c10737M51149.m27351()) == null) {
            c10737M51149 = null;
        }
        if (c10737M51149 == null) {
            ArrayList arrayList = C16530.f53509;
            c10737M51149 = new C10737(ApplicationC17729.f58258.getString("auto_signature_key", ""), C16530.m39157(), ApplicationC17729.f58258.getString("v1_signature_filename", null), ApplicationC17729.f58258.getBoolean("kv1sd", false));
        }
        m3747(abstractActivityC17204, c10737M51149, false, (InterfaceC18837) c3921);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3747(AbstractActivityC17204 abstractActivityC17204, C10737 c10737, boolean z, InterfaceC18837 interfaceC18837) {
        try {
            C9651 c9651M3741 = m3741(c10737, z);
            if (!c9651M3741.m25168().mo18538()) {
                interfaceC18837.mo1269(c9651M3741, false);
            } else if (abstractActivityC17204 == null) {
                interfaceC18837.mo1270(new C4866("Signing key requires interactive verification."));
            } else {
                C16530.m39163(new C14361(interfaceC18837, c9651M3741), c9651M3741.m25168(), abstractActivityC17204);
            }
        } catch (Exception e) {
            if (interfaceC18837.mo1270(e) || abstractActivityC17204 == null) {
                return;
            }
            abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9651 m3741(C10737 c10737, boolean z) throws C9886 {
        AbstractC14806 abstractC14806M11750;
        String strM27351 = c10737.m27351();
        if (strM27351 == null || strM27351.isEmpty()) {
            abstractC14806M11750 = C3620.m11750();
        } else {
            abstractC14806M11750 = C16530.m39159(strM27351);
            if (abstractC14806M11750 == null) {
                if (z) {
                    throw new C9886(strM27351);
                }
                abstractC14806M11750 = C3620.m11750();
            }
        }
        return new C9651(abstractC14806M11750, c10737.m27349(), c10737.m27350(), c10737.m27348());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3748(AbstractActivityC17204 abstractActivityC17204, AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, C9651 c9651, C10745 c10745) {
        C1449.m5220(abstractC22044, abstractC22045, c9651, c10745.m27390());
        if (c9651.m25168() == C3620.m11750()) {
            C21576.m49069(new RunnableC3291(4, abstractActivityC17204), 500L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3750(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, C9651 c9651, AbstractC18900 abstractC18900) {
        C1449.m5220(abstractC22044, abstractC22045, c9651, abstractC18900.mo43864());
        if (c9651.m25168() == C3620.m11750()) {
            abstractC18900.m43834(new C18091());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3743(Main main, C7715 c7715, C9651 c9651, C10043 c10043) {
        AbstractC22044 abstractC22044M20994 = c7715.m20994();
        try {
            C18902.m43877(c7715);
            AbstractC22044 abstractC22044M20995 = c7715.m20994();
            c10043.m25920(R.string.MT_Protector);
            c10043.m25925(0);
            c10043.m25921(0);
            C1449.m5220(abstractC22044M20994, abstractC22044M20995, c9651, new C0192(c10043));
            if (c9651.m25168() == C3620.m11750()) {
                C21576.m49069(new RunnableC23313(0, main), 500L);
            }
        } finally {
            abstractC22044M20994.mo4296();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3744(C7715 c7715, C9651 c9651, AbstractC18900 abstractC18900) {
        AbstractC22044 abstractC22044M20994 = c7715.m20994();
        try {
            C18902.m43877(c7715);
            C1449.m5220(abstractC22044M20994, c7715.m20994(), c9651, abstractC18900.mo43864());
            if (c9651.m25168() == C3620.m11750()) {
                abstractC18900.m43834(new C7650());
            }
        } finally {
            abstractC22044M20994.mo4296();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3745(C8614 c8614, DialogInterfaceC8327 dialogInterfaceC8327, String str) {
        Main mainM23233 = c8614.m23233();
        Button buttonM22440 = dialogInterfaceC8327.m22440();
        ViewGroup viewGroup = (ViewGroup) buttonM22440.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(buttonM22440);
        CheckBox checkBox = (CheckBox) mainM23233.m40395(R.layout.MT_Protector);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(checkBox, iIndexOfChild);
        m3746(mainM23233, checkBox, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3746(final AbstractActivityC17204 abstractActivityC17204, CompoundButton compoundButton, final String str) {
        compoundButton.setChecked(ApplicationC17729.f58258.getBoolean("enable_auto_signature", false));
        compoundButton.setOnCheckedChangeListener(new C24805());
        compoundButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ܽۙ۫
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                if (ApplicationC17729.f58258.getBoolean("show_auto_settings_tip", true)) {
                    ApplicationC17729.f58258.edit().putBoolean("show_auto_settings_tip", false).apply();
                    C22673.m51157();
                }
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                View viewM40395 = abstractActivityC17205.m40395(R.layout.MT_Protector);
                ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
                InterfaceC1615 interfaceC1615M39155 = C16530.m39155(abstractActivityC17205, viewM40395, str);
                C2361 c2361BuildDialog = abstractActivityC17205.buildDialog();
                c2361BuildDialog.m8005(viewM40395);
                c2361BuildDialog.m8026(R.string.MT_Protector, null);
                DialogInterfaceC8327 dialogInterfaceC8327M23911 = C8947.m23911(c2361BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC8327M23911.m22436().setOnClickListener(new ViewOnClickListenerC8386(interfaceC1615M39155, dialogInterfaceC8327M23911));
                interfaceC1615M39155.mo3998(new RunnableC11454((TextView) viewM40395.findViewById(R.id.MT_Protector), interfaceC1615M39155, dialogInterfaceC8327M23911, 1));
                dialogInterfaceC8327M23911.m22440().setOnClickListener(new ViewOnClickListenerC15853(0, abstractActivityC17205));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18452 m3742(final AbstractActivityC17204 abstractActivityC17204, View view) {
        C18452 c18452M44468 = C19198.m44468(abstractActivityC17204, view);
        c18452M44468.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        MenuItem menuItemAdd = c18452M44468.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setCheckable(true);
        menuItemAdd.setChecked(ApplicationC17729.f58258.getBoolean("kasb", true));
        c18452M44468.m42994(new InterfaceC21436() { // from class: l.ۗۙ۫
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() == R.string.MT_Protector) {
                    AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                    Intent intent = new Intent(abstractActivityC17205, (Class<?>) ActivityC3786.class);
                    intent.putExtra("fromDialog", true);
                    abstractActivityC17205.startActivity(intent);
                    return true;
                }
                menuItem.setChecked(!menuItem.isChecked());
                ApplicationC17729.f58258.edit().putBoolean("kasb", menuItem.isChecked()).apply();
                return true;
            }
        });
        return c18452M44468;
    }
}
