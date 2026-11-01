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

/* JADX INFO: renamed from: l.֡ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7NS */
/* JADX INFO: loaded from: classes3.dex */
public final class C0156 extends AbstractC6506 implements PluginEditTextBuilder {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f1212;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f1213;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f1214;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Integer f1215;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Integer f1216;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Integer f1217;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Typeface f1218;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Integer f1219;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public CharSequence f1220;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Boolean f1221;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Float f1222;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f1223;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f1224;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Integer f1225;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f1226;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public CharSequence f1227;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Integer f1228;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f1229;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Boolean f1230;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Integer f1231;

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginEditTextBuilder onClick(PluginView.OnClickListener onClickListener) {
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onClick(PluginView.OnClickListener onClickListener) {
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginEditTextBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginUIBuilder onLongClick(PluginView.OnLongClickListener onLongClickListener) {
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final /* bridge */ /* synthetic */ PluginEditTextBuilder backgroundColor(int i) {
        backgroundColor(i);
        return this;
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1252(C3247 c3247) {
        C19476 c19476 = (C19476) c3247;
        Drawable drawable = this.f21925;
        if (drawable instanceof C19913) {
            this.f21925 = C10948.m27465(((C10948) c19476.m9720()).getContext(), ((C19913) drawable).f63828 ? 1 : 0);
        }
        ((C10948) c19476.m9720()).setBackground(null);
        ((C10948) c19476.m9720()).setPadding(0, 0, 0, 0);
        super.mo1252(c19476);
        Integer num = this.f1225;
        if (num != null) {
            c19476.setSoftWrap(num.intValue());
        }
        Float f = this.f1222;
        if (f != null) {
            c19476.setTextSize(f.floatValue());
        }
        Boolean bool = this.f1221;
        if (bool != null) {
            c19476.setSingleLine(bool.booleanValue());
        }
        Typeface typeface = this.f1218;
        if (typeface != null) {
            c19476.setTypeface(typeface);
        }
        String str = this.f1214;
        if (str != null) {
            c19476.setSyntaxHighlight(str);
        }
        Integer num2 = this.f1217;
        if (num2 != null && num2.intValue() > 0) {
            c19476.setMaxLength(this.f1217.intValue());
        }
        Integer num3 = this.f1231;
        if (num3 != null) {
            c19476.setTextColor(num3.intValue());
        }
        Integer num4 = this.f1216;
        if (num4 != null) {
            c19476.setHintTextColor(num4.intValue());
        }
        Integer num5 = this.f1219;
        if (num5 != null) {
            c19476.setMaxLines(num5.intValue());
        }
        Integer num6 = this.f1215;
        if (num6 != null) {
            c19476.setMinLines(num6.intValue());
        }
        Integer num7 = this.f1228;
        if (num7 != null) {
            c19476.setInputType(num7.intValue());
        }
        if (this.f1226) {
            c19476.setBracketHighlightEnable(false);
        }
        CharSequence charSequence = this.f1220;
        if (charSequence != null) {
            c19476.m44538(charSequence);
        }
        CharSequence charSequence2 = this.f1227;
        if (charSequence2 != null) {
            c19476.m44537(charSequence2.toString());
        }
        int i = this.f1223;
        if (i == 1) {
            c19476.setSelection(this.f1212, this.f1229);
        } else if (i == 2) {
            c19476.selectAll();
        } else if (i == 3) {
            c19476.selectEnd();
        }
        Boolean bool2 = this.f1230;
        if (bool2 != null) {
            c19476.setReadOnly(bool2.booleanValue());
        }
        ArrayList arrayList = this.f1213;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c19476.addTextChangedListener((PluginEditTextWatcher) it.next());
            }
        }
        if (this.f1224) {
            c19476.requestFocusAndShowIME();
        }
    }

    public C0156(PluginUIBuilder pluginUIBuilder, boolean z) {
        super(pluginUIBuilder);
        this.f21925 = new C19913(z);
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3247 mo1251(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C19476(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View mo1250(Context context) {
        return new C10948(context);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder text(CharSequence charSequence) {
        this.f1220 = m17705(charSequence);
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
            this.f1220 = str;
            return this;
        }
        this.f1220 = jSONObject.getString(requireId(), str);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder hint(CharSequence charSequence) {
        this.f1227 = m17705(charSequence);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder textSize(float f) {
        this.f1222 = Float.valueOf(f);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder textColor(int i) {
        this.f1231 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder setHintTextColor(int i) {
        this.f1216 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder textStyle(boolean z, boolean z2) {
        if (z && z2) {
            this.f1218 = Typeface.create(Typeface.DEFAULT, 3);
            return this;
        }
        if (z) {
            this.f1218 = Typeface.DEFAULT_BOLD;
            return this;
        }
        if (z2) {
            this.f1218 = Typeface.create(Typeface.DEFAULT, 2);
            return this;
        }
        this.f1218 = Typeface.DEFAULT;
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
        this.f1218 = typeface;
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
        this.f1218 = typeface;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder singleLine(boolean z) {
        this.f1221 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder lines(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.f1219 = numValueOf;
        this.f1215 = numValueOf;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder minLines(int i) {
        this.f1215 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder maxLines(int i) {
        this.f1219 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder inputType(int i) {
        this.f1228 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder inputTypeMultiline() {
        this.f1228 = 131073;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder inputTypeNumber() {
        this.f1228 = 2;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder maxLength(int i) {
        this.f1217 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder disableBracketHighlight() {
        this.f1226 = true;
        return this;
    }

    @Override // l.AbstractC6506, bin.mt.plugin.api.ui.builder.PluginBaseViewBuilder
    public final PluginEditTextBuilder background(Drawable drawable) {
        this.f21925 = drawable;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder select(int i) {
        this.f1223 = 1;
        this.f1229 = i;
        this.f1212 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder select(int i, int i2) {
        this.f1223 = 1;
        this.f1212 = i;
        this.f1229 = i2;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder selectAll() {
        this.f1223 = 2;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder selectEnd() {
        this.f1223 = 3;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder syntaxHighlight(String str) {
        this.f1214 = str;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder softWrap(int i) {
        this.f1225 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder readOnly() {
        this.f1230 = Boolean.TRUE;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder readOnly(boolean z) {
        this.f1230 = Boolean.valueOf(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder addTextChangedListener(PluginEditTextWatcher pluginEditTextWatcher) {
        if (this.f1213 == null) {
            this.f1213 = new ArrayList(1);
        }
        this.f1213.add(pluginEditTextWatcher);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final PluginEditTextBuilder requestFocusAndShowIME() {
        this.f21931 = true;
        this.f1224 = true;
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final boolean isBoxStyle() {
        Drawable drawable = this.f21925;
        return (drawable instanceof C19913) && ((C19913) drawable).f63828;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginEditTextBuilder
    public final boolean isLineStyle() {
        Drawable drawable = this.f21925;
        return (drawable instanceof C19913) && !((C19913) drawable).f63828;
    }
}
