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

/* JADX INFO: renamed from: l.᩹ܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5LS */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC22391 extends DialogInterfaceOnCancelListenerC11281 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public CharSequence f73093;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC14071 f73094;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f73095;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public CharSequence f73096;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f73097;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public CharSequence f73098;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CharSequence f73099;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f73100;

    /* JADX INFO: renamed from: ۙ */
    public void mo20368(C18540 c18540) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo20369(boolean z);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo49662() {
    }

    @Override // l.DialogInterfaceOnCancelListenerC11281, l.ComponentCallbacksC22654
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC17422 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof InterfaceC4897)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        InterfaceC4897 interfaceC4897 = (InterfaceC4897) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle == null) {
            AbstractC14071 abstractC14071 = (AbstractC14071) interfaceC4897.findPreference(string);
            this.f73094 = abstractC14071;
            this.f73098 = abstractC14071.m34028();
            this.f73099 = this.f73094.m34029();
            this.f73096 = this.f73094.m34030();
            this.f73093 = this.f73094.m34031();
            this.f73100 = this.f73094.m34026();
            Drawable drawableM34027 = this.f73094.m34027();
            if (drawableM34027 == null || (drawableM34027 instanceof BitmapDrawable)) {
                this.f73097 = (BitmapDrawable) drawableM34027;
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableM34027.getIntrinsicWidth(), drawableM34027.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM34027.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawableM34027.draw(canvas);
            this.f73097 = new BitmapDrawable(getResources(), bitmapCreateBitmap);
            return;
        }
        this.f73098 = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.f73099 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.f73096 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.f73093 = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.f73100 = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.f73097 = new BitmapDrawable(getResources(), bitmap);
        }
    }

    @Override // l.DialogInterfaceOnCancelListenerC11281, l.ComponentCallbacksC22654
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f73098);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f73099);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f73096);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f73093);
        bundle.putInt("PreferenceDialogFragment.layout", this.f73100);
        BitmapDrawable bitmapDrawable = this.f73097;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // l.DialogInterfaceOnCancelListenerC11281
    public final Dialog onCreateDialog(Bundle bundle) {
        this.f73095 = -2;
        C18540 negativeButton = new C18540(requireContext()).setTitle(this.f73098).setIcon(this.f73097).setPositiveButton(this.f73099, this).setNegativeButton(this.f73096, this);
        requireContext();
        int i = this.f73100;
        View viewInflate = i != 0 ? getLayoutInflater().inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            mo49661(viewInflate);
            negativeButton.setView(viewInflate);
        } else {
            negativeButton.setMessage(this.f73093);
        }
        mo20368(negativeButton);
        DialogInterfaceC7957 dialogInterfaceC7957Create = negativeButton.create();
        if (this instanceof C23243) {
            Window window = dialogInterfaceC7957Create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C5457.m15125(window);
                return dialogInterfaceC7957Create;
            }
            mo49662();
        }
        return dialogInterfaceC7957Create;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC14071 m49663() {
        if (this.f73094 == null) {
            this.f73094 = (AbstractC14071) ((InterfaceC4897) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.f73094;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo49661(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f73093;
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
        this.f73095 = i;
    }

    @Override // l.DialogInterfaceOnCancelListenerC11281, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo20369(this.f73095 == -1);
    }
}
