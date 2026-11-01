package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC2854 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ImageView f10781;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f10782;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f10783;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public View f10784;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f10785;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f10786;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f10787;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC2854(ActivityC5677 activityC5677, View view) {
        super(view);
        this.f10782 = activityC5677;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f10784 = view.findViewById(R.id.MT_Protector);
        this.f10786 = view.findViewById(R.id.MT_Protector);
        this.f10781 = (ImageView) view.findViewById(R.id.icon);
        this.f10783 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f10785 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f10787 = imageView;
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        Drawable drawableM26304 = C10405.m26304(activityC5677, R.drawable.MT_Protector);
        C13638.requireNonNull(drawableM26304);
        Drawable drawableMutate = drawableM26304.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition;
        ActivityC5677 activityC5677 = this.f10782;
        if (activityC5677.f19371.m28846() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return;
        }
        ActivityC5677.m15589(activityC5677, bindingAdapterPosition, true);
        activityC5677.m15667();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        final int bindingAdapterPosition;
        ActivityC5677 activityC5677 = this.f10782;
        if (!activityC5677.f19371.m28846() && (bindingAdapterPosition = getBindingAdapterPosition()) != -1) {
            final AbstractC22611 abstractC22611 = (AbstractC22611) activityC5677.f19367.get(bindingAdapterPosition);
            C14145 c14145M15625 = ActivityC5677.m15625(activityC5677, bindingAdapterPosition);
            if (abstractC22611.mo3619() || C14145.m34197(c14145M15625)) {
                View view2 = this.f10786;
                C16195 c16195 = new C16195(activityC5677, view2, 8388611);
                C2995.m8960(view2);
                c16195.m38292();
                C12418 c12418M38298 = c16195.m38298();
                if (abstractC22611.mo3619()) {
                    c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                if (C14145.m34197(c14145M15625)) {
                    SubMenu subMenuAddSubMenu = c12418M38298.addSubMenu(0, R.id.MT_Protector, 0, activityC5677.getString(R.string.MT_Protector) + "…");
                    subMenuAddSubMenu.getItem().setIcon(R.drawable.MT_Protector);
                    subMenuAddSubMenu.setHeaderTitle(R.string.MT_Protector);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c14145M15625.f46416 + c14145M15625.f46417 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c14145M15625.f46418 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c14145M15625.f46415 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c14145M15625.f46416 > 0);
                    subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c14145M15625.f46417 > 0);
                }
                if (abstractC22611.mo3619()) {
                    if (abstractC22611.m50134()) {
                        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                    } else {
                        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                    }
                    if (abstractC22611.mo3621()) {
                        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                    }
                    c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                c16195.m38296(new InterfaceC21133() { // from class: l.ۨ᩻ۘ
                    @Override // l.InterfaceC21133
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        ActivityC5677 activityC5678 = this.f40280.f10782;
                        int itemId = menuItem.getItemId();
                        AbstractC22611 abstractC22612 = abstractC22611;
                        if (itemId == R.string.MT_Protector) {
                            abstractC22612.mo19350(activityC5678);
                            return true;
                        }
                        int i = bindingAdapterPosition;
                        if (itemId == R.id.MT_Protector) {
                            activityC5678.m15671(i);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            View viewM30995 = activityC5678.m30995(R.layout.MT_Protector);
                            ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                            DialogInterfaceOnClickListenerC5864 dialogInterfaceOnClickListenerC5864 = new DialogInterfaceOnClickListenerC5864(0, activityC5678, (CheckBox) viewM30995.findViewById(R.id.MT_Protector));
                            C8067 c8067BuildDialog = activityC5678.buildDialog();
                            c8067BuildDialog.m21258(viewM30995);
                            c8067BuildDialog.m21251(R.string.MT_Protector, dialogInterfaceOnClickListenerC5864);
                            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c8067BuildDialog.m21269();
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            C8067 c8067BuildDialog2 = activityC5678.buildDialog();
                            c8067BuildDialog2.m21274(R.string.MT_Protector);
                            c8067BuildDialog2.m21253(R.string.MT_Protector);
                            c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3852(activityC5678, 1));
                            c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c8067BuildDialog2.m21269();
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            activityC5678.m15680(i);
                            return true;
                        }
                        if (itemId == R.id.MT_Protector) {
                            activityC5678.m15648(i);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            ActivityC5677.m15617(activityC5678, i);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            abstractC22612.mo19344(activityC5678.f19370);
                            activityC5678.m15667();
                            return true;
                        }
                        if (itemId != R.string.MT_Protector) {
                            return true;
                        }
                        activityC5678.f19371.m28839();
                        return true;
                    }
                });
                c16195.m38297();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView = this.f10787;
        if (view != imageView || motionEvent.getActionMasked() != 0 || imageView.getVisibility() != 0) {
            return false;
        }
        this.f10782.f19371.m28843(this);
        return true;
    }
}
