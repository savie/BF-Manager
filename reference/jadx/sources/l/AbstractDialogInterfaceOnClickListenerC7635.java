package l;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۟ۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W5LS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC7635 extends DialogInterfaceOnCancelListenerC19136 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public CharSequence f25191;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f25192;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public CharSequence f25193;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC14937 f25194;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f25195;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CharSequence f25196;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public CharSequence f25197;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25198;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo20852(C20756 c20756) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo9811(boolean z);

    /* JADX INFO: renamed from: ۤ */
    public void mo9812() {
    }

    @Override // l.DialogInterfaceOnCancelListenerC19136, l.ComponentCallbacksC11612
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC11217 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof InterfaceC4497)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        InterfaceC4497 interfaceC4497 = (InterfaceC4497) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle == null) {
            AbstractC14937 abstractC14937 = (AbstractC14937) interfaceC4497.findPreference(string);
            this.f25194 = abstractC14937;
            this.f25191 = abstractC14937.m35923();
            this.f25197 = this.f25194.m35922();
            this.f25193 = this.f25194.m35921();
            this.f25196 = this.f25194.m35919();
            this.f25198 = this.f25194.m35918();
            Drawable drawableM35920 = this.f25194.m35920();
            if (drawableM35920 == null || (drawableM35920 instanceof BitmapDrawable)) {
                this.f25195 = (BitmapDrawable) drawableM35920;
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableM35920.getIntrinsicWidth(), drawableM35920.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM35920.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawableM35920.draw(canvas);
            this.f25195 = new BitmapDrawable(getResources(), bitmapCreateBitmap);
            return;
        }
        this.f25191 = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.f25197 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.f25193 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.f25196 = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.f25198 = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.f25195 = new BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // l.DialogInterfaceOnCancelListenerC19136, l.ComponentCallbacksC11612
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f25191);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f25197);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f25193);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f25196);
        bundle.putInt("PreferenceDialogFragment.layout", this.f25198);
        BitmapDrawable bitmapDrawable = this.f25195;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // l.DialogInterfaceOnCancelListenerC19136
    public final Dialog onCreateDialog(Bundle bundle) {
        this.f25192 = -2;
        C20756 negativeButton = new C20756(requireContext()).setTitle(this.f25191).setIcon(this.f25195).setPositiveButton(this.f25197, this).setNegativeButton(this.f25193, this);
        requireContext();
        int i = this.f25198;
        View viewInflate = i != 0 ? getLayoutInflater().inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            mo9810(viewInflate);
            negativeButton.setView(viewInflate);
        } else {
            negativeButton.setMessage(this.f25196);
        }
        mo20852(negativeButton);
        DialogInterfaceC12551 dialogInterfaceC12551Create = negativeButton.create();
        if (this instanceof C3005) {
            Window window = dialogInterfaceC12551Create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C0177.m1474(window);
                return dialogInterfaceC12551Create;
            }
            mo9812();
        }
        return dialogInterfaceC12551Create;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC14937 m20853() {
        if (this.f25194 == null) {
            this.f25194 = (AbstractC14937) ((InterfaceC4497) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.f25194;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo9810(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f25196;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f25192 = i;
    }

    @Override // l.DialogInterfaceOnCancelListenerC19136, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo9811(this.f25192 == -1);
    }
}
