package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: BAH0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19205 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List f62018;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22149 f62019;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C11545 f62020;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f62021;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public TextView[] f62022;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f62023;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC12233 f62024;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f62025;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC5362 f62026 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44110(C19205 c19205, MenuItem menuItem) {
        List list = c19205.f62018;
        C11545 c11545 = c19205.f62020;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            new C7479(c11545, list).m19978(new RunnableC3681(c19205));
        } else if (itemId == R.string.MT_Protector) {
            new C13561(c11545, list).m33156(new RunnableC3681(c19205));
        } else {
            if (itemId != R.string.MT_Protector) {
                throw new RuntimeException();
            }
            new C12419(c11545, list).m30884(new RunnableC3681(c19205));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44111(C19205 c19205, String str, String str2, TextView textView, TextView textView2, Button button) {
        c19205.getClass();
        ViewOnClickListenerC22523.m50035(textView, str);
        ViewOnClickListenerC22523.m50035(textView2, str2);
        if (c19205.f62021) {
            return;
        }
        button.setVisibility(4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44113(C19205 c19205, C11731 c11731, TextView textView, Button button) {
        c19205.getClass();
        textView.setText(c11731.m29324());
        if (c19205.f62025) {
            return;
        }
        button.setVisibility(4);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44117(C19205 c19205, String str, String str2, TextView textView, TextView textView2, Button button) {
        c19205.getClass();
        ViewOnClickListenerC22523.m50035(textView, str);
        ViewOnClickListenerC22523.m50035(textView2, str2);
        if (c19205.f62021) {
            return;
        }
        button.setVisibility(4);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44118(C19205 c19205, C11731 c11731, TextView textView, Button button) {
        c19205.getClass();
        textView.setText(c11731.m29324());
        if (c19205.f62025) {
            return;
        }
        button.setVisibility(4);
    }

    public C19205(C11545 c11545, List list) {
        this.f62020 = c11545;
        this.f62018 = list;
        AbstractC12233 abstractC12233 = (AbstractC12233) c11545.m28817().mo13029();
        this.f62024 = abstractC12233;
        this.f62025 = abstractC12233.mo10277();
        this.f62021 = abstractC12233.mo10259();
        this.f62023 = abstractC12233.mo10271();
        C22149 c22149 = new C22149(c11545.m28824());
        c22149.m49138();
        c22149.m49164();
        this.f62019 = c22149;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44119() {
        this.f62019.m49139();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44123(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.isDirectory() || !(interfaceC2557 instanceof AbstractC5362)) {
            throw new IllegalArgumentException();
        }
        AbstractC5362 abstractC5362 = (AbstractC5362) interfaceC2557;
        this.f62026 = abstractC5362;
        C22149 c22149 = this.f62019;
        c22149.m49153(abstractC5362);
        c22149.m49148(abstractC5362.mo7986() ? R.string.MT_Protector : R.string.MT_Protector);
        c22149.m49157(abstractC5362.getSize());
        if (abstractC5362.getTime() != -1) {
            c22149.m49162(abstractC5362.getTime());
        }
        if (abstractC5362.mo7986()) {
            this.f62025 = false;
            this.f62021 = false;
            this.f62023 = false;
        }
        final C11731 c11731Mo7971 = abstractC5362.mo7971();
        if (c11731Mo7971 != null) {
            c22149.m49141(new InterfaceC5215() { // from class: l.᩺ۘ֨
                @Override // l.InterfaceC5215
                /* JADX INFO: renamed from: ۙ */
                public final void mo5013(TextView textView, Button button) {
                    C19205.m44118(this.f74059, c11731Mo7971, textView, button);
                }
            }).m7266(8);
            final String strM29326 = c11731Mo7971.m29326();
            final String strM29320 = c11731Mo7971.m29320();
            if (!TextUtils.isEmpty(strM29326) || !TextUtils.isEmpty(strM29320)) {
                c22149.m49146(new InterfaceC11566() { // from class: l.ܶۘ֨
                    @Override // l.InterfaceC11566
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo5406(TextView textView, TextView textView2, Button button) {
                        C19205.m44111(this.f48879, strM29326, strM29320, textView, textView2, button);
                    }
                }).m33386();
            }
        } else {
            this.f62025 = false;
            this.f62021 = false;
        }
        if (abstractC5362.mo7986()) {
            c22149.m49145(abstractC5362.mo7978(), (View.OnClickListener) null).m9599(6);
        }
        c22149.m49155();
        c22149.m49159();
        C23519.m51792(c22149.m49160(), this.f62020, this.f62026);
        m44124(false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44125(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.mo7985() || !(interfaceC2557 instanceof AbstractC5362)) {
            throw new IllegalArgumentException();
        }
        AbstractC5362 abstractC5362 = (AbstractC5362) interfaceC2557;
        this.f62026 = abstractC5362;
        C22149 c22149 = this.f62019;
        c22149.m49153(abstractC5362);
        c22149.m49148(abstractC5362.mo7986() ? R.string.MT_Protector : R.string.MT_Protector);
        c22149.m49157(0L);
        if (abstractC5362.getTime() != -1) {
            c22149.m49162(abstractC5362.getTime());
        }
        if (abstractC5362.mo7986()) {
            this.f62025 = false;
            this.f62021 = false;
            this.f62023 = false;
        }
        final C11731 c11731Mo7971 = abstractC5362.mo7971();
        if (c11731Mo7971 != null) {
            c22149.m49141(new InterfaceC5215() { // from class: l.᩸ۘ֨
                @Override // l.InterfaceC5215
                /* JADX INFO: renamed from: ۙ */
                public final void mo5013(TextView textView, Button button) {
                    C19205.m44113(this.f69388, c11731Mo7971, textView, button);
                }
            }).m7266(8);
            final String strM29326 = c11731Mo7971.m29326();
            final String strM29320 = c11731Mo7971.m29320();
            if (!TextUtils.isEmpty(strM29326) || !TextUtils.isEmpty(strM29320)) {
                c22149.m49146(new InterfaceC11566() { // from class: l.ᩳۘ֨
                    @Override // l.InterfaceC11566
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo5406(TextView textView, TextView textView2, Button button) {
                        C19205.m44117(this.f56407, strM29326, strM29320, textView, textView2, button);
                    }
                }).m33386();
            }
        } else {
            this.f62025 = false;
            this.f62021 = false;
        }
        c22149.m49143(R.string.MT_Protector, new C18855(4)).m9599(8);
        c22149.m49143(R.string.MT_Protector, new C9576());
        if (abstractC5362.mo7986()) {
            c22149.m49145(abstractC5362.mo7978(), (View.OnClickListener) null).m9599(6);
        }
        c22149.m49140();
        c22149.m49159();
        m44124(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44122(String str) {
        List list = this.f62018;
        C22149 c22149 = this.f62019;
        c22149.m49152(list);
        c22149.m49150(str, (View.OnLongClickListener) null);
        c22149.m49157(0L);
        c22149.m49143(R.string.MT_Protector, new C19084(7)).m9599(8);
        c22149.m49143(R.string.MT_Protector, new C8479());
        c22149.m49140();
        c22149.m49159();
        m44124(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44124(final boolean z) {
        boolean z2 = this.f62023;
        C22149 c22149 = this.f62019;
        if (z2) {
            c22149.m49154(new InterfaceC17295() { // from class: l.ᩴۘ֨
                @Override // l.InterfaceC17295
                public final void accept(Object obj) {
                    C3181 c3181 = (C3181) obj;
                    ViewOnClickListenerC22523.m50036(c3181.m9600());
                    TextView textViewM9600 = c3181.m9600();
                    final C19205 c19205 = this.f58939;
                    textViewM9600.setOnClickListener(new View.OnClickListener() { // from class: l.ۚۘ֨
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C19205.m44109(c19205);
                        }
                    });
                }
            });
        }
        if (this.f62025) {
            c22149.m49158(new InterfaceC17295() { // from class: l.۠ۘ֨
                @Override // l.InterfaceC17295
                public final void accept(Object obj) {
                    C2392 c2392 = (C2392) obj;
                    C0674.m3027(c2392.m7265());
                    final C19205 c19205 = this.f25998;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩹ۘ֨
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C19205.m44108(c19205);
                        }
                    };
                    c2392.m7265().setOnClickListener(onClickListener);
                    c2392.m7267().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f62021) {
            c22149.m49163(new InterfaceC17295() { // from class: l.ۨۘ֨
                @Override // l.InterfaceC17295
                public final void accept(Object obj) {
                    C13683 c13683 = (C13683) obj;
                    C0674.m3027(c13683.m33389());
                    C0674.m3027(c13683.m33387());
                    final C19205 c19205 = this.f38508;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.۬ۘ֨
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C19205.m44115(c19205);
                        }
                    };
                    c13683.m33389().setOnClickListener(onClickListener);
                    c13683.m33387().setOnClickListener(onClickListener);
                    c13683.m33388().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f62023 || (z && (this.f62025 || this.f62021))) {
            c22149.m49156().setOnClickListener(new View.OnClickListener() { // from class: l.ۖۘ֨
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C19205.m44114(this.f8113, z, view);
                }
            });
        } else {
            c22149.m49156().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44114(final C19205 c19205, boolean z, View view) {
        C16195 c16195 = new C16195(view.getContext(), view, 0);
        C12418 c12418M38298 = c16195.m38298();
        if (c19205.f62023) {
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z && c19205.f62025) {
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z && c19205.f62021) {
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c16195.m38296(new InterfaceC21133() { // from class: l.֨ۘ֨
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C19205.m44110(this.f3511, menuItem);
                return true;
            }
        });
        c16195.m38297();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44109(C19205 c19205) {
        new C7479(c19205.f62020, c19205.f62018).m19978(new RunnableC3681(c19205));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m44108(C19205 c19205) {
        new C13561(c19205.f62020, c19205.f62018).m33156(new RunnableC3681(c19205));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m44115(C19205 c19205) {
        new C12419(c19205.f62020, c19205.f62018).m30884(new RunnableC3681(c19205));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m44116(final C19205 c19205) {
        C11731 c11731Mo7971;
        C11731 c11731Mo7972;
        C22149 c22149 = c19205.f62019;
        if (c19205.f62026 != null) {
            if (c19205.f62023) {
                c22149.m49154(new InterfaceC17295() { // from class: l.ۜۘ֨
                    @Override // l.InterfaceC17295
                    public final void accept(Object obj) {
                        ((C3181) obj).m9600().setText(C5319.m14744(this.f21917.f62026.getTime()));
                    }
                });
            }
            if (c19205.f62025 && (c11731Mo7972 = c19205.f62026.mo7971()) != null) {
                c22149.m49158(new C23360(1, c11731Mo7972));
            }
            if (c19205.f62021 && (c11731Mo7971 = c19205.f62026.mo7971()) != null) {
                c22149.m49163(new C14188(1, c11731Mo7971));
            }
        }
        C5900.m16151(1000);
        C21094.m47529(c19205.f62024.mo10276());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44121(DialogInterface.OnDismissListener onDismissListener) {
        this.f62019.m49149(onDismissListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44120(int i, int i2, long j) {
        if (this.f62022 == null) {
            C22149 c22149 = this.f62019;
            this.f62022 = new TextView[]{c22149.m49161(R.string.MT_Protector).m9600(), c22149.m49161(R.string.MT_Protector).m9600(), c22149.m49161(R.string.MT_Protector).m9600()};
        }
        C15052.m36042(this.f62022[0], j);
        this.f62022[1].setText(String.valueOf(i));
        this.f62022[2].setText(String.valueOf(i2));
    }
}
