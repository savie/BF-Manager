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

/* JADX INFO: renamed from: l.ۙ᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 65FC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5258 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5304 f18528;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8614 f18529;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f18530;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C6004 f18531;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public TextView[] f18533;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f18532 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18527 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15816(C5258 c5258, MenuItem menuItem) {
        List list = c5258.f18530;
        C8614 c8614 = c5258.f18529;
        if (menuItem.getItemId() == R.string.MT_Protector) {
            new C5609(c8614, list).m16588(new RunnableC3547(2, c5258));
        } else if (menuItem.getItemId() == R.string.MT_Protector) {
            new C4117(c8614, list).m13214(new RunnableC3547(2, c5258));
        } else {
            new C16795(c8614, list).m39659(new RunnableC3547(2, c5258));
        }
    }

    public C5258(C8614 c8614, List list) {
        this.f18529 = c8614;
        this.f18530 = list;
        C5304 c5304 = new C5304(c8614.m23233());
        c5304.m15924();
        c5304.m15925();
        this.f18528 = c5304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15824() {
        this.f18528.m15931();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15828(InterfaceC2386 interfaceC2386) {
        boolean z;
        String path;
        if (interfaceC2386.isDirectory() || !(interfaceC2386 instanceof C6004)) {
            throw new IllegalArgumentException();
        }
        C6004 c6004 = (C6004) interfaceC2386;
        this.f18531 = c6004;
        AbstractC22044 abstractC22044Mo8093 = c6004.mo8093();
        C5304 c5304 = this.f18528;
        c5304.m15919(c6004);
        c5304.m15913(c6004.mo8107() ? R.string.MT_Protector : R.string.MT_Protector);
        final long size = c6004.getSize();
        final long jMo8104 = c6004.mo8104();
        if (jMo8104 != -1 && size != jMo8104) {
            c5304.m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.ܰۧ۫
                @Override // l.InterfaceC10523
                public final void accept(TextView textView) {
                    C16773.m39592(textView, size);
                }
            }).m49281(8);
            c5304.m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.ۖۧ۫
                @Override // l.InterfaceC10523
                public final void accept(TextView textView) {
                    C16773.m39592(textView, jMo8104);
                }
            });
            c5304.m15929(c6004.getTime()).m49281(8);
        } else {
            c5304.m15922(size);
            c5304.m15929(c6004.getTime());
        }
        final ArrayList arrayList = new ArrayList(2);
        if (C6004.m17446(c6004.mo5155())) {
            if (abstractC22044Mo8093.mo49854()) {
                this.f18527 = false;
            } else {
                try {
                    if (abstractC22044Mo8093 instanceof C17063) {
                        path = ((C17063) abstractC22044Mo8093).m40200();
                    } else {
                        path = c6004.getPath();
                    }
                    c6004.m17447(new C9097(C14453.m34906(path)));
                    z = true;
                } catch (IOException unused) {
                    this.f18527 = false;
                    z = false;
                }
                this.f18532 = abstractC22044Mo8093.mo2945();
            }
            z = false;
            this.f18532 = abstractC22044Mo8093.mo2945();
        } else {
            z = true;
        }
        if (z) {
            final C9097 c9097Mo5155 = c6004.mo5155();
            c5304.m15906(new InterfaceC12761() { // from class: l.۠ۧ۫
                @Override // l.InterfaceC12761
                /* JADX INFO: renamed from: ۙ */
                public final void mo19441(TextView textView, Button button) {
                    textView.setText(c9097Mo5155.m24245());
                    arrayList.add(button);
                }
            }).m36104(6);
            c5304.m15911(new C11497(c9097Mo5155, arrayList)).m50629();
        }
        if (c6004.mo8107()) {
            c5304.m15910(c6004.mo8112(), new ViewOnClickListenerC4356(2, this)).m49281(6);
            this.f18532 = false;
            this.f18527 = false;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
        }
        if (c6004.m17448()) {
            c5304.m15926();
            c5304.m15920();
            C10060.m26010(c5304.m15927(), this.f18529, c6004);
        } else {
            c5304.m15920();
        }
        if (this.f18527 && abstractC22044Mo8093.mo4295()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(4);
            }
            m15819(true);
            return;
        }
        m15819(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15829(InterfaceC2386 interfaceC2386) {
        boolean z;
        String path;
        if (interfaceC2386.mo8090() || !(interfaceC2386 instanceof C6004)) {
            throw new IllegalArgumentException();
        }
        C6004 c6004 = (C6004) interfaceC2386;
        this.f18531 = c6004;
        AbstractC22044 abstractC22044Mo8093 = c6004.mo8093();
        C5304 c5304 = this.f18528;
        c5304.m15919(c6004);
        c5304.m15913(c6004.mo8107() ? R.string.MT_Protector : R.string.MT_Protector);
        c5304.m15922(0L);
        c5304.m15929(c6004.getTime());
        final ArrayList arrayList = new ArrayList(2);
        if (c6004.m17451()) {
            this.f18527 = false;
            this.f18532 = false;
            z = false;
        } else if (C6004.m17446(c6004.mo5155())) {
            if (abstractC22044Mo8093.mo49854()) {
                this.f18527 = false;
            } else {
                try {
                    if (abstractC22044Mo8093 instanceof C17063) {
                        path = ((C17063) abstractC22044Mo8093).m40200();
                    } else {
                        path = c6004.getPath();
                    }
                    c6004.m17447(new C9097(C14453.m34906(path)));
                    z = true;
                } catch (IOException unused) {
                    this.f18527 = false;
                    z = false;
                }
                this.f18532 = abstractC22044Mo8093.mo2945();
            }
            z = false;
            this.f18532 = abstractC22044Mo8093.mo2945();
        } else {
            z = true;
        }
        if (z) {
            final C9097 c9097Mo5155 = c6004.mo5155();
            c5304.m15906(new InterfaceC12761() { // from class: l.ۜۧ۫
                @Override // l.InterfaceC12761
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final void mo19441(TextView textView, Button button) {
                    textView.setText(c9097Mo5155.m24245());
                    arrayList.add(button);
                }
            }).m36104(6);
            c5304.m15911(new C21510(c9097Mo5155, arrayList)).m50629();
        }
        if (c6004.mo8107()) {
            c5304.m15910(c6004.mo8112(), new ViewOnClickListenerC4356(2, this)).m49281(6);
            this.f18532 = false;
            this.f18527 = false;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
        }
        c5304.m15908(R.string.MT_Protector, new C16076()).m49281(8);
        c5304.m15908(R.string.MT_Protector, new C6421());
        c5304.m15905();
        c5304.m15920();
        if (this.f18527 && abstractC22044Mo8093.mo4295()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(4);
            }
            m15819(true);
            return;
        }
        m15819(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15827(String str) {
        List list = this.f18530;
        C5304 c5304 = this.f18528;
        c5304.m15917(list);
        c5304.m15915(str, (View.OnLongClickListener) null);
        c5304.m15922(0L);
        c5304.m15908(R.string.MT_Protector, new C13811()).m49281(8);
        c5304.m15908(R.string.MT_Protector, new C18063());
        c5304.m15905();
        c5304.m15920();
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
        if (abstractC22044M35193.mo7468() && !(abstractC22044M35193 instanceof C0678)) {
            this.f18527 = false;
            this.f18532 = false;
        }
        m15819(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15819(final boolean z) {
        boolean z2 = this.f18532;
        C5304 c5304 = this.f18528;
        if (z2) {
            c5304.m15918(new InterfaceC0818() { // from class: l.᩶ۧ۫
                @Override // l.InterfaceC0818
                public final void accept(Object obj) {
                    C21712 c21712 = (C21712) obj;
                    ViewOnClickListenerC15284.m36688(c21712.m49282());
                    TextView textViewM49282 = c21712.m49282();
                    final C5258 c5258 = this.f67833;
                    textViewM49282.setOnClickListener(new View.OnClickListener() { // from class: l.ۡۧ۫
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C5258.m15815(c5258);
                        }
                    });
                }
            });
        }
        if (this.f18527) {
            c5304.m15923(new InterfaceC0818() { // from class: l.ܿۧ۫
                @Override // l.InterfaceC0818
                public final void accept(Object obj) {
                    C14998 c14998 = (C14998) obj;
                    C17423.m40911(c14998.m36106());
                    final C5258 c5258 = this.f59635;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۢۧ۫
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C5258.m15823(c5258);
                        }
                    };
                    c14998.m36106().setOnClickListener(onClickListener);
                    c14998.m36105().setOnClickListener(onClickListener);
                }
            });
            c5304.m15930(new InterfaceC0818() { // from class: l.֡ۧ۫
                @Override // l.InterfaceC0818
                public final void accept(Object obj) {
                    C22458 c22458 = (C22458) obj;
                    final C5258 c5258 = this.f1933;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.֨ۧ۫
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C5258.m15820(c5258);
                        }
                    };
                    C17423.m40911(c22458.m50627());
                    C17423.m40911(c22458.m50628());
                    c22458.m50627().setOnClickListener(onClickListener);
                    c22458.m50628().setOnClickListener(onClickListener);
                    c22458.m50626().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f18532 || (z && this.f18527)) {
            c5304.m15921().setOnClickListener(new View.OnClickListener() { // from class: l.۟ۧ۫
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C5258.m15818(this.f26134, z, view);
                }
            });
        } else {
            c5304.m15921().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15818(final C5258 c5258, boolean z, View view) {
        C18452 c18452 = new C18452(view.getContext(), view, 0);
        C9898 c9898M42995 = c18452.m42995();
        if (c5258.f18532) {
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z && c5258.f18527) {
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c18452.m42994(new InterfaceC21436() { // from class: l.ᩳۧ۫
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C5258.m15816(this.f61657, menuItem);
                return true;
            }
        });
        c18452.mo21878();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15815(C5258 c5258) {
        new C5609(c5258.f18529, c5258.f18530).m16588(new RunnableC3547(2, c5258));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m15823(C5258 c5258) {
        new C4117(c5258.f18529, c5258.f18530).m13214(new RunnableC3547(2, c5258));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m15820(C5258 c5258) {
        new C16795(c5258.f18529, c5258.f18530).m39659(new RunnableC3547(2, c5258));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m15822(C5258 c5258) {
        C5304 c5304 = c5258.f18528;
        if (c5258.f18531 != null) {
            if (c5258.f18532) {
                c5304.m15918(new C20764(1, c5258));
            }
            if (c5258.f18527) {
                C9097 c9097Mo5155 = c5258.f18531.mo5155();
                int i = 1;
                c5304.m15923(new C1172(i, c9097Mo5155));
                c5304.m15930(new C9374(i, c9097Mo5155));
            }
        }
        C3966.m12724(1000);
        C6331.m18055();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15826(DialogInterface.OnDismissListener onDismissListener) {
        this.f18528.m15914(onDismissListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15825(int i, int i2, long j) {
        if (this.f18533 == null) {
            C5304 c5304 = this.f18528;
            this.f18533 = new TextView[]{c5304.m15928(R.string.MT_Protector).m49282(), c5304.m15928(R.string.MT_Protector).m49282(), c5304.m15928(R.string.MT_Protector).m49282()};
        }
        C16773.m39593(this.f18533[0], j);
        this.f18533[1].setText(String.valueOf(i));
        this.f18533[2].setText(String.valueOf(i2));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m15821(C5258 c5258) {
        C8614 c8614 = c5258.f18529;
        AbstractC22044 abstractC22044Mo8093 = c5258.f18531.mo8093();
        String strMo2954 = abstractC22044Mo8093.mo2954();
        if (strMo2954 != null) {
            if (!strMo2954.startsWith("/")) {
                AbstractC22044 abstractC22044M49856 = abstractC22044Mo8093.m49856();
                while (true) {
                    if (abstractC22044M49856 != null) {
                        if (strMo2954.isEmpty() || strMo2954.equals(".")) {
                            strMo2954 = abstractC22044M49856.mo4294();
                            break;
                        }
                        if (strMo2954.equals("..")) {
                            strMo2954 = abstractC22044M49856.getParent();
                            break;
                        } else if (strMo2954.startsWith("./")) {
                            strMo2954 = strMo2954.substring(2);
                        } else if (strMo2954.startsWith("../")) {
                            strMo2954 = strMo2954.substring(3);
                            abstractC22044M49856 = abstractC22044M49856.m49858();
                        } else {
                            strMo2954 = abstractC22044M49856.m49876(strMo2954).mo4294();
                            break;
                        }
                    } else {
                        strMo2954 = abstractC22044Mo8093.mo4294();
                        break;
                    }
                }
            }
        } else {
            strMo2954 = null;
        }
        AbstractC22044 abstractC22044M35193 = strMo2954 != null ? C14584.m35193(strMo2954, new String[0]) : null;
        if (abstractC22044M35193 == null) {
            return;
        }
        c5258.f18528.m15912();
        if (abstractC22044M35193.mo4281()) {
            c8614.m23226(abstractC22044M35193.mo4294(), true);
            return;
        }
        String parent = abstractC22044M35193.getParent();
        if (parent != null) {
            c8614.m23230(abstractC22044M35193.getName());
            c8614.m23226(parent, true);
        } else {
            c8614.m23226(abstractC22044M35193.mo4294(), true);
        }
    }
}
