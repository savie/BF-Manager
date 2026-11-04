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

/* JADX INFO: renamed from: l.ܺ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes4.dex */
public final class C16468 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final TabLayout f53386;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C24720 f53387;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final View f53388;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f53389;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f53390;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f53391;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53392;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C14019 f53393;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View f53394;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18485 f53395;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Drawable f53396;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Drawable f53397;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f53398;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ImageView f53399;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f53400;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f53401;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f53402;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View f53403;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final View f53404;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ImageView f53405;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7308 f53406;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7198 f53407;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f53408;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HorizontalScrollView f53409;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f53410;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final LinearLayout f53411;

    public C16468(final C20065 c20065, final Main main) {
        this(main, new C0646(c20065, main), true);
        c20065.m46145(new RunnableC22358(4, this));
        this.f53407.m19777(new InterfaceC13909() { // from class: l.۫ܿܳ
            @Override // l.InterfaceC13909
            /* JADX INFO: renamed from: ۙ */
            public final void mo15578(float f) {
                if (ApplicationC17729.f58262.getBoolean("bookmark_swipe_pos_aware", false)) {
                    c20065.m46151(main.m121().m29751(), f);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m39044() {
        AbstractActivityC17204 abstractActivityC17204 = this.f53390;
        PorterDuffColorFilter porterDuffColorFilterM9575 = C2930.m9575(C9217.m24386(abstractActivityC17204.getResources(), R.color.MT_Protector, abstractActivityC17204.getTheme()));
        this.f53391 = porterDuffColorFilterM9575;
        this.f53396.setColorFilter(porterDuffColorFilterM9575);
        this.f53397.setColorFilter(C2930.m9575(C3296.f10758));
        this.f53408.setBackgroundColor(C3296.f10757);
        Drawable drawableM20563 = C7508.m20563(abstractActivityC17204, R.drawable.MT_Protector);
        drawableM20563.setColorFilter(C2930.m9575(C3296.f10763));
        this.f53394.setBackground(drawableM20563);
        this.f53405.setBackground(C17423.m40913(abstractActivityC17204));
        this.f53399.setBackground(C17423.m40913(abstractActivityC17204));
        Drawable drawableM40908 = C17423.m40908(abstractActivityC17204);
        LinearLayout linearLayout = this.f53411;
        linearLayout.setBackground(drawableM40908);
        Drawable drawableM40909 = C17423.m40908(abstractActivityC17204);
        LinearLayout linearLayout2 = this.f53400;
        linearLayout2.setBackground(drawableM40909);
        Drawable drawableM409010 = C17423.m40908(abstractActivityC17204);
        LinearLayout linearLayout3 = this.f53401;
        linearLayout3.setBackground(drawableM409010);
        ((ImageView) linearLayout.getChildAt(0)).setImageResource(R.drawable.MT_Protector);
        ((ImageView) linearLayout2.getChildAt(0)).setImageResource(R.drawable.MT_Protector);
        ((ImageView) linearLayout3.getChildAt(0)).setImageResource(R.drawable.MT_Protector);
        ((TextView) linearLayout.getChildAt(1)).setTextColor(C3296.f10751);
        ((TextView) linearLayout2.getChildAt(1)).setTextColor(C3296.f10751);
        ((TextView) linearLayout3.getChildAt(1)).setTextColor(C3296.f10751);
        this.f53403.setBackgroundColor(C3296.f10757);
        this.f53406.m20005();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39032(C16468 c16468) {
        C22961.m51786();
        Iterator it = c16468.f53410.iterator();
        while (it.hasNext()) {
            ((C8044) it.next()).f26669.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39027(AbstractC7364 abstractC7364, AbstractC0148 abstractC0148) {
        return (abstractC7364 instanceof C6728) && ((C6728) abstractC7364).m18804() == abstractC0148.f1127;
    }

    public C16468(ViewOnClickListenerC11499 viewOnClickListenerC11499, C8648 c8648) {
        this(viewOnClickListenerC11499, c8648, false);
    }

    /* JADX WARN: Type inference failed for: r14v6, types: [l.ܽܿܳ] */
    public C16468(AbstractActivityC17204 abstractActivityC17204, InterfaceC18485 interfaceC18485, boolean z) {
        this.f53410 = new ArrayList();
        this.f53387 = C24720.m55197();
        this.f53392 = new ArrayList();
        this.f53398 = "";
        this.f53390 = abstractActivityC17204;
        this.f53395 = interfaceC18485;
        this.f53402 = z;
        final C7198 c7198 = (C7198) abstractActivityC17204.m40418(R.id.MT_Protector);
        this.f53407 = c7198;
        TabLayout tabLayout = (TabLayout) c7198.findViewById(R.id.tabLayout);
        this.f53386 = tabLayout;
        C14019 c14019 = (C14019) c7198.findViewById(R.id.MT_Protector);
        this.f53393 = c14019;
        View viewFindViewById = c7198.findViewById(R.id.more);
        this.f53388 = viewFindViewById;
        ImageView imageView = (ImageView) c7198.findViewById(R.id.MT_Protector);
        this.f53405 = imageView;
        View viewFindViewById2 = c7198.findViewById(R.id.done);
        this.f53404 = viewFindViewById2;
        ImageView imageView2 = (ImageView) c7198.findViewById(R.id.MT_Protector);
        this.f53399 = imageView2;
        C7308 c7308 = (C7308) c7198.findViewById(R.id.searchView);
        this.f53406 = c7308;
        this.f53394 = c7198.findViewById(R.id.MT_Protector);
        this.f53408 = c7198.findViewById(R.id.MT_Protector);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) c7198.findViewById(R.id.menuScrollView);
        this.f53409 = horizontalScrollView;
        this.f53411 = (LinearLayout) c7198.findViewById(R.id.MT_Protector);
        this.f53400 = (LinearLayout) c7198.findViewById(R.id.MT_Protector);
        this.f53401 = (LinearLayout) c7198.findViewById(R.id.MT_Protector);
        View viewFindViewById3 = c7198.findViewById(R.id.MT_Protector);
        this.f53403 = viewFindViewById3;
        c7198.m19777(new InterfaceC13909() { // from class: l.ᩴܿܳ
            @Override // l.InterfaceC13909
            /* JADX INFO: renamed from: ۙ */
            public final void mo15578(float f) {
                C16468.m39018(this.f64188, f);
            }
        });
        if (c7198.m19782() == 0.0f) {
            c14019.setVisibility(4);
        }
        Drawable drawableMutate = C7508.m20563(abstractActivityC17204, R.drawable.MT_Protector).mutate();
        this.f53396 = drawableMutate;
        drawableMutate.setAlpha(153);
        imageView.setImageDrawable(drawableMutate);
        Drawable drawableMutate2 = C7508.m20563(abstractActivityC17204, R.drawable.MT_Protector).mutate();
        this.f53397 = drawableMutate2;
        drawableMutate.setAlpha(153);
        imageView2.setImageDrawable(drawableMutate2);
        c7308.m20007(new C12518(this));
        m39026(false);
        tabLayout.setVisibility(0);
        viewFindViewById.setVisibility(z ? 0 : 8);
        if (z) {
            c7308.setVisibility(8);
            c7308.m20008(true);
        } else {
            c7308.setVisibility(0);
            c7308.m20008(false);
        }
        horizontalScrollView.setVisibility(8);
        viewFindViewById2.setVisibility(8);
        viewFindViewById3.setVisibility(8);
        c7198.m19774(ApplicationC17729.f58258.getInt("bottom_content_view_ratio_int", 50) / 100.0f);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.ܺܿܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16468.m39023(this.f55532, c7198, view);
            }
        });
        c7198.m19778(new C16247(this, new View.OnLongClickListener() { // from class: l.ܽܿܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C16468.m39028(this.f58273, view);
            }
        }));
        c14019.m36514(new C20723(this));
        tabLayout.setupWithViewPager(c14019);
        m39038();
        C22961.m51799(abstractActivityC17204, new InterfaceC16438() { // from class: l.֫ܿܳ
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                this.f6913.m39038();
            }
        });
        C4052.f13791.m40350(abstractActivityC17204, new C11772(0, this));
        C7606.m20790(abstractActivityC17204, new C24491(1, this));
        abstractActivityC17204.getLifecycle().mo23077(new InterfaceC5252() { // from class: l.᩻ܿܳ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                C16468.m39024(this.f81435, enumC9330);
            }
        });
        m39044();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39018(C16468 c16468, float f) {
        C14019 c14019 = c16468.f53393;
        int i = f == 0.0f ? 4 : 0;
        if (c14019.getVisibility() != i) {
            c14019.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39051(C16468 c16468) {
        for (C8044 c8044 : c16468.f53410) {
            if (c8044.m21926()) {
                c8044.f26669.m44958();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39017(C16468 c16468) {
        for (C8044 c8044 : c16468.f53410) {
            if (c8044.m21926()) {
                c8044.f26669.m44958();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39024(C16468 c16468, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_PAUSE) {
            ApplicationC17729.f58258.edit().mo3486(c16468.f53393.m36517(), "bottom_selected_tab_index").apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m39038() {
        int i;
        ArrayList arrayList = this.f53410;
        boolean zIsEmpty = arrayList.isEmpty();
        int iM51807 = C22961.m51807();
        while (iM51807 > arrayList.size()) {
            arrayList.add(new C8044(this, arrayList.size()));
        }
        while (iM51807 < arrayList.size()) {
            C2764.m9138(arrayList, 1);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C8044) it.next()).m21929());
        }
        ArrayList arrayList3 = this.f53392;
        boolean zEquals = arrayList3.equals(arrayList2);
        if (!zEquals) {
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C8044) it2.next()).f26669.m44958();
        }
        C14019 c14019 = this.f53393;
        if (!zEquals) {
            AbstractC6274 abstractC6274M36524 = c14019.m36524();
            if (abstractC6274M36524 != null) {
                abstractC6274M36524.m17946();
            }
            InterfaceC3071 interfaceC3071M19783 = this.f53407.m19783();
            if (interfaceC3071M19783 != null) {
                ((C16247) interfaceC3071M19783).invoke(Boolean.TRUE);
            }
        }
        if (!zIsEmpty || (i = ApplicationC17729.f58258.getInt("bottom_selected_tab_index", 0)) >= arrayList.size()) {
            return;
        }
        c14019.m36527(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39021(C16468 c16468, String str) {
        if (str == null) {
            str = "";
        }
        if (str.equals(c16468.f53398)) {
            return;
        }
        c16468.f53398 = str;
        Iterator it = c16468.f53410.iterator();
        while (it.hasNext()) {
            ((C8044) it.next()).f26669.m44959();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m39026(boolean z) {
        if (this.f53389 != z) {
            C7198 c7198 = this.f53407;
            if (z) {
                View view = this.f53394;
                int height = view.getHeight();
                if (height <= 0) {
                    height = view.getMeasuredHeight();
                }
                if (height > 0) {
                    c7198.m19775(height);
                }
            } else {
                c7198.m19784();
            }
            this.f53389 = z;
        }
        C7308 c7308 = this.f53406;
        C11651 c11651 = (C11651) c7308.getLayoutParams();
        if (z) {
            ((ViewGroup.MarginLayoutParams) c11651).width = 0;
            c11651.f37745 = 0;
            c11651.f37727 = -1;
            c11651.f37730 = 0;
            c11651.f37750 = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) c11651).width = -2;
            c11651.f37745 = -1;
            c11651.f37727 = R.id.tabLayout;
            c11651.f37730 = -1;
            c11651.f37750 = R.id.more;
        }
        c7308.setLayoutParams(c11651);
        this.f53386.setVisibility(z ? 4 : 0);
        int i = 8;
        if (!z) {
            i = this.f53402 ? 0 : 8;
        }
        this.f53388.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m39050() {
        C7308 c7308 = this.f53406;
        if (c7308.m20011() || c7308.m20009().length() > 0) {
            c7308.m20006((String) null);
            c7308.m20012();
        }
        this.f53407.m19773();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m39043(C16468 c16468) {
        return c16468.f53406.m20011();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C24674 m39042(C16468 c16468) {
        View view = c16468.f53388;
        C7308 c7308 = c16468.f53406;
        TabLayout tabLayout = c16468.f53386;
        if (c16468.f53402) {
            if (!c7308.m20010()) {
                return new C24674(tabLayout, c7308, view);
            }
            return new C24674(tabLayout, view);
        }
        if (!c7308.m20010()) {
            return new C24674(tabLayout, c7308);
        }
        return new C24674(tabLayout);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m39057() {
        C7308 c7308 = this.f53406;
        if (!c7308.m20011() && c7308.m20009().length() <= 0) {
            return false;
        }
        m39050();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39025(C16468 c16468, boolean z) {
        LinearLayout linearLayout = c16468.f53401;
        LinearLayout linearLayout2 = c16468.f53400;
        LinearLayout linearLayout3 = c16468.f53411;
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
    public final int m39055() {
        return this.f53393.m36517();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39023(final C16468 c16468, final C7198 c7198, View view) {
        C18452 c18452 = new C18452(view.getContext(), view, 0);
        c18452.m42997();
        C9898 c9898M42995 = c18452.m42995();
        c9898M42995.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        if (C4767.m14714()) {
            c9898M42995.add(R.id.MT_Protector, R.string.MT_Protector, 0, "手势说明").setIcon(R.drawable.MT_Protector);
        }
        if (C22961.m51812(c16468.f53386.getSelectedTabPosition()).m15314()) {
            c9898M42995.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setCheckable(true).setChecked(ApplicationC17729.f58258.getBoolean("eph", true));
            c9898M42995.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        } else {
            c9898M42995.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c9898M42995.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        }
        C18211.m42360(c9898M42995);
        c18452.m42994(new InterfaceC21436() { // from class: l.᩹ܿܳ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C16468.m39022(this.f76839, c7198, menuItem);
                return true;
            }
        });
        c18452.mo21878();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39022(C16468 c16468, C7198 c7198, MenuItem menuItem) {
        AbstractActivityC17204 abstractActivityC17204 = c16468.f53390;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            C21576.m49068(new RunnableC3291(3, c16468));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C22961.m51801();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            menuItem.setChecked(!menuItem.isChecked());
            boolean zIsChecked = menuItem.isChecked();
            C22961 c22961 = C22961.f74590;
            C6421.m18184(ApplicationC17729.f58258, "eph", zIsChecked);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            ((C8044) c16468.f53410.get(c16468.f53393.m36517())).f26669.m44957(-1);
            return;
        }
        if (itemId != R.string.MT_Protector) {
            if (itemId == R.string.MT_Protector) {
                C24453 c24453 = new C24453(abstractActivityC17204, -1);
                c24453.m22945(R.string.MT_Protector);
                c24453.m22918();
                c24453.m22957(6);
                c24453.m22955(true);
                return;
            }
            if (itemId == R.string.MT_Protector) {
                ((Main) abstractActivityC17204).m115("cloudBackup");
                return;
            } else {
                if (itemId == R.string.MT_Protector) {
                    ActivityC20934.m47864((Context) abstractActivityC17204, C13047.m32505(), false);
                    return;
                }
                return;
            }
        }
        C16434 c16434 = new C16434(abstractActivityC17204, null);
        c16434.setPadding(c16434.getPaddingLeft(), C6907.m19160(20.0f) + c16434.getPaddingTop(), c16434.getPaddingRight(), c16434.getPaddingBottom());
        c16434.setMax(100);
        c16434.setProgress((int) (c7198.m19786() * 100.0f));
        String str = abstractActivityC17204.getString(R.string.MT_Protector) + " (";
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        StringBuilder sbM27333 = C10732.m27333(str);
        sbM27333.append(c16434.getProgress());
        sbM27333.append("%)");
        c2361BuildDialog.m8024(sbM27333.toString());
        c2361BuildDialog.m8005(c16434);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c16434.setOnSeekBarChangeListener(new C6553(c2361BuildDialog.m8016(), str, c7198));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39020(final C16468 c16468, final int i, C5061 c5061, MenuItem menuItem) {
        AbstractActivityC17204 abstractActivityC17204 = c16468.f53390;
        TabLayout tabLayout = c16468.f53386;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            int i2 = i - 1;
            C22961.m51789(i, i2);
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
            C22961.m51789(i, i3);
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
            C4315 c4315 = new C4315(abstractActivityC17204, c5061, i);
            c4315.m22945(R.string.MT_Protector);
            c4315.m22924((CharSequence) c5061.m15318());
            c4315.m22918();
            c4315.m22957(6);
            c4315.m22959();
            c4315.m22955(true);
            return;
        }
        if (itemId != 4) {
            return;
        }
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(abstractActivityC17204.getString(R.string.MT_Protector, c5061.m15318()));
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܳܿܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C16468.m39019(this.f50453, i);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39019(C16468 c16468, int i) {
        TabLayout tabLayout = c16468.f53386;
        C22961.m51788(i);
        if (i == 0 || tabLayout.getSelectedTabPosition() != i) {
            return;
        }
        tabLayout.selectTab(tabLayout.getTabAt(i - 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C11471 m39016(C16468 c16468, ViewOnLongClickListenerC17739 viewOnLongClickListenerC17739, Boolean bool) {
        TabLayout tabLayout = c16468.f53386;
        if (bool.booleanValue()) {
            for (int i = 0; i < tabLayout.getTabCount(); i++) {
                TabLayout.Tab tabAt = tabLayout.getTabAt(i);
                if (tabAt != null) {
                    TabLayout.TabView tabView = tabAt.view;
                    tabView.setTag(R.id.tabLayout, Integer.valueOf(i));
                    tabView.setOnLongClickListener(viewOnLongClickListenerC17739);
                }
            }
        } else {
            c16468.m39050();
            Iterator it = c16468.f53410.iterator();
            while (it.hasNext()) {
                ((C8044) it.next()).f26669.m44956();
            }
        }
        return C11471.f36082;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m39056() {
        InterfaceC3071 interfaceC3071M19783;
        m39044();
        TabLayout tabLayout = new TabLayout(this.f53390);
        ColorStateList tabRippleColor = tabLayout.getTabRippleColor();
        TabLayout tabLayout2 = this.f53386;
        tabLayout2.setTabRippleColor(tabRippleColor);
        tabLayout2.setTabTextColors(tabLayout.getTabTextColors());
        tabLayout2.setSelectedTabIndicator(tabLayout.getTabSelectedIndicator());
        Iterator it = this.f53410.iterator();
        while (it.hasNext()) {
            C8044.m21918((C8044) it.next());
        }
        C7198 c7198 = this.f53407;
        if (c7198.m19781() || (interfaceC3071M19783 = c7198.m19783()) == null) {
            return;
        }
        ((C16247) interfaceC3071M19783).invoke(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static boolean m39012(C16468 c16468) {
        return c16468.f53402;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39028(final C16468 c16468, View view) {
        if (!c16468.f53402) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        final int iIntValue = ((Integer) view.getTag(R.id.tabLayout)).intValue();
        C18452 c18452 = new C18452(view.getContext(), view, 0);
        c18452.m42997();
        C9898 c9898M42995 = c18452.m42995();
        final C5061 c5061M51812 = C22961.m51812(iIntValue);
        boolean z = iIntValue > 0;
        boolean z2 = iIntValue < C22961.m51807() - 1;
        boolean z3 = (c5061M51812.m15316() || c5061M51812.m15314()) ? false : true;
        c9898M42995.add(0, 1, 0, R.string.MT_Protector).setEnabled(z).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, 2, 0, R.string.MT_Protector).setEnabled(z2).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, 3, 0, R.string.MT_Protector).setEnabled(z3).setIcon(R.drawable.MT_Protector);
        c9898M42995.add(0, 4, 0, R.string.MT_Protector).setEnabled(z3).setIcon(R.drawable.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.ۗܿܳ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C16468.m39020(this.f12226, iIntValue, c5061M51812, menuItem);
                return true;
            }
        });
        c18452.mo21878();
        return true;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static int m39031(C16468 c16468) {
        return c16468.f53402 ? 0 : 8;
    }
}
