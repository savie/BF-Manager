package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC13749 extends AbstractC12554 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ImageView f45324;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f45325;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f45326;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public View f45327;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f45328;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f45329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f45330;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC13749(ActivityC11632 activityC11632, View view) {
        super(view);
        this.f45325 = activityC11632;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f45327 = view.findViewById(R.id.MT_Protector);
        this.f45329 = view.findViewById(R.id.MT_Protector);
        this.f45324 = (ImageView) view.findViewById(R.id.icon);
        this.f45326 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f45328 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f45330 = imageView;
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        Drawable drawableM26304 = C10405.m26304(activityC11632, R.drawable.MT_Protector);
        C13638.requireNonNull(drawableM26304);
        Drawable drawableMutate = drawableM26304.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition;
        ActivityC11632 activityC11632 = this.f45325;
        if (activityC11632.f39077.m28846() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return;
        }
        ActivityC11632.m29001(activityC11632, bindingAdapterPosition);
        activityC11632.m29012();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        final int bindingAdapterPosition;
        ActivityC11632 activityC11632 = this.f45325;
        if (activityC11632.f39077.m28846() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return false;
        }
        final C20409 c20409 = (C20409) activityC11632.f39080.get(bindingAdapterPosition);
        View view2 = this.f45329;
        C16195 c16195 = new C16195(activityC11632, view2, 8388611);
        C2995.m8960(view2);
        c16195.m38292();
        C12418 c12418M38298 = c16195.m38298();
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        ActivityC11632.m28988(activityC11632, c12418M38298, bindingAdapterPosition);
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        if (c20409.m13358()) {
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        } else {
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        }
        c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.ۙۤۖ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC11632 activityC11633 = this.f16225.f45325;
                int itemId = menuItem.getItemId();
                C20409 c204010 = c20409;
                if (itemId == R.string.MT_Protector) {
                    c204010.m46138(activityC11633);
                    return true;
                }
                int i = bindingAdapterPosition;
                if (itemId == R.id.MT_Protector) {
                    activityC11633.m29022(i);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    View viewM30995 = activityC11633.m30995(R.layout.MT_Protector);
                    ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                    DialogInterfaceOnClickListenerC3828 dialogInterfaceOnClickListenerC3828 = new DialogInterfaceOnClickListenerC3828(0, activityC11633, (CheckBox) viewM30995.findViewById(R.id.MT_Protector));
                    C8067 c8067BuildDialog = activityC11633.buildDialog();
                    c8067BuildDialog.m21258(viewM30995);
                    c8067BuildDialog.m21251(R.string.MT_Protector, dialogInterfaceOnClickListenerC3828);
                    c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c8067BuildDialog.m21269();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    View viewM30996 = activityC11633.m30995(R.layout.MT_Protector);
                    ((TextView) viewM30996.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                    viewM30996.findViewById(R.id.MT_Protector).setVisibility(8);
                    DialogInterfaceOnClickListenerC22880 dialogInterfaceOnClickListenerC22880 = new DialogInterfaceOnClickListenerC22880(0, activityC11633);
                    C8067 c8067BuildDialog2 = activityC11633.buildDialog();
                    c8067BuildDialog2.m21258(viewM30996);
                    c8067BuildDialog2.m21251(R.string.MT_Protector, dialogInterfaceOnClickListenerC22880);
                    c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c8067BuildDialog2.m21269();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    activityC11633.m29026(i);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    activityC11633.m29011(i);
                    return true;
                }
                if (itemId == R.string.MT_Protector) {
                    c204010.m46141(activityC11633, (DialogInterfaceC7957) null);
                    return true;
                }
                if (itemId == R.string.MT_Protector) {
                    ActivityC11632.m28994(activityC11633, i);
                    return true;
                }
                if (itemId != R.string.MT_Protector) {
                    return true;
                }
                activityC11633.f39077.m28839();
                return true;
            }
        });
        c16195.m38297();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView = this.f45330;
        if (view != imageView || motionEvent.getActionMasked() != 0 || imageView.getVisibility() != 0) {
            return false;
        }
        this.f45325.f39077.m28843(this);
        return true;
    }
}
