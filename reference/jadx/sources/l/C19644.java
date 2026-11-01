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

/* JADX INFO: renamed from: l.᩵ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes4.dex */
public final class C19644 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Set f63078;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f63079;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f63080;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public RunnableC7917 f63081;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f63082;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f63083;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f63084;

    public C19644(AbstractActivityC12483 abstractActivityC12483) {
        C13465.m32966(abstractActivityC12483, "activity");
        this.f63080 = abstractActivityC12483;
        this.f63079 = -1;
        this.f63083 = C23238.f75405;
        this.f63078 = Collections.newSetFromMap(new WeakHashMap());
        this.f63084 = new AtomicInteger();
        this.f63082 = true;
        abstractActivityC12483.getLifecycle().mo9171(new InterfaceC5657() { // from class: l.֨ᩴۚ
            @Override // l.InterfaceC5657
            /* JADX INFO: renamed from: ۙ */
            public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
                C19644.m44767(this.f5565, enumC1651);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44772(final C6111 c6111) {
        if (!C1709.m5693()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        if (!this.f63082) {
            ?? r0 = this.f63083;
            boolean zIsEmpty = r0.isEmpty();
            AbstractActivityC12483 abstractActivityC12483 = this.f63080;
            if (!zIsEmpty) {
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC7649) it.next()) instanceof C4826) {
                        int[] iArrM16971 = c6111.m16971();
                        int i = iArrM16971[1];
                        int i2 = iArrM16971[0];
                        if (i - i2 > 10000) {
                            iArrM16971[1] = i2 + 10000;
                        }
                        final C0763 c0763 = new C0763();
                        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
                        C13465.m32967(interfaceC2916M17000, "getText(...)");
                        c0763.f3078 = interfaceC2916M17000.subSequence(iArrM16971[0], iArrM16971[1]).toString();
                        View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
                        final TextView textView = (TextView) viewM30995.findViewById(R.id.editText3);
                        TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
                        Spinner spinner = (Spinner) viewM30995.findViewById(R.id.MT_Protector);
                        Spinner spinner2 = (Spinner) viewM30995.findViewById(R.id.MT_Protector);
                        Spinner spinner3 = (Spinner) viewM30995.findViewById(R.id.MT_Protector);
                        View viewFindViewById = viewM30995.findViewById(R.id.MT_Protector);
                        viewM30995.findViewById(R.id.MT_Protector).setBackgroundColor(C20368.m45983(-13290187, -986896));
                        C18938 c18938 = new C18938(abstractActivityC12483, this.f63083);
                        C0733 c0733 = new C0733(abstractActivityC12483);
                        C0733 c0734 = new C0733(abstractActivityC12483);
                        spinner.setAdapter((SpinnerAdapter) c18938);
                        spinner2.setAdapter((SpinnerAdapter) c0733);
                        spinner3.setAdapter((SpinnerAdapter) c0734);
                        final TextView textView3 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
                        final TextView textView4 = (TextView) viewM30995.findViewById(R.id.editText2);
                        final ProgressBar progressBar = (ProgressBar) viewM30995.findViewById(R.id.MT_Protector);
                        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
                        c8067BuildDialog.m21258(viewM30995);
                        c8067BuildDialog.m21251(R.string.MT_Protector, null);
                        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        final DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067BuildDialog.m21252();
                        final C0763 c0764 = new C0763();
                        c0764.f3078 = "";
                        final C8355 c8355 = new C8355(spinner, c18938, spinner2, c0733, spinner3, c0734, viewFindViewById, textView2, c0764, this, c0763, textView4, textView3, textView, progressBar, dialogInterfaceC19356M21252);
                        this.f63078.add(c8355);
                        dialogInterfaceC19356M21252.m44362();
                        C23250.m51309(dialogInterfaceC19356M21252);
                        dialogInterfaceC19356M21252.m44374().setOnClickListener(new View.OnClickListener() { // from class: l.۬ᩴۚ
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C19644.m44764(c8355, c0764, this, c0763, textView4, textView3, textView, progressBar, dialogInterfaceC19356M21252);
                            }
                        });
                        dialogInterfaceC19356M21252.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ۘᩴۚ
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C16195 c16195 = new C16195(view.getContext(), view, 0);
                                c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                final C6111 c6112 = c6111;
                                if (!c6112.m17004()) {
                                    c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                }
                                c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                                c16195.m38292();
                                final TextView textView5 = textView3;
                                final C8355 c8356 = c8355;
                                final C19644 c19644 = this;
                                final DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21252;
                                c16195.m38296(new InterfaceC21133() { // from class: l.᩺ᩴۚ
                                    @Override // l.InterfaceC21133
                                    public final boolean onMenuItemClick(MenuItem menuItem) {
                                        C19644.m44763(textView5, c6112, dialogInterfaceC19356, c19644, c8356, menuItem);
                                        return true;
                                    }
                                });
                                c16195.m38297();
                            }
                        });
                        textView.setOnClickListener(new ViewOnClickListenerC6943(c0763, textView, dialogInterfaceC19356M21252, 0));
                        c18938.registerDataSetObserver(new C18232(this, dialogInterfaceC19356M21252));
                        return;
                    }
                }
            }
            C15829.m37618(R.string.MT_Protector);
            abstractActivityC12483.startActivity(new Intent(abstractActivityC12483, (Class<?>) ActivityC1609.class));
            return;
        }
        this.f63081 = new RunnableC7917(2, this, c6111);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44764(C8355 c8355, C0763 c0763, C19644 c19644, C0763 c0764, TextView textView, TextView textView2, TextView textView3, ProgressBar progressBar, DialogInterfaceC19356 dialogInterfaceC19356) {
        InterfaceC17526 interfaceC17526M31326 = c8355.m31326();
        if (interfaceC17526M31326 == null) {
            C15829.m37613((CharSequence) "Error");
            return;
        }
        String id = interfaceC17526M31326.getId();
        C13465.m32967(id, "getId(...)");
        c0763.f3078 = id;
        AtomicInteger atomicInteger = c19644.f63084;
        String str = (String) c0764.f3078;
        AbstractActivityC12483 abstractActivityC12483 = c19644.f63080;
        C13465.m32962((Object) textView);
        C13465.m32962((Object) textView2);
        C13465.m32962((Object) textView3);
        C13465.m32962((Object) progressBar);
        Button buttonM44374 = dialogInterfaceC19356.m44374();
        C13465.m32967(buttonM44374, "getNegativeButton(...)");
        new C15411(interfaceC17526M31326, atomicInteger, str, abstractActivityC12483, textView, textView2, textView3, progressBar, buttonM44374).m10243();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44763(TextView textView, C6111 c6111, DialogInterfaceC19356 dialogInterfaceC19356, C19644 c19644, C8355 c8355, MenuItem menuItem) {
        AbstractActivityC12483 abstractActivityC12483 = c19644.f63080;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C16737.m39272((CharSequence) textView.getText().toString());
            return;
        }
        if (itemId == R.string.MT_Protector) {
            if (!c6111.m17004()) {
                c6111.m16856(textView.getText().toString());
            }
            dialogInterfaceC19356.dismiss();
        } else if (itemId == R.string.MT_Protector) {
            abstractActivityC12483.startActivity(new Intent(abstractActivityC12483, (Class<?>) ActivityC1609.class));
        } else if (itemId == R.string.MT_Protector) {
            abstractActivityC12483.startActivity(new Intent(abstractActivityC12483, (Class<?>) ActivityC0061.class));
        } else if (itemId == R.string.MT_Protector) {
            C4376.m12229(abstractActivityC12483, new RunnableC11767(1, c8355));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44767(C19644 c19644, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_RESUME) {
            int i = c19644.f63079;
            Set<C12588> set = c19644.f63078;
            if (i != C17132.m40032()) {
                if (!C1709.m5693()) {
                    c19644.f63083 = C23238.f75405;
                    c19644.f63079 = -1;
                    return;
                } else {
                    if (c19644.f63079 == C17132.m40032()) {
                        C13465.m32967(set, "translatorBinders");
                        for (C12588 c12588 : set) {
                            if (c12588 != null) {
                                c12588.m31325();
                            }
                        }
                        return;
                    }
                    new C21760(c19644, new ArrayList(), new ArrayList()).m10243();
                    return;
                }
            }
            C13465.m32967(set, "translatorBinders");
            for (C12588 c12589 : set) {
                if (c12589 != null) {
                    c12589.m31325();
                }
            }
        }
    }
}
