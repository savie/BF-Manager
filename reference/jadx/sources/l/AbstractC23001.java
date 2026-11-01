package l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 852L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23001 implements InterfaceC22026 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f74746;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceC12854 f74747;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Context f74748;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12418 f74749;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC5092 f74750;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Context f74753;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public LayoutInflater f74754;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74752 = R.layout.MT_Protector;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f74751 = R.layout.MT_Protector;

    @Override // l.InterfaceC22026
    public final boolean collapseItemActionView(C12418 c12418, C23707 c23707) {
        return false;
    }

    @Override // l.InterfaceC22026
    public final boolean expandItemActionView(C12418 c12418, C23707 c23707) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo14338(C23707 c23707, InterfaceC0858 interfaceC0858);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo14339(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo14340(C23707 c23707);

    public AbstractC23001(Context context) {
        this.f74748 = context;
        this.f74754 = LayoutInflater.from(context);
    }

    @Override // l.InterfaceC22026
    public void initForMenu(Context context, C12418 c12418) {
        this.f74753 = context;
        LayoutInflater.from(context);
        this.f74749 = c12418;
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC12854 mo14335(ViewGroup viewGroup) {
        if (this.f74747 == null) {
            InterfaceC12854 interfaceC12854 = (InterfaceC12854) this.f74754.inflate(this.f74752, viewGroup, false);
            this.f74747 = interfaceC12854;
            interfaceC12854.initialize(this.f74749);
            updateMenuView(true);
        }
        return this.f74747;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC22026
    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f74747;
        if (viewGroup == null) {
            return;
        }
        C12418 c12418 = this.f74749;
        int i = 0;
        if (c12418 != null) {
            c12418.flagActionItems();
            ArrayList visibleItems = this.f74749.getVisibleItems();
            int size = visibleItems.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C23707 c23707 = (C23707) visibleItems.get(i3);
                if (mo14340(c23707)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C23707 itemData = childAt instanceof InterfaceC0858 ? ((InterfaceC0858) childAt).getItemData() : null;
                    View viewMo14334 = mo14334(c23707, childAt, viewGroup);
                    if (c23707 != itemData) {
                        viewMo14334.setPressed(false);
                        viewMo14334.jumpDrawablesToCurrentState();
                    }
                    if (viewMo14334 != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewMo14334.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewMo14334);
                        }
                        ((ViewGroup) this.f74747).addView(viewMo14334, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo14339(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // l.InterfaceC22026
    public final void setCallback(InterfaceC5092 interfaceC5092) {
        this.f74750 = interfaceC5092;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5092 m50863() {
        return this.f74750;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ */
    public View mo14334(C23707 c23707, View view, ViewGroup viewGroup) {
        InterfaceC0858 interfaceC0858;
        if (!(view instanceof InterfaceC0858)) {
            interfaceC0858 = (InterfaceC0858) this.f74754.inflate(this.f74751, viewGroup, false);
        } else {
            interfaceC0858 = (InterfaceC0858) view;
        }
        mo14338(c23707, interfaceC0858);
        return (View) interfaceC0858;
    }

    @Override // l.InterfaceC22026
    public void onCloseMenu(C12418 c12418, boolean z) {
        InterfaceC5092 interfaceC5092 = this.f74750;
        if (interfaceC5092 != null) {
            interfaceC5092.onCloseMenu(c12418, z);
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
    @Override // l.InterfaceC22026
    public boolean onSubMenuSelected(SubMenuC7915 subMenuC7915) {
        InterfaceC5092 interfaceC5092 = this.f74750;
        C12418 c12418 = subMenuC7915;
        if (interfaceC5092 == null) {
            return false;
        }
        if (subMenuC7915 == null) {
            c12418 = this.f74749;
        }
        return interfaceC5092.mo3701(c12418);
    }

    @Override // l.InterfaceC22026
    public final int getId() {
        return this.f74746;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50864(int i) {
        this.f74746 = R.id.MT_Protector;
    }
}
