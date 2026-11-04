package l;

import android.animation.ObjectAnimator;
import android.view.MenuItem;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U8VQ */
/* JADX INFO: loaded from: classes3.dex */
public class C1888 extends AbstractC13213 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17930 f6344;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17930 f6345;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17930 f6346;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f6347;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17930 f6348;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C17930 f6349;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C17930 f6350;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17930 f6351;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17930 f6352;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f6353;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17930 f6354;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f6355;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17930 f6356;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17930 f6357;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f6358;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17930 f6359;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f6360;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f6361;

    public C1888() {
        Boolean bool = Boolean.FALSE;
        this.f6357 = new C17930(bool);
        this.f6355 = new C17930(bool);
        this.f6358 = new C17930(bool);
        this.f6348 = new C17930(bool);
        this.f6353 = new C17930(bool);
        this.f6361 = new C17930(bool);
        this.f6349 = new C17930(bool);
        this.f6350 = new C17930(bool);
        this.f6346 = new C17930(bool);
        this.f6359 = new C17930(bool);
        this.f6344 = new C17930(bool);
        this.f6351 = new C17930();
        this.f6345 = new C17930(0);
        this.f6352 = new C17930(-1);
        this.f6360 = new C17930();
        this.f6347 = new C17930(0);
        this.f6354 = new C17930(-1);
        this.f6356 = new C17930();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6475(ActivityC2350 activityC2350, C4587 c4587) {
        this.f6357.m40350(activityC2350, c4587);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m6497(boolean z) {
        this.f6357.mo40353(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6472(ActivityC2350 activityC2350, final MenuItem menuItem, final MenuItem menuItem2, final C8741 c8741, final C8741 c8742) {
        int defaultColor = C3296.f10732.getDefaultColor();
        c8741.m23430(defaultColor);
        c8742.m23430(defaultColor);
        menuItem.setIcon(c8741);
        menuItem2.setIcon(c8742);
        this.f6358.m40350(activityC2350, new InterfaceC16438() { // from class: l.۬֫᩸
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C1888.m6466(this.f43006, c8741, menuItem, (Boolean) obj);
            }
        });
        this.f6348.m40350(activityC2350, new InterfaceC16438() { // from class: l.ۙۧ᩸
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C1888.m6465(this.f16985, c8742, menuItem2, (Boolean) obj);
            }
        });
        this.f6355.m40350(activityC2350, new InterfaceC16438() { // from class: l.᩷ۧ᩸
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C1888.m6464(this.f71055, menuItem, menuItem2, c8741, c8742, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6466(C1888 c1888, C8741 c8741, MenuItem menuItem, Boolean bool) {
        c8741.m23429(bool.booleanValue() ? 1.0f : 0.45f);
        if (Boolean.TRUE.equals(c1888.f6355.m40346())) {
            menuItem.setEnabled(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6465(C1888 c1888, C8741 c8741, MenuItem menuItem, Boolean bool) {
        c8741.m23429(bool.booleanValue() ? 1.0f : 0.45f);
        if (Boolean.TRUE.equals(c1888.f6355.m40346())) {
            menuItem.setEnabled(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6464(C1888 c1888, MenuItem menuItem, MenuItem menuItem2, C8741 c8741, C8741 c8742, Boolean bool) {
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            menuItem.setTitle(R.string.MT_Protector);
            menuItem2.setTitle(R.string.MT_Protector);
            menuItem.setEnabled(bool2.equals(c1888.f6358.m40346()));
            menuItem2.setEnabled(bool2.equals(c1888.f6348.m40346()));
            c8741.m23436(300);
            c8742.m23436(300);
            return;
        }
        menuItem.setTitle(R.string.MT_Protector);
        menuItem2.setTitle(R.string.MT_Protector);
        menuItem.setEnabled(true);
        menuItem2.setEnabled(true);
        c8741.m23428();
        c8742.m23428();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m6487() {
        Boolean bool = Boolean.FALSE;
        C17930 c17930 = this.f6355;
        c17930.mo40353(Boolean.valueOf(bool.equals(c17930.m40346())));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m6498() {
        return Boolean.TRUE.equals(this.f6355.m40346());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6482(boolean z) {
        C17930 c17930 = this.f6358;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m6484(boolean z) {
        C17930 c17930 = this.f6348;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m6483(ActivityC2350 activityC2350, final MenuItem menuItem) {
        InterfaceC16438 interfaceC16438 = new InterfaceC16438() { // from class: l.ۤۧ᩸
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C1888 c1888 = this.f34326;
                menuItem.setEnabled(((Boolean) c1888.f6353.m40346()).booleanValue() || ((Boolean) c1888.f6361.m40346()).booleanValue());
            }
        };
        this.f6353.m40350(activityC2350, interfaceC16438);
        this.f6361.m40350(activityC2350, interfaceC16438);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m6477(boolean z) {
        C17930 c17930 = this.f6353;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6467(boolean z) {
        C17930 c17930 = this.f6361;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m6481(boolean z) {
        C17930 c17930 = this.f6349;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6471(ActivityC2350 activityC2350, final MenuItem menuItem, final MenuItem menuItem2) {
        this.f6350.m40350(activityC2350, new InterfaceC16438() { // from class: l.᩸ۧ᩸
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                Boolean bool = (Boolean) obj;
                menuItem.setChecked(bool.booleanValue());
                menuItem2.setEnabled(!bool.booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m6486(boolean z) {
        C17930 c17930 = this.f6350;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m6489(boolean z) {
        C17930 c17930 = this.f6346;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6476(boolean z) {
        C17930 c17930 = this.f6359;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6494(boolean z) {
        C17930 c17930 = this.f6344;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6474(ActivityC2350 activityC2350, TextView textView, C25009 c25009) {
        C17359.requireNonNull(textView);
        this.f6351.m40350(activityC2350, new C19787(0, textView));
        this.f6345.m40350(activityC2350, new C15311(0, textView));
        this.f6352.m40350(activityC2350, new C13074(c25009));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6491(String str) {
        C17930 c17930 = this.f6351;
        if (C17359.equals(c17930.m40346(), str)) {
            return;
        }
        c17930.mo40353(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6490(int i) {
        C17930 c17930 = this.f6345;
        if (((Integer) c17930.m40346()).intValue() != i) {
            c17930.mo40353(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6468(int i) {
        C17930 c17930 = this.f6352;
        if (((Integer) c17930.m40346()).intValue() != i) {
            c17930.mo40353(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6493(ActivityC2350 activityC2350, TextView textView, C25009 c25009) {
        C17359.requireNonNull(textView);
        this.f6360.m40350(activityC2350, new C19787(0, textView));
        this.f6347.m40350(activityC2350, new C15311(0, textView));
        this.f6354.m40350(activityC2350, new C13074(c25009));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m6479(String str) {
        C17930 c17930 = this.f6360;
        if (C17359.equals(c17930.m40346(), str)) {
            return;
        }
        c17930.mo40353(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m6495(int i) {
        C17930 c17930 = this.f6347;
        if (((Integer) c17930.m40346()).intValue() != i) {
            c17930.mo40353(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m6478(int i) {
        C17930 c17930 = this.f6354;
        if (((Integer) c17930.m40346()).intValue() != i) {
            c17930.mo40353(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6473(ActivityC2350 activityC2350, final TextView textView) {
        this.f6356.m40350(activityC2350, new InterfaceC16438(this) { // from class: l.۠֫᩸
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
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
                    duration.addListener(new C5617(textView2));
                    duration.start();
                    textView2.setTag(duration);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6469(String str) {
        C17930 c17930 = this.f6356;
        if (C17359.equals(c17930.m40346(), str)) {
            return;
        }
        c17930.mo40353(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6470(ActivityC2350 activityC2350, MenuItem menuItem) {
        C17359.requireNonNull(menuItem);
        this.f6359.m40350(activityC2350, new C2667(1, menuItem));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m6485(ActivityC2350 activityC2350, MenuItem menuItem) {
        C17359.requireNonNull(menuItem);
        this.f6361.m40350(activityC2350, new C2667(1, menuItem));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m6488(ActivityC2350 activityC2350, MenuItem menuItem) {
        C17359.requireNonNull(menuItem);
        this.f6353.m40350(activityC2350, new C2667(1, menuItem));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6492(ActivityC2350 activityC2350, MenuItem menuItem) {
        C17359.requireNonNull(menuItem);
        this.f6344.m40350(activityC2350, new C2667(1, menuItem));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m6480(ActivityC2350 activityC2350, MenuItem menuItem) {
        C17359.requireNonNull(menuItem);
        this.f6349.m40350(activityC2350, new C6825(menuItem));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m6496(ActivityC2350 activityC2350, MenuItem menuItem) {
        C17359.requireNonNull(menuItem);
        this.f6346.m40350(activityC2350, new C6825(menuItem));
    }
}
