package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC11247 extends AbstractC11800 implements View.OnClickListener, View.OnTouchListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Drawable f35510;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final View f35511;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C3034 f35512;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16468 f35513;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f35514;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19452 f35515;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ImageView f35516;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView f35517;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9622 f35518;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC11247(C16468 c16468, C19452 c19452, View view) {
        super(view);
        this.f35513 = c16468;
        this.f35515 = c19452;
        this.f35512 = (C3034) view.findViewById(R.id.icon);
        this.f35514 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f35517 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f35511 = view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f35516 = imageView;
        Drawable drawableMutate = C7508.m20563(c16468.f53390, R.drawable.MT_Protector).mutate();
        this.f35510 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        C17423.m40911(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28483() {
        TextView textView = this.f35514;
        if (textView.getTextColors().getDefaultColor() != C3296.f10751.getDefaultColor()) {
            this.f35512.m9866();
            textView.setTextColor(C3296.f10751);
            this.f35517.setTextColor(C3296.f10779);
            C17423.m40911(this.itemView);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.MT_Protector) {
            C19452 c19452 = this.f35515;
            boolean z = c19452.f62827;
            C16468 c16468 = this.f35513;
            if (z) {
                boolean zM25116 = this.f35518.m25116();
                this.f35518.m25115(!zM25116);
                if (!zM25116) {
                    c19452.f62829++;
                } else {
                    c19452.f62829--;
                }
                c19452.f62835 = -1;
                this.itemView.setBackgroundColor(!zM25116 ? C3296.f10761 : 0);
                C16468.m39025(c16468, c19452.f62829 > 0);
                if (!zM25116) {
                    int bindingAdapterPosition = getBindingAdapterPosition();
                    int iAbs = Math.abs(bindingAdapterPosition - c19452.f62828);
                    c19452.f62828 = bindingAdapterPosition;
                    if (iAbs == 1) {
                        c19452.f62833++;
                    } else {
                        c19452.f62833 = 1;
                    }
                    if (c19452.f62833 == 5) {
                        C22673.m51159(R.string.MT_Protector);
                        c19452.f62833 = 0;
                        return;
                    }
                    return;
                }
                c19452.f62828 = -2;
                return;
            }
            if (c16468.f53387.m55200()) {
                return;
            }
            if (this.f35518.m25121() == null || C7606.m20792(this.f35518.m25121().m23755()) != null) {
                c16468.f53395.mo2837(this.f35518.m25117(), this.f35518.m25121());
            } else {
                this.f35518.m25112(c16468.f53390, new RunnableC12739(this, getBindingAdapterPosition()));
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || view.getVisibility() != 0) {
            return false;
        }
        this.f35515.f62831.m30178(this);
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C16468 c16468 = this.f35513;
        if (!C16468.m39012(c16468)) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        C19452 c19452 = this.f35515;
        if (!c19452.f62827) {
            C18452 c18452 = new C18452(view.getContext(), this.f35511, 0);
            c18452.m42997();
            C9898 c9898M42995 = c18452.m42995();
            boolean zM21931 = c19452.f62826.m21931();
            int iM21923 = zM21931 ? -1 : c19452.f62826.m21923(this.f35518);
            boolean z = !C16468.m39043(c16468);
            boolean z2 = !c19452.m44955() && iM21923 > 0;
            if (!zM21931) {
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            }
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            if (zM21931) {
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            } else {
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z2);
                c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
            }
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c18452.m42994(new InterfaceC21436() { // from class: l.ܳ֡ܳ
                @Override // l.InterfaceC21436
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ViewOnClickListenerC11247.m28475(this.f48892, menuItem);
                    return true;
                }
            });
            c18452.mo21878();
            return true;
        }
        if (c19452.f62835 == -1) {
            c19452.f62835 = getBindingAdapterPosition();
            if (!this.f35518.m25116()) {
                this.f35518.m25115(true);
                c19452.f62829++;
                this.itemView.setBackgroundColor(C3296.f10761);
                C16468.m39025(c16468, c19452.f62829 > 0);
            }
            return true;
        }
        int i = c19452.f62835;
        int bindingAdapterPosition = getBindingAdapterPosition();
        c19452.f62835 = -1;
        if (i > bindingAdapterPosition) {
            bindingAdapterPosition = i;
            i = bindingAdapterPosition;
        }
        while (i <= bindingAdapterPosition) {
            C9622 c9622M21930 = c19452.f62826.m21930(i);
            if (!c9622M21930.m25116()) {
                c9622M21930.m25115(true);
                c19452.f62829++;
            }
            i++;
        }
        c19452.notifyDataSetChanged();
        C16468.m39025(c16468, c19452.f62829 > 0);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28475(final ViewOnClickListenerC11247 viewOnClickListenerC11247, MenuItem menuItem) {
        C16468 c16468 = viewOnClickListenerC11247.f35513;
        C19452 c19452 = viewOnClickListenerC11247.f35515;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC11247.f35518.m25112(c16468.f53390, new RunnableC12739(viewOnClickListenerC11247, viewOnClickListenerC11247.getBindingAdapterPosition()));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C19452.m44953(c19452, viewOnClickListenerC11247.f35518);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            final DialogInterfaceOnClickListenerC19231 dialogInterfaceOnClickListenerC19231 = new DialogInterfaceOnClickListenerC19231(c19452.f62826.f26671);
            C2361 c2361BuildDialog = c16468.f53390.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8013(dialogInterfaceOnClickListenerC19231.f62189, dialogInterfaceOnClickListenerC19231.f62188, dialogInterfaceOnClickListenerC19231);
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ֡ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC11247.m28477(this.f18608, dialogInterfaceOnClickListenerC19231);
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8016();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            int i = c19452.f62826.m21931() ? R.string.MT_Protector : R.string.MT_Protector;
            C2361 c2361BuildDialog2 = c16468.f53390.buildDialog();
            c2361BuildDialog2.m8021(R.string.MT_Protector);
            c2361BuildDialog2.m8008(C21576.m49059(i, viewOnClickListenerC11247.f35514.getText().toString()));
            c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫֡ܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC11247.m28473(this.f5358);
                }
            });
            c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog2.m8016();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c19452.m44957(viewOnClickListenerC11247.getBindingAdapterPosition());
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C22961.m51795(viewOnClickListenerC11247.f35518.m25117(), viewOnClickListenerC11247.f35518.m25121(), -1);
            C22673.m51152(R.string.MT_Protector);
        } else if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC11247.f35518.m25111(c16468.f53390);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28477(ViewOnClickListenerC11247 viewOnClickListenerC11247, DialogInterfaceOnClickListenerC19231 dialogInterfaceOnClickListenerC19231) {
        C19452 c19452 = viewOnClickListenerC11247.f35515;
        if (dialogInterfaceOnClickListenerC19231.f62190 != dialogInterfaceOnClickListenerC19231.f62188) {
            int iM21923 = c19452.f62826.m21923(viewOnClickListenerC11247.f35518);
            if (iM21923 != -1) {
                C22961.m51790(c19452.f62826.f26671, dialogInterfaceOnClickListenerC19231.f62189[dialogInterfaceOnClickListenerC19231.f62188].m50239(), iM21923);
            } else {
                c19452.m44958();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28473(ViewOnClickListenerC11247 viewOnClickListenerC11247) {
        C19452 c19452 = viewOnClickListenerC11247.f35515;
        try {
            int bindingAdapterPosition = viewOnClickListenerC11247.getBindingAdapterPosition();
            int iM21923 = c19452.f62826.m21923(viewOnClickListenerC11247.f35518);
            if (iM21923 == -1) {
                c19452.m44958();
            } else {
                c19452.f62826.m21924(iM21923);
                C19452.m44943(c19452, viewOnClickListenerC11247.f35518, bindingAdapterPosition);
            }
        } catch (RuntimeException unused) {
            c19452.notifyDataSetChanged();
        }
        C4052.f13792.mo40348(Object.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28474(ViewOnClickListenerC11247 viewOnClickListenerC11247, int i) {
        C19452 c19452 = viewOnClickListenerC11247.f35515;
        if (i == -1) {
            i = C19452.m44940(c19452, viewOnClickListenerC11247.f35518);
        }
        if (i != -1) {
            c19452.notifyItemChanged(i);
        } else {
            c19452.m44958();
        }
        C4052.f13792.mo40348(Object.class);
    }
}
