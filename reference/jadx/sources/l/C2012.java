package l;

import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.֫ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6DR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2012 extends LinearLayout {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f6695 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2012 f6696;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public TextView f6697;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public TextView f6698;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C23861 f6699;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C17717 f6700;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final RunnableC4021 f6701;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f6702;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ListView f6703;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C5752 f6704;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public TextView f6705;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public ImageView f6706;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public BaseAdapter f6707;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Map f6708;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f6709;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public ListView f6710;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f6711;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f6712;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C15655 f6713;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f6714;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C21403 f6715;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f6716;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m6896(String str) {
        return str == null ? "" : C18063.m42088(46, 1, str);
    }

    public C2012(ContextThemeWrapper contextThemeWrapper, C21403 c21403) {
        super(contextThemeWrapper);
        this.f6696 = this;
        this.f6708 = Collections.EMPTY_MAP;
        this.f6701 = new RunnableC4021(1, this);
        this.f6715 = c21403;
        this.f6700 = new C17717(contextThemeWrapper);
        setOrientation(1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m6925() {
        return (this.f6713 == null && this.f6712 == 0 && !this.f6714) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6922(boolean z) {
        this.f6714 = z;
        m6910();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6918() {
        removeCallbacks(this.f6701);
        this.f6708 = Collections.EMPTY_MAP;
        this.f6713 = null;
        this.f6699 = null;
        this.f6709 = null;
        this.f6712 = 0;
        this.f6702 = 0;
        this.f6714 = false;
        this.f6716 = false;
        this.f6704 = null;
        this.f6711 = null;
        this.f6698 = null;
        this.f6705 = null;
        this.f6697 = null;
        this.f6703 = null;
        this.f6710 = null;
        this.f6707 = null;
        this.f6706 = null;
        removeAllViews();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6920(C15655 c15655, String str) {
        removeCallbacks(this.f6701);
        this.f6708 = Collections.EMPTY_MAP;
        this.f6713 = c15655;
        this.f6709 = str;
        this.f6699 = new C23861(this.f6715.m48699().f4718.f62011);
        this.f6712 = 0;
        this.f6702 = 0;
        m6910();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6919(int i) {
        removeCallbacks(this.f6701);
        this.f6708 = Collections.EMPTY_MAP;
        this.f6713 = null;
        this.f6699 = null;
        this.f6702 = 0;
        this.f6712 = i;
        m6910();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6921(C15655 c15655, Map map) {
        if (this.f6713 != c15655 || this.f6708.equals(map)) {
            return;
        }
        this.f6708 = map;
        m6912();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m6912() {
        int iM4786;
        RunnableC4021 runnableC4021 = this.f6701;
        removeCallbacks(runnableC4021);
        if (this.f6713 == null || this.f6705 == null) {
            return;
        }
        C21403 c21403 = this.f6715;
        if (c21403.m48699() != null && (iM4786 = c21403.m48699().m4786()) >= 0) {
            View viewFindFocus = findFocus();
            if ((viewFindFocus instanceof TextView) && ((TextView) viewFindFocus).hasSelection()) {
                postDelayed(runnableC4021, 300L);
                return;
            }
            m6916(iM4786);
            ListView listView = this.f6703;
            if (listView == null) {
                return;
            }
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            View childAt = this.f6703.getChildAt(0);
            int top = childAt == null ? 0 : childAt.getTop();
            Object item = this.f6703.getAdapter() == null ? null : this.f6703.getAdapter().getItem(firstVisiblePosition);
            String str = item instanceof Map.Entry ? (String) ((Map.Entry) item).getKey() : null;
            m6913(iM4786);
            if (str != null) {
                for (int i = 0; i < this.f6703.getAdapter().getCount(); i++) {
                    Object item2 = this.f6703.getAdapter().getItem(i);
                    if ((item2 instanceof Map.Entry) && str.equals(((Map.Entry) item2).getKey())) {
                        firstVisiblePosition = i;
                        break;
                    }
                }
            }
            this.f6703.setSelectionFromTop(firstVisiblePosition, top);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m6910() {
        removeCallbacks(this.f6701);
        removeAllViews();
        this.f6704 = null;
        this.f6711 = null;
        this.f6698 = null;
        this.f6705 = null;
        this.f6697 = null;
        this.f6703 = null;
        this.f6710 = null;
        this.f6707 = null;
        C17717 c17717 = this.f6700;
        C2012 c2012 = this.f6696;
        LinearLayout linearLayoutM41487 = c17717.m41487((LinearLayout) c2012);
        linearLayoutM41487.addView(c17717.m41488(15, -920329, getContext().getString(R.string.MT_Protector)), new LinearLayout.LayoutParams(0, -2, 1.0f));
        final C21403 c21403 = this.f6715;
        C17359.requireNonNull(c21403);
        ImageView imageViewM41485 = this.f6700.m41485(linearLayoutM41487, R.drawable.MT_Protector, R.string.MT_Protector, new RunnableC2068(1, c21403), -13058049);
        imageViewM41485.setPadding(m6905(7), m6905(7), m6905(7), m6905(7));
        imageViewM41485.setEnabled(!this.f6714);
        imageViewM41485.setAlpha(this.f6714 ? 0.4f : 1.0f);
        this.f6706 = c17717.m41486(linearLayoutM41487, new Runnable() { // from class: l.ۡܽܳ
            @Override // java.lang.Runnable
            public final void run() {
                c21403.m48700();
            }
        }, c21403.m48695());
        this.f6700.m41485(linearLayoutM41487, R.drawable.MT_Protector, R.string.MT_Protector, new Runnable() { // from class: l.ۖܽܳ
            @Override // java.lang.Runnable
            public final void run() {
                c21403.m48694();
            }
        }, -5129275);
        this.f6700.m41485(linearLayoutM41487, R.drawable.MT_Protector, R.string.MT_Protector, new RunnableC5458(3, c21403), -5129275);
        C15655 c15655 = this.f6713;
        if (c15655 != null) {
            String str = c15655.f50879.isEmpty() ? "" : (String) this.f6713.f50879.iterator().next();
            String str2 = this.f6709;
            if (str2 != null) {
                str = str2;
            }
            TextView textViewM41488 = c17717.m41488(11, -13058049, str);
            textViewM41488.setTextIsSelectable(true);
            textViewM41488.setTypeface(Typeface.MONOSPACE);
            textViewM41488.setIncludeFontPadding(false);
            textViewM41488.setLineSpacing(m6905(2), 1.0f);
            textViewM41488.setPadding(0, m6905(4), 0, m6905(8));
            c2012.addView(textViewM41488);
        }
        c17717.m41484(c2012);
        if (this.f6714 || this.f6712 != 0) {
            TextView textViewM41489 = c17717.m41488(10, -5129275, getContext().getString(this.f6714 ? R.string.MT_Protector : this.f6712));
            textViewM41489.setPadding(0, m6905(7), 0, m6905(7));
            c2012.addView(textViewM41489);
        }
        if (this.f6713 != null) {
            TextView textViewM414810 = c17717.m41488(13, -18341, "");
            this.f6697 = textViewM414810;
            textViewM414810.setTextIsSelectable(true);
            this.f6697.setIncludeFontPadding(false);
            this.f6697.setLineSpacing(m6905(2), 1.0f);
            this.f6697.setPadding(0, m6905(8), 0, 0);
            TextView textViewM414811 = c17717.m41488(11, -5129275, "");
            this.f6705 = textViewM414811;
            textViewM414811.setTextIsSelectable(true);
            this.f6705.setTypeface(Typeface.MONOSPACE);
            this.f6705.setIncludeFontPadding(false);
            this.f6705.setLineSpacing(m6905(2), 1.0f);
            this.f6705.setPadding(0, m6905(4), 0, 0);
            c2012.addView(this.f6697);
            c2012.addView(this.f6705);
            LinearLayout linearLayoutM41488 = c17717.m41487((LinearLayout) c2012);
            linearLayoutM41488.setPadding(0, m6905(7), 0, m6905(7));
            this.f6698 = c17717.m41489(linearLayoutM41488, R.string.MT_Protector, new RunnableC15279(2, this));
            this.f6711 = c17717.m41489(linearLayoutM41488, R.string.MT_Protector, new RunnableC22836(3, this));
            this.f6704 = c17717.m41490(linearLayoutM41488, new RunnableC12350(4, this));
            LinearLayout linearLayoutM41489 = c17717.m41487((LinearLayout) c2012);
            m6897(linearLayoutM41489, R.string.MT_Protector, 1);
            m6897(linearLayoutM41489, R.string.MT_Protector, 2);
            if (this.f6702 != 0) {
                View viewM41484 = c17717.m41484(c2012);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewM41484.getLayoutParams();
                layoutParams.setMargins(0, m6905(4), 0, 0);
                viewM41484.setLayoutParams(layoutParams);
            }
            int i = this.f6702;
            if (i == 1) {
                this.f6710 = m6915();
                C10960 c10960 = new C10960(this);
                this.f6707 = c10960;
                this.f6710.setAdapter((ListAdapter) c10960);
            } else if (i == 2) {
                ListView listViewM6915 = m6915();
                this.f6703 = listViewM6915;
                listViewM6915.setItemsCanFocus(true);
                TextView textViewM414812 = c17717.m41488(11, -5129275, getContext().getString(R.string.MT_Protector));
                textViewM414812.setGravity(17);
                c2012.addView(textViewM414812, new LinearLayout.LayoutParams(-1, this.f6703.getLayoutParams().height));
                this.f6703.setEmptyView(textViewM414812);
            }
            m6923();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6898(C2012 c2012) {
        C1310 c1310M48699 = c2012.f6715.m48699();
        c1310M48699.m4783(c1310M48699.f4718.f62011[c1310M48699.m4786()]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6897(LinearLayout linearLayout, int i, final int i2) {
        final boolean z = this.f6702 == i2;
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setGravity(17);
        linearLayout2.setSelected(z);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(587202559);
        int i3 = z ? -13877164 : -13485242;
        int i4 = z ? -13542279 : 0;
        C17717 c17717 = this.f6700;
        linearLayout2.setBackground(new RippleDrawable(colorStateListValueOf, c17717.m41483(i3, 5, i4), null));
        TextView textViewM41488 = c17717.m41488(11, z ? -13058049 : -920329, getContext().getString(i));
        textViewM41488.setIncludeFontPadding(false);
        linearLayout2.addView(textViewM41488);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.MT_Protector);
        imageView.setImageTintList(ColorStateList.valueOf(z ? -13058049 : -920329));
        imageView.setRotation(z ? 180.0f : 0.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m6905(16), m6905(16));
        layoutParams.leftMargin = m6905(6);
        linearLayout2.addView(imageView, layoutParams);
        linearLayout2.setContentDescription(getContext().getString(z ? R.string.MT_Protector : R.string.MT_Protector, textViewM41488.getText()));
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: l.۬ܽܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2012.m6903(this.f44339, z, i2);
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, m6905(32), 1.0f);
        layoutParams2.setMargins(m6905(2), m6905(2), m6905(2), m6905(2));
        linearLayout.addView(linearLayout2, layoutParams2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6903(C2012 c2012, boolean z, int i) {
        if (z) {
            i = 0;
        }
        c2012.f6702 = i;
        c2012.m6910();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6924(boolean z) {
        ImageView imageView = this.f6706;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m6923() {
        C21403 c21403;
        String string;
        int iIndexOf;
        String str;
        removeCallbacks(this.f6701);
        if (this.f6713 == null || (c21403 = this.f6715) == null || c21403.m48699() == null || this.f6697 == null) {
            return;
        }
        C1310 c1310M48699 = c21403.m48699();
        int iM4786 = c1310M48699.m4786();
        C19165 c19165 = c1310M48699.f4718;
        this.f6697.clearFocus();
        this.f6705.clearFocus();
        TextView textView = this.f6697;
        if (iM4786 < 0) {
            string = getContext().getString(R.string.MT_Protector);
        } else {
            StringBuilder sbM12235 = C3769.m12235(iM4786, "#", " ");
            sbM12235.append(m6896((String) ((C20131) this.f6713.f50877.get(iM4786)).f64695.get(Name.LABEL)));
            string = sbM12235.toString();
        }
        textView.setText(string);
        if (iM4786 >= 0 && (str = (String) ((C20131) this.f6713.f50877.get(iM4786)).f64695.get(TextBundle.TEXT_ENTRY)) != null && !str.isEmpty()) {
            this.f6697.append("  “" + C18969.m44060(80, str) + "”");
        }
        m6916(iM4786);
        this.f6698.setEnabled(iM4786 >= 0 && c19165.f62011[iM4786] >= 0);
        this.f6711.setEnabled(iM4786 >= 0 && !c19165.m44419(iM4786).isEmpty());
        this.f6704.setEnabled(c1310M48699.m4782() > 0);
        TextView textView2 = this.f6698;
        textView2.setTextColor(textView2.isEnabled() ? -920329 : -2135835707);
        TextView textView3 = this.f6711;
        textView3.setTextColor(textView3.isEnabled() ? -920329 : -2135835707);
        C5752 c5752 = this.f6704;
        c5752.setTextColor(c5752.isEnabled() ? -920329 : -2135835707);
        String string2 = getContext().getString(R.string.MT_Protector);
        if (c1310M48699.m4782() > 0) {
            int iM4784 = c1310M48699.m4784();
            String strM34972 = C14483.m34972(string2, " ");
            if (iM4784 >= 0) {
                StringBuilder sbM27333 = C10732.m27333(strM34972);
                sbM27333.append(iM4784 + 1);
                sbM27333.append("/");
                strM34972 = sbM27333.toString();
            }
            StringBuilder sbM27334 = C10732.m27333(strM34972);
            sbM27334.append(c1310M48699.m4782());
            string2 = sbM27334.toString();
        }
        this.f6704.setText(string2);
        if (this.f6707 != null) {
            if (iM4786 >= 0) {
                this.f6699.m53208(iM4786);
            }
            this.f6707.notifyDataSetChanged();
            if (iM4786 >= 0 && ((iIndexOf = this.f6699.f77249.indexOf(Integer.valueOf(iM4786))) < this.f6710.getFirstVisiblePosition() || iIndexOf > this.f6710.getLastVisiblePosition())) {
                this.f6710.setSelection(iIndexOf);
            }
        }
        if (this.f6703 != null) {
            m6913(iM4786);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m6916(int i) {
        String string = i < 0 ? null : (String) ((C20131) this.f6713.f50877.get(i)).f64695.get("resource-id");
        String str = (String) this.f6708.get(Integer.valueOf(i));
        if (string == null || string.isEmpty()) {
            string = getContext().getString(R.string.layout_no_id);
        } else if (str != null) {
            string = string + " (" + str + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (!TextUtils.equals(this.f6705.getText(), string)) {
            this.f6705.setText(string);
        }
        this.f6705.setVisibility(i < 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m6914(final C2012 c2012) {
        C21403 c21403 = c2012.f6715;
        final C1310 c1310M48699 = c21403.m48699();
        ArrayList arrayListM44419 = c1310M48699.f4718.m44419(c1310M48699.m4786());
        if (arrayListM44419.size() == 1) {
            c1310M48699.m4783(((Integer) arrayListM44419.get(0)).intValue());
            return;
        }
        C18452 c18452M48688 = c21403.m48688(c2012.f6711);
        Iterator it = arrayListM44419.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            C9898 c9898M42995 = c18452M48688.m42995();
            StringBuilder sbM12235 = C3769.m12235(iIntValue, "#", " ");
            sbM12235.append(m6896((String) ((C20131) c1310M48699.f4714.f50877.get(iIntValue)).f64695.get(Name.LABEL)));
            c9898M42995.add(0, iIntValue, 0, sbM12235.toString()).setChecked(iIntValue == c1310M48699.m4786());
        }
        c18452M48688.m42994(new InterfaceC21436() { // from class: l.۠ܽܳ
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C2012.m6901(this.f28505, c1310M48699, menuItem);
                return true;
            }
        });
        c18452M48688.mo21878();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m6917(C2012 c2012) {
        C21403 c21403 = c2012.f6715;
        C1310 c1310M48699 = c21403.m48699();
        c21403.m48690(new C8723(new ContextThemeWrapper(c2012.getContext(), R.style.MT_Protector), c2012.f6704, c1310M48699.m4785(), c1310M48699.f4714, c1310M48699.m4786(), new C7276(c2012, c1310M48699)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6900(C2012 c2012, C1310 c1310, int i) {
        if (c2012.f6715.m48699() == c1310) {
            c1310.m4783(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6901(C2012 c2012, C1310 c1310, MenuItem menuItem) {
        if (c2012.f6715.m48699() == c1310) {
            c1310.m4783(menuItem.getItemId());
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private ListView m6915() {
        C22895 c22895 = new C22895(new ContextThemeWrapper(getContext(), R.style.MT_Protector));
        c22895.setDividerHeight(0);
        c22895.setBackgroundColor(0);
        Point point = new Point();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
        this.f6696.addView(c22895, new LinearLayout.LayoutParams(-1, Math.min(m6905(180), Math.max(m6905(96), point.y / 3))));
        return c22895;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m6913(int i) {
        if (i < 0) {
            this.f6703.setAdapter((ListAdapter) null);
        } else {
            this.f6703.setAdapter((ListAdapter) new C15435(this, C5215.m15690(((C20131) this.f6713.f50877.get(i)).f64695, this.f6716, getResources().getDisplayMetrics().density, (String) this.f6708.get(Integer.valueOf(i))), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int m6905(int i) {
        return Math.round(i * getResources().getDisplayMetrics().density);
    }
}
