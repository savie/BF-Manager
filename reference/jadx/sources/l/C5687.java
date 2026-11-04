package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ۚܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C5687 implements PluginDialog.Builder {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2361 f19644;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18365 f19645;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4636 f19646;

    public C5687(C18365 c18365, Context context) {
        this.f19645 = c18365;
        this.f19646 = new C4636(c18365);
        int i = DialogInterfaceC8327.f27315;
        this.f19644 = new C2361(context);
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setTitle(CharSequence charSequence) {
        this.f19644.m8024(m16708(charSequence));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setMessage(CharSequence charSequence) {
        this.f19644.m8008(m16708(charSequence));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setPositiveButton(CharSequence charSequence, final PluginDialog.OnClickListener onClickListener) {
        this.f19644.m8019(m16708(charSequence), onClickListener == null ? null : new DialogInterface.OnClickListener() { // from class: l.᩸ܰ֫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                onClickListener.onClick(this.f74023.f19646, i);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setNegativeButton(CharSequence charSequence, final PluginDialog.OnClickListener onClickListener) {
        this.f19644.m8009(m16708(charSequence), onClickListener == null ? null : new DialogInterface.OnClickListener() { // from class: l.᩷ܰ֫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                onClickListener.onClick(this.f71236.f19646, i);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setNeutralButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f19644.m8025(m16708(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC3565(1, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setCancelable(boolean z) {
        this.f19644.m8012(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnCancelListener(final PluginDialog.OnCancelListener onCancelListener) {
        this.f19644.m8003(onCancelListener == null ? null : new DialogInterface.OnCancelListener() { // from class: l.۫ܰ֫
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                onCancelListener.onCancel(this.f42039.f19646);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnDismissListener(PluginDialog.OnDismissListener onDismissListener) {
        this.f19644.m8004(onDismissListener == null ? null : new DialogInterfaceOnDismissListenerC3932(1, this, onDismissListener));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnShowListener(final PluginDialog.OnShowListener onShowListener) {
        this.f19644.m8010(onShowListener == null ? 0 : new DialogInterface.OnShowListener() { // from class: l.ۤܰ֫
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                onShowListener.onShow(this.f34533.f19646);
            }
        });
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnKeyListener(final PluginDialog.OnKeyListener onKeyListener) {
        this.f19644.m8011(onKeyListener == null ? 0 : new DialogInterface.OnKeyListener() { // from class: l.ᩴܰ֫
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return onKeyListener.onKey(this.f63807.f19646, i, keyEvent);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setItems(CharSequence[] charSequenceArr, final PluginDialog.OnClickListener onClickListener) {
        this.f19644.m8014(charSequenceArr, onClickListener == null ? null : new DialogInterface.OnClickListener() { // from class: l.ۙܰ֫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                onClickListener.onClick(this.f17233.f19646, i);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, final PluginDialog.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.f19644.m8015(charSequenceArr, zArr, onMultiChoiceClickListener == null ? null : new DialogInterface.OnMultiChoiceClickListener() { // from class: l.ܳܰ֫
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                onMultiChoiceClickListener.onClick(this.f50157.f19646, i, z);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, PluginDialog.OnClickListener onClickListener) {
        this.f19644.m8013(charSequenceArr, i, onClickListener == null ? null : new DialogInterfaceOnClickListenerC23333(1, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setView(PluginView pluginView) {
        this.f19644.m8005(C4636.m14461(pluginView));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog create() {
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = this.f19644.m7999();
        C4636 c4636 = this.f19646;
        c4636.m14464(dialogInterfaceC8327M7999);
        return c4636;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog show() {
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = this.f19644.m8016();
        C4636 c4636 = this.f19646;
        c4636.m14464(dialogInterfaceC8327M8016);
        return c4636;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m16708(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C22313.m50373(1, str) == '}' && (stringNullable = this.f19645.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }
}
