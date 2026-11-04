package l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 852L */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17357 implements InterfaceC5315 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Context f56496;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9898 f56497;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public LayoutInflater f56498;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC11280 f56499;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC12772 f56500;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f56501;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Context f56503;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f56502 = R.layout.MT_Protector;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f56495 = R.layout.MT_Protector;

    @Override // l.InterfaceC5315
    public final boolean collapseItemActionView(C9898 c9898, C8407 c8407) {
        return false;
    }

    @Override // l.InterfaceC5315
    public final boolean expandItemActionView(C9898 c9898, C8407 c8407) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo32531(C8407 c8407, InterfaceC1586 interfaceC1586);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo32533(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo32534(C8407 c8407);

    public AbstractC17357(Context context) {
        this.f56496 = context;
        this.f56498 = LayoutInflater.from(context);
    }

    @Override // l.InterfaceC5315
    public void initForMenu(Context context, C9898 c9898) {
        this.f56503 = context;
        LayoutInflater.from(context);
        this.f56497 = c9898;
    }

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC11280 mo32529(ViewGroup viewGroup) {
        if (this.f56499 == null) {
            InterfaceC11280 interfaceC11280 = (InterfaceC11280) this.f56498.inflate(this.f56502, viewGroup, false);
            this.f56499 = interfaceC11280;
            interfaceC11280.initialize(this.f56497);
            updateMenuView(true);
        }
        return this.f56499;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC5315
    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f56499;
        if (viewGroup == null) {
            return;
        }
        C9898 c9898 = this.f56497;
        int i = 0;
        if (c9898 != null) {
            c9898.flagActionItems();
            ArrayList visibleItems = this.f56497.getVisibleItems();
            int size = visibleItems.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C8407 c8407 = (C8407) visibleItems.get(i3);
                if (mo32534(c8407)) {
                    View childAt = viewGroup.getChildAt(i2);
                    C8407 itemData = childAt instanceof InterfaceC1586 ? ((InterfaceC1586) childAt).getItemData() : null;
                    View viewMo32528 = mo32528(c8407, childAt, viewGroup);
                    if (c8407 != itemData) {
                        viewMo32528.setPressed(false);
                        viewMo32528.jumpDrawablesToCurrentState();
                    }
                    if (viewMo32528 != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewMo32528.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewMo32528);
                        }
                        ((ViewGroup) this.f56499).addView(viewMo32528, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo32533(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // l.InterfaceC5315
    public final void setCallback(InterfaceC12772 interfaceC12772) {
        this.f56500 = interfaceC12772;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12772 m40780() {
        return this.f56500;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ */
    public View mo32528(C8407 c8407, View view, ViewGroup viewGroup) {
        InterfaceC1586 interfaceC1586;
        if (!(view instanceof InterfaceC1586)) {
            interfaceC1586 = (InterfaceC1586) this.f56498.inflate(this.f56495, viewGroup, false);
        } else {
            interfaceC1586 = (InterfaceC1586) view;
        }
        mo32531(c8407, interfaceC1586);
        return (View) interfaceC1586;
    }

    @Override // l.InterfaceC5315
    public void onCloseMenu(C9898 c9898, boolean z) {
        InterfaceC12772 interfaceC12772 = this.f56500;
        if (interfaceC12772 != null) {
            interfaceC12772.onCloseMenu(c9898, z);
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
    @Override // l.InterfaceC5315
    public boolean onSubMenuSelected(SubMenuC12026 subMenuC12026) {
        InterfaceC12772 interfaceC12772 = this.f56500;
        C9898 c9898 = subMenuC12026;
        if (interfaceC12772 == null) {
            return false;
        }
        if (subMenuC12026 == null) {
            c9898 = this.f56497;
        }
        return interfaceC12772.mo6418(c9898);
    }

    @Override // l.InterfaceC5315
    public final int getId() {
        return this.f56501;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40781(int i) {
        this.f56501 = R.id.MT_Protector;
    }
}
