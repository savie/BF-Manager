package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۜۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes3.dex */
public final class C6865 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f22791;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f22792;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Set f22793;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f22794;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public RunnableC11879 f22795;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f22796;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f22797;

    public C6865(AbstractActivityC17204 abstractActivityC17204) {
        C15243.m36590(abstractActivityC17204, "activity");
        this.f22791 = abstractActivityC17204;
        this.f22797 = -1;
        this.f22796 = C22242.f71645;
        this.f22793 = Collections.newSetFromMap(new WeakHashMap());
        this.f22794 = new AtomicInteger();
        this.f22792 = true;
        abstractActivityC17204.getLifecycle().mo23077(new InterfaceC5252() { // from class: l.ܿۗᩴ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                C6865.m19111(this.f59112, enumC9330);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19119(final C24132 c24132) {
        if (!C18978.m44078()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (!this.f22792) {
            ?? r0 = this.f22796;
            boolean zIsEmpty = r0.isEmpty();
            AbstractActivityC17204 abstractActivityC17204 = this.f22791;
            if (!zIsEmpty) {
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC22285) it.next()) instanceof C12085) {
                        int[] iArrM53971 = c24132.m53971();
                        int i = iArrM53971[1];
                        int i2 = iArrM53971[0];
                        if (i - i2 > 10000) {
                            iArrM53971[1] = i2 + 10000;
                        }
                        final C24941 c24941 = new C24941();
                        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
                        C15243.m36591(interfaceC19106M54021, "getText(...)");
                        c24941.f80717 = interfaceC19106M54021.subSequence(iArrM53971[0], iArrM53971[1]).toString();
                        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
                        final TextView textView = (TextView) viewM40395.findViewById(R.id.editText3);
                        TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
                        Spinner spinner = (Spinner) viewM40395.findViewById(R.id.MT_Protector);
                        Spinner spinner2 = (Spinner) viewM40395.findViewById(R.id.MT_Protector);
                        Spinner spinner3 = (Spinner) viewM40395.findViewById(R.id.MT_Protector);
                        View viewFindViewById = viewM40395.findViewById(R.id.MT_Protector);
                        viewM40395.findViewById(R.id.MT_Protector).setBackgroundColor(C3296.m10871(-13290187, -986896));
                        C2390 c2390 = new C2390(abstractActivityC17204, this.f22796);
                        C3054 c3054 = new C3054(abstractActivityC17204);
                        C3054 c3055 = new C3054(abstractActivityC17204);
                        spinner.setAdapter((SpinnerAdapter) c2390);
                        spinner2.setAdapter((SpinnerAdapter) c3054);
                        spinner3.setAdapter((SpinnerAdapter) c3055);
                        final TextView textView3 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
                        final TextView textView4 = (TextView) viewM40395.findViewById(R.id.editText2);
                        final ProgressBar progressBar = (ProgressBar) viewM40395.findViewById(R.id.MT_Protector);
                        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
                        c2361BuildDialog.m8005(viewM40395);
                        c2361BuildDialog.m8026(R.string.MT_Protector, null);
                        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        final DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361BuildDialog.m7999();
                        final C24941 c24942 = new C24941();
                        c24942.f80717 = "";
                        final C8356 c8356 = new C8356(spinner, c2390, spinner2, c3054, spinner3, c3055, viewFindViewById, textView2, c24942, this, c24941, textView4, textView3, textView, progressBar, dialogInterfaceC8327M7999);
                        this.f22793.add(c8356);
                        dialogInterfaceC8327M7999.m22432();
                        C5416.m16144(dialogInterfaceC8327M7999);
                        dialogInterfaceC8327M7999.m22433().setOnClickListener(new View.OnClickListener() { // from class: l.֡ۗᩴ
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C6865.m19112(c8356, c24942, this, c24941, textView4, textView3, textView, progressBar, dialogInterfaceC8327M7999);
                            }
                        });
                        dialogInterfaceC8327M7999.m22440().setOnClickListener(new View.OnClickListener() { // from class: l.۟ۗᩴ
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C18452 c18452 = new C18452(view.getContext(), view, 0);
                                c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                final C24132 c24133 = c24132;
                                if (!c24133.m54083()) {
                                    c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                }
                                c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                c18452.m42997();
                                final TextView textView5 = textView3;
                                final C8356 c8357 = c8356;
                                final C6865 c6865 = this;
                                final DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M7999;
                                c18452.m42994(new InterfaceC21436() { // from class: l.ᩳۗᩴ
                                    @Override // l.InterfaceC21436
                                    public final boolean onMenuItemClick(MenuItem menuItem) {
                                        C6865.m19108(textView5, c24133, dialogInterfaceC8327, c6865, c8357, menuItem);
                                        return true;
                                    }
                                });
                                c18452.mo21878();
                            }
                        });
                        textView.setOnClickListener(new ViewOnClickListenerC10751(c24941, textView, dialogInterfaceC8327M7999, 1));
                        c2390.registerDataSetObserver(new C9101(this, dialogInterfaceC8327M7999));
                        return;
                    }
                }
            }
            C22673.m51159(R.string.MT_Protector);
            abstractActivityC17204.startActivity(new Intent(abstractActivityC17204, (Class<?>) ActivityC24268.class));
            return;
        }
        this.f22795 = new RunnableC11879(2, this, c24132);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19112(C8356 c8356, C24941 c24941, C6865 c6865, C24941 c24942, TextView textView, TextView textView2, TextView textView3, ProgressBar progressBar, DialogInterfaceC8327 dialogInterfaceC8327) {
        InterfaceC5877 interfaceC5877M32920 = c8356.m32920();
        if (interfaceC5877M32920 == null) {
            C22673.m51154((CharSequence) "Error");
            return;
        }
        String id = interfaceC5877M32920.getId();
        C15243.m36591(id, "getId(...)");
        c24941.f80717 = id;
        AtomicInteger atomicInteger = c6865.f22794;
        String str = (String) c24942.f80717;
        AbstractActivityC17204 abstractActivityC17204 = c6865.f22791;
        C15243.m36586((Object) textView);
        C15243.m36586((Object) textView2);
        C15243.m36586((Object) textView3);
        C15243.m36586((Object) progressBar);
        Button buttonM22433 = dialogInterfaceC8327.m22433();
        C15243.m36591(buttonM22433, "getNegativeButton(...)");
        new C9847(interfaceC5877M32920, atomicInteger, str, abstractActivityC17204, textView, textView2, textView3, progressBar, buttonM22433).m8197();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19108(TextView textView, C24132 c24132, DialogInterfaceC8327 dialogInterfaceC8327, C6865 c6865, C8356 c8356, MenuItem menuItem) {
        AbstractActivityC17204 abstractActivityC17204 = c6865.f22791;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C21576.m49067((CharSequence) textView.getText().toString());
            return;
        }
        if (itemId == R.string.MT_Protector) {
            if (!c24132.m54083()) {
                c24132.m53902(textView.getText().toString());
            }
            dialogInterfaceC8327.dismiss();
        } else if (itemId == R.string.MT_Protector) {
            abstractActivityC17204.startActivity(new Intent(abstractActivityC17204, (Class<?>) ActivityC24268.class));
        } else if (itemId == R.string.MT_Protector) {
            abstractActivityC17204.startActivity(new Intent(abstractActivityC17204, (Class<?>) ActivityC24449.class));
        } else if (itemId == R.string.MT_Protector) {
            C13677.m33453(abstractActivityC17204, new RunnableC20701(1, c8356));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19111(C6865 c6865, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_RESUME) {
            int i = c6865.f22797;
            Set<C13334> set = c6865.f22793;
            if (i != C23522.m52716()) {
                if (!C18978.m44078()) {
                    c6865.f22796 = C22242.f71645;
                    c6865.f22797 = -1;
                    return;
                } else {
                    if (c6865.f22797 == C23522.m52716()) {
                        C15243.m36591(set, "translatorBinders");
                        for (C13334 c13334 : set) {
                            if (c13334 != null) {
                                c13334.m32919();
                            }
                        }
                        return;
                    }
                    new C0899(c6865, new ArrayList(), new ArrayList()).m8197();
                    return;
                }
            }
            C15243.m36591(set, "translatorBinders");
            for (C13334 c13335 : set) {
                if (c13335 != null) {
                    c13335.m32919();
                }
            }
        }
    }
}
