package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 65FC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4677 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C11545 f16541;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public TextView[] f16542;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C6794 f16544;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22149 f16545;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f16547;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f16546 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16543 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12955(C4677 c4677, MenuItem menuItem) {
        List list = c4677.f16547;
        C11545 c11545 = c4677.f16541;
        if (menuItem.getItemId() == R.string.MT_Protector) {
            new C0880(c11545, list).m3555(new RunnableC10138(1, c4677));
        } else if (menuItem.getItemId() == R.string.MT_Protector) {
            new C20637(c11545, list).m46506(new RunnableC10138(1, c4677));
        } else {
            new C22754(c11545, list).m50419(new RunnableC10138(1, c4677));
        }
    }

    public C4677(C11545 c11545, List list) {
        this.f16541 = c11545;
        this.f16547 = list;
        C22149 c22149 = new C22149(c11545.m28824());
        c22149.m49138();
        c22149.m49164();
        this.f16545 = c22149;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12962() {
        this.f16545.m49139();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12966(InterfaceC2557 interfaceC2557) {
        boolean z;
        String path;
        if (interfaceC2557.isDirectory() || !(interfaceC2557 instanceof C6794)) {
            throw new IllegalArgumentException();
        }
        C6794 c6794 = (C6794) interfaceC2557;
        this.f16544 = c6794;
        AbstractC20745 abstractC20745Mo7989 = c6794.mo7989();
        C22149 c22149 = this.f16545;
        c22149.m49153(c6794);
        c22149.m49148(c6794.mo7986() ? R.string.MT_Protector : R.string.MT_Protector);
        long size = c6794.getSize();
        final long jMo7990 = c6794.mo7990();
        if (jMo7990 != -1 && size != jMo7990) {
            c22149.m49143(R.string.MT_Protector, new C23644(1, size)).m9599(8);
            c22149.m49143(R.string.MT_Protector, new InterfaceC4509() { // from class: l.ܿۙ֨
                @Override // l.InterfaceC4509
                /* JADX INFO: renamed from: ۙ */
                public final void mo4354(TextView textView) {
                    C15052.m36041(textView, jMo7990);
                }
            });
            c22149.m49162(c6794.getTime()).m9599(8);
        } else {
            c22149.m49157(size);
            c22149.m49162(c6794.getTime());
        }
        final ArrayList arrayList = new ArrayList(2);
        if (C6794.m18392(c6794.mo7971())) {
            if (abstractC20745Mo7989.mo46709()) {
                this.f16543 = false;
            } else {
                try {
                    if (abstractC20745Mo7989 instanceof C14705) {
                        path = ((C14705) abstractC20745Mo7989).m35232();
                    } else {
                        path = c6794.getPath();
                    }
                    c6794.m18394(new C11731(C0055.m951(path)));
                    z = true;
                } catch (IOException unused) {
                    this.f16543 = false;
                    z = false;
                }
                this.f16546 = abstractC20745Mo7989.mo8448();
            }
            z = false;
            this.f16546 = abstractC20745Mo7989.mo8448();
        } else {
            z = true;
        }
        if (z) {
            final C11731 c11731Mo7971 = c6794.mo7971();
            c22149.m49141(new InterfaceC5215() { // from class: l.ܳۙ֨
                @Override // l.InterfaceC5215
                /* JADX INFO: renamed from: ۙ */
                public final void mo5013(TextView textView, Button button) {
                    textView.setText(c11731Mo7971.m29324());
                    arrayList.add(button);
                }
            }).m7266(6);
            c22149.m49146(new InterfaceC11566() { // from class: l.֫ۙ֨
                @Override // l.InterfaceC11566
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final void mo5406(TextView textView, TextView textView2, Button button) {
                    C11731 c11731 = c11731Mo7971;
                    textView.setText(c11731.m29326());
                    textView2.setText(c11731.m29320());
                    arrayList.add(button);
                }
            }).m33386();
        }
        if (c6794.mo7986()) {
            c22149.m49145(c6794.mo7978(), new ViewOnClickListenerC17878(2, this)).m9599(6);
            this.f16546 = false;
            this.f16543 = false;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
        }
        if (c6794.m18397()) {
            c22149.m49155();
            c22149.m49159();
            C23519.m51792(c22149.m49160(), this.f16541, c6794);
        } else {
            c22149.m49159();
        }
        if (this.f16543 && abstractC20745Mo7989.mo36912()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(4);
            }
            m12958(true);
            return;
        }
        m12958(false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m12967(InterfaceC2557 interfaceC2557) {
        boolean z;
        String path;
        if (interfaceC2557.mo7985() || !(interfaceC2557 instanceof C6794)) {
            throw new IllegalArgumentException();
        }
        C6794 c6794 = (C6794) interfaceC2557;
        this.f16544 = c6794;
        AbstractC20745 abstractC20745Mo7989 = c6794.mo7989();
        C22149 c22149 = this.f16545;
        c22149.m49153(c6794);
        c22149.m49148(c6794.mo7986() ? R.string.MT_Protector : R.string.MT_Protector);
        c22149.m49157(0L);
        c22149.m49162(c6794.getTime());
        final ArrayList arrayList = new ArrayList(2);
        if (c6794.m18395()) {
            this.f16543 = false;
            this.f16546 = false;
            z = false;
        } else if (C6794.m18392(c6794.mo7971())) {
            if (abstractC20745Mo7989.mo46709()) {
                this.f16543 = false;
            } else {
                try {
                    if (abstractC20745Mo7989 instanceof C14705) {
                        path = ((C14705) abstractC20745Mo7989).m35232();
                    } else {
                        path = c6794.getPath();
                    }
                    c6794.m18394(new C11731(C0055.m951(path)));
                    z = true;
                } catch (IOException unused) {
                    this.f16543 = false;
                    z = false;
                }
                this.f16546 = abstractC20745Mo7989.mo8448();
            }
            z = false;
            this.f16546 = abstractC20745Mo7989.mo8448();
        } else {
            z = true;
        }
        if (z) {
            final C11731 c11731Mo7971 = c6794.mo7971();
            c22149.m49141(new InterfaceC5215() { // from class: l.ۢۙ֨
                @Override // l.InterfaceC5215
                /* JADX INFO: renamed from: ۙ */
                public final void mo5013(TextView textView, Button button) {
                    textView.setText(c11731Mo7971.m29324());
                    arrayList.add(button);
                }
            }).m7266(6);
            c22149.m49146(new InterfaceC11566() { // from class: l.ۗۙ֨
                @Override // l.InterfaceC11566
                /* JADX INFO: renamed from: ۙ */
                public final void mo5406(TextView textView, TextView textView2, Button button) {
                    C11731 c11731 = c11731Mo7971;
                    textView.setText(c11731.m29326());
                    textView2.setText(c11731.m29320());
                    arrayList.add(button);
                }
            }).m33386();
        }
        if (c6794.mo7986()) {
            c22149.m49145(c6794.mo7978(), new ViewOnClickListenerC17878(2, this)).m9599(6);
            this.f16546 = false;
            this.f16543 = false;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
        }
        c22149.m49143(R.string.MT_Protector, new C13958(4)).m9599(8);
        c22149.m49143(R.string.MT_Protector, new C5800(3));
        c22149.m49140();
        c22149.m49159();
        if (this.f16543 && abstractC20745Mo7989.mo36912()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(4);
            }
            m12958(true);
            return;
        }
        m12958(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12965(String str) {
        List list = this.f16547;
        C22149 c22149 = this.f16545;
        c22149.m49152(list);
        c22149.m49150(str, (View.OnLongClickListener) null);
        c22149.m49157(0L);
        c22149.m49143(R.string.MT_Protector, new C12441(8)).m9599(8);
        c22149.m49143(R.string.MT_Protector, new C2271());
        c22149.m49140();
        c22149.m49159();
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        if (abstractC20745M15313.mo46731() && !(abstractC20745M15313 instanceof C17589)) {
            this.f16543 = false;
            this.f16546 = false;
        }
        m12958(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12958(final boolean z) {
        boolean z2 = this.f16546;
        C22149 c22149 = this.f16545;
        if (z2) {
            c22149.m49154(new InterfaceC17295() { // from class: l.ܺۙ֨
                @Override // l.InterfaceC17295
                public final void accept(Object obj) {
                    C3181 c3181 = (C3181) obj;
                    ViewOnClickListenerC22523.m50036(c3181.m9600());
                    c3181.m9600().setOnClickListener(new ViewOnClickListenerC22734(2, this.f50974));
                }
            });
        }
        if (this.f16543) {
            c22149.m49158(new InterfaceC17295() { // from class: l.᩶ۙ֨
                @Override // l.InterfaceC17295
                public final void accept(Object obj) {
                    C2392 c2392 = (C2392) obj;
                    C0674.m3027(c2392.m7265());
                    ViewOnClickListenerC21808 viewOnClickListenerC21808 = new ViewOnClickListenerC21808(1, this.f63870);
                    c2392.m7265().setOnClickListener(viewOnClickListenerC21808);
                    c2392.m7267().setOnClickListener(viewOnClickListenerC21808);
                }
            });
            c22149.m49163(new InterfaceC17295() { // from class: l.֡ۙ֨
                @Override // l.InterfaceC17295
                public final void accept(Object obj) {
                    C13683 c13683 = (C13683) obj;
                    final C4677 c4677 = this.f1280;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.۫ۙ֨
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C4677.m12960(c4677);
                        }
                    };
                    C0674.m3027(c13683.m33389());
                    C0674.m3027(c13683.m33387());
                    c13683.m33389().setOnClickListener(onClickListener);
                    c13683.m33387().setOnClickListener(onClickListener);
                    c13683.m33388().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f16546 || (z && this.f16543)) {
            c22149.m49156().setOnClickListener(new View.OnClickListener() { // from class: l.ܽۙ֨
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4677.m12957(this.f52777, z, view);
                }
            });
        } else {
            c22149.m49156().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12957(C4677 c4677, boolean z, View view) {
        C16195 c16195 = new C16195(view.getContext(), view, 0);
        C12418 c12418M38298 = c16195.m38298();
        if (c4677.f16546) {
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z && c4677.f16543) {
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c16195.m38296((InterfaceC21133) new C16041(c4677));
        c16195.m38297();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12954(C4677 c4677) {
        new C0880(c4677.f16541, c4677.f16547).m3555(new RunnableC10138(1, c4677));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m12953(C4677 c4677) {
        new C20637(c4677.f16541, c4677.f16547).m46506(new RunnableC10138(1, c4677));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m12960(C4677 c4677) {
        new C22754(c4677.f16541, c4677.f16547).m50419(new RunnableC10138(1, c4677));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m12961(final C4677 c4677) {
        C22149 c22149 = c4677.f16545;
        if (c4677.f16544 != null) {
            if (c4677.f16546) {
                c22149.m49154(new InterfaceC17295() { // from class: l.ۛۙ֨
                    @Override // l.InterfaceC17295
                    public final void accept(Object obj) {
                        ((C3181) obj).m9600().setText(C5319.m14744(this.f19781.f16544.getTime()));
                    }
                });
            }
            if (c4677.f16543) {
                final C11731 c11731Mo7971 = c4677.f16544.mo7971();
                c22149.m49158(new InterfaceC17295() { // from class: l.ۧۙ֨
                    @Override // l.InterfaceC17295
                    public final void accept(Object obj) {
                        ((C2392) obj).m7265().setText(c11731Mo7971.m29324());
                    }
                });
                c22149.m49163(new InterfaceC17295() { // from class: l.᩻ۙ֨
                    @Override // l.InterfaceC17295
                    public final void accept(Object obj) {
                        C13683 c13683 = (C13683) obj;
                        TextView textViewM33389 = c13683.m33389();
                        C11731 c11731 = c11731Mo7971;
                        textViewM33389.setText(c11731.m29326());
                        c13683.m33387().setText(c11731.m29320());
                    }
                });
            }
        }
        C5900.m16151(1000);
        C21094.m47530();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12964(DialogInterface.OnDismissListener onDismissListener) {
        this.f16545.m49149(onDismissListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12963(int i, int i2, long j) {
        if (this.f16542 == null) {
            C22149 c22149 = this.f16545;
            this.f16542 = new TextView[]{c22149.m49161(R.string.MT_Protector).m9600(), c22149.m49161(R.string.MT_Protector).m9600(), c22149.m49161(R.string.MT_Protector).m9600()};
        }
        C15052.m36042(this.f16542[0], j);
        this.f16542[1].setText(String.valueOf(i));
        this.f16542[2].setText(String.valueOf(i2));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m12959(C4677 c4677) {
        C11545 c11545 = c4677.f16541;
        AbstractC20745 abstractC20745Mo7989 = c4677.f16544.mo7989();
        String strMo33968 = abstractC20745Mo7989.mo33968();
        if (strMo33968 != null) {
            if (!strMo33968.startsWith("/")) {
                AbstractC20745 abstractC20745M46711 = abstractC20745Mo7989.m46711();
                while (true) {
                    if (abstractC20745M46711 != null) {
                        if (strMo33968.isEmpty() || strMo33968.equals(".")) {
                            strMo33968 = abstractC20745M46711.mo33986();
                            break;
                        }
                        if (strMo33968.equals("..")) {
                            strMo33968 = abstractC20745M46711.getParent();
                            break;
                        } else if (strMo33968.startsWith("./")) {
                            strMo33968 = strMo33968.substring(2);
                        } else if (strMo33968.startsWith("../")) {
                            strMo33968 = strMo33968.substring(3);
                            abstractC20745M46711 = abstractC20745M46711.m46689();
                        } else {
                            strMo33968 = abstractC20745M46711.m46690(strMo33968).mo33986();
                            break;
                        }
                    } else {
                        strMo33968 = abstractC20745Mo7989.mo33986();
                        break;
                    }
                }
            }
        } else {
            strMo33968 = null;
        }
        AbstractC20745 abstractC20745M15313 = strMo33968 != null ? C5553.m15313(strMo33968, new String[0]) : null;
        if (abstractC20745M15313 == null) {
            return;
        }
        c4677.f16545.m49147();
        if (abstractC20745M15313.mo33974()) {
            c11545.m28812(abstractC20745M15313.mo33986(), true);
            return;
        }
        String parent = abstractC20745M15313.getParent();
        if (parent != null) {
            c11545.m28763(abstractC20745M15313.getName());
            c11545.m28812(parent, true);
        } else {
            c11545.m28812(abstractC20745M15313.mo33986(), true);
        }
    }
}
