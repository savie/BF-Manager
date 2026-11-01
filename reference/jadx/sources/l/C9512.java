package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9512 extends AbstractC4674 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f32163;

    public C9512() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return (c21422.m47974("local") || c21422.m47974("zip")) && m24345(c21422);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        if (c21422.m47974("zip")) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        Set set = (Set) C9030.stream(c21422.m47979()).map(new C19929(1)).collect(C1890.toSet());
        this.f32163 = C5553.m15313(c21422.m47959(), new String[0]);
        C14451 c14451 = new C14451(this, c21422.m47980(), set, c21422);
        c14451.m40376(R.string.MT_Protector);
        c14451.m40343(R.string.MT_Protector, (View.OnClickListener) null, (ViewOnLongClickListenerC0856) null);
        c14451.m40346((CharSequence) this.f32163.m46690("classes_merge.dex").m46693(true).getName());
        c14451.m40336(6);
        c14451.m40340();
        c14451.m40368(false);
        Button buttonM40338 = c14451.m40338();
        ViewGroup viewGroup = (ViewGroup) buttonM40338.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(buttonM40338);
        CheckBox checkBox = (CheckBox) c21422.m47980().m30995(R.layout.MT_Protector);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(checkBox, iIndexOfChild);
        checkBox.setText(R.string.MT_Protector);
        checkBox.setChecked(ApplicationC0716.f2992.getBoolean("delete_dex_files_after_merged", false));
        checkBox.setOnCheckedChangeListener(new C23623());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m24347(C9512 c9512, String str) {
        return c9512.f32163.m46690(str).mo33975();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m24345(C21422 c21422) {
        if (c21422.m47975() < 2) {
            return false;
        }
        for (InterfaceC2557 interfaceC2557 : c21422.m47979()) {
            if (!interfaceC2557.mo7985() || !interfaceC2557.getName().toLowerCase().endsWith(".dex")) {
                return false;
            }
        }
        return true;
    }
}
