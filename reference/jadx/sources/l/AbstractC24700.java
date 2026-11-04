package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5I2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24700 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC17204 f79914;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractDialogInterfaceOnClickListenerC17480 f79915;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f79916;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo8145();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo8146(C11273 c11273, String str);

    /* JADX INFO: renamed from: ۙ */
    public boolean mo54355(String str) {
        return false;
    }

    public AbstractC24700(AbstractActivityC17204 abstractActivityC17204, boolean z) {
        this(abstractActivityC17204, z, "filter_record", "filter_match_case", "filter_regex", "filter_exactly_match");
    }

    public AbstractC24700(AbstractActivityC17204 abstractActivityC17204, boolean z, String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        this.f79916 = arrayList;
        this.f79914 = abstractActivityC17204;
        C19023 c19023 = new C19023(abstractActivityC17204);
        C19023 c19024 = new C19023(abstractActivityC17204);
        C19023 c19025 = new C19023(abstractActivityC17204);
        C1579 c1579 = new C1579(this, abstractActivityC17204, str, z ? R.string.MT_Protector : -1, c19024, c19025, c19023, abstractActivityC17204);
        c1579.m40982(R.string.MT_Protector);
        this.f79915 = c1579;
        c19024.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۚ֨ᩴ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.f18686.f79915.m40988().m41606(z2);
            }
        });
        c19023.setText(R.string.MT_Protector);
        c19023.setTag(str2);
        c19023.setChecked(ApplicationC17729.f58258.getBoolean(str2, false));
        c19024.setText(R.string.MT_Protector);
        c19024.setTag(str3);
        c19024.setChecked(ApplicationC17729.f58258.getBoolean(str3, false));
        c19025.setText(R.string.MT_Protector);
        c19025.setTag(str4);
        c19025.setChecked(ApplicationC17729.f58258.getBoolean(str4, false));
        c1579.m40983(c19023);
        c1579.m40983(c19024);
        c1579.m40983(c19025);
        arrayList.add(c19023);
        arrayList.add(c19024);
        arrayList.add(c19025);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55053(C10467 c10467) {
        this.f79915.m40984(c10467, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55052(int i, boolean z) {
        C19023 c19023 = new C19023(this.f79914);
        c19023.setText(i);
        c19023.setChecked(z);
        this.f79916.add(c19023);
        this.f79915.m40984(c19023, 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55055() {
        this.f79915.m40986();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55054(int i) {
        int i2;
        ArrayList arrayList = this.f79916;
        if (i >= 0 && (i2 = i + 3) < arrayList.size()) {
            return ((C19023) arrayList.get(i2)).isChecked();
        }
        StringBuilder sbM12235 = C3769.m12235(i, "Index: ", ", Size: ");
        sbM12235.append(arrayList.size() - 3);
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }
}
