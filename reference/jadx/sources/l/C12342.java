package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۨ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: BAH0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12342 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8614 f39636;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f39637;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC18881 f39638;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f39639;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List f39640;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC20042 f39641 = null;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public TextView[] f39642;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f39643;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5304 f39644;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30769(C12342 c12342, MenuItem menuItem) {
        List list = c12342.f39640;
        C8614 c8614 = c12342.f39636;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            new C6618(c8614, list).m18555(new RunnableC5631(c12342));
        } else if (itemId == R.string.MT_Protector) {
            new C4885(c8614, list).m14994(new RunnableC5631(c12342));
        } else {
            if (itemId != R.string.MT_Protector) {
                throw new RuntimeException();
            }
            new C0651(c8614, list).m2854(new RunnableC5631(c12342));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30770(C12342 c12342, String str, String str2, TextView textView, TextView textView2, Button button) {
        c12342.getClass();
        ViewOnClickListenerC15284.m36687(textView, str);
        ViewOnClickListenerC15284.m36687(textView2, str2);
        if (c12342.f39637) {
            return;
        }
        button.setVisibility(4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30771(C12342 c12342, C9097 c9097, TextView textView, Button button) {
        c12342.getClass();
        textView.setText(c9097.m24245());
        if (c12342.f39643) {
            return;
        }
        button.setVisibility(4);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30776(C12342 c12342, String str, String str2, TextView textView, TextView textView2, Button button) {
        c12342.getClass();
        ViewOnClickListenerC15284.m36687(textView, str);
        ViewOnClickListenerC15284.m36687(textView2, str2);
        if (c12342.f39637) {
            return;
        }
        button.setVisibility(4);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30777(C12342 c12342, C9097 c9097, TextView textView, Button button) {
        c12342.getClass();
        textView.setText(c9097.m24245());
        if (c12342.f39643) {
            return;
        }
        button.setVisibility(4);
    }

    public C12342(C8614 c8614, List list) {
        this.f39636 = c8614;
        this.f39640 = list;
        AbstractC18881 abstractC18881 = (AbstractC18881) c8614.m23213().mo10174();
        this.f39638 = abstractC18881;
        this.f39643 = abstractC18881.mo35583();
        this.f39637 = abstractC18881.mo35581();
        this.f39639 = abstractC18881.mo35574();
        C5304 c5304 = new C5304(c8614.m23233());
        c5304.m15924();
        c5304.m15925();
        this.f39644 = c5304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30779() {
        this.f39644.m15931();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30783(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.isDirectory() || !(interfaceC2386 instanceof AbstractC20042)) {
            throw new IllegalArgumentException();
        }
        AbstractC20042 abstractC20042 = (AbstractC20042) interfaceC2386;
        this.f39641 = abstractC20042;
        C5304 c5304 = this.f39644;
        c5304.m15919(abstractC20042);
        c5304.m15913(abstractC20042.mo8107() ? R.string.MT_Protector : R.string.MT_Protector);
        c5304.m15922(abstractC20042.getSize());
        if (abstractC20042.getTime() != -1) {
            c5304.m15929(abstractC20042.getTime());
        }
        if (abstractC20042.mo8107()) {
            this.f39643 = false;
            this.f39637 = false;
            this.f39639 = false;
        }
        final C9097 c9097Mo5155 = abstractC20042.mo5155();
        if (c9097Mo5155 != null) {
            c5304.m15906(new InterfaceC12761() { // from class: l.ܺۨ۫
                @Override // l.InterfaceC12761
                /* JADX INFO: renamed from: ۙ */
                public final void mo19441(TextView textView, Button button) {
                    C12342.m30777(this.f54258, c9097Mo5155, textView, button);
                }
            }).m36104(8);
            final String strM24241 = c9097Mo5155.m24241();
            final String strM24237 = c9097Mo5155.m24237();
            if (!TextUtils.isEmpty(strM24241) || !TextUtils.isEmpty(strM24237)) {
                c5304.m15911(new InterfaceC19474() { // from class: l.ܽۨ۫
                    @Override // l.InterfaceC19474
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo12172(TextView textView, TextView textView2, Button button) {
                        C12342.m30770(this.f57065, strM24241, strM24237, textView, textView2, button);
                    }
                }).m50629();
            }
        } else {
            this.f39643 = false;
            this.f39637 = false;
        }
        if (abstractC20042.mo8107()) {
            c5304.m15910(abstractC20042.mo8112(), (View.OnClickListener) null).m49281(6);
        }
        c5304.m15926();
        c5304.m15920();
        C10060.m26010(c5304.m15927(), this.f39636, this.f39641);
        m30784(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30785(InterfaceC2386 interfaceC2386) {
        if (interfaceC2386.mo8090() || !(interfaceC2386 instanceof AbstractC20042)) {
            throw new IllegalArgumentException();
        }
        AbstractC20042 abstractC20042 = (AbstractC20042) interfaceC2386;
        this.f39641 = abstractC20042;
        C5304 c5304 = this.f39644;
        c5304.m15919(abstractC20042);
        c5304.m15913(abstractC20042.mo8107() ? R.string.MT_Protector : R.string.MT_Protector);
        c5304.m15922(0L);
        if (abstractC20042.getTime() != -1) {
            c5304.m15929(abstractC20042.getTime());
        }
        if (abstractC20042.mo8107()) {
            this.f39643 = false;
            this.f39637 = false;
            this.f39639 = false;
        }
        final C9097 c9097Mo5155 = abstractC20042.mo5155();
        if (c9097Mo5155 != null) {
            c5304.m15906(new InterfaceC12761() { // from class: l.ܶۨ۫
                @Override // l.InterfaceC12761
                /* JADX INFO: renamed from: ۙ */
                public final void mo19441(TextView textView, Button button) {
                    C12342.m30771(this.f52077, c9097Mo5155, textView, button);
                }
            }).m36104(8);
            final String strM24241 = c9097Mo5155.m24241();
            final String strM24237 = c9097Mo5155.m24237();
            if (!TextUtils.isEmpty(strM24241) || !TextUtils.isEmpty(strM24237)) {
                c5304.m15911(new InterfaceC19474() { // from class: l.᩹ۨ۫
                    @Override // l.InterfaceC19474
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo12172(TextView textView, TextView textView2, Button button) {
                        C12342.m30776(this.f76024, strM24241, strM24237, textView, textView2, button);
                    }
                }).m50629();
            }
        } else {
            this.f39643 = false;
            this.f39637 = false;
        }
        c5304.m15908(R.string.MT_Protector, new C22972()).m49281(8);
        c5304.m15908(R.string.MT_Protector, new C24770());
        if (abstractC20042.mo8107()) {
            c5304.m15910(abstractC20042.mo8112(), (View.OnClickListener) null).m49281(6);
        }
        c5304.m15905();
        c5304.m15920();
        m30784(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30782(String str) {
        List list = this.f39640;
        C5304 c5304 = this.f39644;
        c5304.m15917(list);
        c5304.m15915(str, (View.OnLongClickListener) null);
        c5304.m15922(0L);
        c5304.m15908(R.string.MT_Protector, new C3769()).m49281(8);
        c5304.m15908(R.string.MT_Protector, new C7750());
        c5304.m15905();
        c5304.m15920();
        m30784(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30784(final boolean z) {
        boolean z2 = this.f39639;
        C5304 c5304 = this.f39644;
        if (z2) {
            c5304.m15918(new InterfaceC0818() { // from class: l.ۗۨ۫
                @Override // l.InterfaceC0818
                public final void accept(Object obj) {
                    C21712 c21712 = (C21712) obj;
                    ViewOnClickListenerC15284.m36688(c21712.m49282());
                    TextView textViewM49282 = c21712.m49282();
                    final C12342 c12342 = this.f11041;
                    textViewM49282.setOnClickListener(new View.OnClickListener() { // from class: l.᩸ۨ۫
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C12342.m30768(c12342);
                        }
                    });
                }
            });
        }
        if (this.f39643) {
            c5304.m15923(new InterfaceC0818() { // from class: l.᩵ۨ۫
                @Override // l.InterfaceC0818
                public final void accept(Object obj) {
                    C14998 c14998 = (C14998) obj;
                    C17423.m40911(c14998.m36106());
                    final C12342 c12342 = this.f65784;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ᩴۨ۫
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C12342.m30778(c12342);
                        }
                    };
                    c14998.m36106().setOnClickListener(onClickListener);
                    c14998.m36105().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f39637) {
            c5304.m15930(new InterfaceC0818() { // from class: l.᩷ۨ۫
                @Override // l.InterfaceC0818
                public final void accept(Object obj) {
                    C22458 c22458 = (C22458) obj;
                    C17423.m40911(c22458.m50627());
                    C17423.m40911(c22458.m50628());
                    final C12342 c12342 = this.f71081;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.۫ۨ۫
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C12342.m30774(c12342);
                        }
                    };
                    c22458.m50627().setOnClickListener(onClickListener);
                    c22458.m50628().setOnClickListener(onClickListener);
                    c22458.m50626().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f39639 || (z && (this.f39643 || this.f39637))) {
            c5304.m15921().setOnClickListener(new View.OnClickListener() { // from class: l.ۤۨ۫
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C12342.m30773(this.f34357, z, view);
                }
            });
        } else {
            c5304.m15921().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30773(final C12342 c12342, boolean z, View view) {
        C18452 c18452 = new C18452(view.getContext(), view, 0);
        C9898 c9898M42995 = c18452.m42995();
        if (c12342.f39639) {
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z && c12342.f39643) {
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z && c12342.f39637) {
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c18452.m42994(new InterfaceC21436() { // from class: l.ܳۨ۫
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C12342.m30769(this.f50069, menuItem);
                return true;
            }
        });
        c18452.mo21878();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30768(C12342 c12342) {
        new C6618(c12342.f39636, c12342.f39640).m18555(new RunnableC5631(c12342));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m30778(C12342 c12342) {
        new C4885(c12342.f39636, c12342.f39640).m14994(new RunnableC5631(c12342));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m30774(C12342 c12342) {
        new C0651(c12342.f39636, c12342.f39640).m2854(new RunnableC5631(c12342));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30775(final C12342 c12342) {
        final C9097 c9097Mo5155;
        final C9097 c9097Mo5156;
        C5304 c5304 = c12342.f39644;
        if (c12342.f39641 != null) {
            if (c12342.f39639) {
                c5304.m15918(new InterfaceC0818() { // from class: l.֫ۨ۫
                    @Override // l.InterfaceC0818
                    public final void accept(Object obj) {
                        ((C21712) obj).m49282().setText(C22482.m50718(this.f6401.f39641.getTime()));
                    }
                });
            }
            if (c12342.f39643 && (c9097Mo5156 = c12342.f39641.mo5155()) != null) {
                c5304.m15923(new InterfaceC0818() { // from class: l.ۧۨ۫
                    @Override // l.InterfaceC0818
                    public final void accept(Object obj) {
                        ((C14998) obj).m36106().setText(c9097Mo5156.m24245());
                    }
                });
            }
            if (c12342.f39637 && (c9097Mo5155 = c12342.f39641.mo5155()) != null) {
                c5304.m15930(new InterfaceC0818() { // from class: l.᩻ۨ۫
                    @Override // l.InterfaceC0818
                    public final void accept(Object obj) {
                        C22458 c22458 = (C22458) obj;
                        TextView textViewM50627 = c22458.m50627();
                        C9097 c9097 = c9097Mo5155;
                        textViewM50627.setText(c9097.m24241());
                        c22458.m50628().setText(c9097.m24237());
                    }
                });
            }
        }
        C3966.m12724(1000);
        C6331.m18054(c12342.f39638.mo35579());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30781(DialogInterface.OnDismissListener onDismissListener) {
        this.f39644.m15914(onDismissListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30780(int i, int i2, long j) {
        if (this.f39642 == null) {
            C5304 c5304 = this.f39644;
            this.f39642 = new TextView[]{c5304.m15928(R.string.MT_Protector).m49282(), c5304.m15928(R.string.MT_Protector).m49282(), c5304.m15928(R.string.MT_Protector).m49282()};
        }
        C16773.m39593(this.f39642[0], j);
        this.f39642[1].setText(String.valueOf(i));
        this.f39642[2].setText(String.valueOf(i2));
    }
}
