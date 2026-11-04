package l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginEditTextWatcher;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginEditTextBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G7NS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11652 extends AbstractC0907 implements PluginEditTextBuilder {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f37756;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public CharSequence f37757;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Float f37758;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Integer f37759;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Boolean f37760;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Integer f37761;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Typeface f37762;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Boolean f37763;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ArrayList f37764;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Integer f37765;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f37766;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Integer f37767;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f37768;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f37769;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f37770;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Integer f37771;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Integer f37772;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f37773;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CharSequence f37774;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Integer f37775;

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginEditTextBuilder onClick(PluginView.OnClickListener onClickListener) {
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginEditTextBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final /* bridge */ /* synthetic */ PluginEditTextBuilder backgroundColor(int i) {
        backgroundColor(i);
        return this;
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final void mo3674(C6128 c6128) {
        C10601 c10601 = (C10601) c6128;
        Drawable drawable = this.f3398;
        if (drawable instanceof C1958) {
            this.f3398 = C23255.m52277(((C23255) c10601.m17689()).getContext(), ((C1958) drawable).f6570 ? 1 : 0);
        }
        ((C23255) c10601.m17689()).setBackground(null);
        ((C23255) c10601.m17689()).setPadding(0, 0, 0, 0);
        super.mo3674(c10601);
        Integer num = this.f37771;
        if (num != null) {
            c10601.setSoftWrap(num.intValue());
        }
        Float f = this.f37758;
        if (f != null) {
            c10601.setTextSize(f.floatValue());
        }
        Boolean bool = this.f37763;
        if (bool != null) {
            c10601.setSingleLine(bool.booleanValue());
        }
        Typeface typeface = this.f37762;
        if (typeface != null) {
            c10601.setTypeface(typeface);
        }
        String str = this.f37766;
        if (str != null) {
            c10601.setSyntaxHighlight(str);
        }
        Integer num2 = this.f37767;
        if (num2 != null && num2.intValue() > 0) {
            c10601.setMaxLength(this.f37767.intValue());
        }
        Integer num3 = this.f37765;
        if (num3 != null) {
            c10601.setTextColor(num3.intValue());
        }
        Integer num4 = this.f37759;
        if (num4 != null) {
            c10601.setHintTextColor(num4.intValue());
        }
        Integer num5 = this.f37761;
        if (num5 != null) {
            c10601.setMaxLines(num5.intValue());
        }
        Integer num6 = this.f37775;
        if (num6 != null) {
            c10601.setMinLines(num6.intValue());
        }
        Integer num7 = this.f37772;
        if (num7 != null) {
            c10601.setInputType(num7.intValue());
        }
        if (this.f37769) {
            c10601.setBracketHighlightEnable(false);
        }
        CharSequence charSequence = this.f37757;
        if (charSequence != null) {
            c10601.m27050(charSequence);
        }
        CharSequence charSequence2 = this.f37774;
        if (charSequence2 != null) {
            c10601.m27049(charSequence2.toString());
        }
        int i = this.f37768;
        if (i == 1) {
            c10601.setSelection(this.f37770, this.f37773);
        } else if (i == 2) {
            c10601.selectAll();
        } else if (i == 3) {
            c10601.selectEnd();
        }
        Boolean bool2 = this.f37760;
        if (bool2 != null) {
            c10601.setReadOnly(bool2.booleanValue());
        }
        ArrayList arrayList = this.f37764;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c10601.addTextChangedListener((PluginEditTextWatcher) it.next());
            }
        }
        if (this.f37756) {
            c10601.requestFocusAndShowIME();
        }
    }

    public C11652(PluginUIBuilder pluginUIBuilder, boolean z) {
        super(pluginUIBuilder);
        this.f3398 = new C1958(z);
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final C6128 mo2280(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C10601(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final View mo2279(Context context) {
        return new C23255(context);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder text(CharSequence charSequence) {
        this.f37757 = m3671(charSequence);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder text(JSONObject jSONObject) {
        text(jSONObject, null);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder text(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            this.f37757 = str;
            return this;
        }
        this.f37757 = jSONObject.getString(requireId(), str);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder hint(CharSequence charSequence) {
        this.f37774 = m3671(charSequence);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder textSize(float f) {
        this.f37758 = Float.valueOf(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder textColor(int i) {
        this.f37765 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder setHintTextColor(int i) {
        this.f37759 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder textStyle(boolean z, boolean z2) {
        if (z && z2) {
            this.f37762 = Typeface.create(Typeface.DEFAULT, 3);
            return this;
        }
        if (z) {
            this.f37762 = Typeface.DEFAULT_BOLD;
            return this;
        }
        if (z2) {
            this.f37762 = Typeface.create(Typeface.DEFAULT, 2);
            return this;
        }
        this.f37762 = Typeface.DEFAULT;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder bold() {
        textStyle(true, false);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder italic() {
        textStyle(false, true);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder typeface(Typeface typeface) {
        this.f37762 = typeface;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder typeface(Typeface typeface, int i) {
        if (i > 0) {
            if (typeface == null) {
                typeface = Typeface.defaultFromStyle(i);
            } else {
                typeface = Typeface.create(typeface, i);
            }
        }
        this.f37762 = typeface;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder singleLine(boolean z) {
        this.f37763 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder lines(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.f37761 = numValueOf;
        this.f37775 = numValueOf;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder minLines(int i) {
        this.f37775 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder maxLines(int i) {
        this.f37761 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder inputType(int i) {
        this.f37772 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder inputTypeMultiline() {
        this.f37772 = 131073;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder inputTypeNumber() {
        this.f37772 = 2;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder maxLength(int i) {
        this.f37767 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder disableBracketHighlight() {
        this.f37769 = true;
        return this;
    }

    @Override // l.AbstractC0907, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginEditTextBuilder background(Drawable drawable) {
        this.f3398 = drawable;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder select(int i) {
        this.f37768 = 1;
        this.f37773 = i;
        this.f37770 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder select(int i, int i2) {
        this.f37768 = 1;
        this.f37770 = i;
        this.f37773 = i2;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder selectAll() {
        this.f37768 = 2;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder selectEnd() {
        this.f37768 = 3;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder syntaxHighlight(String str) {
        this.f37766 = str;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder softWrap(int i) {
        this.f37771 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder readOnly() {
        this.f37760 = Boolean.TRUE;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder readOnly(boolean z) {
        this.f37760 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder addTextChangedListener(PluginEditTextWatcher pluginEditTextWatcher) {
        if (this.f37764 == null) {
            this.f37764 = new ArrayList(1);
        }
        this.f37764.add(pluginEditTextWatcher);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder requestFocusAndShowIME() {
        this.f3407 = true;
        this.f37756 = true;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final boolean isBoxStyle() {
        Drawable drawable = this.f3398;
        return (drawable instanceof C1958) && ((C1958) drawable).f6570;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final boolean isLineStyle() {
        Drawable drawable = this.f3398;
        return (drawable instanceof C1958) && !((C1958) drawable).f6570;
    }
}
