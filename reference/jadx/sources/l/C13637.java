package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13637 extends AbstractC9843 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f43301;

    public C13637() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return (c12915.m31986("local") || c12915.m31986("zip")) && m33377(c12915);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        if (c12915.m31986("zip")) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        Set set = (Set) C1170.stream(c12915.m31982()).map(new C18980(2)).collect(C2025.toSet());
        this.f43301 = C14584.m35193(c12915.m31978(), new String[0]);
        C2451 c2451 = new C2451(this, c12915.m31979(), set, c12915);
        c2451.m22945(R.string.MT_Protector);
        c2451.m22921(R.string.MT_Protector, (View.OnClickListener) null, (ViewOnLongClickListenerC1596) null);
        c2451.m22924((CharSequence) this.f43301.m49876("classes_merge.dex").m49839(true).getName());
        c2451.m22957(6);
        c2451.m22918();
        c2451.m22955(false);
        Button buttonM22928 = c2451.m22928();
        ViewGroup viewGroup = (ViewGroup) buttonM22928.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(buttonM22928);
        CheckBox checkBox = (CheckBox) c12915.m31979().m40395(R.layout.MT_Protector);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(checkBox, iIndexOfChild);
        checkBox.setText(R.string.MT_Protector);
        checkBox.setChecked(ApplicationC17729.f58258.getBoolean("delete_dex_files_after_merged", false));
        checkBox.setOnCheckedChangeListener(new C9162());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33376(C13637 c13637, String str) {
        return c13637.f43301.m49876(str).mo2934();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m33377(C12915 c12915) {
        if (c12915.m31981() < 2) {
            return false;
        }
        for (InterfaceC2386 interfaceC2386 : c12915.m31982()) {
            if (!interfaceC2386.mo8090() || !interfaceC2386.getName().toLowerCase().endsWith(".dex")) {
                return false;
            }
        }
        return true;
    }
}
