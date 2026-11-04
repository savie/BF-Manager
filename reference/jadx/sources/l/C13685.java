package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import bin.mt.plus.R;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

/* JADX INFO: renamed from: l.۬ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13685 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f43429 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33474(Context context, final IntSupplier intSupplier, final IntConsumer intConsumer) {
        View viewInflate = View.inflate(context, R.layout.MT_Protector, null);
        final C23255 c23255 = (C23255) viewInflate.findViewById(R.id.MT_Protector);
        StringBuilder sb = new StringBuilder("0…");
        sb.append(Integer.toString(intSupplier.getAsInt(), f43429 ? 16 : 10).toUpperCase());
        c23255.m52337(sb.toString());
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.MT_Protector);
        checkBox.setChecked(f43429);
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(context);
        c2361.m8005(viewInflate);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361.m8016();
        C21576.m49090(c23255);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۠ۜᩴ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C13685.m33475(c23255, intSupplier, z);
            }
        });
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۜۜᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    int i2 = Integer.parseInt(c23255.m54021().toString(), checkBox.isChecked() ? 16 : 10);
                    if (i2 < 0 || i2 > intSupplier.getAsInt()) {
                        C22673.m51158(R.string.MT_Protector, 0).m51163();
                    } else {
                        intConsumer.accept(i2);
                        dialogInterfaceC8327M8016.dismiss();
                    }
                } catch (NumberFormatException unused) {
                    C22673.m51158(R.string.MT_Protector, 0).m51163();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33475(C23255 c23255, IntSupplier intSupplier, boolean z) {
        f43429 = z;
        try {
            c23255.mo52335((CharSequence) Integer.toString(Integer.parseInt(c23255.m54021().toString(), z ? 10 : 16), z ? 16 : 10).toUpperCase());
            c23255.mo52339(c23255.m54099());
        } catch (NumberFormatException unused) {
        }
        StringBuilder sb = new StringBuilder("0…");
        sb.append(Integer.toString(intSupplier.getAsInt(), z ? 16 : 10).toUpperCase());
        c23255.m52337(sb.toString());
    }
}
