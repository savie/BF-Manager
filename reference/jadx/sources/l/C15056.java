package l;

import android.animation.ObjectAnimator;
import android.view.MenuItem;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8VQ */
/* JADX INFO: loaded from: classes4.dex */
public class C15056 extends AbstractC8956 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f49063;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9186 f49064;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f49065;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C9186 f49066;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f49067;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f49068;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C9186 f49069;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C9186 f49070;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9186 f49071;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f49072;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9186 f49073;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f49074;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f49075;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9186 f49076;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9186 f49077;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9186 f49078;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C9186 f49079;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9186 f49080;

    public C15056() {
        Boolean bool = Boolean.FALSE;
        this.f49071 = new C9186(bool);
        this.f49074 = new C9186(bool);
        this.f49063 = new C9186(bool);
        this.f49067 = new C9186(bool);
        this.f49068 = new C9186(bool);
        this.f49079 = new C9186(bool);
        this.f49069 = new C9186(bool);
        this.f49066 = new C9186(bool);
        this.f49070 = new C9186(bool);
        this.f49077 = new C9186(bool);
        this.f49078 = new C9186(bool);
        this.f49064 = new C9186();
        this.f49076 = new C9186(0);
        this.f49080 = new C9186(-1);
        this.f49065 = new C9186();
        this.f49072 = new C9186(0);
        this.f49075 = new C9186(-1);
        this.f49073 = new C9186();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36065(ActivityC4471 activityC4471, C5094 c5094) {
        this.f49071.m44959(activityC4471, c5094);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m36055(boolean z) {
        this.f49071.mo23642(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36062(ActivityC4471 activityC4471, final MenuItem menuItem, final MenuItem menuItem2, final C5622 c5622, final C5622 c5623) {
        int defaultColor = C20368.f65968.getDefaultColor();
        c5622.m15506(defaultColor);
        c5623.m15506(defaultColor);
        menuItem.setIcon(c5622);
        menuItem2.setIcon(c5623);
        this.f49063.m44959(activityC4471, new InterfaceC10597() { // from class: l.ۖۜۖ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C15056.m36050(this.f8303, c5622, menuItem, (Boolean) obj);
            }
        });
        this.f49067.m44959(activityC4471, new InterfaceC10597() { // from class: l.ۚۜۖ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C15056.m36049(this.f17969, c5623, menuItem2, (Boolean) obj);
            }
        });
        this.f49074.m44959(activityC4471, new InterfaceC10597() { // from class: l.᩹ۜۖ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C15056.m36048(this.f71590, menuItem, menuItem2, c5622, c5623, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36050(C15056 c15056, C5622 c5622, MenuItem menuItem, Boolean bool) {
        c5622.m15505(bool.booleanValue() ? 1.0f : 0.45f);
        if (Boolean.TRUE.equals(c15056.f49074.m44956())) {
            menuItem.setEnabled(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36049(C15056 c15056, C5622 c5622, MenuItem menuItem, Boolean bool) {
        c5622.m15505(bool.booleanValue() ? 1.0f : 0.45f);
        if (Boolean.TRUE.equals(c15056.f49074.m44956())) {
            menuItem.setEnabled(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36048(C15056 c15056, MenuItem menuItem, MenuItem menuItem2, C5622 c5622, C5622 c5623, Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            menuItem.setTitle(R.string.MT_Protector);
            menuItem2.setTitle(R.string.MT_Protector);
            menuItem.setEnabled(bool2.equals(c15056.f49063.m44956()));
            menuItem2.setEnabled(bool2.equals(c15056.f49067.m44956()));
            c5622.m15503(300);
            c5623.m15503(300);
            return;
        }
        menuItem.setTitle(R.string.MT_Protector);
        menuItem2.setTitle(R.string.MT_Protector);
        menuItem.setEnabled(true);
        menuItem2.setEnabled(true);
        c5622.m15504();
        c5623.m15504();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m36067() {
        Boolean bool = Boolean.FALSE;
        C9186 c9186 = this.f49074;
        c9186.mo23642(Boolean.valueOf(bool.equals(c9186.m44956())));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m36056() {
        return Boolean.TRUE.equals(this.f49074.m44956());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m36070(boolean z) {
        C9186 c9186 = this.f49063;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m36052(boolean z) {
        C9186 c9186 = this.f49067;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m36051(ActivityC4471 activityC4471, MenuItem menuItem) {
        C0943 c0943 = new C0943(0, this, menuItem);
        this.f49068.m44959(activityC4471, c0943);
        this.f49079.m44959(activityC4471, c0943);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m36075(boolean z) {
        C9186 c9186 = this.f49068;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m36057(boolean z) {
        C9186 c9186 = this.f49079;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36074(boolean z) {
        C9186 c9186 = this.f49069;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36061(ActivityC4471 activityC4471, final MenuItem menuItem, final MenuItem menuItem2) {
        this.f49066.m44959(activityC4471, new InterfaceC10597() { // from class: l.۬ۜۖ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                Boolean bool = (Boolean) obj;
                menuItem.setChecked(bool.booleanValue());
                menuItem2.setEnabled(!bool.booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m36082(boolean z) {
        C9186 c9186 = this.f49066;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m36069(boolean z) {
        C9186 c9186 = this.f49070;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36066(boolean z) {
        C9186 c9186 = this.f49077;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36080(boolean z) {
        C9186 c9186 = this.f49078;
        if (((Boolean) c9186.m44956()).booleanValue() != z) {
            c9186.mo23642(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36064(ActivityC4471 activityC4471, TextView textView, C17877 c17877) {
        C13638.requireNonNull(textView);
        this.f49064.m44959(activityC4471, new C22092(1, textView));
        this.f49076.m44959(activityC4471, new C3765(textView));
        this.f49080.m44959(activityC4471, new C6588(c17877));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36077(String str) {
        C9186 c9186 = this.f49064;
        if (C13638.equals(c9186.m44956(), str)) {
            return;
        }
        c9186.mo23642(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36076(int i) {
        C9186 c9186 = this.f49076;
        if (((Integer) c9186.m44956()).intValue() != i) {
            c9186.mo23642(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36058(int i) {
        C9186 c9186 = this.f49080;
        if (((Integer) c9186.m44956()).intValue() != i) {
            c9186.mo23642(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36079(ActivityC4471 activityC4471, TextView textView, C17877 c17877) {
        C13638.requireNonNull(textView);
        this.f49065.m44959(activityC4471, new C22092(1, textView));
        this.f49072.m44959(activityC4471, new C3765(textView));
        this.f49075.m44959(activityC4471, new C6588(c17877));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36072(String str) {
        C9186 c9186 = this.f49065;
        if (C13638.equals(c9186.m44956(), str)) {
            return;
        }
        c9186.mo23642(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m36053(int i) {
        C9186 c9186 = this.f49072;
        if (((Integer) c9186.m44956()).intValue() != i) {
            c9186.mo23642(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36071(int i) {
        C9186 c9186 = this.f49075;
        if (((Integer) c9186.m44956()).intValue() != i) {
            c9186.mo23642(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36063(ActivityC4471 activityC4471, final TextView textView) {
        this.f49073.m44959(activityC4471, new InterfaceC10597(this) { // from class: l.ܰۜۖ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                String str = (String) obj;
                TextView textView2 = textView;
                Object tag = textView2.getTag();
                if (tag instanceof ObjectAnimator) {
                    ((ObjectAnimator) tag).cancel();
                }
                if (str != null && !str.isEmpty()) {
                    if (textView2.getAlpha() != 1.0f) {
                        textView2.setAlpha(1.0f);
                    }
                    textView2.setText(str);
                } else {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(textView2, "alpha", 1.0f, 0.1f).setDuration(200L);
                    duration.addListener(new C22817(textView2));
                    duration.start();
                    textView2.setTag(duration);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36059(String str) {
        C9186 c9186 = this.f49073;
        if (C13638.equals(c9186.m44956(), str)) {
            return;
        }
        c9186.mo23642(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36060(ActivityC4471 activityC4471, MenuItem menuItem) {
        C13638.requireNonNull(menuItem);
        this.f49077.m44959(activityC4471, new C11528(0, menuItem));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m36068(ActivityC4471 activityC4471, MenuItem menuItem) {
        C13638.requireNonNull(menuItem);
        this.f49068.m44959(activityC4471, new C11528(0, menuItem));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36078(ActivityC4471 activityC4471, MenuItem menuItem) {
        C13638.requireNonNull(menuItem);
        this.f49078.m44959(activityC4471, new C11528(0, menuItem));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m36081(ActivityC4471 activityC4471, MenuItem menuItem) {
        C13638.requireNonNull(menuItem);
        this.f49079.m44959(activityC4471, new C11528(0, menuItem));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m36054(ActivityC4471 activityC4471, MenuItem menuItem) {
        C13638.requireNonNull(menuItem);
        this.f49070.m44959(activityC4471, new C20137(1, menuItem));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36073(ActivityC4471 activityC4471, MenuItem menuItem) {
        C13638.requireNonNull(menuItem);
        this.f49069.m44959(activityC4471, new C20137(1, menuItem));
    }
}
