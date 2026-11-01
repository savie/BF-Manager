package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8059 extends AbstractC12554 implements View.OnClickListener, View.OnTouchListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ImageView f28236;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final TextView f28237;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View f28238;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11072 f28239;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22876 f28240;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Drawable f28241;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f28242;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11897 f28243;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8765 f28244;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC8059(C8765 c8765, C22876 c22876, View view) {
        super(view);
        this.f28244 = c8765;
        this.f28240 = c22876;
        this.f28239 = (C11072) view.findViewById(R.id.icon);
        this.f28237 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f28242 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f28238 = view.findViewById(R.id.MT_Protector);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f28236 = imageView;
        Drawable drawableMutate = C10405.m26304(c8765.f30135, R.drawable.MT_Protector).mutate();
        this.f28241 = drawableMutate;
        drawableMutate.setAlpha(119);
        imageView.setImageDrawable(drawableMutate);
        imageView.setOnTouchListener(this);
        imageView.setFocusable(true);
        imageView.setClickable(true);
        C0674.m3027(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21216() {
        TextView textView = this.f28237;
        if (textView.getTextColors().getDefaultColor() != C20368.f65976.getDefaultColor()) {
            this.f28239.m27923();
            textView.setTextColor(C20368.f65976);
            this.f28242.setTextColor(C20368.f66009);
            C0674.m3027(this.itemView);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.MT_Protector) {
            C22876 c22876 = this.f28240;
            boolean z = c22876.f74405;
            C8765 c8765 = this.f28244;
            if (z) {
                boolean zM29673 = this.f28243.m29673();
                this.f28243.m29672(!zM29673);
                if (!zM29673) {
                    c22876.f74408++;
                } else {
                    c22876.f74408--;
                }
                c22876.f74403 = -1;
                this.itemView.setBackgroundColor(!zM29673 ? C20368.f65992 : 0);
                C8765.m22784(c8765, c22876.f74408 > 0);
                if (!zM29673) {
                    int bindingAdapterPosition = getBindingAdapterPosition();
                    int iAbs = Math.abs(bindingAdapterPosition - c22876.f74409);
                    c22876.f74409 = bindingAdapterPosition;
                    if (iAbs == 1) {
                        c22876.f74406++;
                    } else {
                        c22876.f74406 = 1;
                    }
                    if (c22876.f74406 == 5) {
                        C15829.m37618(R.string.MT_Protector);
                        c22876.f74406 = 0;
                        return;
                    }
                    return;
                }
                c22876.f74409 = -2;
                return;
            }
            if (c8765.f30134.m50803()) {
                return;
            }
            if (this.f28243.m29659() == null || C5717.m15770(this.f28243.m29659().m15296()) != null) {
                c8765.f30137.mo11094(this.f28243.m29678(), this.f28243.m29659());
            } else {
                this.f28243.m29670(c8765.f30135, new RunnableC21464(this, getBindingAdapterPosition()));
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || view.getVisibility() != 0) {
            return false;
        }
        this.f28240.f74402.m12830(this);
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C8765 c8765 = this.f28244;
        if (!C8765.m22802(c8765)) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        C22876 c22876 = this.f28240;
        if (!c22876.f74405) {
            C16195 c16195 = new C16195(view.getContext(), this.f28238, 0);
            c16195.m38292();
            C12418 c12418M38298 = c16195.m38298();
            boolean zM6491 = c22876.f74404.m6491();
            int iM6493 = zM6491 ? -1 : c22876.f74404.m6493(this.f28243);
            boolean z = !C8765.m22803(c8765);
            boolean z2 = !c22876.m50624() && iM6493 > 0;
            if (!zM6491) {
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            }
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            if (zM6491) {
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            } else {
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z2);
                c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setEnabled(z);
            }
            c12418M38298.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c16195.m38296(new InterfaceC21133() { // from class: l.ܶ۠᩹
                @Override // l.InterfaceC21133
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    ViewOnClickListenerC8059.m21209(this.f49366, menuItem);
                    return true;
                }
            });
            c16195.m38297();
            return true;
        }
        if (c22876.f74403 == -1) {
            c22876.f74403 = getBindingAdapterPosition();
            if (!this.f28243.m29673()) {
                this.f28243.m29672(true);
                c22876.f74408++;
                this.itemView.setBackgroundColor(C20368.f65992);
                C8765.m22784(c8765, c22876.f74408 > 0);
            }
            return true;
        }
        int i = c22876.f74403;
        int bindingAdapterPosition = getBindingAdapterPosition();
        c22876.f74403 = -1;
        if (i > bindingAdapterPosition) {
            bindingAdapterPosition = i;
            i = bindingAdapterPosition;
        }
        while (i <= bindingAdapterPosition) {
            C11897 c11897M6500 = c22876.f74404.m6500(i);
            if (!c11897M6500.m29673()) {
                c11897M6500.m29672(true);
                c22876.f74408++;
            }
            i++;
        }
        c22876.notifyDataSetChanged();
        C8765.m22784(c8765, c22876.f74408 > 0);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21209(final ViewOnClickListenerC8059 viewOnClickListenerC8059, MenuItem menuItem) {
        C8765 c8765 = viewOnClickListenerC8059.f28244;
        C22876 c22876 = viewOnClickListenerC8059.f28240;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC8059.f28243.m29670(c8765.f30135, new RunnableC21464(viewOnClickListenerC8059, viewOnClickListenerC8059.getBindingAdapterPosition()));
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C22876.m50637(c22876, viewOnClickListenerC8059.f28243);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            final DialogInterfaceOnClickListenerC9780 dialogInterfaceOnClickListenerC9780 = new DialogInterfaceOnClickListenerC9780(c22876.f74404.f7531);
            C8067 c8067BuildDialog = c8765.f30135.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21266(dialogInterfaceOnClickListenerC9780.f33481, dialogInterfaceOnClickListenerC9780.f33482, dialogInterfaceOnClickListenerC9780);
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳ۠᩹
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ViewOnClickListenerC8059.m21210(this.f57371, dialogInterfaceOnClickListenerC9780);
                }
            });
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21269();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            int i = c22876.f74404.m6491() ? R.string.MT_Protector : R.string.MT_Protector;
            C8067 c8067BuildDialog2 = c8765.f30135.buildDialog();
            c8067BuildDialog2.m21274(R.string.MT_Protector);
            c8067BuildDialog2.m21261(C16737.m39264(i, viewOnClickListenerC8059.f28237.getText().toString()));
            c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴ۠᩹
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ViewOnClickListenerC8059.m21207(this.f60438);
                }
            });
            c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog2.m21269();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            c22876.m50640(viewOnClickListenerC8059.getBindingAdapterPosition());
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C23186.m51184(viewOnClickListenerC8059.f28243.m29678(), viewOnClickListenerC8059.f28243.m29659(), -1);
            C15829.m37611(R.string.MT_Protector);
        } else if (itemId == R.string.MT_Protector) {
            viewOnClickListenerC8059.f28243.m29669(c8765.f30135);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21210(ViewOnClickListenerC8059 viewOnClickListenerC8059, DialogInterfaceOnClickListenerC9780 dialogInterfaceOnClickListenerC9780) {
        C22876 c22876 = viewOnClickListenerC8059.f28240;
        if (dialogInterfaceOnClickListenerC9780.f33483 != dialogInterfaceOnClickListenerC9780.f33482) {
            int iM6493 = c22876.f74404.m6493(viewOnClickListenerC8059.f28243);
            if (iM6493 != -1) {
                C23186.m51179(c22876.f74404.f7531, dialogInterfaceOnClickListenerC9780.f33481[dialogInterfaceOnClickListenerC9780.f33482].m11762(), iM6493);
            } else {
                c22876.m50641();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21207(ViewOnClickListenerC8059 viewOnClickListenerC8059) {
        C22876 c22876 = viewOnClickListenerC8059.f28240;
        try {
            int bindingAdapterPosition = viewOnClickListenerC8059.getBindingAdapterPosition();
            int iM6493 = c22876.f74404.m6493(viewOnClickListenerC8059.f28243);
            if (iM6493 == -1) {
                c22876.m50641();
            } else {
                c22876.f74404.m6494(iM6493);
                C22876.m50629(c22876, viewOnClickListenerC8059.f28243, bindingAdapterPosition);
            }
        } catch (RuntimeException unused) {
            c22876.notifyDataSetChanged();
        }
        C8432.f29283.mo23641(Object.class);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21208(ViewOnClickListenerC8059 viewOnClickListenerC8059, int i) {
        C22876 c22876 = viewOnClickListenerC8059.f28240;
        if (i == -1) {
            i = C22876.m50626(c22876, viewOnClickListenerC8059.f28243);
        }
        if (i != -1) {
            c22876.notifyItemChanged(i);
        } else {
            c22876.m50641();
        }
        C8432.f29283.mo23641(Object.class);
    }
}
