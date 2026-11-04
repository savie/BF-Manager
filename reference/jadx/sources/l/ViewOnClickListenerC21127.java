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

/* JADX INFO: renamed from: l.᩶ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC21127 extends AbstractC11800 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f67499;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public TextView f67500;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f67501;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View f67502;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ImageView f67503;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public View f67504;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageView f67505;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC21127(ActivityC18143 activityC18143, View view) {
        super(view);
        this.f67501 = activityC18143;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.f67502 = view.findViewById(R.id.MT_Protector);
        this.f67504 = view.findViewById(R.id.MT_Protector);
        this.f67503 = (ImageView) view.findViewById(R.id.icon);
        this.f67500 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f67499 = (TextView) view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f67505 = imageView;
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        Drawable drawableM20563 = C7508.m20563(activityC18143, R.drawable.MT_Protector);
        C17359.requireNonNull(drawableM20563);
        Drawable drawableMutate = drawableM20563.mutate();
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int bindingAdapterPosition;
        ActivityC18143 activityC18143 = this.f67501;
        if (activityC18143.f59328.m23776() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return;
        }
        ActivityC18143.m42288(activityC18143, bindingAdapterPosition);
        activityC18143.m42299();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        final int bindingAdapterPosition;
        ActivityC18143 activityC18143 = this.f67501;
        if (activityC18143.f59328.m23776() || (bindingAdapterPosition = getBindingAdapterPosition()) == -1) {
            return false;
        }
        final C7941 c7941 = (C7941) activityC18143.f59346.get(bindingAdapterPosition);
        View view2 = this.f67504;
        C18452 c18452 = new C18452(activityC18143, view2, 8388611);
        C10378.m26694(view2);
        c18452.m42997();
        C9898 c9898M42995 = c18452.m42995();
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        ActivityC18143.m42266(activityC18143, c9898M42995, bindingAdapterPosition);
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        if (c7941.m19936()) {
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        } else {
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        }
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c18452.m42994(new InterfaceC21436() { // from class: l.ܰۛ᩸
            @Override // l.InterfaceC21436
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ActivityC18143 activityC18144 = this.f45415.f67501;
                int itemId = menuItem.getItemId();
                C7941 c7942 = c7941;
                if (itemId == R.string.MT_Protector) {
                    c7942.m21627(activityC18144);
                    return true;
                }
                int i = bindingAdapterPosition;
                if (itemId == R.id.MT_Protector) {
                    activityC18144.m42300(i);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    View viewM40395 = activityC18144.m40395(R.layout.MT_Protector);
                    ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                    final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.֨ۨ᩸
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC18143.m42265(activityC18144, checkBox);
                        }
                    };
                    C2361 c2361BuildDialog = activityC18144.buildDialog();
                    c2361BuildDialog.m8005(viewM40395);
                    c2361BuildDialog.m8026(R.string.MT_Protector, onClickListener);
                    c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog.m8016();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    View viewM40396 = activityC18144.m40395(R.layout.MT_Protector);
                    ((TextView) viewM40396.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                    viewM40396.findViewById(R.id.MT_Protector).setVisibility(8);
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: l.ۖۨ᩸
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ActivityC18143.m42287(activityC18144);
                        }
                    };
                    C2361 c2361BuildDialog2 = activityC18144.buildDialog();
                    c2361BuildDialog2.m8005(viewM40396);
                    c2361BuildDialog2.m8026(R.string.MT_Protector, onClickListener2);
                    c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c2361BuildDialog2.m8016();
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    activityC18144.m42303(i);
                    return true;
                }
                if (itemId == R.id.MT_Protector) {
                    activityC18144.m42301(i);
                    return true;
                }
                if (itemId == R.string.MT_Protector) {
                    c7942.m21630(activityC18144, (DialogInterfaceC12551) null);
                    return true;
                }
                if (itemId == R.string.MT_Protector) {
                    ActivityC18143.m42273(activityC18144, i);
                    return true;
                }
                if (itemId != R.string.MT_Protector) {
                    return true;
                }
                activityC18144.f59328.m23769();
                return true;
            }
        });
        c18452.mo21878();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView = this.f67505;
        if (view != imageView || motionEvent.getActionMasked() != 0 || imageView.getVisibility() != 0) {
            return false;
        }
        this.f67501.f59328.m23771(this);
        return true;
    }
}
