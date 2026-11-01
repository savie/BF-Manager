package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ܺۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7QN */
/* JADX INFO: loaded from: classes4.dex */
public final class C15680 implements PluginDialog.Builder {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8067 f50908;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2355 f50909;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18770 f50910;

    public C15680(C2355 c2355, Context context) {
        this.f50909 = c2355;
        this.f50910 = new C18770(c2355);
        int i = DialogInterfaceC19356.f62401;
        this.f50908 = new C8067(context);
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setTitle(CharSequence charSequence) {
        this.f50908.m21277(m37364(charSequence));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setMessage(CharSequence charSequence) {
        this.f50908.m21261(m37364(charSequence));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setPositiveButton(CharSequence charSequence, final PluginDialog.OnClickListener onClickListener) {
        this.f50908.m21272(m37364(charSequence), onClickListener == null ? null : new DialogInterface.OnClickListener() { // from class: l.ۡۘۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                onClickListener.onClick(this.f29765.f50910, i);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setNegativeButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f50908.m21262(m37364(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC2558(1, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setNeutralButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f50908.m21278(m37364(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC11732(2, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setCancelable(boolean z) {
        this.f50908.m21265(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnCancelListener(final PluginDialog.OnCancelListener onCancelListener) {
        this.f50908.m21256(onCancelListener == null ? null : new DialogInterface.OnCancelListener() { // from class: l.᩷ۘۘ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                onCancelListener.onCancel(this.f67164.f50910);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnDismissListener(final PluginDialog.OnDismissListener onDismissListener) {
        this.f50908.m21257(onDismissListener == null ? null : new DialogInterface.OnDismissListener() { // from class: l.۠ۘۘ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                onDismissListener.onDismiss(this.f26002.f50910);
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
    public final PluginDialog.Builder setOnShowListener(final PluginDialog.OnShowListener onShowListener) {
        this.f50908.m21264(onShowListener == null ? 0 : new DialogInterface.OnShowListener() { // from class: l.᩵ۘۘ
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                onShowListener.onShow(this.f62030.f50910);
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
        this.f50908.m21263(onKeyListener == null ? 0 : new DialogInterface.OnKeyListener() { // from class: l.ۤۘۘ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return onKeyListener.onKey(this.f34254.f50910, i, keyEvent);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setItems(CharSequence[] charSequenceArr, PluginDialog.OnClickListener onClickListener) {
        this.f50908.m21267(charSequenceArr, onClickListener == null ? null : new DialogInterfaceOnClickListenerC14537(2, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, final PluginDialog.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.f50908.m21268(charSequenceArr, zArr, onMultiChoiceClickListener == null ? null : new DialogInterface.OnMultiChoiceClickListener() { // from class: l.۟ۘۘ
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                onMultiChoiceClickListener.onClick(this.f24023.f50910, i, z);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, PluginDialog.OnClickListener onClickListener) {
        this.f50908.m21266(charSequenceArr, i, onClickListener == null ? null : new DialogInterfaceOnClickListenerC2420(1, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setView(PluginView pluginView) {
        this.f50908.m21258(C18770.m43329(pluginView));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog create() {
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = this.f50908.m21252();
        C18770 c18770 = this.f50910;
        c18770.m43332(dialogInterfaceC19356M21252);
        return c18770;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog show() {
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = this.f50908.m21269();
        C18770 c18770 = this.f50910;
        c18770.m43332(dialogInterfaceC19356M21269);
        return c18770;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m37364(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C3184.m9601(1, str) == '}' && (stringNullable = this.f50909.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }
}
