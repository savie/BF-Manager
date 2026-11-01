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

/* JADX INFO: renamed from: l.ۖܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G547 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class AbstractDialogFragmentC2634 extends DialogFragment implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public CharSequence f10267;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC14071 f10268;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f10269;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public CharSequence f10270;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f10271;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public CharSequence f10272;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CharSequence f10273;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10274;

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo8119(AlertDialog.Builder builder) {
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo8121(boolean z);

    @Deprecated
    public AbstractDialogFragmentC2634() {
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof InterfaceC4897)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        InterfaceC4897 interfaceC4897 = (InterfaceC4897) targetFragment;
        String string = getArguments().getString("key");
        if (bundle == null) {
            AbstractC14071 abstractC14071 = (AbstractC14071) interfaceC4897.findPreference(string);
            this.f10268 = abstractC14071;
            this.f10272 = abstractC14071.m34028();
            this.f10273 = this.f10268.m34029();
            this.f10270 = this.f10268.m34030();
            this.f10267 = this.f10268.m34031();
            this.f10274 = this.f10268.m34026();
            Drawable drawableM34027 = this.f10268.m34027();
            if (drawableM34027 == null || (drawableM34027 instanceof BitmapDrawable)) {
                this.f10271 = (BitmapDrawable) drawableM34027;
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableM34027.getIntrinsicWidth(), drawableM34027.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM34027.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawableM34027.draw(canvas);
            this.f10271 = new BitmapDrawable(getResources(), bitmapCreateBitmap);
            return;
        }
        this.f10272 = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.f10273 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.f10270 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.f10267 = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.f10274 = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.f10271 = new BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f10272);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f10273);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f10270);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f10267);
        bundle.putInt("PreferenceDialogFragment.layout", this.f10274);
        BitmapDrawable bitmapDrawable = this.f10271;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.f10269 = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f10272).setIcon(this.f10271).setPositiveButton(this.f10273, this).setNegativeButton(this.f10270, this);
        int i = this.f10274;
        View viewInflate = i != 0 ? LayoutInflater.from(activity).inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            mo8120(viewInflate);
            negativeButton.setView(viewInflate);
        } else {
            negativeButton.setMessage(this.f10267);
        }
        mo8119(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (this instanceof DialogFragmentC4191) {
            Window window = alertDialogCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C11808.m29484(window);
                return alertDialogCreate;
            }
            window.setSoftInputMode(5);
        }
        return alertDialogCreate;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14071 m8118() {
        if (this.f10268 == null) {
            this.f10268 = (AbstractC14071) ((InterfaceC4897) getTargetFragment()).findPreference(getArguments().getString("key"));
        }
        return this.f10268;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo8120(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f10267;
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
        this.f10269 = i;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo8121(this.f10269 == -1);
    }
}
