package l;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܿۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G547 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class AbstractDialogFragmentC18076 extends DialogFragment implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public CharSequence f59167;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f59168;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public CharSequence f59169;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC14937 f59170;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f59171;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CharSequence f59172;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public CharSequence f59173;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f59174;

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo42111(AlertDialog.Builder builder) {
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public abstract void mo5385(boolean z);

    @Deprecated
    public AbstractDialogFragmentC18076() {
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof InterfaceC4497)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        InterfaceC4497 interfaceC4497 = (InterfaceC4497) targetFragment;
        String string = getArguments().getString("key");
        if (bundle == null) {
            AbstractC14937 abstractC14937 = (AbstractC14937) interfaceC4497.findPreference(string);
            this.f59170 = abstractC14937;
            this.f59167 = abstractC14937.m35923();
            this.f59173 = this.f59170.m35922();
            this.f59169 = this.f59170.m35921();
            this.f59172 = this.f59170.m35919();
            this.f59174 = this.f59170.m35918();
            Drawable drawableM35920 = this.f59170.m35920();
            if (drawableM35920 == null || (drawableM35920 instanceof BitmapDrawable)) {
                this.f59171 = (BitmapDrawable) drawableM35920;
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableM35920.getIntrinsicWidth(), drawableM35920.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM35920.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawableM35920.draw(canvas);
            this.f59171 = new BitmapDrawable(getResources(), bitmapCreateBitmap);
            return;
        }
        this.f59167 = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.f59173 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.f59169 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.f59172 = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.f59174 = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.f59171 = new BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f59167);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f59173);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f59169);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f59172);
        bundle.putInt("PreferenceDialogFragment.layout", this.f59174);
        BitmapDrawable bitmapDrawable = this.f59171;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.f59168 = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f59167).setIcon(this.f59171).setPositiveButton(this.f59173, this).setNegativeButton(this.f59169, this);
        int i = this.f59174;
        View viewInflate = i != 0 ? LayoutInflater.from(activity).inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            mo5384(viewInflate);
            negativeButton.setView(viewInflate);
        } else {
            negativeButton.setMessage(this.f59172);
        }
        mo42111(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (this instanceof DialogFragmentC1514) {
            Window window = alertDialogCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C21060.m48133(window);
                return alertDialogCreate;
            }
            window.setSoftInputMode(5);
        }
        return alertDialogCreate;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14937 m42110() {
        if (this.f59170 == null) {
            this.f59170 = (AbstractC14937) ((InterfaceC4497) getTargetFragment()).findPreference(getArguments().getString("key"));
        }
        return this.f59170;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public void mo5384(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f59172;
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
    @Deprecated
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f59168 = i;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo5385(this.f59168 == -1);
    }
}
