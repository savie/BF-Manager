package l;

import android.content.DialogInterface;
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

/* JADX INFO: renamed from: l.ۧ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11005 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27761(InterfaceC17354 interfaceC17354, AbstractActivityC12483 abstractActivityC12483, String str) {
        if (!ApplicationC0716.f2992.getBoolean("enable_auto_signature", false)) {
            interfaceC17354.mo6536(null, ApplicationC0716.f2992.getBoolean("kasb", true));
            return;
        }
        C20882 c20882 = new C20882(interfaceC17354, abstractActivityC12483, str);
        C11392 c11392M6837 = C2218.m6837(str);
        if (c11392M6837 != null && C23053.m50996(c11392M6837.m28501()) == null) {
            c11392M6837 = null;
        }
        if (c11392M6837 == null) {
            ArrayList arrayList = C23053.f74904;
            c11392M6837 = new C11392(ApplicationC0716.f2992.getString("auto_signature_key", ""), C23053.m50993(), ApplicationC0716.f2992.getString("v1_signature_filename", null), ApplicationC0716.f2992.getBoolean("kv1sd", false));
        }
        m27758(abstractActivityC12483, c11392M6837, false, (InterfaceC17354) c20882);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27758(AbstractActivityC12483 abstractActivityC12483, C11392 c11392, boolean z, InterfaceC17354 interfaceC17354) {
        try {
            C14558 c14558M27753 = m27753(c11392, z);
            if (!c14558M27753.m35031().mo1457()) {
                interfaceC17354.mo6536(c14558M27753, false);
            } else if (abstractActivityC12483 == null) {
                interfaceC17354.mo6537(new C4987("Signing key requires interactive verification."));
            } else {
                C23053.m50999(new C15944(interfaceC17354, c14558M27753), c14558M27753.m35031(), abstractActivityC12483);
            }
        } catch (Exception e) {
            if (interfaceC17354.mo6537(e) || abstractActivityC12483 == null) {
                return;
            }
            abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14558 m27753(C11392 c11392, boolean z) throws C6065 {
        AbstractC17131 abstractC17131M46512;
        String strM28501 = c11392.m28501();
        if (strM28501 == null || strM28501.isEmpty()) {
            abstractC17131M46512 = C20659.m46512();
        } else {
            abstractC17131M46512 = C23053.m50996(strM28501);
            if (abstractC17131M46512 == null) {
                if (z) {
                    throw new C6065(strM28501);
                }
                abstractC17131M46512 = C20659.m46512();
            }
        }
        return new C14558(abstractC17131M46512, c11392.m28499(), c11392.m28502(), c11392.m28500());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27759(AbstractActivityC12483 abstractActivityC12483, AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, C14558 c14558, C1777 c1777) {
        C23730.m52263(abstractC20745, abstractC20746, c14558, c1777.m5829());
        if (c14558.m35031() == C20659.m46512()) {
            C16737.m39274(new RunnableC16260(4, abstractActivityC12483), 500L);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27762(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, C14558 c14558, AbstractC17902 abstractC17902) {
        C23730.m52263(abstractC20745, abstractC20746, c14558, abstractC17902.mo41577());
        if (c14558.m35031() == C20659.m46512()) {
            abstractC17902.m41557(new C0420());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27755(Main main, C15575 c15575, C14558 c14558, C20164 c20164) {
        AbstractC20745 abstractC20745M37218 = c15575.m37218();
        try {
            C19808.m45040(c15575);
            AbstractC20745 abstractC20745M37219 = c15575.m37218();
            c20164.m45586(R.string.MT_Protector);
            c20164.m45591(0);
            c20164.m45599(0);
            C23730.m52263(abstractC20745M37218, abstractC20745M37219, c14558, new C16649(c20164));
            if (c14558.m35031() == C20659.m46512()) {
                C16737.m39274(new RunnableC23440(3, main), 500L);
            }
        } finally {
            abstractC20745M37218.mo24647();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27760(C15575 c15575, C14558 c14558, AbstractC17902 abstractC17902) {
        AbstractC20745 abstractC20745M37218 = c15575.m37218();
        try {
            C19808.m45040(c15575);
            C23730.m52263(abstractC20745M37218, c15575.m37218(), c14558, abstractC17902.mo41577());
            if (c14558.m35031() == C20659.m46512()) {
                abstractC17902.m41557(new C12416());
            }
        } finally {
            abstractC20745M37218.mo24647();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27756(C11545 c11545, DialogInterfaceC19356 dialogInterfaceC19356, String str) {
        Main mainM28824 = c11545.m28824();
        Button buttonM44361 = dialogInterfaceC19356.m44361();
        ViewGroup viewGroup = (ViewGroup) buttonM44361.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(buttonM44361);
        CheckBox checkBox = (CheckBox) mainM28824.m30995(R.layout.MT_Protector);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(checkBox, iIndexOfChild);
        m27757(mainM28824, checkBox, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27757(final AbstractActivityC12483 abstractActivityC12483, CompoundButton compoundButton, final String str) {
        compoundButton.setChecked(ApplicationC0716.f2992.getBoolean("enable_auto_signature", false));
        compoundButton.setOnCheckedChangeListener(new C6770());
        compoundButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩸۫᩹
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                if (ApplicationC0716.f2992.getBoolean("show_auto_settings_tip", true)) {
                    ApplicationC0716.f2992.edit().putBoolean("show_auto_settings_tip", false).apply();
                    C15829.m37616();
                }
                AbstractActivityC12483 abstractActivityC12484 = abstractActivityC12483;
                View viewM30995 = abstractActivityC12484.m30995(R.layout.MT_Protector);
                ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                final InterfaceC13175 interfaceC13175M50994 = C23053.m50994(abstractActivityC12484, viewM30995, str);
                C8067 c8067BuildDialog = abstractActivityC12484.buildDialog();
                c8067BuildDialog.m21258(viewM30995);
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                final DialogInterfaceC19356 dialogInterfaceC19356M52499 = C23821.m52499(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC19356M52499.m44373().setOnClickListener(new ViewOnClickListenerC18059(0, interfaceC13175M50994, dialogInterfaceC19356M52499));
                final TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
                interfaceC13175M50994.mo4315(new Runnable() { // from class: l.ᩴ۫᩹
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC13175 interfaceC13175 = interfaceC13175M50994;
                        C23053.m50998(textView, interfaceC13175.mo4316());
                        dialogInterfaceC19356M52499.m44373().setEnabled(!interfaceC13175.mo4313());
                    }
                });
                dialogInterfaceC19356M52499.m44361().setOnClickListener(new ViewOnClickListenerC8182(0, abstractActivityC12484));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16195 m27754(AbstractActivityC12483 abstractActivityC12483, View view) {
        C16195 c16195 = new C16195(abstractActivityC12483, view, 0);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        MenuItem menuItemAdd = c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setCheckable(true);
        menuItemAdd.setChecked(ApplicationC0716.f2992.getBoolean("kasb", true));
        c16195.m38296((InterfaceC21133) new C15101(4, abstractActivityC12483));
        C0671.m3010(c16195);
        return c16195;
    }
}
