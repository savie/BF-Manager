package l;

import android.text.InputFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X81I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21716 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23255 f69300;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f69301 = true;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23255 f69302;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f69303;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ImageView f69304;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f69305;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo28885(int i, int i2);

    public AbstractC21716(AbstractActivityC17204 abstractActivityC17204, int i, int i2) {
        View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        this.f69302 = c23255;
        C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        this.f69300 = c23256;
        ImageView imageView = (ImageView) viewM40395.findViewById(R.id.MT_Protector);
        this.f69304 = imageView;
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        c23255.mo52335((CharSequence) String.valueOf(i));
        c23256.mo52335((CharSequence) String.valueOf(i2));
        this.f69303 = Math.max(1, i);
        this.f69305 = Math.max(1, i2);
        c23255.m52304(new InputFilter[]{new InputFilter.LengthFilter(6)});
        c23256.m52304(new InputFilter[]{new InputFilter.LengthFilter(6)});
        c23255.m53899(new C13772(this));
        c23256.m53899(new C4562(this));
        imageView.setOnClickListener(new ViewOnClickListenerC10170(2, this));
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361BuildDialog, R.string.MT_Protector, null, R.string.MT_Protector, null);
        dialogInterfaceC8327M34866.m22436().setOnClickListener(new ViewOnClickListenerC7061(0, this, dialogInterfaceC8327M34866));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49286(AbstractC21716 abstractC21716) {
        ImageView imageView = abstractC21716.f69304;
        boolean z = abstractC21716.f69301;
        abstractC21716.f69301 = !z;
        if (!z) {
            imageView.setImageResource(R.drawable.MT_Protector);
            try {
                int i = Integer.parseInt(abstractC21716.f69302.m54021().toString());
                int i2 = Integer.parseInt(abstractC21716.f69300.m54021().toString());
                if (i <= 0 || i2 <= 0) {
                    return;
                }
                abstractC21716.f69303 = i;
                abstractC21716.f69305 = i2;
                return;
            } catch (Exception unused) {
                return;
            }
        }
        imageView.setImageResource(R.drawable.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49287(AbstractC21716 abstractC21716, DialogInterfaceC8327 dialogInterfaceC8327) {
        C23255 c23255 = abstractC21716.f69300;
        C23255 c23256 = abstractC21716.f69302;
        try {
            int i = Integer.parseInt(c23256.m54021().toString());
            try {
                int i2 = Integer.parseInt(c23255.m54021().toString());
                dialogInterfaceC8327.dismiss();
                abstractC21716.mo28885(i, i2);
            } catch (Exception unused) {
                c23255.requestFocus();
                C22673.m51152(R.string.MT_Protector);
            }
        } catch (Exception unused2) {
            c23256.requestFocus();
            C22673.m51152(R.string.MT_Protector);
        }
    }
}
