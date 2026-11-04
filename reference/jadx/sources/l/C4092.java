package l;

import android.animation.Animator;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.animation.AnimatableView;

/* JADX INFO: renamed from: l.ۘۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4092 implements InterfaceC11615, InterfaceC2017, InterfaceC5392, InterfaceC24044, AnimatableView.Listener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13950;

    public /* synthetic */ C4092(Object obj) {
        this.f13950 = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public void onAnimationEnd() {
        ((Animator) this.f13950).start();
    }

    @Override // l.InterfaceC24044
    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo6271(C3906 c3906) {
        C10870 c10870 = (C10870) this.f13950;
        return c10870.m12560().getString(R.string.MT_Protector, Integer.valueOf(c10870.m29658().getInt(c10870.m12557(), 10)));
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(AbstractC22044 abstractC22044) {
        final C8614 c8614 = (C8614) this.f13950;
        final C25308 c25308 = new C25308(abstractC22044);
        final Main mainM23233 = c8614.m23233();
        View viewM40395 = mainM23233.m40395(R.layout.MT_Protector);
        final Spinner spinnerM56568 = C25308.m56568(mainM23233, viewM40395);
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.switch1);
        c1255.setChecked(ApplicationC17729.f58258.getBoolean("dfb", true));
        c1255.setOnCheckedChangeListener(new C6904());
        final TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        final C1255 c1256 = (C1255) viewM40395.findViewById(R.id.switch2);
        final C1255 c1257 = (C1255) viewM40395.findViewById(R.id.switch3);
        c1256.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۬ۙ۫
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                textView.setText(!z ? R.string.MT_Protector : R.string.MT_Protector);
                textView2.setVisibility(!z ? 0 : 8);
                c1257.setVisibility(z ? 8 : 0);
                spinnerM56568.setEnabled(!z);
                C6421.m18184(ApplicationC17729.f58258, "dfoh", z);
            }
        });
        c1256.setChecked(ApplicationC17729.f58258.getBoolean("dfoh", false));
        c1257.setChecked(ApplicationC17729.f58258.getBoolean("dfrwn", true));
        c1257.setOnCheckedChangeListener(new C5170());
        C2361 c2361BuildDialog = mainM23233.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷᩷۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                new C23070(c25308, spinnerM56568, mainM23233, c1256, c1257, c8614).m8197();
            }
        });
        c2361BuildDialog.m8016();
    }

    @Override // l.InterfaceC11615
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo13186(String str) {
        return ((String) this.f13950).equals(str);
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷ */
    public void mo1355(Object obj, Throwable th) {
        FutureC23690 futureC23690 = (FutureC23690) this.f13950;
        if (th == null) {
            futureC23690.m52935((Object) null);
        } else {
            futureC23690.m52937(th);
        }
    }
}
