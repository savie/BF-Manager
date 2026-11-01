package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8765 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final View f30131;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Drawable f30132;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final View f30133;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22959 f30134;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f30135;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final View f30136;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23891 f30137;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f30138;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final View f30139;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Drawable f30140;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f30141;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final View f30142;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C13435 f30143;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f30144;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22046 f30145;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f30146;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f30147;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TabLayout f30148;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f30149;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HorizontalScrollView f30150;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ImageView f30151;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1439 f30152;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f30153;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f30154;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ImageView f30155;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final LinearLayout f30156;

    public C8765(final C6936 c6936, final Main main) {
        this(main, new C18246(c6936, main), true);
        c6936.m18627(new RunnableC14990(3, this));
        this.f30145.m48984(new InterfaceC0878() { // from class: l.ᩴᩴ᩹
            @Override // l.InterfaceC0878
            /* JADX INFO: renamed from: ۙ */
            public final void mo3550(float f) {
                if (ApplicationC0716.f2988.getBoolean("bookmark_swipe_pos_aware", false)) {
                    c6936.m18633(main.m118().m20964(), f);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m22788() {
        AbstractActivityC12483 abstractActivityC12483 = this.f30135;
        PorterDuffColorFilter porterDuffColorFilterM24638 = C9682.m24638(C16631.m39095(abstractActivityC12483.getResources(), R.color.MT_Protector, abstractActivityC12483.getTheme()));
        this.f30144 = porterDuffColorFilterM24638;
        this.f30140.setColorFilter(porterDuffColorFilterM24638);
        this.f30132.setColorFilter(C9682.m24638(C20368.f66007));
        this.f30133.setBackgroundColor(C20368.f66006);
        Drawable drawableM26304 = C10405.m26304(abstractActivityC12483, R.drawable.MT_Protector);
        drawableM26304.setColorFilter(C9682.m24638(C20368.f66004));
        this.f30142.setBackground(drawableM26304);
        this.f30151.setBackground(C0674.m3029(abstractActivityC12483));
        this.f30155.setBackground(C0674.m3029(abstractActivityC12483));
        Drawable drawableM3024 = C0674.m3024(abstractActivityC12483);
        LinearLayout linearLayout = this.f30156;
        linearLayout.setBackground(drawableM3024);
        Drawable drawableM3025 = C0674.m3024(abstractActivityC12483);
        LinearLayout linearLayout2 = this.f30149;
        linearLayout2.setBackground(drawableM3025);
        Drawable drawableM3026 = C0674.m3024(abstractActivityC12483);
        LinearLayout linearLayout3 = this.f30146;
        linearLayout3.setBackground(drawableM3026);
        ((ImageView) linearLayout.getChildAt(0)).setImageResource(R.drawable.MT_Protector);
        ((ImageView) linearLayout2.getChildAt(0)).setImageResource(R.drawable.MT_Protector);
        ((ImageView) linearLayout3.getChildAt(0)).setImageResource(R.drawable.MT_Protector);
        ((TextView) linearLayout.getChildAt(1)).setTextColor(C20368.f65976);
        ((TextView) linearLayout2.getChildAt(1)).setTextColor(C20368.f65976);
        ((TextView) linearLayout3.getChildAt(1)).setTextColor(C20368.f65976);
        this.f30131.setBackgroundColor(C20368.f66006);
        this.f30152.m5027();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22795(C8765 c8765) {
        C23186.m51192();
        Iterator it = c8765.f30138.iterator();
        while (it.hasNext()) {
            ((C2017) it.next()).f7529.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22787(AbstractC11462 abstractC11462, AbstractC12068 abstractC12068) {
        return (abstractC11462 instanceof C9183) && ((C9183) abstractC11462).m23639() == abstractC12068.f40385;
    }

    public C8765(ViewOnClickListenerC8374 viewOnClickListenerC8374, C3808 c3808) {
        this(viewOnClickListenerC8374, c3808, false);
    }

    /* JADX WARN: Type inference failed for: r14v6, types: [l.۟ᩴ᩹] */
    public C8765(AbstractActivityC12483 abstractActivityC12483, InterfaceC23891 interfaceC23891, boolean z) {
        this.f30138 = new ArrayList();
        this.f30134 = C22959.m50800();
        this.f30141 = new ArrayList();
        this.f30147 = "";
        this.f30135 = abstractActivityC12483;
        this.f30137 = interfaceC23891;
        this.f30154 = z;
        C22046 c22046 = (C22046) abstractActivityC12483.m31016(R.id.MT_Protector);
        this.f30145 = c22046;
        TabLayout tabLayout = (TabLayout) c22046.findViewById(R.id.tabLayout);
        this.f30148 = tabLayout;
        C13435 c13435 = (C13435) c22046.findViewById(R.id.MT_Protector);
        this.f30143 = c13435;
        View viewFindViewById = c22046.findViewById(R.id.more);
        this.f30139 = viewFindViewById;
        ImageView imageView = (ImageView) c22046.findViewById(R.id.MT_Protector);
        this.f30151 = imageView;
        View viewFindViewById2 = c22046.findViewById(R.id.done);
        this.f30136 = viewFindViewById2;
        ImageView imageView2 = (ImageView) c22046.findViewById(R.id.MT_Protector);
        this.f30155 = imageView2;
        C1439 c1439 = (C1439) c22046.findViewById(R.id.searchView);
        this.f30152 = c1439;
        this.f30142 = c22046.findViewById(R.id.MT_Protector);
        this.f30133 = c22046.findViewById(R.id.MT_Protector);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) c22046.findViewById(R.id.menuScrollView);
        this.f30150 = horizontalScrollView;
        this.f30156 = (LinearLayout) c22046.findViewById(R.id.MT_Protector);
        this.f30149 = (LinearLayout) c22046.findViewById(R.id.MT_Protector);
        this.f30146 = (LinearLayout) c22046.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = c22046.findViewById(R.id.MT_Protector);
        this.f30131 = viewFindViewById3;
        c22046.m48984(new InterfaceC0878() { // from class: l.ܶᩴ᩹
            @Override // l.InterfaceC0878
            /* JADX INFO: renamed from: ۙ */
            public final void mo3550(float f) {
                C8765.m22777(this.f50275, f);
            }
        });
        if (c22046.m48992() == 0.0f) {
            c13435.setVisibility(4);
        }
        Drawable drawableMutate = C10405.m26304(abstractActivityC12483, R.drawable.MT_Protector).mutate();
        this.f30140 = drawableMutate;
        drawableMutate.setAlpha(153);
        imageView.setImageDrawable(drawableMutate);
        Drawable drawableMutate2 = C10405.m26304(abstractActivityC12483, R.drawable.MT_Protector).mutate();
        this.f30132 = drawableMutate2;
        drawableMutate.setAlpha(153);
        imageView2.setImageDrawable(drawableMutate2);
        c1439.m5029(new C0606(this));
        m22785(false);
        tabLayout.setVisibility(0);
        viewFindViewById.setVisibility(z ? 0 : 8);
        if (z) {
            c1439.setVisibility(8);
            c1439.m5030(true);
        } else {
            c1439.setVisibility(0);
            c1439.m5030(false);
        }
        horizontalScrollView.setVisibility(8);
        viewFindViewById2.setVisibility(8);
        viewFindViewById3.setVisibility(8);
        c22046.m48982(ApplicationC0716.f2992.getInt("bottom_content_view_ratio_int", 50) / 100.0f);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC10486(0, this, c22046));
        c22046.m48986(new C21068(this, new View.OnLongClickListener() { // from class: l.۟ᩴ᩹
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C8765.m22786(this.f25332, view);
            }
        }));
        c13435.m44420(new C20363(this));
        tabLayout.setupWithViewPager(c13435);
        m22811();
        C23186.m51187(abstractActivityC12483, new InterfaceC10597() { // from class: l.᩵ᩴ᩹
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                this.f63111.m22811();
            }
        });
        C8432.f29282.m44959(abstractActivityC12483, new C5508(1, this));
        C5717.m15767(abstractActivityC12483, new C22442(1, this));
        abstractActivityC12483.getLifecycle().mo9171(new InterfaceC5657() { // from class: l.ۡᩴ᩹
            @Override // l.InterfaceC5657
            /* JADX INFO: renamed from: ۙ */
            public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
                C8765.m22781(this.f30938, enumC1651);
            }
        });
        m22788();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22777(C8765 c8765, float f) {
        C13435 c13435 = c8765.f30143;
        int i = f == 0.0f ? 4 : 0;
        if (c13435.getVisibility() != i) {
            c13435.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22773(C8765 c8765) {
        for (C2017 c2017 : c8765.f30138) {
            if (c2017.m6497()) {
                c2017.f7529.m50641();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22776(C8765 c8765) {
        for (C2017 c2017 : c8765.f30138) {
            if (c2017.m6497()) {
                c2017.f7529.m50641();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22781(C8765 c8765, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_PAUSE) {
            ApplicationC0716.f2992.edit().mo4065(c8765.f30143.m44426(), "bottom_selected_tab_index").apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m22811() {
        int i;
        ArrayList arrayList = this.f30138;
        boolean zIsEmpty = arrayList.isEmpty();
        int iM51203 = C23186.m51203();
        while (iM51203 > arrayList.size()) {
            arrayList.add(new C2017(this, arrayList.size()));
        }
        while (iM51203 < arrayList.size()) {
            C19028.m43762(arrayList, 1);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C2017) it.next()).m6499());
        }
        ArrayList arrayList3 = this.f30141;
        boolean zEquals = arrayList3.equals(arrayList2);
        if (!zEquals) {
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C2017) it2.next()).f7529.m50641();
        }
        C13435 c13435 = this.f30143;
        if (!zEquals) {
            AbstractC14217 abstractC14217M44430 = c13435.m44430();
            if (abstractC14217M44430 != null) {
                abstractC14217M44430.m34322();
            }
            InterfaceC15456 interfaceC15456M48987 = this.f30145.m48987();
            if (interfaceC15456M48987 != null) {
                ((C21068) interfaceC15456M48987).invoke(Boolean.TRUE);
            }
        }
        if (!zIsEmpty || (i = ApplicationC0716.f2992.getInt("bottom_selected_tab_index", 0)) >= arrayList.size()) {
            return;
        }
        c13435.m44413(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22780(C8765 c8765, String str) {
        if (str == null) {
            str = "";
        }
        if (str.equals(c8765.f30147)) {
            return;
        }
        c8765.f30147 = str;
        Iterator it = c8765.f30138.iterator();
        while (it.hasNext()) {
            ((C2017) it.next()).f7529.m50642();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m22785(boolean z) {
        if (this.f30153 != z) {
            C22046 c22046 = this.f30145;
            if (z) {
                View view = this.f30142;
                int height = view.getHeight();
                if (height <= 0) {
                    height = view.getMeasuredHeight();
                }
                if (height > 0) {
                    c22046.m48983(height);
                }
            } else {
                c22046.m48990();
            }
            this.f30153 = z;
        }
        C1439 c1439 = this.f30152;
        C11795 c11795 = (C11795) c1439.getLayoutParams();
        if (z) {
            ((ViewGroup.MarginLayoutParams) c11795).width = 0;
            c11795.f39651 = 0;
            c11795.f39639 = -1;
            c11795.f39644 = 0;
            c11795.f39646 = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) c11795).width = -2;
            c11795.f39651 = -1;
            c11795.f39639 = R.id.tabLayout;
            c11795.f39644 = -1;
            c11795.f39646 = R.id.more;
        }
        c1439.setLayoutParams(c11795);
        this.f30148.setVisibility(z ? 4 : 0);
        int i = 8;
        if (!z) {
            i = this.f30154 ? 0 : 8;
        }
        this.f30139.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m22772() {
        C1439 c1439 = this.f30152;
        if (c1439.m5031() || c1439.m5032().length() > 0) {
            c1439.m5028((String) null);
            c1439.m5033();
        }
        this.f30145.m48981();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m22803(C8765 c8765) {
        return c8765.f30152.m5031();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static C19348 m22770(C8765 c8765) {
        View view = c8765.f30139;
        C1439 c1439 = c8765.f30152;
        TabLayout tabLayout = c8765.f30148;
        if (c8765.f30154) {
            if (!c1439.m5035()) {
                return new C19348(tabLayout, c1439, view);
            }
            return new C19348(tabLayout, view);
        }
        if (!c1439.m5035()) {
            return new C19348(tabLayout, c1439);
        }
        return new C19348(tabLayout);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m22815() {
        C1439 c1439 = this.f30152;
        if (!c1439.m5031() && c1439.m5032().length() <= 0) {
            return false;
        }
        m22772();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22784(C8765 c8765, boolean z) {
        LinearLayout linearLayout = c8765.f30146;
        LinearLayout linearLayout2 = c8765.f30149;
        LinearLayout linearLayout3 = c8765.f30156;
        if (z) {
            if (linearLayout3.isClickable() && linearLayout3.getAlpha() == 1.0f) {
                return;
            }
            linearLayout3.setClickable(true);
            linearLayout2.setClickable(true);
            linearLayout.setClickable(true);
            linearLayout3.setAlpha(1.0f);
            linearLayout2.setAlpha(1.0f);
            linearLayout.setAlpha(1.0f);
            return;
        }
        if (linearLayout3.isClickable() || linearLayout3.getAlpha() == 1.0f) {
            linearLayout3.setClickable(false);
            linearLayout2.setClickable(false);
            linearLayout.setClickable(false);
            linearLayout3.setAlpha(0.5f);
            linearLayout2.setAlpha(0.5f);
            linearLayout.setAlpha(0.5f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22813() {
        return this.f30143.m44426();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22783(C8765 c8765, C22046 c22046, View view) {
        C16195 c16195 = new C16195(view.getContext(), view, 0);
        c16195.m38292();
        C12418 c12418M38298 = c16195.m38298();
        c12418M38298.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        if (C6730.m18176()) {
            c12418M38298.add(R.id.MT_Protector, R.string.MT_Protector, 0, "手势说明").setIcon(R.drawable.MT_Protector);
        }
        if (C23186.m51197(c8765.f30148.getSelectedTabPosition()).m32809()) {
            c12418M38298.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setCheckable(true).setChecked(ApplicationC0716.f2992.getBoolean("eph", true));
            c12418M38298.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        } else {
            c12418M38298.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c12418M38298.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        }
        C20491.m46296(c12418M38298);
        c16195.m38296(new C21900(c8765, c22046));
        c16195.m38297();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22782(C8765 c8765, C22046 c22046, MenuItem menuItem) {
        AbstractActivityC12483 abstractActivityC12483 = c8765.f30135;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C16737.m39273(new RunnableC10098(2, c8765));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C23186.m51195();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            menuItem.setChecked(!menuItem.isChecked());
            boolean zIsChecked = menuItem.isChecked();
            C23186 c23186 = C23186.f75236;
            C1679.m5597(ApplicationC0716.f2992, "eph", zIsChecked);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            ((C2017) c8765.f30138.get(c8765.f30143.m44426())).f7529.m50640(-1);
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                C12602 c12602 = new C12602(abstractActivityC12483, -1);
                c12602.m40376(R.string.MT_Protector);
                c12602.m40340();
                c12602.m40336(6);
                c12602.m40368(true);
                return;
            }
            if (itemId == R.string.MT_Protector) {
                ((Main) abstractActivityC12483).m128("cloudBackup");
                return;
            } else {
                if (itemId == R.string.MT_Protector) {
                    ActivityC14082.m34069((Context) abstractActivityC12483, C1355.m4765(), false);
                    return;
                }
                return;
            }
        }
        C15532 c15532 = new C15532(abstractActivityC12483, null);
        c15532.setPadding(c15532.getPaddingLeft(), C13932.m33769(20.0f) + c15532.getPaddingTop(), c15532.getPaddingRight(), c15532.getPaddingBottom());
        c15532.setMax(100);
        c15532.setProgress((int) (c22046.m48980() * 100.0f));
        String str = abstractActivityC12483.getString(R.string.MT_Protector) + " (";
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        StringBuilder sbM23356 = C9023.m23356(str);
        sbM23356.append(c15532.getProgress());
        sbM23356.append("%)");
        c8067BuildDialog.m21277(sbM23356.toString());
        c8067BuildDialog.m21258(c15532);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c15532.setOnSeekBarChangeListener(new C16835(c8067BuildDialog.m21269(), str, c22046));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22779(final C8765 c8765, final int i, C13308 c13308, MenuItem menuItem) {
        AbstractActivityC12483 abstractActivityC12483 = c8765.f30135;
        TabLayout tabLayout = c8765.f30148;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            int i2 = i - 1;
            C23186.m51178(i, i2);
            if (tabLayout.getSelectedTabPosition() == i) {
                tabLayout.selectTab(tabLayout.getTabAt(i2));
                return;
            } else {
                if (tabLayout.getSelectedTabPosition() == i2) {
                    tabLayout.selectTab(tabLayout.getTabAt(i));
                    return;
                }
                return;
            }
        }
        if (itemId == 2) {
            int i3 = i + 1;
            C23186.m51178(i, i3);
            if (tabLayout.getSelectedTabPosition() == i) {
                tabLayout.selectTab(tabLayout.getTabAt(i3));
                return;
            } else {
                if (tabLayout.getSelectedTabPosition() == i3) {
                    tabLayout.selectTab(tabLayout.getTabAt(i));
                    return;
                }
                return;
            }
        }
        if (itemId == 3) {
            C17540 c17540 = new C17540(abstractActivityC12483, c13308, i);
            c17540.m40376(R.string.MT_Protector);
            c17540.m40346((CharSequence) c13308.m32807());
            c17540.m40340();
            c17540.m40336(6);
            c17540.m40355();
            c17540.m40368(true);
            return;
        }
        if (itemId != 4) {
            return;
        }
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(abstractActivityC12483.getString(R.string.MT_Protector, c13308.m32807()));
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸ᩴ᩹
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C8765.m22778(this.f70542, i);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22778(C8765 c8765, int i) {
        TabLayout tabLayout = c8765.f30148;
        C23186.m51177(i);
        if (i == 0 || tabLayout.getSelectedTabPosition() != i) {
            return;
        }
        tabLayout.selectTab(tabLayout.getTabAt(i - 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C7321 m22775(C8765 c8765, ViewOnLongClickListenerC7663 viewOnLongClickListenerC7663, Boolean bool) {
        TabLayout tabLayout = c8765.f30148;
        if (bool.booleanValue()) {
            for (int i = 0; i < tabLayout.getTabCount(); i++) {
                TabLayout.Tab tabAt = tabLayout.getTabAt(i);
                if (tabAt != null) {
                    TabLayout.TabView tabView = tabAt.view;
                    tabView.setTag(R.id.tabLayout, Integer.valueOf(i));
                    tabView.setOnLongClickListener(viewOnLongClickListenerC7663);
                }
            }
        } else {
            c8765.m22772();
            Iterator it = c8765.f30138.iterator();
            while (it.hasNext()) {
                ((C2017) it.next()).f7529.m50639();
            }
        }
        return C7321.f24318;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m22814() {
        InterfaceC15456 interfaceC15456M48987;
        m22788();
        TabLayout tabLayout = new TabLayout(this.f30135);
        ColorStateList tabRippleColor = tabLayout.getTabRippleColor();
        TabLayout tabLayout2 = this.f30148;
        tabLayout2.setTabRippleColor(tabRippleColor);
        tabLayout2.setTabTextColors(tabLayout.getTabTextColors());
        tabLayout2.setSelectedTabIndicator(tabLayout.getTabSelectedIndicator());
        Iterator it = this.f30138.iterator();
        while (it.hasNext()) {
            C2017.m6490((C2017) it.next());
        }
        C22046 c22046 = this.f30145;
        if (c22046.m48979() || (interfaceC15456M48987 = c22046.m48987()) == null) {
            return;
        }
        ((C21068) interfaceC15456M48987).invoke(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22786(final C8765 c8765, View view) {
        if (!c8765.f30154) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        final int iIntValue = ((Integer) view.getTag(R.id.tabLayout)).intValue();
        C16195 c16195 = new C16195(view.getContext(), view, 0);
        c16195.m38292();
        C12418 c12418M38298 = c16195.m38298();
        final C13308 c13308M51197 = C23186.m51197(iIntValue);
        boolean z = iIntValue > 0;
        boolean z2 = iIntValue < C23186.m51203() - 1;
        boolean z3 = (c13308M51197.m32797() || c13308M51197.m32809()) ? false : true;
        c12418M38298.add(0, 1, 0, R.string.MT_Protector).setEnabled(z).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, 2, 0, R.string.MT_Protector).setEnabled(z2).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, 3, 0, R.string.MT_Protector).setEnabled(z3).setIcon(R.drawable.MT_Protector);
        c12418M38298.add(0, 4, 0, R.string.MT_Protector).setEnabled(z3).setIcon(R.drawable.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.ܺᩴ᩹
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C8765.m22779(this.f52123, iIntValue, c13308M51197, menuItem);
                return true;
            }
        });
        c16195.m38297();
        return true;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int m22796(C8765 c8765) {
        return c8765.f30154 ? 0 : 8;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m22802(C8765 c8765) {
        return c8765.f30154;
    }
}
